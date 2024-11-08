package com.ammous.customerservice.controller;

import com.ammous.customerservice.config.GlobalConfig;
import com.ammous.customerservice.controller.api.ConfigTestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author Rami Ammous
 */
@RestController
@RefreshScope
public class ConfigTestController implements ConfigTestApi {

    @Value("${global.param.p1}")
    private int p1;

    @Value("${global.param.p2}")
    private int p2;

    @Value("${customer.param.x}")
    private int x;

    @Value("${customer.param.y}")
    private int y;

    @Autowired
    GlobalConfig globalConfig;

    @Override
    public Map<String, Integer> getConfig() {
        return Map.of(
             "p1", p1  ,
             "p2", p2  ,
             "x", x  ,
             "y", y
        );
    }

    @Override
    public GlobalConfig getGlobalConfig() {
        return globalConfig;
    }
}
