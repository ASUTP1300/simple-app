package com.home.simpleapp;

import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.jni.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Optional;

@SpringBootApplication
@Slf4j
public class SimpleAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(SimpleAppApplication.class, args);




		//LocalDate localDate1 = LocalDate.parse("2003-02-01");
		//LocalDate localDate2 = LocalDate.parse("2026-02-01");
//
		//Long isA =  localDate2 != null && LocalDate.now().isBefore(localDate2) ? 1L : 0;
//
//
		//String field = "Комарова";
		//House house = new House(field);
//
		//long l = 122246464;
		//System.out.printf("long =  %.2f",l * 10e-5);
		////log.info("long = {}", String.format("%.3f", l* 10e-6));
//
		//Integer integer = null;
//
		//Optional<Integer> integerOptional = Optional.ofNullable(integer);
//
		//System.out.println(integerOptional);
//
		//String str = String.format("Я уже учу ангийский %s года, и  %s дней", 5, 1);
//
		//System.out.println(str);

	}











	public static class House {
		String filed;

		public House(String filed) {

			if(filed != null){
				this.filed = filed;
			}
		}

		@Override
		public String toString() {
			return "House{" +
					"filed='" + filed + '\'' +
					'}';
		}
	}
}
