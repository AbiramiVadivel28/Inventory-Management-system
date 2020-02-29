import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;




public class Inventory_management extends JFrame {
	
	
	ArrayList<ArrayList<Object>> alist = new ArrayList<ArrayList<Object>>();
	
	
	ArrayList<Object> hens = new ArrayList<Object>();
	
	private String giraffe;
	private String Elephant;
    private String west1;
    private String west2;
    private String west3;
    private String west4;
    private String west5;
    private String west6;
    private String west7;
    private String west8;
    private String west9;
	
	
	private JFrame frame; 
	
	private JPanel PanelHome;
	
	private JLayeredPane layeredPane;
	private JPasswordField passwordField;
	private JTextField textField;
	private JPanel PanelMenu;
	
	private JPanel PanelAdd;
	private JTextField onetextField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	
	private JPanel PanelView;
	
	private JPanel PanelSearch;
	private JPanel Manufacture;
	private JPanel Location;
	private JPanel Type;
	private JPanel Code;
	
	public static void printbyproductcode (ArrayList<ArrayList<Object>> alist, String productcode)
	{
		
		List<ArrayList<Object>> result3 =alist.stream().filter(l -> l.get(0).equals(productcode)).collect(Collectors.toList());
        result3.forEach(l -> {
	        l.forEach(s -> System.out.print(s+" "));
	        System.out.println();
	        });
	}
	
	
	public static void printbyproducttype (ArrayList<ArrayList<Object>> list, String productname)
	{
		
		List<ArrayList<Object>> result4 =list.stream().filter(l -> l.get(4).equals(productname)).collect(Collectors.toList());
        result4.forEach(l -> {
	        l.forEach(s -> System.out.print(s+" "));
	        System.out.println();
	        });
	}
	
	
	public static void showbylocation (ArrayList<ArrayList<Object>> list, int manufacturername)
	{
		
		List<ArrayList<Object>> result67 =list.stream().filter(l -> l.get(5).equals(manufacturername)).collect(Collectors.toList());
        result67.forEach(l -> {
	        l.forEach(s -> System.out.print(s+" "));
	        System.out.println();
	        });
	}
	
	
	
	public static void showbymanufacturer (ArrayList<ArrayList<Object>> list, String manufacturername)
	{
		
		List<ArrayList<Object>> result4 =list.stream().filter(l -> l.get(3).equals(manufacturername)).collect(Collectors.toList());
        result4.forEach(l -> {
	        l.forEach(s -> System.out.print(s+" "));
	        System.out.println();
	        });
	}
	
	public static void listproductsbyprice (ArrayList<ArrayList<Object>> list, int unitprice)
	{
		
		List<ArrayList<Object>> result6 =list.stream().filter(l -> l.get(7).equals(unitprice)).collect(Collectors.toList());
		
		System.out.println("The products list with unit price   "+ unitprice   + "  are" );
		
		for (int i = 0; i < result6.size(); i++) 
		{
		
			
			
			System.out.println(result6.get(i).get(1));
		
		}
		
        
	}
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		// Main from Tryagainexample
		
		

		Scanner newObj = new Scanner(System.in);  
		
		String PRoductCOde;
		String PRoductNAme;
		
		String MAnufacturer;
		String TYpe;
		int LOcation;
		int MSRP;
		int UNitPRice;
		int DIscount;
		int QUantityinSTock;
		
		
		
