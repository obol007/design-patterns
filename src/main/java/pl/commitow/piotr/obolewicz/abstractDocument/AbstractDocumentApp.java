package pl.commitow.piotr.obolewicz.abstractDocument;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class AbstractDocumentApp {

    public static void main(String[] args) {

        ConcreteDocument concreteDocument = new ConcreteDocument();
        concreteDocument.put("age", 30);
        concreteDocument.put("Name", "Piotr");

        Integer age = concreteDocument.get("age", Integer.class).orElse(0);
        String name = (String) concreteDocument.get("Name");

        log.info("Name: {}, age: {}", name, age);

    }
}
