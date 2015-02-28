package personal.jili.library

import personal.jili.library.console.Console

/**
 * Created by think on 2015/1/28.
 */
def readBookTitle(){
    print('\tEnter book title:')
    return Console.readLine()
}

def readBorrowerName(){
    print('\tEnter borrower name:')
    return Console.readLine()
}

def readMenuSelection(){
    println()
    println('0:Quit')
    println('1:Add new book')
    println('2:Remove book')
    println('3:Lend a book')
    println('4:Return a book')
    println('5:Display loan stock')
    println('6:Display number of books onloan to a borrower')
    println('7:Display number of borrower of a book')

    print('\n \tEnter choice:')
    return Console.readInteger()
}

def library =['Groovy':['lilei','hanmeimei'],'OOD':['lilei'],'Java':['xiaoming','xiaohong'],'UML':['weixiao'],'Basic':['xiaobai']]



def doAddBook = {TestLibrary.addBook(library,readBookTitle())}

def doRemoveBook = {TestLibrary.removeBook(library,readBookTitle())}

def doLendBook = {TestLibrary.lendBook(library,readBookTitle(),readBorrowerName())}

def doReturnBook = {TestLibrary.returnBook(library,readBookTitle(),readBorrowerName())}

def doDisplayLoanStock = {TestLibrary.displayLoanStock(library)}

def doDisplayNumberBooksOnLoanToBorrower = {
    def count = TestLibrary.readNumberBorrowedBooks(library,readBorrowerName())
    println"\nNumber of books borrowed:${count}\n"
}

def doDisplayNumberBorrowersOfBook={
    def count =TestLibrary.readNumberBorrowers(library,readBookTitle())
    println"\nNumber of borrower:${count}\n"
}

def menu =[1:doAddBook,
2:doRemoveBook,
3:doLendBook,
4:doReturnBook,
5:doDisplayLoanStock,
6:doDisplayNumberBooksOnLoanToBorrower,
7:doDisplayNumberBorrowersOfBook]

def choice = readMenuSelection()
while (choice!=0){
    menu.get(choice).call()
    choice =readMenuSelection()
}
