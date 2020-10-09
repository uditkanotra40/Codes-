   |        |
   |        |
   |        |
   |     b  |
   |     |  |
   |_____a__|
   Time complexity of insertion and deletion operation is O(1);
   push operation
   
   static node push(Node top,int c)
   {
      Node temp;
      temp.data=x;
      temp.next=top;
      return temp;
   }
   
   static node pop(Node top)
   {
      Node temp=top;
      print(temp);
      top=top.next;
      free(temp);(temp.next=null)
      return top;
   }
