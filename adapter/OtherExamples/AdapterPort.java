public class AdapterPort {

	/**
	 * This main method runs an example.
	 * 
	 * @param args
	 *            not used
	 */
	public static void main(String[] args) {

		HdmiPort myHDMIPort=new HdmiPort("MyFace", "MySound");
		VGA_Port myVGAPort=new VGA_Port();
		
		
		HDMI_To_VGA_Adapter hdmiToVGA= new HDMI_To_VGA_Adapter(myVGAPort);

		hdmiToVGA.adapt(myHDMIPort);
	}
}
interface DisplayPort {

	public void display();
	
}


class HDMI_To_VGA_Adapter implements DisplayPort, SoundPort {

	private VGA_Port vgaPort;

	public HDMI_To_VGA_Adapter(VGA_Port vgaPort) {
		this.setVgaPort(vgaPort);
	}

	@Override
	public void display() {
		vgaPort.display();
	}

	@Override
	public void makeSound() {
		System.out.println("No sound can be transfered by VGA port.");
	}

	/**
	 * Fist adapt the port and then display it.
	 * 
	 * @param hdmi port
	 */
	public void adapt(HdmiPort hdmi) {
		vgaPort.setVisualData(hdmi.getVisualData());
		this.display();
		this.makeSound();
	}

	/**
	 * @return the vgaPort
	 */
	public VGA_Port getVgaPort() {
		return vgaPort;
	}

	/**
	 * @param vgaPort
	 *            the vgaPort to set
	 */
	public void setVgaPort(VGA_Port vgaPort) {
		this.vgaPort = vgaPort;
	}

}

class HdmiPort implements DisplayPort, SoundPort {

	private String soundData;
	private String visualData;
	
	/**
	 * @param soundData
	 * @param visualData
	 */
	public HdmiPort(String visualData, String soundData) {
		this.soundData = soundData;
		this.visualData = visualData;
	}
	
	@Override
	public void makeSound() {
		System.out.println("This is sound info comming from " + soundData);
	}

	@Override
	public void display() {
        System.out.println("This is display info comming from " + visualData);
	}

	/**
	 * @return the soundData
	 */
	public String getSoundData() {
		return soundData;
	}

	/**
	 * @param soundData the soundData to set
	 */
	public void setSoundData(String soundData) {
		this.soundData = soundData;
	}

	/**
	 * @return the visualData
	 */
	public String getVisualData() {
		return visualData;
	}

	/**
	 * @param visualData the visualData to set
	 */
	public void setVisualData(String visualData) {
		this.visualData = visualData;
	}

}
interface SoundPort {
    void makeSound();
}
class VGA_Port implements DisplayPort {

	private String visualData;

	/**
	 * @param visualData
	 */
	public VGA_Port(String visualData) {
		this.visualData = visualData;
	}

	/**
	 * Simple constructor.
	 */
	public VGA_Port() {
	}

	@Override
	public void display() {
		System.out.println("This is display info comming from VGA Port: " + visualData);
	}

	/**
	 * @return the visualData
	 */
	public String getVisualData() {
		return visualData;
	}

	/**
	 * @param visualData
	 *            the visualData to set
	 */
	public void setVisualData(String visualData) {
		this.visualData = visualData;
	}

}