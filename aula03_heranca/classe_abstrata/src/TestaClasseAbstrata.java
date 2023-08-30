public class TestaClasseAbstrata {
    
        public static void main(String[] args) {
          TelaQuilometragem tk = new TelaQuilometragem();
          tk.imprimir();
      
          System.out.println("\n------------\n");
      
          tk.imprimir();
        }
      }

/*
 * Classe Abstrata	                                Interface
    Pode possui atributos de instância	            Possui apenas constantes
    Possui métodos de diversas visibilidade         Todos os métodos são public
    e métodos implementados ou abstratos	
    É estendida por classes (sub-classes)	        É implementada por classes
    Uma subclasse só pode estender uma              Uma classe pode implementar mais de uma interface
    única classe abstrata	
    Hierarquia de herança com outras                Hierarquia de herança com outras interfaces
    classes abstratas	
 * 
 */