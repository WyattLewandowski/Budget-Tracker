import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



    public class screen extends JFrame {

        private JTextField textField;
        private JButton button;
        private JComboBox<String> comboBox;
        private JPanel panel;
        private JLabel label;
        private JLabel label2;
        public screen() {
            //money setup
            money m = new money();
            // Frame settings
            setTitle("budgetTracker");
            setSize(400, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null); // Center on screen

            // create stuff
            textField = new JTextField(15);
            button = new JButton("Submit");
             label = new JLabel("        amount in budget:");
            label2 = new JLabel("amount in savings:");
             label.setLocation(100,100);

            comboBox = new JComboBox<>(new String[]{"deposit into budget", "deposit directly into savings", "withdraw from budget", "withdraw from savings"});
            panel = new JPanel();

            // Add stuff to panel
            panel.add(new JLabel("Enter Number:"));
            panel.add(textField);
            panel.add(button);
            panel.add(new JLabel("Select Option:"));
            panel.add(comboBox);
            panel.add(label);
            panel.add(label2);
            panel.setVisible(true);
            // Add panel to frame
            add(panel);

            // when the Button is clicked
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //get the input for the textbox
                    String inputText = textField.getText();

                    double inputNumber = Double.parseDouble(inputText);
                    //get the input for the dropdown menu
                    String selectedOption = (String) comboBox.getSelectedItem();
                    System.out.println("Text Field Input: " + inputText);



                    System.out.println("Selected Option: " + selectedOption);

                    if(selectedOption.equals("deposit into budget")){
                        m.addbudget(inputNumber);
                    }
                    else if(selectedOption.equals("deposit directly into savings")){
                        m.addSavings(inputNumber);
                    }
                    else if(selectedOption.equals("withdraw from budget")){
                        m.substractBudget(inputNumber);
                    }
                    else{
                        m.subtractSavings(inputNumber);
                    }
                    label.setText("        amount in budget: " + m.getBudget());
                    label2.setText("amount in savings :" + m.getSavings());


                }
            });
        }

        public static void main(String[] args) {



            SwingUtilities.invokeLater(() -> {
                new screen().setVisible(true);
            });
        }






    }


