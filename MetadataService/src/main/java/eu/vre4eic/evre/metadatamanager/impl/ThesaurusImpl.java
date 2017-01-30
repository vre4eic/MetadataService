package eu.vre4eic.evre.metadatamanager.impl;

import eu.vre4eic.evre.metadatamanager.api.Thesaurus;
import java.util.Collection;

/**
 * The Metadata Manager is responsible for storing, manipulating and exposing 
 * metadata information about various resources. It contains a set of catalogues
 * and repositories and stores information with respect to a set of predefined schemas.
 * 
 * The Thesaurus interface is the part of the MetadataManager and is responsible 
 * for managing the different thesaurus of the infrastructure.
 * 
 * @author Yannis Marketakis (marketak 'at' ics 'dot' forth 'dot' gr)
 * //FORTH team to add their credits here
 */
public class ThesaurusImpl implements Thesaurus{

    @Override
    public Collection<String> getSuggestedTerms(String queryTerm) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Collection<String> getSimilarTerms(String queryTerm, int editDistance) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}