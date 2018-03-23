package listcharacters;

public class Node {

    //estructura de datos
    /**
     * a public object letter is created
     */
    public char letter;

    /**
     * a public object is created next node
     */
    public Node next;//Sera el apuntador, con mismo tipo de dato de la clase

    public Node() {
    }

    /**
     * a public object is created char node
     */
    public Node(char letter) {
        this.letter = letter;

    }

    /**
     * a throw is created for the error exceptions if in the middle of the
     * execution a parameter is not correct or generates conflict
     *
     * @param a
     */
    Node(String a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * then 4 methods are created one that is to go to estring one to
     * concatenate other than cloning the node if needed, these methods handle a
     * common parameter that is letter which serves to print or concatenate
     * depending on the call
     *
     * @return
     */
    public String toString() {
        return ("" + this.letter);
    }

    public void concadenar() {
        System.out.print(this.letter);

    }

    /**
     *
     * @return
     */
    public Node clone() {
        Node clone = new Node(this.letter);
        return clone;
    }

    String toString(String let) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
