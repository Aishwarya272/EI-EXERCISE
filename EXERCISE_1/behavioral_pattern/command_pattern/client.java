

public class client {
    public static void main(String[] args) {
        // Create receivers
        Light light = new Light();
        Fan fan = new Fan();

        // Create commands
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command fanStart = new FanStartCommand(fan);
        Command fanStop = new FanStopCommand(fan);

        // Create invoker
        RemoteControl remote = new RemoteControl();

        // Use remote to turn on the light
        remote.setCommand(lightOn);
        remote.pressButton();

        // Use remote to turn off the light
        remote.setCommand(lightOff);
        remote.pressButton();

        // Use remote to start the fan
        remote.setCommand(fanStart);
        remote.pressButton();

        // Use remote to stop the fan
        remote.setCommand(fanStop);
        remote.pressButton();
    }
}
