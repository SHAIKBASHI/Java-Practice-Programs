package com.version1;

import java.util.Scanner;

public class printAnand {
	
	
	
//	 void printU() {
//			//printU
//			for(int i=0;i<=6;i++) {
//				for(int j=0;j<=6;j++) {
//					
//					if((j == 0 || j == 6  )|| i == 6) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					
//				}
//			}
//				System.out.println();
//				}
//			System.out.println();
//			}
//	 void printH() {
//			//printU
//			for(int i=0;i<=6;i++) {
//				for(int j=0;j<=6;j++) {
//					
//					if((j == 0 || j == 6  )|| i == 3) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					
//				}
//			}
//				System.out.println();
//				}
//			System.out.println();
//			}
//	 void printG() {
//			//printU
//			for(int i=0;i<=6;i++) {
//				for(int j=0;j<=6;j++) {
//					
//					if(i == 0 
//				               || i == 6 
//				               || j == 0 
//				               || (i == 3 && j >= 3) 
//				               || (j == 6 && i >= 3)) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					
//				}
//			}
//				System.out.println();
//				}
//			System.out.println();
//			}
//	
//		
////   //print a
////		for(int i=0;i<=6;i++) {
////			for(int j=0;j<=6;j++) {
////			if(i==3 ||((j==0 || j==6) && i!=0 ) || (i==0 && j!=0 && j!=6)) {
////				System.out.print("*");
////			}else 
////			{
////				System.out.print(" ");
////			}
////			}
////		}
////		System.out.println();
////	}
//		
//				
//				void printA() {
//				
//				//print A
//				for(int i=0;i<=6;i++) {
//					for(int j=0;j<=6;j++) {
//						if(i==3 || ((j==0 || j==6)&&i!=0) || (i==0 && j!=0 && j!=6)) {
//							System.out.print("*");
//						}
//						else {
//							System.out.print(" ");
//						}
//					}
//					System.out.println();
//				}
//			System.out.println();
//			System.out.println();
//				}
//				void printN() {
//				//print n
//				for(int i=0;i<=6;i++) {
//					for(int j=0;j<=6;j++) {
//						if(j==0||j==6||i==j) {
//							System.out.print("*");
//						}else {
//							System.out.print(" ");
//						
//					}
//				}
//					System.out.println();
//					}
//				System.out.println();
//				System.out.println();
//}
//				void printD() {
//				//printD
//				for(int i=0;i<=6;i++) {
//					for(int j=0;j<=6;j++) {
//						if(j==0||(j==6&& i!=0 && i!=6)||((i==0 || i==6)&& j!=6)) {
//							System.out.print("*");
//						}else {
//							System.out.print(" ");
//						
//					}
//				}
//					System.out.println();
//					}
//}
//				void printE() {
//				
//				//Print E
//				for(int i=0;i<=6;i++) {
//					for(int j=0;j<=6;j++) {
//						if(j==0 ||i==0 || i==6 || i==3 &&( j!=6 && i!=6 && j!=6)) {
//							System.out.print("*");
//						}else {
//							System.out.print(" ");
//						
//					}
//				}
//					System.out.println();
//					}
//}
//				void printB() {
//				//Print B
//				for(int i=0;i<=6;i++) {
//					for(int j=0;j<=6;j++) {
//						 if(j == 0 || 
//						           (i == 0 && j != 6) || 
//						           (i == 3 && j != 6) || 
//						           (i == 6 && j != 6) || 
//						           (j == 6 && (i != 0 && i != 3 && i != 6))) {
//							System.out.print("*");
//						}else {
//							System.out.print(" ");
//						
//					}
//				}
//					System.out.println();
//					}
//}
//				void printF() {
//				//Print F
//				for(int i=0;i<=6;i++) {
//					for(int j=0;j<=6;j++) {
//						 if(j == 0 || 
//						           (i == 0 && j != 6) || 
//						           (i == 3 && j != 4&&  j!=5&& j!=6) ) {
//							System.out.print("*");
//						}else {
//							System.out.print(" ");
//						
//					}
//				}
//					System.out.println();
//					}
//}
//				void printI() {
//				//Print I
//				for(int i=0;i<=6;i++) {
//					for(int j=0;j<=6;j++) 
//					{
//						 if((i == 0 || i== 6)|| j==3) 
//						 {
//							System.out.print("*");
//						} else 
//						  {
//							System.out.print(" ");
//						
//					      }
//				     }
//					System.out.println();
//					}
//}
//				void printJ() {
//				//Print J
//				for(int i=0;i<=6;i++) {
//					for(int j=0;j<=6;j++) 
//					{
//						 if((i == 0 || j==3||i==6 )&&(j!=4 &&j!=5 &&j!=6 || i==0) )
//						 {
//							System.out.print("*");
//						} else 
//						  {
//							System.out.print(" ");
//						
//					      }
//				     }
//					System.out.println();
//					}
//}
//				void printK() {
//				//Print K
//				for(int i=0;i<=6;i++) {
//					for(int j=0;j<=6;j++) 
//					{
//						 if(j== 0  || i+j==3|| i-j==3)
//						 {
//							System.out.print("*");
//						} else 
//						  {
//							System.out.print(" ");
//						
//					      }
//				     }
//					System.out.println();
//					
//					}
//				System.out.println();}
//				void printL() {
//				//Print L
//				for(int i=0;i<=6;i++) {
//					for(int j=0;j<=6;j++) 
//					{
//						 if(j== 0  ||i==6)
//						 {
//							System.out.print("*");
//						} else 
//						  {
//							System.out.print(" ");
//						
//					      }
//				     }
//					System.out.println();
//					}
//}
//				void printM() {
//				//Print M
//				for(int i=0;i<=6;i++) {
//					for(int j=0;j<=6;j++) 
//					{
//						 if(j== 0  ||j==6|| i==j &&i<=3 ||i+j==6 &&i<=3)
//						 {
//							System.out.print("*");
//						} else 
//						  {
//							System.out.print(" ");
//						
//					      }
//				     }
//					System.out.println();
//					}
//				}
//				void printO() {
//				//printO
//				for(int i=0;i<=6;i++) {
//					for(int j=0;j<=6;j++) {
//						if(j==0||i==6||i==0||j==6) {
//							System.out.print("*");
//						}else {
//							System.out.print(" ");
//						
//					}
//				}
//					System.out.println();
//					}
//				System.out.println();
//				}
//				void printP() {
//				//Print P
//				for(int i=0;i<=6;i++) {
//					for(int j=0;j<=6;j++) {
//						 if(j == 0 || (i==0)||
//						            (i==3)||
//						          
//						          
//						           (j == 6 && ( i != 4 && i != 5 && i != 6)))  {
//							System.out.print("*");
//						}else {
//							System.out.print(" ");
//						
//					}
//				}
//					System.out.println();
//					}
//				System.out.println();
//				}
//				void printR() {
//				//Print R
//				for(int i=0;i<=6;i++) {
//					for(int j=0;j<=6;j++) {
//						 if(j == 0 
//						           || (i == 0 && j != 6) 
//						           || (i == 3 && j != 6) 
//						           || (j == 6 && i != 0 && i != 3 && i < 3) 
//						           || (i == j && i >= 3))  {
//							System.out.print("*");
//						}else {
//							System.out.print(" ");
//						
//					}
//				}
//					System.out.println();
//					}
//				System.out.println();
//}
//				void printQ() {
//				//printO
//				for(int i=0;i<=6;i++) {
//					for(int j=0;j<=6;j++) {
//						if(j == 0 || j == 6 || i == 0 || i == 6 || (i == j && i >= 4)) {
//							System.out.print("*");
//						}else {
//							System.out.print(" ");
//						
//					}
//				}
//					System.out.println();
//					}
//				System.out.println();
//}
//				void printX() {
//				//printX
//				for(int i=0;i<=6;i++) {
//					for(int j=0;j<=6;j++) {
//						if(i+j==6||i==j) {
//							System.out.print("*");
//						}else {
//							System.out.print(" ");
//						
//					}
//				}
//					System.out.println();
//					}
//				System.out.println();
//}
//				void printY() {
//				//printY
//				for(int i=0;i<=6;i++) {
//					for(int j=0;j<=6;j++) {
//				        if((i == j && i <= 3) || (i + j == 6 && i <= 3) || (j == 3 && i >= 3)) {
//				            System.out.print("*");
//				        } 
//				       
//                       else {
//							System.out.print(" ");
//						
//					}
//				}
//					System.out.println();
//					}
//				System.out.println();
//				}
//				void printV() {
//				//printV
//				for(int i=0;i<=6;i++) {
//					for(int j=0;j<=6;j++) {
//						if((i == j && i <= 3) || (i + j == 6 && i <= 3)) {
//				            System.out.print("*");
//				        }
//				        else if(i == 3 && j == 3) {
//				            System.out.print("*");
//				        }
//				        else {
//				            System.out.print(" ");
//				        }
//				        }	System.out.println();
//					}
//				System.out.println();
//				}
//				void printW() {
//
//				//printW
//				for(int i=0;i<=6;i++) {
//					for(int j=0;j<=6;j++) {
//						 if(j == 0 || j == 6 || (i >= 3 && i == j) || (i + j == 6 && i >= 3)) {
//					            System.out.print("*");
//					        }
//				        else {
//				            System.out.print(" ");
//				        }
//				        }	System.out.println();
//					}
//				System.out.println();
//}
//				void printZ() {
//				//printZ
//				for(int i=0;i<=6;i++) {
//					for(int j=0;j<=6;j++) {
//						 if(i==0||i==6||j+i==6) {
//					            System.out.print("*");
//					        }
//				        else {
//				            System.out.print(" ");
//				        }
//				        }	System.out.println();
//					}
//				System.out.println();
//}
//				void printC() {
//				//printC
//				for(int i=0;i<=6;i++) {
//					for(int j=0;j<=6;j++) {
//						 if(j==0||i==0||i==6) {
//					            System.out.print("*");
//					        }
//				        else {
//				            System.out.print(" ");
//				        }
//				        }	System.out.println();
//					}
//				System.out.println();
//}
//				void printS() {
//				//printS
//				for(int i=0;i<=6;i++) {
//					for(int j=0;j<=6;j++) {
//						if(i == 0 || i == 3 || i == 6 || (j == 0 && i < 3) || (j == 6 && i > 3)) {
//							System.out.print("*");
//						}else {
//							System.out.print(" ");
//						
//					}
//				}
//					System.out.println();
//					}
//				System.out.println();
//				}
//				
//				void printT() {
//				//Print T
//				for(int i=0;i<=6;i++) {
//					for(int j=0;j<=6;j++) 
//					{
//						 if((i == 0 )|| j==3) 
//						 {
//							System.out.print("*");
//						} else 
//						  {
//							System.out.print(" ");
//						
//					      }
//				     }
//					System.out.println();
//					}
//				}
//				
				
