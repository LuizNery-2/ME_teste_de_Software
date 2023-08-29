import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculadoraSalarioTest {

    public static CalculadoraSalario calcudoraSalario = new CalculadoraSalario();

    @Test
    @DisplayName("Teste 1 deu certo")
    public void testeSalrioCT01()
    {
        assertEquals(97.50, calcudoraSalario.calcularINSS(1300), 0.01);
    }
    @Test
    @DisplayName("Teste 2 deu certo")
    public void testeSalrioCT02()
    {
        assertEquals(115.20, calcudoraSalario.calcularINSS(1500), 0.01);
    }
    @Test
    @DisplayName("Teste 3 deu certo")
    public void testeSalrioCT03()
    {
        assertEquals(263.06, calcudoraSalario.calcularINSS(3000), 0.01);
    }
    @Test
    @DisplayName("Teste 4 deu certo")
    public void testeSalrioCT04()
    {
        assertEquals(665.92, calcudoraSalario.calcularINSS(6000), 0.01);
    }
    @Test
    @DisplayName("Teste 5  deu certo")
    public void testeSalrioCT05()
    {
        assertEquals(876.97, calcudoraSalario.calcularINSS(10000), 0.01);
    }
}