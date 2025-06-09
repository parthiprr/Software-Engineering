class Product {
    private String name;
    private double price;

    private Product(ProductBuilder builder) {
        this.name = builder.name;
        this.price = builder.price;
    }

    public void showDetails() {
        System.out.println("Product: " + name + ", Price: " + price);
    }

    static class ProductBuilder {
        private String name;
        private double price;

        public ProductBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}

public class BuilderDemo {
    public static void main(String[] args) {
        Product product = new Product.ProductBuilder()
                .setName("Laptop")
                .setPrice(1000.00)
                .build();

        product.showDetails();
    }
}
