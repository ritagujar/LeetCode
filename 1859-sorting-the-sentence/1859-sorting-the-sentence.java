class Solution {
    public String sortSentence(String s) {
     String[] sentences = s.split(" ");
        String res[] = new String[sentences.length];
        String result = "";
        
        for(String sentence: sentences){
            char ch = sentence.charAt(sentence.length()-1);
            int num = ch - '0';
            //System.out.println(num);
            res[num-1] = sentence.substring(0, sentence.length()-1);
        }
        
        for(String r: res)
            result += r + " ";
        System.out.println(Arrays.toString(res));
        return result.substring(0, result.length()-1);
    }
}