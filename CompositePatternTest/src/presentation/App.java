package presentation;

import java.util.Arrays;

import models.File;
import models.Folder;

public class App {
    public static void main(String[] args) throws Exception {
        Folder folder = new Folder("root", Arrays.asList(
                new File("bo1", 20),
                new File("bo2", 20),
                new File("bo3", 50),
                new File("bo4", 10),
                new Folder("folder1", Arrays.asList(new File("eheh", 100)))));

        System.out.println(folder);
    }
}
