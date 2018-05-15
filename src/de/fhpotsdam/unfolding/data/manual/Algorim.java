package de.fhpotsdam.unfolding.data.manual;
import processing.core.PApplet;
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.providers.OpenStreetMap;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.*;
import de.fhpotsdam.unfolding.marker.SimplePointMarker;
 
public class Algorim extends PApplet {
	private static final long serialVersionUID = 1L;
	UnfoldingMap map;

	public void setup() {
		size(800, 600, OPENGL);

		map = new UnfoldingMap(this, new OpenStreetMap.OpenStreetMapProvider());
		map.zoomAndPanTo(new Location(52.5f, 13.4f), 10);

		MapUtils.createDefaultEventDispatcher(this, map);
	}

	public void draw() {
		background(0);
		map.draw();
	
	}
 
  public Algorim(Location location) {
    super();
  }
 
  public void draw(PGraphics pg, float x, float y) {
    pg.pushStyle();
    pg.noStroke();
    pg.fill(200, 200, 0, 100);
    pg.ellipse(x, y, 40, 40);
    pg.fill(255, 100);
    pg.ellipse(x, y, 30, 30);
    pg.popStyle();
  }
}