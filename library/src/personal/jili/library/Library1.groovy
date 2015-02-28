package personal.jili.library

/**
 * Created by think on 2015/1/28.
 */


def library =['Groovy':['lilei','hanmeimei'],'OOD':['lilei'],'Java':['xiaoming','xiaohong'],'UML':['weixiao'],'Basic':['xiaobai']]

println"Test Case:Display loan stock1"
TestLibrary.displayLoanStock(library)

println"Test Case:Add a mew book"
TestLibrary.addBook(library,"C#")
TestLibrary.displayLoanStock(library)

println"Test Case :Remove a book"
TestLibrary.removeBook(library,'UML')
TestLibrary.displayLoanStock(library)

TestLibrary.lendBook(library,'Java','lilei')
println"Test Case:Record a book loan to a borrower"
TestLibrary.displayLoanStock(library)

TestLibrary.returnBook(library,'Java','xiaohong')
println"Test Case:Record a book return by a borrower"
TestLibrary.displayLoanStock(library)

println"Test Case:Display the number of books on loan to a borrower"
println"Number of books on loan to hanmeimei:${TestLibrary.readNumberBorrowedBooks(library,'lilei')}"

println"Test Case:Display the number of borrowers of a book"
println"Number of borrowers of Java:${TestLibrary.readNumberBorrowers(library,'Java')}\n"