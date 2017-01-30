package eu.vre4eic.evre.metadatamanager.impl;

import eu.vre4eic.evre.metadatamanager.api.GetMetadata;
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
public class GetMetadataImpl implements GetMetadata{

    @Override
    public Collection<Triple> getResourceMetadata(String resourceURI, Collection<String> graphspaces) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<Triple> getResourceMetadataUsingType(String resource, MetadataType metadataType, Collection<String> graphspaces) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<Triple> searchForMetadata(Collection<String> queryTerms, Collection<String> graphspaces) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}