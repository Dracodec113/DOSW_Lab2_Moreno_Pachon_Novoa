/**
 * Class that reads the users demands and send the information 
 * to the logical part of the system
 */

public record RequestReader(String family, String model, Category category){}