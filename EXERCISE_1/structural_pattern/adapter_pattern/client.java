// Client.java

public class client {
    public static void main(String[] args) {
        // Creating instances of adaptees
        Linux linux = new Linux();
        Ubuntu ubuntu = new Ubuntu();

        // Creating adapters for the adaptees
        VirtualMachine linuxVM = new LinuxAdapter(linux);
        VirtualMachine ubuntuVM = new UbuntuAdapter(ubuntu);

        // Using the adapters
        System.out.println("Managing Linux VM:");
        linuxVM.startVM();
        linuxVM.stopVM();
        linuxVM.restartVM();

        System.out.println("\nManaging Ubuntu VM:");
        ubuntuVM.startVM();
        ubuntuVM.stopVM();
        ubuntuVM.restartVM();
    }
}
