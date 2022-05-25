package com.bsttoskewed.answer2;

public class MainBSTtoSkewed {
	
	public static void main (String[] args)
	{
		//Putting the hard-code value as given in the Question
		

		/* 				5
			 		  /   \
					30	   60	
				   /         \
		         10           55		*/

		
		Node  BSTRoot= new Node (50);
		BSTRoot.left = new Node (30);
		BSTRoot.right = new Node (60);
		BSTRoot.left.left= new Node (10);
		BSTRoot.right.left= new Node (55);
		
		//Creating Object
		
		BSTtoSkewedConversion convertor = new BSTtoSkewedConversion(BSTRoot);
		
		//Printig the BST in Pre-order traversal
		System.out.println("Printig the BST in Pre-order traversal............");
		convertor.preOrder(BSTRoot);
		//Calling function to convert BST to Skewed and print pre-order traversal
		convertor.conversion();
	}
}
	
		