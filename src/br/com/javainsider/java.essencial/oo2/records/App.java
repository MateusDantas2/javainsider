package br.com.javainsider.java.essencial.oo2.records;

public class App {
    public static void main(String[] args) {

        Person person = new Person("Mateus", "Dantas", 27);
        System.out.println(person);
        System.out.println(person.getFirstName());

        System.out.println("----------NEW PERSON----------");
        PersonRecord personRecord = new PersonRecord("Mateus", "Dantas", 27);
        System.out.println(personRecord);
        System.out.println(personRecord.lastName());

        System.out.println("----------NEW PERSON----------");
        PersonRecord personRecord2 = new PersonRecord("Mateus", "Dantas", 29);
        System.out.println(personRecord2.equals(personRecord));

//        PersonRecord personRecord3 = new PersonRecord(null, "Dantas", 29);
//        System.out.println(personRecord3);

        System.out.println("----------NEW PERSON----------");
        PersonRecord personRecord4 = new PersonRecord("Mateus", "Nascimento");
        System.out.println(personRecord4);
        System.out.println(personRecord4.fullName());

        System.out.println("----------NEW PERSON----------");
        PersonRecord personRecord5 = PersonRecord.create("Cris");
        System.out.println(personRecord5);
    }
}
