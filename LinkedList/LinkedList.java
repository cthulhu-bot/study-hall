// To Run
// javac -d ./ *.java
// java -cp ${classpath} *.class

package wolverine;
import wolverine.Node;

public class LinkedList {

  static Node head;
  static Node tail;

  public LinkedList(String initalLabel) {
    Node head = new Node(initalLabel);

    this.head = head;
    this.tail = head;
  }

  public void add(String label) {

    Node node = new Node(label);
    this.tail.next = node;
    this.tail = node;

  }

  public void traverse() {
    // get head node
    // get next node
    for(Node n=this.head; n != null; n=n.next) {
      System.out.print(n.label + " -> ");
    }
  }
}
