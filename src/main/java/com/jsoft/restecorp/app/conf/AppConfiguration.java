package com.jsoft.restecorp.app.conf;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Application configuration.
 *
 * @author <a href="johnquirogac@gmail.com">John Quiroga</a>
 * @since 0.0.1
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.jsoft.restecorp" })
@Configuration
public class AppConfiguration {



}
