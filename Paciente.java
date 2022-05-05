public class Paciente extends Medico{
    public String nome;
    public int diasInternado;

    public Paciente(String nome, int diasInternado, String medicoNome) {
        this.nome = nome;
        this.diasInternado = diasInternado;
        this.medicoNome= medicoNome;
    }
        
    public void exibirRelatorioPaciente(){
        System.out.println("Paciente: "+ this.getNome()+ "\nMédico: "+this.medicoNome+ "\nQuantidade de dias que ficaram internados:"+ this.getDiasInternado()+"\n");
    }

    public String getMedicoNome() {
        return medicoNome;
    }

    public void setMedicoNome(String medicoNome) {
        this.medicoNome = medicoNome;
    }
    public void retornarDiasInternado(){
        this.getDiasInternado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDiasInternado() {
        return diasInternado;
    }

    public void setDiasInternado(int diasInternado) {
        this.diasInternado = diasInternado;
    }
}
