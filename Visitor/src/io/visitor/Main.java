package io.visitor;

public class Main {
	
	    public static void main(String[] args) {
	        
	        File file1 = new File("File1.txt", 100);
	        File file2 = new File("File2.txt", 200);
	        File file3 = new File("File3.txt", 300);

	        
	        Directory dir1 = new Directory("Dir1");
	        Directory dir2 = new Directory("Dir2");
	        Directory root = new Directory("Root");

	        
	        dir1.addElement(file1);
	        dir1.addElement(file2);
	        dir2.addElement(file3);
	        root.addElement(dir1);
	        root.addElement(dir2);

	        
	        PrintStructureVisitor printVisitor = new PrintStructureVisitor();
	        root.accept(printVisitor);

	        
	        CalculateTotalSize sizeVisitor = new CalculateTotalSize();
	        root.accept(sizeVisitor);
	        System.out.println("Total size: " + sizeVisitor.getTotalSize());

	       
	        FindFile findFileVisitor = new FindFile("File5.txt");
	        root.accept(findFileVisitor);
	        System.out.println("File2.txt found: " + findFileVisitor.isFound());
	    }
	


}
