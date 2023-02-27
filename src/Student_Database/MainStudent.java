package Student_Database;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;







public class MainStudent {

	public static void main(String[] args) throws NumberFormatException, IOException, SQLException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int choice;
        int Number;
        String emoji=new String(Character.toChars(0x1F6B6));
        String emoji1=new String(Character.toChars(0x2B50));
        String emoji2=new String(Character.toChars(0x25B6));
        String emoji3=new String(Character.toChars(0x25C0));
        String emoji4=new String(Character.toChars(0x1F449));
        String emoji5=new String(Character.toChars(0x1F447));
        String emoji6=new String(Character.toChars(0x1F649));
        String emoji7=new String(Character.toChars(0x27A1));
		System.out.println();
     System.out.println("======================"+emoji3+""+emoji1+""+emoji+""+emoji+""+emoji+""+emoji1+ "WelCome To Student Management System(SMS)"+emoji1+""+emoji+""+emoji+""+emoji+""+emoji1+""+emoji2+"=========================================================================");
     System.out.println();
		/*
		 * Student s=new
		 * Student("Ram Kumar","Singh",1234,24,"05/12/1998","BTech","Bihar");
		 * 
		 * System.out.println("Student Name : "+s.getFirstNane()+" "+s.getLastName());
		 * System.out.println("Student Registration Id : "+s.getRegistrationId());
		 * System.out.println("Student Age : "+s.getAge());
		 * System.out.println("Student Date Of Birth : "+s.getDob());
		 * System.out.println("Student Highest Qualification : "+s.
		 * getHighestQualification());
		 * System.out.println("Student Belongs From : "+s.getState());
		 */
       
         System.out.println("====================================="+emoji3+" Enter Your Choice "+emoji2+"=============================================================================================\n");
     System.out.println("\t\t\t\t 1. "+emoji4+""+emoji4+"   Student Portal");
     System.out.println("\t\t\t\t 2. "+emoji4+""+emoji4+"   Admin Portal");
     System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
     System.out.print("\t\t\t\t\tEnter your choice :"+emoji2+" ");
      choice=Integer.parseInt(br.readLine());
      boolean login=true;
  	  String status=null;

