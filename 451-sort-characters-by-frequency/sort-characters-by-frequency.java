class Solution {
    public String frequencySort(String s) {

        int freq[] = new int[128];
        for (int i = 0; i < s.length(); i++) {
                freq[s.charAt(i)]++;
        }

        StringBuilder sb = new StringBuilder();

        while(sb.length() < s.length()){
            int largest = Integer.MIN_VALUE;
            int index = 0;
            
            for (int i = 0; i < freq.length; i++) {
                if(freq[i] > largest){
                    largest = freq[i];
                    index = i;
                }
            }

            for(int i = 0; i < largest; i++){
                sb.append((char)(index));
            }
            freq[index] = 0;
        }

        return sb.toString();

    }
}