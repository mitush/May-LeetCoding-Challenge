class Solution {
    public int findComplement(int num) {
        StringBuilder str = new StringBuilder();
        while(num>0){
            int n = num%2;
            str.append((n!=0?0:1)+"");
            num = num/2;
        }
        String s = str.reverse().toString();
        int ans=0;
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            ans+=(s.charAt(i)-'0')*Math.pow(2,n-i-1);
        }
        return ans;
    }
}
