
package birincidonem;


public class lsinav {
    public int binaryArama(int[] dizi, int Toplamindex, int aranansayi){ 
    int bas=0;
      int  son = Toplamindex-1;
      int  ortanca;
        while (bas<son) { 
            ortanca = (bas + son)/2;		//Find the ortanca
        if (dizi[ortanca] < aranansayi)	
            bas = ortanca + 1;		//in upper half
        else 
            son = ortanca;			//in lower half
    }
        if (son < bas)
            return -1;			//Not found
        else { 
              int   index = bas;
              if (dizi[index]== aranansayi) {
                return index;
               }
              else{ 
                    return -1;				// Not found
                }}
}
    int binarySearch2(int array[], int Toplamindex, int target)
{ 	int bottom=0,
        top = Toplamindex-1,
       	 Ortanca;
	bool found = false;
       while (!found && bottom <= top) {
	    Ortanca = (bottom + top)/2;
	   if (array[Ortanca] == target)
                     found true;
          else if (array[Ortanca] < target
                   bottom = Ortanca +1;
                  else
 	          top = Ortanca -1;
	}
	if (found)
            return Ortanca
	else
	return -1;

}
