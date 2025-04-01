package br.com.javainsider.javaessencial.inner_classes.regular.exercicio;
public class Hero {
    private Integer ammo;

    public Hero(Integer ammo) {
        this.ammo = ammo;
    }

    public Integer getAmmo() {
        return ammo;
    }

    public class Weapon {
        public void shoot() {
            ammo--;
        }
    }
}
