import java.math.*;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger numA = new BigInteger(a,2);
        BigInteger numB = new BigInteger(b,2);
        BigInteger sumAB = numA.add(numB);

        return sumAB.toString(2);
    }
}