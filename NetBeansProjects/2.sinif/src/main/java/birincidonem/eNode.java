
package birincidonem;


public class eNode {
    private eAraba araba;
    private  eNode next;
    public eNode(eAraba araba){
        this.araba=araba;
        this.next=null;
    }
    public eAraba getAraba(){
        return araba;
    }
        public void setAraba(eAraba araba){
        this.araba=araba;
    } 
        public eNode getNext(){
        return next;
    }
        public void setNext(eNode next){
        this.next=next;
    }
}
