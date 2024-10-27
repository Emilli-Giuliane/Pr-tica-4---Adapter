public class Principal {
    public static void main(String[] args) {
        BuracoRedondo buracoRedondo = new BuracoRedondo(5);
        PinoRedondo pinoRedondo = new PinoRedondoConcreto(5);
        System.out.println("Pino Redondo: " + buracoRedondo.encaixa(pinoRedondo));
        PinoQuadrado pinoQuadrado = new PinoQuadrado(7);
        AdaptadorPinoQuadrado adaptadorPinoQuadrado = new AdaptadorPinoQuadrado(pinoQuadrado);
        System.out.println("Pino Quadrado: " + buracoRedondo.encaixa(adaptadorPinoQuadrado));
    }
}
