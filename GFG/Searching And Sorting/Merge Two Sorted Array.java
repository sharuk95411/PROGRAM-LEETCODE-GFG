 


// Logic is easy and simple
// hintisme hme arr1 me min element rkhna h zruri ni h wo sorted hi ho but wo arr2 k elements se km ho and ye km ek hi loop me ho jyga
then end me arr1 ko sort kr lge and arr2 ko h simple 
public void merge(int arr1[], int arr2[], int n, int m) {
        
        int i = 0, j = 0, k = n - 1;
        while (i <= k && j < m) {
            if (arr1[i] < arr2[j])
                i++;
            else {
                int temp = arr2[j];
                arr2[j] = arr1[k];
                arr1[k] = temp;
                j++;
                k--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    
    }