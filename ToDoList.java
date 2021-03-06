package guiproject;

import java.awt.Checkbox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

 

public class ToDoList {
    public static void main(String[] args) {
    	GridBagConstraints gbc = new GridBagConstraints();
    	
    	//creating an array of check boxes
        ArrayList<Checkbox> aTask = new ArrayList<Checkbox>();
        
        //creating the frame
        JFrame frame = new JFrame("To-do list");
        
        //Creating the panel
        JPanel mainPanel = new JPanel();
		frame.add(mainPanel);
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
		
        //Splitting the panel
		JPanel leftPanel = new JPanel();
		mainPanel.add(leftPanel);
		leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));

		JPanel rightPanel = new JPanel();
		mainPanel.add(rightPanel);
		rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        
        SimpleDateFormat date = new SimpleDateFormat("dd. M yyyy");
		JLabel currentDateLabel = new JLabel(date.format(new Date()));
		rightPanel.add(currentDateLabel);

        JLabel toDoListLabel = new JLabel("Today's tasks:");
		leftPanel.add(toDoListLabel);

        JTextField aTaskTF = new JTextField();
        rightPanel.add(aTaskTF);
        
        JButton addTaskButton = new JButton("Add task");
        addTaskButton.setBackground(Color.red);
        addTaskButton.addActionListener(new ActionListener() {
            
            //creates a Checkbox with the text from the JTextField aTask 
        	@Override
            public void actionPerformed(ActionEvent arg0) {
                
                Checkbox checkBox = new Checkbox(aTaskTF.getText());
                leftPanel.add(checkBox);
                aTask.add(checkBox);
                frame.repaint();
                frame.pack();
                
                //clears the content in the JTextField 
                aTaskTF.addMouseListener(new MouseAdapter() {
                	  @Override
                	  public void mouseClicked(MouseEvent e) {
                		  aTaskTF.setText("");
                	  }
                	}
                  )
                ;
        
               
            }
        });
        //enters a button
        rightPanel.add(addTaskButton);
        
        frame.add(mainPanel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        // Setting the frame visibility to true
        frame.setVisible(true);

 

    }

 

}
 