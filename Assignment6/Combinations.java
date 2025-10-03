class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> l1 = new ArrayList<>();
        List<List<Integer>> ans= new ArrayList<>();
        Combination(n,k,l1,1,ans);
        return ans;
    }
    public static void Combination(int n, int k, List<Integer> l1 ,int start, List<List<Integer>> ans){
        if(l1.size() == k){
            ans.add(new ArrayList<>(l1));
            return;
        }
        for (int i = start; i <= n; i++) {
            l1.add(i);
            Combination(n, k, l1, i + 1, ans);
            l1.remove(l1.size() - 1);
        }
    }
}
