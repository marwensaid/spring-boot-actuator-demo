package com.example.actuatordemo.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


//TODO this is a configuration class, put right annotation
public class ActuatorSecurityConfig extends WebSecurityConfigurerAdapter {

    /*
        This spring security configuration does the following

        1. Restrict access to the Shutdown endpoint to the ACTUATOR_ADMIN role.
        2. Allow access to all other actuator endpoints.
        3. Allow access to static resources.
        4. Allow access to the home page (/).
        5. All other requests need to be authenticated.
        5. Enable http basic authentication to make the configuration complete.
           You are free to use any other form of authentication.
     */

    @Override
    protected void configure(HttpSecurity http) {
        // TODO impl security component based in top commentary
    }
}
