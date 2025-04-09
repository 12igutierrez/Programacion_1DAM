package Clase3_Ejercicio1;

public class main {
    public static void main(String[] args) {
        
        // Crear instancias de las subclases concretas
        Poligono triangulo = new Triangulo(10, 5);
        Poligono rectangulo = new Rectangulo(8, 4);
        Poligono poligonoRegular = new PoligonoRegular(12, 2, 6, 4);

        // Mostrar áreas
        System.out.println("El area del polígono"+ triangulo.getClass().getSimpleName() +" es "+ triangulo.area());
        System.out.println("El area del polígono"+ rectangulo.getClass().getSimpleName() +" es "+ rectangulo.area());
        System.out.println("El area del polígono"+ poligonoRegular.getClass().getSimpleName() +" es "+ poligonoRegular.area());
    }
}

