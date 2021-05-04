import java.awt.*;
import java.awt.event.*;

class Dtic extends Frame implements ActionListener{
    
    TextField tx1,tx2;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int count=0;
    boolean a1=false,a2=false,a3=false,a4=false,a5=false,a6=false,a7=false,a8=false,a9=false;
    boolean o1=false,o2=false,o3=false,o4=false,o5=false,o6=false,o7=false,o8=false,o9=false;
    boolean X1=false,X2=false,X3=false,X4=false,X5=false,X6=false,X7=false,X8=false,X9=false;
    boolean gameOver=false;

    int x1=0,y1=0,h=0,w=0,x2=0,y2=0;

    Dtic(){
        setLayout(null);
        Font f = new Font("Arial Black",Font.ITALIC,20);
        setFont(f);


        b1= new Button();
        b1.setSize(150,150);
        b1.setLocation(50,50);
        add(b1);

        b2= new Button();
        b2.setSize(150,150);
        b2.setLocation(200,50);
        add(b2);

        b3=new Button();
        b3.setSize(150,150);
        b3.setLocation(350,50);
        add(b3);

        b4 =new Button();
        b4.setSize(150,150);
        b4.setLocation(50,200);
        add(b4);

        b5 =new Button();
        b5.setSize(150,150);
        b5.setLocation(200,200);
        add(b5);

        b6 =new Button();
        b6.setSize(150,150);
        b6.setLocation(350,200);
        add(b6);

        b7=new Button();
        b7.setSize(150,150);
        b7.setLocation(50,350);
        add(b7);

        b8 =new Button();
        b8.setSize(150,150);
        b8.setLocation(200,350);
        add(b8);

        b9 =new Button();
        b9.setSize(150,150);
        b9.setLocation(350,350);
        add(b9);


        tx1 = new TextField();
        tx1.setSize(150,40);
        tx1.setLocation(550,100);
        add(tx1);

        tx2 = new TextField();
        tx2.setSize(150,40);
        tx2.setLocation(550,220);
        add(tx2);
        

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);