    	 if(choice ==1) {
         System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
    	 System.out.println("\t\t\t\t 1. "+emoji4+""+emoji4+"   SignUp");
    	 System.out.println("\t\t\t\t 2. "+emoji4+""+emoji4+"   Login");
    	 System.out.println("\t\t\t\t 3. "+emoji4+""+emoji4+"   Exist ");
         System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
         System.out.print("\t\t\t\t\tEnter your choice :"+emoji2+" ");
          choice=Integer.parseInt(br.readLine());

         switch(choice) {
         case 1:
             try {
             System.out.println("================================"+emoji3+" ENTER YOUR DETAILS "+emoji2+"=====================================================================================================================================\n");
             System.out.print("\t\t\t\t Enter Your First name :"+emoji7+" ");
        	 String firstname=br.readLine();
        	 
        	 System.out.print("\t\t\t\t Enter Your Last Name :"+emoji7+" ");
        	 String lastname=br.readLine();
        	 
        	 System.out.print("\t\t\t\t Enter Your Contact Number :"+emoji7+" ");
        	 double phone =Double.parseDouble(br.readLine());

        	 System.out.print("\t\t\t\t Enter Your Email Id:"+emoji7+" ");
        	 String email=br.readLine();
        	 
        	 System.out.print("\t\t\t\t Enter Your User Name :"+emoji7+" ");
        	 String username=br.readLine();
        	 
        	 System.out.print("\t\t\t\t Enter Your Password :"+emoji7+" ");
        	 String password=br.readLine();
        	 
        	 System.out.print("\t\t\t\t Enter Your Gender :"+emoji7+" ");
        	 String gender=br.readLine();
        	 
        	 System.out.print("\t\t\t\t Enter Your DOB :"+emoji7+" ");
        	 String dob=br.readLine();
        	 
        	 System.out.print("\t\t\t\t Enter Your highest Qualification :"+emoji7+" ");
        	 String qualification=br.readLine();
        	 
        	 System.out.print("\t\t\t\t Enter Your Percentage :"+emoji7+" ");
        	 Double percentage=Double.parseDouble(br.readLine());
        	
        	 System.out.print("\t\t\t\t Enter Your State :"+emoji7+" ");
        	 String state=br.readLine();
        	 
        	 System.out.print("\t\t\t\t Enter Your Country Name :"+emoji7+" ");
        	 String country=br.readLine();
        	 
        	 System.out.print("\t\t\t\t Enter your Pin Code :"+emoji7+" ");
        	 int pin=Integer.parseInt(br.readLine());
        	 
        	 
				 System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------"); 
				 System.out.println("\t\t\t\t"+emoji5+"...your Details Are Following..."+emoji5);
				 System.out.println("\t\t\t\t Please Review Your Details are Correct or Not");
				 System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
				 
				 System.out.println("\t\t\t\t Your Full Name :"+emoji4+" "+firstname +" "+lastname);
				 System.out.println("\t\t\t\t Your Mobile Number :"+emoji4+" "+phone); 
				 System.out.println("\t\t\t\t Your Email Id :"+emoji4+" "+email);
				 System.out.println("\t\t\t\t Your User Id :"+emoji4+" "+username);
				 System.out.println("\t\t\t\t Your Password :"+emoji4+" "+password);
				 System.out.println("\t\t\t\t Your Gender :"+emoji4+" "+gender);
				 System.out.println("\t\t\t\t Your Date Of Birth :"+emoji4+" "+dob);
				 System.out.println("\t\t\t\t Your Highest Qualification :"+emoji4+" "+qualification);
				 System.out.println("\t\t\t\t Your Percentage :"+emoji4+" "+percentage);
				 System.out.println("\t\t\t\t Your State :"+emoji4+" "+state);
				 System.out.println("\t\t\t\t Your State :"+emoji4+" "+country);
				 System.out.println("\t\t\t\t Your Pin Code :"+emoji4+" "+pin); 
				 System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------" );
				 System.out.print (" \t\t\t\t Do you want to Submit??(Y/N)"+emoji6+" ");
				 status=br.readLine(); 
				 System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------" );
				 if(status.equals("n") || status.equals("N")) 
				 { 
					 login=false;
				}
	          String query="INSERT into studentsignupaccount(firstname, lastname, phoneNo, email, userName, password, gender, dob, highestQualification, percentage, state, country, pin)" + " values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";      
        	  Connection conn=MysqlConnection.getConnection();
        	  PreparedStatement pstmt = conn.prepareStatement(query);
        	  pstmt.setString(1, firstname);
        	  pstmt.setString(2, lastname);
        	  pstmt.setDouble(3, phone);
        	  pstmt.setString(4, email);
        	  pstmt.setString(5, username);
        	  pstmt.setString(6, password);
        	  pstmt.setString(7, gender);
        	  pstmt.setString(8, dob);
        	  pstmt.setString(9, qualification);
        	  pstmt.setDouble(10, percentage);
        	  pstmt.setString(11, state);
        	  pstmt.setString(12, country);
              pstmt.setInt(13, pin);
        	  int insertStatus = pstmt.executeUpdate();
              if(insertStatus > 0) {
                 System.out.println("\t\t\t\t !!!!!Record is inserted successfully!!!!!");
              }
             System.out.println("\t\t\t\t All Right , We got your entry records ");
        	 System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
             }
             catch(Exception e)    
              {
            	 System.out.println(e);
              }    
             finally
             {    
                 System.out.println("\t\t\t\t Thanks for using our code");    
             } 
        	 System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
        	 System.out.print (" \t\t\t\t Do you want to Continue??(Y/N)"+emoji6+" ");
             status=br.readLine();
        	 System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------");
             if(status.equals("y") || status.equals("Y"))
 		     {
 		       login=true;
 		     }
             
     case 2:
         
             System.out.println("===================================="+emoji3+" ENTER YOUR USERNAME & PASSWORD "+emoji2+"=====================================================================================================================================\n");
             System.out.print("\t\t\t\t Enter your username:"+emoji7+" ");
             String username=br.readLine();
             System.out.print("\t\t\t\t Enter your password:"+emoji7+" ");
             String Password=br.readLine();
             System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
             Connection conn=MysqlConnection.getConnection();
             PreparedStatement ps=conn.prepareStatement("select * from studentSignupAccount where userName=?");
             ps.setString(1,username);
             ResultSet result=ps.executeQuery();
             String password=null;
                 while(result.next())
                 {
                     password=result.getString("Password");
                 }
             if(Password.equals(password))
             {
                 System.out.println("\t\t\t\t !!!!!You have successfully logged in!!!!!");
                 login=true;
                 do
                 {
                 
                 System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
                 System.out.println("========================================"+emoji3+" WELCOME " + username.toUpperCase()+" "+emoji2+"===============================================================================================================");
                 System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                 System.out.println("\t\t\t\t 1. "+emoji4+""+emoji4+"   New Adimission");
                 System.out.println("\t\t\t\t 2. "+emoji4+""+emoji4+"   Available course");
                 System.out.println("\t\t\t\t 3. "+emoji4+""+emoji4+"   Enroll Course");
                 System.out.println("\t\t\t\t 4. "+emoji4+""+emoji4+"   Payment");
                 System.out.println("\t\t\t\t 5. "+emoji4+""+emoji4+"   Payment Status");
                 System.out.println("\t\t\t\t 6. "+emoji4+""+emoji4+"   Change Password");
                 System.out.println("\t\t\t\t 7. "+emoji4+""+emoji4+"   Student Details");
                 System.out.println("\t\t\t\t 8. "+emoji4+""+emoji4+"   Exit / Logout");
                 System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                 System.out.print("\t\t\t\t Enter your choice:"+emoji2+" "); 
                 int operationNumber=Integer.parseInt(br.readLine());
                 System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                  status=null;
                 switch(operationNumber)
                 {
                 case 1: 
                	 try {
                		 System.out.println("\t\t\t\t Enter Your Details Below..\n");
                		 
                    	 System.out.print("\t\t\t\t Enter Your Full Name :"+emoji7+" ");
                    	 String fullname=br.readLine();
                    	 
                    	 System.out.print("\t\t\t\t Enter Your Parrents Name :"+emoji7+" ");
                    	 String parentsname=br.readLine();
                    	 
                    	 System.out.print("\t\t\t\t Enter Your Mobile Number :"+emoji7+" ");
                    	 long mobile =Long.parseLong(br.readLine());

                    	 System.out.print("\t\t\t\t Enter Your Active Email Id :"+emoji7+" ");
                    	 String email=br.readLine();
                    	 
                    	 System.out.print("\t\t\t\t Enter Your Gender :"+emoji7+" ");
                    	 String gender=br.readLine();
                    	 
                    	 System.out.print("\t\t\t\t Enter Your Date Of Birth :"+emoji7+" ");
                    	 String dob=br.readLine();
                    	 
                    	 System.out.print("\t\t\t\t Enter Your Age :"+emoji7+" ");
                    	 int age=Integer.parseInt(br.readLine());
                    	 
                    	 System.out.print("\t\t\t\t Enter Your Valid Aadhar Number :"+emoji7+" ");
                    	 long Aadhar=Long.parseLong(br.readLine());
                    	 
                    	 System.out.print("\t\t\t\t Enter Your Full Address :"+emoji7+" ");
                    	 String address=br.readLine();
                    	 
                    	 System.out.print("\t\t\t\t Enter Your State Name :"+emoji7+" ");
                    	 String state=br.readLine();
                    	 
                    	 System.out.print("\t\t\t\t Enter Your Country Name :"+emoji7+" ");
                    	 String country=br.readLine();
                    	 
                    	 System.out.print("\t\t\t\t Enter Your Pin Code :"+emoji7+" ");
                    	 int pin=Integer.parseInt(br.readLine());
                    	 
                    	 System.out.print("\t\t\t\t Enter Your Account Id :"+emoji7+" ");
                    	 int accid=Integer.parseInt(br.readLine());
                    	 
                    	 System.out.print("\t\t\t\t Enter Your Account Type :"+emoji7+" ");
                    	 String acctype=br.readLine();
                    	 
                    	 System.out.print("\t\t\t\t Enter Your Account Balance :"+emoji7+" ");
                    	 Double accbalance=Double.parseDouble(br.readLine());
                    	 
                    	 System.out.print("\t\t\t\t Enter Your IFSC Code :"+emoji7+" ");
                    	 String ifscCode=br.readLine();
                    	 
                    	 System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------"); 
        				 System.out.println("\t\t\t\t"+emoji5+"...your Details Are Following..."+emoji5);
        				 System.out.println("\t\t\t\t Please Review Your Details are Correct or Not");
        				 System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
        				 
        				 System.out.println("\t\t\t\t Your Full Name :"+emoji4+" "+fullname);
        				 System.out.println("\t\t\t\t Your Parrents Name :"+emoji4+" "+parentsname); 
        				 System.out.println("\t\t\t\t Your Contact No :"+emoji4+" "+mobile);
        				 System.out.println("\t\t\t\t Your Email Id :"+emoji4+" "+email);
        				 System.out.println("\t\t\t\t Your Gender :"+emoji4+" "+gender);
        				 System.out.println("\t\t\t\t Your Date Of Birth :"+emoji4+" "+dob);
        				 System.out.println("\t\t\t\t Your Age :"+emoji4+" "+age);
        				 System.out.println("\t\t\t\t Your Aadhar No :"+emoji4+" "+Aadhar);
        				 System.out.println("\t\t\t\t Your Address :"+emoji4+" "+address);
        				 System.out.println("\t\t\t\t Your State Name :"+emoji4+" "+state);
        				 System.out.println("\t\t\t\t Your Country Name :"+emoji4+" "+country);
        				 System.out.println("\t\t\t\t Your Pin Code :"+emoji4+" "+pin);
        				 System.out.println("\t\t\t\t Your Account Id :"+emoji4+" "+accid);
        				 System.out.println("\t\t\t\t Your Account Type :"+emoji4+" "+acctype);
        				 System.out.println("\t\t\t\t Your Account Balance :"+emoji4+" "+accbalance);
        				 System.out.println("\t\t\t\t Your Account IFSC Code :"+emoji4+" "+ifscCode);
        				 
        				 System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------" );
        				 System.out.print (" \t\t\t\t Do you want to Submit??(Y/N)"+emoji6+" ");
        				 status=br.readLine(); 
        				 System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------" );
        				 if(status.equals("n") || status.equals("N")) 
        				 { 
        					 login=false;
        				}
        	          String query="INSERT into admissionAccount(fullname, parentsname, phoneNo, email, gender, dob, age, AadharNo, Address, state, country, pin, accountId, accountType, accountBalance, IfscCode)" + " values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,? ,?,?)";      
                	  conn=MysqlConnection.getConnection();
                	  PreparedStatement pstmt = conn.prepareStatement(query);
                	  pstmt.setString(1, fullname);
                	  pstmt.setString(2, parentsname);
                	  pstmt.setDouble(3, mobile);
                	  pstmt.setString(4, email);
                	  pstmt.setString(5, gender);
                	  pstmt.setString(6, dob);
                	  pstmt.setInt(7, age);
                	  pstmt.setLong(8, Aadhar);
                	  pstmt.setString(9, address);
                	  pstmt.setString(10, state);
                	  pstmt.setString(11, country);
                	  pstmt.setInt(12, pin);
                      pstmt.setInt(13, accid);
                      pstmt.setString(14, acctype);
                      pstmt.setDouble(15, accbalance);
                      pstmt.setString(16, ifscCode);
                      
                	  int insertStatus = pstmt.executeUpdate();
                      if(insertStatus > 0) {
                         System.out.println("\t\t\t\t !!!!!Your Adimission successfully!!!!!  \n");
                      }
              
            			 System.out.print ("\t\t\t\t Do you want to Continue??(Y/N)"+emoji6+" ");
                         status=br.readLine();
        				 System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------" );
                        if(status.equals("n") || status.equals("N"))
                        {
                            login=false;
                        }
                	 }
                          catch(Exception e)    
                          {
                        	 System.out.println(e);
                          }    
                         finally
                         {    
                             System.out.println("\t\t\t\t Thanks for using our code");    
                         }  
                 
                	 break;
                 
         	 
         case 2:  
        	 try {
        		 System.out.println("\t\t\t.........Here Can You Check All Availables Course.........\n");
            	 System.out.println("\t\t SINO   \t Course Name    \t Course Fee     \t Offer Discount     \t Total Fee \n");
                 System.out.println("\t\t"+emoji4+" "+" 1.    \t"+emoji7+""+emoji7+" 10th        \t"+emoji7+""+emoji7+" 11499      \t"+emoji7+""+emoji7+" 999            \t"+emoji7+""+emoji7+" 10500\n");
                 System.out.println("\t\t"+emoji4+" "+" 2.    \t"+emoji7+""+emoji7+" 12th        \t"+emoji7+""+emoji7+" 26999      \t"+emoji7+""+emoji7+" 1499           \t"+emoji7+""+emoji7+" 25500\n");
                 System.out.println("\t\t"+emoji4+" "+" 3.    \t"+emoji7+""+emoji7+" BSC(Math)   \t"+emoji7+""+emoji7+" 37499      \t"+emoji7+""+emoji7+" 1999           \t"+emoji7+""+emoji7+" 35500\n");
                 System.out.println("\t\t"+emoji4+" "+" 4.    \t"+emoji7+""+emoji7+" BCA         \t"+emoji7+""+emoji7+" 107499     \t"+emoji7+""+emoji7+" 2499           \t"+emoji7+""+emoji7+" 105000\n");
                 System.out.println("\t\t"+emoji4+" "+" 5.    \t"+emoji7+""+emoji7+" B.TECH      \t"+emoji7+""+emoji7+" 358999     \t"+emoji7+""+emoji7+" 4999           \t"+emoji7+""+emoji7+" 354000\n");
                 System.out.println("\t\t"+emoji4+" "+" 6.    \t"+emoji7+""+emoji7+" MCA         \t"+emoji7+""+emoji7+" 208499     \t"+emoji7+""+emoji7+" 3499           \t"+emoji7+""+emoji7+" 205000\n");
                 System.out.println("\t\t"+emoji4+" "+" 7.    \t"+emoji7+""+emoji7+" M.Tech      \t"+emoji7+""+emoji7+" 259999     \t"+emoji7+""+emoji7+" 3999           \t"+emoji7+""+emoji7+" 256000");
            	 System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                 System.out.println("\t\t\t\t You Can Purchase Any Course");
                 System.out.println("\t\t\t\t !!!!!First You Take Admission!!!!!");	
                 System.out.print("\t\t\t\t Already You Completed Admission Please Type (Y/N)"+emoji2+" ");
                 status=br.readLine(); 
			 
			     if(status.equals("n") || status.equals("N")) 
			     {
				 System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
				 System.out.println("\t\t\t\t Enter Your Details Below..\n");
        		 
            	 System.out.print("\t\t\t\t Enter Your Full Name :"+emoji7+" ");
            	 String fullname=br.readLine();
            	 
            	 System.out.print("\t\t\t\t Enter Your Parrents Name :"+emoji7+" ");
            	 String parentsname=br.readLine();
            	 
            	 System.out.print("\t\t\t\t Enter Your Mobile Number :"+emoji7+" ");
            	 long mobile =Long.parseLong(br.readLine());

            	 System.out.print("\t\t\t\t Enter Your Active Email Id :"+emoji7+" ");
            	 String email=br.readLine();
            	 
            	 System.out.print("\t\t\t\t Enter Your Gender :"+emoji7+" ");
            	 String gender=br.readLine();
            	 
            	 System.out.print("\t\t\t\t Enter Your Date Of Birth :"+emoji7+" ");
            	 String dob=br.readLine();
            	 
            	 System.out.print("\t\t\t\t Enter Your Age :"+emoji7+" ");
            	 int age=Integer.parseInt(br.readLine());
            	 
            	 System.out.print("\t\t\t\t Enter Your Valid Aadhar Number :"+emoji7+" ");
            	 long Aadhar=Long.parseLong(br.readLine());
            	 
            	 System.out.print("\t\t\t\t Enter Your Full Address :"+emoji7+" ");
            	 String address=br.readLine();
            	 
            	 System.out.print("\t\t\t\t Enter Your State Name :"+emoji7+" ");
            	 String state=br.readLine();
            	 
            	 System.out.print("\t\t\t\t Enter Your Country Name :"+emoji7+" ");
            	 String country=br.readLine();
            	 
            	 System.out.print("\t\t\t\t Enter Your Pin Code :"+emoji7+" ");
            	 int pin=Integer.parseInt(br.readLine());
            	 
            	 System.out.print("\t\t\t\t Enter Your Account Id :"+emoji7+" ");
            	 int accid=Integer.parseInt(br.readLine());
            	 
            	 System.out.print("\t\t\t\t Enter Your Account Type :"+emoji7+" ");
            	 String acctype=br.readLine();
            	 
            	 System.out.print("\t\t\t\t Enter Your Account Balance :"+emoji7+" ");
            	 Double accbalance=Double.parseDouble(br.readLine());
            	 
            	 System.out.print("\t\t\t\t Enter Your IFSC Code :"+emoji7+" ");
            	 String ifscCode=br.readLine();
            	 
            	 System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------"); 
				 System.out.println("\t\t\t\t"+emoji5+"...your Details Are Following..."+emoji5+"\n");
				 System.out.println("\t\t\t\t Please Review Your Details are Correct or Not");
				 System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
				 
				 System.out.println("\t\t\t\t Your Full Name :"+emoji4+" "+fullname);
				 System.out.println("\t\t\t\t Your Parrents Name :"+emoji4+" "+parentsname); 
				 System.out.println("\t\t\t\t Your Contact No :"+emoji4+" "+mobile);
				 System.out.println("\t\t\t\t Your Email Id :"+emoji4+" "+email);
				 System.out.println("\t\t\t\t Your Gender :"+emoji4+" "+gender);
				 System.out.println("\t\t\t\t Your Date Of Birth :"+emoji4+" "+dob);
				 System.out.println("\t\t\t\t Your Age :"+emoji4+" "+age);
				 System.out.println("\t\t\t\t Your Aadhar No :"+emoji4+" "+Aadhar);
				 System.out.println("\t\t\t\t Your Address :"+emoji4+" "+address);
				 System.out.println("\t\t\t\t Your State Name :"+emoji4+" "+state);
				 System.out.println("\t\t\t\t Your Country Name :"+emoji4+" "+country);
				 System.out.println("\t\t\t\t Your Pin Code :"+emoji4+" "+pin);
				 System.out.println("\t\t\t\t Your Account Id :"+emoji4+" "+accid);
				 System.out.println("\t\t\t\t Your Account Type :"+emoji4+" "+acctype);
				 System.out.println("\t\t\t\t Your Account Balance :"+emoji4+" "+accbalance);
				 System.out.println("\t\t\t\t Your Account IFSC Code :"+emoji4+" "+ifscCode);
				 
				 System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------" );
				  
				 System.out.print (" \t\t\t\t Do you want to Submit??(Y/N)"+emoji6+" ");
				 status=br.readLine(); 
				 System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------" );
				 
				 if(status.equals("n") || status.equals("N")) 
				 { 
					 login=false;
				}
	          String query="INSERT into admissionAccount(fullname, parentsname, phoneNo, email, gender, dob, age, AadharNo, Address, state, country, pin, accountId, accountType, accountBalance, IfscCode)" + " values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,? ,?,?)";      
        	  conn=MysqlConnection.getConnection();
        	  PreparedStatement pstmt = conn.prepareStatement(query);
        	  pstmt.setString(1, fullname);
        	  pstmt.setString(2, parentsname);
        	  pstmt.setDouble(3, mobile);
        	  pstmt.setString(4, email);
        	  pstmt.setString(5, gender);
        	  pstmt.setString(6, dob);
        	  pstmt.setInt(7, age);
        	  pstmt.setLong(8, Aadhar);
        	  pstmt.setString(9, address);
        	  pstmt.setString(10, state);
        	  pstmt.setString(11, country);
        	  pstmt.setInt(12, pin);
              pstmt.setInt(13, accid);
              pstmt.setString(14, acctype);
              pstmt.setDouble(15, accbalance);
              pstmt.setString(16, ifscCode);
              
              
        	  int insertStatus = pstmt.executeUpdate();
              if(insertStatus > 0) {
                 System.out.println("\t\t\t\t !!!!!Your Adimission successfully!!!!!  \n");
              }
      
    			 System.out.print ("\t\t\t\t Do you want to Continue??(Y/N)"+emoji6+" ");
                 status=br.readLine();
				 System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------" );
                if(status.equals("n") || status.equals("N"))
                {
                    login=false;
                } 
				 
			 }
			 else if(status.equals("y") || status.equals("Y")) {
			
			 System.out.println("\t\t\t.........Here Can You Check All Availables Course.........\n");
        	 System.out.println("\t\t SINO   \t Course Name    \t Course Fee     \t Offer Discount     \t Total Fee \n");
             System.out.println("\t\t"+emoji4+" "+" 1.    \t"+emoji7+""+emoji7+" 10th        \t"+emoji7+""+emoji7+" 11499      \t"+emoji7+""+emoji7+" 999            \t"+emoji7+""+emoji7+" 10500\n");
             System.out.println("\t\t"+emoji4+" "+" 2.    \t"+emoji7+""+emoji7+" 12th        \t"+emoji7+""+emoji7+" 26999      \t"+emoji7+""+emoji7+" 1499           \t"+emoji7+""+emoji7+" 25500\n");
             System.out.println("\t\t"+emoji4+" "+" 3.    \t"+emoji7+""+emoji7+" BSC(Math)   \t"+emoji7+""+emoji7+" 37499      \t"+emoji7+""+emoji7+" 1999           \t"+emoji7+""+emoji7+" 35500\n");
             System.out.println("\t\t"+emoji4+" "+" 4.    \t"+emoji7+""+emoji7+" BCA         \t"+emoji7+""+emoji7+" 107499     \t"+emoji7+""+emoji7+" 2499           \t"+emoji7+""+emoji7+" 105000\n");
             System.out.println("\t\t"+emoji4+" "+" 5.    \t"+emoji7+""+emoji7+" B.TECH      \t"+emoji7+""+emoji7+" 358999     \t"+emoji7+""+emoji7+" 4999           \t"+emoji7+""+emoji7+" 354000\n");
             System.out.println("\t\t"+emoji4+" "+" 6.    \t"+emoji7+""+emoji7+" MCA         \t"+emoji7+""+emoji7+" 208499     \t"+emoji7+""+emoji7+" 3499           \t"+emoji7+""+emoji7+" 205000\n");
             System.out.println("\t\t"+emoji4+" "+" 7.    \t"+emoji7+""+emoji7+" M.Tech      \t"+emoji7+""+emoji7+" 259999     \t"+emoji7+""+emoji7+" 3999           \t"+emoji7+""+emoji7+" 256000");
        	 System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
             System.out.println("\t\t\t\t You Can Purchase Any Course"+"\n");
             System.out.print (" \t\t\t\t Do you want Purchase??(Y/N)"+emoji6+" ");
			 status=br.readLine(); 
			 System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
			 
			 if(status.equals("n") || status.equals("N")) 
			 { 
				 login=false;
			 }
             
		      else  if(status.equals("y") || status.equals("Y")) {
			 System.out.print("\t\t\t\t Enter your Full Name :"+emoji2+" ");
			 String fullname =br.readLine();
			 
			 System.out.print("\t\t\t\t Enter your Contact Number :"+emoji2+" ");
			 Long mobile=Long.parseLong(br.readLine());
			 
			 System.out.print("\t\t\t\t Enter your Email Id :"+emoji2+" ");
			 String email=br.readLine();
			 
             System.out.print("\t\t\t\t Enter your Choice Course Number:"+emoji2+" ");
             Number=Integer.parseInt(br.readLine());
             
             System.out.print("\t\t\t\t Enter Your Course Name:"+emoji7+" ");
             String coursename=br.readLine();
             
             if(Number==1 &&coursename.equals("10th") ||Number==2 &&coursename.equals("12th")||Number==3 && coursename.equals("BSC(Math)")
            ||Number==4 &&coursename.equals("BCA")||Number==5 &&coursename.equals("B.Tech")||Number==6 && coursename.equals("MCA")||Number==7 &&coursename.equals("M.Tech")) {
           
             System.out.print("\t\t\t\t Enter Your Course Fee:"+emoji7+" ");
             double fee=Integer.parseInt(br.readLine());
             
             if(Number==1 && fee==10500 ||Number==2 && fee==25500 ||Number==3 && fee==35500 ||Number==4 && fee==105000 
            		 ||Number==5 && fee==354000 ||Number==6 && fee==205000 ||Number==7 && fee==256000 ) 
                 { 
                 
            	     System.out.print("\t\t\t\t Enter Enroll Date :"+emoji7+" ");
                  	 String date=br.readLine();
                  	 
                  	 System.out.print("\t\t\t\t Enter Receiver Account Id :"+emoji7+" ");
                 	 int accid=Integer.parseInt(br.readLine());
   
              	      conn=MysqlConnection.getConnection();
                     long receiverId=0;
                     ps=conn.prepareStatement("select * from adminaccount where accId=?");
                     ps.setLong(1, accid);
                     result=ps.executeQuery();
                     while(result.next())
                     {
                         receiverId=result.getLong("accId");
                     }
                     
                     double availableBalance=0.0;
                     long senderId=0;
                     ps=conn.prepareStatement("select accountBalance,accountId from admissionaccount where email=?");
                     ps.setString(1, email);
                     result=ps.executeQuery();
                     while(result.next())
                     {
                         availableBalance=result.getDouble("accountBalance");
                         senderId=result.getLong("accountId");
                     }
                     
                     if(receiverId==0)
                     {
                         System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                         System.out.println("\t\t\t\t Wrong receiver id!!....");
                         System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

                     }
                     else if(availableBalance==0 || availableBalance<fee)
                     {
                    	 System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                         System.out.println("\t\t\t\t Insufficient account balance!!....."+"\n");
                         System.out.println("\t\t\t\t Do You Want To Deposit In Your Account (Y/N)"+emoji6+" ");
                         status=br.readLine();
                         System.out.println("\t\t\t\t Enter deposit amount :");
                         double depositAmount=Double.parseDouble(br.readLine());
                         
                         System.out.println("\t\t\t\t Enter Your Account Id :");
                         int accountid=Integer.parseInt(br.readLine());
                         
                         if(depositAmount>0)
                         {
                             conn=MysqlConnection.getConnection();
                             ps=conn.prepareStatement("select * from admissionaccount where accountId=?");
                             ps.setInt(1, accountid);
                             result=ps.executeQuery();
                             double balance=0.0;
                             long accId=0;
                             while(result.next())
                             {
                                 balance=result.getDouble("accountBalance");
                                 accId=result.getLong("accountId");
                             }
                             balance=balance+depositAmount;
                             ps=conn.prepareStatement("update admissionaccount set accountBalance=? where accountId=?");
                             ps.setDouble(1, balance);
                             ps.setInt(2, accountid);
                             if(ps.executeUpdate()>0)
                             {
                                 ps=conn.prepareStatement("insert into transactions values(?,?,?,?,?,?)");
                                 Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                                 String transactionId="TN"+timestamp.getTime(); //TN3243432432423
                                 ps.setString(1, transactionId);
                                 ps.setDouble(2, depositAmount);
                                 ps.setDate(3, new Date(System.currentTimeMillis()));
                                 ps.setString(4, "deposit");
                                 ps.setLong(5,accId);
                                 ps.setLong(6,accId);
                                 ps.executeUpdate();
                                 System.out.println("\t\t\t\t Balance Updated Succesfully!!...");
                                 System.out.println("\t\t\t\t New Balance: "+balance);
                                 System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

                             }
                             else
                             {
                                 System.out.println("\t\t\t\t Something went wrong!!....");
                             }
                             System.out.print (" \t\t\t\t Do you want to Continue??(Y/N)"+emoji6+" ");
                			 status=br.readLine(); 
                			 System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
                			 
                			 if(status.equals("n") || status.equals("N")) 
                			 { 
                				 login=false;
                				 
                			}
                         }
                     }
                     else
                     {
                         availableBalance=availableBalance-fee;
                         ps=conn.prepareStatement("update admissionaccount set accountBalance=? where email=?");
                         ps.setDouble(1, availableBalance);
                         ps.setString(2, email);
                         if(ps.executeUpdate()>0)
                         {
                             ps=conn.prepareStatement("select accBalance from adminaccount where accId=?");
                             ps.setLong(1, accid);
                             double rcvBalance=0.0;
                             result=ps.executeQuery();
                             while(result.next())
                             {
                                 rcvBalance=result.getDouble("accBalance");
                             }
                             rcvBalance=rcvBalance + fee;
                             ps=conn.prepareStatement("update adminaccount set accBalance=? where accId=?");
                             ps.setDouble(1, rcvBalance);
                             ps.setLong(2, receiverId);
                             if(ps.executeUpdate()>0)
                             {
                                  ps=conn.prepareStatement("insert into transactions values(?,?,?,?,?,?)");
                                     Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                                     String transactionId="TN"+timestamp.getTime(); //TN3243432432423
                                     ps.setString(1, transactionId);
                                     ps.setDouble(2, fee);
                                     ps.setDate(3, new Date(System.currentTimeMillis()));
                                     ps.setString(4, "Payment");
                                     ps.setLong(5,senderId);
                                     ps.setLong(6,accid);
                                     ps.executeUpdate();
                                 System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                                 System.out.println("\t\t\t\t!!!!!Payment Succesfully Completed!!!!!");

                             }
                             else
                             {
                                 System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                                 System.out.println("\t\t\t\t .....Transaction Failed!!.....");
                                 System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

                             }
                             
                         }
                         
                         
                     }
                     System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        			 System.out.print (" \t\t\t\t Do you want to Submit??(Y/N)"+emoji6+" ");
        			 status=br.readLine(); 
        			 System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
        			 
        			 if(status.equals("n") || status.equals("N")) 
        			 { 
        				 login=false;
        				 
        			}
                  String query="INSERT into courseaccount(full_Name, mobile_No, email_Id, course_No, course_Name, course_Fee, payment_Date)" + " values(?, ?, ?, ? ,?, ?, ?)";      

            	   conn=MysqlConnection.getConnection();
            	 
            	   PreparedStatement pstmt = conn.prepareStatement(query);
            	   pstmt.setString(1, fullname);
             	   pstmt.setLong(2, mobile);
             	   pstmt.setString(3, email);
             	   pstmt.setInt(4, Number);
             	   pstmt.setString(5, coursename);
             	   pstmt.setDouble(6, fee);
             	   pstmt.setString(7, date);
             	   int insertStatus = pstmt.executeUpdate();
                   if(insertStatus > 0) {
                    System.out.println("\t\t\t\t !!!!!Course Purchase successfully!!!!!");
                 }
                 }
             else {
         	     System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        		 System.out.println("\t\t\t\t !!!!!Course Fee Not Matching!!!!!"+"\n");
        		 System.out.print("\t\t\t\t Try Again!!!!!?? Type-->(Y)"+emoji6+" ");
     		     status=br.readLine();
	         	 System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
     		     if(status.equals("y") || status.equals("Y"))
     		     {
     			  
     		       login=true;
     		       break;
     		     } 
                }
             
             }
             else {
         	     System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        		 System.out.println("\t\t\t\t !!!!!Course Name Not Matching!!!!!"+"\n");
        		 System.out.print("\t\t\t\t Try Again!!!!!?? Type-->(Y)"+emoji6+" ");
     		     status=br.readLine();
	         	 System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
     		     if(status.equals("y") || status.equals("Y"))
     		     {
     			  
     		       login=true;
     		       break;
     		     } 
                }
             
             
             }
		      else {
	         	  System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		    	  System.out.println("\t\t\t\t ...Sorry...Worng Entered Value.. "+"\n");
     			 System.out.print (" \t\t\t\t Do you want to Countinue...??(Y/N)"+emoji6+" ");
     			 status=br.readLine(); 
     			 System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
     			 
     			 if(status.equals("n") || status.equals("N")) 
     			 { 
     				 login=false;
     				 
     			 }
			 }
        	 }
        	 
        	 else {
	         	  System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	         	 System.out.println("\t\t\t\t ...Its Oky.. Have A Nice Day..BYE BYE... "+"\n");
	         	System.out.print (" \t\t\t\t Do you want to Countinue...??(Y/N)"+emoji6+" ");
    			 status=br.readLine(); 
    			 System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
    			 
    			 if(status.equals("n") || status.equals("N")) 
    			 { 
    				 login=false;
    				 
    			 }
        	 }
        	 }
                 catch(Exception e) {
                	 System.out.println(e);
        	 }
          
              break;
     
       case 3: 
    	   try {
    		   
    		   
    	       System.out.println("\t\t\t\t "+emoji5+".......Your Enrolled Course Available......."+emoji5+"\n");
    	       System.out.print("\t\t\t\t Enter Your Registered Mobile Number :"+emoji7+" ");
			   long mobile =Long.parseLong(br.readLine());
			   ps=conn.prepareStatement(" select courseAccount.* from admissionAccount, courseAccount where admissionAccount.phoneNo=courseAccount.mobile_No");
               //ps.setLong(1, mobile);
               result=ps.executeQuery();
              while(result.next())
              {
        	  System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
              System.out.println("\t\t\t\t Your Full Name :"+emoji4+" "+result.getString("full_Name"));
              System.out.println("\t\t\t\t Your Contact Number : "+emoji4+" "+result.getLong("mobile_No"));
              System.out.println("\t\t\t\t Your Email Id : "+emoji4+" "+result.getString("email_Id"));
              System.out.println("\t\t\t\t Your Course Number : "+emoji4+" "+result.getInt("course_No"));
              System.out.println("\t\t\t\t Your Course Name: "+emoji4+" "+result.getString("course_Name"));
              System.out.println("\t\t\t\t Your Course Fee : "+emoji4+" "+result.getDouble("course_Fee"));
              System.out.println("\t\t\t\t Your Payment Date : "+emoji4+" "+result.getDate("payment_Date"));
             }
    	     System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
    	     System.out.println("\t\t\t"+emoji5+".........Here Can You Check All Availables Course........."+emoji5+"\n");
        	 System.out.println("\t\t SINO   \t Course Name    \t Course Fee     \t Offer Discount     \t Total Fee \n");
             System.out.println("\t\t"+emoji4+" "+" 1.    \t"+emoji7+""+emoji7+" 10th        \t"+emoji7+""+emoji7+" 11499      \t"+emoji7+""+emoji7+" 999            \t"+emoji7+""+emoji7+" 10500\n");
             System.out.println("\t\t"+emoji4+" "+" 2.    \t"+emoji7+""+emoji7+" 12th        \t"+emoji7+""+emoji7+" 26999      \t"+emoji7+""+emoji7+" 1499           \t"+emoji7+""+emoji7+" 25500\n");
             System.out.println("\t\t"+emoji4+" "+" 3.    \t"+emoji7+""+emoji7+" BSC(Math)   \t"+emoji7+""+emoji7+" 37499      \t"+emoji7+""+emoji7+" 1999           \t"+emoji7+""+emoji7+" 35500\n");
             System.out.println("\t\t"+emoji4+" "+" 4.    \t"+emoji7+""+emoji7+" BCA         \t"+emoji7+""+emoji7+" 107499     \t"+emoji7+""+emoji7+" 2499           \t"+emoji7+""+emoji7+" 105000\n");
             System.out.println("\t\t"+emoji4+" "+" 5.    \t"+emoji7+""+emoji7+" B.TECH      \t"+emoji7+""+emoji7+" 358999     \t"+emoji7+""+emoji7+" 4999           \t"+emoji7+""+emoji7+" 354000\n");
             System.out.println("\t\t"+emoji4+" "+" 6.    \t"+emoji7+""+emoji7+" MCA         \t"+emoji7+""+emoji7+" 208499     \t"+emoji7+""+emoji7+" 3499           \t"+emoji7+""+emoji7+" 205000\n");
             System.out.println("\t\t"+emoji4+" "+" 7.    \t"+emoji7+""+emoji7+" M.Tech      \t"+emoji7+""+emoji7+" 259999     \t"+emoji7+""+emoji7+" 3999           \t"+emoji7+""+emoji7+" 256000");
        	 System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            
    	     System.out.print("\t\t\t\t Do you want Purchase Another Course ??(Y/N)"+emoji6+" ");
             status=br.readLine();
          
             if(status.equals("n") || status.equals("N"))
             {
              login=false;
              
             }
             else if(status.equals("y") || status.equals("Y")) {
             System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
             System.out.println("\t\t\t\t You Want to Purchase Any Course");
             System.out.println("\t\t\t\t !!!!!First You Take Admission!!!!!"+"\n");	
             System.out.print("\t\t\t\t Already You Taken Admission Please Type (Y/N)"+emoji2+" ");
             status=br.readLine(); 
			 System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
	 
		     if(status.equals("n") || status.equals("N")) 
		     {
			 System.out.println("\t\t\t\t"+emoji5+" Enter Your Details Below..."+emoji5+"\n");
    		 
        	 System.out.print("\t\t\t\t Enter Your Full Name :"+emoji7+" ");
        	 String fullname=br.readLine();
        	 
        	 System.out.print("\t\t\t\t Enter Your Parrents Name :"+emoji7+" ");
        	 String parentsname=br.readLine();
        	 
        	 System.out.print("\t\t\t\t Enter Your Mobile Number :"+emoji7+" ");
        	 mobile =Long.parseLong(br.readLine());

        	 System.out.print("\t\t\t\t Enter Your Active Email Id :"+emoji7+" ");
        	 String email=br.readLine();
        	 
        	 System.out.print("\t\t\t\t Enter Your Gender :"+emoji7+" ");
        	 String gender=br.readLine();
        	 
        	 System.out.print("\t\t\t\t Enter Your Date Of Birth :"+emoji7+" ");
        	 String dob=br.readLine();
        	 
        	 System.out.print("\t\t\t\t Enter Your Age :"+emoji7+" ");
        	 int age=Integer.parseInt(br.readLine());
        	 
        	 System.out.print("\t\t\t\t Enter Your Valid Aadhar Number :"+emoji7+" ");
        	 int Aadhar=Integer.parseInt(br.readLine());
        	 
        	 System.out.print("\t\t\t\t Enter Your Full Address :"+emoji7+" ");
        	 String address=br.readLine();
        	 
        	 System.out.print("\t\t\t\t Enter Your State Name :"+emoji7+" ");
        	 String state=br.readLine();
        	 
        	 System.out.print("\t\t\t\t Enter Your Country Name :"+emoji7+" ");
        	 String country=br.readLine();
        	 
        	 System.out.print("\t\t\t\t Enter Your Pin Code :"+emoji7+" ");
        	 int pin=Integer.parseInt(br.readLine());
        	 
        	 System.out.print("\t\t\t\t Enter Your Account Id :"+emoji7+" ");
        	 int accid=Integer.parseInt(br.readLine());
        	 
        	 System.out.print("\t\t\t\t Enter Your Account Type :"+emoji7+" ");
        	 String acctype=br.readLine();
        	 
        	 System.out.print("\t\t\t\t Enter Your Account Balance :"+emoji7+" ");
        	 Double accbalance=Double.parseDouble(br.readLine());
        	 
        	 System.out.print("\t\t\t\t Enter Your IFSC Code :"+emoji7+" ");
        	 String ifscCode=br.readLine();
        	 
        	 System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"); 
			 System.out.println("\t\t\t\t"+emoji5+"...your Details Are Following..."+emoji5+"\n");
			 System.out.println("\t\t\t\t Please Review Your Details are Correct or Not");
			 System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			 System.out.println("\t\t\t\t Your Full Name :"+emoji4+" "+fullname);
			 System.out.println("\t\t\t\t Your Parrents Name :"+emoji4+" "+parentsname); 
			 System.out.println("\t\t\t\t Your Contact No :"+emoji4+" "+mobile);
			 System.out.println("\t\t\t\t Your Email Id :"+emoji4+" "+email);
			 System.out.println("\t\t\t\t Your Gender :"+emoji4+" "+gender);
			 System.out.println("\t\t\t\t Your Date Of Birth :"+emoji4+" "+dob);
			 System.out.println("\t\t\t\t Your Age :"+emoji4+" "+age);
			 System.out.println("\t\t\t\t Your Aadhar No :"+emoji4+" "+Aadhar);
			 System.out.println("\t\t\t\t Your Address :"+emoji4+" "+address);
			 System.out.println("\t\t\t\t Your State Name :"+emoji4+" "+state);
			 System.out.println("\t\t\t\t Your Country Name :"+emoji4+" "+country);
			 System.out.println("\t\t\t\t Your Pin Code :"+emoji4+" "+pin);
			 System.out.println("\t\t\t\t Your Account Id :"+emoji4+" "+accid);
			 System.out.println("\t\t\t\t Your Account Type :"+emoji4+" "+acctype);
			 System.out.println("\t\t\t\t Your Account Balance :"+emoji4+" "+accbalance);
			 System.out.println("\t\t\t\t Your Account IFSC Code :"+emoji4+" "+ifscCode);
			 System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
			 System.out.print (" \t\t\t\t Do you want to Submit??(Y/N)"+emoji6+" ");
			 status=br.readLine(); 
			 System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
			 if(status.equals("n") || status.equals("N")) 
			 { 
				 login=false;
			}
          String query="INSERT into admissionAccount(fullname, parentsname, phoneNo, email, gender, dob, age, AadharNo, Address, state, country, pin, accountId, accountType, accountBalance, IfscCode)" + " values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,? ,?,?)";      

    	  conn=MysqlConnection.getConnection();
    	 
    	  PreparedStatement pstmt = conn.prepareStatement(query);
    	  pstmt.setString(1, fullname);
    	  pstmt.setString(2, parentsname);
    	  pstmt.setDouble(3, mobile);
    	  pstmt.setString(4, email);
    	  pstmt.setString(5, gender);
    	  pstmt.setString(6, dob);
    	  pstmt.setInt(7, age);
    	  pstmt.setLong(8, Aadhar);
    	  pstmt.setString(9, address);
    	  pstmt.setString(10, state);
    	  pstmt.setString(11, country);
    	  pstmt.setInt(12, pin);
          pstmt.setInt(13, accid);
          pstmt.setString(14, acctype);
          pstmt.setDouble(15, accbalance);
          pstmt.setString(16, ifscCode);
    	  int insertStatus = pstmt.executeUpdate();
          if(insertStatus > 0) {
             System.out.println("\t\t\t\t !!!!!Your Adimission successfully!!!!!  \n");
          }
  
			 System.out.print ("\t\t\t\t Do you want to Continue??(Y/N)"+emoji6+" ");
             status=br.readLine();
			 System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
            if(status.equals("n") || status.equals("N"))
            {
                login=false;
            } 
			 
		 }
              
		 else if(status.equals("y") || status.equals("Y")) {
		
		 System.out.println("\t\t\t"+emoji5+".........Here Can You Check All Availables Course........."+emoji5+"\n");
    	 System.out.println("\t\t SINO   \t Course Name    \t Course Fee     \t Offer Discount     \t Total Fee \n");
         System.out.println("\t\t"+emoji4+" "+" 1.    \t"+emoji7+""+emoji7+" 10th        \t"+emoji7+""+emoji7+" 11499      \t"+emoji7+""+emoji7+" 999            \t"+emoji7+""+emoji7+" 10500\n");
         System.out.println("\t\t"+emoji4+" "+" 2.    \t"+emoji7+""+emoji7+" 12th        \t"+emoji7+""+emoji7+" 26999      \t"+emoji7+""+emoji7+" 1499           \t"+emoji7+""+emoji7+" 25500\n");
         System.out.println("\t\t"+emoji4+" "+" 3.    \t"+emoji7+""+emoji7+" BSC(Math)   \t"+emoji7+""+emoji7+" 37499      \t"+emoji7+""+emoji7+" 1999           \t"+emoji7+""+emoji7+" 35500\n");
         System.out.println("\t\t"+emoji4+" "+" 4.    \t"+emoji7+""+emoji7+" BCA         \t"+emoji7+""+emoji7+" 107499     \t"+emoji7+""+emoji7+" 2499           \t"+emoji7+""+emoji7+" 105000\n");
         System.out.println("\t\t"+emoji4+" "+" 5.    \t"+emoji7+""+emoji7+" B.TECH      \t"+emoji7+""+emoji7+" 358999     \t"+emoji7+""+emoji7+" 4999           \t"+emoji7+""+emoji7+" 354000\n");
         System.out.println("\t\t"+emoji4+" "+" 6.    \t"+emoji7+""+emoji7+" MCA         \t"+emoji7+""+emoji7+" 208499     \t"+emoji7+""+emoji7+" 3499           \t"+emoji7+""+emoji7+" 205000\n");
         System.out.println("\t\t"+emoji4+" "+" 7.    \t"+emoji7+""+emoji7+" M.Tech      \t"+emoji7+""+emoji7+" 259999     \t"+emoji7+""+emoji7+" 3999           \t"+emoji7+""+emoji7+" 256000");
    	 System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
         System.out.println("\t\t\t\t You Can Purchase Any Course"+"\n");
         System.out.print (" \t\t\t\t Do you want Purchase??(Y/N)"+emoji6+" ");
		 status=br.readLine(); 
		 System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
		 
		 if(status.equals("n") || status.equals("N")) 
		 { 
			 login=false;
			
		 }
         
	      else  if(status.equals("y") || status.equals("Y")) {
		 System.out.print("\t\t\t\t Enter your Full Name :"+emoji2+" ");
		 String fullname =br.readLine();
		 
		 System.out.print("\t\t\t\t Enter your Contact Number :"+emoji2+" ");
		 mobile=Long.parseLong(br.readLine());
		 
		 System.out.print("\t\t\t\t Enter your Email Id :"+emoji2+" ");
		 String email=br.readLine();
		 
         System.out.print("\t\t\t\t Enter your Choice Course Number:"+emoji2+" ");
         Number=Integer.parseInt(br.readLine());
         
         System.out.print("\t\t\t\t Enter Your Course Name:"+emoji7+" ");
         String coursename=br.readLine();
         
         if(Number==1 &&coursename.equals("10th") ||Number==2 &&coursename.equals("12th")||Number==3 && coursename.equals("BSC(Math)")
        ||Number==4 &&coursename.equals("BCA")||Number==5 &&coursename.equals("B.Tech")||Number==6 && coursename.equals("MCA")||Number==7 &&coursename.equals("M.Tech")) {
       
         System.out.print("\t\t\t\t Enter Your Course Fee:"+emoji7+" ");
         double fee=Integer.parseInt(br.readLine());
         
         if(Number==1 && fee==10500 ||Number==2 && fee==25500 ||Number==3 && fee==35500 ||Number==4 && fee==105000 
        		 ||Number==5 && fee==354000 ||Number==6 && fee==205000 ||Number==7 && fee==256000 ) 
             { 
             
        	     System.out.print("\t\t\t\t Enter Enroll Date:"+emoji7+" ");
              	 String date=br.readLine();
              	 
              	System.out.print("\t\t\t\t Enter Receiver Account Id :"+emoji7+" ");
             	int accid=Integer.parseInt(br.readLine());

          	    conn=MysqlConnection.getConnection();
                 long receiverId=0;
                 ps=conn.prepareStatement("select * from adminaccount where accId=?");
                 ps.setLong(1, accid);
                 result=ps.executeQuery();
                 while(result.next())
                 {
                     receiverId=result.getLong("accId");
                 }
                 double availableBalance=0.0;
                 long senderId=0;
                 ps=conn.prepareStatement("select accountBalance,accountId from admissionaccount where email=?");
                 ps.setString(1, email);
                 result=ps.executeQuery();
                 while(result.next())
                 {
                     availableBalance=result.getDouble("accountBalance");
                     senderId=result.getLong("accountId");
                 }
                 
                 if(receiverId==0)
                 {
                     System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                     System.out.println("\t\t\t\t Wrong receiver id!!....");
                     System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

                 }
                 else if(availableBalance==0 || availableBalance<fee)
                 {
                     System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                     System.out.println("\t\t\t\t Insufficient account balance!!.....");
                     System.out.println("\t\t\t\t Do You Want To Deposit In Your Account (Y/N)"+emoji6+" ");
                     status=br.readLine();
                     System.out.println("\t\t\t\t Enter deposit amount :");
                     double depositAmount=Double.parseDouble(br.readLine());
                     
                     System.out.println("\t\t\t\t Enter Your Account Id :");
                     int accountid=Integer.parseInt(br.readLine());
                     
                     if(depositAmount>0)
                     {
                         conn=MysqlConnection.getConnection();
                         ps=conn.prepareStatement("select * from admissionaccount where accountId=?");
                         ps.setInt(1, accountid);
                         result=ps.executeQuery();
                         
                         double balance=0.0;
                         long accId=0;
                         while(result.next())
                         {
                             balance=result.getDouble("accountBalance");
                             accId=result.getLong("accountId");
                         }
                         
                         balance=balance+depositAmount;
                         
                         ps=conn.prepareStatement("update admissionaccount set accountBalance=? where accountId=?");
                         ps.setDouble(1, balance);
                         ps.setInt(2, accountid);
                         
                         if(ps.executeUpdate()>0)
                         {
                             ps=conn.prepareStatement("insert into transactions values(?,?,?,?,?,?)");
                             Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                             String transactionId="TN"+timestamp.getTime(); //TN3243432432423
                             ps.setString(1, transactionId);
                             ps.setDouble(2, depositAmount);
                             ps.setDate(3, new Date(System.currentTimeMillis()));
                             ps.setString(4, "deposit");
                             ps.setLong(5,accId);
                             ps.setLong(6,accId);
                             
                             ps.executeUpdate();

                             
                             System.out.println("\t\t\t\t Balance Updated Succesfully!!...");
                             System.out.println("\t\t\t\t New Balance: "+balance);
                             System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

                         }
                         else
                         {
                             System.out.println("\t\t\t\t Something went wrong!!....");
                         }
                         System.out.print (" \t\t\t\t Do you want to Continue??(Y/N)"+emoji6+" ");
            			 status=br.readLine(); 
            			 System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
            			 
            			 if(status.equals("n") || status.equals("N")) 
            			 { 
            				 login=false;
            				 
            			}
                     }
                     
                     }
                 else
                 {
                     availableBalance=availableBalance-fee;
                     ps=conn.prepareStatement("update admissionaccount set accountBalance=? where email=?");
                     ps.setDouble(1, availableBalance);
                     ps.setString(2, email);
                     if(ps.executeUpdate()>0)
                     {
                         ps=conn.prepareStatement("select accBalance from adminaccount where accId=?");
                         ps.setLong(1, accid);
                         double rcvBalance=0.0;
                         result=ps.executeQuery();
                         while(result.next())
                         {
                             rcvBalance=result.getDouble("accBalance");
                         }
                         
                         rcvBalance=rcvBalance + fee;
                         
                         ps=conn.prepareStatement("update adminaccount set accBalance=? where accId=?");
                         ps.setDouble(1, rcvBalance);
                         ps.setLong(2, receiverId);
                         if(ps.executeUpdate()>0)
                         {
                              ps=conn.prepareStatement("insert into transactions values(?,?,?,?,?,?)");
                                 Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                                 String transactionId="TN"+timestamp.getTime(); //TN3243432432423
                                 ps.setString(1, transactionId);
                                 ps.setDouble(2, fee);
                                 ps.setDate(3, new Date(System.currentTimeMillis()));
                                 ps.setString(4, "Payment");
                                 ps.setLong(5,senderId);
                                 ps.setLong(6,accid);
                                 ps.executeUpdate();
                             System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                             System.out.println("\t\t\t\t!!!!!Payment Succesfully Completed!!!!!");
                             System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

                         }
                         else
                         {
                             System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                             System.out.println("\t\t\t\t Transaction Failed!!.....");
                             System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

                         }
                         
                     }
                     
                     
                 }
                 
             
    			 System.out.print (" \t\t\t\t Do you want to Submit??(Y/N)"+emoji6+" ");
    			 status=br.readLine(); 
    			 System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
    			 
    			 if(status.equals("n") || status.equals("N")) 
    			 { 
    				 login=false;
    				 
    			}
              String query="INSERT into courseAccount(full_Name, mobile_No, email_Id, course_No, course_Name, course_Fee, payment_Date)" + " values(?, ?, ?, ? ,?, ?, ?)";      

        	   conn=MysqlConnection.getConnection();
        	 
        	   PreparedStatement pstmt = conn.prepareStatement(query);
        	   pstmt.setString(1, fullname);
         	   pstmt.setLong(2, mobile);
         	   pstmt.setString(3, email);
         	   pstmt.setInt(4, Number);
         	   pstmt.setString(5, coursename);
         	   pstmt.setDouble(6, fee);
         	   pstmt.setString(7, date);
         	   int insertStatus = pstmt.executeUpdate();
               if(insertStatus > 0) {
                System.out.println("\t\t\t\t !!!!!Course Purchase successfully!!!!!");
             }
             }
         else {
     	     System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    		 System.out.println("\t\t\t\t !!!!!Course Fee Not Matching!!!!!"+"\n");
    		 System.out.print("\t\t\t\t Try Again!!!!!?? Type-->(Y)"+emoji6+" ");
 		     status=br.readLine();
         	 System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
 		     if(status.equals("y") || status.equals("Y"))
 		     {
 			  
 		       login=true;
 		       break;
 		     } 
            }
         
         }
         else {
     	     System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    		 System.out.println("\t\t\t\t !!!!!Course Name Not Matching!!!!!"+"\n");
    		 System.out.print("\t\t\t\t Try Again!!!!!?? Type-->(Y)"+emoji6+" ");
 		     status=br.readLine();
         	 System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
 		     if(status.equals("y") || status.equals("Y"))
 		     {
 			  
 		       login=true;
 		       break;
 		     } 
            }
         
         
         }
	      else {
         	  System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	    	  System.out.println("\t\t\t\t ...Sorry...Worng Entered Value.. "+"\n");
 			 System.out.print (" \t\t\t\t Do you want to Countinue...??(Y/N)"+emoji6+" ");
 			 status=br.readLine(); 
 			 System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
 			 
 			 if(status.equals("n") || status.equals("N")) 
 			 { 
 				 login=false;
 				 
 			 }
		 }
    	 }
    	 
    	 else {
         	  System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
         	 System.out.println("\t\t\t\t ...Its Oky.. Have A Nice Day..BYE BYE... "+"\n");
         	System.out.print (" \t\t\t\t Do you want to Countinue...??(Y/N)"+emoji6+" ");
			 status=br.readLine(); 
			 System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
			 
			 if(status.equals("n") || status.equals("N")) 
			 { 
				 login=false;
				 
			 }
    	 }
             
      	   } 
    	   }
    	   catch(Exception e)    
           {
         	 System.out.println(e);
           } 
                     
    	   break;
     case 4: 
    	   System.out.println("\t\t\t Do You Want To Pay For Registration Fees/Examination Fees/Tution Fees \n");
    	   System.out.print("\t\t\t\t Hostel Fees/NoDues Fees & Others.....(Y/N) "+emoji6+" ");
    	   status=br.readLine();
           
           if(status.equals("n") || status.equals("N"))
            {
            login=false;
            
            }
   	       System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
           System.out.println("\t\t SINO                \t Name                \t Fees \n");
           System.out.println("\t\t"+emoji4+" "+" 1.    \t"+emoji7+""+emoji7+" Registration Fess        \t"+emoji7+""+emoji7+" 750/ \n");
           System.out.println("\t\t"+emoji4+" "+" 2.    \t"+emoji7+""+emoji7+" Examination Fees         \t"+emoji7+""+emoji7+" 1500/ \n");
           System.out.println("\t\t"+emoji4+" "+" 3.    \t"+emoji7+""+emoji7+" Tution Fees              \t"+emoji7+""+emoji7+" 10000/ Am. \n");
           System.out.println("\t\t"+emoji4+" "+" 4.    \t"+emoji7+""+emoji7+" Hostel Fees              \t"+emoji7+""+emoji7+" 4500/ Pm. \n");
           System.out.println("\t\t"+emoji4+" "+" 5.    \t"+emoji7+""+emoji7+" NoDues Fees              \t"+emoji7+""+emoji7+" 2500/ \n");
           System.out.println("\t\t"+emoji4+" "+" 6.    \t"+emoji7+""+emoji7+" Others                   \t"+emoji7+""+emoji7+" 500/ \n");
   	       System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
   	       System.out.print("\t\t\t\t Enter your choice:"+emoji2+" ");
           Number=Integer.parseInt(br.readLine());
   	       System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
   	       System.out.print("\t\t\t\t Please Enter The Receiver Account Id :"+emoji7+" "); 
           Long accid=Long.parseLong(br.readLine());
           
           System.out.print("\t\t\t\t Please Enter The Ammount :"+emoji7+" "); 
           Double amount=Double.parseDouble(br.readLine());
    	   
           System.out.print("\t\t\t\t Please Enter Your Register Email Id :"+emoji7+" "); 
           String email=br.readLine();
           
           if(Number==1&&amount==750||Number==2&&amount==1500||Number==3&&amount==10000||Number==4&&amount==4500
        		   ||Number==5&&amount==2500||Number==6&&amount==500)
           {
        	   conn=MysqlConnection.getConnection();
               long receiverId=0;
               ps=conn.prepareStatement("select * from adminaccount where accId=?");
               ps.setLong(1, accid);
               result=ps.executeQuery();
               
               while(result.next())
               {
                   receiverId=result.getLong("accId");
               }
               
               double availableBalance=0.0;
               long senderId=0;
               ps=conn.prepareStatement("select accountBalance,accountId from admissionaccount where email=?");
               ps.setString(1, email);
               result=ps.executeQuery();
               
               while(result.next())
               {
                   availableBalance=result.getDouble("accountBalance");
                   senderId=result.getLong("accountId");
               }
               
               if(receiverId==0)
               {
                   System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                   System.out.println("\t\t\t\t Wrong receiver id!!....");
                   System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

               }
               else if(availableBalance==0 || availableBalance<fee)
               {
                   System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                   System.out.println("\t\t\t\t Insufficient account balance!!.....");
                   System.out.println("\t\t\t\t Do You Want To Deposit In Your Account (Y/N)"+emoji6+" ");
                   status=br.readLine();
                   System.out.println("\t\t\t\t Enter deposit amount :");
                   double depositAmount=Double.parseDouble(br.readLine());
                   
                   System.out.println("\t\t\t\t Enter Your Account Id :");
                   int accountid=Integer.parseInt(br.readLine());
                   
                   if(depositAmount>0)
                   {
                       conn=MysqlConnection.getConnection();
                       ps=conn.prepareStatement("select * from admissionaccount where accountId=?");
                       ps.setInt(1, accountid);
                       result=ps.executeQuery();
                       
                       double balance=0.0;
                       long accId=0;
                       while(result.next())
                       {
                           balance=result.getDouble("accountBalance");
                           accId=result.getLong("accountId");
                       }
                       
                       balance=balance+depositAmount;
                       
                       ps=conn.prepareStatement("update admissionaccount set accountBalance=? where accountId=?");
                       ps.setDouble(1, balance);
                       ps.setInt(2, accountid);
                       
                       if(ps.executeUpdate()>0)
                       {
                           ps=conn.prepareStatement("insert into transactions values(?,?,?,?,?,?)");
                           Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                           String transactionId="TN"+timestamp.getTime(); //TN3243432432423
                           ps.setString(1, transactionId);
                           ps.setDouble(2, depositAmount);
                           ps.setDate(3, new Date(System.currentTimeMillis()));
                           ps.setString(4, "deposit");
                           ps.setLong(5,accId);
                           ps.setLong(6,accId);
                           
                           ps.executeUpdate();

                           
                           System.out.println("\t\t\t\t Balance Updated Succesfully!!...");
                           System.out.println("\t\t\t\t New Balance: "+balance);
                           System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

                       }
                       else
                       {
                           System.out.println("\t\t\t\t Something went wrong!!....");
                       }
                       System.out.print (" \t\t\t\t Do you want to Continue??(Y/N)"+emoji6+" ");
          			 status=br.readLine(); 
          			 System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" );
          			 
          			 if(status.equals("n") || status.equals("N")) 
          			 { 
          				 login=false;
          				 
          			}
                   }
                   
                   }
               else
               {
                   availableBalance=availableBalance-amount;
                   ps=conn.prepareStatement("update admissionaccount set accountBalance=? where email=?");
                   ps.setDouble(1, availableBalance);
                   ps.setString(2, email);
                   
                   if(ps.executeUpdate()>0)
                   {
                       ps=conn.prepareStatement("select accBalance from adminaccount where accId=?");
                       ps.setLong(1, accid);
                       double rcvBalance=0.0;
                       result=ps.executeQuery();
                       while(result.next())
                       {
                           rcvBalance=result.getDouble("accBalance");
                       }
                       
                       rcvBalance=rcvBalance + amount;
                       
                       ps=conn.prepareStatement("update adminaccount set accBalance=? where accId=?");
                       ps.setDouble(1, rcvBalance);
                       ps.setLong(2, receiverId);
                       
                       if(ps.executeUpdate()>0)
                       {
                            ps=conn.prepareStatement("insert into transactions values(?,?,?,?,?,?)");
                               Timestamp timestamp = new Timestamp(System.currentTimeMillis());
                               String transactionId="TN"+timestamp.getTime(); //TN3243432432423
                               ps.setString(1, transactionId);
                               ps.setDouble(2, amount);
                               ps.setDate(3, new Date(System.currentTimeMillis()));
                               ps.setString(4, "Payment");
                               ps.setLong(5,senderId);
                               ps.setLong(6,accid);
                               
                               ps.executeUpdate();
                           System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                           System.out.println("\t\t\t\t!!!!!Payment Succesfully Completed!!!!!");
                           System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

                       }
                       else
                       {
                           System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                           System.out.println("\t\t\t\t Transaction Failed!!.....");
                           System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

                       }
                       
                   }
                   
                   
               }
               System.out.println("\t\t\t\t Do you want to continue??(Y/N)"+emoji6+" ");
                status=br.readLine();
               
               if(status.equals("n") || status.equals("N"))
               {
                   login=false;
               }
           }  
    break;
                     
       case 5: 
    	        System.out.println("\t\t\t\t Enter Your Correct Account Id"+emoji7+" ");
    	        int accountid=Integer.parseInt(br.readLine());
    	        
    	         ps=conn.prepareStatement("select admissionaccount.*,transactions.* from admissionaccount, transactions where admissionaccount.accountId=transactions.senderAccountId");
                // ps.setInt(1, accountid);
                 result=ps.executeQuery();
                 while(result.next())
                 {
                      System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                      System.out.println("\t\t\t\t"+emoji5+" -----Payment Details----- "+emoji5+"\n");
                      System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                      System.out.println("\t\t\t\t Your Name :"+emoji4+" "+result.getString("fullname"));
                      System.out.println("\t\t\t\t Your Contact No :"+emoji4+" "+result.getLong("phoneNo"));
                      System.out.println("\t\t\t\t Your Email Id : "+emoji4+" "+result.getString("email"));
                      System.out.println("\t\t\t\t Your Gender : "+emoji4+" "+result.getString("gender"));
                      System.out.println("\t\t\t\t Your Date of Birth :"+emoji4+" "+result.getString("dob"));
                      System.out.println("\t\t\t\t Transaction Id :"+emoji4+" "+result.getString("transactionId"));
                      System.out.println("\t\t\t\t Transaction Amount :"+emoji4+" "+result.getDouble("transactionAmount"));
                      System.out.println("\t\t\t\t Transaction Date :"+emoji4+" "+result.getDate("transactionDate"));
                      System.out.println("\t\t\t\t Transaction Type :"+emoji4+" "+result.getString("transactionType"));
                      System.out.println("\t\t\t\t Sender Account Id :"+emoji4+" "+result.getInt("senderAccountId"));
                      System.out.println("\t\t\t\t Receiver Account Id :"+emoji4+" "+result.getInt("receiverAccountId"));
                      System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                                 

                             }
                             
                             System.out.println("\t\t\t\t Do you want to continue??(Y/N)"+emoji6+" ");
                              status=br.readLine();
                             
                             if(status.equals("n") || status.equals("N"))
                             {
                                 login=false;
                             }
                             break;
                             
              case 6: 
                     System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                     System.out.println("\t\t\t\t Please enter the Register Email Id : "+emoji7+" ");
                     String emailid=br.readLine();
                     
                	 System.out.println("\t\t\t\t Please enter the existing password: "+emoji7+" ");
                     String existingPassword=br.readLine();
                     
                     System.out.println("\t\t\t\t Set new Password:"+emoji7+" ");
                     String newPassword=br.readLine();
                     
                     System.out.println("\t\t\t\t Retype new password:"+emoji7+" ");
                     String retypePassword=br.readLine();
                     
                     
                     ps=conn.prepareStatement("select password from studentsignupaccount where email=?");
                     ps.setString(1, emailid);
                     
                     result=ps.executeQuery();
                     String accountPassword=null;
                     while(result.next())
                     {
                         accountPassword=result.getString("password");
                     }
                     
                     if(accountPassword.equals(existingPassword))
                     {
                         if(newPassword.equals(retypePassword))
                         {
                             ps=conn.prepareStatement("update studentsignupaccount set password=? where email=?");
                             ps.setString(1, newPassword);
                             ps.setString(2, emailid);
                             
                             if(ps.executeUpdate()>0)
                             {
                                 System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");               
                                 System.out.println("\t\t\t\t Passowrd Changed!!.....");
                                 System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                                 
                             }
                             
                             else
                             {
                                 System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                                 System.out.println("\t\t\t\t Error in password change!!......");
                                 System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                                 
                             }
                         }
                         else
                         {
                             System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                             System.out.println("\t\t\t\t Set new password and retype password must be same!!.....");
                             System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                             
                         }
                     } 
                     else
                     {
                         System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                         System.out.println("\t\t\t\t Please enter correct existing password!!......");
                         System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                         
             
                     }
                     
                     System.out.println("\t\t\t\t Do you want to continue??(Y/N)"+emoji6+" ");
                      status=br.readLine();
                     
                     if(status.equals("n") || status.equals("N"))
                     {
                         login=false;
                     }
                     break;   
                     
                     
              case 7: 
                  System.out.println("\t\t\t\t Please Enter The Register Email Id : "+emoji7+" ");
                  emailid=br.readLine();
                  
					/*
					 * System.out.println("\t\t\t\t Enter Your Correct Account Id"+emoji7+" ");
					 * accountid=Integer.parseInt(br.readLine());
					 * 
					 */      	          
                   ps=conn.prepareStatement("select admissionaccount.*,courseaccount.*, studentsignupaccount.*,transactions.* from transactions,admissionaccount, courseaccount ,studentsignupaccount\r\n"
                   		+ "where admissionaccount.email=courseaccount.email_Id And admissionaccount.email= studentsignupaccount.email and \r\n"
                   		+ "admissionaccount.accountId=transactions.senderAccountId");
                  // ps.setString(1, emailid);
                   //ps.setInt(1, accountid);
                   result=ps.executeQuery();
                   while(result.next())
                   {
                	   System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                       System.out.println("\t\t\t\t"+emoji5+" -----Your All Details Are Available----- "+emoji5+"\n");
                       System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                       System.out.println("\t\t\t\t Your Name :"+emoji4+" "+result.getString("fullname"));
                       System.out.println("\t\t\t\t Your Parent's Name :"+emoji4+" "+result.getString("parentsname"));
                       System.out.println("\t\t\t\t Your Contact No :"+emoji4+" "+result.getLong("phoneNo"));
                       System.out.println("\t\t\t\t Your Email Id : "+emoji4+" "+result.getString("email"));
                       System.out.println("\t\t\t\t Your Gender : "+emoji4+" "+result.getString("gender"));
                       System.out.println("\t\t\t\t Your Date of Birth :"+emoji4+" "+result.getDate("dob"));
                       System.out.println("\t\t\t\t Your Age :"+emoji4+" "+result.getInt("age"));
                       System.out.println("\t\t\t\t Your Highest Qualification :"+emoji4+" "+result.getString("highestQualification"));
                       System.out.println("\t\t\t\t Your Percentage :"+emoji4+" "+result.getDouble("percentage"));
                       System.out.println("\t\t\t\t Your Aadhar Number :"+emoji4+" "+result.getLong("AadharNo"));
                       System.out.println("\t\t\t\t Your Address :"+emoji4+" "+result.getString("Address"));
                       System.out.println("\t\t\t\t Your State :"+emoji4+" "+result.getString("state"));
                       System.out.println("\t\t\t\t Your Country :"+emoji4+" "+result.getString("country"));
                       System.out.println("\t\t\t\t Your Pin Code :"+emoji4+" "+result.getInt("pin")+"\n");
                       
                       
                       System.out.println("\t\t\t\t Your Course No :"+emoji4+" "+result.getInt("course_No"));
                       System.out.println("\t\t\t\t Your Course Name :"+emoji4+" "+result.getString("course_Name"));
                       System.out.println("\t\t\t\t Your Course Fee :"+emoji4+" "+result.getDouble("course_Fee"));
                       System.out.println("\t\t\t\t Payment Date :"+emoji4+" "+result.getString("payment_Date")+"\n");
                       
                       
                       System.out.println("\t\t\t\t Your Account Id :"+emoji4+" "+result.getInt("accountId"));
                       System.out.println("\t\t\t\t Your Account Type :"+emoji4+" "+result.getString("accountType"));
                       System.out.println("\t\t\t\t Your Account Balance : "+emoji4+" "+result.getDouble("accountBalance"));
                       System.out.println("\t\t\t\t Your Account IFSC Code :"+emoji4+" "+result.getString("IfscCode"));
                       System.out.println("\t\t\t\t Transaction Id :"+emoji4+" "+result.getString("transactionId"));
                       System.out.println("\t\t\t\t Transaction Amount :"+emoji4+" "+result.getDouble("transactionAmount"));
                       System.out.println("\t\t\t\t Transaction Date :"+emoji4+" "+result.getDate("transactionDate"));
                       System.out.println("\t\t\t\t Transaction Type :"+emoji4+" "+result.getString("transactionType"));
                       System.out.println("\t\t\t\t Sender Account Id :"+emoji4+" "+result.getInt("senderAccountId"));
                       System.out.println("\t\t\t\t Receiver Account Id :"+emoji4+" "+result.getInt("receiverAccountId"));
                       System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                   }
                   System.out.println("\t\t\t\t Do you want to continue??(Y/N)"+emoji6+" ");
                   status=br.readLine();
                   System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                   if(status.equals("n") || status.equals("N"))
                   {
                       login=false;
                   }
                   break;
          
              case 8:  
        	   login=false;
                   
        	   break;

                 }
        }
                 while(login);
                 System.out.println("\t\t\t\t Bye..Bye...");
                 System.out.println("\t\t\t\t Have a nice day!!.....");
                 break;
             }
             else
             {
                 System.out.println("\t\t\t\t Wrong username/password!!.....");
             }
             
         case 3: 
        	
             System.out.println("\t\t\t\t Bye..Bye...");
             System.out.println("\t\t\t\t Have a nice day!!.....");
        	 login=false;
             
      	      break;
         
    	 } 
	}
    	 else {
    		 System.out.println("======================================"+emoji3+" Welcome In Admin Portal "+emoji2+"======================================================================================================================================\n");
    		 System.out.print("\t\t\t\t You Want To Fetch The Records..(Y/N)"+emoji6+" ");
    		 status=br.readLine();
             System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

             if(status.equals("y") || status.equals("Y"))
             {
                 try {
                	 System.out.print("\t\t\t\t Enter your username:"+emoji7+" ");
                     String username=br.readLine();
                     System.out.print("\t\t\t\t Enter your password:"+emoji7+" ");
                     String Password=br.readLine();
                     System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                     
                     Connection conn=MysqlConnection.getConnection();
                     PreparedStatement ps=conn.prepareStatement("select * from adminaccount where user_name=?");
                     ps.setString(1,username);
                     ResultSet result=ps.executeQuery();
                     String password=null;
                         
                         while(result.next())
                         {
                             password=result.getString("user_password");
                         }
                  
                     if(Password.equals(password))
                     {
                     
                         System.out.println("\t\t\t\t !!!!!You have successfully logged in!!!!!");
                         
                         login=true;
                         do
                         {
                         
                         System.out.println("========================================"+emoji3+" WELCOME " + username.toUpperCase()+" "+emoji2+"===============================================================================================================\n");
                         System.out.println("\t\t\t\t Which Records You want To Fetch..Please Select Anyone.....");
                         System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                         System.out.println("\t\t\t\t 1. "+emoji4+""+emoji4+"   New Adimission");
                         System.out.println("\t\t\t\t 2. "+emoji4+""+emoji4+"   Available course");
                         System.out.println("\t\t\t\t 3. "+emoji4+""+emoji4+"   Enroll Course");
                         System.out.println("\t\t\t\t 4. "+emoji4+""+emoji4+"   Payment Status");
                         System.out.println("\t\t\t\t 5. "+emoji4+""+emoji4+"   Change Password");
                         System.out.println("\t\t\t\t 6. "+emoji4+""+emoji4+"   Student Details");
                         System.out.println("\t\t\t\t 7. "+emoji4+""+emoji4+"   Exit / Logout");
                         System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                         System.out.print("\t\t\t\t Enter your choice:"+emoji2+" "); 
                         int operationNumber=Integer.parseInt(br.readLine());
                         System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                         status=null;
                         
                   switch(operationNumber)
                         {
                         
                        case 1:
                        	 
                        	 try {
                        	 System.out.println("\t\t\t\t"+emoji5+" All New Admission Students Are Available.."+emoji5+"\n");
                        	 ps=conn.prepareStatement("select * from admissionaccount");
                        	 result=ps.executeQuery();
                             System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                        	 while(result.next())
                             {
                          	     System.out.println("\t\t\t\t Student Name :"+emoji4+" "+result.getString("fullname"));
                                 System.out.println("\t\t\t\t Student Parent's Name :"+emoji4+" "+result.getString("parentsname"));
                                 System.out.println("\t\t\t\t Student Contact No :"+emoji4+" "+result.getLong("phoneNo"));
                                 System.out.println("\t\t\t\t Student Email Id : "+emoji4+" "+result.getString("email"));
                                 System.out.println("\t\t\t\t Student Gender : "+emoji4+" "+result.getString("gender"));
                                 System.out.println("\t\t\t\t Student Date of Birth :"+emoji4+" "+result.getString("dob"));
                                 System.out.println("\t\t\t\t Student Age :"+emoji4+" "+result.getInt("age"));
                                 System.out.println("\t\t\t\t Student Aadhar Number :"+emoji4+" "+result.getLong("AadharNo"));
                                 System.out.println("\t\t\t\t Student Address :"+emoji4+" "+result.getString("Address"));
                                 System.out.println("\t\t\t\t Student State :"+emoji4+" "+result.getString("state"));
                                 System.out.println("\t\t\t\t Student Country :"+emoji4+" "+result.getString("country"));
                                 System.out.println("\t\t\t\t Student Pin Code :"+emoji4+" "+result.getInt("pin"));
                                 System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                             
                             }
                         }
                         catch (Exception e) {
                             System.out.println(e);	
                             }
                        	 System.out.print("\t\t\t\t Do you want to continue??(Y/N)"+emoji6+" ");
                             status=br.readLine();

                             if(status.equals("n") || status.equals("N"))
                             {
                                 login=false;
                             }
                             break;
                     
                       case 2: 
                    	 
                             try {
                            	 System.out.println("\t\t\t"+emoji5+".........Here Can You Check All Availables Course........."+emoji5+"\n");
                            	 System.out.println("\t\t SINO   \t Course Name    \t Course Fee     \t Offer Discount     \t Total Fee \n");
                                 System.out.println("\t\t"+emoji4+" "+" 1.    \t"+emoji7+""+emoji7+" 10th        \t"+emoji7+""+emoji7+" 11499      \t"+emoji7+""+emoji7+" 999            \t"+emoji7+""+emoji7+" 10500\n");
                                 System.out.println("\t\t"+emoji4+" "+" 2.    \t"+emoji7+""+emoji7+" 12th        \t"+emoji7+""+emoji7+" 26999      \t"+emoji7+""+emoji7+" 1499           \t"+emoji7+""+emoji7+" 25500\n");
                                 System.out.println("\t\t"+emoji4+" "+" 3.    \t"+emoji7+""+emoji7+" BSC(Math)   \t"+emoji7+""+emoji7+" 37499      \t"+emoji7+""+emoji7+" 1999           \t"+emoji7+""+emoji7+" 35500\n");
                                 System.out.println("\t\t"+emoji4+" "+" 4.    \t"+emoji7+""+emoji7+" BCA         \t"+emoji7+""+emoji7+" 107499     \t"+emoji7+""+emoji7+" 2499           \t"+emoji7+""+emoji7+" 105000\n");
                                 System.out.println("\t\t"+emoji4+" "+" 5.    \t"+emoji7+""+emoji7+" B.TECH      \t"+emoji7+""+emoji7+" 358999     \t"+emoji7+""+emoji7+" 4999           \t"+emoji7+""+emoji7+" 354000\n");
                                 System.out.println("\t\t"+emoji4+" "+" 6.    \t"+emoji7+""+emoji7+" MCA         \t"+emoji7+""+emoji7+" 208499     \t"+emoji7+""+emoji7+" 3499           \t"+emoji7+""+emoji7+" 205000\n");
                                 System.out.println("\t\t"+emoji4+" "+" 7.    \t"+emoji7+""+emoji7+" M.Tech      \t"+emoji7+""+emoji7+" 259999     \t"+emoji7+""+emoji7+" 3999           \t"+emoji7+""+emoji7+" 256000");
                            	 System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                               
                             }
                             catch (Exception e) {
								System.out.println(e);
								}
                             System.out.print("\t\t\t\t Do you want to continue??(Y/N)"+emoji6+" ");
                             status=br.readLine();

                             if(status.equals("n") || status.equals("N"))
                             {
                                 login=false;
                             }
                             break;
                             
                         case 3:
                        	 try {
                            	 System.out.println("\t\t\t\t All New Enrolled Students Are Available..\n");
                            	 ps=conn.prepareStatement("select * from courseaccount");
                            	 result=ps.executeQuery();
                                 System.out.println("\t\t\t\t"+emoji5+"----- All Details Are Available -----"+emoji5+"\n");
                                 System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                            	 while(result.next())
                                 {
                              	     System.out.println("\t\t\t\t Student Full Name :"+emoji4+" "+result.getString("full_Name"));
                                     System.out.println("\t\t\t\t Student Contact No :"+emoji4+" "+result.getLong("mobile_No"));
                                     System.out.println("\t\t\t\t Student Email Id : "+emoji4+" "+result.getString("email_Id"));
                                     System.out.println("\t\t\t\t Student Course Number :"+emoji4+" "+result.getInt("course_No"));
                                     System.out.println("\t\t\t\t Student Course Name :"+emoji4+" "+result.getString("course_Name"));
                                     System.out.println("\t\t\t\t Student Course Fee :"+emoji4+" "+result.getDouble("course_Fee"));
                                     System.out.println("\t\t\t\t Payment Date :"+emoji4+" "+result.getString("payment_Date"));
                                     System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                                 }
                             }
                             catch (Exception e) {
                                 System.out.println(e);	
                                 }
                            	 System.out.print("\t\t\t\t Do you want to continue??(Y/N)"+emoji6+" ");
                                 status=br.readLine();

                                 if(status.equals("n") || status.equals("N"))
                                 {
                                     login=false;
                                 }
                                 break;
                        	 
                         case 4:
                        	 
                        	 try {
                            	 System.out.println("\t\t\t\t"+emoji5+" All Payment Status Are Available..."+emoji5+"\n");
                            	 ps=conn.prepareStatement("select courseaccount.*,transactions.* from courseaccount ,transactions where courseaccount.course_Fee=transactions.transactionAmount;");
                            	 result=ps.executeQuery();
                                 System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                            	 while(result.next())
                                 {
                            		 System.out.println("\t\t\t\t Student Full Name :"+emoji4+" "+result.getString("full_Name"));
                                     System.out.println("\t\t\t\t Student Contact No :"+emoji4+" "+result.getLong("mobile_No"));
                                     System.out.println("\t\t\t\t Student Email Id : "+emoji4+" "+result.getString("email_Id"));
                                     System.out.println("\t\t\t\t Student Course Number :"+emoji4+" "+result.getInt("course_No"));
                                     System.out.println("\t\t\t\t Student Course Name :"+emoji4+" "+result.getString("course_Name"));
                                     System.out.println("\t\t\t\t Student Course Fee :"+emoji4+" "+result.getDouble("course_Fee"));
                                     System.out.println("\t\t\t\t Payment Date :"+emoji4+" "+result.getString("payment_Date"));
                                     System.out.println("\t\t\t\t Transaction Id :"+emoji4+" "+result.getString("transactionId"));
                                     System.out.println("\t\t\t\t Transaction Amount :"+emoji4+" "+result.getDouble("transactionAmount"));
                                     System.out.println("\t\t\t\t Transaction Date :"+emoji4+" "+result.getDate("transactionDate"));
                                     System.out.println("\t\t\t\t Transaction Type :"+emoji4+" "+result.getString("transactionType"));
                                     System.out.println("\t\t\t\t Sender Account Id :"+emoji4+" "+result.getInt("senderAccountId"));
                                     System.out.println("\t\t\t\t Receiver Account Id :"+emoji4+" "+result.getInt("receiverAccountId"));
                                     System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                                 }
                            	 System.out.println("\t\t\t\t"+emoji5+" Only Transaction Detailes Are Available..."+emoji5+"\n");
                            	 ps=conn.prepareStatement("select * from transactions");
                            	 result=ps.executeQuery();
                                 while(result.next())
                                 {
                                	  System.out.println("\t\t\t\t Transaction Id :"+emoji4+" "+result.getString("transactionId"));
                                      System.out.println("\t\t\t\t Transaction Amount :"+emoji4+" "+result.getDouble("transactionAmount"));
                                      System.out.println("\t\t\t\t Transaction Date :"+emoji4+" "+result.getDate("transactionDate"));
                                      System.out.println("\t\t\t\t Transaction Type :"+emoji4+" "+result.getString("transactionType"));
                                      System.out.println("\t\t\t\t Sender Account Id :"+emoji4+" "+result.getInt("senderAccountId"));
                                      System.out.println("\t\t\t\t Receiver Account Id :"+emoji4+" "+result.getInt("receiverAccountId"));
                                      System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                                 }
                             }
                             catch (Exception e) {
                                 System.out.println(e);	
                                 }
                            	 System.out.print("\t\t\t\t Do you want to continue??(Y/N)"+emoji6+" ");
                                 status=br.readLine();
                                 if(status.equals("n") || status.equals("N"))
                                 {
                                     login=false;
                                 }
                                 break;
                        	 
                         case 5:
                        	 try {
                        		 System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                                 System.out.print("\t\t\t\t Please Enter The Register Email Id : "+emoji7+" ");
                                 String emailid=br.readLine();
                        		 System.out.print("\t\t\t\t Please Enter The Existing Password: "+emoji7+" ");
                                 String existingPassword=br.readLine();
                                 
                                 System.out.print("\t\t\t\t Set New Password:"+emoji7+" ");
                                 String newPassword=br.readLine();
                                 
                                 System.out.print("\t\t\t\t Retype New Password:"+emoji7+" ");
                                 String retypePassword=br.readLine();
                                 
                                 
                                 ps=conn.prepareStatement("select user_password from adminaccount where email=?");
                                 ps.setString(1, emailid);
                                 
                                 result=ps.executeQuery();
                                 String accountPassword=null;
                                 while(result.next())
                                 {
                                     accountPassword=result.getString("user_password");
                                 }
                                 
                                 if(accountPassword.equals(existingPassword))
                                 {
                                     if(newPassword.equals(retypePassword))
                                     {
                                         ps=conn.prepareStatement("update adminaccount set user_password=? where email=?");
                                         ps.setString(1, newPassword);
                                         ps.setString(2, emailid);
                                         
                                         if(ps.executeUpdate()>0)
                                         {
                                             System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");               
                                             System.out.println("\t\t\t\t Passowrd Changed!!.....");
                                             System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                                             
                                         }
                                         
                                         else
                                         {
                                             System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                                             System.out.println("\t\t\t\t Error In Password Change!!......");
                                             System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                                             
                                         }
                                     }
                                     else
                                     {
                                         System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                                         System.out.println("\t\t\t\t Set New Password And Retype Password Must Be Same!!.....");
                                         System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                                         
                                     }
                                 } 
                                 else
                                 {
                                     System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                                     System.out.println("\t\t\t\t Please Enter Correct Existing Password!!......");
                                     System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                                     
                                 }
                        	 }
                        	 catch (Exception e) {
                        		 System.out.println(e);
							}
                        	 System.out.print("\t\t\t\t Do You Want To Continue??(Y/N)"+emoji6+" ");
                             status=br.readLine();
                            
                            if(status.equals("n") || status.equals("N"))
                            {
                                login=false;
                            }
                            break;
                             
                         case 6:
                        	 try {
                        		 ps=conn.prepareStatement("select studentsignupaccount.*,admissionaccount.*,courseaccount.*,transactions.* from studentsignupaccount ,admissionaccount,courseaccount,transactions");
                        		 result=ps.executeQuery();
                        		  while(result.next())
                                  {
                               	     System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                                      System.out.println("\t\t\t\t"+emoji5+" ----- All Student Details Are Available----- "+emoji5+"\n");
                                      System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                                      System.out.println("\t\t\t\t Student Name :"+emoji4+" "+result.getString("fullname"));
                                      System.out.println("\t\t\t\t Student Parent's Name :"+emoji4+" "+result.getString("parentsname"));
                                      System.out.println("\t\t\t\t Student Contact No :"+emoji4+" "+result.getLong("phoneNo"));
                                      System.out.println("\t\t\t\t Student Email Id : "+emoji4+" "+result.getString("email"));
                                      System.out.println("\t\t\t\t Student Gender : "+emoji4+" "+result.getString("gender"));
                                      System.out.println("\t\t\t\t Student Date of Birth :"+emoji4+" "+result.getDate("dob"));
                                      System.out.println("\t\t\t\t Student Age :"+emoji4+" "+result.getInt("age"));
                                      System.out.println("\t\t\t\t Student Highest Qualification :"+emoji4+" "+result.getString("highestQualification"));
                                      System.out.println("\t\t\t\t Student Percentage :"+emoji4+" "+result.getDouble("percentage"));
                                      System.out.println("\t\t\t\t Student Aadhar Number :"+emoji4+" "+result.getLong("AadharNo"));
                                      System.out.println("\t\t\t\t Student Address :"+emoji4+" "+result.getString("Address"));
                                      System.out.println("\t\t\t\t Student State :"+emoji4+" "+result.getString("state"));
                                      System.out.println("\t\t\t\t Student Country :"+emoji4+" "+result.getString("country"));
                                      System.out.println("\t\t\t\t Student Pin Code :"+emoji4+" "+result.getInt("pin"));
                                      System.out.println("\t\t\t\t Student Course No :"+emoji4+" "+result.getInt("course_No"));
                                      System.out.println("\t\t\t\t Student Course Name :"+emoji4+" "+result.getString("course_Name"));
                                      System.out.println("\t\t\t\t Course Fee :"+emoji4+" "+result.getDouble("course_Fee"));
                                      System.out.println("\t\t\t\t Payment Date :"+emoji4+" "+result.getString("payment_Date"));
                                      System.out.println("\t\t\t\t Student Account Id :"+emoji4+" "+result.getInt("accountId"));
                                      System.out.println("\t\t\t\t Student Account Type :"+emoji4+" "+result.getString("accountType"));
                                      System.out.println("\t\t\t\t Student Account Balance : "+emoji4+" "+result.getDouble("accountBalance"));
                                      System.out.println("\t\t\t\t Student Account IFSC Code :"+emoji4+" "+result.getString("IfscCode"));
                                      System.out.println("\t\t\t\t Transaction Id :"+emoji4+" "+result.getString("transactionId"));
                                      System.out.println("\t\t\t\t Transaction Amount :"+emoji4+" "+result.getDouble("transactionAmount"));
                                      System.out.println("\t\t\t\t Transaction Date :"+emoji4+" "+result.getDate("transactionDate"));
                                      System.out.println("\t\t\t\t Transaction Type :"+emoji4+" "+result.getString("transactionType"));
                                      System.out.println("\t\t\t\t Sender Account Id :"+emoji4+" "+result.getInt("senderAccountId"));
                                      System.out.println("\t\t\t\t Receiver Account Id :"+emoji4+" "+result.getInt("receiverAccountId"));
                                      System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                                  }
                        	 }catch (Exception e) {
                        		 System.out.println(e);
							}
                        	 System.out.print("\t\t\t\t Do you want to continue??(Y/N)"+emoji6+" ");
                             status=br.readLine();

                             if(status.equals("n") || status.equals("N"))
                             {
                                 login=false;
                             }

                        	 break;
                        	 
                         case 7:
                        	 login=false;
                      	     break;
                         }
                         
                         }
                         while(login);
                         System.out.println("\t\t\t\t Bye..Bye...");
                         System.out.println("\t\t\t\t Have a Nice Day!!.....");
                    
                 }
                     else {
                    	 System.out.println("\t\t\t\t Wrong username/password!!.....");
                     }
                       
                 }
              catch (Exception e) {
					System.out.println(e);			
					}
             }
    		 
    	 }
     }
}
     
     
  


