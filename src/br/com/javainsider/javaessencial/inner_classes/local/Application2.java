package br.com.javainsider.javaessencial.inner_classes.local;

public class Application2 {
    private final String MESSAGE = "Hi";

    public void greet(String name) {
        String upperName = name.toUpperCase();

        class Greeter {
            public void sayHi() {
                System.out.format("%s, %s!", MESSAGE, upperName);
            }
        }

        Greeter greeter = new Greeter();
        greeter.sayHi();
    }
}
