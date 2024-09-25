package net.portic.processdirector.ics2;

import org.springframework.boot.SpringApplication;

public class TestProcessDirectorIcs2Application {

    public static void main(String[] args) {
        SpringApplication.from(ProcessDirectorIcs2Application::main).with(TestcontainersConfiguration.class).run(args);
    }

}
