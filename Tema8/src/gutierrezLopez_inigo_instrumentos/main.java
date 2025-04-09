package gutierrezLopez_inigo_instrumentos;

public class main {
    public static void main(String[] args) {
        Piano piano = new Piano(5);
        piano.add(Nota.DO);
        piano.add(Nota.FA);
        piano.interpretar();
        
        Campana campana = new Campana(3);
        campana.add(Nota.MI);
        campana.add(Nota.LA);
        campana.interpretar();
        
        Guitarra guitarra = new Guitarra(6);
        guitarra.add(Nota.SOL);
        guitarra.add(Nota.RE);
        guitarra.interpretar();
    }
}
