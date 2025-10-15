package AimsProject;

public class DigitalVideoDisc {
    // Các thuộc tính của DVD
    private String title;     // Tên của DVD
    private String category;  // Thể loại của DVD
    private String director;  // Đạo diễn của DVD
    private int length;       // Độ dài (thời gian) của DVD, tính bằng phút
    private double cost;      // Giá của DVD

    // Getter và setter cho các thuộc tính (Accessor và Mutator)

    // Accessor for title
    public String getTitle() {
        return title;
    }

    // Mutator for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Accessor for category
    public String getCategory() {
        return category;
    }

    // Mutator for category
    public void setCategory(String category) {
        this.category = category;
    }

    // Accessor for director
    public String getDirector() {
        return director;
    }

    // Mutator for director
    public void setDirector(String director) {
        this.director = director;
    }

    // Accessor for length
    public int getLength() {
        return length;
    }

    // Mutator for length
    public void setLength(int length) {
        this.length = length;
    }

    // Accessor for cost
    public double getCost() {
        return cost;
    }

    // Mutator for cost
    public void setCost(double cost) {
        this.cost = cost;
    }

    // Phương thức hiển thị thông tin DVD (tuỳ chọn)
    public void displayDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Category: " + this.category);
        System.out.println("Director: " + this.director);
        System.out.println("Length: " + this.length + " minutes");
        System.out.println("Cost: $" + this.cost);
    }
}


