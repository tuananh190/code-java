public class EqualEx{

    // Ví dụ 1: Không override equals => So sánh theo địa chỉ bộ nhớ
    static class dog {
        String name;

        dog(String name) {
            this.name = name;
        } 
    }
    // Ví dụ 2: Override equals => So sánh theo giá trị
    static class cat {
        String name;

        cat(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true; // So sánh địa chỉ bộ nhớ
            if (!(obj instanceof cat)) return false; // Kiểm tra kiểu đối tượng

            cat other = (cat) obj; // Ép kiểu
            return this.name.equals(other.name); // So sánh tên

        }
    }

    //Ví dụ 3: Override  hashCode
    static class person{
        String name;
        int age;

        person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int hashCode() {
            int result = name.hashCode(); // Tính toán hashCode dựa trên tên
            result = 31 * result + age; // Kết hợp với tuổi
            return result; // Trả về giá trị hashCode
        }
    }    
    public static void main(String[] args) {
    // Ví dụ 1: Không override equals => So sánh theo địa chỉ bộ nhớ
    dog d1 = new dog("Rex");
    dog d2 = new dog("Rex");

   System.out.println("dog equals" + d1.equals(d2));

    // Ví dụ 2: Override equals => So sánh theo giá trị
    cat c1 = new cat("Mimi");
    cat c2 = new cat("Mimi");

    System.out.println("cat equals" + c1.equals(c2)); 



    //Ví dụ 3: Override hashCode
    person p1 = new person("Alice", 30);
    person p2 = new person("Alice", 30);
    System.out.println( p2.hashCode());
    
    
    }

}


