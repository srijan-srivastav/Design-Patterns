package DesignPatterns.StrategyPattern.RAM;

public class RAMSimpleFactory {
    public static IRAMConfig createRAMConfig(UserType userType) {
        if(userType == UserType.DEVELOPER) {
            return new DevRAMConfig();
        }
        else if(userType == UserType.PERSONAL) {
            return new PersonalRAMConfig();
        }
        else {
            throw new IllegalArgumentException();
        }
    }
}
