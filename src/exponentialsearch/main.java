
package exponentialsearch;

/**
 *
 * @author asim
 */
public class main {
    
    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
       
        ExponentialSearch search=new ExponentialSearch();
        
        System.out.println(search.exponSearch(arr, 16));
        
    }
}
