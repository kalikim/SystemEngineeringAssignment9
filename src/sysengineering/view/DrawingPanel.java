package sysengineering.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;


import sysengineering.controller.DrawingController;
import sysengineering.model.DrawingModel;



public class DrawingPanel extends Panel {

private static final long serialVersionUID = 1L;
	
	private static DrawingPanel sharedInstance;
	
	
	public static DrawingPanel getSharedInstance(DrawingController _drawingController) {
		if(DrawingPanel.sharedInstance != null) {
			return DrawingPanel.sharedInstance;
		} else {
			DrawingPanel.sharedInstance = new DrawingPanel(_drawingController);
			return DrawingPanel.sharedInstance;
		}
	}
	

	private DrawingPanel(DrawingController _drawingController) {
		addMouseListener(_drawingController);
		addMouseMotionListener(_drawingController);
		setBackground(Color.DARK_GRAY);
		System.out.println("Panel created...");

		BorderLayout bl = new BorderLayout();

		bl.setVgap(1);
		this.setLayout(bl);
	}
	
	@Override
		public void paint(Graphics g) {
			// TODO Auto-generated method stub
			super.paint(g);
			
			DrawingModel.getSharedInstance().repaint(g, true, 1.0);
		}
}
