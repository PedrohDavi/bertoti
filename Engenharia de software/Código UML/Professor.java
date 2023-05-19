public class Professor extends Pessoa{

    private int professorId;

    public Professor(String nome, int idade, int professorId) {
        super(nome, idade);
        this.professorId = professorId;
    }

    public int getprofessorId() {
        return professorId;
    }

    public void setprofessorId(int professorId) {
        this.professorId = professorId;
    }
}
