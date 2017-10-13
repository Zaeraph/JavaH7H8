// Java H8 praktijkopdracht
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Calculator extends Applet {
    TextField Text1;
    TextField Text2;
    Double Number1;
    Double Number2;
    String Antwoord;
    Button ButtonTimes;
    Button ButtonFracture;
    Button ButtonPlus;
    Button ButtonMinus;

    public void init() {
        Text1 = new TextField("",15);
        Text2 = new TextField("",15);
        ButtonTimes = new Button("*");
        ButtonTimes.addActionListener( new ButtonListenerTimes());
        ButtonFracture = new Button("/");
        ButtonFracture.addActionListener( new ButtonListenerFracture());
        ButtonPlus = new Button("+");
        ButtonPlus.addActionListener( new ButtonListenerPlus());
        ButtonMinus = new Button("-");
        ButtonMinus.addActionListener( new ButtonListenerMinus());
        add(Text1);
        add(Text2);
        add(ButtonTimes);
        add(ButtonFracture);
        add(ButtonPlus);
        add(ButtonMinus);
    }

    public void paint(Graphics g) {
    }

    class ButtonListenerTimes implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Number1 = Double.parseDouble(Text1.getText());
            Number2 = Double.parseDouble(Text2.getText());
            Antwoord = String.valueOf(Number1 * Number2);
            Text1.setText(Antwoord);
            Text2.setText("");
        }
    }

    class ButtonListenerFracture implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Number1 = Double.parseDouble(Text1.getText());
            Number2 = Double.parseDouble(Text2.getText());
            Antwoord = String.valueOf(Number1 / Number2);
            Text1.setText(Antwoord);
            Text2.setText("");
        }
    }

    class ButtonListenerPlus implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Number1 = Double.parseDouble(Text1.getText());
            Number2 = Double.parseDouble(Text2.getText());
            Antwoord = String.valueOf(Number1 + Number2);
            Text1.setText(Antwoord);
            Text2.setText("");
        }
    }

    class ButtonListenerMinus implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Number1 = Double.parseDouble(Text1.getText());
            Number2 = Double.parseDouble(Text2.getText());
            Antwoord = String.valueOf(Number1 - Number2);
            Text1.setText(Antwoord);
            Text2.setText("");
        }
    }
}