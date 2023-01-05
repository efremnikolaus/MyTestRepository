/* Exercise #1672 on leetcode */
package leetcode.RichestCustomerWealth;

class Main {
    public int maximumWealth(int[][] accounts) {
        int maxWealthSoFar = 0;

        for(int[] customer:accounts) {
            int currentCustomerWealth = 0;

            for(int bank:customer) {
                currentCustomerWealth += bank;
            }
            maxWealthSoFar = Math.max(maxWealthSoFar, currentCustomerWealth);
        }
        return maxWealthSoFar;
    }
}