
package birincidonem;

public class eMAin {
    public static void main(String[] args) {
        eAraba opel=new eAraba("Opel", 2000);
         eAraba bmw=new eAraba("BMW", 2003);
          eAraba audi=new eAraba("Audi", 2005);
           eAraba cadillac=new eAraba("Cadillaac", 2008);
            eAraba kia=new eAraba("Opel", 2011);
             eLinkledList l=new eLinkledList();
             
              l.insert(opel);
             l.display();
              l.insert(bmw);
             l.display();
              l.insert(audi);
             l.display();
              l.insert(cadillac);
             l.display();
             l.insert(kia);
             l.display();
    }
}
