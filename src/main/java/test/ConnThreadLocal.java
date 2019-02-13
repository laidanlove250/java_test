/**
 * 
 */
package test;

/**
 * @author Administrator
 *
 */
public class ConnThreadLocal {

	/** 针对每个线程使用 */
	public static ThreadLocal<String> th = new ThreadLocal<String>();

	/**
	 * @return the th
	 */
	public void getTh() {
		System.out.println(Thread.currentThread().getName() + ":" + th.get());
	}

	/**
	 * @param th the th to set
	 */
	public void setTh(String value) {
		th.set(value);
	}
	
	public static void main(String[] args) {
		final ConnThreadLocal ct = new ConnThreadLocal();
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				ct.setTh("张三");
				ct.getTh();
			}
			
		},"t1");
		
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				try {
					ct.setTh("李四");
					ct.getTh();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}, "t2");
		t1.start();
		t2.start();
	}
}
