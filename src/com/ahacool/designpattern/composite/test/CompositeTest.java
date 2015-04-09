package com.ahacool.designpattern.composite.test;

import com.ahacool.designpattern.composite.Composite;
import com.ahacool.designpattern.composite.Leaf;

/**
 * @ClassName CompositeTest
 * @Description TODO
 * @author Moto
 * @date 2014 2014-11-12
 * 
 */
public class CompositeTest {
	// 类似二叉树这样的结构

	public static void main(String[] args) {
		Composite composite1 = new Composite("节点1");
		Composite composite2 = new Composite("节点2");
		Leaf leaf1 = new Leaf("叶子1");
		Leaf leaf2 = new Leaf("叶子2");
		Leaf leaf3 = new Leaf("叶子3");
		Leaf leaf4 = new Leaf("叶子4");
		Leaf leaf5 = new Leaf("叶子5");

		composite1.add(leaf1);
		composite1.add(leaf2);
		composite1.add(composite2);
		composite2.add(leaf3);
		composite2.add(leaf4);
		composite2.add(leaf5);

		composite1.show();
	}

}
