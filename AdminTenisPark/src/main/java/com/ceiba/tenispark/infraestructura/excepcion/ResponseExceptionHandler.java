package com.ceiba.tenispark.infraestructura.excepcion;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.ceiba.tenispark.dominio.excepcion.ExcepcionDominio;

@RestController 
//controlador de errores transversal
@ControllerAdvice
public class ResponseExceptionHandler extends ResponseEntityExceptionHandler{

	//para todas las otras excepciones
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> manejarTodasExcepciones(Exception ex, WebRequest request){

		//clase que hice
		ExceptionResponse excepResp = new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(excepResp, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	//para todas las otras excepciones
		@ExceptionHandler(ExcepcionDominio.class)
		public final ResponseEntity<Object> manejarExcepcionDominio(Exception ex, WebRequest request){

			//clase que hice
			ExceptionResponse excepResp = new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
			return new ResponseEntity<>(excepResp, HttpStatus.BAD_REQUEST);
		}

	//	no funcionaba --> necesitaba @valid en controller
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {

		//obtener tdos los erroes
		StringBuilder bld = new StringBuilder();
		for (ObjectError error : ex.getBindingResult().getAllErrors()) {
			bld.append(error.getDefaultMessage());
		}
		String errores = bld.toString();

		ExceptionResponse excepResp = new ExceptionResponse(new Date(),"validacion fallida", errores);
		return new ResponseEntity<>(excepResp, HttpStatus.BAD_REQUEST);
	}



}