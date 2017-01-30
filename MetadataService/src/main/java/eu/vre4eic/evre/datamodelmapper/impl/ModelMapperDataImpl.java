package eu.vre4eic.evre.datamodelmapper.impl;

import eu.vre4eic.evre.datamodelmapper.api.ModelMapperData;

/**
 * The Model Mapper component is responsible for performing the required mappings
 * and storing the particular information (the mappings themselves) in its repository.
 * 
 * The ModelMapperData interface exposes the functionalities as regards the data transformation.
 * 
 * @author Yannis Marketakis (marketak 'at' ics 'dot' forth 'dot' gr)
 * //FORTH team to add their credits here
 */
public class ModelMapperDataImpl implements ModelMapperData{

    @Override
    public String transformData(String originalData, String targetSchema) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}