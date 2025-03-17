package br.com.javainsider.javaessencial.gerenciamento.excecoes.falhas;

public class Vehicle {

    private int currentSpeed;

    public Vehicle(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int accelerate() {
        if (currentSpeed * 2 > 200) {
            throw new ExcessiveSpeedException("Velocidade máxima atingida!");
        }
        currentSpeed *= 2;
        return currentSpeed;
    }
}
