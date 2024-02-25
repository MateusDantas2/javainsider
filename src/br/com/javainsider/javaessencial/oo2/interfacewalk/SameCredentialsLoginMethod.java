package br.com.javainsider.javaessencial.oo2.interfacewalk;

public class SameCredentialsLoginMethod implements LoginMethod {

    @Override
    public boolean login(String username, String password) {
        return username.equals(password);
    }
}
