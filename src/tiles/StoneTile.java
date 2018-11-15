package tiles;

import javafx.scene.image.Image;
import res.Images;

public class StoneTile extends Tile {

	public StoneTile(int id) {
		super(Images.stoneTile, id);
	}
	
	@Override
	public boolean isSolid() {return true;}

}
