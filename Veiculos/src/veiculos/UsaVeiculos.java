package veiculos;

import java.util.Scanner;

public class UsaVeiculos {    
    public static void main(String[] args) {
        String carga; 
        String cor;
        String tipo;
        int quantidade;              
        double capacidade;
        
        System.out.println("Informe Quantidade de veiculos");
        Scanner src = new Scanner(System.in);
        int veiculo = src.nextInt();
        Veiculo[] Veiculos = new Veiculo[veiculo];
        
        for(int i=0; i < Veiculos.length; i++){
            System.out.println("Escolha veiculo desejado");
            System.out.println("\n1.Carro \n 2.Trem \n 3.Barco \n Avião");
            Scanner num = new Scanner(System.in);
            int opc = num.nextInt();
                switch(opc){
                    case 1 : 
                      //(carga, cor, tipo, quantidade, capacidade);
                        Scanner valor = new Scanner(System.in);
                        System.out.println("Carga para Carro");
                        carga = valor.next();
                        System.out.println("Cor do Carro");
                        cor = valor.next();                     
                        System.out.println("Quantidade de pessoas");
                        quantidade = valor.nextInt();
                        System.out.println("Quantidade do valor de capacidade maxima");
                        capacidade = valor.nextDouble();
                        Veiculos[i] = new Carro(carga,cor, "carro", quantidade, capacidade);
                        break;
                    case 2 : 
                        System.out.println("Valores para Trem");
                        Scanner x = new Scanner(System.in);
                        System.out.println("Carga para Carro");
                        carga = x.next();
                        System.out.println("Cor do Carro");
                        cor = x.next();                     
                        System.out.println("Quantidade de pessoas");
                        quantidade = x.nextInt();
                        System.out.println("Quantidade do valor de capacidade maxima");
                        capacidade = x.nextDouble();
                        Veiculos[i] = new Trem(carga, cor, "carro", quantidade, capacidade);
                        break;
                        
                    case 3 :
                        System.out.println("Valore para Barco");
                        Scanner y = new Scanner(System.in);
                        System.out.println("Carga para Carro");
                        carga = y.next();
                        System.out.println("Cor do Carro");
                        cor = y.next();                     
                        System.out.println("Quantidade de pessoas");
                        quantidade = y.nextInt();
                        System.out.println("Quantidade do valor de capacidade maxima");
                        capacidade = y.nextDouble();
                        Veiculos[i] = new Barco(carga, cor, "carro", quantidade, capacidade);
                        break;
                        
                    case 4 :
                        System.out.println("Valores para Avião");
                        Scanner z = new Scanner(System.in);
                        System.out.println("Carga para Carro");
                        carga = z.next();
                        System.out.println("Cor do Carro");
                        cor = z.next();                     
                        System.out.println("Quantidade de pessoas");
                        quantidade = z.nextInt();
                        System.out.println("Quantidade do valor de capacidade maxima");
                        capacidade = z.nextDouble();
                        Veiculos[i] = new Avião(carga, cor, "carro", quantidade, capacidade);
                        break;
                       
                }
                  Veiculos[i].Andar();
        }       
    }

 }

