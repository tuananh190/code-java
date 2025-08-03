public class SC {
    public static void main(String[] args) {
        int n = 7; // n không trùng với case nào
        switch (n) {
            case 5:
                System.out.println("This is case 5.");
                break;
            default:
                System.out.println("Không có case nào khớp cả.");
                
            case 4:
                System.out.println("This is case 4.");
                break;
        }
    }
}