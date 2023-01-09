interface Camera {
    void SnapShot();
}

interface Wifi {
    String[] AllNetworks();

    void ConnectToNetwork(String network);
}

interface MusicPlayer {
    void PlayMusic();

    void PauseMusic();

    void FlowControl();
}

interface PlayStation {
    void PlayGame();
}

class CellPhone {

    void CallNumber(String phoneNumber) {
        System.out.println("Calling :" + phoneNumber);
    }

    void HangNumber() {
        System.out.println("Call Ended");
    }

}

class SmartPhone extends CellPhone {
    void SnapShot() {
        System.out.println("Picture taken successfully!");
    }

    String[] AllNetworks() {
        System.out.println("getting all networks");
        String[] NetworkList = { "Airtel", "Jio", "Idea", "BSNL" };
        for (String val : NetworkList) {
            System.out.printf("%d\t", val);
        }
        return NetworkList;
    }

    void ConnectToNetwork(String network) {
        System.out.println("Connected to :" + network);
    }

    void PlayMusic() {
        System.out.println("Music Played");
    }

    void PauseMusic() {
        System.out.println("Music Paused");
    }

    void FlowControl() {
        System.out.println("Next or Back");
    }

    void PlayGame(){
        System.out.println("Game ON!");
    }
  
}

class Interface_1 {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.SnapShot();
        // sp.AllNetworks();
     //    sp.ConnectToNetwork("MTS");  
        sp.PlayMusic();
        sp.PauseMusic();
        sp.FlowControl();
        sp.CallNumber("9631178431"); 
        sp.HangNumber();
        sp.PlayGame();
     }
}
