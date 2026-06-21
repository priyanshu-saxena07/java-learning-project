package Java8Features.inbuild;

import java.security.SecureRandom;
import java.util.Optional;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        // 1. Better Security: Cryptographically secure random number generator
        SecureRandom secureRandom = new SecureRandom();

        // 2. Clear Logic: 6-digit dynamic OTP supplier
        Supplier<Integer> otpSupplier = () -> 100000 + secureRandom.nextInt(900000);


        String userPhone = "9999999999";

        System.out.println("--- Sending OTP Safely ---");
        sendOtpToUser(userPhone, otpSupplier);
    }


    private static void sendOtpToUser(String phone, Supplier<Integer> otpProvider) {
        // Optional checks if phone is null, if null it safely triggers our supplier
        Optional.ofNullable(phone)
                .ifPresentOrElse(
                        p -> System.out.println("Sending OTP " + otpProvider.get() + " to " + p),
                        () -> System.out.println("Error: Phone number missing! Generated backup log OTP: " + otpProvider.get())
                );





    }
}
