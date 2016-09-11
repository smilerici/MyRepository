package ch12.sec09.exam01_execute_submit;

import java.util.concurrent.*;

public class ExecuteVsSubmitExample {
	public static void main(String[] args) throws Exception {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		for(int i=0;i<10;i++) {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				ThreadPoolExecutor threadPoolExcutor = (ThreadPoolExecutor) executorService;
				int poolSize = threadPoolExcutor.getPoolSize();
				String threadName = Thread.currentThread().getName();
				System.out.println("[총 스레드 개수 : "+poolSize+"] 작업 스레드 이름- "+threadName);
				int value = Integer.parseInt("삼");
				
			}
		};
		
		//executorService.execute(runnable);
		executorService.submit(runnable);
		Thread.sleep(10);
		}
		
		executorService.shutdown();
	}
}
