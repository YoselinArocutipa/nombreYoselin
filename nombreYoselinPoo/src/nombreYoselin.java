import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class nombreYoselin extends PApplet {
  public void setup() {

// letra Y
line(10,80,40,80);
line(70,80,100,80);

line(40,80,55,100);
line(70,80,55,100);

line(10,80,40,120);
line(100,80,70,120);

line(40,120,40,180);
line(70,120,70,180);

line(40,180,70,180);


//letra O
line(110,80,170,80);
line(110,80,110,180);
line(170,80,170,180);
line(110,180,170,180);

line(130,105,150,105);
line(130,105,130,155);
line(150,105,150,155);
line(130,155,150,155);

//letra S
line(180,80,240,80);

line(240,80,240,105);
line(240,105,205,105);

line(205,105,205,120);
line(205,120,240,120);

line(180,80,180,135);
line(240,120,240,180);

line(240,180,180,180);

line(180,180,180,160);
line(180,160,215,160);

line(215,160,215,135);
line(215,135,180,135);

//letra E
line(250,80,310,80);
line(250,80,250,180);
line(250,180,310,180);

line(310,80,310,100);
line(310,180,310,160);

line(310,100,270,100);
line(270,100,270,120);
line(270,120,310,120);
line(310,120,310,140);

line(310,140,270,140);
line(270,140,270,160);
line(270,160,310,160);

//letra L
line(320,80,340,80);
line(320,80,320,180);
line(340,160,340,80);
line(380,180,380,160);
line(380,160,340,160);
line(320,180,380,180);

//letra I
line(390,80,410,80);
line(390,80,390,180);
line(410,80,410,180);
line(390,180,410,180);

//letra N
line(420,80,440,80);
line(420,80,420,180);
line(440,120,440,180);
line(420,180,440,180);

line(470,80,490,80);
line(470,80,470,140);
line(490,80,490,180);
line(470,180,490,180);

line(440,80,470,140);
line(440,120,470,180);

//corazon
line(400,70,380,50);
line(400,70,420,50);

line(380,50,390,40);
line(420,50,410,40);

line(390,40,400,48);
line(410,40,400,48);

//linea abajo
line(0,200,510,200);
line(0,220,510,220);

//diseño linea
line(0,220,10,210);

line(0,200,20,220);
line(20,200,40,220);

line(40,200,30,210);
line(50,210,40,220);

line(40,200,60,220);
line(60,200,80,220);

line(80,200,70,210);
line(90,210,80,220);

line(80,200,100,220);
line(100,200,120,220);

line(120,200,110,210);
line(130,210,120,220);

line(120,200,140,220);
line(140,200,160,220);

line(160,200,150,210);
line(170,210,160,220);

line(160,200,180,220);
line(180,200,200,220);

line(200,200,190,210);
line(210,210,200,220);

line(200,200,220,220);
line(220,200,240,220);

line(240,200,230,210);
line(250,210,240,220);

line(240,200,260,220);
line(260,200,280,220);

line(280,200,270,210);
line(290,210,280,220);

line(280,200,300,220);
line(300,200,320,220);

line(320,200,310,210);
line(330,210,320,220);

line(320,200,340,220);
line(340,200,360,220);

line(360,200,350,210);
line(370,210,360,220);

line(360,200,380,220);
line(380,200,400,220);

line(400,200,390,210);
line(410,210,400,220);

line(400,200,420,220);
line(420,200,440,220);

line(440,200,430,210);
line(450,210,440,220);

line(440,200,460,220);
line(460,200,480,220);

line(480,200,470,210);
line(490,210,480,220);

line(480,200,500,220);
line(500,200,520,220);

line(520,200,510,210);
line(530,210,520,220);

// tamanio de la ventana
    noLoop();
  }

  public void settings() { 
size(510,260); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "nombreYoselin" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}

