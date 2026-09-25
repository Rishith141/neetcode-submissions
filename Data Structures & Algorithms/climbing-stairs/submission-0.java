class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);
    }
    private static int solve(int n,int[] dp){
        if(n==1) return 1;

        if(n==2) return 2;
        
        if(dp[n] != -1) return dp[n];
        int ans1 = solve(n-1,dp);
        int ans2 = solve(n-2,dp);

        return dp[n] = ans1 + ans2;
    }
}
