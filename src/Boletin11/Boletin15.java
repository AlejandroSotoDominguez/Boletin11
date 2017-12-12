
package Boletin11;

public class Boletin15 {

    public static void main(String[] args) {
        Seleccion xog1 = new Xogador(1,"alex","soto",27,"defensa");
        Seleccion mas1 = new Masaxista(2,"pepe","rodriguez",34,"asdas","asda",2);
        Xogador xog2 = new Xogador(2,"asd","sada",43,"asdasd");
        xog1.viaxar();
        mas1.viaxar();
        xog2.concentrarse();
        xog2.metodoPrueba();
    }
    
}
