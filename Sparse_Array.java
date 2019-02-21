 
 
 // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
        //set queries array length to an initialiazed variable n
        int n=queries.length;
        // Initialize an empty array result
        int[] result=new int[n];
        // set count result from find method to result array within a for loop
        for(int i=0;i<n;i++){
           result[i]=find(strings,queries[i]);
        }
        // Return result
        return result;
    }
    static int find(String[] arr, String s){
        // Initialize a count variable
        int count=0;
        // Within a loop, check if a string exist in an array. If yes, increment count
        for(int j=0; j<arr.length; j++){
            if(s.equals(arr[j]))
                count++;

        }
        // Return a count result
         return count;
    }
