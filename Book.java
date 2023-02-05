public class Book {

  int id;
  String title;
  String author;
  String publisher;
  int yearOfPublication;
  int numberOfPages;
  int price;
  int typeOfBinding;

  public Book() {
  }

  public Book(int id, String title, String author, String publisher, int yearOfPublication,
              int numberOfPages,
              int price, int typeOfBinding) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.publisher = publisher;
    this.yearOfPublication = yearOfPublication;
    this.numberOfPages = numberOfPages;
    this.price = price;
    this.typeOfBinding = typeOfBinding;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public int getYearOfPublication() {
    return yearOfPublication;
  }

  public void setYearOfPublication(int yearOfPublication) {
    this.yearOfPublication = yearOfPublication;
  }

  public int getNumberOfPages() {
    return numberOfPages;
  }

  public void setNumberOfPages(int numberOfPages) {
    this.numberOfPages = numberOfPages;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getTypeOfBinding() {
    return typeOfBinding;
  }

  public void setTypeOfBinding(int typeOfBinding) {
    this.typeOfBinding = typeOfBinding;
  }

  @Override
  public String toString() {
    return "Book{" +
        "id=" + id +
        ", title='" + title + '\'' +
        ", author='" + author + '\'' +
        ", publisher='" + publisher + '\'' +
        ", yearOfPublication=" + yearOfPublication +
        ", numberOfPages=" + numberOfPages +
        ", price=" + price +
        ", typeOfBinding=" + typeOfBinding +
        '}';
  }
}