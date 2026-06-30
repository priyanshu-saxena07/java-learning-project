package Java8Features.inbuild;

import java.util.Optional;

record User(String email) {}

public class StreamPractice {
    public static void main(String[] args) {
          User user = new User(null);

             String result =  Optional.of(user)
                    .map(User::email)
                    .orElse("Email Not Provided");

        System.out.println(result);
    }


    }



//  List<Integer> numbers = Arrays.asList(10,20,20,30,40,40,50);
//
//           numbers.stream()
//                .distinct()
//                .mapToInt(Integer::intValue)
//                   .forEach(System.out::println);