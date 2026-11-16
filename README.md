# sd-storage

Sistem distribuit de stocare a fisierelor: fiecare fisier are doua copii pe noduri distincte
si ramane accesibil cand un nod cade. Proiect la Sisteme Distribuite.

## Membrii echipei

- Florian Naomi Natalia
- Villani Darius Raul

## Tehnologii folosite

- Java 21
- Maven
- Git

## Compilare

```bash
mvn package
```

## Pornire (fiecare proces in terminal separat)
```bash
# nodul coordonator (temporar, stabilit prin argument)
java -cp target/classes ro.ubm.sd.node.StorageNode --id n1 --port 7001 --dir data/n1 --coordinator
# noduri de stocare
java -cp target/classes ro.ubm.sd.node.StorageNode --id n2 --port 7002 --dir data/n2
java -cp target/classes ro.ubm.sd.node.StorageNode --id n3 --port 7003 --dir data/n3
# client
java -cp target/classes ro.ubm.sd.client.Client --coordinator localhost:7001
```