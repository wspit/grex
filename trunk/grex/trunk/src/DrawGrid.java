import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class DrawGrid extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int rows;
	private int columns;
	private int width;
	private int height;
//	private GridLayout layout;
	

	/**
	 * Constructor for DrawGrid
	 * @param n = Number of rows
	 * @param m = Number of columns
	 * @param width = width
	 * @param height = height
	 */
	public DrawGrid(int n, int m, int width, int height) {
		this.rows = n;
		this.columns = m;
		this.height = height;		
		this.width = width;
//		layout = new GridLayout(10,10);
//		setLayout(layout);
		
	}

	public Dimension getPreferredSize() {
		return new Dimension(width, height);
	}

	protected void paintComponent(Graphics g) {
		
		
		g.setColor(Color.black);
		int columnSize = 0;
		int rowSize = 0;

		int spaceBetweenColumns = getWidth() / columns;
		int spaceBetweenRows = getHeight() / rows;

		for (int row = 0; row < rows; row++) {
			g.drawLine(0, rowSize, getWidth(), rowSize);
			rowSize = spaceBetweenRows + rowSize;
		}
		g.drawLine(0, rowSize-1, getWidth()-1, rowSize-1);

		for (int column = 0; column < columns; column++) {
			g.drawLine(columnSize, 0, columnSize,getHeight());
			columnSize = spaceBetweenColumns + columnSize;
		}
		g.drawLine(columnSize-1, 0, getWidth()-1, columnSize-1 );
		
		
	}
	
	
			
	
	
	
	
	
	

}
