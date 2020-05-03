class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote==null || magazine==null)return false;
        int[] count= new int[27];
        for(int i=0;i<magazine.length();i++){
            count[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            if(count[ransomNote.charAt(i)-'a']>0){
                count[ransomNote.charAt(i)-'a']--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
