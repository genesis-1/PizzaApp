/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author Ntwali
 */
public class ExceptionFactory {public static void throwException(String className)
            throws CheckedException, UncheckedException {

        Class<?> exceptionClass;

        try {
            exceptionClass = Class.forName(className);
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException(e);
        }

        try {
            if (CheckedException.class.isAssignableFrom(exceptionClass)) {
                throw exceptionClass.asSubclass(CheckedException.class)
                        .newInstance();
            } else if (UncheckedException.class
                    .isAssignableFrom(exceptionClass)) {
                throw exceptionClass.asSubclass(UncheckedException.class)
                        .newInstance();

            } else {
                throw new IllegalArgumentException(
                        "Not a valid exception type: "
                                + exceptionClass.getName());
            }
        } catch (InstantiationException | IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

//    public static void main(String... args) {
//        try {
//            throwException("CheckedException");
//        } catch (CheckedException e) {
//            System.out.println(e);
//        } catch (UncheckedException e) {
//            System.out.println(e);
//        }
//    }
}