class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer,Integer> map = new HashMap();
    for(int i : nums)
    {
        if(map.containsKey(i))
        {
            map.put(i,map.get(i)+1);
        }
        else
        map.put(i,1);
    }
    int result[] =new int[k];
    for(int i=0;i<k;i++)
    {
        int maxfreq=0;
        int maxelement=0;
          for (int x : map.keySet()) {

                if (map.get(x) > maxfreq) {
                    maxfreq = map.get(x);
                    maxelement = x;
                }
            }
            result[i] = maxelement;
            map.remove(maxelement);
    }
    return result;
    }
}
