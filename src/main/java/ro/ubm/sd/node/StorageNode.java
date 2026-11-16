package ro.ubm.sd.node;

import ro.ubm.sd.common.Args;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class StorageNode {
    public static void main(String[] argv) throws IOException {
        Args a = new Args(argv);
        String id = a.require("id");
        int port = Integer.parseInt(a.require("port"));
        Path dir = Path.of(a.require("dir"));
        Files.createDirectories(dir);
        String rol = a.has("coordinator") ? "coordonator" : "nod de stocare";
        System.out.printf("[%s] pornit: port %d, director %s, rol: %s%n", id, port, dir, rol);
    }
}