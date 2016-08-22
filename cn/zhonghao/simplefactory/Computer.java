package cn.zhonghao.simplefactory;

public class Computer {

	private Output out;
	public Computer(Output out) {
		this.out = out;
	}
	// ����һ��ģ���ȡ�ַ�������ķ���
	public void keyIn(String msg) {
		out.getData(msg);
	}
	// ����һ��ģ���ӡ�ķ���
	public void print() {
		out.out();
	}
	public static void main(String[] args) {
		// ���� OutputFactory
		OutputFactory of = new OutputFactory();
		// �� Output �����룬���� Computer ����
		Computer c = new Computer(of.getOutput());
		c.keyIn("�Ӻ�");
		c.keyIn("131110159");
		c.print();
	}
}
