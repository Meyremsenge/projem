
package birincidonem;


public class iHashmap {
    iBaglilisteliHash[] table;
    int TABLE_SIZE;

    public iHashmap(int TABLE_SIZE) {
        this.TABLE_SIZE=TABLE_SIZE;
        table=new iBaglilisteliHash[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i]=null;
        }
    }
    public int get(int key){
        int hash=key%TABLE_SIZE;
        if (table[hash]==null) {
            return -1;
        } else {
            iBaglilisteliHash entry = table[hash];
            while (entry !=null && entry.getKey()  != key) {                
                entry= entry.getNext();
                
            }
            if (entry==null) {
                return -1;
            }else{
                return  entry.getValue();
            }
  
        }
    }
    public void goster(){
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                iBaglilisteliHash tmp=table[i];
                while (tmp!=null) {                    
                    System.out.println(tmp.getKey()+"-"+tmp.getValue()+"-->");
                    tmp=tmp.next;
                }
            System.out.println(" ");
            }
            }
        }
    public void put(int key, int value){
        int hash= key%TABLE_SIZE;
        if (table[hash]==null) {
            table[hash]=new iBaglilisteliHash(key, value);
        } else {
            iBaglilisteliHash entry =table[hash];
            while (entry.getNext()!= null && entry.getKey() != key) {                
                entry=entry.getNext();
            }
            if(entry.getKey()==key){
                entry.setValue((value));
            }else{
                entry.setNext(new iBaglilisteliHash(key, value));
            }
        }
    }
    public void remove(int key){
        int hash = key % TABLE_SIZE;
        if (table[hash] !=null) {
            iBaglilisteliHash preventry =null;
            iBaglilisteliHash entry=table[hash];
            while (entry.getNext()!= null && entry.getKey() != key) {          
                preventry =entry;
                entry=entry.getNext();
                
            }
            if (preventry ==null) {
                table[hash]=entry.getNext();
            } else {
                preventry.setNext(entry.getNext());
            }
        }
    }
    }

