package leetcode.bit;

public class HammingDistance_461 {

	public int hammingDistance(int x, int y) {
        int dist=0;
        int xor = x^y;
        
        String binaryS = Integer.toBinaryString(xor);
        /*for(int i=0;i<binaryS.length();i++) {
            if(binaryS.charAt(i)=='1')
                dist++;
        }*/
        
        for(int i=0;i<32;i++) {
            dist += (xor>>i)&1;
        }
        
        return dist;
    }
}
