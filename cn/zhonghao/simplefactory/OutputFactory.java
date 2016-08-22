package cn.zhonghao.simplefactory;

/**
 * 设备工厂
 * Computer 类通过该工厂来获取设备
 * Computer 并不知道会获取到什么实现
 * @author ZhongHao
 *
 */
public class OutputFactory {

	public Output getOutput() {
		// 下面两行代码用于控制系统到底使用 Output 的哪个实现类
		return new BetterPrinter();
	}
}
