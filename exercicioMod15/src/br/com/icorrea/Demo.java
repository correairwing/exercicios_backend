package br.com.icorrea;

public class Demo {
    public static void main(String[] args) {
        Customer cliente = new Customer("B", true);
        Factory factory = getFactory(cliente);
        factory.create(cliente.getGradeRequest());
    }

    private static Factory getFactory(Customer cliente) {
        if (cliente.isAutomatic()) {
            return new Automaticos();
        } else {
            return new Manuais();
        }
    }
}
