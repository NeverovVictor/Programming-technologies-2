public class Main {

    public static int _max(int[] a) {
        int n = a.length;
        int maxi = -999999;
        for (int i = 0; i < n; i++) {
            if (a[i] > maxi) {
                maxi = a[i];
            }
        }
        return maxi;
    }

    public static int _min(int[] a) {
        int n = a.length;
        int mini = 999999;
        for (int i = 0; i < n; i++) {
            if (a[i] < mini) {
                mini = a[i];
            }
        }
        return mini;
    }

    public static int _sum(int[] a) {
        int n = a.length;
        int sumi = 0;
        for (int i = 0; i < n; i++) {
            sumi += a[i];
        }
        return sumi;
    }

    public static int _mult(int[] a) {
        int n = a.length;
        int multi = 1;
        for (int i = 0; i < n; i++) {
            multi *= a[i];
        }
        return multi;
    }


}