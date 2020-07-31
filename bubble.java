class bubble
{
    public static void main(String[] args)
    {
        int arr[]={9,8,7,6,5,4};
        int sorted=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=1;j<arr.length-sorted;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                    
                }
            }
            sorted++;
        }
        for(int i:arr)
        {
            System.out.println(i);
        }
        
    }
    static void swap(int arr[],int a,int b)
    {
        if(arr[a]==arr[b])
        return;
        else
        {
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
        }
    }
}