class Solution {
    public void setZeroes(int[][] arr) {
        int m = arr.length , n = arr[0].length;
         
        //          // Method 2
        //   boolean [] row = new boolean[m];
        //   boolean [] col = new boolean[n];
        //     // Marking the psrticulsr row and col
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //          if(arr[i][j]==0){
        //             row[i]= true;
        //             col[j]= true;
        //          }
        //     }
        // }
        //   // set the true rows to 0  
        //  for(int i=0;i<m;i++){
        //     if(row[i]==true){
        //         for(int j=0;j<n;j++){
        //             arr[i][j]=0;
        //         }
        //     }
        // }
        //   // set the true col to 0
        //  for(int j=0;j<n;j++){
        //     if(col[j]==true){
        //         for(int i=0;i<m;i++){
        //             arr[i][j]=0;
        //         }
        //     }
        // }
            boolean zeroRow = false;
            boolean zerocol = false;
            for(int j=0;j<n;j++){
                if(arr[0][j]==0){
                    zeroRow = true;
                    break;
                }
            }
            for(int i=0;i<m;i++){
                if(arr[i][0]==0){
                    zerocol= true;
                    break;
                }
            }
            for(int i=1;i<m;i++){
                for(int j=1;j<n;j++){
                    if(arr[i][j]==0){
                        arr[i][0] =0;
                        arr[0][j]=0;
                    }
                }
            }
            for(int j=1;j<n;j++){
                if(arr[0][j]==0){
                    for( int i=1;i<m;i++){
                        arr[i][j]=0;
                    }
                }
            }
            for(int i=1;i<m;i++){
                if(arr[i][0]==0){
                    for( int j=1;j<n;j++){
                        arr[i][j]=0;
                    }
                }
            }

             if(zeroRow==true){
                for(int j=0;j<n;j++){
                    arr[0][j]=0;
                }
             }
            if(zerocol==true){
                for(int i=0;i<m;i++){
                    arr[i][0]=0;
            }
        }
    }
}