package io.visitor;

public class FindFile implements Visitor {
    private String fileName;
    private boolean found = false;

    public FindFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void visit(File file) {
        if (file.getName().equals(fileName)) {
            found = true;
        }
    }

    @Override
    public void visit(Directory directory) {
        for (Element element : directory.getFiles()) {
            element.accept(this);
        }
    }

    public String isFound() {
        return found==true? "Found": "NOT found";
    }
}

