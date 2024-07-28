

public class CDNConfiguration implements CDNPrototype {
    private String provider;
    private String apiKey;

    public CDNConfiguration(String provider, String apiKey) {
        this.provider = provider;
        this.apiKey = apiKey;
    }

    @Override
    public CDNPrototype clone() {
        return new CDNConfiguration(provider, apiKey);
    }

    // Getters and setters
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    

    @Override
    public String toString() {
        return "CDNConfiguration [provider=" + provider + ", apiKey=" + apiKey + "]";
    }
}
