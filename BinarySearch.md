private int binarySearch(int num, int[] arr) {    


   length = arr.length;     
   
	int mid = arr.length / 2;       
	
	int r = arr.length;  
	
	int l = 0;     
	
	while (r != l) {   
	
		if(num < mid) {  
		
			r = mid - 1;   
			
		} else if(num > mid){   
		
			l = mid + 1;  
			
		}                                
		mid = r + (r - l) / 2; 
		
	}       
	
	if (mid = num) {
	
		return mid;   
		
	}      
	
	return -1;   
	
}

