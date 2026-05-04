package strategy;

public class FretePadrao implements EstrategiaFrete {

    public float calcular(float peso, float distancia) {
        // Soma simples das taxas de peso e distância
        return peso + distancia;
    }
}