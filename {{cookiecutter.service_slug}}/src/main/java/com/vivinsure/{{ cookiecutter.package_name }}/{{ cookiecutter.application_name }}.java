package com.vivinsure.{{ cookiecutter.package_name }};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class {{ cookiecutter.application_name }} {

    public static void main(String[] args) {
        SpringApplication.run({{ cookiecutter.application_name }}.class, args);
    }

}
