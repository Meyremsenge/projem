
package birincidonem;


public class eLinkledList {
    private eNode ilk;
    public eLinkledList(){
        this.ilk=null;
    }
    public void insert (eAraba araba){
        eNode yeniEleman=new eNode(araba);
        if(this.ilk==null){
            this.ilk=yeniEleman;
        }else{
            if (yeniEleman.getAraba().getYil() < this.ilk.getAraba().getYil()) {
                yeniEleman.setNext(this.ilk);
                this.ilk=yeniEleman;
            }else{
                eNode temp=ilk;
                while (temp.getNext() != null && yeniEleman.getAraba().getYil()>temp.getNext().getAraba().getYil()) {   //yeni ve temp ileri
                    temp=temp.getNext();
                }
                yeniEleman.setNext(temp.getNext());  //yeni.ileri=temp.ileri
                temp.setNext(yeniEleman);      //temp.ileri=yeni
            }
        }
    }
    public void display(){
        eNode p=ilk;   //p=temp
        while (p!=null) {            
            p.getAraba().display();
            p=p.getNext();  
        }
        System.out.println("");
        
    }
}