	/*	ArrayList<ArrayList<Object>> list = new ArrayList<ArrayList<Object>>();
		
	    ArrayList<Object> LAPTOP = new ArrayList<Object>(); 
        LAPTOP.add("A1"); 
        LAPTOP.add("Laptop");
        LAPTOP.add("A10");
        LAPTOP.add("Dell");
        LAPTOP.add("A00");
        LAPTOP.add(000);
        LAPTOP.add(300);
        LAPTOP.add(200);
        LAPTOP.add(0);
        LAPTOP.add(100);
       list.add(LAPTOP);
      // alist.add(LAPTOP);
        
        ArrayList<Object> PHONE = new ArrayList<Object>(); 
        PHONE.add("A2");
        PHONE.add("Mobilephone");
        PHONE.add("T20");
        PHONE.add("Samsung");
        PHONE.add("T00");
        PHONE.add(111);
        PHONE.add(200);
        PHONE.add(100);
        PHONE.add(10);
        PHONE.add(20);
        list.add(PHONE);
        
        ArrayList<Object> PEN = new ArrayList<Object>();
        PEN.add("L1");
        PEN.add("Pen");
        PEN.add("P15");
        PEN.add("Reynolds");
        PEN.add("P00");
        PEN.add(222);
        PEN.add(15);
        PEN.add(100);
        PEN.add(0);
        PEN.add(15);
        list.add(PEN);
        
        
        ArrayList<Object> NOTE = new ArrayList<Object>();
        NOTE.add("L2");
        NOTE.add("Notebook");
        NOTE.add("C17");
        NOTE.add("Reynolds");
        NOTE.add("P00");
        NOTE.add(222);
        NOTE.add(22);
        NOTE.add(100);
        NOTE.add(0);
        NOTE.add(5);
        
        list.add(NOTE);*/

        EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventory_management window = new Inventory_management("fox");
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
        
        
       // initialize();
        
        
        
        

	    //setup done. the following line is the important one

