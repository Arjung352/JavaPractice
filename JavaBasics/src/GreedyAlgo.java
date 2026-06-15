import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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

    // minimum absolute difference pair

    public static void minimumAbsoluteDifferencePair(int arrA[],int arrB[]){
        Arrays.sort(arrA);        
        Arrays.sort(arrB);
        int ans=0;
        for(int i=0;i<arrA.length;i++){
            ans+=Math.abs(arrA[i]-arrB[i]);
        }
        System.out.println("Minimum Absolute Difference Pair "+ans);
    }

        public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        // global answer
        int absDiff=Integer.MAX_VALUE;
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            // local best
            int diff=arr[i+1]-arr[i];
            if(diff<absDiff){
                absDiff=diff;
                res.clear();
                res.add(Arrays.asList(arr[i], arr[i + 1]));
            }
            else if(diff==absDiff){
                res.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return res;
    }

    public static void maxLengthChainOfPair(int arr[][]) {
        // fistly we'll sort the array based on the 2nd coloumn
        Arrays.sort(arr,Comparator.comparingDouble(o->o[1]));
        ArrayList<Integer> res=new ArrayList<>();
        res.add(0);
        int lastEnd=arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(lastEnd<=arr[i][0]){
                res.add(i);
                lastEnd=arr[i][1];
            }
        }
        System.out.println(res);
    }
    public static ArrayList<Integer> coinChange(int[] coins, int amount) {
        ArrayList<Integer> result=new ArrayList<>();
        // case 1 when the amount is zero
        if(amount==0){
            result.add(0);
            return result;
        }
        Arrays.sort(coins);
        // valid cases
        int index=coins.length-1;
        while(amount>0&&index>=0){
            if(coins[index]>amount){
                if(index==0){
                    result.add(-1);
                    return result;
                }
                index--;
            }
            else{
                amount-=coins[index];
                result.add(coins[index]);
            }
        } 
        return result;
    }

    public static void jobSequence(int arr[][]) {
Arrays.sort(arr, (a, b) -> Double.compare(b[1], a[1]));
        int totalProfit=0;
        int lastEnd=0;
        for(int i=0;i<arr.length;i++){
         if(lastEnd<arr[i][0]){
             totalProfit+=arr[i][1];
             lastEnd=arr[i][0];
             System.out.println("Job "+i+" is selected with profit "+arr[i][1]);
         }
        }
        System.out.println("Total Profit: " + totalProfit);
    }

    // Chochola Problem
    public static void chocholaProblem(int costver[],int costhor[]){
        int totalCost=0;
        Arrays.sort(costver);
        Arrays.sort(costhor);
        int i=costver.length-1;
        int j=costhor.length-1;
        int verticalPieces=1;
        int horizontalPieces=1;
        while(i>=0&&j>=0){
            if(costver[i]>costhor[j]){
                totalCost+=costver[i]*horizontalPieces;
                verticalPieces++;
                i--;
            }
            else{
                totalCost+=costhor[j]*verticalPieces;
                horizontalPieces++;
                j--;
            }
        }
        while(i>=0){
            totalCost+=costver[i]*horizontalPieces;
            i--;
        }
        while(j>=0){
            totalCost+=costhor[j]*verticalPieces;
            j--;
        }
        System.out.println("Total Cost: "+totalCost);
    }

    public static void main(String[] args) {
        int startTime[]={1,3,0,5,8,5};
        int endTime[]=  {2,4,6,7,9,9};
        activitySelection(startTime,endTime);
        int weight[]={10,20,30};
        int value[]={60,100,120};
        int capacity=50;
        fractionalKnapsack(weight,value,capacity);
        int arrA[]={4,1,8,7};
        int arrb[]={2,3,6,5};
        minimumAbsoluteDifferencePair(arrA, arrb);
        List<List<Integer>> result = minimumAbsDifference(new int[]{4, 1, 8, 7});
        System.out.println("Minimum Absolute Difference Pair: " + result);
        int arr[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        maxLengthChainOfPair(arr);
        System.out.println(coinChange(new int[]{1,2,5,10,20,50,100,500,2000}, 1059));
        // the greedy approach doesn't work for this problem as it may not give the optimal solution
        int jobArr[][]={{4,40},{1,10},{1,40},{1,20}};
        jobSequence(jobArr);
        int costver[]={2,1,3,1,4};
        int costhor[]={4,1,2};
        chocholaProblem(costver, costhor);
    }
}
