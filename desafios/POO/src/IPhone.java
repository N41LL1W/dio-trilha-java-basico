public class IPhone {
    private Ipod ipod;
    private Phone phone;
    private Safari safari;

    public IPhone() {
        this.ipod = new Ipod();
        this.phone = new Phone();
        this.safari = new Safari();
    }

    public void turnOn() {
        System.out.println("iPhone is now ON.");
        letMeTouch();
    }

    private void letMeTouch() {
        System.out.println("Choose an option: Music, Phone, Internet");

        // Simulação de interação do usuário
        String userInput = "Music"; // substitua pela lógica de entrada do usuário

        switch (userInput) {
            case "Music":
                ipod.showMenu();
                break;
            case "Phone":
                phone.showMenu();
                break;
            case "Internet":
                safari.showMenu();
                break;
            default:
                System.out.println("Invalid option");
                letMeTouch();
                break;
        }
    }
}