package Java8Features.inbuild;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {


        Supplier<String>  nameSupplier = () -> "Priyanshu";
        Supplier<String> citySupplier = () -> "noida";
        Supplier<String> languageSupplier = () -> "Java";

        System.out.println(nameSupplier.get());
        System.out.println(citySupplier.get());
        System.out.println(languageSupplier.get());


    }
}
