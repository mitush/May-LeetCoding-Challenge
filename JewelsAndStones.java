class Solution {
    public int numJewelsInStones(String J, String S) {
        Map<Character,Boolean> jMap = new HashMap();   
        char[] jC = J.toCharArray();
        char[] sC = S.toCharArray();
        for(int i=0;i<jC.length;i++){
            jMap.put(jC[i],true);
        }
        int ans =0;
        for(int i=0;i<sC.length;i++){
            if(jMap.containsKey(sC[i])){
                ans++;
            }
        }
        return ans;
    }
}
