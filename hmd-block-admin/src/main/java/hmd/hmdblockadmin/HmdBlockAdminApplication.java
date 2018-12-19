package hmd.hmdblockadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class HmdBlockAdminApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        System.out.println("admin");
        SpringApplication.run(HmdBlockAdminApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(HmdBlockAdminApplication.class);
    }
}
