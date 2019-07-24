package com.javaguru.lessons.lesson5;

public class BookTest {

    public static void main(String[] args) {
        BookTest testRunner = new BookTest();
        testRunner.shouldCheckIfBooksAreEqual();
        testRunner.shouldCheckOverride();
    }

    void shouldCheckIfBooksAreEqual() {
        Book testBook1 = new Book();
        testBook1.setBookAuthor("Dostoevskij");
        testBook1.setBookName("Prestuplenie i nakazaine");
        testBook1.setTotalPages(450);

        Book testBook2 = new Book();
        testBook2.setBookAuthor("Dostoevskij");
        testBook2.setBookName("Prestuplenie i nakazaine");
        testBook2.setTotalPages(450);

        String testName = "shouldCheckIfBooksAreEqual";
        boolean expectedResult = true;
        boolean actualResult = testBook1.equals(testBook2);

        printEqualBooksResult(expectedResult, actualResult, testName);

    }

    void shouldCheckOverride() {
        Book testBook1 = new Book();
        testBook1.setBookAuthor("Dostoevskij");
        testBook1.setBookName("Prestuplenie i nakazaine");
        testBook1.setTotalPages(450);

        String testName = "shouldCheckOverride";
        String expectedResult = "Book{bookAuthor='Dostoevskij', bookName='Prestuplenie i nakazaine', totalPages=450}";
        String actualResult = testBook1.toString();

        printOverrideResult(expectedResult, actualResult, testName);

    }


    void printEqualBooksResult(boolean expectedResult, boolean actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed");
            System.out.println("Expected: " + expectedResult + "; Actual: " + actualResult);
        }
    }

    void printOverrideResult(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed");
            System.out.println("Expected: " + expectedResult + "; Actual: " + actualResult);
        }
    }
}
