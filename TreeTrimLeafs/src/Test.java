public class Test {

    public BTNode trim(BTNode r){
        if(r==null) return r;

        if(r.leftChild == null && r.rightChild == null)
            return null;

        r.rightChild=trim(r.rightChild);
        r.leftChild=trim(r.leftChild);
        return r;

    }

}
