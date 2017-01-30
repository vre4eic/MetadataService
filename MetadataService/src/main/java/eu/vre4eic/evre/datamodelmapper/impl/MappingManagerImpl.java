package eu.vre4eic.evre.datamodelmapper.impl;

import eu.vre4eic.evre.datamodelmapper.api.MappingManager;

/**
 * The Model Mapper component is responsible for performing the required mappings
 * and storing the particular information (the mappings themselves) in its repository.
 * 
 * The MappingManager interface contains all the functionalities as regards the manipulation of mappings.
 * 
 * @author Yannis Marketakis (marketak 'at' ics 'dot' forth 'dot' gr)
 * //FORTH team to add their credits here
 */
public class MappingManagerImpl implements MappingManager{

    @Override
    public String getMapping(String mappingID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addMapping(String mappingID, String mappingExpression) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void updateMapping(String mappingID, String mappingExpression) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteMapping(String mappingID) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}