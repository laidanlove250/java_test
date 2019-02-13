/**
 * 
 */
package test;

/**
 * @author Administrator
 *
 */
public class DubbleSingleton {

	private static DubbleSingleton ds;
	
	public static DubbleSingleton getDs(){
		if(ds == null){
			try {
				System.out.println("1");
				//模拟初始化对象得准备时间
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			synchronized (DubbleSingleton.class) {
				if(ds == null){
					System.out.println("2");
					ds = new DubbleSingleton();
				}
			}
		}
		return ds;
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println(DubbleSingleton.getDs().hashCode());
			}
			
		},"t1");
		
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println(DubbleSingleton.getDs().hashCode());
			}
			
		}, "t2");
		
		Thread t3 = new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println(DubbleSingleton.getDs().hashCode());
			}
			
		}, "t3");
		
		t1.start();
		t2.start();
		t3.start();
	}
}

