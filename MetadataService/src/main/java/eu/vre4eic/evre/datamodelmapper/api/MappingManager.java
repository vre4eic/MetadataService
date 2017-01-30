package eu.vre4eic.evre.datamodelmapper.api;

/**
 * The Model Mapper component is responsible for performing the required mappings
 * and storing the particular information (the mappings themselves) in its repository.
 * 
 * The MappingManager interface contains all the functionalities as regards the manipulation of mappings.
 * 
 * @author Yannis Marketakis (marketak 'at' ics 'dot' forth 'dot' gr)
 * //FORTH team to add their credits here
 */
public interface MappingManager {

    /** The method takes as input the ID of a mapping and returns the textual
     * representation of the mappings (i.e. as an X3ML file).
     * 
     * @param mappingID the identifier of the mapping
     * @return the string representation of the mapping
     */
    public String getMapping(String mappingID);
    
    /** The method takes as input a textual representation of a mapping 
     * (i.e. a X3ML file), and an ID and stores the mapping in the MappingManager catalogue.
     * 
     * @param mappingID the identifier of the mapping
     * @param mappingExpression the string representation of the mapping
     */
    public void addMapping(String mappingID, String mappingExpression);
    
    /** The method takes as input a textual representation of a mapping 
     * (i.e. a X3ML file), and an ID and updates an existing mapping in the MappingManager catalogue.
     * 
     * @param mappingID the identifier of the mapping
     * @param mappingExpression the string representation of the mapping
     */
    public void updateMapping(String mappingID, String mappingExpression);
    
    /** The method removes a mapping from the MappingManager catalogue using the 
     * mapping identifier. 
     * 
     * @param mappingID the identifier of the mapping
     */
    public void deleteMapping(String mappingID);
}