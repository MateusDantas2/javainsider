package br.com.javainsider.java.essencial.tipos.especiais.enums;

import static br.com.javainsider.java.essencial.tipos.especiais.enums.ExDayOfWeek.DayOfWeek.MONDAY;

public class ExDayOfWeek {

    public enum DayOfWeek {
        SUNDAY(null),
        SATURDAY(SUNDAY),
        FRIDAY(SATURDAY),
        THURSDAY(FRIDAY),
        WEDNESDAY(THURSDAY),
        TUESDAY(WEDNESDAY),
        MONDAY(TUESDAY);

        private final DayOfWeek next;

        DayOfWeek(DayOfWeek next) {
            this.next = next;
        }

        public DayOfWeek next() {
            return this.next == null ? MONDAY : this.next;
        }
    }
    public static void main(String[] args) {
        DayOfWeek dow = MONDAY;
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);
    }
}
