
package birincidonem;


public class iBaglilisteliHash {
    private int key,value;
    iBaglilisteliHash next;

    public iBaglilisteliHash(int key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
    public int getValue(){ return value;}
    public void setValue(int value) {this.value=value;}
    public int getKey(){ return key;}
    public void setKey(int key) {this.value=key;}
    public iBaglilisteliHash getNext(){ return next;}
    public void setNext(iBaglilisteliHash next) {this.next=next;}
}
