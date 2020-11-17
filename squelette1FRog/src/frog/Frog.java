package frog;

import gameCommons.Game;
import gameCommons.IFrog;
import util.Case;
import util.Direction;

public class Frog implements IFrog {

	private Game game;
	private Case position;
	private Direction direction;

	public Frog(Case position, Direction direction){
		this.position = position;
		this.direction = direction;
	}
	public Frog(Game game){
		this.game = game;
	}

	@Override
	public Case getPosition() {
		return this.position;
	}

	@Override
	public Direction getDirection() {
		return this.direction;
	}

	public void move(Direction key) {
		if (this.position.absc == 0) {
			if (key.equals(Direction.down)) {
				return;
			}
		}
			if (key.equals(Direction.left)) {
				this.position = new Case(this.position.absc - 1,this.position.ord);
			}
			if (key.equals(Direction.right)) {
				this.position = new Case(this.position.absc + 1, this.position.ord);
			}
			if (key.equals(Direction.up)) {
				this.position = new Case(this.position.absc , this.position.ord + 1);
			}
			if (key.equals(Direction.down)) {
				this.position = new Case(this.position.absc ,this.position.ord - 1);
			}
		}
	}