	/*    List<ArrayList<Object>> result = list.stream().filter(l -> l.get(0).equals("A1")).collect(Collectors.toList());

	    //test output
	    
	    List<ArrayList<Object>> result2= getResult(list, "T20");

	    result.forEach(l -> {
	        l.forEach(s -> System.out.print(s+" "));
	        System.out.println();
	        });
	    
	    result2.forEach(l -> {
	        l.forEach(s -> System.out.print(s+" "));
	        System.out.println();
	        });*/
	    
	    
String in;
//System.out.println("Please enter the product number 1-5. Enter 0 to stop. :");
Scanner myObj = new Scanner(System.in);  
in ="1";
       
     
   /*  while(in !="12" ) 
     {
    	 System.out.println("Enter switch case from 1 to 6  1. ProductCode 2. PRoduct name 3. Entire Inventory 4.Add Product 5.List Products 6.Close");
         in = myObj.nextLine(); 
    	 
    	 
        switch(in)
        {
        	
        case "1":
        	System.out.println("Enter Product code ");
        	String productcode;
        	productcode=myObj.nextLine(); 
        	
        	printbyproductcode(list,productcode);	
        break;
        	
        case "2":
        	System.out.println("Enter Product name ");
        	String productname;
        	productname=myObj.nextLine(); 
        	
        	printbyproductname(list,productname);
        	
        break;	
        	
        case "3":
        	System.out.println("Showing  Entire Inventory");
        	
        	
        	for (int i = 0; i < list.size(); i++) { 
                for (int j = 0; j < list.get(i).size(); j++) { 
                    System.out.print(list.get(i).get(j) + " "); 
                } 
                System.out.println(); 
            }
        	
        	break;
        	
        case "4":
        	System.out.println(" Add new Arraylist");
        	//System.out.println(" Enter the product name in capital letters");
        	//String newproduct;
        	//newproduct= myObj.nextLine();
        	
        	ArrayList<Object> example = new ArrayList<Object>();
        	System.out.println("Enter the new product");
        	
        	System.out.println("Enter Product Code:");
            PRoductNAme = newObj.nextLine(); 
            example.add(PRoductNAme);
            System.out.println("Enter Product Name:");
        	PRoductCOde=newObj.nextLine(); 
        	example.add(PRoductCOde);
        	System.out.println("Enter Model:");
        	MOdel=newObj.nextLine(); 
        	example.add(MOdel);
        	System.out.println("Enter Manufacturer:");
        	MAnufacturer=newObj.nextLine(); 
        	example.add(MAnufacturer);
        	System.out.println("Enter Type:");
        	TYpe=newObj.nextLine();
        	example.add(TYpe);
        	System.out.println("enter Location:");
        	LOcation=newObj.nextInt();
        	newObj.nextLine();
        	example.add(LOcation);
        	
        	System.out.println("Enter MSRP:");
        	MSRP=newObj.nextInt();
        	newObj.nextLine();
        	example.add(MSRP);
        	
        	System.out.println("Enter Unit Price:");
        	UNitPRice= newObj.nextInt();
        	newObj.nextLine();
        	example.add(UNitPRice);
        	
        	System.out.println("Enter Discount:");
        	DIscount=newObj.nextInt();
        	newObj.nextLine();
        	example.add(DIscount);
        	
        	System.out.println("Enter Quantity in stock:");
        	QUantityinSTock = newObj.nextInt();
        	newObj.nextLine();
        	
        	example.add(QUantityinSTock);
        	
        	list.add(example);
        	
        	System.out.println("After addition");
        	
        	for (int i = 0; i < list.size(); i++) { 
                for (int j = 0; j < list.get(i).size(); j++) { 
                    System.out.print(list.get(i).get(j) + " "); 
                } 
                System.out.println(); 
            }
        	
        	break;
        	
        	
        case "5":
        	System.out.println("List Products by price");
        	// considering unit price
        	
        	
        	System.out.println("Enter Product Unit Price ");
        	int unitprice;
        	unitprice=myObj.nextInt(); 
        	myObj.nextLine();
        	
        	
        	listproductsbyprice(list, unitprice);

        	
        	break;
        	
        	
        	
        case "6":
        	System.out.println("Showing Inventory by Manufacturer");
        	
        	System.out.println("Enter Manufacturer name ");
        	String manufacturername;
        	manufacturername=myObj.nextLine(); 
        	
        	showbymanufacturer(list, manufacturername);
        	
        	break;	
        
        
        case "12" :
        default:
        	System.exit(0);
        	break;
        
        
        }
        
        
     }*/
				
		
	}

	
	public void switchPanels(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}
	
	
	/**
	 * Create the application.
	 */
	
	// Constructor
	public Inventory_management(String bias) {
		initialize();
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private  void initialize() {
		
		ArrayList<Object> LAPTOP1 = new ArrayList<Object>(); 
		
	    LAPTOP1.add("A1"); 
	    LAPTOP1.add("Laptop");
	    LAPTOP1.add("A10");
	    LAPTOP1.add("Dell");
	    LAPTOP1.add("A00");
	    LAPTOP1.add(000);
	    LAPTOP1.add(300);
	    LAPTOP1.add(200);
	    LAPTOP1.add(0);
	    LAPTOP1.add(100);
	   alist.add(LAPTOP1);
	   
	   ArrayList<Object> PHONE = new ArrayList<Object>(); 
       PHONE.add("A");
       PHONE.add("Mobilephone");
       PHONE.add("T20");
       PHONE.add("Samsung");
       PHONE.add("T00");
       PHONE.add(111);
       PHONE.add(200);
       PHONE.add(100);
       PHONE.add(10);
       PHONE.add(20);
       alist.add(PHONE);
       
       ArrayList<Object> HEADSET = new ArrayList<Object>();
       HEADSET.add("L1");
       HEADSET.add("Headset");
       HEADSET.add("P15");
       HEADSET.add("Skullcandy");
       HEADSET.add("P00");
       HEADSET.add(222);
       HEADSET.add(15);
       HEADSET.add(100);
       HEADSET.add(0);
       HEADSET.add(15);
       alist.add(HEADSET);
       
       
       ArrayList<Object> BLUETOOTH = new ArrayList<Object>();
       BLUETOOTH.add("L2");
       BLUETOOTH.add("Bluetooth");
       BLUETOOTH.add("C17");
       BLUETOOTH.add("Skullcandy");
       BLUETOOTH.add("P00");
       BLUETOOTH.add(222);
       BLUETOOTH.add(22);
       BLUETOOTH.add(100);
       BLUETOOTH.add(0);
       BLUETOOTH.add(5);
       
       alist.add(BLUETOOTH);
       
       
       ArrayList<Object> MOUSE= new ArrayList<Object>();
       MOUSE.add("S1");
       MOUSE.add("Mouse");
       MOUSE.add("S17");
       MOUSE.add("Lenovo");
       MOUSE.add("S00");
       MOUSE.add(200);
       MOUSE.add(1000);
       MOUSE.add(700);
       MOUSE.add(15);
       MOUSE.add(150);
       
       alist.add(MOUSE);

       ArrayList<Object> PENDRIVE= new ArrayList<Object>();
       PENDRIVE.add("B1");
       PENDRIVE.add("Pendrive");
       PENDRIVE.add("B17");
       PENDRIVE.add("Lenovo");
       PENDRIVE.add("S00");
       PENDRIVE.add(200);
       PENDRIVE.add(1500);
       PENDRIVE.add(750);
       PENDRIVE.add(30);
       PENDRIVE.add(170);
       
       alist.add(PENDRIVE);

       ArrayList<Object> PRINTER= new ArrayList<Object>();
       PRINTER.add("P1");
       PRINTER.add("Printer");
       PRINTER.add("P05");
       PRINTER.add("HP");
       PRINTER.add("C00");
       PRINTER.add(600);
       PRINTER.add(2000);
       PRINTER.add(1700);
       PRINTER.add(35);
       PRINTER.add(230);
       
       alist.add(PRINTER);

       ArrayList<Object> EARPHONES= new ArrayList<Object>();
       EARPHONES.add("S5");
       EARPHONES.add("Earphones");
       EARPHONES.add("P05");
       EARPHONES.add("HP");
       EARPHONES.add("C00");
       EARPHONES.add(800);
       EARPHONES.add(2500);
       EARPHONES.add(1800);
       EARPHONES.add(50);
       EARPHONES.add(135);
       
       alist.add(EARPHONES);

       ArrayList<Object> NOTEPAD= new ArrayList<Object>();
       NOTEPAD.add("N1");
       NOTEPAD.add("Notepad");
       NOTEPAD.add("N17");
       NOTEPAD.add("Dell");
       NOTEPAD.add("A00");
       NOTEPAD.add(000);
       NOTEPAD.add(555);
       NOTEPAD.add(400);
       NOTEPAD.add(50);
       NOTEPAD.add(250);
       
       alist.add(NOTEPAD);

       ArrayList<Object> TABLET= new ArrayList<Object>();
       TABLET.add("T1");
       TABLET.add("Tablet");
       TABLET.add("T10");
       TABLET.add("Samsung");
       TABLET.add("T00");
       TABLET.add(111);
       TABLET.add(600);
       TABLET.add(500);
       TABLET.add(25);
       TABLET.add(350);
       
       alist.add(TABLET);
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
	   
       
      // printbyproductcode(alist, "A1");
       
	   //Please add 6 more items so there is 10 items already in the list.Add 2 type,locations and manufacturer same in different products.
	   
		
		// setting up anew frame
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 228, 181));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// using layered pane to get different layers
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 798, 528);
		frame.getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		
		//Our home panel is where we have login details :  user name and password
		PanelHome = new JPanel();
		layeredPane.add(PanelHome, "homepanel");
		PanelHome.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Sign-In page");
		lblNewLabel.setBounds(222, 47, 144, 14);
		//frame.getContentPane().add(lblNewLabel);
		PanelHome.add(lblNewLabel);
		
		JButton loginbutton = new JButton("Login");
		loginbutton.setBounds(198, 201, 111, 20);
		PanelHome.add(loginbutton);
