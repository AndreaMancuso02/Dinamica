package com.example.demo;

import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

public class HelloWorldPdf {
    public static void main(String[] args) throws Exception {
        // 1. Definisci il percorso di output
        String dest = "C:/Users/pietr/Desktop/Dinamica/hello.pdf";

        // 2. Crea un PdfWriter
        PdfWriter writer = new PdfWriter(dest);

        // 3. Crea un PdfDocument
        PdfDocument pdf = new PdfDocument(writer);

        // 4. Crea un Document (layout astratto sopra PdfDocument)
        Document document = new Document(pdf);

        // 5. Aggiungi contenuto (paragrafi, immagini, tabelle, ecc.)
        document.add(new Paragraph("Ciao, questo è il mio primo PDF con iText!"));
        
        document.add(new Paragraph("Testo aggiunto a un PDF esistente."));

        // 6. Chiudi il documento (deve essere l ultimo)
        document.close();

        System.out.println("PDF creato in: " + dest);
    }
}
