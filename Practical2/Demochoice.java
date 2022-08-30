import java.awt.*;
class Demochoice
{
    Demochoice()
    {
        Frame f = new Frame("Choice");
        f.setVisible(true);
        f.setSize(500,500);
        f.setLayout(null);

        Choice c1 = new Choice();
        c1.add("Prashant");
        c1.add("Gauri");
        c1.add("Niriksha");
        c1.add("Konisha");
        c1.add("Aditya");
        c1.add("Akanshya");

        c1.setBounds(50,50,100,100);
        f.add(c1);


        List li1 = new List();
        
        li1 = new List();
        li1.add("Prashant");
        li1.add("Niriksha");
        li1.add("Konisha");
        li1.add("Aditya");
        li1.add("Akanshya");
        li1.setBounds(200,100,100,50);
        f.add(li1);

    }
    public static void main(String args[])
    {
        Demochoice d = new Demochoice();
    }
}