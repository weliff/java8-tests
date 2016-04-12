package interfaceFuncional;

public class interfaceFuncional {
	
	static void invoke(Runnable r){
		Thread t = new Thread(r);
		t.start();
	}
	
	public static void main(String[] args) {
		
		invoke(()->{
			
		});
	}
}
