package com.ceiba.tenispark.dominio.integracion;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
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

import com.ceiba.tenispark.AdminTenisParkApplication;
import com.ceiba.tenispark.aplicacion.comando.TarifaComando;
import com.ceiba.tenispark.dominio.testDataBuilder.TarifaComandoTestDataBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
//autowired app context (SpringJUnit4ClassRunner)
@SpringBootTest(classes = AdminTenisParkApplication.class)
@AutoConfigureMockMvc
@Transactional
@TestPropertySource("/test.properties")
public class TarifaControladorTest {

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
	public void Cambiartarifa() throws Exception {
		//arrange
		TarifaComando comandoTarifa = new TarifaComandoTestDataBuilder().build();

		//Act-Assert
		mockMvc.perform(post("/tarifa")
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(comandoTarifa))
				.accept(MediaType.APPLICATION_JSON))
		.andDo(print())
		.andExpect(status().isCreated());
	}


	@Test
	public void Consulta() throws Exception {
		
		//arrange
		TarifaComando tarifaComando = new TarifaComandoTestDataBuilder().build();
		mockMvc.perform(post("/tarifa")
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(tarifaComando))
				.accept(MediaType.APPLICATION_JSON));

		//Act
		mockMvc.perform(get("/tarifa")
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(tarifaComando))
				.accept(MediaType.APPLICATION_JSON))
		.andDo(print())
		//Assert
		
		 .andExpect(jsonPath("$[0].dia").value(tarifaComando.getDia().toString()))
	     .andExpect(jsonPath("$[0].costo").value(tarifaComando.getCosto().toString()));

	}

	@Test
	public void DiaErroneo() throws Exception {
		//arrange
		TarifaComando tarifaComando = new TarifaComandoTestDataBuilder().buildErrorDia();

		//Act-Assert
		mockMvc.perform(post("/tarifa")
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(tarifaComando))
				.accept(MediaType.APPLICATION_JSON))
		.andDo(print())
		.andExpect(status().is4xxClientError());
	}
}

