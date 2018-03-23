package listcharacters;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class List {
/**
     * a head node is created that is equal to null
     */
    Node head = null;
    static String let = "";
 /**
     * the following function validates the status of the list depending on
     * whether it is empty or full, a Boolean data type returns
     *
     * @return
     */
    public boolean isEmpty() {
        return head == null ? true : false;
    }
/**
     * a method is created that positions a data at the beginning of the list,
     * always aiming everything so as not to lose any element of the list
     *
     * @param newNode
     */
    public void InsertAtBegin(Node newNode) {
        newNode.next = head;
        head = newNode;
    }
/**
     * in this a while conditional is used to move through the list every
     * temporary node goes to the to sting method, it is printed and then it
     * changes to the next position and so it prints the whole list
     *
     * @throws IOException
     */
    public void print() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            Node temp = head;
            while (temp != null) {
                bw.write("\n"+temp.toString());//
                temp = temp.next;
                bw.flush();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
/**
     * the index of the node to be obtained is used as the input parameter, the
     * list is traversed to the desired index and the requested node returns
     *
     * @param index
     * @return
     */
    public Node getNode(int index) {
        if (listSize() < index) {
            return null;
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        }
    }
 /**
     * the list is traversed and for every node that is passed, a counter is
     * incremented, which at the end of the list returns the size of this
     *
     * @return
     */
    public int listSize() {
        int counter = 0;
        Node temp = head;

        while (temp != null) {
            counter += 1;
            temp = temp.next;
        }
        return counter;
    }
/**
 * a temporary node and an empty string are created, by means of a while loop
 * the entire list is traversed and the to char method is used to pass each 
 * element to a string and then that element begins to be added to the rest
 * of the nodes while the cycle travels all
 * 
 * @return 
 */
    public String concatenar() {
        Node temp = head;
        String let = "";

        while (temp != null) {
            let = (temp.toString() + let);//
            temp = temp.next;
        }

        return (let);
    }
/**
 * to make the substring the index is requested by where the chain is to be 
 * split and through a for cycle it is traced to that index implying the 
 * elements of the substring
 * @param x
 * @throws IOException 
 */
    public void subCadena(int x) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            Node temp = head;
            for (int i = 0; i < x ; i++) {

                System.out.print(temp.toString());//
                temp = temp.next;
              
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    /**
     * o search for the element, you pass as a parameter what you want to 
     * search, the whole list is searched for that element and if it contains 
     * the element at some point in the list that element is found as a counter
     * goes up and depending on the number of the counter returns false or true
     * @param x
     * @return
     * @throws IOException 
     */
    public boolean contiene(int x) throws IOException {
        Node temp = head;
        int counter=0;
        while (temp != null) {
            if (temp.equals(x)) {
                counter+=1;
                 temp = temp.next;
            }
            temp = temp.next;
        }
        if (counter>=1) {
            return true;
        }else{
        return false;
        }
    }
/**
 * in the main two lists are created and each of the functions of the lists is
 * started to be tested by implementing the String class which in this case we 
 * can see as size, concatenate, substring and if it contains elemnto
 * @param args
 * @throws IOException 
 */
    public static void main(String[] args) throws IOException {

        List characters = new List();
         List charactersin = new List();
        characters.InsertAtBegin(new Node('A'));
        characters.InsertAtBegin(new Node('B'));
        characters.InsertAtBegin(new Node('C'));
        characters.InsertAtBegin(new Node('D'));
        characters.InsertAtBegin(new Node('E'));
        characters.InsertAtBegin(new Node('F'));
        characters.InsertAtBegin(new Node('G'));
        characters.InsertAtBegin(new Node('H'));

        characters.print();
        System.out.println("\n-------tamaño-------");
        System.out.println("\nel tamaño de la lista es " + characters.listSize());
        System.out.println("\n------concadenar--------");
        System.out.print(characters.concatenar());
        System.out.println("\n--------subcadena--------");
        characters.subCadena(3);
        System.out.println("\n--------partir por algun caracter----");
         charactersin.InsertAtBegin(new Node('A'));
        charactersin.InsertAtBegin(new Node('B'));
        charactersin.InsertAtBegin(new Node(' '));
        charactersin.InsertAtBegin(new Node('D'));
        charactersin.InsertAtBegin(new Node('E'));
        charactersin.InsertAtBegin(new Node(' '));
        charactersin.InsertAtBegin(new Node('G'));
        charactersin.InsertAtBegin(new Node('H'));
        charactersin.print();
        System.out.println("\n---------------");
        
        System.out.println(let.split(" "));
        System.out.println("\n--------contiene un elemento-------------");
        System.out.println(charactersin.contiene('L'));
 
    }

}
