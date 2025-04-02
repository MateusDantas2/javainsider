package br.com.javainsider.javaessencial.lambda.fundamentos;

public class AppString5 {
    public static void main(String[] args) {
//        createAndPrint(n -> new Person(n), "Mateus");
        createAndPrint(Person::new, "Mateus");
    }

    private static void createAndPrint(PersonCreator creator, String name) {
        System.out.println(creator.create(name));
    }
}
