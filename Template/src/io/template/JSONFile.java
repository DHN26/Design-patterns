package io.template;

public class JSONFile extends Processor{


	@Override
	void reading() {
		System.out.println("Reading a JSON file");
	}

	@Override
	void processing() {
		System.out.println("Processing a JSON file");
	}

	@Override
	void saving() {
		System.out.println("Saving a JSON file");
	}

}
