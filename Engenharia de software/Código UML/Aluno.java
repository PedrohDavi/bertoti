public class Aluno extends Pessoa {
    private int AlunotId;

    public Aluno(String nome, int idade, int AlunotId) {
        super(nome, idade);
        this.AlunotId = AlunotId;
    }

    public int getAlunoId() {
        return AlunotId;
    }

    public void setAlunotId(int AlunotId) {
        this.AlunotId = AlunotId;
    }
}
