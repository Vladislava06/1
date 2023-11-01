package com.example.app;

import com.example.app.models.Note;
import com.example.app.utils.NoteWriter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите заметку: ");
        String content = scanner.nextLine();

        Note note = new Note(content);
        NoteWriter.write(note);

        System.out.println("Дозапись в файл: " + note.getTimestamp() + " -> " + note.getContent());
    }
}

