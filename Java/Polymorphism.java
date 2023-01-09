interface Camera2 {
    void SnapShot2();
    void VideoShot2();
}

interface Wifi2 {
    String[] AllNetworks();

    void ConnectToNetwork2(String network);
}

interface MusicPlayer2 {
    void PlayMusic();

    void PauseMusic();

    void FlowControl();
}

interface PlayStation2 {
    void PlayGame2();
}

class CellPhone2 {

    void CallNumber2(String phoneNumber) {
        System.out.println("Calling :" + phoneNumber);
    }

    void HangNumber2() {
        System.out.println("Call Ended");
    }

}

class SmartPhone2 extends CellPhone2 {
    void SnapShot2() {
        System.out.println("Picture taken successfully!");
    }

    void VideoShot2(){
        System.out.println("Recording Started in 4k...");
    }

    String[] AllNetworks2() {
        System.out.println("getting all networks");
        String[] NetworkList = { "Airtel", "Jio", "Idea", "BSNL" };
        for (String val : NetworkList) {
            System.out.printf("%d\t", val);
        }
        return NetworkList;
    }

    void ConnectToNetwork2(String network) {
        System.out.println("Connected to :" + network);
    }

    void PlayMusic2() {
        System.out.println("Music Played");
    }

    void PauseMusic2() {
        System.out.println("Music Paused");
    }

    void FlowControl2() {
        System.out.println("Next or Back");
    }

    void PlayGame2(){
        System.out.println("Game ON!");
    }
  
}

class Polymorphism{
    public static void main(String[] args) {
        
        Camera2 cam = new SmartPhone2();
        cam.SnapShot2();
    
     }
}
