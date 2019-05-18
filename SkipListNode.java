public class SkipListNode
{
  public double key;

  public int pos;      

  public SkipListNode up, down, left, right;

  public SkipListNode(double k) 
  { 
     key = k;

     up = down = left = right = null;
  }
   public Double getKey() 
  {
	   return key; 
  }
}
