
package Boletin11;

public class Masaxista extends Seleccion {
    private String titulacion;
    private int anosExperiencia;

    public Masaxista(int id,String nome,String apelido,int edade,String idFederacion,String titulacion, int anosExperiencia) {
        super(id,nome,apelido,edade);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public void concentrarse(){
        
    }
    
    public void viaxar(){
        System.out.println("viaxan os xogadores");
    }
    
    public void darMasaxes(){
        
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return "Masaxista{" + "titulacion=" + titulacion + ", anosExperiencia=" + anosExperiencia + '}';
    }
    
    
}
