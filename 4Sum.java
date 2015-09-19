
import java.util.*;
import java.util.Map.Entry;
public class Solution {
    class Pair{
        int x;
        int y;
        public Pair(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    public void combine(List<Pair> list1, List<Pair> list2, Set<List<Integer>> list, int []nums)
    {
    	for(Pair p1: list1)
    	{
    		for(Pair p2:list2)
    		{
    			if(p1.y<p2.x)
    			{
    				List<Integer> li=new ArrayList();
    				li.add(nums[p1.x]);
    				li.add(nums[p1.y]);
    				li.add(nums[p2.x]);
    				li.add(nums[p2.y]);
    				list.add(li);
    			}
    		}
    	}
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list=new ArrayList();
        if(nums.length<4)
            return list;
        Arrays.sort(nums);
        Hashtable<Integer, List<Pair>> table=new Hashtable();
        for(int i=0; i<nums.length; i++)
        {
        	
            for(int j=i+1; j<nums.length; j++)
            {
            	
                Pair p=new Pair(i, j);
                int sum=nums[i]+nums[j];
                if(table.containsKey(sum))
                {
                    table.get(sum).add(p);
                }
                else
                {
                    List<Pair> li=new ArrayList();
                    li.add(p);
                    table.put(sum, li);
                }
            }
        }       
        Set<Entry<Integer, List<Pair>>> set=table.entrySet();
        Iterator it=set.iterator();
        Set<List<Integer>> se=new HashSet();
        while(it.hasNext())
        {
        	Entry<Integer, List<Pair>> entry=(Entry)it.next();
        	int n1=entry.getKey();
        	int n2=target-n1;
        	if(table.containsKey(n2))
        	{
        		combine(table.get(n1), table.get(n2), se, nums);
        	}
        }
        list.addAll(se);
        return list;
        
    }
}