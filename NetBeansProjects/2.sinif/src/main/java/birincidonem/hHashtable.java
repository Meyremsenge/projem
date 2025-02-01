
package birincidonem;


public class hHashtable {
    int N;
    hHash[] map=null;
    public hHashtable(int N){
        map=new hHash[N];
        this.N=N;
        for (int i = 0; i < N; i++) {
            map[i]=null;
        }
    }
    public void put(int key,int value) throws hHashtableException{
        int hhash=key%N;
        int count=0;
        while (map[hhash] != null && map[hhash].getKey() != key) {            
            hhash = (hhash+1) % N;
            if (count ==N) {
                throw new hHashtableException("Tablo dolu");
            }
            count++;
        }
        map[hhash]=new hHash(key, value);
    }
    public int get(int key) throws hHashtableException{
        int hhash=key%N;
        int count=0;     
        while (map[hhash] != null && map[hhash].getKey() != key) {  
             hhash = (hhash+1) % N;
            if (count ==N) {
                throw new hHashtableException("Tabloda eşleşen anahtar yok.");
            }
            count++; 
            }
        if (map[hhash]==null) {
            throw new hHashtableException("Tabloda eşleşen anahtar yok.");
        }
        return map[hhash].getValue();
        }
    }
    
