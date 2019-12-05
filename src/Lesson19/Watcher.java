package Lesson19;

import java.io.IOException;
import java.nio.file.*;

public class Watcher {
    public static void main(String[] args) throws IOException, InterruptedException {

        Path faxFolder = Paths.get("/Users/Andrii/IdeaProjects");
        WatchService watchService = FileSystems.getDefault().newWatchService();
        faxFolder.register(watchService, StandardWatchEventKinds.ENTRY_CREATE);

        boolean valid = true;
        do {
            WatchKey watchKey = watchService.take();

            for (WatchEvent event : watchKey.pollEvents()) {
                WatchEvent.Kind kind = event.kind();
                if (StandardWatchEventKinds.ENTRY_CREATE.equals(event.kind())) {
                    String fileName = event.context().toString();
                    System.out.println("File Created:" + fileName);
                }
            }
            valid = watchKey.reset();

        } while (valid);
    }
}
