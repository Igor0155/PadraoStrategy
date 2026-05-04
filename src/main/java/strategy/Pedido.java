package strategy;

public class Pedido {

    private float valorFrete;

    public float getValorFrete() {
        return valorFrete;
    }

    public void calcularFretePadrao(float peso, float distancia) {
        CalculadorFrete calculador = new CalculadorFrete(peso, distancia);
        this.valorFrete = calculador.calcular(new FretePadrao());
    }

    public void calcularFreteExpresso(float peso, float distancia) {
        CalculadorFrete calculador = new CalculadorFrete(peso, distancia);
        this.valorFrete = calculador.calcular(new FreteExpresso());
    }

    public void calcularFreteFixoPorDistancia(float peso, float distancia) {
        CalculadorFrete calculador = new CalculadorFrete(peso, distancia);
        this.valorFrete = calculador.calcular(new FreteFixoPorDistancia());
    }

    public void calcularFreteFracionado(float peso, float distancia) {
        CalculadorFrete calculador = new CalculadorFrete(peso, distancia);
        this.valorFrete = calculador.calcular(new FreteFracionado());
    }

    public void calcularFretePromocional(float peso, float distancia) {
        CalculadorFrete calculador = new CalculadorFrete(peso, distancia);
        this.valorFrete = calculador.calcular(new FretePromocional());
    }
}