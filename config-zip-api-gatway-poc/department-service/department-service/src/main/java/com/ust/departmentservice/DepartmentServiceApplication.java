package com.ust.departmentservice;
/**
 * Created by Sangharatna Davane
 * Date : 27-03-2024
 * Time : 19:34
 * Project Name :KPR_POC
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}
