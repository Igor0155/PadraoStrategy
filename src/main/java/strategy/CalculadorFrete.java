package strategy;

public class CalculadorFrete {

    private float peso;
    private float distancia;

    public CalculadorFrete(float peso, float distancia) {
        this.peso = peso;
        this.distancia = distancia;
    }

    public float calcular(EstrategiaFrete estrategia) {
        return estrategia.calcular(peso, distancia);
    }
}