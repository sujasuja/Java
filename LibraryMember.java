class LibraryItem:
    def _init_(self, title, itemID):
        self.title = title
        self.itemID = itemID
        self.checkedOut = False
    
    def checkOut(self):
        self.checkedOut = True
    
    def checkIn(self):
        self.checkedOut = False
    
    def displayItemDetails(self):
        print("Title:", self.title)
        print("Item ID:", self.itemID)
        print("Checked Out:", "Yes" if self.checkedOut else "No")
        

class Book(LibraryItem):
    def _init_(self, title, itemID, author, numPages):
        super()._init_(title, itemID)
        self.author = author
        self.numPages = numPages


class Magazine(LibraryItem):
    def _init_(self, title, itemID, issueDate, publisher):
        super()._init_(title, itemID)
        self.issueDate = issueDate
        self.publisher = publisher


class LibraryMember:
    def _init_(self, memberID, name):
        self.memberID = memberID
        self.name = name
    
    def displayMemberDetails(self):
        print("Member ID:", self.memberID)
        print("Name:", self.name)


# Create 5 Book objects
book1 = Book("The Great Gatsby", "B001", "F. Scott Fitzgerald", 180)
book2 = Book("To Kill a Mockingbird", "B002", "Harper Lee", 320)
book3 = Book("1984", "B003", "George Orwell", 328)
book4 = Book("Pride and Prejudice", "B004", "Jane Austen", 432)
book5 = Book("The Catcher in the Rye", "B005", "J.D. Salinger", 224)

# Create 5 Magazine objects
magazine1 = Magazine("National Geographic", "M001", "July 2023", "National Geographic Society")
magazine2 = Magazine("Time", "M002", "August 2023", "Time USA, LLC")
magazine3 = Magazine("Vogue", "M003", "June 2023", "Condé Nast")
magazine4 = Magazine("Scientific American", "M004", "September 2023", "Springer Nature")
magazine5 = Magazine("Forbes", "M005", "July 2023", "Forbes Media LLC")

# Create 5 LibraryMember objects
member1 = LibraryMember("L001", "John Smith")
member2 = LibraryMember("L002", "Jane Doe")
member3 = LibraryMember("L003", "Michael Johnson")
member4 = LibraryMember("L004", "Emily Davis")
member5 = LibraryMember("L005", "David Wilson")

# Set properties using setter methods (if available)
# For simplicity, we'll assume the properties are set in the constructor

# Call checkOut() and checkIn() methods on a library item
book1.checkOut()
book1.displayItemDetails()
book1.checkIn()
book1.displayItemDetails()

# Display details of all library items and members
print("Book Details:")
book1.displayItemDetails()
book2.displayItemDetails()
book3.displayItemDetails()
book4.displayItemDetails()
book5.displayItemDetails()

print("\nMagazine Details:")
magazine1.displayItemDetails()
magazine2.displayItemDetails()
magazine3.displayItemDetails()
magazine4.displayItemDetails()
magazine5.displayItemDetails()

print("\nMember Details:")
member1.displayMemberDetails()
member2.displayMemberDetails()
member3.displayMemberDetails()
member4.displayMemberDetails()
member5.displayMemberDetails()