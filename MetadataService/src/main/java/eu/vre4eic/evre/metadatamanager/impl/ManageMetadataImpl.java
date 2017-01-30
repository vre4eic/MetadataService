package eu.vre4eic.evre.metadatamanager.impl;

import eu.vre4eic.evre.metadatamanager.api.ManageMetadata;
import eu.vre4eic.evre.metadatamanager.model.MetadataType;

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
public class ManageMetadataImpl implements ManageMetadata {

    @Override
    public void insertUpdateMetadata(String resourceURI, MetadataType metadataType, String metadataValue, String graphspace) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteMetadata(String resourceURI, String graphspace) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteMetadata(String resourceURI, MetadataType metadataType, String graphspace) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}