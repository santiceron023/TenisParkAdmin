//package com.ceiba.tenispark.dominio.integracion;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import javax.transaction.Transactional;
//
//import org.junit.Before;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.TestPropertySource;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import com.ceiba.tenispark.AdminTenisParkApplication;
//import com.ceiba.tenispark.aplicacion.comando.ReservaComando;
//import com.ceiba.tenispark.dominio.testDataBuilder.ReservaComandoTestDataBuilder;
//import com.ceiba.tenispark.dominio.testDataBuilder.ReservaTestDataBuilder;
//import com.ceiba.tenispark.dominio.testDataBuilder.TarifaComandoTestDataBuilder;
//import com.ceiba.tenispark.dominio.testDataBuilder.TarifaTestDataBuilder;
//import com.ceiba.tenispark.infraestructura.repositorio.adapter.ReservaRepositorioPosgres;
//import com.ceiba.tenispark.infraestructura.repositorio.adapter.TarifaRepositorioPosgres;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = AdminTenisParkApplication.class)
//@AutoConfigureMockMvc
//@TestPropertySource("/test.properties")
//public class ReservaControladorTest {
//
//	@Autowired
//	private WebApplicationContext wac;
//	@Autowired
//	private ObjectMapper objectMapper;
//
//	@Autowired
//	private MockMvc mockMvc;
//
//	@Autowired
//	private ReservaRepositorioPosgres reservaRepositorio;
//	private TarifaRepositorioPosgres tarifaRepositorio;
//
//	@Before
//	public void setup() throws Exception {
//		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();		
//		tarifaRepositorio.crear(new TarifaTestDataBuilder().build());		
//	}
//
//	@Test
//	public void crearReserva() throws Exception {
//		//arrange
//		ReservaComando comandoFactura = new ReservaComandoTestDataBuilder().build();
//
//		//Act-Assert
//		mockMvc.perform(post("/reserva")
//				.contentType(MediaType.APPLICATION_JSON)
//				.content(objectMapper.writeValueAsString(comandoFactura))
//				.accept(MediaType.APPLICATION_JSON))
//		.andDo(print())
//		.andExpect(status().isCreated());
//	}
//	
//	@Test
//	public void reservaDuplicada() throws Exception {
//		//arrange
//		ReservaComando comando = new ReservaComandoTestDataBuilder().build();
//		
//
//		//Act		
//		//Assert
//		mockMvc.perform(post("/reserva")
//				.contentType(MediaType.APPLICATION_JSON)
//				.content(objectMapper.writeValueAsString(comando))
//				.accept(MediaType.APPLICATION_JSON))
//		.andDo(print())
//		.andExpect(status().isCreated());
//	}
//}
