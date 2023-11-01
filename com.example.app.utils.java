package com.example.app.utils;

import com.example.app.models.Note;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class NoteWriter {
    private static final String FILE_PATH = "notes.txt";

    public static void write(Note note) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(note.getTimestamp() + " -> " + note.getContent());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}