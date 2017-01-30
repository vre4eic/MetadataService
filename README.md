# MetadataService
The e-VRE component responsible for storing and managing resource catalogues. These functionalities are provided by exploiting various components (i.e. MetadataManager, DataModelMapper, etc.).

## Structural View

MetadataService has been developed as a JAVA maven project. It consists of different components, therefore it is important to separate the developement spaces for these components.
All the different components are placed under the eu.vre4eic.evre package. After that follows another package that groups together the resources 
of a particular component (i.e. eu.vre4eic.evre.metadatamanager contains all the resources of the corresponding component).

For each component we use different packages for grouping together resources that are used for a particular reason.
More specifically we use the following packages:

* **api**: for adding the interfaces of the components. These are the contractual interfaces that are also visible from other components.
* **impl**: for adding the actual implementation (or different implementations) of the interfaces that are found under the api package.
* **model**: for adding the structural components that are required (i.e. POJOs)
* **exceptions**: for adding the corresponding exceptions-related resources 
* **test**: for adding the resources that are needed for testing the components 

Furthermore for grouping the resources that are exploited throughout all the components we have created a commons package (found under eu.vre4eic.evre.commons)
