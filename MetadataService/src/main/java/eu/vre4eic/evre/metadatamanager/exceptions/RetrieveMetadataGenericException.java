package eu.vre4eic.evre.metadatamanager.exceptions;

/** Generic exception messages for metadata retrieving facilities.
 * 
 * @author Yannis Marketakis (marketak 'at' ics 'dot' forth 'dot' gr)
 * //FORTH team to add their credits here
 */
public class RetrieveMetadataGenericException extends Exception{
    public RetrieveMetadataGenericException(){
        super("An error occured while retrieving metadata");
    }

    public RetrieveMetadataGenericException(String msg){
        super(msg);
    }
    
    public RetrieveMetadataGenericException(String msg, Throwable thr){
        super(msg,thr);
    }
}