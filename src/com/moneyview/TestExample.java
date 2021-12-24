package com.moneyview;

public class TestExample {
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//m = 3
		//n = 3
		int m=3;
		int n=3;
		
//		  01 02 
//	00	0 0 0  1 1 1
//	10	0 1 0  1 0 0
//	20	0 0 0  1 0 0
		
//		"((()))","(()())","(())()","()(())","()()()"
//		()() (()) 
		
		
		
//		int arr[][] = new int[m][n];
//		for(int i =0; i<m; i++) {
//			for(int j=0; j<n; j++) {
//				if(i==0 || j==0) {
//					arr[i][j] = 1;
//				}else {
//					arr[i][j] = arr[i][j-1]+arr[i-1][j];
//				}
//			}
//		}
		
		
		int arr[][] = new int[m][n];
		for(int i =0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i][j] == 0) {
					if(i==0 || j == 0) {
						arr[i][j] = 1;
					}else {
						if(arr[i][j-1] !=0 && arr[j-1][j] !=0) {
							arr[i][j] = arr[i][j-1]+arr[i-1][j];
						}
					}
				}else {
					arr[i][j] = 0;
				}
			}
		}
		System.out.println("total paths : "+arr[m-1][n-1]);
		
		
	}

	private static void findThePath(int m, int n, int i, int j) {
		
		if(i==m && j ==n) {
			count++;
			return;
		}else {
			if(i>m && j>n) {
				return;
			}else if(j>n) {
				i = i+1;
			}else {j +=1;}
			findThePath(m,n,i,j);
		}
		
	}

}
