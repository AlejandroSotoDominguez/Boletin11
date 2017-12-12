
package Boletin11;

public class Xogador extends Seleccion {
    private String demarcacion;
    
    public Xogador(int id,String nome,String apelido,int edade,String demarcacion){
        super(id,nome,apelido,edade);
        this.demarcacion = demarcacion;
    }
    
    public void concentrarse(){
        System.out.println("concentrase a selección");
    }
    
    public void viaxar(){
        System.out.println("viaxan os xogadores");
    }
    
    public void xogarPartido(){
        
    }
    
    public void entrenar(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getEdade() {
        return edade;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString() {
        return "Xogador{" +"id = "+id+"nome = "+nome+" apelidos = "+apelido+" edade = "+edade+
                "demarcacion = " + demarcacion + '}';
    }
    
    
    
}
