package cn.zhonghao.singleton;

public class Test {

	public static void main(String[] args) {
		
		// 创建 Singleton 对象不能通过构造器，只能通过 getInstance 方法
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		// 将输出 true,说明两个是同一个对象
		System.out.println(s1 == s2);
	}
}
