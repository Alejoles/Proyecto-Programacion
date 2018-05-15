import processing.core.PApplet;
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.providers.OpenStreetMap;
import de.fhpotsdam.unfolding.utils.MapUtils;
import acm.graphics.*;
import acm.program.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Hello Unfolding World.
 * 
 * Download the distribution with examples for many more examples and features.
 */
public class popo extends PApplet{
	private static final long serialVersionUID = 1L;
	UnfoldingMap map;

	public void setup() {
		size(800, 600, OPENGL);

		map = new UnfoldingMap(this, new OpenStreetMap.OpenStreetMapProvider());
		map.zoomAndPanTo(new Location(34.5f, 13.4f), 4);

		MapUtils.createDefaultEventDispatcher(this, map);
	}

	public void draw() {
		background(0);
		map.draw();
	}
public class Algorim extends GraphicsProgram{
	
	
}
}
