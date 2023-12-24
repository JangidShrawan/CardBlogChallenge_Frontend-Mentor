import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;

public class AddStudent extends JFrame implements ActionListener {
    JTextField j_name, j_f_name, j_address, j_phone, j_phone2, j_email, j_per10, j_per12;
    JDateChooser j_dob;
    JLabel j_rollno;
    JComboBox j_course, j_branch;
    JButton submit, cancel;

    AddStudent() {
        Random rn = new Random();
        int last4 = rn.nextInt(10000);
        setLayout(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 900, 30);
        panel.setBackground(Color.blue);
        add(panel);

        ImageIcon i1 = new ImageIcon(("icons/3.png"));
        Image i2 = i1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(10, 5, 25, 25);
        img.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                System.exit(0);
            }
        });
        panel.add(img);

        // frame name apply

        JLabel l_name = new JLabel("New Student Details Who have just taken addmission ");
        l_name.setFont(new Font("Raleway", Font.BOLD, 38));
        l_name.setBounds(250, 40, 400, 50);
        add(l_name);

        // student name label
        JLabel name = new JLabel("Name ");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(70, 120, 150, 20);
        add(name);

        j_name = new JTextField();
        j_name.setFont(new Font("Raleway", Font.BOLD, 16));
        j_name.setBounds(200, 120, 190, 22);
        add(j_name);

        // father name label
        JLabel f_name = new JLabel("Father Name ");
        f_name.setFont(new Font("Raleway", Font.BOLD, 20));
        f_name.setBounds(420, 120, 150, 20);
        add(f_name);

        j_f_name = new JTextField();
        j_f_name.setFont(new Font("Raleway", Font.BOLD, 16));
        j_f_name.setBounds(580, 120, 190, 22);
        add(j_f_name);

        // roll number label
        JLabel roll_no = new JLabel("Roll NO. ");
        roll_no.setFont(new Font("Raleway", Font.BOLD, 20));
        roll_no.setBounds(70, 160, 150, 20);
        add(roll_no);

        j_rollno = new JLabel("17250" + last4);
        j_rollno.setFont(new Font("Raleway", Font.BOLD, 16));
        j_rollno.setBounds(200, 160, 190, 22);
        add(j_rollno);

        // date of birth field
        JLabel dob = new JLabel("Date of Birth");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(420, 160, 150, 20);
        add(dob);

        j_dob = new JDateChooser();
        j_dob.setFont(new Font("Raleway", Font.BOLD, 16));
        j_dob.setBounds(580, 160, 190, 22);
        add(j_dob);

        // address field
        JLabel address = new JLabel("Address ");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(70, 200, 150, 20);
        add(address);

        j_address = new JTextField();
        j_address.setFont(new Font("Raleway", Font.BOLD, 16));
        j_address.setBounds(200, 200, 190, 22);
        add(j_address);

        // phone numberlabel
        JLabel phone = new JLabel("Phone No. ");
        phone.setFont(new Font("Raleway", Font.BOLD, 20));
        phone.setBounds(420, 200, 150, 20);
        add(phone);

        j_phone = new JTextField();
        j_phone.setFont(new Font("Raleway", Font.BOLD, 16));
        j_phone.setBounds(580, 200, 190, 22);
        add(j_phone);

        // phone number 2 field
        JLabel phone2 = new JLabel("Ph 2 no.");
        phone2.setFont(new Font("Raleway", Font.BOLD, 20));
        phone2.setBounds(70, 240, 150, 20);
        add(phone2);

        j_phone2 = new JTextField();
        j_phone2.setFont(new Font("Raleway", Font.BOLD, 16));
        j_phone2.setBounds(200, 240, 190, 22);
        add(j_phone2);

        // Email label
        JLabel email = new JLabel("Email ");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(420, 240, 150, 20);
        add(email);

        j_email = new JTextField();
        j_email.setFont(new Font("Raleway", Font.BOLD, 16));
        j_email.setBounds(580, 240, 240, 22);
        add(j_email);

        // class 10 th percentage field
        JLabel per10 = new JLabel("Class 10 Per.");
        per10.setFont(new Font("Raleway", Font.BOLD, 20));
        per10.setBounds(70, 280, 150, 20);
        add(per10);

        j_per10 = new JTextField();
        j_per10.setFont(new Font("Raleway", Font.BOLD, 16));
        j_per10.setBounds(200, 280, 190, 22);
        add(j_per10);

        // class 12 percentage label
        JLabel per12 = new JLabel("Class 12 Per.");
        per12.setFont(new Font("Raleway", Font.BOLD, 20));
        per12.setBounds(420, 280, 150, 20);
        add(per12);

        j_per12 = new JTextField();
        j_per12.setFont(new Font("Raleway", Font.BOLD, 16));
        j_per12.setBounds(580, 280, 240, 22);
        add(j_per12);

        // branch field
        JLabel branch = new JLabel("Branch");
        branch.setFont(new Font("Raleway", Font.BOLD, 20));
        branch.setBounds(70, 320, 150, 20);
        add(branch);

        String b_names[] = { "Computer Science ", "Electronics ", "Machenical ", "Civil ", "IT" };
        j_branch = new JComboBox(b_names);
        j_branch.setBackground(Color.WHITE);
        j_branch.setFont(new Font("Raleway", Font.BOLD, 16));
        j_branch.setBounds(200, 320, 190, 22);
        add(j_branch);

        // course label
        JLabel course = new JLabel("Course");
        course.setFont(new Font("Raleway", Font.BOLD, 20));
        course.setBounds(420, 320, 150, 20);
        add(course);

        String c_names[] = { "BTech ", "BBA", "BCA", "BSC", "BCOM", "BA", "MTech ", "MBA", "MCA", "MSC", "MCOM", "MA" };
        j_course = new JComboBox(c_names);
        j_course.setBackground(Color.WHITE);
        j_course.setFont(new Font("Raleway", Font.BOLD, 16));
        j_course.setBounds(580, 320, 190, 22);
        add(j_course);

        submit = new JButton("Submit");
        submit.setFont(new Font("Raleway", Font.CENTER_BASELINE, 15));
        submit.setBounds(250, 380, 100, 26);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Raleway", Font.CENTER_BASELINE, 15));
        cancel.setBounds(580, 380, 100, 26);
        cancel.addActionListener(this);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        add(cancel);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900, 500);
        setVisible(true);
        setLocation(300, 100);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == cancel) {
            setVisible(false);
            new project_uni().setVisible(true);
        } else if (ae.getSource() == submit) {
            String name = j_name.getText();
            String fname = j_f_name.getText();
            String rollno = j_rollno.getText();
            String address = j_address.getText();
            String phone = j_phone.getText();
            String phone2 = j_phone2.getText();
            String email = j_email.getText();
            String x = j_per10.getText();
            String xii = j_per12.getText();
            String dob = ((JTextField) j_dob.getDateEditor().getUiComponent()).getText();
            String course = (String) j_course.getSelectedItem();
            String branch = (String) j_branch.getSelectedItem();

            try {
                String query = "insert into student values('" + name + "','" + fname + "','" + rollno + "','" + dob
                        + "','" + address + "','" + phone + "','" + phone2 + "','" + email + "','" + x + "','" + xii
                        + "','" + branch + "','" + course + "')";

                if (name.equals("") || fname.equals("") || dob.equals("") || address.equals("") || email.equals("")
                        || phone.equals("") || course.equals("") || branch.equals("") || x.equals("") || xii.equals("")
                        || rollno.equals("")) {
                    JOptionPane.showMessageDialog(null, "Insert all detail fields ");
                } else {
                    uni_conn uc = new uni_conn();
                    uc.s.executeUpdate(query);

                    JOptionPane.showMessageDialog(rootPane, "Student Details Inserted Successfully");
                    setVisible(false);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new AddStudent();
    }
}
