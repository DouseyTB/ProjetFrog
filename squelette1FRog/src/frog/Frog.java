package frog;

import gameCommons.Game;
import gameCommons.IFrog;
import graphicalElements.Element;
import util.Case;
import util.Direction;

import java.awt.*;

public class Frog implements IFrog {

	private Game game;
	private Element element;
	private Direction direction;

	public Frog(Game game, int abs){
		this.game = game;
		this.element = new Element(abs,0, Color.green);
		this.direction = Direction.up;
	}

	@Override
	public Case getPosition() {

		return new Case(this.element.absc, this.element.ord);
	}

	@Override
	public Direction getDirection() {
		return this.direction;
	}

	public void move(Direction key) {
		this.direction = key;
		int abs = 0;
		int ord = 0;

		if (key == Direction.up) {
			abs = this.element.absc;
			ord = this.element.ord + 1;
		}
		else if (key == Direction.down && this.element.ord > 0) {
			abs = this.element.absc;
			ord = this.element.ord - 1;
		}
		else if (key == Direction.left && this.element.absc > 0) {
			abs = this.element.absc - 1;
			ord = this.element.ord;
		}
		else if (key == Direction.right && this.element.absc < game.width - 1){
			abs = this.element.absc + 1;
			ord = this.element.ord;
		}
		else {
			abs = this.element.absc;
			ord = this.element.ord;
		}

		Element frogx = new Element(abs, ord, Color.green);
		this.element = frogx;
	}
}