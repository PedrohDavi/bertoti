public class EmprestimoPessoal implements StrategyCalculoEmprestimo{

    private static final double TAXA_JUROS = 0.1;

    @Override
    public double calcularJuros(double principal) {
        return principal * TAXA_JUROS;
    }
}
