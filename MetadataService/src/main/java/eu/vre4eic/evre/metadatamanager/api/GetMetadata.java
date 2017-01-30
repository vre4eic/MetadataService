package eu.vre4eic.evre.metadatamanager.api;

import eu.vre4eic.evre.metadatamanager.model.MetadataType;
import java.util.Collection;
import org.apache.commons.lang3.tuple.Triple;

/**
 * The Metadata Manager is responsible for storing, manipulating and exposing 
 * metadata information about various resources. It contains a set of catalogues
 * and repositories and stores information with respect to a set of predefined schemas.
 * 
 * The Metadata Manager exposes its contents through the GetMetadata interface.
 * 
 * @author Yannis Marketakis (marketak 'at' ics 'dot' forth 'dot' gr)
 * //FORTH team to add their credits here
 */
public interface GetMetadata {
    
    /**The method takes as input a resource (either URI or literal value), and the corresponding graphspaces
     * and returns the contents of the metadata catalogue as a collection of triples 
     * (i.e. [S, P, O], where S=subject, P=predicate and O=Object). 
     * 
     * @param resourceURI the resource (either the URI or a literal value) that will be searched for
     * @param graphspaces the graphspaces that will be used for retrieving the given resource URI
     * 
     * @return a collection of triples, that exist in the given graphspaces, where the given resource URI exists.
     */
    public Collection<Triple> getResourceMetadata(String resourceURI, Collection<String> graphspaces);
    
    /**The method takes as input a resource (either URI or literal value), the type of the metadata field 
     * that will be searched and the corresponding graphspaces
     * and returns the contents of the metadata catalogue as a collection of triples 
     * (i.e. [S, P, O], where S=subject, P=predicate and O=Object). 
     * 
     * @param resource the resource (either the URI or a literal value) of that will be searched for
     * @param metadataType the type of the metadata field (e.g. owner of the dataset, mime type, etc.)
     * @param graphspaces the graphspaces that will be used for retrieving the given resource URI
     * 
     * @return a collection of triples, that exist in the given graphspaces, where the given resource exists.*/
    public Collection<Triple> getResourceMetadataUsingType(String resource, MetadataType metadataType, Collection<String> graphspaces);
    
    /** The method takes as input a set of queryTerms and the graphspaces to search 
     * for and searches in the metadata catalogues for these terms.
     * Finally it returns the results as a collection of triples.
     * 
     * @param queryTerms a set of query terms that will be searched in the metadata catalogues
     * @param graphspaces the graphspaces that will be used for retrieving the given resource URI
     * 
     * @return a collection of triples, that exist in the given graphspaces, where any of the requested terms exist.*/
    public Collection<Triple> searchForMetadata(Collection<String> queryTerms, Collection<String> graphspaces);
}