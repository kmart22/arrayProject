package hipster.view;

import array.controller.HipsterController;
import javax.swing.*;
import java.awt.Color;
public class HipsterPanel extends JPanel
{

	
		private SpringLayout baseLayout;
		private JComboBox dropDown;
		private JLabel infoLabel;
		private JButton myButton;
		private HipsterController baseController;
		
		public HipsterPanel(HipsterController baseController)
		{
			this.baseController = baseController;
			this.baseLayout = new SpringLayout();
			this.myButton = new JButton ("Click the button");
			this.infoLabel = new JLabel("Wow Words!");
			this.dropDown = new JComboBox(baseController.getWords());
			
			setupPanel();
			setupLayout();
			setupListeners();
		}
		
		private void setupPanel()
		{
			this.setBackground(Color.ORANGE);
			this.setLayout(baseLayout);
			this.add(dropDown);
			this.add(infoLabel);
			this.add(myButton);
		}
		private void setupLayout()
		{
			baseLayout.putConstraint(SpringLayout.NORTH, myButton, 68, SpringLayout.NORTH, this);
			baseLayout.putConstraint(SpringLayout.WEST, myButton, 135, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.WEST, dropDown, 0, SpringLayout.WEST, infoLabel);
			baseLayout.putConstraint(SpringLayout.SOUTH, dropDown, -6, SpringLayout.NORTH, myButton);
			baseLayout.putConstraint(SpringLayout.NORTH, infoLabel, 2, SpringLayout.SOUTH, myButton);
			baseLayout.putConstraint(SpringLayout.WEST, infoLabel, 10, SpringLayout.WEST, myButton);
			
		}
		
		private void setupListeners()
		{
			
		}
}
