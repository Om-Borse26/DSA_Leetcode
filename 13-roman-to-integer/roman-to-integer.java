class Solution {
    public int romanToInt(String s) {
        // Map<Character, Integer> map = new HashMap<>();
        // map.put('I', 1);
        // map.put('V', 5);
        // map.put('X', 10);
        // map.put('L', 50);
        // map.put('C', 100);
        // map.put('D', 500);
        // map.put('M', 1000);

        // int integer = map.get(s.charAt(s.length()-1));
        // for(int i=s.length()-2;i>=0;i--){
        //     if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
        //         integer -= map.get(s.charAt(i));
        //     }
        //     else{
        //         integer += map.get(s.charAt(i));
        //     }
        // }
        // return integer;

        int tot = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            if (4 * num < tot) tot -= num;
            else tot += num;
        }
        return tot;
    }
}