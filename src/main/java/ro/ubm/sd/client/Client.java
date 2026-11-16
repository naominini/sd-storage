package ro.ubm.sd.client;

import ro.ubm.sd.common.Args;

public class Client {
    public static void main(String[] argv) {
        Args a = new Args(argv);
        String coordinator = a.require("coordinator");
        System.out.println("[client] coordonator configurat: " + coordinator
                + "; comenzi: put, get, ls, rm, nodes, exit");
    }
}