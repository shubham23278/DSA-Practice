class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < numRows ; i++){
            int val = 1;
            List<Integer> seq = new ArrayList<>();
            for(int j = 0; j <= i ; j++){
                seq.add(val);
                val = val * (i - j)/(j + 1);
            }
            result.add(seq);
        }
        
        
        
        return result;
    }
}
