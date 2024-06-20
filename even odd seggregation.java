import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int[] arr = new int[size];
        int ind,e_ind,safe,shift;
        for(ind =0;ind<size;ind++){
            arr[ind]=sc.nextInt();
        }
        for(ind=0;ind<size;ind++){
            while(arr[ind]%2==0)
            ind++;
            for(e_ind=ind+1;e_ind<size && arr[e_ind]%2!=0;e_ind++);
                if(e_ind==size)
                break;
                safe=arr[e_ind];
                for(shift=e_ind-1;shift>=ind;shift--)
                    arr[shift+1]=arr[shift];
                    arr[ind]=safe;
               
            }
        for(ind=0;ind<size;ind++){
            System.out.print(arr[ind]+" ");
        }
        }
        }

//  OUTPUT
// 5
// 2
// 4
// 5
// 3
// 6
// 2 4 6 5 3 

