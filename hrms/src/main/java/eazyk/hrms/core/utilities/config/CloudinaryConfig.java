package eazyk.hrms.core.utilities.config;

import com.cloudinary.Cloudinary;
import eazyk.hrms.core.utilities.cloudinary.CloudinaryManager;
import eazyk.hrms.core.utilities.cloudinary.CloudinaryService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;



@Configuration
public class CloudinaryConfig {

    @Value("${cld.access-key}")
    String apiKey;

    @Value("${cld.secret-key}")
    String apiSecretKey;



    @Bean
    public Cloudinary cloudinaryUser(){
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "eazyk",
                "api_key", apiKey,
                "api_secret", apiSecretKey));
    }

    @Bean
    public CloudinaryService cloudinaryService(){
        return new CloudinaryManager(cloudinaryUser());
    }




}
