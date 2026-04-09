package F.Ex53.enums;

public enum CategoryProduct {
    COMPUTER_AND_LAPTOPS("Devices designed for work, study, and entertainment, including desktops and portable laptops with different performance levels."),
    SMARTPHONES_AND_TABLETS("Mobile devices used for communication, internet access, apps, and media consumption."),
    PERIPHERALS_AND_ACCESSORIES("External devices and add-ons that enhance the functionality and usability of computers and other electronics."),
    HARDWARE_AND_COMPONENTS("Internal parts used to build, upgrade, or repair computers, such as processors, memory, and storage devices."),
    NETWORKING_AND_CONNECTIVITY("Devices that enable internet access and communication between devices, including routers, modems, and network adapters.");

    private final String message;
    CategoryProduct(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
