package com.javaClass;

public class ArrayTransposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayTransposition zhihuan = new ArrayTransposition();
		zhihuan.Transposition();
	}
	public void Transposition(){
		int a[][] ={{1,2,3},{4,5,6},{7,8,9}};
		int b[][] = new int[3][3];
		for(int i=0;i<3;i++){
			for(int j =0;j<3;j++){
				b[i][j] = a[j][i];
			}
		}
		System.out.println("a矩阵：");
		for (int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("b矩阵：");
		for (int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(b[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
