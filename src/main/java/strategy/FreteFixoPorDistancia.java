package strategy;

public class FreteFixoPorDistancia implements EstrategiaFrete {

    public float calcular(float peso, float distancia) {
        // Multiplica o peso pela distância
        return peso * distancia;
    }
}