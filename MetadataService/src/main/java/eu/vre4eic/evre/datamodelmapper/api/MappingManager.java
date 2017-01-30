package eu.vre4eic.evre.datamodelmapper.api;

/**
 * The Model Mapper component is responsible for performing the required mappings
 * and storing the particular information (the mappings themselves) in its repository.
 * 
 * The ModelMapperData interface exposes the functionalities as regards the data transformation.
 * 
 * @author Yannis Marketakis (marketak 'at' ics 'dot' forth 'dot' gr)
 * //FORTH team to add their credits here
 */
public interface ModelMapperData {

    /** This method takes as input the textual description of some data a query
     * and a description of the target schema and is responsible for transforming 
     * them with respect to the target schema. The method returns the textual 
     * description of the transformed data.
     * 
     * @param originalData the raw data in their original form
     * @param targetSchema the schema describing the target format of the given raw data
     * @return the transformed data
     */
    public String transformData(String originalData, String targetSchema);
}
