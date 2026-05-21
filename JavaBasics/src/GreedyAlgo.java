import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class GreedyAlgo {
    
    // activity selection
    public static void activitySelection(int startTime[],int endTime[]){
                ArrayList<Integer> result=new ArrayList<>();
        int count=0;
        int lastEndTime=0;
        for(int i=0;i<startTime.length;i++){
            // add the initial task as it ends the fastest
            if(i==0){
            result.add(i);
            count++;
            lastEndTime=endTime[i];
            }
            else{
                if(startTime[i]>=lastEndTime){
                    result.add(i);
                    count++;
                    lastEndTime=endTime[i];
                }
            }
        }
        System.out.println(result);
    }

    // fractional knapsack
    public static void fractionalKnapsack(int weight[],int value[],int capacity){
        double ratio[][]=new double[value.length][2];
        int result=0;
        // calculating the ratio
        for(int i=0;i<value.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)weight[i];
        }

        // sort in the ascending order
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));

        int remainingCapacity=capacity;
        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            if(weight[idx]<=remainingCapacity){
                result+=value[idx];
                remainingCapacity-=weight[idx];
            }
            // include fractional item
            else{
                result+=(ratio[i][1]*remainingCapacity);
                remainingCapacity=0;
                break;
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        int startTime[]={1,3,0,5,8,5};
        int endTime[]=  {2,4,6,7,9,9};
        activitySelection(startTime,endTime);
        int weight[]={10,20,30};
        int value[]={60,100,120};
        int capacity=50;
        fractionalKnapsack(weight,value,capacity);
    }
}
