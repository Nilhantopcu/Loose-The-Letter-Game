/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecttrial;

import java.util.Random;
import java.util.ArrayList;
/**
 *
 * @author sulei
 */
public class SingleCircularLinkedList {
    public Node current ;
    public Node tail;
    public int N;

    public SingleCircularLinkedList() {
        this.current = null;
        this.tail=null;
        N = 0;
    }
    
    public boolean isEmpty(){ //if N = 0 (No Node), false
    return N == 0;
    
    }
    public void rotate(){
      current = current.next;  
       
    }
    public int getN(){
    return N;
    }
    public void addNode(String data){
        Node newNode = new Node(data);
        newNode.next=tail;
        if(tail==null){
            tail = newNode;
        }else{
        current.next = newNode;
        //newNode = current;
        }
        current= newNode;
        N++;
    }
    
        public void removeIfNoLetterLeft() {
        Node prev = tail;
        current = tail;
        do {
            if (current.data.length() == 0) {
                if (current == tail) {
                    tail = tail.next;
                    prev.next = tail;
                } else {
                    prev.next = current.next;
                }
                N--;
                System.out.println("the rest person in this game :" +  N);
            } else {
                prev = current;
            }
            current = current.next;
        } while (current != tail);
    }
 
        
    public Node deleteKthPersonLastChar(){
        ArrayList<String> namesArrayList = new ArrayList<>();
        Node temp = current;
        for (int i = 0; i < N; i++) {
            namesArrayList.add(temp.data);
            temp = temp.next;
        }
        while (N > 1) {
        while (current.data.length() >0 && N!=0) {
        Random rnd = new Random();
        int k = rnd.nextInt(N)+1;
        
        if(isEmpty()!=true){  
        for (int j = 1; j < k; j++) {
            rotate();
            
        }

        System.out.println("k:" + k);
        System.out.println("The lucky person who selected in list is " + current.data);
        String data = current.data;
        String updatedName = data.substring(0, data.length() - 1);
        current.data = updatedName;
        System.out.println("Changed Name: "+ updatedName);
        
        if (current.data.length() == 0) {
        
        
        
        System.out.println("Kalan isimler:");
        printList();
        removeIfNoLetterLeft();
        System.out.println("///////////////////////////////////////////////////////////////////////////////");
        }
        }
        }
        int winnerIndex = namesArrayList.indexOf(temp.data);
        return getNodeAtIndex(winnerIndex);
        }
        
           
        return null;
        
    }    
        
    private Node getNodeAtIndex(int index) {
        Node temp = tail;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    
    public void game(){ 
        deleteKthPersonLastChar();
    }
        
    
    
    public void printList(){
            if (N == 0) {
            System.out.println("Liste boş.");
            return;
        }
        Node temp = tail;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != tail);
        System.out.println();
        
    }
        
        
    }

