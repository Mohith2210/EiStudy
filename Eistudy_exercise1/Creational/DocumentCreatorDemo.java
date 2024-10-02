interface Document {
    String create();
}

class PDFDocument implements Document {
    @Override
    public String create() {
        return "Creating PDF document";
    }
}

class WordDocument implements Document {
    @Override
    public String create() {
        return "Creating Word document";
    }
}

abstract class DocumentCreator {
    public abstract Document createDocument();
}

class PDFCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new PDFDocument();
    }
}

class WordCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

// Usage
class DocumentCreatorDemo {
    public static void main(String[] args) {
DocumentCreator pdfCreator = new PDFCreator();
Document pdfDoc = pdfCreator.createDocument();
System.out.println(pdfDoc.create());
}
}