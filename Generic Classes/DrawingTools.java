package knowledge;

import java.awt.*;

/**
 * Created by mario on 1/12/2017.
 */
public class DrawingTools {

	/**
	 * Prints a string centered at (mouseX, mouseY).
	 *
	 * @param f   font, analyzed to center text exactly
	 * @param s   string to print
	 * @param x   mouseX-value of the center in pixels
	 * @param y   number of pixels from top of canvas where the *bottom* of the string should go
	 * @param art canvas to paint final string
	 */
	static void drawCenteredText(Font f, String s, int x, int y, Graphics2D art) {
		int len = art.getFontMetrics(f).stringWidth(s);
		art.drawString(s, x - len / 2, y);
	}

	/**
	 * Prints a string right-aligned to the point (mouseX, mouseY).
	 *
	 * @param f   font, analyzed to find leftmost pixel of printed text
	 * @param s   string to print
	 * @param x   mouseX-value of the string end in pixels
	 * @param y   number of pixels from top of canvas where the *bottom* of the string should go
	 * @param art canvas to paint final string
	 */
	static void drawRightText(Font f, String s, int x, int y, Graphics2D art) {
		int len = art.getFontMetrics(f).stringWidth(s);
		art.drawString(s, x - len - 10, y);
	}

	static void drawTextAround(Font f, String str, int x, int y, Graphics2D g2d) {
		int len = g2d.getFontMetrics(f).stringWidth(str);
		int height = g2d.getFontMetrics(f).getHeight();
		int new_x = x - len / 2;
		int new_y = y + height / 2;
		g2d.drawString(str, new_x, new_y);
	}
}
