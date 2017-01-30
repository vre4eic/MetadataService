package eu.vre4eic.evre.metadatamanager.api;

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
public interface Thesaurus {
    
    /**The method takes as input a queryTerm, and searches in the catalogue 
     * maintained by the Thesaurus component for suggested terms. 
     * For instance if the queryTerm is “inf” then it will return (among others) 
     * the terms “infrastructure”, “inference”, etc.
     * 
     * @param queryTerm a part of the queryTerms that will be searched in thesaurus
     * @return a ranked list with the suggested terms 
     */
    public Collection<String> getSuggestedTerms(String queryTerm);
    
    /**The method takes as input a queryTerm and a value for the editDistance
     * function to perform spell checking. It returns a ranked collection of potential 
     * corrections for the given query term.
     * 
     * @param queryTerm the term to be used as a basis for finding similar terms
     * @param editDistance the value indicating the similarity for finding similar terms
     * @return a ranked list with the similar terms
     */
    public Collection<String> getSimilarTerms(String queryTerm, int editDistance);
}