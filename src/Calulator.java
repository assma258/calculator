
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

public class Calulator  extends Application{
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
	  Button home;
	  Button sqrt;
	  Button modulus1;
	  Button square;
	  Button sum;
	  Button sign;
	  Label tf;
	  Label tf1;
	  Scene scene;
	  MenuBar l1;
		 Menu fileMenu ;
		    MenuItem Standard;
		    MenuItem Scientific;
	         Menu f;
		    Scentific sd=new Scentific(); 
		    Stage thestage;	
	  boolean  flag=false;
	  @Override  
	  public void start(Stage primaryStage) throws Exception { 
		  thestage=primaryStage;
		 
		  l1 = new MenuBar();
			 fileMenu = new Menu("menu");
		     Standard = new MenuItem("Standard");
		     Scientific = new MenuItem("Scientific");
		  fileMenu.getItems().addAll(Standard, Scientific);
		    l1.getMenus().addAll(fileMenu);
      Standard.setOnAction(e->{              
				
				
			});
		 
      BorderPane pane=new BorderPane();
	  VBox v=new VBox();
	  v.setPadding(new Insets(10, 10,10, 10)); 
	  tf = new Label(""); 
	  tf.setPrefSize(500,35);
	  tf.setStyle("-fx-background-color: #d3d3d3;");
	  v.setPrefSize(400,70);
	  tf.setAlignment(Pos.BOTTOM_RIGHT);
	  tf1 = new Label(""); 
	  tf1.setPrefSize(500, 35);
	  tf1.setStyle("-fx-background-color: #d3d3d3;");
	  tf1.setAlignment(Pos.BOTTOM_RIGHT);
	  v.setStyle("-fx-background-color:black");
	  v.getChildren().addAll(tf,tf1);
	  HBox h2=new HBox(4);
	  h2.setPadding(new Insets(0, 5, 5, 5)); 
	  HBox h3=new HBox(4);
	  h3.setPadding(new Insets(0, 5, 5, 5)); 
	  HBox h4=new HBox(4);
	  h4.setPadding(new Insets(0, 5, 5, 5)); 
	  HBox h5=new HBox(4);
	  h5.setPadding(new Insets(0, 5, 5, 5)); 
	  HBox h6=new HBox(4);
	  h6.setPadding(new Insets(3, 5, 5, 5)); 
	  HBox h7=new HBox(4);
	  h7.setPadding(new Insets(0, 5, 5, 5)); 
	   sqrt=new Button("CE");
	   sqrt.setPrefWidth(40);
	   home=new Button("C");
	   home.setPrefWidth(40);
	   
	   modulus1=new Button("%");
	   modulus1.setPrefWidth(40);
	  
	   div=new Button("/");
	   div.setPrefWidth(40);
	   div.setStyle("-fx-background-color: #ff671c");
	   
	   h6.getChildren().addAll(sqrt,home,modulus1,div);
	  
	   b7=new Button("7");
	   b7.setPrefWidth(40);
	   b8=new Button("8");
	   b8.setPrefWidth(40);
	   b9=new Button("9");
	   b9.setPrefWidth(40);
	   multi=new Button("*");
	   multi.setPrefWidth(40);
	   multi.setStyle("-fx-background-color: #ff671c");

	   h2.getChildren().addAll(b7,b8,b9,multi);
	   b4=new Button("4");
	   b4.setPrefWidth(40);
	   b5=new Button("5");
	   b5.setPrefWidth(40);
	   b6=new Button("6");
	   b6.setPrefWidth(40);
	   sub=new Button("-");
	   sub.setPrefWidth(40);
	   sub.setStyle("-fx-background-color: #ff671c");
	   h3.getChildren().addAll(b4,b5,b6,sub);
	   
	   b1=new Button("1");
	   b1.setPrefWidth(40);
	   b2=new Button("2");
	   b2.setPrefWidth(40);
	   b3=new Button("3");
	   b3.setPrefWidth(40);
	   sum=new Button("+");
	   sum.setPrefWidth(40);
	   sum.setStyle("-fx-background-color: #ff671c");
	   h4.getChildren().addAll(b1,b2,b3,sum);
	  
	   b0=new Button("0");
	   b0.setPrefWidth(80);
	   dot=new Button(".");
	   dot.setPrefWidth(40);
	   equal=new Button("=");
	   equal.setPrefWidth(40);
	   equal.setStyle("-fx-background-color: #ff671c");
	   h5.getChildren().addAll(b0,dot,equal);
	   
	   opbracket=new Button("(");
	   opbracket.setPrefWidth(40);
	   clobracket=new Button(")");
	   clobracket.setPrefWidth(40);
	   square=new Button("1/x");
	   square.setPrefWidth(40);
	   sign=new Button("±");
	   sign.setPrefWidth(40);
	   sign.setStyle("-fx-background-color:#ff671c");
	   
	   h7.getChildren().addAll(  square, opbracket,clobracket,sign);
	  VBox v1=new VBox();
	  v1.getChildren().addAll(h6,h7,h2,h3,h4,h5);
	  v1.setStyle("-fx-background-color:black");
	  v1.setAlignment(Pos.CENTER);
	  pane.setBottom(v1);
	  pane.setTop(l1);
	  pane.setCenter(v); 
	  handle_events();
	  
	  Scene scene = new Scene(pane, 170, 260);   
	  primaryStage.setTitle("Aloma");
	  primaryStage.setScene(scene);
	  primaryStage.setResizable(false);
	  primaryStage.show(); 


}
	 
	  /**  function do any action input from calculator by user
	 * 
	 */
	void handle_events()
	  {
		  
		  
		 
		  Scientific.setOnAction(e->{               
				
				thestage.setScene(sd.scene);
				 sd.start(thestage);
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
		  modulus1.setOnAction(e ->
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
			  tf1.setText(" ");
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
			  tf.setText( " ");
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
			  tf1.setText(" ");
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
			  tf1.setText(" ");
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
			  tf1.setText(" ");
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
			  tf1.setText(" ");
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
			  tf1.setText("  ");
		  });
		  
		  
		  square.setOnAction(e ->
		  {
			  if(flag)tf.setText("");
			  flag=true;
			  String s=tf.getText();
			  double m=Double.valueOf(s);
			  double n=1/m;
			  tf1.setText(n+"");
			  
			
		  });
		  sqrt.setOnAction(e ->
		  {
			  if(flag)tf.setText("");
			  flag=false;
			  String s=tf.getText();
			 if(s.length()>0)
			 {
				s= s.substring(0,s.length()-1);
			 }
			 tf.setText(s+"");
			 tf1.setText(" ");
		  });
		 
		  
	  }
	  public static void main(String[] args) {
	        Application.launch(args);

	    }
}
	  
