package project3;

class quiz5_1 {
    boolean quiz5_1(String s) {
        boolean answer = true;
        int count = 0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
                count++;
            else
                count--;
            
            if(count < 0)
                answer = false;
        }
        
        if(count > 0)
            answer = false;

        return answer;
    }
}
