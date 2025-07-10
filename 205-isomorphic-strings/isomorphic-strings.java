class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] map_string1 = new char[256]; 
        char[] map_string2 = new char[256]; 
        
        for(int i = 0; i < s.length(); i++){
            
            if(map_string1[s.charAt(i)] != 0){
                if(map_string1[s.charAt(i)] != t.charAt(i)){
                    return false;
                }
            } else {
                map_string1[s.charAt(i)] = t.charAt(i);
            }
            
            if(map_string2[t.charAt(i)] != 0){
                if(map_string2[t.charAt(i)] != s.charAt(i)){
                    return false;
                }
            } else {
                map_string2[t.charAt(i)] = s.charAt(i);
            }
        }
        
        return true;
    }
}