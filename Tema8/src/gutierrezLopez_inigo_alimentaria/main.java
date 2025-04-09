package gutierrezLopez_inigo_alimentaria;

public class main {
	public static void main(String[] args) {
		
		P_frescos pf1 = new P_frescos("Pescado", "12-12-2024", 234, "05-4-2024", "España");
		P_frescos pf2 = new P_frescos("Legumbres", "1-1-2024", 234, "09-8-2023", "España");
		
		P_refrigerados pr1 = new P_refrigerados("Nose", "03-11-2025", 23346, 12012194, "22-10-2024", 24.2, "Portugal");
		P_refrigerados pr2 = new P_refrigerados("Cocacola", "29-1-2024", 999, 12194, "22-10-2023", 2.4, "Francia");
		P_refrigerados pr3 = new P_refrigerados("Agua embotellada", "30-12-2024", 123456, 98765, "07-2-2026", 24.2, "Portugal");
		
		P_C_agua pca1 = new P_C_agua("Helados", "23-2-2025", 239, "08-08-2024", "Alemania", 0.0, 1.2, 3.5);
		P_C_agua pca2 = new P_C_agua("Tarta", "23-2-2026", 9870, "08-08-2025", "Belgica", 0.0, 4.5, 2);
		
		P_C_aire pcai1 = new P_C_aire("Nose", "12-1-2027", 978234, "03-03-2025", "Italia", 3.2, 5, 1.7, 8, 2.65);
		P_C_aire pcai2 = new P_C_aire("Guisantes", "12-1-2026", 1239434958, "03-03-2026", "España", 2, 34.6, 1.7, 8, 2.65);
		
		P_C_nitrogeno pcn1 = new P_C_nitrogeno("Ni idea", "14-04-2024", 3456, "11-06-2023", "Lituania", 12.33, "Metodo 1", 6300);
		
		Productos [] prod = {pf1,pf2,pr1,pr2,pr3,pca1,pca2,pcai1,pcai2,pcn1};
		
		for (Productos productos: prod) {
			System.out.println(productos.getClass().getSimpleName());
			System.out.println(productos.toString());
            System.out.println("-------------------------------");
			
		}
	}

}
