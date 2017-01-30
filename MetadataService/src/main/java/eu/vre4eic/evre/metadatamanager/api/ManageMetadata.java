package eu.vre4eic.evre.metadatamanager.api;

import eu.vre4eic.evre.metadatamanager.model.MetadataType;
import java.util.Collection;
import org.apache.commons.lang3.tuple.Triple;

/**
 * The Metadata Manager is responsible for storing, manipulating and exposing 
 * metadata information about various resources. It contains a set of catalogues
 * and repositories and stores information with respect to a set of predefined schemas.
 * 
 * The ManageMetadata interface is the part of the MetadataManager that allows 
 * users to add new or to update information from the metadata catalogues.
 * 
 * @author Yannis Marketakis (marketak 'at' ics 'dot' forth 'dot' gr)
 * //FORTH team to add their credits here
 */
public interface ManageMetadata {
    
    /**The method updates (or adds if such information does not exist) particular 
     * information about the metadata of a resource. The type of the metadata
     * and the corresponding value are also given in the parameters list.  
     * The new triples is being added under the given graphspace.
     * 
     * @param resourceURI the URI of the resource that will be added or updated
     * @param metadataType the type of the metadata (e.g. owner of the dataset, mime type, etc.) that will be added or updated
     * @param metadataValue the actual value of the metadata field
     * @param graphspace the graphspace under which the new information will be added
     */
    public void insertUpdateMetadata(String resourceURI, MetadataType metadataType,
                                     String metadataValue, String graphspace);
    
    /**This methods deletes all the related information about a specific metadata resource 
     * from the given graphspace. If the given resource URI does not exist in the given 
     * graphspace then no delete operations take place.
     * This method removes all the metadata entries that are assigned to the given resource URI.
     * 
     * @param resourceURI the URI of the resource that will be removed from the metadata catalogue.
     * @param graphspace the graphspace under which the given resource URI exists. 
     */
    public void deleteMetadata(String resourceURI, String graphspace);
    
    /**This methods deletes information about a specific metadata resource 
     * from the given graphspace. If the given resource URI does not exist in the given 
     * graphspace or the resource does not have the corresponding metadata attached 
     * (i.e. the metadata type) then no delete operations take place.
     * 
     * @param resourceURI the URI of the resource that will be removed for the metadata catalogue.
     * @param metadataType the type of the metadata that will be removed from the metadataCatalogue
     * @param graphspace the graphspace under which the given resource URI exists. 
     */
    public void deleteMetadata(String resourceURI, MetadataType metadataType, String graphspace);
}