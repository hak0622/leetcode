class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        StringBuilder sb = new StringBuilder();
        HashMap<String,Integer>map = new HashMap<>();

        for(int i=0; i<paragraph.length(); i++){
            char c = paragraph.charAt(i);

            if(Character.isLetter(c)) sb.append(c);
            else sb.append(' ');
        }
        

        String[]words = sb.toString().split(" ");

        for(String word : words){
            boolean check = true;

            if(word.equals("")) continue;
            else{
                for(int i=0; i<banned.length; i++){
                    if(word.equals(banned[i])){
                        check = false;
                        break;
                    }
                }
                if(check){
                    map.put(word, map.getOrDefault(word,0)+1);
                }
            }
        }

        String answer = "";
        int max = 0;

        for(String key : map.keySet()){
            if(map.get(key) > max){
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }
}