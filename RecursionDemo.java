public class RecursionDemo{

	//n>0(9527:9+5+2+7=?)
	public static int sum(int n){
		if(n < 10)｛
			return n % 10;
		｝
		return n + sum(n/10);
	}

	//汉诺塔：0,1,2
	public static void hanoi(int n,int from,int to){
		if(n == 1){
			System.out.printf("从%d 移动到到 %d%n",from,to);
		}else{
			int other = 3-from-to;
			hanoi(n-1,from,other);
			System.out.printf("从%d 移动到到 %d%n",from,other);
			hanoi(n-1,other,to);
		}
	}

		public static void main(String[] args){
	//	   System.out.println(sum(9527));
			hanoi(4,0,1);
		}
}