import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator extends JFrame {

    double digit1,digit2,hasil;
    String operator;
    String hsl,tampil;
    private JMenuBar menu;
    private JMenu file,help;
    private JMenuItem close,about;
    private JTextField layar;
    private JButton tujuh, delapan,sembilan,empat,lima,enam,satu,dua,tiga,CE,tambah,kurang,kali,bagi,delete;
    private JButton plusmin,nol,titik,samadengan;
    private int i;


    public Kalkulator(){
        super("KALKULATOR");

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        setLayout(null);

        layar = new JTextField("0");
        layar.setBounds(10,10,315,47);
        layar.setFont(new Font("Arial",Font.PLAIN,28));
        Border line = BorderFactory.createLineBorder(Color.BLACK);
        Border margin = new EmptyBorder(11,8,10,8);
        CompoundBorder border = new CompoundBorder(line,margin);
        layar.setBorder(border);
        layar.setEditable(false);
        layar.setHorizontalAlignment(SwingConstants.RIGHT);
        layar.setBackground(Color.white);

        menu = new JMenuBar();
        file = new JMenu(" File ");
        help = new JMenu(" Help ");
        close = new JMenuItem("Close");
        about = new JMenuItem("About");

        setJMenuBar(menu);
        menu.add(file);
        menu.add(help);
        file.add(close);
        help.add(about);

        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Kalkulator ini merupakan kalkulator sederhana","About",JOptionPane.INFORMATION_MESSAGE);
            }
        });

        tujuh = new JButton("7");
        tujuh.setBounds(10,70,55,55);
        tujuh.setFont(new Font("Arial",Font.PLAIN,18));

        tujuh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String angka = layar.getText() + tujuh.getText();

                if(layar.getText().length()>12){
                    return;
                }
                else {
                    if (layar.getText().equalsIgnoreCase("0")) {
                        layar.setText("7");
                        return;
                    }
                    layar.setText(angka);
                }
            }
        });

        delapan = new JButton("8");
        delapan.setBounds(75,70,55,55);
        delapan.setFont(new Font("Arial",Font.PLAIN,18));

        delapan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String angka = layar.getText() + delapan.getText();

                if(layar.getText().length()>12){
                    return;
                }
                else {
                    if (layar.getText().equalsIgnoreCase("0")) {
                        layar.setText("8");
                        return;
                    }
                    layar.setText(angka);
                }
            }
        });

        sembilan = new JButton("9");
        sembilan.setBounds(140,70,55,55);
        sembilan.setFont(new Font("Arial",Font.PLAIN,18));

        sembilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String angka = layar.getText() + sembilan.getText();

                if(layar.getText().length()>12){
                    return;
                }
                else {
                    if (layar.getText().equalsIgnoreCase("0")) {
                        layar.setText("9");
                        return;
                    }
                    layar.setText(angka);
                }
            }
        });

        empat = new JButton("4");
        empat.setBounds(10,135,55,55);
        empat.setFont(new Font("Arial",Font.PLAIN,18));

        empat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String angka = layar.getText() + empat.getText();

                if(layar.getText().length()>12){
                    return;
                }
                else {
                    if (layar.getText().equalsIgnoreCase("0")) {
                        layar.setText("4");
                        return;
                    }
                    layar.setText(angka);
                }
            }
        });

        lima = new JButton("5");
        lima.setBounds(75,135,55,55);
        lima.setFont(new Font("Arial",Font.PLAIN,18));

        lima.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String angka = layar.getText() + lima.getText();

                if(layar.getText().length()>12){
                    return;
                }
                else {
                    if (layar.getText().equalsIgnoreCase("0")) {
                        layar.setText("5");
                        return;
                    }
                    layar.setText(angka);
                }
            }
        });

        enam = new JButton("6");
        enam.setBounds(140,135,55,55);
        enam.setFont(new Font("Arial",Font.PLAIN,18));

        enam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String angka = layar.getText() + enam.getText();

                if(layar.getText().length()>12){
                    return;
                }
                else {
                    if (layar.getText().equalsIgnoreCase("0")) {
                        layar.setText("6");
                        return;
                    }
                    layar.setText(angka);
                }
            }
        });

        satu = new JButton("1");
        satu.setBounds(10,200,55,55);
        satu.setFont(new Font("Arial",Font.PLAIN,18));

        satu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String angka = layar.getText() + satu.getText();

                if(layar.getText().length()>12){
                    return;
                }
                else {
                    if (layar.getText().equalsIgnoreCase("0")) {
                        layar.setText("1");
                        return;
                    }
                    layar.setText(angka);
                }
            }
        });

        dua = new JButton("2");
        dua.setBounds(75,200,55,55);
        dua.setFont(new Font("Arial",Font.PLAIN,18));

        dua.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String angka = layar.getText() + dua.getText();

                if(layar.getText().length()>12){
                    return;
                }
                else {
                    if (layar.getText().equalsIgnoreCase("0")) {
                        layar.setText("2");
                        return;
                    }
                    layar.setText(angka);
                }
            }
        });

        tiga = new JButton("3");
        tiga.setBounds(140,200,55,55);
        tiga.setFont(new Font("Arial",Font.PLAIN,18));

        tiga.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String angka = layar.getText() + tiga.getText();

                if(layar.getText().length()>12){
                    return;
                }
                else {
                    if (layar.getText().equalsIgnoreCase("0")) {
                        layar.setText("3");
                        return;
                    }
                    layar.setText(angka);
                }
            }
        });

        plusmin = new JButton("+/-");
        plusmin.setBounds(10,265,55,55);
        plusmin.setFont(new Font("Arial",Font.PLAIN,15));

        plusmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double PM = Double.parseDouble(String.valueOf(layar.getText()));
                PM = PM *(-1);
                layar.setText(String.valueOf(PM));

                if(layar.getText().endsWith(".0")){
                    layar.setText(layar.getText().replace(".0",""));
                }
            }
        });

        nol = new JButton("0");
        nol.setBounds(75,265,55,55);
        nol.setFont(new Font("Arial",Font.PLAIN,18));

        nol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(layar.getText().equalsIgnoreCase("0")){
                    layar.setText("0");
                    return;
                }
                else{
                    String angka = layar.getText() + nol.getText();

                    if(layar.getText().length()>12){
                        return;
                    }
                    else {
                        layar.setText(angka);
                    }
                }
            }
        });

        titik = new JButton(".");
        titik.setBounds(140,265,55,55);
        titik.setFont(new Font("Arial",Font.PLAIN,18));

        titik.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String angka = layar.getText() + titik.getText();

                if(layar.getText().contains(".")){
                    return;
                }
                else{
                    layar.setText(angka);
                    return;

                }
            }
        });

        samadengan = new JButton("=");
        samadengan.setBounds(205,265,120,55);
        samadengan.setFont(new Font("Arial",Font.PLAIN,18));

        samadengan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(i==1){
                    hasil = hasil + Double.parseDouble(String.valueOf(layar.getText()));
                }
                else if(i==2){
                    hasil = hasil - Double.parseDouble(String.valueOf(layar.getText()));
                }
                else if(i==3){
                    hasil = hasil * Double.parseDouble(String.valueOf(layar.getText()));
                }
                else if(i==4){
                    hasil = hasil / Double.parseDouble(String.valueOf(layar.getText()));
                }
                samadengangantilayar();

                if(layar.getText().endsWith(".0")){
                    layar.setText(layar.getText().replace(".0",""));
                }

                hasil=i=0;
            }
        });

        delete = new JButton("<");
        delete.setBounds(205,70,55,55);
        delete.setFont(new Font("Arial",Font.BOLD,18));

        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String hapus=null;

                if(layar.getText().length()>0){
                    StringBuilder strB = new StringBuilder(layar.getText());
                    strB.deleteCharAt(layar.getText().length() - 1);
                    hapus = strB.toString();
                    layar.setText(hapus);
                }
                if(layar.getText().length()==0){
                    layar.setText("0");
                }
            }
        });

        CE = new JButton("CE");
        CE.setBounds(270,70,55,55);
        CE.setFont(new Font("Arial",Font.BOLD,15));

        CE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                layar.setText("0");
            }
        });

        tambah = new JButton("+");
        tambah.setBounds(205,135,55,55);
        tambah.setFont(new Font("Arial",Font.PLAIN,18));

        tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                digit1 = Double.parseDouble(layar.getText());
                operator();
                layar.setText("0");
                operator = "+";
                i=1;
            }
        });

        kurang = new JButton("-");
        kurang.setBounds(270,135,55,55);
        kurang.setFont(new Font("Arial",Font.PLAIN,18));

        kurang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                digit1 = Double.parseDouble(layar.getText());
                operator();
                layar.setText("0");
                operator = "-";
                i=2;
            }
        });

        kali = new JButton("x");
        kali.setBounds(205,200,55,55);
        kali.setFont(new Font("Arial",Font.PLAIN,18));

        kali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                digit1 = Double.parseDouble(layar.getText());
                operator();
                layar.setText("0");
                operator = "*";
                i=3;
            }
        });

        bagi = new JButton("/");
        bagi.setBounds(270,200,55,55);
        bagi.setFont(new Font("Arial",Font.PLAIN,18));

        bagi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                digit1 = Double.parseDouble(layar.getText());
                operator();
                layar.setText("0");
                operator = "/";
                i=4;
            }
        });

        add(layar);
        add(tujuh);
        add(delapan);
        add(sembilan);
        add(delete);
        add(CE);
        add(empat);
        add(lima);
        add(enam);
        add(tambah);
        add(kurang);
        add(satu);
        add(dua);
        add(tiga);
        add(kali);
        add(bagi);
        add(plusmin);
        add(nol);
        add(titik);
        add(samadengan);

        setSize(340,390);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        Kalkulator kalk = new Kalkulator();
    }

    private void operator(){
        if(i==1){
            hasil = hasil + digit1;
        }
        else if(i==2){
            hasil = hasil - digit1;
        }
        else if(i==3){
            hasil = hasil * digit1;
        }
        else if(i==4) {
            hasil = hasil / digit1;
        }
        else if(i==0){
            hasil = digit1;
        }
    }

    private void samadengangantilayar(){
        String dilayar = "";
        dilayar = Double.toString(hasil);
        layar.setText(dilayar);
        hasil=0;
    }
}
