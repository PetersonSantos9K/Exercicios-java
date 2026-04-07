package C.Ex27;

public class SMS implements Messenger{

    private String messengerSms;

    public SMS(final String msg){
        this.messengerSms = msg;
    }

    @Override
    public String getRawContent() {
        return this.messengerSms;
    }
}