loginbutton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				
				switchPanels(PanelMenu);
				
			}
		});
		


		

		JLabel lblLoginid = new JLabel("Login-Id");
		lblLoginid.setBounds(82, 86, 46, 14);
		PanelHome.add(lblLoginid);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(82, 144, 89, 14);
		PanelHome.add(lblPassword);

		passwordField = new JPasswordField();
		passwordField.setBounds(198, 141, 111, 20);
		PanelHome.add(passwordField);

		textField = new JTextField();
		textField.setBounds(198, 83, 111, 20);
		PanelHome.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("VIRUS IMS");
		lblNewLabel_1.setBackground(new Color(255, 228, 181));
		lblNewLabel_1.setBounds(82, 47, 89, 14);
		PanelHome.add(lblNewLabel_1);
		
		
		
		
		
		// Panel Search, add , view
		
		
		PanelMenu = new JPanel();
		layeredPane.add(PanelMenu, "menupanel");
		PanelMenu.setLayout(null);
		
		
		JLabel lblProductSearchPage = new JLabel("PRODUCT SEARCH");
		lblProductSearchPage.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblProductSearchPage.setBounds(145, 33, 150, 14);
		PanelMenu.add(lblProductSearchPage);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				switchPanels(PanelAdd);
				
				
			}
		});
		btnAdd.setBounds(69, 83, 89, 41);
		PanelMenu.add(btnAdd);
		
		JButton SearchButton = new JButton("SEARCH");
		
		SearchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//frame.setVisible(false);
				//Search_Page obj1=new Search_Page();

				switchPanels(PanelSearch);
				
			}
		});
		SearchButton.setBounds(174, 175, 89, 41);
		PanelMenu.add(SearchButton);
		
		JButton ViewButton = new JButton("VIEW");
		ViewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		
				switchPanels(PanelView);
				
				
				
			}
		});
		ViewButton.setBounds(280, 83, 89, 41);
		PanelMenu.add(ViewButton);
		frame.setVisible(true);
		
		
		// Add Panel
		
		
		
		PanelAdd = new JPanel();
		layeredPane.add(PanelAdd, "addpanel");
		PanelAdd.setLayout(null);
		
		JLabel productCODE = new JLabel("Product Code");
		productCODE.setBounds(100, 29, 86, 20);
		PanelAdd.add(productCODE);
		textField.setColumns(10);
		// Reperat this code 10 times
		
		
		
		textField = new JTextField();
		textField.setBounds(188, 29, 86, 20);
		PanelAdd.add(textField);
		textField.setColumns(10);
		
		
		
		//hens.add("Abi");
	
		
		textField.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				giraffe = textField.getText().toString();
				//hens.add(giraffe);
				
				//System.out.println(hens);
			}
		});
		
		JLabel productNAME = new JLabel("Product Name");
		productNAME.setBounds(100, 67, 86, 20);
		PanelAdd.add(productNAME);
	//	productNAME.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(188, 67, 86, 20);
		PanelAdd.add(textField_1);
		textField_1.setColumns(10);
