package com.Sem5.PharmEase.config;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudinaryConfig {

    @Bean
    public Cloudinary cloudinary() {
        String cld_name=EnvConfig.get("CLOUD_NAME");
        String cld_key=EnvConfig.get("CLOUD_API_KEY");
        String cld_secret=EnvConfig.get("CLOUD_API_SECRET");
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name", cld_name,
                "api_key", cld_key,
                "api_secret", cld_secret
        ));
    }
}
