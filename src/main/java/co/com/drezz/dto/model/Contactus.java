package co.com.drezz.dto.model;

public class Contactus {
    private String reference;
    private String message;

    public Contactus( String reference, String message) {
                this.reference = reference;
        this.message = message;
    }


    public String getReference() {
        return reference;
    }

    public String getMessage() {
        return message;
    }


    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
