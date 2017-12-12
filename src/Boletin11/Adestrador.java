
package Boletin11;

public class Adestrador extends Seleccion {
    private String idFederacion;
    
    public Adestrador(int id,String nome,String apelido,int edade,String idFederacion){
        super(id,nome,apelido,edade);
        this.idFederacion = idFederacion;
    }
    
    public void viaxar(){
        System.out.println("viaxan os xogadores");
    }
    
    public void dirixirPartido(){
        
    }
    
    public void dirixirAdestramento(){
        
    }

    public String getIdFederacion() {
        return idFederacion;
    }
    
    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
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
    
    public void setIdFederacion(){
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return "Adestrador{" + "idFederacion=" + idFederacion + '}';
    }
    
    
    
}
