package gutierrezLopez_inigo_zoo;

import java.util.*;

class Habitat {
    private String nombre;
    private List<String> animales;
    private String caracteristicas;
    private double km;
    private boolean esCerrado;

    
    public Habitat(String nombre, List<String> animales, String caracteristicas, double km, boolean esCerrado) {
        this.nombre = nombre;
        this.animales = new ArrayList<>(animales);
        Collections.sort(this.animales);
        this.caracteristicas = caracteristicas;
        this.km = km;
        this.esCerrado = esCerrado;
    }

    
    public String getNombre() { 
    	return nombre; 
    }
    public void setNombre(String nombre) {
    	this.nombre = nombre; 
    }

    public List<String> getAnimales() { 
    	return animales; 
    }
    public void setAnimales(List<String> animales) {
        this.animales = new ArrayList<>(animales);
        Collections.sort(this.animales);
    }

    public String getCaracteristicas() { 
    	return caracteristicas; 
    }
    public void setCaracteristicas(String caracteristicas) {
    	this.caracteristicas = caracteristicas; 
    }

    public double getKm() { 
    	return km; 
    }
    public void setKm(double km) { 
    	this.km = km; 
    }

    public boolean isEsCerrado() { 
    	return esCerrado; 
    }
    public void setEsCerrado(boolean esCerrado) { 
    	this.esCerrado = esCerrado; 
    }

    
    @Override public String toString() {
        String resultado = getNombre().toUpperCase()+": "+getKm()+"km\n"
        		+" Caracteristicas: "+getCaracteristicas()+"\n"
        		+" Tipo de espacio: "+isEsCerrado()+"\n"
        		+" Cantidad de animales: "+getAnimales().size()+"\n"
        		+" Animales para visitar:\n";
        		for (String animal : animales) {
        			resultado += "    - "+animal+"\n";
        		}
       return resultado;
    }
    
    
}