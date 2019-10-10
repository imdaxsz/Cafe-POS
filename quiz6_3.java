package project3;

class quiz6_3 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;
        int[] day = new int[progresses.length];
        for(int i=0;i<day.length;i++){
            day[i] = (100 - progresses[i])/speeds[i];
            int a = 1;
            while(progresses[i]+ (a * speeds[i])<100){
                a++;
            }
    
            day[i] = a;
        }
        
        for(int j=1; j<day.length;j++){
            if(day[j]<day[j-1])
                day[j]=day[j-1];
        }
        
        // day = {7,7,7,8,9,9}
        // temp = {..., 3,1,2,0,..}
        // >> answer = {3,1,2}
        int[] temp = new int[101];
        for(int u=0;u<day.length;u++){
            temp[day[u]]=1;
        }
        
        int count = day.length;
        for(int k=1;k<day.length;k++){
            if(day[k]==day[k-1]){
                count--;
                temp[day[k]]++;
            }
        }
        
        answer = new int[count];
        for(int s=0;s<temp.length;s++){
            for(int z=0; z<answer.length;z++)
            if((temp[s]!=0) && (answer[z]==0)){
                answer[z]=temp[s];
                break;
            }
        }
        
        return answer;
    }
}