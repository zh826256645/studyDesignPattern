package cn.zhonghao.simplefactory;

/**
 * �豸����
 * Computer ��ͨ���ù�������ȡ�豸
 * Computer ����֪�����ȡ��ʲôʵ��
 * @author ZhongHao
 *
 */
public class OutputFactory {

	public Output getOutput() {
		// �������д������ڿ���ϵͳ����ʹ�� Output ���ĸ�ʵ����
		return new BetterPrinter();
	}
}
