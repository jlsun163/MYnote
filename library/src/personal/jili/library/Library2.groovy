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
    return Console.readLine()
}

def library =['Groovy':['lilei','hanmeimei'],'OOD':['lilei'],'Java':['xiaoming','xiaohong'],'UML':['weixiao'],'Basic':['xiaobai']]

def choice = readMenuSelection()

while (choice!='0'){

    if (choice=='1')
        TestLibrary.addBook(library,readBookTitle())
    else if (choice=='2')
        TestLibrary.removeBook(library,readBookTitle())
    else if (choice=='3')
        TestLibrary.lendBook(library,readBookTitle(),readBorrowerName())
    else if(choice=='4')
        TestLibrary.returnBook(library,readBookTitle(),readBorrowerName())
    else if(choice=='5')
        TestLibrary.displayLoanStock(library)
    else if(choice=='6'){
        def count = TestLibrary.readNumberBorrowedBooks(library,readBorrowerName())
        println("\nNumber of borrowers:${count}")
    }else if (choice=='7'){
        def count = TestLibrary.readNumberBorrowers(library,readBookTitle())
        println"\nNumber of borrower :$count \n"
    }else {
        println"\nUnknown selection \n"

        choice = readMenuSelection()
    }

    println"\nSystem closing\n"

}
