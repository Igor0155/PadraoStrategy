package strategy;

public class FretePromocional implements EstrategiaFrete {

    public float calcular(float peso, float distancia) {
        return (peso + distancia) / 2;
    }
}