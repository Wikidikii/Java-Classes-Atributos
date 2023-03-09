package uscs;


public class Aluno {
    
    String nome;
    int codmat;
    String cpf;
    char sexo;
    double nota_p1;
    double nota_p2;
    double nota_p3;
    double Media;
    
  
    public void ImprimeAluno ()
    {
        System.out.println(nome);
        System.out.println(codmat);
        System.out.println(cpf);
        
    }  
    public void ImprimeSexo()
    {
        System.out.println(nome + " é");
        if (sexo == 'M') {
            System.out.println("Masculino");
            
        }
        if (sexo == 'F') {
            System.out.println("Feminino");
        }
    }  
    public void MediaAluno ()
    {   

        if (nota_p1 > nota_p2 && nota_p3 > nota_p2) {
           Media = (nota_p1+nota_p3)/2;
                    
        }
        else if (nota_p1 > nota_p3 && nota_p2 > nota_p3) {
            Media = (nota_p1+nota_p2)/2;
            
        }
        else {
            Media= (nota_p2+nota_p3)/2;
            
        }
        
        System.out.println(Media);        
    }
    public void Resultado ()
    {
        if (Media >= 6.0){
            System.out.println("Aprovado");
            
        }
        else    {
            System.out.println("Reprovado");
        }
    }
    }
