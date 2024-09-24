package io.template;

public class Main {

	public static void main(String[] args) {
		Processor p1=new CSVFile();
		p1.dataProcessing("CSV");
		
		System.out.println();
		
		Processor p2=new JSONFile();
		p2.dataProcessing("JSON");
	}

}
