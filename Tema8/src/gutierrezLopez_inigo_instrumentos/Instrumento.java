package gutierrezLopez_inigo_instrumentos;

abstract public class Instrumento {
    Nota[] notas = new Nota[7];
    int indice = 0;

    public void add(Nota nota) {
        if (indice < notas.length) {
            notas[indice++] = nota;
        } else {
            System.out.println("No se pueden agregar más notas.");
        }
    }
    
    public abstract void interpretar();
}