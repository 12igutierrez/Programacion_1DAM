package gutierrezLopez_inigo_instrumentos;

class Campana extends Instrumento {
    private int reverberacion;

    public Campana(int reverberacion) {
        this.reverberacion = reverberacion;
    }

    @Override public void interpretar() {
        for (int i = 0; i < indice; i++) {
            String sonido = notas[i].toString().toLowerCase();
            System.out.println(sonido + "o".repeat(reverberacion));
        }
    }
}
