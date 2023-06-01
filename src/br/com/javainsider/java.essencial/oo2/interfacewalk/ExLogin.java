package br.com.javainsider.java.essencial.oo2.interfacewalk;

public class ExLogin {
    public static void main(String[] args) {

        StaticLoginMethod l1 = new StaticLoginMethod();
        System.out.println(l1.login("dota", "dota123"));
        System.out.println(l1.login("admin", "admin123"));

        System.out.println("---------- LOGIN 2 ----------");

        SameCredentialsLoginMethod l2 = new SameCredentialsLoginMethod();
        System.out.println(l2.login("admin", "admin"));
        System.out.println(l2.login("dota", "dota123"));

        System.out.println("---------- LOGIN 3 ----------");

        StaticLoginMethod l3 = new StaticLoginMethod("calopsita", "calopsita123");
        System.out.println(l3.login("calopsita", "calopsita123"));
    }
}
