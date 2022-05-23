package PR4.jaeger;

public class GreeterService implements Greeter{

    @Override
    public String greet(String name){
        return "Hello " + name;
    }
}