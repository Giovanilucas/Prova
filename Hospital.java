public class Hospital {
     public static void main(String[] args) {
    
         Paciente p1 = new Paciente("Giovani Lucas", 5, "Rayan Souza");
            Paciente p2 = new Paciente("Guilherme Nunes", 12, "Julio Cesar");
              Paciente p3 = new Paciente("Rafael Rodrigues", 2, "Marcos Souza");
                Paciente p4 = new Paciente("João Pedro Borges", 28, "Henrique Faria");
         
         
         
         Ala a1 = new Ala();
            a1.setespecializacao("Virose");
                a1.setId(26);
         
         a1.exibirRelatorio();
           p1.exibirRelatorioPaciente();
             p2.exibirRelatorioPaciente();
                p3.exibirRelatorioPaciente();
                   p4.exibirRelatorioPaciente();
     }
    
}
