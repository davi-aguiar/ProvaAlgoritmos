import java.util.Scanner;

public class provaAlg{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int soma,dividendo,multi,menu,sup,cont,expoente,resultado,number, divisor,resto,quociente;
    double fat=1.0;
   

    System.out.println("Menu \n 1. Fatorial de um número \n 2. Somatório de um número \n 3. Potência de um número \n 4. Divisão de um número por outro \n 5. Multiplicação de um número por outro \n 6. Sair ");
    System.out.println(" Por favor escolha uma das opções acima ");
    menu=scanner.nextInt();

    while(menu!=6){
        if(menu == 1 ){
            System.out.println("Você escolheu o fatorial de um número, por favor informe o número desejado: ");
            number = scanner.nextInt();

                if (number >=0){
                    for(cont=1;cont<=number;cont++){
                        fat = fat * cont;
                    }
                    System.out.println("o fatorial de "+ number + "! é:" + fat);
                }else{
                    System.out.println("Informe um número valido");
                }
            }
            // o somatorio de um número qualquer 5 = 5+4+3+2+1 (lembra o fatorial)
            if(menu==2){
                System.out.println("Você escolheu o somatório de um número, por favor informe o número desejado: ");
                number = scanner.nextInt();
                soma = 0;
                    if(number>0 ){
                        for(cont=1;cont<=number;cont++){
                            soma = soma + cont;
                        }
                     System.out.println("Esse é o somatório do número selecionado " + soma);
        } else {
            System.out.println("Informe valores válidos");
        }
      }   
      if(menu == 3){
        System.out.println("Você escolheu a potência de um número, por favor informe a base ");
        number = scanner.nextInt();

        System.out.println(" por favor informe o expoente ");
        expoente = scanner.nextInt();
        resultado = 1;
        for (cont= expoente;cont>=1; cont--) {
            resultado = resultado * number;
        } 
        System.out.println(number+"^" + expoente+ "é igual a: " + resultado);
     }
      else{
        System.out.println("Informe valores válidos");
     }


    if(menu==4){
        System.out.println(" Você divisão de um número por outro. Por favor, informe o dividendo: ");
        dividendo = scanner.nextInt();

        System.out.println("Informe o divisor");
        divisor = scanner.nextInt();

        sup = dividendo;
        resto = 0;
        quociente = 0;

            if(dividendo>divisor){
                while(dividendo>=divisor){
                    dividendo = dividendo - divisor;
                    resto = dividendo;
                    quociente++;
                }
            } 
              System.out.println(sup + "/" + divisor + " é igual a: " + resto + " e o quociente é : "+ quociente);
        } 
        else{
            System.out.println("Digite valores válidos");
        }
    if(menu == 5){
        
        System.out.println(" Você escolheu a multiplicação de dois números.  Por favor, informe o primeiro número: ");
        number = scanner.nextInt();

        System.out.println(" Você escolheu a multiplicação de dois números.  Por favor, informe o segundo número: ");
        multi = scanner.nextInt();

        resultado = number;

            if(number>0 && multi >0){
                for(cont=1;cont>multi;cont++){
                    number += resultado;
                }
            }
              System.out.println("A multiplicação de "+ resultado + "*"+ multi + "=" + number);
     }
    }
    System.out.println("Obrigado por utilizar o programa");


    scanner.close();
  }
}