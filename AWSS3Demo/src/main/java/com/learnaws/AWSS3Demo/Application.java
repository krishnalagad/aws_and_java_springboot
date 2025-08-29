package com.learnaws.AWSS3Demo;

import com.learnaws.AWSS3Demo.config.AwsProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	private final Logger logger = LoggerFactory.getLogger(Application.class);

	private final AwsProperties awsProperties;

	public Application(AwsProperties awsProperties) {
		this.awsProperties = awsProperties;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		logger.info("Access Key: {}", this.awsProperties.credentials().accessKey());
//		logger.info("Secret Key: {}", this.awsProperties.credentials().secretKey());
//		logger.info("Region: {}", this.awsProperties.region().staticRegion());
	}
}