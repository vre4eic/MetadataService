package eu.vre4eic.evre.datamodelmapper.model;

import eu.vre4eic.evre.metadatamanager.model.*;

/** MappingEntry is a POJO that is responsible for capturing particular 
 * information about managing mappings.
 * 
 * @author Yannis Marketakis (marketak 'at' ics 'dot' forth 'dot' gr)
 * //FORTH team to add their credits here
 */
public class MappingEntry {
    private String mappingID;
    private String mappingExpression;
    
    public MappingEntry(String mappingId, String mappingExpressionValue){
        this.mappingID=mappingId;
        this.mappingExpression=mappingExpressionValue;
    }

    public String getMappingID() {
        return this.mappingID;
    }

    public void setMappingID(String mappingID) {
        this.mappingID = mappingID;
    }
    
    public String getMappingExpression() {
        return this.mappingExpression;
    }

    public void setMappingExpression(String mappingExpression) {
        this.mappingExpression = mappingExpression;
    }

    @Override
    public String toString(){
        return this.mappingID+" - "+this.mappingExpression;
    }
}