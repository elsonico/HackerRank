	public static int getHeight(Node root){
      //Write your code here
        if(root == null) {
            return -1;
        }
        else{
            int leftDepth  = 1 + getHeight(root.left);
            int rightDepth = 1 + getHeight(root.right);

            return (leftDepth > rightDepth ? leftDepth : rightDepth ) ;
        }

    }
