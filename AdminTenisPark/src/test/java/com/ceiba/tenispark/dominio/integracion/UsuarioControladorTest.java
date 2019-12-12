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
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.ceiba.tenispark.AdminTenisParkApplication;
import com.ceiba.tenispark.aplicacion.comando.TarifaComando;
import com.ceiba.tenispark.dominio.modelo.Usuario;
import com.ceiba.tenispark.dominio.testDataBuilder.TarifaComandoTestDataBuilder;
import com.ceiba.tenispark.dominio.testDataBuilder.UsuarioTestDataBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
//autowired app context (SpringJUnit4ClassRunner)
@SpringBootTest(classes = AdminTenisParkApplication.class)
@AutoConfigureMockMvc
@Transactional
@TestPropertySource("/test.properties")
public class UsuarioControladorTest {

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
	@Sql(scripts = "/preCondicionesReserva.sql",
	executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
	public void Listar() throws Exception {

		//arrange
		Usuario userDB =  new UsuarioTestDataBuilder().build();

		//Act
		mockMvc.perform(get("/usuario")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON))
		.andDo(print())
		//Assert
		.andExpect(jsonPath("$[0].id").value(userDB.getId().toString()))
		.andExpect(jsonPath("$[0].identificacion").value(userDB.getIdentificacion().toString()))
		.andExpect(jsonPath("$[0].nombre").value(userDB.getNombre().toString()))
		.andExpect(jsonPath("$[0].telefono").value(userDB.getTelefono().toString()))
		.andExpect(status().isOk());

	}
}

