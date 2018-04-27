class MaximumDiffrence 
{
    /* The function assumes that there are at least two
       elements in array.
       The function returns a negative value if the array is
       sorted in decreasing order.
       Returns 0 if elements are equal  */
    int maxDiff(int arr[], int arr_size) 
    {
        int max_diff = arr[1] - arr[0];
        int min_element = arr[0];
        int i;
        for (i = 1; i < arr_size; i++) 
        {
        	if (arr[i] < min_element)
                min_element = arr[i];
            if (arr[i] - min_element > max_diff)
                max_diff = arr[i] - min_element;
            
        }
        return max_diff;
    }
 
    /* Driver program to test above functions */
    public static void main(String[] args) 
    {
//        MaximumDiffrence maxdif = new MaximumDiffrence();
//        int arr[] = {2, 3, 10, 1, 4, 6, 8};
//        int size = arr.length;
//        System.out.println("MaximumDifference is " + 
//                                maxdif.maxDiff(arr, size));
//        static long calculateCombinations(int n, int k) {
            int n=10, k=5;
            long[][] resultSet = new long[n+1][k+1];
            resultSet[0][0]=0;
            resultSet[1][0]=1;
            resultSet[0][1]=0;
            resultSet[1][1]=1;
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i&&j<=k;j++)
                {
                    resultSet[i][j]=resultSet[i-1][j]+resultSet[i-1][j-1];
                }
            }
            System.out.println(resultSet[n+1][k+1]);
    }
}