package problem1.main;
import problem1.mybst.MyBinarySearchTree;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        Scanner scanner = new Scanner(System.in);
        // taking only 7 inputs for simple demonstration
        int i = 7;
        while(i>0){
            tree.add(scanner.nextInt());
            i--;
        }
        //input order is 4,2,1,3,6,5,7
        /*tree looks like
                    4
                  /  \
                2      6
               / \    / \
              1   3  5   7
           */
        tree.printLeftChild();
        System.out.println(MyBinarySearchTree.noLeftCounter);
    }
}
