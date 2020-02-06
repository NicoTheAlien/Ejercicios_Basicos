import java.util.*;
public class Ejecutar {

	public static void main(String[] args) {
		Scanner f= new Scanner(System.in);
		variablesNuméricas n1= new variablesNuméricas();
		variablesNuméricas n2= new variablesNuméricas(9, 9);
		MierdiEjercicioDos nom= new MierdiEjercicioDos();
		System.out.println("La suma de "+ n1.getN()+" y "+n1.getM()+" es igual a "+(n1.getN()+n1.getM()));
		System.out.println("La suma de "+ n2.getN()+" y "+n2.getM()+" es igual a "+(n2.getN()+n2.getM()));
		if (n2.getN() < n2.getM()) {
			System.out.println(n2.getN()+" es menor que "+n2.getM());
		}
		else {
			if (n2.getN()>n2.getM()) {
			System.out.println(n2.getM()+" es menor que "+n2.getN());
			}
			else {
				if (n2.getN()==n2.getM()) {
					System.out.println(n2.getM()+" es igual que "+n2.getN());
				}
			}
		}
		System.out.println("Hola, " +nom.getNombre()+", ¿Deseas cambiar tu nombre?");
		System.out.println("true/false");
		boolean respuesta = f.nextBoolean();
		if (respuesta == true) {
			System.out.println("Introduce tu nuevo nombre");
			nom.setNombre(f.next());
			System.out.println("Tu nuevo nombre es "+nom.getNombre());
		}
		else {
			System.out.println("Tu nombre siempre será "+nom.getNombre());
		}
	}
}
