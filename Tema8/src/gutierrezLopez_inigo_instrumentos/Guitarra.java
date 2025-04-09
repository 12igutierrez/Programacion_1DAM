package gutierrezLopez_inigo_instrumentos;

import java.util.Random;

class Guitarra extends Instrumento {
    private int cuerdas;
    private Random r = new Random();

    public Guitarra(int cuerdas) {
        this.cuerdas = cuerdas;
    }

    @Override
    public void interpretar() {
        for (int i = 0; i < indice; i++) {
            int cuerda1 = r.nextInt(cuerdas) + 1;
            int cuerda2 = r.nextInt(cuerdas) + 1;
            System.out.println(cuerda1 + "+" + cuerda2 + "=" + notas[i].toString().toLowerCase());
        }
    }
}
