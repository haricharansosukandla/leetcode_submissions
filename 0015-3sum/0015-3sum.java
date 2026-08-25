class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       
        HashSet result = new HashSet<>();
        Arrays.sort(nums);
       
       for(int i=0;i<nums.length;i++)
        { int j=i+1;
        int k= nums.length-1;
            int t=0-nums[i];
            while(j<k)
            {

                if(nums[j]+nums[k]==t){  
                         ArrayList list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                result.add(list);
                j++;
                k--;
                
                }
                else if(nums[j]+nums[k]<t)
                j++;
                else
                k--;
            }
        }
        return new ArrayList<>(result);
       
    }
}
