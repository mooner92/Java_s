public class hw_129_13 {
    public static void main(String[] args) {
        String[][] kinds = { { "Clubs", "Diamonds", "Hearts", "Spades" },
                                { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" } };
        for (int i = 0; i < 5; i++) 
            System.out.println(kinds[0][(int) (Math.random() * 100) % 4] + "의 " + kinds[1][(int) (Math.random() * 100) % 12]);
    }
}//
