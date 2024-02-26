public class Main {
    public static void main(String[] args) {

        CalcEmprestimo calcEmprestimoPessoal = new CalcEmprestimo(new EmprestimoPessoal());
        double jurosEmprestimoPessoal = calcEmprestimoPessoal.calcularJuros(10000);
        System.out.println("Juros no empréstimo pessoal: R$" + jurosEmprestimoPessoal);

        CalcEmprestimo calcEmprestimoComercial = new CalcEmprestimo(new EmprestimoComercial());
        double jurosEmprestimoComercial = calcEmprestimoComercial.calcularJuros(10000);
        System.out.println("Juros no empréstimo comercial: R$" + jurosEmprestimoComercial);

        CalcEmprestimo calcEmprestimoHipotecario = new CalcEmprestimo(new EmprestimoHipotecario());
        double jurosEmprestimoHipotecario = calcEmprestimoHipotecario.calcularJuros(100000);
        System.out.println("Juros no empréstimo hipotecário: R$" + jurosEmprestimoHipotecario);

    }
}