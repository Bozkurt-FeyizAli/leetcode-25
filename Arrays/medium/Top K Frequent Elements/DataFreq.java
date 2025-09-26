import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res= new int[k];

        Map<Integer,Integer>  datass= new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            int ik=nums[i];
            if(datass.containsKey(ik)) continue;
            int f=1;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j]==ik)
                    f++;
            }
            datass.put(ik, datass.get(ik)+1);
        }
        int l2=0;
        int[] freq= new int[datass.size()];
        for (var df : datass.entrySet()) {
            freq[l2]=df.getKey();
            l2++;
        }
        Arrays.sort(freq);
        int l=0;
        for (int i = freq.length-1; i >= freq.length-k; i--) {
            if(l>=k) break;
            l++;
            res[l]=freq[i];
        }


        
        return res;
    }

    
}

public class DataFreq implements Comparable{
        int data;
        int freq;

        DataFreq(int d, int f){
            this.data=d;
            this.freq=f;
        }
        @Override
        public boolean equals(Object obj) {
            if(this.data==((DataFreq)obj).data) return true;
            return false;
        }

        @Override
        public int compareTo(Object arg0) {
        return Integer.compare(this.freq, ((DataFreq)arg0).freq);
        }
    }