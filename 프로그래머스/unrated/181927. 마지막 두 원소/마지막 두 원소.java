class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        
        int lastNum = num_list[num_list.length-1];
        int secondNum = num_list[num_list.length-2];
        
        if(lastNum > secondNum){
            answer[num_list.length] = lastNum-secondNum;
             for(int i = 0; i< num_list.length; i++){
                answer[i] = num_list[i];
            }     
        } else {
            answer[num_list.length] = lastNum * 2;
            for(int i = 0; i< num_list.length; i++){
                answer[i] = num_list[i];
            }     
        }
       
        
        
        
        
        
        return answer;
    }
}