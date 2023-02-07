package exercici2;

public class CalculoDni {
	
	public char calcularLletraDni (int numeroDni) {
		char lletresDni [] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		return lletresDni [numeroDni % 23];
	}
	

}
