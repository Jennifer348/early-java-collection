public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        String ret = "";
        for(int val : rights) {
            String x = "D";
            if (val >= minPermission) {
                x = "A";
            }
            ret += x;
        }
        return ret;
    }
 }
