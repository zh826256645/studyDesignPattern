package cn.zhonghao.simplefactory;

public class Computer {

	private Output out;
	public Computer(Output out) {
		this.out = out;
	}
	// 定义一个模拟获取字符串输入的方法
	public void keyIn(String msg) {
		out.getData(msg);
	}
	// 定义一个模拟打印的方法
	public void print() {
		out.out();
	}
	public static void main(String[] args) {
		// 创建 OutputFactory
		OutputFactory of = new OutputFactory();
		// 将 Output 对象传入，创建 Computer 对象
		Computer c = new Computer(of.getOutput());
		c.keyIn("钟浩");
		c.keyIn("131110159");
		c.print();
	}
}