textField_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				 west1 = textField_1.getText().toString();
				hens.add(west1);
				
			}
		});
JLabel Model = new JLabel("Model");
Model.setBounds(100, 98, 86, 20);
PanelAdd.add(Model);
//textField_2.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(188, 98, 86, 20);
		PanelAdd.add(textField_2);
		textField_2.setColumns(10);
textField_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				 west2 = textField_2.getText().toString();
				//hens.add(west);
				
			}
		});
		
JLabel Manufacturer = new JLabel("Manufacturer");
Manufacturer.setBounds(100, 129, 86, 20);
PanelAdd.add(Manufacturer);
//textField_3.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBounds(188, 129, 86, 20);
		PanelAdd.add(textField_3);
		textField_3.setColumns(10);
textField_3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				 west3 = textField_3.getText().toString();
				//hens.add(west);
				
			}
		});
JLabel Type2 = new JLabel("Type");
Type2.setBounds(100, 163, 86, 20);
PanelAdd.add(Type2);
//textField_4.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(188, 163, 86, 20);
		PanelAdd.add(textField_4);
		textField_4.setColumns(10);
textField_4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
			 west4 = textField_4.getText().toString();
				//hens.add(west);
				
			}
		});
JLabel Location2 = new JLabel("Location");
Location2.setBounds(100, 194, 86, 20);
PanelAdd.add(Location2);
//textField_5.setColumns(10);		

		textField_5 = new JTextField();
		textField_5.setBounds(188, 194, 86, 20);
		PanelAdd.add(textField_5);
		textField_5.setColumns(10);
textField_5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				 west5 = textField_5.getText().toString();
				
				
			}
		});
JLabel MSRP = new JLabel("MSRP");
MSRP.setBounds(100, 225, 86, 20);
PanelAdd.add(MSRP);
//textField_6.setColumns(10);

		textField_6 = new JTextField();
		textField_6.setBounds(188, 225, 86, 20);
		PanelAdd.add(textField_6);
		textField_6.setColumns(10);
textField_6.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				 west6 = textField_6.getText().toString();
				//hens.add(west);
				
			}
		});
		
