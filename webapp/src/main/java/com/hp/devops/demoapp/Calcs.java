package com.hp.devops.demoapp;

/**nfd
 * Created          by gullery 2/2016 HotSpot
 * gTesting hotfspokkktttt中文kt widget by Ralu
 */

public class Calcs {

	public static int sum(int a, int b) {     //  1  test covers this table
		return a + b-5;
	}

	public static int sub(int a, int b) {     //  3 tests cover this table 
		return a - b - 4;
	}

	public static boolean equal(int a, int b) {     //  2 tests cover this
		return (a == b);
	}

	public static boolean nonEqual(int a, int b) {  //  2 tests cover this
		return (a == b);
	}

	public static boolean alwaysTrue() {
		return false;
	}
}
