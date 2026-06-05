package Week_1.OOPS;

public class LibraryInterface {
    
}
// 1. Create the LibraryUser interface
interface LibraryUser {
    void registerAccount();
    void requestBook();
}

// 2 & 3. Create KidUser class with instance variables
class KidUser implements LibraryUser {
    int age;
    String bookType;

    // Setter methods to easily assign values
    public void setAge(int age) {
        this.age = age;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    // 4. Implement KidUser logic
    @Override
    public void registerAccount() {
        if (age < 12) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    @Override
    public void requestBook() {
        if ("Kids".equals(bookType)) {
            System.out.println("Book Issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}

// 2 & 3. Create AdultUser class with instance variables
class AdultUser implements LibraryUser {
    int age;
    String bookType;

    // Setter methods to easily assign values
    public void setAge(int age) {
        this.age = age;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    // 5. Implement AdultUser logic
    @Override
    public void registerAccount() {
        if (age > 12) {
            System.out.println("You have successfully registered under an Adult Account");
        } else {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }

    @Override
    public void requestBook() {
        if ("Fiction".equals(bookType)) {
            System.out.println("Book Issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}

// 6. Create the main demo class to test the logic
public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        
        System.out.println("---------- TEST CASE #1: KidUser ----------");
        KidUser kidUser = new KidUser();
        
        // Testing Age
        kidUser.setAge(10);
        kidUser.registerAccount();
        
        kidUser.setAge(18);
        kidUser.registerAccount();
        
        // Testing BookType
        kidUser.setBookType("Kids");
        kidUser.requestBook();
        
        kidUser.setBookType("Fiction");
        kidUser.requestBook();
        
        System.out.println("\n---------- TEST CASE #2: AdultUser ----------");
        AdultUser adultUser = new AdultUser();
        
        // Testing Age
        adultUser.setAge(5);
        adultUser.registerAccount();
        
        adultUser.setAge(23);
        adultUser.registerAccount();
        
        // Testing BookType
        adultUser.setBookType("Kids");
        adultUser.requestBook();
        
        adultUser.setBookType("Fiction");
        adultUser.requestBook();
    }
}