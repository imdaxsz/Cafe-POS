package project3;

class quiz5_2 {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int a[] = {1,2,3,4,5};
        int b[] = {2,1,2,3,2,4,2,5};
        int c[] = {3,3,1,1,2,2,4,4,5,5};
        int[] count = new int[3];
        
        for(int i=0;i<answers.length;i++){
            if(answers[i]==a[i%5])
                count[0]++;
            if(answers[i]==b[i%8])
                count[1]++;
            if(answers[i]==c[i%10])
                count[2]++;
        }
        
        int max = 0;
        int maxcount = 0;
        int idx = 0;

        for(int i=0;i<count.length;i++)
            if(max<count[i])
                max = count[i];
            
        for(int i=0;i<3;i++)
            if(max==count[i])
                maxcount++;
        
        answer = new int[maxcount];
    
        for(int i=0;i<count.length;i++)
            if(max == count[i])
                answer[idx++]=i+1;
        
        return answer;
    }
}