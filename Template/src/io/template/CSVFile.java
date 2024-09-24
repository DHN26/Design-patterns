package io.template;

public class CSVFile extends Processor{

	@Override
	void reading() {
		System.out.println("Reading a CSV file.");
	}

	@Override
	void processing() {
		System.out.println("Processing a CSV file.");
	}

	@Override
	void saving() {
		System.out.println("Saving a CSV file.");
	}

	

}
