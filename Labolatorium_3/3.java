class Author {

    private String name, email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author[" +
                "name=" + name +
                ",email=" + email +
                ",gender=" + gender +
                ']';
    }
}

class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, double price, Author[] authors, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public Book(String name, double price, Author[] authors) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public String getAuthorNames(){
        String s = "";
        for(Author auth: authors){
            s += auth.getName() + ",";
        }
        s = s.substring(0, s.length() - 1);
        return s;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        String authorsStrings = "";
        for(Author auth: authors){
            authorsStrings += auth + ", ";
        }
        authorsStrings = authorsStrings.substring(0, authorsStrings.length() - 2);
        return "Book[" +
                "name=" + name +
                ",price=" + price +
                ",authors=[" + authorsStrings +
                "],qty=" + qty +
                ']';
    }
}

   
    
