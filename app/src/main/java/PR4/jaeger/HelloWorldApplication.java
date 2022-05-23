package PR4.jaeger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorldApplication {

    private static Logger logger = LogManager.getLogger(HelloWorldApplication.class);

    public void run() {
        var greeter = new GreeterService();
        System.out.println("Hello World");
        logger.info(greeter.greet("World"));
    }
}