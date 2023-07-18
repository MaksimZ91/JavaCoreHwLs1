package ru.gb.repository;

import java.io.FileWriter;
import java.io.IOException;

public class Repository {

    public void write(String data) throws Exception{
        try(FileWriter fr = new FileWriter("log.txt", true)) {
            fr.write(data);
            fr.append(System.lineSeparator());
            fr.flush();
        } catch (IOException e) {
            throw new IOException(e);
        }
    }

}
