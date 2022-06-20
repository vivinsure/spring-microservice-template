#!/usr/bin/env python3

from cookiecutter.main import cookiecutter
import random


template_dir = '../spring-microservice-template'
output_dir = '../tmp'
cookiecutter(
    template_dir,
    output_dir=output_dir
)