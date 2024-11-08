package com.ammous.customerservice.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * @author Rami Ammous
 */
@ConfigurationProperties(prefix = "global.param")
@Setter @Getter @NoArgsConstructor @AllArgsConstructor
public class GlobalConfig {
    int p1;
    int p2;
}
