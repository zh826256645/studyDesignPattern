package cn.zhonghao.singleton;

/**
 * 单例模式
 * 1.使用 private 修饰该类的构造器，将该类的构造器隐藏起来
 * 2.提供一个 public 方法作为该类的访问点
 * 3.该方法用于创建改类的对象，且必须使用 static 修饰
 * 4.必须缓存已创建的对象
 * 5.为该类需要使用一个静态属性来保存曾经创建的实例，且该属性需要被静态方法访问
 * 
 * 优势：
 * 1.减少创建 Java 实例所带来的系统开销
 * 2.便于系统跟踪单个 Java 实例的生命周期、实例状态等
 * @author ZhongHao
 *
 */
public class Singleton {

	// 使用一个类变量缓存曾经创建的实例
	private static Singleton instance;
	// 将构造器使用 private 修饰，隐藏该构造器
	private Singleton() {}
	// 提供一个静态方法，用于返回 Singleton 实例
	// 该方法可以加入自定义的控制，保证只产出一个 Singleton 对象
	public static Singleton getInstance() {
		// 如果 instance 为 null,表明还不曾创建 Singleton 对象
		// 如果 instance 不为 null,则表明已经创建了 Singleton 对象，将不会执行该方法
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
