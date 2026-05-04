package strategy;

public class FreteExpresso implements EstrategiaFrete {

    public float calcular(float peso, float distancia) {
        // Subtrai um desconto por ser rota parceira
        return peso - distancia;
    }
}