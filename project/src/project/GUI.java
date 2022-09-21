package project;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.sql.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Locale;
import javax.swing.*;

/**
 *
 * @author Ashraf Sholok
 */
public class GUI extends JFrame implements ActionListener {

    Connection con;
    PreparedStatement pst;
    Statement stmt;
    ResultSet rs;

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();
    JPanel panel6 = new JPanel();
    JPanel panel7 = new JPanel();
    JPanel panel8 = new JPanel();
    JPanel panel9 = new JPanel();
    JPanel panel10 = new JPanel();
    JPanel panel11 = new JPanel();
    JPanel customerinformation = new JPanel();
    JPanel employeeinformation = new JPanel();

    JLabel j1 = new JLabel();
    JLabel j2 = new JLabel();
    // JLabel j3 = new JLabel();
    // JLabel j4 = new JLabel();
    // JLabel j5 = new JLabel();
    // JLabel j6 = new JLabel();
    // JLabel j7 = new JLabel();
    // JLabel j8 = new JLabel();
    // JLabel j9 = new JLabel();
    // JLabel j10 = new JLabel();
    // JLabel j11 = new JLabel();

    JButton back = new JButton("<-");
    JButton backPanel1 = new JButton("<-");
    JButton backPanel2 = new JButton("<-");
    JButton backPanel3 = new JButton("<-");
    JButton backpanel3 = new JButton("<-");
    JButton backpanel1 = new JButton("<-");
    JButton backPanel6 = new JButton("<-");
    JButton backPanel7 = new JButton("<-");
    JButton backHome = new JButton("<-");
    JButton backPanel8 = new JButton("<-");
    JButton backPanel9 = new JButton("<-");

    JButton home = new JButton("Home");
    JButton manager = new JButton("manager");
    JButton employee = new JButton("employee");
    JButton customer = new JButton("customer");

    JButton registrationEmployee = new JButton("Employee");
    JButton registrationcustomer = new JButton("Customer");

    JButton searchcustomer = new JButton("Search");
    JButton deletecustomer = new JButton("Delete");
    JButton updatecustomer = new JButton("Update");
    JTextField searchCustomer = new JTextField();

    JTextField idManager = new JTextField();
    JLabel labelIdManager = new JLabel("ID");
    JPasswordField passwordManager = new JPasswordField();
    JLabel labelPasswordManager = new JLabel("Password");
    JButton loginManager = new JButton("Login");

    JButton deleteemployee = new JButton("Delete");
    JButton searchemployee = new JButton("Search");
    JButton updateemployee = new JButton("Update");
    JTextField searchEmployee = new JTextField();

    JTextField employeeName = new JTextField();
    JPasswordField employeePassword = new JPasswordField();
    JTextField employeeId = new JTextField();
    JTextField employeePhoneNumber = new JTextField("+20 ");
    JTextField employeeAddress = new JTextField();
    JButton signupEmployee = new JButton("Insert");

    JLabel labelNameEmployee = new JLabel("Name");
    JLabel labelPasswordEmployee = new JLabel("Password");
    JLabel labelIdEmployee = new JLabel("ID");
    JLabel labelPhoneNumberEmployee = new JLabel("Phone Number");
    JLabel labelAddressEmployee = new JLabel("Address");
    JLabel signupDone = new JLabel("signup successful");

    JTextField customerName = new JTextField();
    JPasswordField customerPassword = new JPasswordField();
    JTextField customerId = new JTextField();
    JTextField customerPhoneNumber = new JTextField("+20 ");
    JTextField customerRoom = new JTextField();
    JButton signupCustomer = new JButton("Insert");

    JLabel labelNameCustomer = new JLabel("Name");
    JLabel labelPasswordCustomer = new JLabel("Password");
    JLabel labelIdCustomer = new JLabel("ID");
    JLabel labelPhoneNumberCustomer = new JLabel("Phone Number");
    JLabel labelCustomerRoom = new JLabel("Room");

    JTextField idEmployee = new JTextField();
    JLabel labelIdEmployeeLogin = new JLabel("ID");
    JPasswordField passwordEmployee = new JPasswordField();
    JLabel labelPasswordEmployeeLogin = new JLabel("Password");
    JButton loginEmployee = new JButton("Login");

