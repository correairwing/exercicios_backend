/**
 * 
 */
package com.icorrea.exercicio.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author irwing.correa
 *
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.icorrea.exercicio.repository")
public class MongoConfig {

}
