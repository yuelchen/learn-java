class FibFibMemoCompare {
	public static void main(String[] args) {
		int fibNum = 45;
		
		long fibStartTime = System.nanoTime();
		long fibResult = fib(fibNum);
		long fibDuration = (System.nanoTime() - fibStartTime) / 1000;
		System.out.println("Ending result for fib(" + fibNum + "): " + fibResult + ", took " + fibDuration + " ms");
		
		long fibCachedStartTime = System.nanoTime();
		long fibCachedResult = fibCached(fibNum);
		long fibCachedDuration = (System.nanoTime() - fibCachedStartTime) / 1000;
		System.out.println("Ending result for fibCached(" + fibNum + "): " + fibCachedResult + ", took " + fibCachedDuration + " ms");
		
		if(fibDuration < fibCachedDuration) {
			System.out.println("fib(" + fibNum + ") beat fibCached(" + fibNum + ") by " + (fibCachedDuration - fibDuration) + " ms");
		} 
		else if(fibDuration > fibCachedDuration) {
			System.out.println("fibCached(" + fibNum + ") beat fib(" + fibNum + ") by " + (fibDuration - fibCachedDuration) + " ms");
		}
		else {
			System.out.println("fibCached(" + fibNum + ") and fib(" + fibNum + ") took the same exact time!");
		}
	}
  
	public static long fib(int num) {
		if(num < 2) {
			return num;
		}
		else {
			return fib(num - 2) + fib(num - 1);
		}
	}
  
  public static long[] cache = new long[1000];
	
	public static long fibCached(int num) {
		if(num < 2) {
			cache[num] = num;
		}
		else if(cache[num] == 0) {
			cache[num] = fib(num - 1) + fib(num - 2);
		}
		
		return cache[num];
	}
}
