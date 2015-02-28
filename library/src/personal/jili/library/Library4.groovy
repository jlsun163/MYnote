package personal.jili.library

/**
 * Created by think on 2015/1/29.
 */
class Book{
    def attachBorrower(borrower){
        this.borrower = borrower
    }

    def detachBorrower(){
        borrower =null
    }

    String toString(){
        return "Book:${catalogNumber}:${title} by :${author}"
    }
    def catalogNumber
    def title
    def author
    def borrower =null
}

class Borrower{
    def attachBook(bk){
        borrowedBooks[bk.catalogNumber]=bk
        bk.attachBorrower(this)
    }

    def detachBook(bk){
        borrowedBooks.remove(bk.catalogNumber)
        bk.detachBorrower()
    }

    def membershipNumber
    def name
    def borrowedBooks =[:]
}

class Library{
    def addBook(bk){
        loanStock[bk.catalogNumber]=bk
    }
    def displayStock(){
        println"Library:${name}"
        println"================"

        loanStock.each{catalogNumber,book->println"${book}"}
    }

    def displayBooksAvailableForLoan(){
        println"\n\nLibrary :${name}:Avalable for loan"
        println'=============='

        loanStock.each {catalogNumber,book->if(book.borrower==null)println"${book}"}
    }

    def displayBookOnLoan(){
        println"\n\nLibrary:${name}:On loan"
        println'================='

        loanStock.each {catalogNumber,book->if(book.borrower!=null)println"${book}"}
    }

    def registerBorrower(borrower){
        borrowers[borrower.membershipNumber]=borrower
    }

    def displayBorrower(){
        println"\n\nLibrary:${name}:Borrower details"
        println'================='

        borrowers.each {membershipNumber,borrower->
            println borrower
            borrower.borrowedBooks.each{catalogNumber,book->println"${book}"}
        }
    }

    def lendBook(catalogNumber,membershipNumber){
        def loanStockEntry =loanStock.find {entry->entry.key ==catalogNumber}
        def borrowersEntry = borrowers.find {entry->entry.key ==membershipNumber}
        borrowersEntry.value.attachBook(loanStockEntry.value)
    }

    def returnBook(catalogNumber){
        def loanStockEntry = loanStock.find {entry->entry.key ==catalogNumber}
        def bor = loanStockEntry.value.borrower
        bor.detachBook(loanStockEntry.key)
    }


    def name
    def loanStock =[:]
    def borrowers =[:]
}

def lib = new Library(name: 'Dunning')

def bk1 = new Book(catalogNumber: '111',title: 'Groovy',author: 'lilei')

lib.addBook(bk1)

lib.displayStock()


bo1 = new Borrower(membershipNumber: '1234',name: 'hanmeimei')

lib.registerBorrower(bo1)


lib.displayBorrower()

lib.displayBooksAvailableForLoan()

lib.lendBook('111','1234')

lib.displayBooksAvailableForLoan()
lib.displayBookOnLoan()
lib.displayBorrower()

//lib.returnBook('111')
//
//lib.displayBooksAvailableForLoan()
//lib.displayBookOnLoan()
//lib.displayBorrower()
