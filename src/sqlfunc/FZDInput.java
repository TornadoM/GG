package sqlfunc;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import static net.mindview.util.Print.*;

public class FZDInput {
	public String getKunde() {
		return kunde;
	}
	public void setKunde(String kunde) {
		this.kunde = kunde;
	}
	public String getModell() {
		return modell;
	}
	public void setModell(String modell) {
		this.modell = modell;
	}
	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	public String getMassstab() {
		return massstab;
	}
	public void setMassstab(String massstab) {
		this.massstab = massstab;
	}
	public String getStirnflache() {
		return stirnflache;
	}
	public void setStirnflache(String stirnflache) {
		this.stirnflache = stirnflache;
	}
	public String getRadstand() {
		return radstand;
	}
	public void setRadstand(String radstand) {
		this.radstand = radstand;
	}
	public String getSpurweite1() {
		return spurweite1;
	}
	public void setSpurweite1(String spurweite1) {
		this.spurweite1 = spurweite1;
	}
	public String getSpurweite2() {
		return spurweite2;
	}
	public void setSpurweite2(String spurweite2) {
		this.spurweite2 = spurweite2;
	}
	public String getShiftX() {
		return shiftX;
	}
	public void setShiftX(String shiftX) {
		this.shiftX = shiftX;
	}
	public String getShiftY() {
		return shiftY;
	}
	public void setShiftY(String shiftY) {
		this.shiftY = shiftY;
	}
	public String getShiftZ() {
		return shiftZ;
	}
	public void setShiftZ(String shiftZ) {
		this.shiftZ = shiftZ;
	}
	private String kunde;
	private String modell;
	private String typ;
	private String massstab;
	private String stirnflache;
	private String radstand;
	private String spurweite1;
	private String spurweite2;
	private String shiftX;
	private String shiftY;
	private String shiftZ;
	FZDInput(){
		Scanner sc=new Scanner(System.in);
		new InputInfo("Kunde");
		kunde=sc.nextLine();
		new InputInfo("Modell");
		modell=sc.nextLine();
		new InputInfo("Typ");
		typ=sc.nextLine();
		new InputInfo("Massstab");
		massstab=sc.nextLine();
		new InputInfo("Stirnfläche");
		stirnflache=sc.nextLine();
		new InputInfo("Radstand");
		radstand=sc.nextLine();
		new InputInfo("Spurweite","0.3800m 0.3800m");
		spurweite1=sc.next();
		spurweite2=sc.next();
		new InputInfo("Shift ∆X", "0.0000m");
		shiftX=sc.nextLine();
		shiftX=sc.nextLine();
		new InputInfo("Shift ∆Y", "0.0000m");
		shiftY=sc.nextLine();
		new InputInfo("Shift ∆Z", "0.0000m");
		shiftZ=sc.nextLine();		
	}

	
	
}
