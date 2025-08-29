package com.learnaws.AWSS3Demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "cloud.aws")
public record AwsProperties(Credentials credentials, Region region) {

    public record Credentials(String accessKey, String secretKey) {}

    public record Region(String staticRegion) {}
}