public class Test {

    private boolean isSim(BTNode r1, BTNode r2){

        if(r1==null && r2==null) return true;
        if(r1==null) return false;
        if(r2==null) return false;
        if(isSim(r1.LChild,r2.LChild) && isSim(r1.RChild,r2.RChild))
            return true;
        return false;

    }
}
