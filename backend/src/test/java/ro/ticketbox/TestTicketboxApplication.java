package ro.ticketbox;

import org.springframework.boot.SpringApplication;

public class TestTicketboxApplication {

	public static void main(String[] args) {
		SpringApplication.from(TicketboxApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
