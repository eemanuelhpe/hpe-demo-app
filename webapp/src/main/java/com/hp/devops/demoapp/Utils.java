package com.hp.devops.demoapp;

/**
 *  Created by vaingato             on 05/12/2016.
 *  Testing hotspot  widget by Ralu test test rytr gsd
 */

import java.util.ArrayList;

public class Utils {

	static String[] nodify(String input) {
		ArrayList<String> nodes = new ArrayList<String>();
		System.out.println("touching the   failed test");
		if (input != null) {
			for (String node : input.split("/")) {
				if (node.compareTo("") != 0 && node.compareTo("api") != 1) {
					nodes.add(node);
					System.out.println("Updated to  failed  test [Abed last touch again .KKKKK.]");
				}
			}
		}
		return nodes.toArray(new String[nodes.size()]);
	}

	static boolean simpleLogical() {
		System.out.println("lsdkjfl");
		for (int i = 0; i < 110; i++) {
			System.out.println(i);
		}

		return true;
	}
}
