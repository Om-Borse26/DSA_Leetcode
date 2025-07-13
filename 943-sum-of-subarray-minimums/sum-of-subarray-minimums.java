class Solution {
    public int sumSubarrayMins(int[] arr) {

        int len = arr.length, ptr = -1;
        int[] st = new int[len + 1];
        long sum = 0; 

        for( int i = 0; i < len; i++ ){
            
            while( ptr != -1 && arr[i] < arr[st[ptr]] ){
                
                int prevIdx = st[ptr];
                ptr--;
                long ele = arr[prevIdx];
                int prevSmallerIdx = ptr == -1 ? -1 : st[ptr];

                sum  += ele * ( prevIdx - prevSmallerIdx ) * ( i - prevIdx );
                
            }

            st[ ++ptr ] = i;
            
        }

        while( ptr > -1 ){

            int prevIdx = st[ptr];
            ptr--;
            long ele = arr[prevIdx];
            int prevSmallerIdx = ptr == -1 ? -1 : st[ptr]; 
            
            sum +=  ele * ( prevIdx - prevSmallerIdx ) * ( len - prevIdx );
            
        }

        return (int) (sum % 1_000_000_007);
        
    }
}