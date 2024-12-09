import java.awt.*;
import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main {
    private static String Memory = "";
    public static void main(String[] args) {
        // calculator frame
        JFrame frame = new JFrame("Calculator");
        frame.setSize(400, 500); // Set frame size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(34, 34, 32));


        //icons
        String[] icons = {"%", "CE", "C", "<-", ")","x²","√x", "/","7","8","9","x","4","5","6","-","1","2","3","+","(","0",",","="};
        //screen
        JLabel label = new JLabel(Memory);
        label.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setVerticalAlignment(JLabel.CENTER);
        frame.setLayout(null);
        label.setBounds(0, 20, 385, 100);
        label.setFont(label.getFont().deriveFont(30f));
        label.setForeground(Color.WHITE);
        frame.add(label);

        // button1
        int  x = 0;
        int  y = ((4*frame.getHeight())/15);
        int compteurpourListIcons = 0;
        for(int i=0; i<6; i++){
            for(int j = 0; j<4; j++){
                //new button variable
                JButton button0 = new JButton(icons[compteurpourListIcons]);
                compteurpourListIcons+=1;

                // Set a custom color for the button's background and design
                if(i<2 || ( j==3&&i<5 ) ){button0.setBackground(new Color(54, 54, 53));}
                else if(i==5 && j==3){button0.setBackground(new Color(255, 181, 31));}
                else{button0.setBackground(new Color(64, 63, 60));}
                button0.setForeground(Color.WHITE);
                button0.setBorderPainted(true);
                button0.setBorder(new CompoundBorder(new LineBorder(new Color(34, 34, 32), 2), new EmptyBorder(10, 10, 10, 10)));
                button0.setBounds(x, y, frame.getWidth()/4, (frame.getHeight())/9);

                //each button job
                String key = i + ":" + j;
                switch (key) {
                    case ("0:0") :button0.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            Memory += "%";
                            System.out.println(Memory);
                            label.setText(Memory);
                        }
                    });
                        break;
                    case ("0:1"), ("0:2"):button0.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            Memory = "";
                            System.out.println(Memory);
                            label.setText(Memory);
                        }
                    });
                        break;
                    case ("0:3") :button0.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            if(Memory.isEmpty()){Memory="";}else{Memory = Memory.substring(0, Memory.length() - 1);};
                            System.out.println(Memory);
                            label.setText(Memory);
                        }
                    });
                        break;
                    case ("1:0") :button0.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            Memory += ")";
                            System.out.println(Memory);
                            label.setText(Memory);
                        }
                    });
                        break;
                    case ("1:1") :button0.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            if(Memory.isEmpty()){Memory="";}else{Memory += "^2";};
                            label.setText(Memory);
                        }
                    });
                        break;
                    case ("1:2") :button0.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            if(Memory.isEmpty()){Memory="";}else{Memory += "^(1/2)";};
                            System.out.println(Memory);
                            label.setText(Memory);
                        }
                    });
                        break;
                    case ("1:3") :button0.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            if(Memory.isEmpty()){Memory="";}else{Memory += "/";};
                            System.out.println(Memory);
                            label.setText(Memory);
                        }
                    });
                        break;
                    case ("2:0") :button0.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            Memory += "7";
                            System.out.println(Memory);
                            label.setText(Memory);
                        }
                    });
                        break;
                    case ("2:1") :button0.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            Memory += "8";
                            System.out.println(Memory);
                            label.setText(Memory);
                        }
                    });
                        break;
                    case ("2:2") :button0.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            Memory += "9";
                            System.out.println(Memory);
                            label.setText(Memory);
                        }
                    });
                        break;
                    case ("2:3") :button0.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            if(Memory.isEmpty()){Memory="";}else{Memory += "*";};
                            System.out.println(Memory);
                            label.setText(Memory);
                        }
                    });
                        break;
                    case ("3:0") :button0.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            Memory += "4";
                            System.out.println(Memory);
                            label.setText(Memory);
                        }
                    });
                        break;
                    case ("3:1") :button0.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            Memory += "5";
                            System.out.println(Memory);
                            label.setText(Memory);
                        }
                    });
                        break;
                    case ("3:2") :button0.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            Memory += "6";
                            System.out.println(Memory);
                            label.setText(Memory);
                        }
                    });
                        break;
                    case ("3:3") :button0.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            Memory += "-";
                            System.out.println(Memory);
                            label.setText(Memory);
                        }
                    });
                        break;
                    case ("4:0") :button0.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            Memory += "1";
                            System.out.println(Memory);
                            label.setText(Memory);
                        }
                    });
                        break;
                    case ("4:1") :button0.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            Memory += "2";
                            System.out.println(Memory);
                            label.setText(Memory);
                        }
                    });
                        break;
                    case ("4:2") :button0.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            Memory += "3";
                            System.out.println(Memory);
                            label.setText(Memory);
                        }
                    });
                        break;
                    case ("4:3") :button0.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            Memory += "+";
                            System.out.println(Memory);
                            label.setText(Memory);
                        }
                    });
                        break;
                    case ("5:0") :button0.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            Memory += "(";
                            System.out.println(Memory);
                            label.setText(Memory);
                        }
                    });
                        break;
                    case ("5:1") :button0.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            Memory += "0";
                            System.out.println(Memory);
                            label.setText(Memory);
                        }
                    });
                        break;
                    case ("5:2") :button0.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            Memory += ",";
                            System.out.println(Memory);
                            label.setText(Memory);
                        }
                    });
                        break;
                    case ("5:3") :button0.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            Expression exp = new ExpressionBuilder(Memory).build();
                            double result = exp.evaluate();
                            if(result- Math.round(result) >0 || result- Math.round(result)==0){
                                Memory = Long.toString(Math.round(result)) ;
                                label.setText(Memory);
                            }else{
                                Memory = Double.toString(result);
                                label.setText(Memory);
                            }
                        }
                    });
                        break;

                    default:
                }

                //framelayout
                frame.setLayout(null); // Use absolute positioning
                frame.add(button0);// Add button to the frame
                x+=frame.getWidth()/4;
            }y+=frame.getHeight()/9;
            x*=0;
        }
        // Make frame visible
        frame.setVisible(true);
    }
    }
