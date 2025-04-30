package study.practice.practice28;

public class Monitor {
	
	int inch;
	String brand;
	String modelName;

	
	Monitor(int inch, String brand, String modelName) {
		this.inch = inch;
		this.brand = brand;
		this.modelName = modelName;
	}
	
	void printMonitorInfo() {
		System.out.printf("제조사:%s \t 모델명:%s \t 인치:%d",brand,modelName, inch);
		System.out.println("");

	}

}
