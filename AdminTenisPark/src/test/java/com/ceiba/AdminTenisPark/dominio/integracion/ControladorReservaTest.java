package com.ceiba.AdminTenisPark.dominio.integracion;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.transaction.Transactional;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.ceiba.AdminTenisPark.dominio.testDataBuilder.ReservaComandoTestDataBuilder;
import com.ceiba.AdminTenisPark.dominio.testDataBuilder.ReservaTestDataBuilder;
import com.ceiba.AdminTenisPark.dominio.testDataBuilder.TarifaTestDataBuilder;
import com.ceiba.adminTenisPark.AdminTenisParkApplication;
import com.ceiba.adminTenisPark.aplicacion.comando.ReservaComando;
import com.ceiba.adminTenisPark.infraestructura.repositorio.adapter.ReservaRepositorioPosgres;
import com.ceiba.adminTenisPark.infraestructura.repositorio.adapter.TarifaRepositorioPosgres;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
//autowired app context (SpringJUnit4ClassRunner)
@SpringBootTest(classes = AdminTenisParkApplication.class)
@AutoConfigureMockMvc
@TestPropertySource("/test.properties")
//rollback
@Transactional
public class ControladorReservaTest {

	@Autowired
	private WebApplicationContext wac;
	@Autowired
	private ObjectMapper objectMapper;

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ReservaRepositorioPosgres reservaRepositorio;
	private TarifaRepositorioPosgres tarifaRepositorio;

	@Before
	public void setup() throws Exception {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();		
		tarifaRepositorio.crear(new TarifaTestDataBuilder().build());		
	}

//	@Test
//	public void crearReserva() throws Exception {
//		//arrange
//		ComandoReserva comandoFactura = new ComandoReservaDataBuilder().build();
//
//		//Act-Assert
//		mockMvc.perform(post("http://localhost:8080/reserva")
//				.contentType(MediaType.APPLICATION_JSON)
//				.content(objectMapper.writeValueAsString(comandoFactura))
//				.accept(MediaType.APPLICATION_JSON))
//		.andDo(print())
//		.andExpect(status().isOk());
//	}
	
//	@Test
//	public void reservaDuplicada() throws Exception {
//		//arrange
//		ReservaComando comando = new ReservaComandoTestDataBuilder().build();
//		
//
//		//Act		
//		//Assert
//		mockMvc.perform(post("http://localhost:8080/reserva")
//				.contentType(MediaType.APPLICATION_JSON)
//				.content(objectMapper.writeValueAsString(comando))
//				.accept(MediaType.APPLICATION_JSON))
//		.andDo(print())
//		.andExpect(status().isCreated());
//	}
}
