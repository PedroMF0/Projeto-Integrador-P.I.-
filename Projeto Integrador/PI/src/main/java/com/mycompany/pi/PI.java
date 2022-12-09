package com.mycompany.pi;
import java.util.Scanner;
import java.util.Scanner;

public class PI {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int menu, idade, notificacoes, assinatura;
        String nome, endereco, email;
        double telefone;
         
            System.out.println("===============");
            System.out.println("    Escolha    ");
            System.out.println("===============");
            System.out.println("[1] Cadastrar;");
            System.out.println("[2] Entrar; ");
            System.out.println("[3] Sair;");
            System.out.println("===============");
            System.out.print(" => Qual a sua opção? ");
            menu = read.nextInt();
             
         switch(menu){  
             case 1:
                System.out.print ("Digite seu nome: ");
                nome = read.next();
                System.out.print ("Digite seu endereço: ");
                endereco = read.next();
                System.out.print ("Digite sua idade: ");
                idade = read.nextInt();
                System.out.print ("Digite seu telefone: ");
                telefone = read.nextInt();
                System.out.print ("Digite seu email: ");
                email = read.next();
                
                System.out.print ("Deseja receber notificações em seu email?(Digite 1 para Sim ou 2 para Não) ");
                notificacoes = read.nextInt();
                 if(notificacoes ==1 ){
                     System.out.println("Você receberá notifições em seu emai!");
                 } if(notificacoes == 2){
                     System.out.println("você não receberá noticações em seu email!");
                 } while(notificacoes != 1 && notificacoes != 2){
                     System.out.print("Por favor digite uma opção válida!");
                     System.out.print("\nDigite 1 para Sim ou 2 para Não: ");
                     notificacoes = read.nextInt();
                 }
                 
                System.out.println("===============");
                System.out.println("    Pacotes    ");
                System.out.println("===============");
                System.out.println("[1] Pacote Ficção;");
                System.out.println("[2] Pacote não-ficcional; ");
                System.out.println("[3] Não assinar;");
                System.out.println("===============");
                System.out.print(" => Qual a sua opção? "); 
                assinatura = read.nextInt();
                
                switch(assinatura){
                    case 1:
                        System.out.println("Pagamento mensal de 40 reais ou trimestral de 50 reais");
                        System.out.println("\nVocê receberá desconto em obras de ficção!");
                        System.out.println("\nVoxê receberá 2 livros de ficção surpresa durante o período de assinatura!");
                    case 2:
                        System.out.println("Pagamento mensal de 40 reais ou trimestral de 50 reais");
                        System.out.println("Você receberá desconto em obras não-ficcionais!");
                        System.out.println("Você receberá 2 livros não-ficcionais surpresa durante o período de assinatura!");
                    case 3:
                        System.out.println("Você não assinou nenhum pacote!");
                    default: 
                        while(assinatura != 1 && assinatura != 2 && assinatura != 3){
                                System.out.print ("Por favor digite uma opção válida: ");
                                assinatura = read.nextInt();
                                }    
                    
                }             
                
                  
             case 2:
              
         }
    }
}
