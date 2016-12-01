package hipster.view;

import javax.swing.JFrame;
import array.controller.HipsterController;
import java.awt.Dimension;

public class HipsterFrame extends JFrame
{
	private HipsterPanel appPanel;
	private HipsterController baseController;
	
	public HipsterFrame(HipsterController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new HipsterPanel(baseController);
		
		setupFrame();
	}
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(new Dimension(600, 400));
		this.setTitle("Hipster day 2016");
		this.setResizable(false);
		this.setVisible(true);
	}
}
