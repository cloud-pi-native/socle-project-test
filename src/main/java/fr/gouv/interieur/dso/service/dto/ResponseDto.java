package fr.gouv.interieur.dso.service.dto;

public class ResponseDto {
    private String message;
    private String status;

    /**
     * Getter method for message
     * 
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Setter method for message
     * 
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Getter method for status
     * 
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Setter method for status
     * 
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