			/////////////////////////////////////////////////////////////////////////////////////////////////
				void printRow(char ch, int i) {

			        for(int j=0;j<=6;j++) {

			        switch(ch) {

			            case 'A': if(i==3 || ((j==0 || j==6)&&i!=0) || (i==0 && j!=0 && j!=6)) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}; break;
			            case 'B':  if(j == 0 || 
						           (i == 0 && j != 6) || 
						           (i == 3 && j != 6) || 
						           (i == 6 && j != 6) || 
						           (j == 6 && (i != 0 && i != 3 && i != 6))) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						
					}; break;
			            case 'C': if(j==0||i==0||i==6) {
				            System.out.print("*");
				        }
			        else {
			            System.out.print(" ");
			        }; break;
			            case 'D': if(j==0||(j==6&& i!=0 && i!=6)||((i==0 || i==6)&& j!=6)) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						
					}; break;
			            case 'E': if(j==0 ||i==0 || i==6 || i==3 &&( j!=6 && i!=6 && j!=6)) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						
					}; break;
			            case 'F':  if(j == 0 || 
						           (i == 0 && j != 6) || 
						           (i == 3 && j != 4&&  j!=5&& j!=6) ) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						
					}; break;
			            case 'H': if((j == 0 || j == 6  )|| i == 3) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						
					}; break;
			            case 'G':if(i == 0 
					               || i == 6 
					               || j == 0 
					               || (i == 3 && j >= 3) 
					               || (j == 6 && i >= 3)) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						
					}; break;
			            case 'I':  if((i == 0 || i== 6)|| j==3) 
						 {
							System.out.print("*");
						} else 
						  {
							System.out.print(" ");
						
					      }; break;
			            case 'J':  if((i == 0 || j==3||i==6 )&&(j!=4 &&j!=5 &&j!=6 || i==0) )
						 {
							System.out.print("*");
						} else 
						  {
							System.out.print(" ");
						
					      }; break;
			            case 'K':  if(j== 0  || i+j==3|| i-j==3)
						 {
							System.out.print("*");
						} else 
						  {
							System.out.print(" ");
						
					      }; break;
			            case 'L': 
							 if(j== 0  ||i==6)
							 {
								System.out.print("*");
							} else 
							  {
								System.out.print(" ");
							
						      }; break;
			            case 'M': if(j== 0  ||j==6|| i==j &&i<=3 ||i+j==6 &&i<=3)
						 {
							System.out.print("*");
						} else 
						  {
							System.out.print(" ");
						
					      }; break;
			            case 'N':if(j==0||j==6||i==j) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						
					}; break;
			            case 'O': if(j==0||i==6||i==0||j==6) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						
					}; break;
			            case 'P': if(j == 0 || (i==0)||
					            (i==3)||
					          
					          
					           (j == 6 && ( i != 4 && i != 5 && i != 6)))  {
						System.out.print("*");
					}else {
						System.out.print(" ");
					
				}; break;
			            case 'Q': if(j == 0 || j == 6 || i == 0 || i == 6 || (i == j && i >= 4)) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						
					}; break;
			            case 'R': if(j == 0 
						           || (i == 0 && j != 6) 
						           || (i == 3 && j != 6) 
						           || (j == 6 && i != 0 && i != 3 && i < 3) 
						           || (i == j && i >= 3))  {
							System.out.print("*");
						}else {
							System.out.print(" ");
						
					}; break;
			            case 'S':if(i == 0 || i == 3 || i == 6 || (j == 0 && i < 3) || (j == 6 && i > 3)) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						
					}; break;
			            case 'T':  if((i == 0 )|| j==3) 
						 {
							System.out.print("*");
						} else 
						  {
							System.out.print(" ");
						
					      }; break;
			            case 'U':if((j == 0 || j == 6  )|| i == 6) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						
					}; break;
			            case 'V': if((i == j && i <= 3) || (i + j == 6 && i <= 3)) {
				            System.out.print("*");
				        }
				        else if(i == 3 && j == 3) {
				            System.out.print("*");
				        }
				        else {
				            System.out.print(" ");
				        }; break;
			            case 'W':  if(j == 0 || j == 6 || (i >= 3 && i == j) || (i + j == 6 && i >= 3)) {
				            System.out.print("*");
				        }
			        else {
			            System.out.print(" ");
			        }; break;
			            case 'X':if(i+j==6||i==j) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						
					}; break;
			            case 'Y':if((i == j && i <= 3) || (i + j == 6 && i <= 3) || (j == 3 && i >= 3)) {
				            System.out.print("*");
				        } 
				       
                       else {
							System.out.print(" ");
						
					}; break;
			            case 'Z':  if(i==0||i==6||j+i==6) {
				            System.out.print("*");
				        }
			        else {
			            System.out.print(" ");
			        }; break;

			            default:
			                System.out.println("Character not supported");
			        }
			        
			        }
			        System.out.print("  ");

			   
			}
			
				public static void main(String[] args) {	
					Scanner sc = new Scanner(System.in);
				    printAnand obj = new printAnand();

				    System.out.println("Enter your name:");
				    String name = sc.nextLine().toUpperCase();

				    for(int i=0;i<=6;i++) {

				        for(char ch : name.toCharArray()) {

				            obj.printRow(ch, i);

				        }

				        System.out.println();
				    }

				    sc.close();
				}
				}
				    
					
					
	


