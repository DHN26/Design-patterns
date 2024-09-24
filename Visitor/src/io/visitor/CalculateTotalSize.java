package io.visitor;

public class CalculateTotalSize implements Visitor {
	private int totalSize = 0;

	@Override
	public void visit(File file) {
		totalSize += file.getSize();
	}

	@Override
	public void visit(Directory directory) {
		for (Element element : directory.getFiles()) {
			element.accept(this);
		}
	}

	public int getTotalSize() {
		return totalSize;
	}
}
