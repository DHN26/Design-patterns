package io.visitor;

public class PrintStructureVisitor implements Visitor{

	 private int depth = 0;

	    @Override
	    public void visit(File file) {
	        printIndent();
	        System.out.println("File: " + file.getName());
	    }

	    @Override
	    public void visit(Directory directory) {
	        printIndent();
	        System.out.println("Directory: " + directory.getName());
	        depth++;
	        for (Element element : directory.getFiles()) {
	            element.accept(this);
	        }
	        depth--;
	    }

	    private void printIndent() {
	        for (int i = 0; i < depth; i++) {
	            System.out.print("  ");
	        }
	    }

}
