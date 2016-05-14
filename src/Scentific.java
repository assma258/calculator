
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Scentific extends Application {
	  Button b0;
	  Button b1;
	  Button b2;
	  Button b3;
	  Button b4;
	  Button b5;
	  Button b6;
	  Button b7;
	  Button b8;
	  Button b9;
      Button opbracket;
	  Button clobracket;
	  Button  dot;
	  Button equal;
	  Button div;
      Button sub;
	  Button multi;
	  Button sum;
	  Button home;
	  Button ce;
	  Button modulus;
	  Button sin;
	  Button cos;
	  Button tan;
	  Button asin;
	  Button acos;
	  Button atan;
	  Button sqrt;
	  Button square1;
	  Button square;
	  Button n;
	  Button log;
	  Button factor;
	  Button by;
	  Button x;
	  Label tf;
	  Label tf1;
	  Scene scene;
	  MenuBar menu;
		 Menu fileMenu ;
		    MenuItem Standard;
		    MenuItem Scientific;
	         Menu f;
	        
		    Stage thestag;	
	  boolean  flag=false;
	  @Override  
	  public void start(Stage stage) { 
		  thestag=stage;
			 
		  menu = new MenuBar();
			 fileMenu = new Menu("menu");
		     Standard = new MenuItem("Standard");
		     Scientific = new MenuItem("Scientific");
		  fileMenu.getItems().addAll(Standard, Scientific);
		    menu.getMenus().addAll(fileMenu);
		  BorderPane pane1=new BorderPane();
		  VBox v=new VBox();
		  v.setPadding(new Insets(13, 10,5, 10)); 
		  tf = new Label(""); 
		  tf.setPrefSize(500,35);
		  v.setPrefSize(400,70);
		  tf.setAlignment(Pos.BOTTOM_RIGHT); 
		  tf1 = new Label(""); 
		  tf1.setPrefSize(500, 35);
		  tf.setStyle("-fx-background-color:#d3d3d3;-fx-font-size:25;");
		  tf1.setStyle("-fx-background-color:#d3d3d3;-fx-font-size:25;");
		  tf1.setAlignment(Pos.BOTTOM_RIGHT); 
		  v.setStyle("-fx-background-color:black;");
		  v.getChildren().addAll(tf,tf1);
		  HBox h2=new HBox(4);
		  h2.setPadding(new Insets(0, 5, 5, 5)); 
		  HBox h3=new HBox(4);
		  h3.setPadding(new Insets(0, 5, 5, 5)); 
		  HBox h4=new HBox(4);
		  h4.setPadding(new Insets(0, 5, 5, 5)); 
		  HBox h5=new HBox(4);
		  h5.setPadding(new Insets(0, 5, 5, 5)); 
		   b7=new Button("7");
		   b7.setPrefWidth(40);
		   b8=new Button("8");
		   b8.setPrefWidth(40);
		   b9=new Button("9");
		   b9.setPrefWidth(40);
		   modulus=new Button("%");
		   modulus.setPrefWidth(40);
		   ce=new Button("â†گ");
		   ce.setPrefWidth(40);
		   home=new Button("C");
		   home.setPrefWidth(40);
		   home.setStyle("-fx-background-color: #fc8800");
		   
		   sin=new Button("sin");
		   sin.setPrefWidth(60);
		   sin.setStyle("-fx-background-color: #a5a5a3");
		   
		   cos=new Button("cos");
		   cos.setPrefWidth(60);
		   cos.setStyle("-fx-background-color: #a5a5a3");
		   
		   tan=new Button("tan");
		   tan.setPrefWidth(60);
		   tan.setStyle("-fx-background-color: #a5a5a3");
		   
		   h2.getChildren().addAll(sin,cos,tan,b7,b8,b9,modulus,ce,home);
		   b4=new Button("4");
		   b4.setPrefWidth(40);
		   b5=new Button("5");
		   b5.setPrefWidth(40);
		   b6=new Button("6");
		   b6.setPrefWidth(40);
		   multi=new Button("*");
		   multi.setPrefWidth(40);
		   opbracket=new Button("(");
		   opbracket.setPrefWidth(40);
		   clobracket=new Button(")");
		   clobracket.setPrefWidth(40);
		   asin=new Button("sin-1");
		   asin.setPrefWidth(60);
		   asin.setStyle("-fx-background-color: #a5a5a3");
		   
		   acos=new Button("cos-1");
		   acos.setPrefWidth(60);
		   acos.setStyle("-fx-background-color: #a5a5a3");
		   
		   atan=new Button("tan-1");
		   atan.setPrefWidth(60);
		   atan.setStyle("-fx-background-color: #a5a5a3");
		   
		   h3.getChildren().addAll(asin,acos,atan,b4,b5,b6,multi,opbracket,clobracket);
		   b1=new Button("1");
		   b1.setPrefWidth(40);
		   b2=new Button("2");
		   b2.setPrefWidth(40);
		   b3=new Button("3");
		   b3.setPrefWidth(40);
		   sub=new Button("-");
		   sub.setPrefWidth(40);
		   div=new Button("/");
		   div.setPrefWidth(40);
		   sum=new Button("+");
		   sum.setPrefWidth(40);
		   x=new Button("ln");
		   x.setStyle("-fx-background-color: #a5a5a3");
		   x.setPrefWidth(60);
		   square=new Button("^2");
		   square.setStyle("-fx-background-color: #a5a5a3");
		   square.setPrefWidth(60);
		   n=new Button("^y");
		   n.setStyle("-fx-background-color: #a5a5a3");
		   n.setPrefWidth(60);
		   h4.getChildren().addAll(x,square,n,b1,b2,b3,sub,div,sum);
		   b0=new Button("0");
		   b0.setPrefWidth(40);
		   dot=new Button(".");
		   dot.setPrefWidth(40);
		   equal=new Button("=");
		   equal.setPrefWidth(80);
		   log=new Button("log");
		   log.setStyle("-fx-background-color: #a5a5a3");
		   log.setPrefWidth(60);
		   factor=new Button("n!");
		   factor.setStyle("-fx-background-color: #a5a5a3");
		   factor.setPrefWidth(60);
		   by=new Button("د€");
		   by.setStyle("-fx-background-color: #a5a5a3");
		   by.setPrefWidth(60);
		   sqrt=new Button("âˆڑ");
		   sqrt.setPrefWidth(80);
		  h5.getChildren().addAll(log,factor,by,sqrt,b0,dot,equal);
		  VBox v1=new VBox();
		  v1.getChildren().addAll(h2,h3,h4,h5);
		  v1.setAlignment(Pos.CENTER);
		  v1.setStyle("-fx-background-color: BLACK");
		   
		  pane1.setBottom(v1);
		  pane1.setTop(menu);
		  pane1.setCenter(v);
		  handle_events();
		  
		  scene = new Scene(pane1, 400, 250);   
		  stage.setTitle("Scentific");
		  stage.setScene(scene);
		  stage.setResizable(false);
		  stage.show(); 
	  }
	  void handle_events()
	  {
		  
		  Standard.setOnAction(e->{ 
			  Calulator s=new Calulator(); 
				
				thestag.setScene(s.scene);
				 try {
					s.start(thestag);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			});
		  b0.setOnAction(e ->
				  {
					  if(flag)tf.setText("");
					  flag=false;
					  String s=tf.getText();
					  tf.setText(s+"0");
					  tf1.setText(" ");
				  });
		  b1.setOnAction(e ->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  String s=tf.getText();
			  tf.setText(s+"1");
			  tf1.setText(" ");
		  });
  
		  b2.setOnAction(e ->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  String s=tf.getText();
			  tf.setText(s+"2");
			  tf1.setText(" ");
		  });
		  b3.setOnAction(e ->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  String s=tf.getText();
			  tf.setText(s+"3");
			  tf1.setText(" ");
		  });
		  b4.setOnAction(e ->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  String s=tf.getText();
			  tf.setText(s+"4");
			  tf1.setText(" ");
		  });
		  b5.setOnAction(e ->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  String s=tf.getText();
			  tf.setText(s+"5");
			  tf1.setText(" ");
		  });
		  b6.setOnAction(e ->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  String s=tf.getText();
			  tf.setText(s+"6");
			  tf1.setText(" ");
		  });
		  modulus.setOnAction(e ->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  String s=tf.getText();
			  for(int i=0;i<s.length();i++)
			  {
			  if(s.charAt(0)=='%')
			 
				  tf.setText(" ");
			  
			  else
				  {
				  tf.setText(s+"%");
				  }}
		  });
		  dot.setOnAction(e ->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  String s=tf.getText();
			  
			  boolean f=true;
			  for(int i=s.length()-1; i>=0; --i)
			  {
				  if(s.charAt(i)=='.')
				  {
					  f=false;
					  break;
				  }
				  else if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/'||s.charAt(i)=='%')
				  {
					  break;
				  }
				  
			  }
			  if(s=="")
				  s+="0.";
			  else if(s.charAt(s.length()-1)=='+'||s.charAt(s.length()-1)=='-'||s.charAt(s.length()-1)=='*'||s.charAt(s.length()-1)=='/'||s.charAt(s.length()-1)=='%')
				  s+="0.";
			  else if(f == true)
				  s+=".";
			 
			  tf.setText(s);
			  tf1.setText(" ");
		  
		  });
  
		  b7.setOnAction(e ->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  String s=tf.getText();
			  tf.setText(s+"7");
			  tf1.setText(" ");
		  });
		  b8.setOnAction(e ->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  String s=tf.getText();
			  tf.setText(s+"8");
			  tf1.setText(" ");
		  });
  
		  equal.setOnAction(e ->
		  {
			  flag=true;
			  scentific_calculation  c=new scentific_calculation();
			  String s=tf.getText();
			  tf.setText(" ");
			  try {
			  tf1.setText(c.solve(s));
			  }
			  catch(Exception ex)
			  {
				  tf1.setText("Invalid Input!");
			  }
		  });
		  b9.setOnAction(e ->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  String s=tf.getText();
			  tf.setText(s+"9");
		  });	
		  sum.setOnAction(e ->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  String s=tf.getText();
			  for(int i=0;i<s.length();i++)
			  {
			  if(s.charAt(0)=='+')
			 
				  tf.setText(" ");
			  
			  else
				  {
				  tf.setText(s+"+");
				  }}
		  });
  
		  multi.setOnAction(e ->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  String s=tf.getText();
			  for(int i=0;i<s.length();i++)
			  {
			  if(s.charAt(0)=='*')
			 
				  tf.setText(" ");
			  
			  else
				  {
				  tf.setText(s+"*");
				  }}
			 
		  });
		  div.setOnAction(e ->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  String s=tf.getText();
			  for(int i=0;i<s.length();i++)
			  {
			  if(s.charAt(0)=='/')
			 
				  tf.setText(" ");
			  
			  else
				  {
				  tf.setText(s+"/");
				  }}
		  });
		  sub.setOnAction(e ->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  String s=tf.getText();
			  tf.setText(s+"-");
			  tf1.setText(" ");
		  });
		  opbracket.setOnAction(e ->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  String s=tf.getText();
			  tf.setText(s+"(");
			  tf1.setText(" ");
		  });
		  clobracket.setOnAction(e ->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  String s=tf.getText();
			  tf.setText(s+")");
			  tf1.setText(" ");
		  });
		  
		  home.setOnAction(e ->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  tf.setText("  ");
			  tf1.setText(" ");
			 
		  });
		  sin.setOnAction(e->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  String s=tf.getText();
			  tf.setText(s+"sin(");
			  tf1.setText(" ");
		  });
		  cos.setOnAction(e->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  String s=tf.getText();
			  tf.setText(s+"cos(");
			  tf1.setText(" ");
		  });
		  tan.setOnAction(e->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  String s=tf.getText();
			  tf.setText(s+"tan(");
			  tf1.setText(" ");
		  });
		  asin.setOnAction(e->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  String s=tf.getText();
			  tf.setText(s+"sin-1(");
			  tf1.setText(" ");
		  });
		  acos.setOnAction(e->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  String s=tf.getText();
			  tf.setText(s+"cos-1(");
			  tf1.setText(" ");
		  });
		  atan.setOnAction(e->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  String s=tf.getText();
			  tf.setText(s+"tan-1(");
			  tf1.setText(" ");
		  });
		 
		  sqrt.setOnAction(e->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  String s=tf.getText();
			  tf.setText(s+"sqrt(");
			  tf1.setText(" ");
		  });
		  factor.setOnAction(e->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  String s=tf.getText();
			  tf.setText(s+"!");
			  tf1.setText(" ");
		  });
		  x.setOnAction(e->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  String s=tf.getText();
			  tf.setText(s+"ln");
			  tf1.setText(" ");
		  });
		  log.setOnAction(e->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  String s=tf.getText();
			  tf.setText(s+"log(");
			  tf1.setText(" ");
		  });
		  by.setOnAction(e->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  String s=tf.getText();
			  tf.setText(s+"3.141592653");
			  tf1.setText(" ");
		  });
		  
		  square.setOnAction(e ->
		  {
			  
			  if(flag)tf.setText("");
			  flag=true;
			  String s=tf.getText();
			  double m=Double.valueOf(s);
			  m*=m;
			  tf1.setText(m+"");
		  });
		  n.setOnAction(e ->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  String s=tf.getText();
			  tf.setText(s+"^");
			  tf1.setText(" ");
	
		  });
		  ce.setOnAction(e ->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  String s=tf.getText();
			 if(s.length()>0)
			 {
				s= s.substring(0,s.length()-1);
			 }
			 tf.setText(s+"");
		  });
		  
	  }
	  
	/*  public static void main(String[] args) {
	        Application.launch(args);

	    }
	  */  
	  }
	  
