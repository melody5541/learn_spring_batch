package batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ImportResource({"classpath:/org/springframework/batch/admin/web/resources/servlet-config.xml",
//        "classpath:/org/springframework/batch/admin/web/resources/webapp-config.xml"})
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(BatchConfig.class, args);
    }
}