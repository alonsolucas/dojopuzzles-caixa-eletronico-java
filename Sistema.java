package caixaeletronico;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	static int[] notasDisponiveis = {100, 50, 20, 10};
	
	public static List<Integer> sacar() {
		
		List<Integer> notasEntregues = new ArrayList<>();
		String valorTxt = javax.swing.JOptionPane.showInputDialog("Insira o valor de saque: ");
		int valor = Integer.parseInt(valorTxt);
		
		if(valor % 10 == 0) {
			for(int i = 0; i < notasDisponiveis.length; i++) {
				while(valor >= notasDisponiveis[i]) {
					valor -= notasDisponiveis[i];
					notasEntregues.add(notasDisponiveis[i]);					
				}
			}
			
			System.out.println("Valor do saque: " + valorTxt);
			System.out.println("Notas: " + notasEntregues);
		} 
		
		else {
			System.out.println("Este caixa só trabalha com notas de 100, 50, 20 e 10! Por favor insira um valor multiplo de 10");
		}
				
		return notasEntregues;
	}

}
