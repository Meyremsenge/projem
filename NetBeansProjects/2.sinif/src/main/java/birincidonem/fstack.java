
package birincidonem;


public class fstack {
 int kapasite;
 int[] s;
 int ust;
 public fstack(int kapasite){
     this.kapasite=kapasite;
     s=new int[kapasite];
     ust=-1;
 } 
    boolean dolumu(){
        if (ust==kapasite-1) {
            return true;
        } else {
            return false;
        }
    }
    boolean bosmu(){
        return  ust==-1;
    }
    void push(int x){
        if (!dolumu()) {
            ust=ust+1;
            s[ust]=x;
            System.out.println(x);
        } 
     
    
}
    int pop(){
        if (!bosmu()) {
            ust=ust-1;
            System.out.println(s[ust+1]);
            return s[ust+1];
        }
        return  -1;
    }
    
    public static void main(String[] args) {
        int size =5;
        fstack s=new fstack(size);
        s.push(7);
        s.push(4);
        s.push(77);
        System.out.println("Çıkarma");
        s.pop();
        s.pop();
    }
}