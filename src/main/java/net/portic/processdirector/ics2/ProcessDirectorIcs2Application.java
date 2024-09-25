package net.portic.processdirector.ics2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "net.portic.processdirector.common",
        "net.portic.processdirector.ics2"
})
public class ProcessDirectorIcs2Application {

    public static void main(String[] args) {
        SpringApplication.run(ProcessDirectorIcs2Application.class, args);
    }
}
