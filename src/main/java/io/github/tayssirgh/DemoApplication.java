package io.github.tayssirgh;

import net.thevpc.nuts.NSession;
import net.thevpc.nuts.io.NPrintStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import net.thevpc.nuts.NApplication;
@SpringBootApplication
public class DemoApplication implements NApplication{

    public static void main(String[] args)  {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(NSession session) {
        NPrintStream out = session.out();
        out.println("Hello ##World##");
    }
}
