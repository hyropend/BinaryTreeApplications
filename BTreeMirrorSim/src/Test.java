public class Test {
    public boolean isMirrorSim(BTNode r1, BTNode r2){

        if(r1==null && r2==null) return true;
        if(r1==null) return false;
        if(r2==null) return false;
        if(isMirrorSim(r1.LChild, r2.RChild) && isMirrorSim(r1.RChild, r2.LChild))
            return true;
        return false;

    }
}
