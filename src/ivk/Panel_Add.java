package ivk;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static net.mindview.util.SwingConsole.*;

public class Panel_Add extends JPanel{
	/*----------------------------------------------
	 * JLabels
	 -------------------------------------------*/
	
	//Date
	private JLabel dateLabel=new JLabel("Date");
	
	//Fahrzeugdaten
	private JLabel 
		fzd=new JLabel("Fahrzeugdaten"),
		kundeLabel=new JLabel("Kunde:"),
		modellLabel=new JLabel("Modell:"),
		typLabel=new JLabel("Typ:"),
		massLabel=new JLabel("Maßstab:"),
		stirnLabel=new JLabel("Stirnfläche:"),
		radLabel=new JLabel("Radstand:"),
		spurLabel=new JLabel("Spurweite:");
	
	//KanalParameter
	private JLabel 
		kp=new JLabel("Kanalparameter:"),
		duesenLabel=new JLabel("Düsenfaktorkurve:"),
		waagenLabel=new JLabel("Waagenzustand"),
		intzeitLabel=new JLabel("Int. Zeit(msec)"),
		kpmittelLabel=new JLabel("Mittel"),
		pvkLabel=new JLabel("PVK:"),
		stauLabel=new JLabel("Staudruck:"),
		gswLabel=new JLabel("Geschwindigkeit:"),
		anstromLabel=new JLabel("Anströmwinkel:");
	
	//Luftkraft und Luftmomenten beiweite
	private JLabel
		lulb=new JLabel("Luftkraft- und Luftmomenten- beiwerte"),
		lulsigmaLabel1=new JLabel("1.Sigma"),
		lulsigmaLabel2=new JLabel("2.Sigma"),
		luftLabel=new JLabel("Luftwiderstandsbeiwert"),
		luftLabel_att=new JLabel("CW"),
		flaeLabel=new JLabel("Flächenprodukt"),
		flaeLabel_att=new JLabel("Ax*CW"),
		gesauftriebLabel=new JLabel("Gesamtauftriebsbeiwert"),
		gesauftriebLabel_att=new JLabel("CA"),
		vorauftriebLabel=new JLabel("Vorderachsauftriebsbeiwert"),
		vorauftriebLabel_att=new JLabel("CAV"),
		hinauftriebLabel=new JLabel("Hinterachsauftriebsbeiwert"),
		hinauftriebLabel_att=new JLabel("CAH"),
		gesseitenLabel=new JLabel("Gesamtseitenkraftbeiwert"),
		gesseitenLabel_att=new JLabel("CS"),
		vorseitenLabel=new JLabel("Vorderachsseitenkraftbeiwert"),
		vorseitenLabel_att=new JLabel("CSV"),
		hinseitenLabel=new JLabel("Hinterachsauft"),
		hinseitenLabel_att=new JLabel("CSH"),
		effizenzLabel=new JLabel("Effizienz"),
		effizenzLabel_att=new JLabel("CA/CW"),
		gierLabel=new JLabel("Giermomentenbeiwert"),
		gierLabel_att=new JLabel("CMZ"),
		nickLabel=new JLabel("Nickmomentenbeiwert"),
		nickLabel_att=new JLabel("CMY"),
		rollLabel=new JLabel("Rollmomentenbeiwert"),
		rollLabel_att=new JLabel("CMX");
	
	//Absaugraten
	private JLabel
		absaugrate=new JLabel("Absaugraten"),
		absaugrate_unit=new JLabel("%"),
		blpsLabel=new JLabel("BLPS"),
		tbcbLabel=new JLabel("TBCB"),
		dblsLabel=new JLabel("DBLS"),
		cbLabel=new JLabel("CB");
	
	//Bandgeschwindigkeiten
	private JLabel
		bandgsw=new JLabel("Bandgeschwindigkeiten"),
		bandgsw_unit1=new JLabel("km/h"),
		bandgsw_unit2=new JLabel("%"),
		laufbandLabel=new JLabel("Laufband"),
		radVLLabel=new JLabel("Rad VL"),
		radVRLabel=new JLabel("Rad VR"),
		radHLLabel=new JLabel("Rad HL"),
		radHRLabel=new JLabel("Rad HR");
	
	//Konfiguration
	private JLabel konfigLabel=new JLabel("Konfiguration");
	
	//Bilder
	private JLabel bilderLabel=new JLabel("Bilder");
	
	/*---------------------------------------------
	 * TEXT
	 ---------------------------------------------*/
	//Date
	private JTextField dateText=new JTextField(10);
	
	//Fahrzeugdaten
	private JTextField
		kundeTxt=new JTextField(10),
		modellTxt=new JTextField(10),
		typTxt=new JTextField(10),
		massTxt=new JTextField(10),
		stirnTxt=new JTextField(10),
		radTxt=new JTextField(10),
		spurTxt=new JTextField(10);
	
	//Kanalparameter
	private JTextField
		duesenTxt=new JTextField(10),
		waagenTxt=new JTextField(10),
		intzeitTxt=new JTextField(10),
		pvkTxt=new JTextField(10),
		stauTxt=new JTextField(10),
		gswTxt=new JTextField(10),
		anstroemTxt=new JTextField(10);
	
	//Luftkraft- und Luftmomenten- beiwerte
	private JTextField
		luftwiderTxt1=new JTextField(10),
		luftwiderTxt2=new JTextField(10),
		flaechenTxt1=new JTextField(10),
		flaechenTxt2=new JTextField(10),
		gesauftriebTxt1=new JTextField(10),
		gesauftriebTxt2=new JTextField(10),
		vorauftriebTxt1=new JTextField(10),
		vorauftriebTxt2=new JTextField(10),
		hinauftriebTxt1=new JTextField(10),
		hinauftriebTxt2=new JTextField(10),
		gesseitenTxt1=new JTextField(10),
		gesseitenTxt2=new JTextField(10),
		vorseitenTxt1=new JTextField(10),
		vorseitenTxt2=new JTextField(10),
		hinseitenTxt1=new JTextField(10),
		hinseitenTxt2=new JTextField(10),
		effizienzTxt1=new JTextField(10),
		effizienzTxt2=new JTextField(10),
		gierTxt1=new JTextField(10),
		gierTxt2=new JTextField(10),
		nickTxt1=new JTextField(10),
		nickTxt2=new JTextField(10),
		rollTxt1=new JTextField(10),
		rollTxt2=new JTextField(10);
	
	//Absaugraten
	private JTextField
		blpsTxt=new JTextField(10),
		tbcbTxt=new JTextField(10),
		dblsTxt=new JTextField(10),
		cbTxt=new JTextField(10);
	
	//Bandgeschwindigkeiten
	private JTextField
		laufbandTxt=new JTextField(10),
		radVLTxt=new JTextField(10),
		radVRTxt=new JTextField(10),
		radHLTxt=new JTextField(10),
		radHRTxt=new JTextField(10);
	
	//Konfiguration
	private JTextArea konfigTxt=new JTextArea(20,40);
	
	public Panel_Add(){
		add(dateTxt);
	    
	}
	
}
