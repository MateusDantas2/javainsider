package br.com.javainsider.java.essencial.oo1.metodos;

public class ExWatch {
    public static void main(String[] args) {

        Watch w = new Watch();
        w.setTime(10, 45, 40);

        System.out.println("São: "+ w.readHour() + ":" + w.readMinute() + ":" + w.readSecond());
    }
}
