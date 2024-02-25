package br.com.javainsider.javaessencial.oo2.interfacewalk;

public class StaticLoginMethod implements LoginMethod {

    private static final String USERNAME = "dota";
    private static final String PASSWORD = "dota123";

    private String username;
    private String password;

    public StaticLoginMethod() {
        this(USERNAME, PASSWORD);
    }

    public StaticLoginMethod(String username, String password){
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String username, String password) {
        if (username.equals(username) && password.equals(password)) {
            return true;
        }
        return false;
    }
}
