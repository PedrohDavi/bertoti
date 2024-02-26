public class EmprestimoComercial implements StrategyCalculoEmprestimo{
    private static final double TAXA_JUROS = 0.08; // 8%

   @Override
    public double calcularJuros(double principal) {
        return principal * TAXA_JUROS;
    }
}
