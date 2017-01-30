package eu.vre4eic.evre.metadatamanager.model;

/**
 * MetadataType defines the different types of metadata that are expected to be 
 * used.
 * 
 * @author Yannis Marketakis (marketak 'at' ics 'dot' forth 'dot' gr)
 * //FORTH team to add their credits here
 */
public enum MetadataType {
    CONTENT_MD5_HASH,
    OWNER,
    LAST_MODIFICATION_DATE,
    CREATION_DATE, 
    MIME_TYPE,
    RESOURCE_LOCATION
}