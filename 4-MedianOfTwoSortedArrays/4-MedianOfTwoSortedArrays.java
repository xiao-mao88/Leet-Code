// Last updated: 11/8/2025, 2:03:49 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int m = nums1.length;
int n = nums2.length;
double median = 0;
if(m >= 0 && m <= 1000 && n >= 0 && n <= 1000 && (m + n) >= 1){
int resultant[] = new int[n + m];
int mm=0;
int nn=0;
for(int i= 0; i< m + n ; i++){

         if(mm < m && nn< n){  
               if(nums1[mm] > nums2[nn]){
               resultant[i] = nums2[nn];
               nn++;
               }
        
         else{
           resultant[i] = nums1[mm];
           mm++;
           }
         }
         else{
              if(mm< m ){  
         resultant[i] = nums1[mm];
         mm++;
         }
             if(nn< n ){  
         resultant[i] = nums2[nn];
         nn++;
         }
      }
       
     }
     if((m + n ) % 2 == 0 )  {
         median =(float) ( resultant[(resultant.length/2)-1]+ resultant[(resultant.length/2)])/2;
     }
     else{
         median = (float)(resultant[(resultant.length-1)/2] ); 
     }
               
    }
    return median;    
}
}