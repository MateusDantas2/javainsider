package br.com.javainsider.javaessencial.inner_classes.regular.exercicio;

import br.com.javainsider.javaessencial.inner_classes.regular.exercicio.Hero.Weapon;

public class ExHero {
    public static void main(String[] args) {
        Hero hero = new Hero(20);
        Weapon weapon = hero.new Weapon();

        weapon.shoot();
        weapon.shoot();
        weapon.shoot();

        System.out.println(hero.getAmmo());
    }
}
