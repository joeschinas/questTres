
package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Date;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;


public class Relatorio {
    SimpleDateFormat sdf = new SimpleDateFormat("dd:MM:yyyy HH:mm:ss"); 
    private Date moment;
  
    private List<Pacientes> listPaciente = new ArrayList<>();
   

    public Relatorio() {
    }

    public Relatorio(Date moment) {
        this.moment = moment;
      
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public List<Pacientes> getListPaciente() {
        return listPaciente;
    }

    public void addPaciente(Pacientes peciente){
    listPaciente.add(peciente);
    }
     public void addRemove(Pacientes peciente){
    listPaciente.remove(peciente);
    }
     public StringBuilder ToString(){
     
     StringBuilder sb = new StringBuilder();
     for(Pacientes obgpacient :listPaciente){
     sb.append("Nome: ");
     sb.append(obgpacient.getNome());
     sb.append("\n Sexo: ");
      sb.append(obgpacient.getSexo());
      sb.append("\n Peso: ");
       sb.append(obgpacient.getPeso());
       sb.append("\n Idade: ");
        sb.append(obgpacient.getIdade());
        sb.append("\n Altura: ");
         sb.append(obgpacient.getAltura());
         sb.append("\n");
         sb.append(sdf.format(moment));
         sb.append("\n");
             }
     return sb;
     
     }
     /* aqui nesse metodo abaixo é usado filtrar,a média de idade dos homens.*/
     public Integer madiaHomem(){
    Integer sum=0;
    
         List<Pacientes> mediaHomem = listPaciente.stream().filter(x->x.getIdade()>=1 && x.getSexo().equals("M")).collect(Collectors.toList());
        
         
         mediaHomem.forEach(x-> x.getIdade());
        for (Pacientes mediaH:mediaHomem){
        
        sum +=mediaH.getIdade();
        }
        Integer media= sum/mediaHomem.size();
     
        
         return media;
     }
     
     /* aqui nesse metodo abaixo é usado filtrar,
     a quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg.  */
    public int qtidadeMler(){
     
    List<Pacientes> qtdadeMlr = listPaciente.stream().filter(x->x.getAltura()>=160&&
             x.getAltura()<= 170 &&
             x.getPeso()>= 70&&
             x.getSexo().equals("F")).collect(Collectors.toList());
     qtdadeMlr.forEach(x->x.getAltura());
     
     int count=1;
     for (Pacientes objMulher:qtdadeMlr){
     
     count++;
     }
     return count;
     
     }
    /* a quantidade de pessoas com idade entre 18 e 25*/
    
    public int qtdfaixa (){
    
    List<Pacientes> listFaixa = listPaciente.stream().filter(x->x.getIdade()>=18 && x.getIdade()<=25).collect(Collectors.toList());
    listFaixa.forEach(x->x.getIdade());
    int count=0;
    for(Pacientes obgfaixa: listPaciente){
    count++;
    
    
    }
    return count;
    }
     /*o nome do paciente mais velho*/
    public String faixaMaior(){
    int aux=0;
    String nomeMaior=null;
    for(Pacientes objMaior: listPaciente)            {
    
    
                if(aux<objMaior.getIdade())          {
                    
                    aux=objMaior.getIdade();
               nomeMaior =objMaior.getNome();
                  
                                                     }
                
               
    }
  
   System.out.println("o nome do paciente mais velho:");
        return nomeMaior;
    }
    
    
    
    
    public String mlrBaixa(){
    int aux=0;
    String nomeMlr=null;
    for(Pacientes objMlr: listPaciente){
    if(aux<objMlr.getAltura() ){
        
        if("F"==objMlr.getSexo())
    aux=objMlr.getAltura();  
    nomeMlr=objMlr.getNome();
    
    }
    else{
    
        System.out.println("teste");}
    }
        System.out.println("o nome da mulher mais baixa:");
        return nomeMlr;
 
    }
}
    

