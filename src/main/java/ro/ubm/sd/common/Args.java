package ro.ubm.sd.common;

import java.util.HashMap;
import java.util.Map;

public class Args {
    private final Map<String, String> values = new HashMap<>();

    public Args(String[] argv) {
        for (int i = 0; i < argv.length; i++) {
            if (!argv[i].startsWith("--")) continue;
            String key = argv[i].substring(2);
            if (i + 1 < argv.length && !argv[i + 1].startsWith("--")) {
                values.put(key, argv[++i]);
            } else {
                values.put(key, "");
            }
        }
    }

    public boolean has(String key) {
        return values.containsKey(key);
    }

    public String require(String key) {
        String v = values.get(key);
        if (v == null || v.isEmpty()) {
            System.err.println("Lipseste argumentul --" + key);
            System.exit(1);
        }
        return v;
    }
}