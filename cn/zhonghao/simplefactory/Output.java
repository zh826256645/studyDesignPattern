package cn.zhonghao.simplefactory;

public interface Output {
	
	// 接口里面定义的属性只能是常量
	int MAX_CACHE_LINE = 50;

	public void out();
	
	public void getData(String msg);
}
