package strategy;

public class FreteFracionado implements EstrategiaFrete {

    public float calcular(float peso, float distancia) {
        if (distancia == 0) {
            throw new IllegalArgumentException("Distância não pode ser zero para frete fracionado");
        } else {
            return peso / distancia;
        }
    }
}