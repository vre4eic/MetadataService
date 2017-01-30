package eu.vre4eic.evre.datamodelmapper.exceptions;

/** Generic exception messages for metadata retrieving facilities.
 * 
 * @author Yannis Marketakis (marketak 'at' ics 'dot' forth 'dot' gr)
 * //FORTH team to add their credits here
 */
public class MappingGenericException extends Exception{
    public MappingGenericException(){
        super("An error occured while managing mappings");
    }

    public MappingGenericException(String msg){
        super(msg);
    }
    
    public MappingGenericException(String msg, Throwable thr){
        super(msg,thr);
    }
}