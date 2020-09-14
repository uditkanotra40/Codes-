class Intersect
{
	int intersectPoint(Node headA, Node headB)
	{
	    int len1=length(headA);
	    int len2=length(headB);
	    while(len1>len2)
	    {
	        headA=headA.next;
	        len1--;
	    }
	    while(len1<len2)
	    {
	        headB=headB.next;
	        len2--;
	    }
	    while(headA!=headB)
	    {
	        headA=headA.next;
	        headB=headB.next;
	    }
	    return headA.data;
         // code here
	}
	static int length(Node node)
	{
	    int count=0;
	    while(node!=null)
	    {
	        node=node.next;
	        count++;
	    }
	    return count;
	}
}
