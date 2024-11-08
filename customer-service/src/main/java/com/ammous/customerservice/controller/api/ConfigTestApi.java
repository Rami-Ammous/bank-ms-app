package com.ammous.customerservice.controller.api;

import com.ammous.customerservice.config.GlobalConfig;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * @author Rami Ammous
 */
public interface ConfigTestApi {

    @GetMapping("/testConfig")
    public Map<String,Integer> getConfig();

    @GetMapping("/globalConfig")
    public GlobalConfig getGlobalConfig();
}