    JTextField idCustomerLogin = new JTextField();
    JLabel labelIdCustomerLogin = new JLabel("ID");
    JPasswordField passwordCustomerLogin = new JPasswordField();
    JLabel labelPasswordCustomerLogin = new JLabel("Password");
    JButton loginCustomer = new JButton("Login");

    JButton customerInformation = new JButton("INFORMATION");
    JButton employeeInformation = new JButton("INFORMATION");

    JLabel welcome = new JLabel("WELCOME TO HOTEL");
    JLabel text1 = new JLabel("This is one of the best luxury hotels in our state. We offer high-quality ");
    JLabel text2 = new JLabel("accommodation with a wide variety of rooms, additional services,");
    JLabel text3 = new JLabel("and amenities available to all our guests.");

    GUI() {
        hotel();
        connect();
    }

    public void hotel() {
        this.setTitle("HOTEL");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(850, 650);
        this.setVisible(true);

        this.add(panel1);
        panel1.setVisible(true);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(false);
        panel6.setVisible(false);
        panel7.setVisible(false);
        panel8.setVisible(false);
        panel9.setVisible(false);
        panel10.setVisible(false);
        panel11.setVisible(false);

        panel1.add(manager);
        manager.setFont(new Font("Calibri", Font.ITALIC, 14));
        panel1.add(employee);
        employee.setFont(new Font("Calibri", Font.ITALIC, 14));
        panel1.add(customer);
        customer.setFont(new Font("Calibri", Font.ITALIC, 14));
        j2.setLayout(null);

        j2.setIcon(new ImageIcon("C:\\Users\\Ashraf Sholok\\Desktop\\new.JPG"));
        panel1.add(j2);
        j2.setSize(850, 650);

        this.setLayout(null);
        panel1.setLayout(null);
        panel1.setBounds(0, 0, 850, 650);

        manager.setBounds(150, 40, 100, 30);
        employee.setBounds(325, 40, 100, 30);
        customer.setBounds(500, 40, 100, 30);

        j2.add(welcome);
        welcome.setFont(new Font("Times New Roman", Font.BOLD, 14));
        welcome.setBounds(300, 190, 600, 100);

        j2.add(text1);
        text1.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        text1.setBounds(175, 230, 600, 100);

        j2.add(text2);
        text2.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        text2.setBounds(175, 250, 600, 100);

        j2.add(text3);
        text3.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        text3.setBounds(250, 270, 600, 100);

        //////////////////////////////////////////////////////////////

        this.add(idManager);
        this.add(passwordManager);

        this.add(panel2);
        panel2.setLayout(null);
        panel2.setBounds(0, 0, 850, 650);
        panel2.add(idManager);
        panel2.add(labelIdManager);
        panel2.add(passwordManager);
        panel2.add(labelPasswordManager);
        panel2.add(loginManager);
        panel2.add(backPanel1);

        labelPasswordManager.setBounds(35, 295, 80, 20);
        labelPasswordManager.setFont(new Font("Times New Roman", Font.BOLD, 16));
        passwordManager.setBounds(125, 290, 150, 30);

        labelIdManager.setBounds(80, 255, 30, 20);
        labelIdManager.setFont(new Font("Times New Roman", Font.BOLD, 16));
        idManager.setBounds(125, 250, 150, 30);

        loginManager.setBounds(205, 340, 70, 30);
        loginManager.setFont(new Font("Times New Roman", Font.BOLD, 12));
        backPanel1.setBounds(35, 30, 50, 30);

        ///////////////////////////////////////////////////////////////////

        this.add(panel3);
        panel3.setLayout(null);
        panel3.setBounds(0, 0, 850, 650);

        panel3.add(registrationEmployee);
        registrationEmployee.setBounds(100, 250, 210, 60);
        registrationEmployee.setFont(new Font("Calibri", Font.ITALIC, 14));

        panel3.add(backPanel2);
        backPanel2.setBounds(35, 30, 50, 30);

        j1.setLayout(null);
        j1.setIcon(new ImageIcon("C:\\Users\\Ashraf Sholok\\Desktop\\new.JPG"));
        panel3.add(j1);
        j1.setSize(850, 650);

        /////////////////////////////////////////////////////////////////

        this.add(panel4);
        panel4.setLayout(null);
        panel4.setBounds(0, 0, 850, 650);

        backPanel3.setBounds(35, 30, 50, 30);

        panel4.add(deleteemployee);
        panel4.add(searchemployee);
        panel4.add(updateemployee);
        panel4.add(searchEmployee);

        panel4.add(backPanel3);
        panel4.add(employeeName);
        panel4.add(employeeId);
        panel4.add(employeePassword);
        panel4.add(employeeAddress);
        panel4.add(employeePhoneNumber);

        panel4.add(labelAddressEmployee);
        panel4.add(labelIdEmployee);
        panel4.add(labelPhoneNumberEmployee);
        panel4.add(labelNameEmployee);
        panel4.add(labelPasswordEmployee);
        panel4.add(signupEmployee);

        j1.setIcon(new ImageIcon("C:\\Users\\Ashraf Sholok\\Desktop\\new.JPG"));
        panel4.add(j1);
        j1.setSize(850, 650);

        signupEmployee.setFont(new Font("Times New Roman", Font.BOLD, 12));
        employeeName.setBounds(125, 130, 150, 30);
        employeeId.setBounds(125, 170, 150, 30);
        employeePhoneNumber.setBounds(125, 210, 150, 30);
        employeeAddress.setBounds(125, 250, 150, 30);
        employeePassword.setBounds(125, 290, 150, 30);
        searchEmployee.setBounds(500, 130, 150, 30);

        searchemployee.setBounds(400, 130, 80, 30);
        deleteemployee.setBounds(90, 380, 80, 30);
        updateemployee.setBounds(195, 380, 80, 30);

        searchemployee.setFont(new Font("Calibri", Font.ITALIC, 14));
        deleteemployee.setFont(new Font("Calibri", Font.ITALIC, 14));
        updateemployee.setFont(new Font("Calibri", Font.ITALIC, 14));

        labelNameEmployee.setBounds(70, 130, 50, 30);
        labelNameEmployee.setFont(new Font("Times New Roman", Font.BOLD, 16));

        labelIdEmployee.setBounds(85, 170, 30, 30);
        labelIdEmployee.setFont(new Font("Times New Roman", Font.BOLD, 16));

        labelPhoneNumberEmployee.setBounds(10, 210, 100, 30);
        labelPhoneNumberEmployee.setFont(new Font("Times New Roman", Font.BOLD, 16));

        labelAddressEmployee.setBounds(53, 250, 60, 30);
        labelAddressEmployee.setFont(new Font("Times New Roman", Font.BOLD, 16));

        labelPasswordEmployee.setBounds(45, 290, 65, 30);
        labelPasswordEmployee.setFont(new Font("Times New Roman", Font.BOLD, 16));

        signupEmployee.setBounds(200, 335, 75, 30);

        ////////////////////////////////////////////////////////////////

        this.add(panel5);
        panel5.setLayout(null);
        panel5.setBounds(0, 0, 850, 650);

        backpanel3.setBounds(35, 30, 50, 30);

        panel5.add(searchcustomer);
        panel5.add(deletecustomer);
        panel5.add(updatecustomer);
        panel5.add(searchCustomer);

        panel5.add(backpanel3);
        panel5.add(customerName);
        panel5.add(customerId);
        panel5.add(customerPassword);
        panel5.add(customerPhoneNumber);
        panel5.add(customerRoom);

        panel5.add(labelIdCustomer);
        panel5.add(labelPhoneNumberCustomer);
        panel5.add(labelNameCustomer);
        panel5.add(labelPasswordCustomer);
        panel5.add(signupCustomer);
        panel5.add(labelCustomerRoom);

        j1.setIcon(new ImageIcon("C:\\Users\\Ashraf Sholok\\Desktop\\new.JPG"));
        panel5.add(j1);
        j1.setSize(850, 650);

        customerName.setBounds(125, 130, 150, 30);
        customerId.setBounds(125, 170, 150, 30);
        customerPhoneNumber.setBounds(125, 210, 150, 30);
        customerRoom.setBounds(125, 250, 150, 30);
        customerPassword.setBounds(125, 290, 150, 30);

        searchcustomer.setBounds(400, 130, 80, 30);
        deletecustomer.setBounds(90, 380, 80, 30);
        updatecustomer.setBounds(195, 380, 80, 30);
        searchCustomer.setBounds(500, 130, 150, 30);

        searchcustomer.setFont(new Font("Calibri", Font.ITALIC, 14));
        deletecustomer.setFont(new Font("Calibri", Font.ITALIC, 14));
        updatecustomer.setFont(new Font("Calibri", Font.ITALIC, 14));

        labelNameCustomer.setBounds(70, 130, 50, 30);
        labelNameCustomer.setFont(new Font("Times New Roman", Font.BOLD, 16));

        labelIdCustomer.setBounds(85, 170, 30, 30);
        labelIdCustomer.setFont(new Font("Times New Roman", Font.BOLD, 16));

        labelPhoneNumberCustomer.setBounds(10, 210, 100, 30);
        labelPhoneNumberCustomer.setFont(new Font("Times New Roman", Font.BOLD, 16));

        labelCustomerRoom.setBounds(70, 250, 50, 30);
        labelCustomerRoom.setFont(new Font("Times New Roman", Font.BOLD, 16));

        labelPasswordCustomer.setBounds(45, 290, 65, 30);
        labelPasswordCustomer.setFont(new Font("Times New Roman", Font.BOLD, 16));

        signupCustomer.setBounds(200, 335, 75, 30);
        signupCustomer.setFont(new Font("Times New Roman", Font.BOLD, 12));

        /////////////////////////////////////////////////////////////////

        this.add(panel6);
        panel6.setLayout(null);
        panel6.setBounds(0, 0, 850, 650);
        panel6.add(idEmployee);
        panel6.add(labelIdEmployeeLogin);
        panel6.add(passwordEmployee);
        panel6.add(labelPasswordEmployeeLogin);
        panel6.add(loginEmployee);
        panel6.add(backpanel1);

        j1.setIcon(new ImageIcon("C:\\Users\\Ashraf Sholok\\Desktop\\new.JPG"));
        panel6.add(j1);
        j1.setSize(850, 650);

        labelPasswordEmployeeLogin.setBounds(35, 295, 80, 20);
        labelPasswordEmployeeLogin.setFont(new Font("Times New Roman", Font.BOLD, 16));
        passwordEmployee.setBounds(125, 290, 150, 30);

        labelIdEmployeeLogin.setBounds(80, 255, 30, 20);
        labelIdEmployeeLogin.setFont(new Font("Times New Roman", Font.BOLD, 16));
        idEmployee.setBounds(125, 250, 150, 30);

        loginEmployee.setBounds(205, 340, 70, 30);
        backpanel1.setBounds(35, 30, 50, 30);

        //////////////////////////////////////////////////////////////////

        this.add(panel7);
        panel7.setLayout(null);
        panel7.setBounds(0, 0, 850, 650);

        panel7.add(employeeInformation);
        employeeInformation.setBounds(350, 250, 180, 60);
        employeeInformation.setFont(new Font("Calibri", Font.ITALIC, 14));

        panel7.add(backPanel6);
        backPanel6.setBounds(35, 30, 50, 30);

        j1.setIcon(new ImageIcon("C:\\Users\\Ashraf Sholok\\Desktop\\new.JPG"));
        panel7.add(j1);
        j1.setSize(850, 650);

        /////////////////////////////////////////////////////////////////////

        this.add(panel11);
        panel11.setLayout(null);
        panel11.setBounds(0, 0, 850, 650);
        panel11.add(backPanel7);
        backPanel7.setBounds(35, 30, 50, 30);

        j1.setIcon(new ImageIcon("C:\\Users\\Ashraf Sholok\\Desktop\\new.JPG"));
        panel11.add(j1);
        j1.setSize(850, 650);

        /////////////////////////////////////////////////////////////////////

        this.add(panel10);
        panel10.setLayout(null);
        panel10.setBounds(0, 0, 850, 650);
        panel10.add(backPanel9);

        j1.setIcon(new ImageIcon("C:\\Users\\Ashraf Sholok\\Desktop\\new.JPG"));
        panel10.add(j1);
        j1.setSize(850, 650);
        backPanel9.setBounds(35, 30, 50, 30);

        //////////////////////////////////////////////////////////////////

        this.add(panel8);
        panel8.setLayout(null);
        panel8.setBounds(0, 0, 850, 650);
        panel8.add(idCustomerLogin);
        panel8.add(labelIdCustomerLogin);
        panel8.add(passwordCustomerLogin);
        panel8.add(labelPasswordCustomerLogin);
        panel8.add(loginCustomer);
        panel8.add(backHome);

        j1.setIcon(new ImageIcon("C:\\Users\\Ashraf Sholok\\Desktop\\new.JPG"));
        panel8.add(j1);
        j1.setSize(850, 650);

        labelPasswordCustomerLogin.setBounds(35, 295, 80, 20);
        passwordCustomerLogin.setBounds(125, 290, 150, 30);
        labelPasswordCustomerLogin.setFont(new Font("Times New Roman", Font.BOLD, 16));

        labelIdCustomerLogin.setBounds(80, 255, 30, 20);
        idCustomerLogin.setBounds(125, 250, 150, 30);
        labelIdCustomerLogin.setFont(new Font("Times New Roman", Font.BOLD, 16));

        loginCustomer.setBounds(205, 340, 70, 30);
        backHome.setBounds(35, 30, 50, 30);

        ///////////////////////////////////////////////////////////////////

        this.add(panel9);
        panel9.setLayout(null);
        panel9.setBounds(0, 0, 850, 650);
        panel9.add(backPanel8);

        backPanel8.setBounds(35, 30, 50, 30);

        panel9.add(customerInformation);
        customerInformation.setBounds(100, 250, 180, 60);
        customerInformation.setFont(new Font("Calibri", Font.ITALIC, 14));

        j1.setIcon(new ImageIcon("C:\\Users\\Ashraf Sholok\\Desktop\\new.JPG"));
        panel9.add(j1);
        j1.setSize(850, 650);

        // add action to buttons
        manager.addActionListener(this);
        customer.addActionListener(this);
        employee.addActionListener(this);
        back.addActionListener(this);
        home.addActionListener(this);
        loginManager.addActionListener(this);
        registrationEmployee.addActionListener(this);
        registrationcustomer.addActionListener(this);
        signupEmployee.addActionListener(this);
        signupCustomer.addActionListener(this);
        loginEmployee.addActionListener(this);
        loginCustomer.addActionListener(this);
        customerInformation.addActionListener(this);
        employeeInformation.addActionListener(this);
        backPanel1.addActionListener(this);
        backPanel2.addActionListener(this);
        backPanel3.addActionListener(this);
        backpanel3.addActionListener(this);
        backpanel1.addActionListener(this);
        backPanel6.addActionListener(this);
        backPanel7.addActionListener(this);
        backHome.addActionListener(this);
        backPanel8.addActionListener(this);
        backPanel9.addActionListener(this);
        searchcustomer.addActionListener(this);
        deletecustomer.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // manager button
        if (e.getSource() == manager) {
            panel1.setVisible(false);
            panel2.setVisible(true);
            // panel2.setBackground(Color.GRAY);
            // this.setLayout(null);

            panel2.add(home);
            home.setBounds(100, 30, 70, 30);
            home.setFont(new Font("Times New Roman", Font.BOLD, 12));

            j1.setLayout(null);
            j1.setIcon(new ImageIcon("C:\\Users\\Ashraf Sholok\\Desktop\\new.JPG"));
            panel2.add(j1);
            j1.setSize(850, 650);
        }

        if (e.getSource() == backPanel1) {
            panel2.setVisible(false);
            panel1.setVisible(true);
            j1.setIcon(new ImageIcon("C:\\Users\\Ashraf Sholok\\Desktop\\new.JPG"));
            panel1.add(j1);
            j1.setSize(850, 650);
        }

        // if manager login
        if (e.getSource() == loginManager) {
            // panel2.setVisible(false);
            // panel3.setVisible(true);

            try {
                rs = stmt.executeQuery("SELECT * FROM manger");
                long mail = Long.parseLong(idManager.getText());
                int found = 0;
                while (rs.next()) {
                    if (mail == rs.getLong(1)) {
                        found = 1;
                        if (found == 1) {
                            if (passwordManager.getText().equals(rs.getString(2))) {
                                panel2.setVisible(false);
                                panel3.setVisible(true);
                            }
                        }
                    }
                }
                if (found == 0) {
                    System.out.println("not exist");
                }
            } catch (SQLException err) {
                System.out.println(err.getMessage());
            }

            panel3.add(home);
            home.setBounds(100, 30, 70, 30);
            home.setFont(new Font("Times New Roman", Font.BOLD, 12));

            panel3.add(registrationcustomer);
            registrationcustomer.setBounds(350, 250, 210, 60);
            registrationcustomer.setFont(new Font("Calibri", Font.ITALIC, 14));

            j1.setLayout(null);
            j1.setIcon(new ImageIcon("C:\\Users\\Ashraf Sholok\\Desktop\\new.JPG"));
            panel3.add(j1);
            j1.setSize(850, 650);

        }

        if (e.getSource() == backPanel2) {
            panel3.setVisible(false);
            panel2.setVisible(true);

            panel2.add(home);
            home.setBounds(100, 30, 70, 30);
            home.setFont(new Font("Times New Roman", Font.BOLD, 12));

            j1.setIcon(new ImageIcon("C:\\Users\\Ashraf Sholok\\Desktop\\new.JPG"));
            panel2.add(j1);
            j1.setSize(850, 650);
        }

        // manager registration to employee
        if (e.getSource() == registrationEmployee) {
            panel3.setVisible(false);
            panel4.setVisible(true);

            panel4.add(home);
            home.setBounds(100, 30, 70, 30);
            home.setFont(new Font("Times New Roman", Font.BOLD, 12));

            j1.setLayout(null);
            j1.setIcon(new ImageIcon("C:\\Users\\Ashraf Sholok\\Desktop\\new.JPG"));
            panel4.add(j1);
            j1.setSize(850, 650);

        }

        if (e.getSource() == backPanel3) {
            panel4.setVisible(false);
            panel3.setVisible(true);

            panel3.add(home);
            home.setBounds(100, 30, 70, 30);
            home.setFont(new Font("Times New Roman", Font.BOLD, 12));

            j1.setIcon(new ImageIcon("C:\\Users\\Ashraf Sholok\\Desktop\\new.JPG"));
            panel3.add(j1);
            j1.setSize(850, 650);
        }

        if (e.getSource() == searchcustomer) {
            try {
                rs = stmt.executeQuery("SELECT * FROM customers");
                long search_id = Long.parseLong(searchCustomer.getText());
                int found = 0;
                // rs.absolute(0);
                while (rs.next()) {
                    if (search_id == rs.getLong(1)) {
                        found = 1;
                        if (found == 1) {

                            customerId.setText(rs.getLong(1) + "");
                            customerName.setText(rs.getString(2));
                            customerPhoneNumber.setText(rs.getLong(3) + "");
                            customerRoom.setText(rs.getLong(6) + "");
                            searchCustomer.setText("found");
                        }
                        break;

                    }
                }

                if (found == 0) {
                    searchCustomer.setText("Not Found");
                }
            } catch (SQLException err) {
                System.out.println(err.getMessage());
            }
        }

        

        // if signup sucessful
        if (e.getSource() == signupEmployee) {
            panel4.add(signupDone);
            signupDone.setBounds(200, 400, 130, 30);
            signupDone.setFont(new Font("Calibri", Font.ITALIC, 16));
        }

        // manager registration to customer
        if (e.getSource() == registrationcustomer) {
            panel3.setVisible(false);
            panel7.setVisible(false);
            panel5.setVisible(true);

            panel5.add(home);
            home.setBounds(100, 30, 70, 30);
            home.setFont(new Font("Times New Roman", Font.BOLD, 12));

            j1.setLayout(null);
            j1.setIcon(new ImageIcon("C:\\Users\\Ashraf Sholok\\Desktop\\new.JPG"));
            panel5.add(j1);
            j1.setSize(850, 650);
        }

        if (e.getSource() == backpanel3) {
            panel5.setVisible(false);
            panel3.setVisible(true);

            panel3.add(home);
            home.setBounds(100, 30, 70, 30);
            home.setFont(new Font("Times New Roman", Font.BOLD, 12));

            j1.setIcon(new ImageIcon("C:\\Users\\Ashraf Sholok\\Desktop\\new.JPG"));
            panel3.add(j1);
            j1.setSize(850, 650);

        }

        // if signup sucessful
        if (e.getSource() == signupCustomer) {
            panel5.add(signupDone);
            signupDone.setBounds(200, 400, 120, 30);
            signupDone.setFont(new Font("Calibri", Font.ITALIC, 16));
        }

        // employee button
        if (e.getSource() == employee) {
            panel1.setVisible(false);
            panel5.setVisible(false);
            panel6.setVisible(true);

            panel6.add(home);
            home.setBounds(100, 30, 70, 30);
            home.setFont(new Font("Times New Roman", Font.BOLD, 12));

            j1.setLayout(null);
            j1.setIcon(new ImageIcon("C:\\Users\\Ashraf Sholok\\Desktop\\new.JPG"));
            panel6.add(j1);
            j1.setSize(850, 650);
        }

        if (e.getSource() == backpanel1) {
            panel6.setVisible(false);
            panel1.setVisible(true);

            j1.setIcon(new ImageIcon("C:\\Users\\Ashraf Sholok\\Desktop\\new.JPG"));
            panel1.add(j1);
            j1.setSize(850, 650);
        }

        // if employee login
        if (e.getSource() == loginEmployee) {
            try {
                rs = stmt.executeQuery("SELECT * FROM employees");
                long mail = Long.parseLong(idEmployee.getText());
                int found = 0;
                while (rs.next()) {
                    if (mail == rs.getLong(1)) {
                        found = 1;
                        if (found == 1) {
                            if (passwordEmployee.getText().equals(rs.getString(3))) {
                                panel6.setVisible(false);
                                panel5.setVisible(false);
                                panel7.setVisible(true);
                            }
                        }
                    }
                }
                if (found == 0) {
                    System.out.println("not exist");
                }
            } catch (SQLException err) {
                System.out.println(err.getMessage());
            }

            // panel6.setVisible(false);
            // panel5.setVisible(false);
            // panel7.setVisible(true);

            panel7.add(home);
            home.setBounds(100, 30, 70, 30);
            home.setFont(new Font("Times New Roman", Font.BOLD, 12));

            panel7.add(registrationcustomer);
            registrationcustomer.setBounds(100, 250, 210, 60);
            registrationcustomer.setFont(new Font("Calibri", Font.ITALIC, 14));

            j1.setLayout(null);
            j1.setIcon(new ImageIcon("C:\\Users\\Ashraf Sholok\\Desktop\\new.JPG"));
            panel7.add(j1);
            j1.setSize(850, 650);
        }

        if (e.getSource() == backPanel6) {
            panel7.setVisible(false);
            panel6.setVisible(true);

            panel6.add(home);
            home.setBounds(100, 30, 70, 30);
            home.setFont(new Font("Times New Roman", Font.BOLD, 12));

            j1.setIcon(new ImageIcon("C:\\Users\\Ashraf Sholok\\Desktop\\new.JPG"));
            panel6.add(j1);
            j1.setSize(850, 650);
        }

        // employee looking at his information
        if (e.getSource() == employeeInformation) {
            panel7.setVisible(false);
            panel11.setVisible(true);

            panel11.add(home);
            home.setBounds(100, 30, 70, 30);
            home.setFont(new Font("Times New Roman", Font.BOLD, 12));

            j1.setLayout(null);
            j1.setIcon(new ImageIcon("C:\\Users\\Ashraf Sholok\\Desktop\\new.JPG"));
            panel11.add(j1);
            j1.setSize(850, 650);
        }

        if (e.getSource() == backPanel7) {
            panel11.setVisible(false);
            panel7.setVisible(true);

            panel7.add(home);
            home.setBounds(100, 30, 70, 30);
            home.setFont(new Font("Times New Roman", Font.BOLD, 12));

            j1.setIcon(new ImageIcon("C:\\Users\\Ashraf Sholok\\Desktop\\new.JPG"));
            panel7.add(j1);
            j1.setSize(850, 650);
        }

        // customer button
        if (e.getSource() == customer) {
            panel1.setVisible(false);
            panel5.setVisible(false);
            panel8.setVisible(true);

            panel8.add(home);
            home.setBounds(100, 30, 70, 30);
            home.setFont(new Font("Times New Roman", Font.BOLD, 12));

            j1.setLayout(null);
            j1.setIcon(new ImageIcon("C:\\Users\\Ashraf Sholok\\Desktop\\new.JPG"));
            panel8.add(j1);
            j1.setSize(850, 650);
        }

        if (e.getSource() == backHome) {
            panel8.setVisible(false);
            panel1.setVisible(true);

            j1.setIcon(new ImageIcon("C:\\Users\\Ashraf Sholok\\Desktop\\new.JPG"));
            panel1.add(j1);
            j1.setSize(850, 650);
        }

        // if customer login
        if (e.getSource() == loginCustomer) {
            try {
                rs = stmt.executeQuery("SELECT * FROM customers");
                long mail = Long.parseLong(idCustomerLogin.getText());
                int found = 0;
                while (rs.next()) {
                    if (mail == rs.getLong(1)) {
                        found = 1;
                        if (found == 1) {
                            if (passwordCustomerLogin.getText().equals(rs.getString(4))) {
                                panel8.setVisible(false);
                                panel9.setVisible(true);
                            }
                        }
                    }
                }
                if (found == 0) {
                    System.out.println("not exist");
                }
            } catch (SQLException err) {
                System.out.println(err.getMessage());
            }

            panel9.add(home);
            home.setBounds(100, 30, 70, 30);
            home.setFont(new Font("Times New Roman", Font.BOLD, 12));

            j1.setLayout(null);
            j1.setIcon(new ImageIcon("C:\\Users\\Ashraf Sholok\\Desktop\\new.JPG"));
            panel9.add(j1);
            j1.setSize(850, 650);
        }

        if (e.getSource() == backPanel8) {
            panel9.setVisible(false);
            panel8.setVisible(true);

            panel8.add(home);
            home.setBounds(100, 30, 70, 30);
            home.setFont(new Font("Times New Roman", Font.BOLD, 12));

            j1.setIcon(new ImageIcon("C:\\Users\\Ashraf Sholok\\Desktop\\new.JPG"));
            panel8.add(j1);
            j1.setSize(850, 650);
        }

        // customer looking for his information
        if (e.getSource() == customerInformation) {
            panel9.setVisible(false);
            panel10.setVisible(true);

            panel10.add(home);
            home.setBounds(100, 30, 70, 30);
            home.setFont(new Font("Times New Roman", Font.BOLD, 12));

            j1.setLayout(null);
            j1.setIcon(new ImageIcon("C:\\Users\\Ashraf Sholok\\Desktop\\new.JPG"));
            panel10.add(j1);
            j1.setSize(850, 650);
        }

        if (e.getSource() == backPanel9) {
            panel10.setVisible(false);
            panel9.setVisible(true);

            panel9.add(home);
            home.setBounds(100, 30, 70, 30);
            home.setFont(new Font("Times New Roman", Font.BOLD, 12));
            j1.setIcon(new ImageIcon("C:\\Users\\Ashraf Sholok\\Desktop\\new.JPG"));
            panel9.add(j1);
            j1.setSize(850, 650);
        }

        // back to home from any page
        if (e.getSource() == home) {
            panel1.setVisible(true);
            panel2.setVisible(false);
            panel3.setVisible(false);
            panel4.setVisible(false);
            panel5.setVisible(false);
            panel6.setVisible(false);
            panel7.setVisible(false);
            panel8.setVisible(false);
            panel9.setVisible(false);
            panel10.setVisible(false);
            panel11.setVisible(false);

            j1.setIcon(new ImageIcon("C:\\Users\\Ashraf Sholok\\Desktop\\new.JPG"));
            panel1.add(j1);
            j1.setSize(850, 650);
        }
    }

    public void connect() {
        try {
            // step1 load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // step2 create the connection object
            con = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "oop", "12345");

            // step3 create the statement object
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);// elli gowa for
                                                                                                      // message at the
                                                                                                      // end

            // step4 execute query
            rs = stmt.executeQuery("select * from manger");
            while (rs.next())
                System.out.println(
                        rs.getInt(1) + "  " + rs.getString(2));

            // step5 close the connection object

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
