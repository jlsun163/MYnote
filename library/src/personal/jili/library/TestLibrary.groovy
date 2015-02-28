package personal.jili.library

/**
 * Created by think on 2015/1/28.
 */
class TestLibrary {
    def static addBook(library,bookTitle){
        library[bookTitle]=[]
    }

    def static removeBook(library,bookTitle){
        library.remove(bookTitle)
    }

    def static lendBook(library,bookTitle,borrowerName){
        library[bookTitle]<<borrowerName
    }

    def static returnBook(library,bookTitle,borrowerName){
        library[bookTitle].remove(borrowerName)
    }


    def static displayLoanStock(library){
        println"TestLibrary stock:${library}\n"
    }

    def static readNumberBorrowedBooks(library,borrowerName){
        def borrowerNames =library.values().asList()

        borrowerNames = borrowerNames.flatten()

        return borrowerNames.count(borrowerName)
    }

    def static readNumberBorrowers(library,bookTitle){
        return library[bookTitle].size()
    }

}
