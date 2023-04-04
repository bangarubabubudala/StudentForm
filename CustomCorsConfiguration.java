package cfss.REGISTRATION;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CustomCorsConfiguration {

	@Bean
	public WebMvcConfigurer corsConfigurer1() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("https://works.dev.herb.apcfss.in", "https://works.test.herb.apcfss.in",
						"http://localhost:3001", "http://localhost:3000").allowedMethods("*").allowedHeaders("*")
						.allowCredentials(false).maxAge(3600);
			}
		};
	}
}
