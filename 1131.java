class Solution {
    public int maxAbsValExpr(int[] a, int[] b) {
        int N = a.length, res = 0;
        int maxmm = Integer.MIN_VALUE / 2;
        int maxmp = Integer.MIN_VALUE / 2;
        int maxpm = Integer.MIN_VALUE / 2;
        int maxpp = Integer.MIN_VALUE / 2;
        for (int i = 0; i < N; i++) {
            maxmm = Math.max(maxmm, -a[i] - b[i] - i);
            maxmp = Math.max(maxmp, -a[i] + b[i] - i);
            maxpm = Math.max(maxpm, a[i] - b[i] - i);
            maxpp = Math.max(maxpp, a[i] + b[i] - i);
            res = Math.max(res, maxmm + a[i] + b[i] + i);
            res = Math.max(res, maxmp + a[i] - b[i] + i);
            res = Math.max(res, maxpm - a[i] + b[i] + i);
            res = Math.max(res, maxpp - a[i] - b[i] + i);
        }
        return res;
    }
}
