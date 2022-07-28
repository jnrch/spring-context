package com.jonathan.ejercicio1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        Saludo saludo = (Saludo) applicationContext.getBean("saludo");
        String texto = saludo.imprimirSalud();

        System.out.println(texto);
    }
}
