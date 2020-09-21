class GFG
{
    static Node construct(int arr[][],int n)
    {
        return construct(arr,0,0,n);
        
        //Add your code here.
    }
    
    
    static Node construct(int[][] matrix,int i,int j,int n)
    {
        if(i<0 || j<0 || i>=n || j>=n)
        {
            return null;
        }
        
        Node temp=new Node(matrix[i][j]);
        temp.right=construct(matrix,i,j+1,n);
        temp.down=construct(matrix,i+1,j,n);
        return temp;
    }
}
