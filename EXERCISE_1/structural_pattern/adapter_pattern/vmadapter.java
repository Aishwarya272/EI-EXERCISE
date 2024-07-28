
interface VirtualMachine {
    void startVM();
    void stopVM();
    void restartVM();
}

// Adaptee for Linux
class Linux {
    public void boot() {
        System.out.println("Linux VM started.");
    }

    public void shutdown() {
        System.out.println("Linux VM stopped.");
    }

    public void reboot() {
        System.out.println("Linux VM restarted.");
    }
}

// Adaptee for Ubuntu
class Ubuntu {
    public void powerOn() {
        System.out.println("Ubuntu VM started.");
    }

    public void powerOff() {
        System.out.println("Ubuntu VM stopped.");
    }

    public void reset() {
        System.out.println("Ubuntu VM restarted.");
    }
}

// Adapter for Linux
class LinuxAdapter implements VirtualMachine {
    private Linux linux;

    public LinuxAdapter(Linux linux) {
        this.linux = linux;
    }

    @Override
    public void startVM() {
        linux.boot();
    }

    @Override
    public void stopVM() {
        linux.shutdown();
    }

    @Override
    public void restartVM() {
        linux.reboot();
    }
}

// Adapter for Ubuntu
class UbuntuAdapter implements VirtualMachine {
    private Ubuntu ubuntu;

    public UbuntuAdapter(Ubuntu ubuntu) {
        this.ubuntu = ubuntu;
    }

    @Override
    public void startVM() {
        ubuntu.powerOn();
    }

    @Override
    public void stopVM() {
        ubuntu.powerOff();
    }

    @Override
    public void restartVM() {
        ubuntu.reset();
    }
}
