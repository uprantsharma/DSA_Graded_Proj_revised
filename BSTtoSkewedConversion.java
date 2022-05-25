package com.bsttoskewed.answer2;

//import java.io.*;

//Binary Search Tree conversion to Skewed Tree

public class BSTtoSkewedConversion {

	// making root node BST and Skewed

	static Node rootOfBST;
	static Node rootOfSkewedTree;

	// Constructor
	public BSTtoSkewedConversion(Node root) {
		this.rootOfBST = root;
	}

	// Recursive method to find ascending order of nodes and store to skewed tree
	public static void convert(Node BST_root) {
		if (BST_root == null)
			return;
		else {
			// Recursive for left node
			convert(BST_root.left);
			// Creating new node using value of BST node
			Node newNode = getNewNode(BST_root.data);
			Node x = rootOfSkewedTree;
			Node current_parent = null;
			// finding the empty right node of skewed tree
			while (x != null) {
				current_parent = x;
				x = x.right;
			}

			if (current_parent == null) {
				// current_parent= newNode;
				rootOfSkewedTree = newNode;
			} 
			// right node to be store in BST node
			else
			{
				current_parent.right = newNode;
			}
			
			// recursive call for right nodes of BST
			convert(BST_root.right);
		}
	}

            // pre-order traversal code for any of tree with root as input
	public static void preOrder(Node root) {
		if (root == null)
			return;
		else {
			System.out.print(root.data + "  ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

// method to get a new node with given value
	public static Node getNewNode(int value) {
		Node newNode = new Node(value);
		return newNode;
	}

// Convert function and prints in-order traversal of right skewed root
	public void conversion() {
		convert(rootOfBST);
		System.out.println("\n \nPrinting the pre-order traversal of Skewed tree................");
		preOrder(rootOfSkewedTree);
	}
}