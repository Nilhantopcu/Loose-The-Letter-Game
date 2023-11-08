/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projecttrial;




/**
 *
 * @author sulei
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SingleCircularLinkedList list1 = new SingleCircularLinkedList();

        System.out.println( list1.isEmpty());
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        list1.addNode("John");
        list1.addNode("Tom");
        list1.addNode("Jane");
        list1.addNode("Angela");
        list1.addNode("Elon");
        list1.addNode("Nelson");
        list1.addNode("Albert");
        list1.addNode("William");
        list1.addNode("Marie");
        list1.addNode("Nelson");
        list1.addNode("Frida"); //current data
        
                
       
        list1.printList();
        //System.out.println( list1.getN());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(list1.current.data);
        ///list1.getLastChar(list1.current.data);
        //System.out.println(list1.getLastChar(list1.current.data));
        System.out.println("**************************************************************************************************************************");
       
       list1.game();
       
       
       /*list1.deleteKthPersonLastChar();
        list1.deleteKthPersonLastChar();
        list1.deleteKthPersonLastChar();
        list1.deleteKthPersonLastChar();
        list1.deleteKthPersonLastChar();
        list1.deleteKthPersonLastChar();*/
       
        
        
       
        
    }
    
}
