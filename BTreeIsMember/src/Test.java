public class Test {
    public boolean isMember(int key){

        BTNode w = root;

        while (w!=null){
            if(w.data == key) return true;
            if(w.data < key)
                w=w.RChild;
            else
                w=w.LChild;
        }
        return false;
    }

}
