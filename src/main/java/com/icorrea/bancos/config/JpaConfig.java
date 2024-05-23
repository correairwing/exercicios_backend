package com.icorrea.bancos.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Configuration
@EnableJpaRepositories(basePackages = "com.zavala.bancos.customer")
public class JpaConfig {

}
