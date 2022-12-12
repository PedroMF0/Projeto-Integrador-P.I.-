package Aula1;
import java.util.Scanner;
public class ProjetoIntegrador {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int menu, idade, notificacoes, assinatura, pagamento, livros;
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
                        break;
                    case 2:
                        System.out.println("Pagamento mensal de 40 reais ou trimestral de 50 reais");
                        System.out.println("Você receberá desconto em obras não-ficcionais!");
                        System.out.println("Você receberá 2 livros não-ficcionais surpresa durante o período de assinatura!");
                        break;
                    case 3:
                        System.out.println("Você não assinou nenhum pacote!");
                        break;
                    default: 
                        while(assinatura != 1 && assinatura != 2 && assinatura != 3){
                                System.out.print ("Por favor digite uma opção válida: ");
                                assinatura = read.nextInt();
                                }    
                    
                }             
                
                  
             case 2:
                System.out.println("===============");
                System.out.println("     Livros    ");
                System.out.println("===============");
                System.out.println("[1] Harry Potter;");
                System.out.println("[2] Senhor dos Anéis; ");
                System.out.println("[3] As Crônicas de Nárnia;");
                System.out.println("[4] Percy Jackson;");
                System.out.println("[5] Duna;");
                System.out.println("[6] Arte da Guerra;");
                System.out.println("[7] Diário de Anne Frank;");
                System.out.println("[8] Autobiografia de Malcom x;");
                System.out.println("[9] As obras completas de Platão;");
                System.out.println("[10] A interpretação dos Sonhos;");
                System.out.println("===============");
                System.out.print(" => Qual a sua opção? ");
                livros = read.nextInt();
                
                switch(livros){
                    case 1:
                        System.out.println("Você selecionou Harry Potter!");
                        System.out.println("================");
                        System.out.println("    Pagamento   ");
                        System.out.println("================");
                        System.out.println("[1] Cartão de crédito;");
                        System.out.println("[2] Cartão de débito; ");
                        System.out.println("[3] Pix;");
                        System.out.println("===============");
                        System.out.print(" => Qual a sua opção? ");
                        pagamento = read.nextInt();
                            while(pagamento !=1 && pagamento != 2 && pagamento!=3){
                                System.out.print("Por favor digite uma opção válida: ");
                                pagamento = read.nextInt();
                            }
                        System.out.println("Parabéns compra efetuada com sucesso!");
                        break;
                    case 2:
                        System.out.println("Você selecionou Senhor dos Anéis!");
                        System.out.println("================");
                        System.out.println("    Pagamento   ");
                        System.out.println("================");
                        System.out.println("[1] Cartão de crédito;");
                        System.out.println("[2] Cartão de débito; ");
                        System.out.println("[3] Pix;");
                        System.out.println("===============");
                        System.out.print(" => Qual a sua opção? ");
                        pagamento = read.nextInt();
                            while(pagamento !=1 && pagamento != 2 && pagamento!=3){
                                System.out.print("Por favor digite uma opção válida: ");
                                pagamento = read.nextInt();
                            }
                        System.out.println("Parabéns compra efetuada com sucesso!");
                        break;
                    case 3:
                        System.out.println("Você selecionou As Crônicas de Nárnia!");
                        System.out.println("================");
                        System.out.println("    Pagamento   ");
                        System.out.println("================");
                        System.out.println("[1] Cartão de crédito;");
                        System.out.println("[2] Cartão de débito; ");
                        System.out.println("[3] Pix;");
                        System.out.println("===============");
                        System.out.print(" => Qual a sua opção? ");
                        pagamento = read.nextInt();
                            while(pagamento !=1 && pagamento != 2 && pagamento!=3){
                                System.out.print("Por favor digite uma opção válida: ");
                                pagamento = read.nextInt();
                            }
                        System.out.println("Parabéns compra efetuada com sucesso!");
                        break;
                    case 4: 
                         System.out.println("Você selecionou Percy Jackson!");
                        System.out.println("================");
                        System.out.println("    Pagamento   ");
                        System.out.println("================");
                        System.out.println("[1] Cartão de crédito;");
                        System.out.println("[2] Cartão de débito; ");
                        System.out.println("[3] Pix;");
                        System.out.println("===============");
                        System.out.print(" => Qual a sua opção? ");
                        pagamento = read.nextInt();
                            while(pagamento !=1 && pagamento != 2 && pagamento!=3){
                                System.out.print("Por favor digite uma opção válida: ");
                                pagamento = read.nextInt();
                            }
                        System.out.println("Parabéns compra efetuada com sucesso!");
                        break;
                    case 5:
                        System.out.println("Você selecionou Duna!");
                        System.out.println("================");
                        System.out.println("    Pagamento   ");
                        System.out.println("================");
                        System.out.println("[1] Cartão de crédito;");
                        System.out.println("[2] Cartão de débito; ");
                        System.out.println("[3] Pix;");
                        System.out.println("===============");
                        System.out.print(" => Qual a sua opção? ");
                        pagamento = read.nextInt();
                            while(pagamento !=1 && pagamento != 2 && pagamento!=3){
                                System.out.print("Por favor digite uma opção válida: ");
                                pagamento = read.nextInt();
                            }
                        System.out.println("Parabéns compra efetuada com sucesso!");
                        break;
                    case 6:
                        System.out.println("Você selecionou Arte da Guerra!");
                        System.out.println("================");
                        System.out.println("    Pagamento   ");
                        System.out.println("================");
                        System.out.println("[1] Cartão de crédito;");
                        System.out.println("[2] Cartão de débito; ");
                        System.out.println("[3] Pix;");
                        System.out.println("===============");
                        System.out.print(" => Qual a sua opção? ");
                        pagamento = read.nextInt();
                            while(pagamento !=1 && pagamento != 2 && pagamento!=3){
                                System.out.print("Por favor digite uma opção válida: ");
                                pagamento = read.nextInt();
                            }
                        System.out.println("Parabéns compra efetuada com sucesso!");
                        break;
                    case 7:
                        System.out.println("Você selecionou Diário de Anne Frank!");
                        System.out.println("================");
                        System.out.println("    Pagamento   ");
                        System.out.println("================");
                        System.out.println("[1] Cartão de crédito;");
                        System.out.println("[2] Cartão de débito; ");
                        System.out.println("[3] Pix;");
                        System.out.println("===============");
                        System.out.print(" => Qual a sua opção? ");
                        pagamento = read.nextInt();
                            while(pagamento !=1 && pagamento != 2 && pagamento!=3){
                                System.out.print("Por favor digite uma opção válida: ");
                                pagamento = read.nextInt();
                            }
                        System.out.println("Parabéns compra efetuada com sucesso!");
                        break;
                    case 8: 
                        System.out.println("Você selecionou Autobiografia de Malcom X!");
                        System.out.println("================");
                        System.out.println("    Pagamento   ");
                        System.out.println("================");
                        System.out.println("[1] Cartão de crédito;");
                        System.out.println("[2] Cartão de débito; ");
                        System.out.println("[3] Pix;");
                        System.out.println("===============");
                        System.out.print(" => Qual a sua opção? ");
                        pagamento = read.nextInt();
                            while(pagamento !=1 && pagamento != 2 && pagamento!=3){
                                System.out.print("Por favor digite uma opção válida: ");
                                pagamento = read.nextInt();
                             }   
                        System.out.println("Parabéns compra efetuada com sucesso!");
                        break;
                    case 9:
                        System.out.println("Você selecionou As Obras completas de Platão!");
                        System.out.println("================");
                        System.out.println("    Pagamento   ");
                        System.out.println("================");
                        System.out.println("[1] Cartão de crédito;");
                        System.out.println("[2] Cartão de débito; ");
                        System.out.println("[3] Pix;");
                        System.out.println("===============");
                        System.out.print(" => Qual a sua opção? ");
                        pagamento = read.nextInt();
                            while(pagamento !=1 && pagamento != 2 && pagamento!=3){
                                System.out.print("Por favor digite uma opção válida: ");
                                pagamento = read.nextInt();
                            }
                        System.out.println("Parabéns compra efetuada com sucesso!");
                        break;
                    case 10:
                        System.out.println("Você selecionou A Interpretação dos Sonhos!");
                        System.out.println("================");
                        System.out.println("    Pagamento   ");
                        System.out.println("================");
                        System.out.println("[1] Cartão de crédito;");
                        System.out.println("[2] Cartão de débito; ");
                        System.out.println("[3] Pix;");
                        System.out.println("===============");
                        System.out.print(" => Qual a sua opção? ");
                        pagamento = read.nextInt();
                            while(pagamento !=1 && pagamento != 2 && pagamento!=3){
                                System.out.print("Por favor digite uma opção válida: ");
                                pagamento = read.nextInt();
                            }
                        System.out.println("Parabéns compra efetuada com sucesso!");
                        break;
                    default:
                        while(livros != 1 && livros!=2 && livros !=3 && livros != 4 && livros!=5 && livros !=6 && livros !=7 && livros !=8 && livros !=9 && livros !=10){
                                System.out.print("Por favor digite uma opção válida: ");
                                livros = read.nextInt();
                                }    
                }
                 
                 
         }
    }
    
}

