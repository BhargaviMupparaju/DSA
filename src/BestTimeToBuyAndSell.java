public class BestTimeToBuyAndSell {

    public int  maxProfit(int prices[]){

        int maxprofit=0;
        int minPrice=Integer.MAX_VALUE;

        for(int i=0;i<prices.length;i++){

            if(prices[i]<minPrice)
                minPrice=prices[i];

            else if((prices[i]-minPrice)>maxprofit)
                maxprofit=prices[i]-minPrice;

        }

        return maxprofit;


    }

    public static void main(String[] args) {

        int[] salesArray=new int[]{7,1,5,3,6,4};

        BestTimeToBuyAndSell bestTimeToBuyAndSell=new BestTimeToBuyAndSell();
        System.out.println(bestTimeToBuyAndSell.maxProfit(salesArray));
    }
}
