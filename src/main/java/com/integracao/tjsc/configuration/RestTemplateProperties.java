package com.integracao.tjsc.configuration;

import org.springframework.stereotype.Component;

@Component
public class RestTemplateProperties {

    private Integer readTimeout = 150000;
    private Integer connectionTimeout = 150000;
    private String password = "123456";
    private String protocol= "TLS";

    public RestTemplateProperties() {
    }

    public Integer getReadTimeout() {
        return readTimeout;
    }

    public Integer getConnectionTimeout() {
        return connectionTimeout;
    }

    public String getPassword() {
        return password;
    }

    public String getProtocol() {
        return protocol;
    }

}
