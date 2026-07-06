package com.example.openai.streaming;

import java.io.FileWriter;
import java.io.IOException;

public class StreamHandler {

    private FileWriter logWriter;

    public StreamHandler(String logPath) {
        try {
            logWriter = new FileWriter(logPath, true);
        } catch (IOException e) {
            System.err.println("Failed to open log file: " + e.getMessage());
        }
    }

    public void processChunk(String chunk) {
        System.out.println(chunk);
        if (logWriter != null) {
            try {
                logWriter.write(chunk);
                logWriter.write("\n");
            } catch (IOException e) {
            }
        }
    }

    public void close() {
        if (logWriter != null) {
            try {
                logWriter.close();
            } catch (IOException e) {
            }
        }
    }
}
