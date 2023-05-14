package ohm.softa.a09.model.Flyweight;

import javafx.scene.image.Image;
import ohm.softa.a09.resource.ResourceLoader;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class FighterFlyWeight {
	private final Image image;

	FighterFlyWeight(String path) {
		image = new ResourceLoader<>(Image::new)
			.loadResource(ClassLoader.getSystemClassLoader(), path);
	}

	public Image getImage(){
		return image;
	}

}
