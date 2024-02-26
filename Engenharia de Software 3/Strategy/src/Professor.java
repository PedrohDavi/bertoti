public class Professor {
    private int id;
    private char nome;

    private char materia;

    private AlteracaoNotas alteracaoNotas;

    private VisualizacaoNotas visualizacaoNotas;

    public VisualizacaoNotas getVisualizacaoNotas() {
        return visualizacaoNotas;
    }

    public void setVisualizacaoNotas(VisualizacaoNotas visualizacaoNotas) {
        this.visualizacaoNotas = visualizacaoNotas;
    }

    public AlteracaoNotas getAlteracaoNotas() {
        return alteracaoNotas;
    }

    public void setAlteracaoNotas(AlteracaoNotas alteracaoNotas){
        this.alteracaoNotas = alteracaoNotas;
    }
}
