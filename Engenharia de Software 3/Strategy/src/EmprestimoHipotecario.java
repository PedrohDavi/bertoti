public class EmprestimoHipotecario implements StrategyCalculoEmprestimo{

    private static final double TAXA_JUROS = 0.05;

    @Override
    public double calcularJuros(double principal) {
        return principal * TAXA_JUROS;
    }
}
