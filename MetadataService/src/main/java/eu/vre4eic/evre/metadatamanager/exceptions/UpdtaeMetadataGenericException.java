package eu.vre4eic.evre.metadatamanager.exceptions;

/** Generic exception messages for metadata updating facilities.
 * 
 * @author Yannis Marketakis (marketak 'at' ics 'dot' forth 'dot' gr)
 * //FORTH team to add their credits here
 */
public class UpdtaeMetadataGenericException extends Exception{
    public UpdtaeMetadataGenericException(){
        super("An error occured while updating metadata");
    }

    public UpdtaeMetadataGenericException(String msg){
        super(msg);
    }
    
    public UpdtaeMetadataGenericException(String msg, Throwable thr){
        super(msg,thr);
    }
}