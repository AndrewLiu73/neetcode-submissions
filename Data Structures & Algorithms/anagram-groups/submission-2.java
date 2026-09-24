class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String [] original = new String[strs.length];
        List<String> list = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            original[i]= strs[i];
        }
        
        for(int i=0;i<strs.length;i++){
            char [] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            strs[i]= new String(arr);
        }
        HashMap <String,List<String>> map = new HashMap<>();
        for(int i = 0;i<strs.length;i++){
            if(!map.containsKey(strs[i])){
                map.put(strs[i], new ArrayList<>());
            }

            map.get(strs[i]).add(original[i]);

        }
        return new ArrayList<>(map.values());
    }
}