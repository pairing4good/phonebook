# Phone Book Assignment

1. run `./gradlew build` on Mac or `gradlew.bat build` on Windows
1. Two tests will fail

    ```
    com.pairgood.phonebook.PhoneBookTest > listNames_ShouldListTheSameLastNameByTheFirstNameInAlphabeticalOrder FAILED
        org.junit.ComparisonFailure at PhoneBookTest.java:49
    
    com.pairgood.phonebook.PhoneBookTest > listNames_ShouldListLastNamesInAlphabeticalOrder FAILED
        org.junit.ComparisonFailure at PhoneBookTest.java:27
    
    2 tests completed, 2 failed
    
    ```
1. Make both tests pass.  The two methods that need to be implemented for this assignment are marked with `//todo`