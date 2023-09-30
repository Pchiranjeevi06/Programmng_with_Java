package normal;

public class max_profit {

        public static int maxProfit(int[] prices) {
            int min=0,max=0,profit=0;
            for(int i=0;i<prices.length;i++){
                if(min>prices[i]){
                    min=prices[i];}
                max = prices[i] - min;
                    if(profit<max){
                        profit=max;}


                }
            return profit;
        }
        public static void main(String[] args) {
            System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));

    }

}
