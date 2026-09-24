class Solution {
    public boolean isAnagram(String s, String t) {
        char [] chars = s.toCharArray();
        char [] chars2 = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars2);

        if(chars.length==chars2.length){
            if(Arrays.equals(chars,chars2)){
                return true;
            }
        }
        return false;

    }
}
