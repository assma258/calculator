
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.text.*;

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
	  Label tf;
	  Label tf1;
	  Scene scene;
	  boolean  flag=false;
	  @Override  
	  public void start(Stage primaryStage) throws Exception { 
		 
	
		  BorderPane pane=new BorderPane();
		  VBox v=new VBox();
		  v.setPadding(new Insets(10, 10,10, 10)); 
		  tf = new Label(""); 
		  tf.setPrefSize(500,35);
		  v.setPrefSize(400,70);
		  tf.setAlignment(Pos.BOTTOM_RIGHT); 
		  tf.setStyle("-fx-background-color:#050505;-fx-font-size:30px;");
		 // tf.setStyle("-fx-border-color: #69c4e2");
		  tf1 = new Label(""); 
		  tf1.setPrefSize(500, 35);
		  tf1.setAlignment(Pos.BOTTOM_RIGHT); 
		  tf1.setStyle("-fx-background-color:#050505;-fx-font-size:30px;");
		  //tf1.setStyle("-fx-border-color: #69c4e2");
		  v.setStyle("-fx-background-color:#EAE6E5;");
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
		   b7.setStyle("-fx-border-radius:10px;-fx-background-color:#F0EEEC;");
		   b7.setPrefWidth(40);
		   b8=new Button("8");
		   b8.setStyle("-fx-border-radius:10px;-fx-background-color:#F0EEEC;");
		   b8.setPrefWidth(40);
		   b9=new Button("9");
		   b9.setStyle("-fx-border-radius:10px;-fx-background-color:#F0EEEC;");
		   b9.setPrefWidth(40);
		   modulus1=new Button("%");
		   modulus1.setStyle("-fx-border-radius:10px;-fx-background-color:#FF5C08;");
		   modulus1.setPrefWidth(40);
		   sqrt=new Button("CE");
		   sqrt.setStyle("-fx-border-radius:10px;-fx-background-color:#E44F02;");
		   sqrt.setPrefWidth(40);
		   home=new Button("C");
		   home.setStyle("-fx-border:10px;-fx-background-color:#E44F02;");
		   home.setPrefWidth(40);
		   h2.getChildren().addAll(b7,b8,b9,modulus1,sqrt,home);
		   b4=new Button("4");
		   b4.setStyle("-fx-border-radius:10px;-fx-background-color:#F0EEEC;");
		   b4.setPrefWidth(40);
		   b5=new Button("5");
		   b5.setStyle("-fx-border-radius:10px;-fx-background-color:#F0EEEC;");
		   b5.setPrefWidth(40);
		   b6=new Button("6");
		   b6.setStyle("-fx-border-radius:10px;-fx-background-color:#F0EEEC;");
		   b6.setPrefWidth(40);
		   multi=new Button("*");
		   multi.setStyle("-fx-border-radius:10px;-fx-background-color:#FF5C08;");
		   multi.setPrefWidth(40);
		   opbracket=new Button("(");
		   opbracket.setStyle("-fx-border-radius:10px;-fx-background-color:#FF5C08;");
		   opbracket.setPrefWidth(40);
		   clobracket=new Button(")");
		   clobracket.setStyle("-fx-border-radius:10px;-fx-background-color:#FF5C08;");
		   clobracket.setPrefWidth(40);
		   h3.getChildren().addAll(b4,b5,b6,multi,opbracket,clobracket);
		   b1=new Button("1");
		   b1.setStyle("-fx-border-radius:10px;-fx-background-color:#F0EEEC;");
		   b1.setPrefWidth(40);
		   b2=new Button("2");
		   b2.setStyle("-fx-border-radius:10px;-fx-background-color:#F0EEEC;");
		   b2.setPrefWidth(40);
		   b3=new Button("3");
		   b3.setStyle("-fx-border-radius:10px;-fx-background-color:#F0EEEC;");
		   b3.setPrefWidth(40);
		   sub=new Button("-");
		   sub.setStyle("-fx-border-radius:10px;-fx-background-color:#FF5C08;");
		   sub.setPrefWidth(40);
		   square=new Button("1/x");
		   square.setStyle("-fx-border-radius:10px;-fx-background-color:#FF5C08;");
		   square.setPrefWidth(40);
		   div=new Button("/");
		   div.setStyle("-fx-border-radius:10px;-fx-background-color:#FF5C08;");
		   div.setPrefWidth(40);
		  h4.getChildren().addAll(b1,b2,b3,sub,square,div);
		   b0=new Button("0");
		   b0.setStyle("-fx-border-radius:10px;-fx-background-color:#F0EEEC;");
		   b0.setPrefWidth(80);
		   dot=new Button(".");
		   dot.setStyle("-fx-border-radius:10px;-fx-background-color:#F0EEEC;");
		   dot.setPrefWidth(40);
		   sum=new Button("+");
		   sum.setStyle("-fx-border-radius:10px;-fx-background-color:#FF5C08;");
		   sum.setPrefWidth(40);
		   equal=new Button("=");
		   equal.setStyle("-fx-border-radius:10px;-fx-background-color:#FF5C08;");
		   equal.setPrefWidth(80);
		  h5.getChildren().addAll(b0,dot,sum,equal);
		  VBox v1=new VBox();
		  v1.getChildren().addAll(h2,h3,h4,h5);
		  v1.setAlignment(Pos.CENTER);
		  v1.setStyle("-fx-background-color:#EAE6E5;");
		  pane.setTop(v);
		  pane.setCenter(v1); 
		  handle_events();
		  
		  Scene scene1 = new Scene(pane, 250, 230);   
		  primaryStage.setTitle("Aloma");
		  primaryStage.setScene(scene1);
		  primaryStage.setResizable(false);
		  primaryStage.show(); 

}
	  /*public String cc(String s1)
	  {
		  String s2;
		  
		  
	  }*/
	  void handle_events()
	  {
		  
		  
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
	  
