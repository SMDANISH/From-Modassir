import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.mysql.jdbc.jdbc2.optional.*;
import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 *
 * @author admin
 */
public class Frend extends javax.swing.JFrame 
{
    /**
     * Creates new form Frend
     */
    public Frend() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        textArea1 = new java.awt.TextArea();
        jTextField5 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        Font TamilFont = new Font("Latha", Font.BOLD,15);
        jTextField1.setFont(TamilFont);
        Font TamilFont1=new Font("Latha", Font.BOLD,15);
        jTextField2.setFont(TamilFont);
        Font TamilFont2=new Font("Latha", Font.BOLD,15);
        jTextField3.setFont(TamilFont);
        Font TamilFont3=new Font("Latha", Font.BOLD,15);
        jTextField4.setFont(TamilFont);
        
         Font TamilFont4=new Font("Latha", Font.BOLD,15);
        textArea1.setFont(TamilFont);
        
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Word");

        jLabel2.setText("Stem");

        jLabel3.setText("Suffix");

        jButton1.setText("GetResult");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Store Word");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton5.setText("WordSet");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton6.setText("Upload");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel4.setText("Enter Prefix");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jButton6))
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jButton2)
                        .addGap(32, 32, 32)
                        .addComponent(jButton3)
                        .addGap(35, 35, 35)
                        .addComponent(jButton4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGap(48, 48, 48)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                .addComponent(jTextField3)))))
                .addGap(175, 175, 175))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 100 , javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	try
    	{
    	 Class.forName ("com.mysql.jdbc.Driver"); 
             
    	try
    	{
       java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbase?useUnicode=true&characterEncoding=UTF-8", "root", "ALPHAS");
            
          System.setProperty("file.encoding" , "UTF-8");   
          
        String sws = "வெளியே";
            String Wquery = "SELECT * FROM word";
            ArrayList  Walt = new ArrayList();
            ArrayList  Walt1 = new ArrayList();
           
             Statement st = (Statement) conn.createStatement();
              
             
             ResultSet rs = st.executeQuery(Wquery);
             int ik=0;
            
             String s =    jTextField1.getText();
             int flag = 0 ; 
           
             while (rs.next())
             {
                String Ws = rs.getString("wd");
               
                 Walt.add(Ws) ;
                 ik = ik+1;
                 // print the results
                    for (int kj =0 ;kj<=ik-1;kj++ )
                  {
               	 if (s.equals(Ws))
               	 {
                		jTextField1.setText(sws);
                          
                		flag = 1 ;     
               	 }
                  }    		
               }  		
              
            if(flag == 0  )
            { 
            metWs(s);
            }
               }
        
    	catch(Exception E)
       {
    E.printStackTrace();


    }    
    	
          }
          catch(Exception E)
          {
    	E.printStackTrace();
          } 
        
                 
        // TODO add your handling code here:
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         

      //  PreparedStatement pst = null;
      
          try 
         {
         	// Class.forName("com.mysql.jdbc.Driver");
         	// Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbase","root","ALPHAS");
            // Statement st = conn.createStatement(); 
            
          //  String  fl = jTextField5.getText();
            FileInputStream input = new FileInputStream(jTextField5.getText());
            XSSFWorkbook wb = new XSSFWorkbook(input);
            XSSFSheet sheet = wb.getSheetAt(0);
            Row row;
       
            Frend db = new Frend ();
            for (int i = 1; i <= sheet.getLastRowNum(); i++) 
            {
                row = sheet.getRow(i);
                String wd = row.getCell(0).getStringCellValue();
                
                db.met(wd);
              
            }
           
        }
     //    catch (ClassNotFoundException e) 
     //   {
     //      System.out.println(e);
    //    } 
        catch (SQLException ex)
       {
            System.out.println(ex);
        } 
        catch (IOException ioe) 
        {
          System.out.println(ioe);
        }

	// TODO add your handling code here:
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
         
        try
    {
      // create our mysql database connection
      String myDriver = "com.mysql.jdbc.Driver";
      String myUrl = "jdbc:mysql://localhost:3306/mydbase?useUnicode=true&characterEncoding=UTF-8";
      Class.forName(myDriver);
        java.sql.Connection conn = DriverManager.getConnection(myUrl, "root", "ALPHAS");
       
      // our SQL SELECT query. 
      // if you only need a few columns, specify them by name instead of using "*"
      String query = "SELECT * FROM morph";
     ArrayList  alt = new ArrayList();
     ArrayList  alt1 = new ArrayList();
      // create the java statement
      Statement st = (Statement) conn.createStatement();
       
      // execute the query, and get a java resultset
      ResultSet rs = st.executeQuery(query);
      int i=0;
      int h=0;
      // iterate through the java resultset
      while (rs.next())
      {
        
        String Stems = rs.getString("StemList");
        String Suffxs = rs.getString("SuffixList");
          alt.add(Stems) ;
          alt1.add(Suffxs) ;
         i=i+1;
        // print the results
       
      }
     // System.out.println(""+i);
      String ws =    jTextField4.getText();
   //   for( h= 0;h<=i-1;h++)
  //    {
     for (int k =0 ;k<=i-1;k++ )
     {
     // System.out.println("" +"alt[0]"  +"alt1[i]");
       //         alt.get(0);
       //String kjh =
      //  String ws =    jTextField4.getText();
        String Aword  =   " "+  ws+alt1.get(k)  ;
      
        String query1 = "insert into wordset values (?)";
        
        java.sql.PreparedStatement psmt = conn.prepareStatement(query1);
        psmt.setString(1,Aword);
        psmt.execute();
       
        //textArea2.setText(Aword);
        textArea1.append(Aword);
      
       // list1.set(Aword);
      //System.out.println(ws+""+alt1.get(k) ); 
                 System.out.println(Aword ); 
   //   jEditorPane1.setText(Aword);
      
     }
    //  }
     // System.out.println(""+alt + alt1);
      
      
      st.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
        // TODO add your handling code here:
        // TODO add your handling code here:
    }                                        

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        textArea1.setText("");
        // TODO add your handling code here:
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
try
 {
     try {
         Class.forName ("com.mysql.jdbc.Driver");
     } catch (ClassNotFoundException ex) {
         java.util.logging.Logger.getLogger(Frend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     }
     
   java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbase?useUnicode=true&characterEncoding=UTF-8", "root", "ALPHAS");
    //      String sql = "Insert into morph values (?,?,?)";
          
     String gsql = "select StemList,SuffixList  from morph where Word ="+"'"+jTextField1.getText()+"'";
        try 
        {
            //java.sql.PreparedStatement psmt = conn.prepareStatement(gsql);
                   //    java.sql.Statement smnt = conn.createStatement();
                    //   java.sql.ResultSet results = smnt.executeQuery( gsql );
                
    // java.sql.ResultSetMetaData metaDt = results.getMetaData();
//System.out.println(metaDt);
      
     java.sql.Statement     stmt = conn.createStatement();
        java.sql.ResultSet rs = stmt.executeQuery(gsql);
        while(rs.next())
         {
        	jTextField2.setText(rs.getString("StemList"));
        	jTextField3.setText(rs.getString("SuffixList"));
        	
           // text2.setText(rs.getString("address"));
            }
    } 
        catch (SQLException e ) 
    {
        	e.printStackTrace();
   //     JDBCTutorialUtilities.printSQLException(e);
    } 
    } 
        catch (SQLException e ) 
    {
        	e.printStackTrace();
   //     JDBCTutorialUtilities.printSQLException(e);
    } 
        
         // TODO add your handling code here:
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        
        this.hide();
        
        // TODO add your handling code here:
    }                                        

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    
        
        // TODO add your handling code here:
    }                                           

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    	
    	
    	System.setProperty("file.encoding" , "UTF-8");
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frend.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
         java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new Frend().setVisible(true);
            }

  
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private java.awt.TextArea textArea1;
    // End of variables declaration                   

    void met(String wd)throws SQLException, IOException
    {
        
        int k = 1;
    	//java.sql.PreparedStatement psmt = conn.prepareStatement(wd);
        char[] ch = wd.toCharArray();
      //  String ghkl = wd;
        int y = wd.length();
         
        for (int m = y - 1; m >= 0; m--) 
        {
            String pl1 = new String(ch, 0, m);
            if (pl1.length() >= 2)
            {
                char[] dh = new char[y];
                int c = y - 1;
                int g = y - 1;

                for (int j = c; j <= y; j--) 
                {
                    if (m >= 2)
                    {
                        dh[g] = ch[j];
                        String pl = new String(ch,0,m);
                        String mpm = new String(dh,0,y);
                        --m;
                   //     System.out.println(""+pl+"/"+mpm.trim()+"");
                        g--;
                       k++;
                       if (k==y-1)
                       {
                    	
                   metA(wd,pl,mpm.trim()+"");
		   System.out.println(""+pl+"/"+mpm.trim()+"");
                      }
                    }
                }
            }
        }
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     void metA(String dfr,String rfd,String fed) throws SQLException, IOException
     
     {
         try 
              {
         	 Class.forName("com.mysql.jdbc.Driver");
         	 Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbase?useUnicode=true&characterEncoding=UTF-8", "root", "ALPHAS");
          
         	
         	
            String query = "insert into morph values ('"+dfr+"','"+rfd+"','"+fed+"')";
            	 
          
            	      java.sql.PreparedStatement pst = conn.prepareStatement(query);
             
            	 
            	      String Asql1 = "insert into  word values('"+dfr+"')";
            	      java.sql.PreparedStatement Apst = conn.prepareStatement(Asql1);
            	        String Asql2 = "insert into  stems values('"+rfd+"')";
            	        java.sql.PreparedStatement Bpst = conn.prepareStatement(Asql2);
            	    	String Asql3 = "insert into  suffixs values('"+fed+"')";
            	    	java.sql.PreparedStatement Cpst = conn.prepareStatement(Asql3);
            	      
            	      
              pst.execute();
              Apst.execute();
              Bpst.execute();
              Cpst.execute();
             
             
             conn.close(); 
                }
		 catch (ClassNotFoundException e) 
	        {
	           System.out.println(e);
	        } 
		 catch (SQLException ex)
	       {
	            System.out.println(ex);
	        }
       //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }





void  metWs (String ghf)throws SQLException, IOException
{
	try
	{
	 Class.forName ("com.mysql.jdbc.Driver"); 
         
	try
	{
   java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbase?useUnicode=true&characterEncoding=UTF-8", "root", "ALPHAS");
      
   System.setProperty("file.encoding" , "UTF-8");  
   String sql = "insert into morph values(?,?,?)";
        String sql1 = "insert into  word values(?)";
        String sql2 = "insert into  stems values(?)";
    	String sql3 = "insert into  suffixs values(?)";
	     java.sql.PreparedStatement psmt = conn.prepareStatement(sql);
	     java.sql.PreparedStatement psmt1 = conn.prepareStatement(sql1);
	     java.sql.PreparedStatement psmt2 = conn.prepareStatement(sql2);
	     java.sql.PreparedStatement psmt3 = conn.prepareStatement(sql3);
	char[] ch = ghf.toCharArray();
	int y = ghf.length();
	int k=1;
	for (int m = y-1 ; m >=0; m--)
	{
	    String pl1 = new String(ch,0,m);
	    if(pl1.length()>=2)
	    {
	      
	     char[] dh = new char[y];
	      int c=y-1;
	      int g = y-1;
	      
	    
	      
	      for (int j=c; j>=0; j--) 
	   {
	     if(m>=2)
	      {
	  	  
	        dh[g] = ch[j];
	       
		  String pl = new String(ch,0,m);
		  String mpm  = new String(dh,0,y);
		--m;
	         // System.out.println(""+pl+"/"+mpm.trim()+"");
		 
	         // System.out.println(""+pl+"/"+mpm.trim()+"");
		
		   
		   g--;
		   k++;
		 
		if(k==y-1 )
		    
		    
		{
			
		System.setProperty("file.encoding" , "UTF-8");
		System.out.println(""+pl+"/"+mpm.trim()+"");
		psmt.setString(1,ghf);
		psmt.setString(2,pl);
		psmt.setString(3,mpm.trim()+"");  
		psmt1.setString(1,ghf);
		psmt2.setString(1,pl);
		psmt3.setString(1,mpm.trim()+"");  
		psmt.executeUpdate(); 
		psmt1.executeUpdate(); 
		psmt2.executeUpdate(); 
		psmt3.executeUpdate(); 
	         
		}
		          
	   } 
	     
		    }
		       
		     }
		}
	
	}
    
	catch(Exception E)
   {
E.printStackTrace();


}    
	
      }
      catch(Exception E)
      {
	E.printStackTrace();
      } 
	
	
}


}