JLabel unitPRICE = new JLabel("Unit Price");
unitPRICE.setBounds(100, 269, 86, 20);
PanelAdd.add(unitPRICE);
//textField_7.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setBounds(188, 269, 86, 20);
		PanelAdd.add(textField_7);
		textField_7.setColumns(10);
textField_7.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				 west7 = textField_7.getText().toString();
				//hens.add(west);
				
			}
		});
JLabel Discount = new JLabel("Discount");
Discount.setBounds(100, 305, 86, 20);
PanelAdd.add(Discount);
//textField_8.setColumns(10);

		textField_8 = new JTextField();
		textField_8.setBounds(188, 305, 86, 20);
		PanelAdd.add(textField_8);
		textField_8.setColumns(10);
         textField_8.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				 west8 = textField_8.getText().toString();
				//hens.add(west);
				
			}
		});
         JLabel quantityinSTOCK = new JLabel("Quantity in stock");
         quantityinSTOCK.setBounds(100, 336, 86, 20);
         PanelAdd.add(quantityinSTOCK);
       //  textField_9.setColumns(10);
         
		textField_9 = new JTextField();
		textField_9.setBounds(188, 336, 86, 20);
		PanelAdd.add(textField_9);
		//textField_9.setColumns(10);
		
		
		textField_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		 west9 = textField_9.getText().toString();
				//hens.add(west);
			}
		});
		
		
		
		
		
		JButton btnregister1 = new JButton("ADD new arraylist");
		btnregister1.setBounds(188,366,86,20);
		btnregister1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				hens.add(giraffe);
				//hens.add(west1);
				hens.add(west2);
				hens.add(west3);
				hens.add(west4);
				hens.add(west5);
				hens.add(west6);
				hens.add(west7);
				hens.add(west8);
				hens.add(west9);
				
				//System.out.println(hens);
				
				alist.add(hens);
				
				for (int i = 0; i < alist.size(); i++) { 
	                for (int j = 0; j < alist.get(i).size(); j++) { 
	                    System.out.print(alist.get(i).get(j) + " "); 
	                } 
	                System.out.println(); 
	            }
				
				
				
			}
		});
		//btnregister1.setBounds(69, 83, 89, 41);
		PanelAdd.add(btnregister1);
		
		
		
		
		// View panel
		
		PanelView = new JPanel();
		layeredPane.add(PanelView, "viewpanel");
		PanelView.setLayout(null);
		
		/*JLabel lblViewPage = new JLabel("View Page");
		lblViewPage.setBounds(189, 28, 88, 14);
		PanelView.add(lblViewPage);*/
		
		
       JButton viewbuttonfull = new JButton("View Inventory");
       viewbuttonfull.setBounds(189, 28, 88, 14);
       viewbuttonfull.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for (int i = 0; i < alist.size(); i++) { 
	                for (int j = 0; j < alist.get(i).size(); j++) { 
	                    System.out.print(alist.get(i).get(j) + " "); 
	                } 
	                System.out.println(); 
	            }
				
				
				
			}
		});
	
		PanelView.add(viewbuttonfull);
		
		
		
		
	
		
		
		
		// Search Panel
		
		PanelSearch = new JPanel();
		layeredPane.add(PanelSearch, "searchpanel");
		PanelSearch.setLayout(null);
		
		
		JButton btnNewButtonmanu = new JButton("Search_by_Manufacturer");
		btnNewButtonmanu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//frame.setVisible(false);
				//Search_by_Manufacture obj1=new Search_by_Manufacture();
				switchPanels(Manufacture);
			}
		});
		btnNewButtonmanu.setBounds(70, 80, 155, 23);
		PanelSearch.add(btnNewButtonmanu);
		
		
	
		Manufacture= new JPanel();
		layeredPane.add(Manufacture, "searchpanelmanu");
	    Manufacture.setLayout(null);
	    
	JTextField    textFieldmanufacture = new JTextField();
		textFieldmanufacture.setBounds(204, 121, 130, 20);
		Manufacture.add(textFieldmanufacture);
		textFieldmanufacture.setColumns(10);
		
		
		
		textFieldmanufacture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String hand= textFieldmanufacture.getText();
				
				showbymanufacturer(alist,hand);
				
				
				//printbyproductcode(alist,hand);
				
				
				
				
				
			}
		});
		
		JLabel lblEnterManufactureName = new JLabel("Enter Manufacture Name :");
		lblEnterManufactureName.setBounds(64, 124, 130, 14);
		Manufacture.add(lblEnterManufactureName);
		frame.setVisible(true);
		
		//JPanel Location2;
		
		JButton btnNewButtonloca = new JButton("Search_by_Location");
		btnNewButtonloca.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				switchPanels(Location);
			}
		});
		btnNewButtonloca.setBounds(280, 80, 133, 23);
		PanelSearch.add(btnNewButtonloca);
		
		
		Location= new JPanel();
		layeredPane.add(Location, "searchpanelloca");
	    Location.setLayout(null);
		
		
		
		JTextField textFieldloca = new JTextField();
		textFieldloca.setBounds(234, 123, 86, 20);
		Location.add(textFieldloca);
		textFieldloca.setColumns(10);
		
		textFieldloca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String hand2= textFieldmanufacture.getText();
				
				int hand=Integer.parseInt( textFieldloca.getText());
				
				
				//showbylocation(alist, hand2);
				
				showbylocation(alist,hand);
				
				//printbyproductcode(alist,hand);
				
				
				
				
				
			}
		});
		
		JLabel lblEnterTheLocation = new JLabel("Enter the Location :");
		lblEnterTheLocation.setBounds(83, 126, 108, 14);
		Location.add(lblEnterTheLocation);
		frame.setVisible(true);
		
		
		
		
		
		
		// name is type
		JButton btnNewButtonname = new JButton("Search_by_Type");
		btnNewButtonname.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//frame.setVisible(false);
				//Search_by_Name obj1=new Search_by_Name();
				
				switchPanels(Type);
			}
		});
		btnNewButtonname.setBounds(70, 177, 155, 23);
		PanelSearch.add(btnNewButtonname);
		
		Type= new JPanel();
		layeredPane.add(Type, "searchpaneltype");
	    Type.setLayout(null);
		
		System.out.println();
		
	 JTextField	textFieldtype = new JTextField();
		textFieldtype.setBounds(214, 114, 86, 20);
		Type.add(textFieldtype);
	//	textFieldtype.setColumns(10);
		
		
		
		
		
		JLabel lblEnterName = new JLabel("Enter Type:");
		lblEnterName.setBounds(74, 117, 93, 14);
		Type.add(lblEnterName);
		frame.setVisible(true);
		
		textFieldtype.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String hand= textFieldtype.getText();
				printbyproducttype(alist,hand);
				
				
				
				
				
			}
		});

		
		
		
		
		JButton btnSearchbycode = new JButton("Search_by_Code");
		btnSearchbycode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//frame.setVisible(false);
				//Search_by_Code obj1=new Search_by_Code();
				switchPanels(Code);
				}
			
		});
		btnSearchbycode.setBounds(280, 177, 133, 23);
		PanelSearch.add(btnSearchbycode);
		
		
		 Code= new JPanel();
			layeredPane.add(Code, "searchpaneltype");
		    Code.setLayout(null);
		
	JTextField	textFieldcode = new JTextField();
		textFieldcode.setBounds(221, 117, 86, 20);
		Code.add(textFieldcode);
		textFieldcode.setColumns(10);
		
		JLabel lblEnterYourCode = new JLabel("Enter your Code :");
		lblEnterYourCode.setBounds(58, 120, 126, 14);
		Code.add(lblEnterYourCode);
		frame.setVisible(true);
		
		
		textFieldcode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String hand= textFieldcode.getText();
				
				
				printbyproductcode(alist,hand);
				
				//printbyproductcode(alist,hand);
				
				
				
				
				
			}
		});
		
		
		
		JLabel lblSearchbypage = new JLabel("Search_By_Page");
		lblSearchbypage.setBounds(70, 37, 155, 14);
		PanelSearch.add(lblSearchbypage);
		frame.setVisible(true);
	
		frame.setVisible(true);
	
		frame.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
// class ends here
