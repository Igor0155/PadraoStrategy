package strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveCalcularFretePadraoPedido() {
        Pedido pedido = new Pedido();
        pedido.calcularFretePadrao(80.0f, 20.0f);
        assertEquals(100.0f, pedido.getValorFrete(), 0.01f);
    }

    @Test
    void deveCalcularFreteExpressoPedido() {
        Pedido pedido = new Pedido();
        pedido.calcularFreteExpresso(80.0f, 10.0f);
        assertEquals(70.0f, pedido.getValorFrete(), 0.01f);
    }

    @Test
    void deveCalcularFreteFixoPorDistanciaPedido() {
        Pedido pedido = new Pedido();
        pedido.calcularFreteFixoPorDistancia(80.0f, 1.1f);
        assertEquals(88.0f, pedido.getValorFrete(), 0.01f);
    }

    @Test
    void deveCalcularFreteFracionadoPedido() {
        Pedido pedido = new Pedido();
        pedido.calcularFreteFracionado(100.0f, 2.0f);
        assertEquals(50.0f, pedido.getValorFrete(), 0.01f);
    }

    @Test
    void naoDeveCalcularFreteFracionadoComDistanciaZero() {
        try {
            Pedido pedido = new Pedido();
            pedido.calcularFreteFracionado(100.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Distância não pode ser zero para frete fracionado", e.getMessage());
        }
    }

    @Test
    void deveCalcularFretePromocionalPedido() {
        Pedido pedido = new Pedido();
        pedido.calcularFretePromocional(70.0f, 80.0f);
        assertEquals(75.0f, pedido.getValorFrete(), 0.01f);
    }
}