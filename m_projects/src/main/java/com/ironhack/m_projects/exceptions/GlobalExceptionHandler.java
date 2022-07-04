package com.ironhack.m_projects.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice("com.deingun.bankingsystem")
public class GlobalExceptionHandler {


    @ResponseStatus(HttpStatus.BAD_REQUEST) // Establezca el código de estado en 400
    @ExceptionHandler({MethodArgumentNotValidException.class})
    public String paramExceptionHandler(MethodArgumentNotValidException e) {
        BindingResult exceptions = e.getBindingResult();
//        Determine si hay un mensaje de error en la excepción; si existe, use el mensaje en la excepción; de lo contrario, use el mensaje predeterminado
        if (exceptions.hasErrors()) {
            List<ObjectError> errors = exceptions.getAllErrors();
            if (!errors.isEmpty()) {
//                Todos los parámetros de error se enumeran aquí De acuerdo con la lógica normal, solo se requiere el primer error.
                FieldError fieldError = (FieldError) errors.get(0);
                return fieldError.getDefaultMessage();
            }
        }
        return "Error de parámetro de solicitud";
    }


}
