package Jogo;

import java.util.Random;
import java.util.Scanner;

public class Duelo {
   void duelo(Player J1,Player J2){
      
      Scanner entrada = new Scanner(System.in);
      Random sorteia = new Random();
      
      int opcao=0;
       for (int i = 0; i<=19; i++){
              
              System.out.println("----------------------Placar----------------------");
              System.out.println(J1.getNome()+" = "+ J1.vitorias+" vs computador = "+ J2.vitorias);
              System.out.println("----------------------------------------------------");
              
              if (i%2==0) {
               
                  J1.monte[i].exibirCard();
                  System.out.println("Escolha o atributo: ");
                  opcao = entrada.nextInt();
                  switch(opcao){
                      case 1: if (J1.monte[i].pontuacao > J2.monte[i].pontuacao) {
                              System.out.println(J1.getNome()+" Venceu!");
                              J1.vitorias++;
                          }
                      else if (J1.monte[i].pontuacao == J2.monte[i].pontuacao) {
                              System.out.println("Empate.");
                      }
                      else{
                          System.out.println(J1.getNome()+" Perdeu");
                          J2.vitorias++;
                      }break;
                      case 2: if (J1.monte[i].forca > J2.monte[i].forca) {
                              System.out.println(J1.getNome()+" Venceu!");
                              J1.vitorias++;
                          }
                      else if (J1.monte[i].forca == J2.monte[i].forca) {
                              System.out.println("Empate.");
                          }
                      else{
                          System.out.println(J1.getNome()+" Perdeu");
                          J2.vitorias++;
                      }
                      break;
                      case 3: if (J1.monte[i].inteligencia > J2.monte[i].inteligencia) {
                              System.out.println("Venceu!");
                              J1.vitorias++;
                          } 
                      else if (J1.monte[i].inteligencia == J2.monte[i].inteligencia) {
                              System.out.println("Empate");
                          }
                      else{
                          System.out.println(J1.getNome()+" Perdeu");
                      }
                      break;
                      case 4: if (J1.monte[i].resistencia > J2.monte[i].resistencia) {
                              System.out.println(J1.getNome()+"Venceu!");
                              J1.vitorias++;
                          }
                      else if (J1.monte[i].resistencia == J2.monte[i].resistencia) {
                              System.out.println("Empate.");
                          }
                      else{
                          System.out.println(J1.getNome()+"Perdeu.");
                      }
                      break;
                      case 5: if (J1.monte[i].fadiga > J2.monte[i].fadiga) {
                              System.out.println(J1.getNome()+" Venceu!");
                              J1.vitorias++;
                          }break;
                  }
              }
              else{
                  opcao=0;
                  System.out.println("Vez do Computador");
                  
                  opcao = sorteia.nextInt(4)+1;
                  
                  J2.monte[i].exibirCard();
                    System.out.println("Atributo escolhido pelo computador: " + opcao);
                    switch(opcao){
                        case 1 : if (J1.monte[i].pontuacao > J2.monte[i].pontuacao){
                                    System.out.println(J1.getNome() + " venceu....");
                                    J1.vitorias++;
                                 }
                                 else{
                                        if(J1.monte[i].pontuacao == J2.monte[i].pontuacao){
                                            System.out.println("Empate.... ");
                                        }
                                        else{
                                            System.out.println(J1.getNome() + " perdeu...");
                                            J2.vitorias++;
                                        }
                                 }
                                 break;
                  case 2 : if (J1.monte[i].forca > J2.monte[i].forca){
                                    System.out.println(J1.getNome() + " venceu....");
                                    J1.vitorias++;
                                 }
                                 else{
                                    if(J1.monte[i].forca == J2.monte[i].forca){
                                        System.out.println("Empate.... ");
                                    }
                                    else{
                                        System.out.println(J1.getNome() + " perdeu...");
                                        J2.vitorias++;
                                    }
                                }
                                break;
                                case 3 : if (J1.monte[i].inteligencia > J2.monte[i].inteligencia){
                                    System.out.println(J1.getNome() + " venceu....");
                                    J1.vitorias++;
                                 }
                                else{
                                    if(J1.monte[i].inteligencia == J2.monte[i].inteligencia){
                                        System.out.println("Empate.... ");
                                    }
                                    else{
                                        System.out.println(J1.getNome() + " perdeu...");
                                        J2.vitorias++;
                                    }
                                }
                                break;
                                case 4 : if (J1.monte[i].resistencia > J2.monte[i].resistencia){
                                    System.out.println(J1.getNome() + " venceu....");
                                    J1.vitorias++;
                                 }
                                else{
                                    if(J1.monte[i].resistencia == J2.monte[i].resistencia){
                                        System.out.println("Empate.... ");
                                    }
                                    else{
                                        System.out.println(J1.getNome() + " perdeu...");
                                        J2.vitorias++;
                                    }
                                }
                                break;
                                case 5: if (J1.monte[i].fadiga < J2.monte[i].fadiga){
                                    System.out.println(J1.getNome() + " venceu....");
                                    J1.vitorias++;
                                 }
                                else{
                                    if(J1.monte[i].fadiga == J2.monte[i].fadiga){ 
                                        System.out.println("Empate.... ");
                                    }
                                    else{
                                        System.out.println(J1.getNome() + " perdeu...");
                                        J2.vitorias++;
                                    }
                                }
                                break;
                    }
              }
       }
   }
}
                   
