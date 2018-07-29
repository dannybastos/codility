package codility.test;

import java.util.ArrayList;

/**
 * 
 * @author dannybastos
 *
 * @description Point3D
 */
public class Ex01 {
	
	static class Point3D {
		public int x;
		public int y;
		public int z;
	}

	
	public static void main(String[] args) {
		Point3D[] A = new Point3D[6];
		initObjects(A);
		fillArrays(A);
		int result = solution(A);
		System.out.println(result);
	}


	private static void initObjects(Point3D[] A) {
		A[0] = new Point3D();
		A[1] = new Point3D();
		A[2] = new Point3D();
		A[3] = new Point3D();
		A[4] = new Point3D();
		A[5] = new Point3D();
	}


	private static void fillArrays(Point3D[] A) {
		A[0].x = 0; 	A[0].y=5; 	A[0].z = 4;
		A[1].x = 0; 	A[1].y=0; 	A[1].z = -3;
		A[2].x = -2; 	A[2].y=1; 	A[2].z = -6;
		A[3].x = 1; 	A[3].y=-2; 	A[3].z = 2;
		A[4].x = 1; 	A[4].y=1; 	A[4].z = 1;
		A[5].x = 4; 	A[5].y=-4; 	A[5].z = 3;
	}


	private static int solution(Point3D[] A) {
        ArrayList<Integer> valores = new ArrayList<Integer>();
        for(int i = 0; i < A.length; i++){
            Integer r = new Integer(Math.abs(A[i].x) + Math.abs(A[i].y) + Math.abs(A[i].z));
            if(!valores.contains(r)){
                valores.add(r);    
            }
        }
        return valores.size()-1;	
    }
}

