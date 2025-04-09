package gutierrezLopez_inigo_instrumentos;

import java.util.Random;

class Piano extends Instrumento {
    private int octavas;
    private Random r = new Random();

    public Piano(int octavas) {
        this.octavas = octavas;
    }

    @Override
    public void interpretar() {
        for (int i = 0; i < indice; i++) {
            int octava = r.nextInt(octavas) + 1;
            System.out.println(notas[i].toString().toLowerCase() + octava);
        }
    }
}
