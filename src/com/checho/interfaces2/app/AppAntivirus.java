package com.checho.interfaces2.app;

import com.checho.interfaces2.dominio.*;

public class AppAntivirus {

    public static void main(String[] args) {
        Antivirus antivirus = new Antivirus();

        antivirus.agregar(new DocumentoWord("tesis.docx", true));
        antivirus.agregar(new DocumentoWord("hoja de vida.docx", false));
        antivirus.agregar(new DocumentoWord("despido.docx", true));
        antivirus.agregar(new DocumentoPDF("despido.pdf", 10));
        antivirus.agregar(new Video("esperanza.mp4", 140));
        antivirus.agregar(new Imagen("foto.jpg", 10));
        antivirus.agregar(new DocumentoExcel("notas.exe", 15));
        antivirus.agregar(new DocumentoPowerPoint("info.pptx", 10));

        antivirus.escanear();
    }
}