        setResizable(false);

    }
    public void paint(Graphics g){
        
        if(a1==true){
            g.setColor(Color.yellow);
            g.fillRect(50,50,150,150);
            g.setColor(Color.black);

            if(o1==true)
            g.drawString("O",120,120);
            else 
            g.drawString("X",120,120);
        }
        if(a2==true){
            g.setColor(Color.yellow);
            g.fillRect(200,50,150,150);
            g.setColor(Color.black);

            if(o2==true)
            g.drawString("O",270,120);
            else
            g.drawString("X",270,120);
        }
        if(a3==true){
            g.setColor(Color.yellow);
            g.fillRect(350,50,150,150);
            g.setColor(Color.black);

            if(o3==true)
            g.drawString("O",420,120);
            else
            g.drawString("X",420,120);
        }
        if(a4==true){
            g.setColor(Color.yellow);
            g.fillRect(50,200,150,150);
            g.setColor(Color.black);

            if(o4==true)
            g.drawString("O",120,270);
            else 
            g.drawString("X",120,270);
        }
        if(a5==true){
            g.setColor(Color.yellow);
            g.fillRect(200,200,150,150);
            g.setColor(Color.black);

            if(o5==true)
            g.drawString("O",270,270);
            else 
            g.drawString("X",270,270);
        }
        if(a6==true){
            g.setColor(Color.yellow);
            g.fillRect(350,200,150,150);
            g.setColor(Color.black);

            if(o6==true)
            g.drawString("O",420,270);
            else 
            g.drawString("X",420,270);
        }
        if(a7==true){
            g.setColor(Color.yellow);
            g.fillRect(50,350,150,150);
            g.setColor(Color.black);

            if(o7==true)
            g.drawString("O",120,420);
            else
            g.drawString("X",120,420);
        }
        if(a8==true){
            g.setColor(Color.yellow);
            g.fillRect(200,350,150,150);
            g.setColor(Color.black);

            if(o8==true)
            g.drawString("O",270,420);
            else 
            g.drawString("X",270,420);
        }
        if(a9==true){
            g.setColor(Color.yellow);
            g.fillRect(350,350,150,150);
            g.setColor(Color.black);

            if(o9==true)
            g.drawString("O",420,420);
            else 
            g.drawString("X",420,420);
        }

        if((o1==true&&o2==true&&o3==true)||(X1==true&&X2==true&&X3==true)){
            
            g.setColor(Color.red);
            if((o1==true&&o2==true&&o3==true)){
            g.drawString(tx1.getText()+" IS",600,350);
            }
            else{
             g.drawString(tx2.getText()+" IS",600,350); 
            }
            g.drawString("WINNER",600,400);
            g.drawLine(120,120,420,120);
            remove(b1);remove(b2);remove(b3);remove(b4);remove(b5);remove(b6);remove(b7);remove(b8);remove(b9);

            gameOver=true;
            
        }
        else if((o4==true&&o5==true&&o6==true)||(X4==true&&X5==true&&X6==true)){
            g.setColor(Color.red);
            if((o4==true&&o5==true&&o6==true)){
            g.drawString(tx1.getText()+" IS",600,350);}
            else{
                g.drawString(tx2.getText()+" IS",600,350);
            }
            g.drawString("WINNER",600,400);
            g.drawLine(120,270,420,270);
            remove(b1);remove(b2);remove(b3);remove(b4);remove(b5);remove(b6);remove(b7);remove(b8);remove(b9);

            gameOver=true;
        }
        else if((o3==true&&o6==true&&o9==true)||(X3==true&&X6==true&&X9==true)){
            g.setColor(Color.red);
            if((o3==true&&o6==true&&o9==true)){
            g.drawString(tx1.getText()+" IS",600,350);}
            else{
                g.drawString(tx2.getText()+" IS",600,350);
            }
            g.drawString("WINNER",600,400);
            g.drawLine(420,120,420,420);
            remove(b1);remove(b2);remove(b3);remove(b4);remove(b5);remove(b6);remove(b7);remove(b8);remove(b9);

            gameOver=true;
        }
        else if((o7==true&&o8==true&&o9==true)||(X7==true&&X8==true&&X9==true)){
            g.setColor(Color.red);
            if((o7==true&&o8==true&&o9==true)){
            g.drawString(tx1.getText()+" IS",600,350);}
            else{
                g.drawString(tx2.getText()+" IS",600,350);
            }
            g.drawString("WINNER",600,400);
            g.drawLine(120,420,420,420);
            remove(b1);remove(b2);remove(b3);remove(b4);remove(b5);remove(b6);remove(b7);remove(b8);remove(b9);

            gameOver=true;
        }
        else if((o1==true&&o4==true&&o7==true)||(X1==true&&X4==true&&X7==true)){
            g.setColor(Color.red);
            if((o1==true&&o4==true&&o7==true)){
            g.drawString(tx1.getText()+" IS",600,350);}
            else{
                g.drawString(tx2.getText()+" IS",600,350); 
            }
            g.drawString("WINNER",600,400);
            g.drawLine(120,120,120,420);
            remove(b1);remove(b2);remove(b3);remove(b4);remove(b5);remove(b6);remove(b7);remove(b8);remove(b9);

            gameOver=true;
        }
      
        else if((o2==true&&o5==true&&o8==true)||(X2==true&&X5==true&&X8==true)){
            g.setColor(Color.red);
            if((o2==true&&o5==true&&o8==true)){
            g.drawString(tx1.getText()+" IS",600,350);}
            else{
                g.drawString(tx2.getText()+" IS",600,350);
            }
            g.drawString("WINNER",600,400);
            g.drawLine(270,120,270,420);
            remove(b1);remove(b2);remove(b3);remove(b4);remove(b5);remove(b6);remove(b7);remove(b8);remove(b9);

            gameOver=true;
        }
        else if((o1==true&&o5==true&&o9==true)||(X1==true&&X5==true&&X9==true)){
            g.setColor(Color.red);
            if((o1==true&&o5==true&&o9==true)){
            g.drawString(tx1.getText()+" IS",600,350);}
            else{
                g.drawString(tx2.getText()+" IS",600,350);
            }
            g.drawString("WINNER",600,400);
            g.drawLine(120,120,420,420);
            remove(b1);remove(b2);remove(b3);remove(b4);remove(b5);remove(b6);remove(b7);remove(b8);remove(b9);

            gameOver=true;
        }
        else if((o3==true&&o5==true&&o7==true)||(X3==true&&X5==true&&X7==true)){
            g.setColor(Color.red);
            if((o3==true&&o5==true&&o7==true)){
            g.drawString(tx1.getText()+" IS",600,350);}
            else{
                g.drawString(tx2.getText()+" IS",600,350); 
            }
            g.drawString("WINNER",600,400);
            g.drawLine(420,120,120,420);
            remove(b1);remove(b2);remove(b3);remove(b4);remove(b5);remove(b6);remove(b7);remove(b8);remove(b9);

            gameOver=true;
        }
        else{
            if(count==9){
            g.setColor(Color.red);
            g.drawString("GAME TIE'S",550,350);
            gameOver=true;}
        }
        g.setColor(Color.white);
        g.drawString("Enter name of player 1 :",550,80);
        g.drawString("Enter name of player 2 :",550,200);

        if(gameOver==true){

            Color mustard=new Color(237,243,121);
            g.setColor(mustard);
            
            if(a1==false){
                g.fillRect(50,50,150,150);
            }
            if(a2==false){
               g.fillRect(200,50,150,150);  
            }
            if(a3==false){
                g.fillRect(350,50,150,150);
           
            }
            if(a4==false){
                g.fillRect(50,200,150,150);
           
            }
            if(a5==false){
                g.fillRect(200,200,150,150);
                
            }
            if(a6==false){
                g.fillRect(350,200,150,150);
              
            }
            if(a7==false){
                g.fillRect(50,350,150,150);
                
            }
            if(a8==false){
                g.fillRect(200,350,150,150);
                
            }
            if(a9==false){
                g.fillRect(350,350,150,150);
                
            }

            g.setColor(Color.black);
            g.drawLine(200,50,200,500);
            g.drawLine(350,50,350,500);
            g.drawLine(50,200,500,200);
            g.drawLine(50,350,500,350);
        }

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            
            count++;a1=true;
            remove(b1);
            if(count%2!=0)
            o1=true;
            else{
                X1=true;
            }
            repaint();
        }
        if(e.getSource()==b2){
           
            count++;a2=true;
            remove(b2);
            if(count%2!=0)
            o2=true;
            else{
                X2=true;
            }
            repaint();
        }
        if(e.getSource()==b3){

            count++;a3=true;
            remove(b3);
            if(count%2!=0)
            o3=true;
            else{
                X3=true;
            }
            repaint();
        }
        if(e.getSource()==b4){
            
            count++;a4=true;
            remove(b4);
            if(count%2!=0)
            o4=true;
            else{
                X4=true;
            }
            repaint();
        }
        if(e.getSource()==b5){
         
            count++;a5=true;
            remove(b5);
            if(count%2!=0)
            o5=true;
            else{
                X5=true;
            }
            repaint();
        }
        if(e.getSource()==b6){
           
            count++;a6=true;
            remove(b6);
            if(count%2!=0)
            o6=true;
            else{
                X6=true;
            }
            repaint();
        }
        if(e.getSource()==b7){
      
            count++;a7=true;
            remove(b7);
            if(count%2!=0)
            o7=true;
            else{
                X7=true;
            }
            repaint();
        }
        if(e.getSource()==b8){
          
            count++;a8=true;
            remove(b8);
            if(count%2!=0)
            o8=true;
            else{
                X8=true;
            }
            repaint();
        }
        if(e.getSource()==b9){
            count++;a9=true;
            remove(b9);
            if(count%2!=0)
            o9=true;
            else{
                X9=true;
            }
            repaint();
        }


    }
}
public class tictactoe {
    public static void main(String ar[]){
        Dtic f = new Dtic();
        f.setVisible(true);
        f.setLocation(250,0);
        f.setSize(860,550);
        f.setBackground(Color.black);
    }
}


