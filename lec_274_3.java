

public class lec_274_3 {

    public static class sports {
        String getName() {
            return "아직 결정되지 않음";
        }

        int getPlayers() {
            return 0;
        }
    }

    public static class Soccer extends sports{
        @Override
        String getName() {
            return "경기이름 : 축구";
        }
        @Override
        int getPlayers() {
            return 11;
        }

    }
    
    public static void main(String[] args) {
        Soccer soccer = new Soccer();
        System.out.println(soccer.getName());
        System.out.println("경기자수 : "+soccer.getPlayers());
    }
}//
