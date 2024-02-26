public class CalcEmprestimo {

    private StrategyCalculoEmprestimo estrategia;

    public CalcEmprestimo(StrategyCalculoEmprestimo estrategia) {

        this.estrategia = estrategia;
    }

    public double calcularJuros(double principal) {

        return estrategia.calcularJuros(principal);
    }
}
