
package exponentialsearch;

/**
 *
 * @author asim
 */
public class ExponentialSearch {
    
    public int exponSearch(int array[], int value)
    {
        
        int i=1;
        
        while (i<array.length && array[i]<value)
            i*=2;
        return binarySearch(array,i/2,Integer.min(i, array.length-1),value );
        
    }
    
    
    public int binarySearch(int array[], int start , int end , int value)
    {
        int foundIndex=-1;
        while (start<=end) 
        {
            int mid=(start+end)/2;
            if (array[mid]==value) 
            {
               foundIndex=mid;
               break;
            }
            else if(value<array[mid])
                end=mid-1;
            else
                start=mid+1;
        }
        return foundIndex;
    }
    
}
