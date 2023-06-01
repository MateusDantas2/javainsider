package br.com.javainsider.java.essencial.tipos.especiais.enums;

public enum MyPet implements Pet {
    CAT {
        @Override
        public String talk() {
            return "Miau";
        }
    },
    MOUSE {
        @Override
        public String talk() {
            return "Squik";
        }
    }

//    @Override
//    public String talk() {
//        return "sound";
//    }
}
