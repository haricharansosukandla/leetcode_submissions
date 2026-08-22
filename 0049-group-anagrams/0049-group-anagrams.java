class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      Map<String, List<String>> map = new HashMap<>();

     for(String s:strs)
     {
        char[] a=s.toCharArray();
        Arrays.sort(a);
        String key = new String(a);
        
      List<String> list = new ArrayList<>();
      if(!map.containsKey(key))
      {
        map.put(key, list);
      }
      map.get(key).add(s);
        }

    return new ArrayList<>(map.values());
    }
}
