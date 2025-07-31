// mergesort :
// firstly we divide the array into two equal parts, sort them
// and then merge those two sorted arrays
public class F_SortArr {
    public static void main(String[] args) {
        int[] arr={43,234,43,72341,13,5,40};
        F_SortArr.mergesort(arr,0,arr.length-1);
        for (int elem: arr){
            System.out.print(elem+ " ");
        }
    }
    public static void mergesort(int[] arr,int si,int ei){
        if(si==ei){
            return;
        }
        int mid=(si+ei)/2;
        F_SortArr.mergesort(arr, si,mid);
        F_SortArr.mergesort(arr, mid+1, ei);
        int i=si,j=mid+1;
        int start=si;
        int[] ans = new int[arr.length];
        while(i<=mid && j<=ei){
            if(arr[i]>=arr[j]){
                ans[start]=arr[j];
                j++;
            }
            else{
                ans[start]=arr[i];
                i++;
            } 
            start++;
        }
        while(i<=mid){
            ans[start]=arr[i];
            i++;
            start++;
        }
        while(j<=ei){
            ans[start]=arr[j];
            j++;
            start++;
        }
        for(int k = si;k<=ei;k++){
            arr[k]=ans[k];
        }
    }
}