
public class PrototypePattern {
    public static void main(String[] args) {
        // Create an initial CDN configuration
        CDNConfiguration originalConfig = new CDNConfiguration("Cloudflare", "123456789");

        // Clone the original configuration to create a new configuration
        CDNConfiguration newConfig = (CDNConfiguration) originalConfig.clone();

        // Modify the new configuration as needed
        newConfig.setApiKey("333444422");

        // Print configurations to verify
        System.out.println("Original Configuration: " + originalConfig);
        System.out.println("New Configuration: " + newConfig);
    }
}
