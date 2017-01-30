package eu.vre4eic.evre.metadatamanager.api;

import eu.vre4eic.evre.metadatamanager.model.ProvenanceMetadataType;
import java.util.Collection;
import org.apache.commons.lang3.tuple.Triple;

/**
 * The Metadata Manager is responsible for storing, manipulating and exposing 
 * metadata information about various resources. It contains a set of catalogues
 * and repositories and stores information with respect to a set of predefined schemas.
 * 
 * The Provenance interface is the part of the MetadataManager and is responsible 
 * for managing provenance information for the various resources of the infrastructure.
 * 
 * @author Yannis Marketakis (marketak 'at' ics 'dot' forth 'dot' gr)
 * //FORTH team to add their credits here
 */
public interface Provenance {
    
    /**The method takes as input the URI of a resource and returns all the 
     * available provenance metadata of the resource as a collection of triples.
     * 
     * @param resourceURI the URI of the resource that has provenance information attached to it
     * @return a collection of triples describing provenance information about the given resource
     */
    public Collection<Triple> getProvenanceMetadata(String resourceURI);
    
    /**The method takes as input the URI of a resource and returns all the 
     * available provenance metadata of the given type as a collection of triples.
     * 
     * @param resourceURI the URI of the resource that has provenance information attached to it
     * @param provenanceMetadataType the type of the provenance metadata information that will searched for
     * @return a collection of triples describing provenance information about the given resource
     */
    public Collection<Triple> getProvenanceMetadataUsingType(String resourceURI, ProvenanceMetadataType provenanceMetadataType);
}