package co.f28smart.sgd.crud.properties;

public enum PropertiesKeys {
    
    SGD_COMMUNICATION_WS_WSDL("SGDCommunicationWS.wsdl");
    
    private String key;
    
    private PropertiesKeys ( String key ) {
        this.key = key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
