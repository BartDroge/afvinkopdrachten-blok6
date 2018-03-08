/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blok6afvink4;

import java.util.ArrayList;

/**
 *
 * @author Bartdroge
 */


    class Node {

        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    class BinaryTree {
        // Root of Binary Tree

        Node root;

        BinaryTree() {
            root = null;
        }

        /* Given a binary tree, print its nodes according to the
      "bottom-up" postorder traversal. */
        void printPostorder(Node node) {
            if (node == null) {
                return;
            }

            // first recur on left subtree
            printPostorder(node.left);

            // then recur on right subtree
            printPostorder(node.right);

            // now deal with the node
            System.out.print(node.key + " ");
        }

        /* Given a binary tree, print its nodes in inorder*/
        void printInorder(Node node) {
            if (node == null) {
                return;
            }

            /* first recur on left child */
            printInorder(node.left);

            /* then print the data of node */
            System.out.print(node.key + " ");

            /* now recur on right child */
            printInorder(node.right);
        }

        /* Given a binary tree, print its nodes in preorder*/
        void printPreorder(Node node) {
            if (node == null) {
                return;
            }

            /* first print data of node */
            System.out.print(node.key + " ");

            /* then recur on left sutree */
            printPreorder(node.left);

            /* now recur on right subtree */
            printPreorder(node.right);
        }
        void printLevelOrder(Node node){
            
            ArrayList<Node> lijst = new ArrayList<Node>();
            lijst.add(node);
            while(!lijst.isEmpty()){
                
            Node curNode = lijst.remove(0);
            
            if (curNode.left != null){
                lijst.add(curNode.left);
            
                
            }
            if (curNode.right != null){
                lijst.add(curNode.right);
            
                
            }
                System.out.print(curNode.key+" ");
            
            }
            
        }

        // Wrappers over above recursive functions
        void printPostorder() {
            printPostorder(root);
        }

        void printInorder() {
            printInorder(root);
        }

        void printPreorder() {
            printPreorder(root);
        }
        void printLevelOrder(){
            printLevelOrder(root);
            
        
        }
    
        // Driver method
        public static void main(String[] args) {
            BinaryTree tree = new BinaryTree();
            tree.root = new Node(1);
            tree.root.left = new Node(2);
            tree.root.right = new Node(3);
            tree.root.left.left = new Node(4);
            tree.root.left.right = new Node(5);

            System.out.println("Preorder traversal of binary tree is ");
            tree.printPreorder();

            System.out.println("\nInorder traversal of binary tree is ");
            tree.printInorder();

            System.out.println("\nPostorder traversal of binary tree is ");
            tree.printPostorder();
            
            System.out.println("\nLevelorder traversal of binary tree is ");
            tree.printLevelOrder();
        }
    }

/*
opdraht 3:
a)  a: 12
    t:
    g:
    c:
*/