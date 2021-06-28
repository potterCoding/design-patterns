package command.remote;

/**
 * @author: Java伴我余生
 * @date: 2021-06-28
 * @description: 逐步测试遥控器
 *
 * RemoteLoader创建许多命令对象，然后将其加载到遥控器的插槽中
 * 每个命令对象都封装了某个家电自动化装置的一项请求
 */
public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        /*************将所有装置创建在合适的位置******************/
        Light livingRoomLight = new Light("Living Room"); // 起居室
        Light kitchenLight = new Light("Kitchen"); // 厨房
        CeilingFan ceilingFan= new CeilingFan("Living Room"); // 起居室
        GarageDoor garageDoor = new GarageDoor("Garage"); // 车库
        Stereo stereo = new Stereo("Living Room"); // 起居室

        /**************创建打开和关闭起居室电灯的命令*************/
        LightOnCommand livingRoomLightOn =
                new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff =
                new LightOffCommand(livingRoomLight);

        /**************创建打开和关闭厨房电灯的命令*************/
        LightOnCommand kitchenLightOn =
                new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff =
                new LightOffCommand(kitchenLight);

        /**************创建打开和关闭吊扇的命令*************/
        CeilingFanOnCommand ceilingFanOn =
                new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff =
                new CeilingFanOffCommand(ceilingFan);

        /**************创建车库门的上与下的命令*************/
        GarageDoorUpCommand garageDoorUp =
                new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown =
                new GarageDoorDownCommand(garageDoor);

        /**************创建音响的开与关的命令*************/
        StereoOnWithCDCommand stereoOnWithCD =
                new StereoOnWithCDCommand(stereo);
        StereoOffCommand  stereoOff =
                new StereoOffCommand(stereo);

        /**************现在已经有了全部的命令，可以将它们加载到遥控器插槽中*************/
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

        // 在这里，使用toString()方法，打印出每个遥控器的插槽和它被指定的命令
        System.out.println(remoteControl);

        /**************好了，一切准备就绪*************/
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);

        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
    }
}
