package chapter13_abstraction.interfaces;

public class AirConditionerController extends Button{
    private TemparatureUpButton temparatureUpButton;
    private TemparatureDownButton temparatureDownButton;
    private PowerButton powerButton;
    private Boolean status;
    public AirConditionerController(
            TemparatureDownButton temparatureDownButton,
            TemparatureUpButton temparatureUpButton,
            PowerButton powerButton
    ) {
        this.temparatureDownButton = temparatureDownButton;
        this.temparatureUpButton = temparatureUpButton;
        this.powerButton = powerButton;
    }


    @Override
    public void onPressed() {
        if(status) {    // status == true라면 실행되니까
            status = false;
            System.out.println("전원을 끕니다.");
        } else {        // status == false면 실행되니까
            status = true;
            System.out.println("전원을 켭니다.");
        }
    }
    public void airconpoweronoff() {powerButton.onPressed();}
    public void onSetTemparatureUpButton() {temparatureUpButton.onPressed();}
    public void onSetTemparatureDownButton() {temparatureDownButton.onPressed();}
    public void SetTemparatureUpButton() {temparatureUpButton.onUp();}
    public void SetTemparatureDownButton() {temparatureDownButton.onDown();}
}
