package com.nisum.java9Features.processAPI;

public class NotepadFromProcessBuilder {
    public static void main(String[] args) throws Exception {
        new ProcessBuilder("notepad.exe", "sample.java").start();
    }

}
