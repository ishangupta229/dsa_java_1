public class stocks {
    public static void stocks(int arry[]) {
        int min_price[] = new int[arry.length];
        min_price[0]=arry[0];
        for (int i = 1; i < arry.length; i++) {
            min_price[i] = min_price[i-1]>arry[i] ? arry[i]:min_price[i-1] ;
        }
        int day_profit[] = new int[arry.length];
        int total_profit=0;
        int max_profit=0;
        for (int i = 0; i < arry.length; i++) {
            day_profit[i] = arry[i]- min_price[i];
            total_profit += day_profit[i];
            max_profit = day_profit[i]>max_profit? day_profit[i]:max_profit;
        }
        for (int i = 0; i < day_profit.length; i++) {
            System.out.print(day_profit[i]);

        }
        System.out.println();
        System.out.println("Total profit is : " + total_profit);
        System.out.println("Max profit is : " + max_profit);
    }

    public static void main(String[] args) {
        int price[]= {7,1,5,3,6,4};
        stocks(price);
    }
}
