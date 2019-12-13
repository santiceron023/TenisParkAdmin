package com.ceiba.tenispark.dominio.integracion;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.ceiba.tenispark.AdminTenisParkApplication;
import com.ceiba.tenispark.aplicacion.comando.ReservaComando;
import com.ceiba.tenispark.aplicacion.comando.manejador.FiltroReservaComando;
import com.ceiba.tenispark.dominio.testDataBuilder.ReservaComandoTestDataBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AdminTenisParkApplication.class)
@AutoConfigureMockMvc
@TestPropertySource("/test.properties")
public class ReservaControladorTest {

	@Autowired
	private WebApplicationContext wac;
	@Autowired
	private ObjectMapper objectMapper;

	@Autowired
	private MockMvc mockMvc;

	@Before
	public void setup() throws Exception {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();				
	}

	
	@Test
	@Transactional
	@Sql(scripts = "/preCondicionesReserva.sql",
	executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
	public void crearReserva() throws Exception {
		//arrange
		ReservaComando comandoReserva = new ReservaComandoTestDataBuilder().build();
		//SQL FILE
		
		//Act
		mockMvc.perform(post("/reserva")
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(comandoReserva))
				.accept(MediaType.APPLICATION_JSON))
		.andDo(print())
		
		//Assert
		.andExpect(status().isCreated());
	}
	
	@Test
	@Transactional
	@Sql(scripts = "/preCondicionesReserva.sql",
	executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
	public void crearDuplicada() throws Exception {
		//arrange
		ReservaComando comandoReserva = new ReservaComandoTestDataBuilder().build();
		//SQL FILE
		
		//Act
		mockMvc.perform(post("/reserva")
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(comandoReserva))
				.accept(MediaType.APPLICATION_JSON))
		.andDo(print())
		
		//Assert
		.andExpect(status().is4xxClientError());
	}
	
	
	@Test
	@Transactional
	@Sql(scripts = "/preCondicionesReserva.sql",
	executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
	public void consultar() throws Exception {
		//arrange
		ReservaComando comando = new ReservaComandoTestDataBuilder().build();
		//SQL FILE
		mockMvc.perform(post("/reserva")
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(comando))
				.accept(MediaType.APPLICATION_JSON));
		
		//Act
		mockMvc.perform(get("/reserva")
				.contentType(MediaType.APPLICATION_JSON)
				.param("fecha", comando.getFechaFin().toLocalDate().toString())
				.param("cancha", comando.getCancha().toString())
				.accept(MediaType.APPLICATION_JSON))
		.andDo(print())
		
		//Assert
		.andExpect(status().isOk())
        .andExpect(jsonPath("$[0].fechaInicio").value(comando.getFechaInicio().toString()))
        .andExpect(jsonPath("$[0].fechaFin").value(comando.getFechaFin().toString()))
        .andExpect(jsonPath("$[0].numeroUsuarios").value(comando.getNumeroUsuarios().toString()));
	}
	

	@Test
	@Transactional
	public void CREARFECHASMALAS() throws Exception {
		//arrange
		ReservaComando comando = new ReservaComandoTestDataBuilder().buildBadDates();
		//Act
		mockMvc.perform(post("/reserva")
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(comando))
				.accept(MediaType.APPLICATION_JSON))
		.andDo(print())
		
		//Assert
		.andExpect(status().is4xxClientError());
	}
	
}
