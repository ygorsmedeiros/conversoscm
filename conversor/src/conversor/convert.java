package conversor;

import java.util.Scanner;

public class convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tlc = new Scanner (System.in); 
		
		System.out.println("escolha qual a conversão");
		System.out.println("centimetros para metros 1");
		System.out.println("metros para centimetros 2");
		System.out.println("centimetros para quilômetros 3");
		System.out.println("metros para quilômetros 4");
		System.out.println("quilômetros para metros 5");
		System.out.println("quilômetros para centimetros 6");
		
		char op = tlc.next().charAt(0);
		
		switch (op) {
        case '1':
        	System.out.println("informe o comprimento em centimetro: ");
    		double valor = tlc.nextDouble();
    		double result = valor / 100;
    		System.out.println("o valor convertido é "+ result + " metros");
            break;
        case '2':
        	System.out.println("informe o comprimento em metros: ");
    		double mtr = tlc.nextDouble();
    		double res = mtr * 100;
    		System.out.println("o valor convertido é "+ res + " centimetros");
            break;
        case '3':
        	System.out.println("informe o comprimento em centimetro: ");
    		double cpk = tlc.nextDouble();
    		double rest = (cpk/(10*10*10*10*10));
    		System.out.println("o valor convertido é "+ rest + " quilômetros");
            break;
        case '4':
        	System.out.println("informe o comprimento em metros: ");
    		double mpk = tlc.nextDouble();
    		double resu = mpk / 1000;
    		System.out.println("o valor convertido é "+ resu + "quilômetros");
        	break;
        case '5':
        	System.out.println("informe o comprimento em quilômetros: ");
    		double kpm = tlc.nextDouble();
    		double resul = kpm * 1000;
    		System.out.println("o valor convertido é "+ resul + " metros");
        	break;
        case '6':
        	System.out.println("informe o comprimento em kilometros: ");
    		double kpc = tlc.nextDouble();
    		double re = kpc * 1000000;
    		System.out.println("o valor convertido é "+ re + " centimetros");
            break;
        default:
            System.out.println("Erro: Operador inválido.");
            return;
            }
	}
}
