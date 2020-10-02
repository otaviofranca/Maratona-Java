package classestest;

import classes.Calculadora;

import java.util.Scanner;

public class CalcTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner ler = new Scanner(System.in);
        System.out.println("==========calculadora==========");
        System.out.println("digite o primeiro numero");
        int num1 = ler.nextInt();

        System.out.println("digite o primeiro numero");
        int num2 = ler.nextInt();

        System.out.println("opções de operações:");
        System.out.println("digite 1 para adição");
        System.out.println("digite 2 para sub");
        System.out.println("digite 3 para div");
        System.out.println("digite 3 para mult");

        int opc = ler.nextInt();
        int opcRetorn = 0;

        switch (opc) {
            case 1:

                calc.SomaDoisNum(num1, num2);
                break;

            case 2:

                calc.SubDoisNum(num1, num2);
                break;

            case 3:

                calc.DivDoisNum(num1, num2);
                break;

            case 4:

                calc.MultDoisNum(num1, num2);
                break;


        }
        }
    }
