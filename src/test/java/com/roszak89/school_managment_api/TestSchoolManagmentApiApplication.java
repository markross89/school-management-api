package com.roszak89.school_managment_api;

import org.springframework.boot.SpringApplication;

public class TestSchoolManagmentApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(SchoolManagmentApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
