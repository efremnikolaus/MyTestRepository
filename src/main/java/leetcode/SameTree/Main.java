/* Exercise #1 on leetcode */
package leetcode.SameTree;

public class Main {
    Boolean result = true;
    private boolean val;
    private Main left;
    private Main right;

    public boolean isSameTree (Main p, Main q) {
        check(p,q);
        return result;
    }
    private void check(Main p, Main q){
        if (p == null && q == null) {
            return;
        }
        if (p != null && q == null || q != null && p == null) {
            result = false;
            return;
        }
        if (p.val != q.val) {
            result = false;
            return;
        }
        check (p.left,q.left);
        check (p.right,q.right);
    }
}
