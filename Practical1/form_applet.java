import java.awt.*;
import java.applet.*;

public class form_applet extends Applet
{
    public void init()
    {
        
        Label l1;//label

        Button b1,b2;//button

        Checkbox c1,c2,c3,c4,c5;//checkbox

        CheckboxGroup g1;//for radio button

        Choice ch1;//dropdown

        List li1;//listbox

        Scrollbar s1,s2;//scrollbar

        TextArea ta1;//Textarea

        TextField t1;//textField

        l1 = new Label("Let's use components!");
        l1.setBounds(50,50,150,20);
        add(l1);

        b1 = new Button("Click me!");//button
        b1.setBounds(200,50,100,20);
        add(b1);

        c1 = new Checkbox("Single CheckBox");//checkbox
        c1.setBounds(320,50,140,20);
        add(c1);

        ch1 = new Choice();
        ch1.add("clubs");//add option in dropdown menu
        ch1.add("IF");
        ch1.add("CO");
        ch1.add("EJ");
        ch1.select("IF");//default
        ch1.setBounds(80,120,100,50);
        add(ch1);

        li1 = new List();
        li1.add("English");
        li1.add("Chiness");
        li1.add("Japanese");
        li1.setBounds(200,100,100,50);
        add(li1);


        s2 = new Scrollbar(Scrollbar.VERTICAL);
        s2.setBounds(310,100,15,80);
        add(s2);

        s1 = new Scrollbar(Scrollbar.HORIZONTAL);
        s1.setBounds(340,130,100,20);
        add(s1);

        t1 = new TextField("This is Text Field");
        t1.setBounds(50,200,120,20);
        add(t1);
        
        ta1 = new TextArea("Textarea\nOne\nTwo\nThree");
        ta1.setBounds(250,200,200,100);
        add(ta1);

        b2 = new Button("Change things");
        b2.setBounds(50,350,100,30);
        add(b2);

        g1 = new CheckboxGroup();

        c2 = new Checkbox("North",g1,true);
        c2.setBounds(180,350,70,30);
        add(c2);

        c3 = new Checkbox("South",g1,false);
        c3.setBounds(250,350,70,30);
        add(c3);

        c4 = new Checkbox("East",g1,false);
        c4.setBounds(330,350,70,30);
        add(c4);

        c5 = new Checkbox("West",g1,false);
        c5.setBounds(410,350,70,30);
        add(c5);


    }

}
/*
<APPLET Code="form_applet" Width=500 Height=200>
</APPLET>
*/