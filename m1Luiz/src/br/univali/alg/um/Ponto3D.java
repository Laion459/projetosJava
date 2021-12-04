package br.univali.alg.um;

public class Ponto3D {

    private float z;

    public Ponto3D(float z) {
        this.z = z;
        while (z < 1){
            testPositive(z);
        }
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Ponto3D{" +
                "z=" + z +
                '}';
    }

    // testa se negativo da erro
    public float testPositive(float z){
        if (z < 1){
            System.out.println("Número negativo para z não permitido!");
        }
        return z;
    }
}
