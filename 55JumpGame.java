class Solution {
  public boolean canJump(int[] nums) {
      int n = nums.length;
      int Rechable = 0;
      for(int i=0;i<n;i++)
      {
          
      if(i>Rechable)
      {
              return false;
      }
       Rechable = Math.max(Rechable,i+nums[i]);
       if(Rechable>= nums.length-1)
       {
          return true;
       }
 
      }

      return false;
      
  }
}
