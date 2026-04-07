package A.Ex06.model;

public class ExemploClasseSubClasse extends ExemploClasseSuperClasse {

   private String sobrenome;

   public ExemploClasseSubClasse(String nome, String sobrenome) {
       super(nome);
       this.sobrenome = sobrenome;
   }

   public String getSobrenome() {
       return sobrenome;
   }

   public void setSobrenome(String sobrenome) {
       this.sobrenome = sobrenome;
   }

   public void imprimirNomeCompleto(){
       System.out.println("Nome completo: " + super.getNome() + " " + this.sobrenome);
   }



}
