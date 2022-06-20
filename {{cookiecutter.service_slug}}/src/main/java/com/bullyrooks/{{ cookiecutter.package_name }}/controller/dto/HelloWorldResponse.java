package com.bullyrooks.{{ cookiecutter.package_name }}.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HelloWorldResponse {
    private String message;
}
