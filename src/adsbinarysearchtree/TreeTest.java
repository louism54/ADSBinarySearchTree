/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adsbinarysearchtree;

/**
 *
 * @author K00215698
 */
// Class TreeTest definition
public class TreeTest
{

    public static void main(String args[])
    {
        Tree tree = new Tree();
        int intVal;

        System.out.println("Inserting the following values: ");

        for (int i = 1; i <= 10; i++)
        {
            intVal = (int) (Math.random() * 100);
            System.out.print(intVal + " ");
            tree.insertNode(intVal + "");
        }
        System.out.println("\n\nPreorder traversal");
        tree.preorderTraversal();

        System.out.println("\n\nInorder traversal");
        tree.inorderTraversal();

        System.out.println("\n\nPostorder traversal");
        tree.postorderTraversal();
        System.out.println();
        System.exit(0);
    }
}
