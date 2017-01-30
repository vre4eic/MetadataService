package eu.vre4eic.evre.metadatamanager.model;

/**
 * @author Yannis Marketakis (marketak 'at' ics 'dot' forth 'dot' gr)
 */
public class MetadataEntry {
    private String resourceUri;
    private String resourceValue;
    private MetadataType metadataType;
    
    public MetadataEntry(String metadataResourceUri, String metadataResourceValue, MetadataType metadataResourceType){
        this.resourceUri=metadataResourceUri;
        this.resourceValue=metadataResourceValue;
        this.metadataType=metadataResourceType;
    }

    public String getResourceUri() {
        return this.resourceUri;
    }

    public void setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
    }

    public String getResourceValue() {
        return this.resourceValue;
    }

    public void setResourceValue(String resourceValue) {
        this.resourceValue = resourceValue;
    }

    public MetadataType getMetadataType() {
        return this.metadataType;
    }

    public void setMetadataType(MetadataType metadataType) {
        this.metadataType = metadataType;
    }

    @Override
    public String toString(){
        return this.resourceUri+" - "+this.resourceValue+" - "+this.metadataType;
    }
}