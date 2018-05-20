package cditest.service;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import cditest.config.RestClientServiceProducer;

public class HttpClientTest {

    private static SeContainer container;

    @BeforeAll
    static void initialize() {
        SeContainerInitializer initializer = SeContainerInitializer.newInstance();
        container = initializer.disableDiscovery()
                               .addPackages(RestClientServiceProducer.class, MiscellaneousInfoService.class)
                               .initialize();
    }

    @Test
    void test() {
        MiscellaneousInfoService miscellaneousInfoService = 
                container.select(MiscellaneousInfoService.class).get();
        System.out.println(miscellaneousInfoService.fetchMiscellaneousInfo());
    }

    @AfterAll
    static void tearDown() {
        container.close();
    }

}
