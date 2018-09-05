package wolverine;
import wolverine.LinkedList;

public class main {
  public static void main(String args[]) {
    // Node n1 = new Node("Node 1");
    // Node n2 = new Node("Node 2");
    // Node n3 = new Node("Node 3");

    // n1.next = n2;
    // n2.next = n3;

    LinkedList listyList = new LinkedList("Node 1");
    listyList.add("Node 2");
    listyList.add("Node 3");
    listyList.traverse();

    // System.out.println(listyList.tail.label);
  }
}
