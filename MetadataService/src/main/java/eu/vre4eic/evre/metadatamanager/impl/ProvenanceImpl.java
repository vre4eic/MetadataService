package eu.vre4eic.evre.metadatamanager.impl;

import eu.vre4eic.evre.metadatamanager.api.Provenance;
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
public class ProvenanceImpl implements Provenance{

    @Override
    public Collection<Triple> getProvenanceMetadata(String resourceURI) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<Triple> getProvenanceMetadataUsingType(String resourceURI, ProvenanceMetadataType provenanceMetadataType) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void updateProvenanceMetadata(String resourceURI, ProvenanceMetadataType provenanceMetadataType, String metadataValue) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}