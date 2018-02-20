public class CONSTANT{
	final int SCREEN_X = 1920; //Screen x-Size
	final int SCREEN_Y = 1080; //Screen y-Size
	final int IMG_HEIGHT = 120;  //Height of aliens
	final int IMG_WIDTH = 120;  //Width of aliens
	final int STARTING_Y = 90; //Starting height of aliens
	final int EXPLOSION_INCREMENT = 6; //Increment by which the scaling of the explosion is changed: Higher -> faster
	final int MARGIN = 60; //Gap between each alien when spawning
	final int Y_MARGIN = 120; //Distance the aliens move down at the side of the screen
	final int PLAYER_X = 150; //Width of player
	final int PLAYER_Y = 120; //Height of player
	final int BULLET_X = 10; //Width of bullet
	final int BULLET_Y = 20; //Height of bullet
	final int NUM_OF_ALIENS = 100; //Number of aliens to spawn at the start of the game
	final int ALIEN_START_VEL = 2; //How fast the aliens move
	final int DEF_BULLET_SPEED = 8; //How fast a normal bullet moves
	final int BULLET_LIMIT = 8; //Max number of bullets to have at one time
	final int POWERUP_RARITY = 15; //Each powerUp has a 1 in (powerup_rarity) chance to spawn. No lower than number of powerUps (3). 
	final int DEF_BOMB_SPEED = 1; //How fast the alien bombs move by default.
	final int BOMB_WIDTH = 20; //The width of the bomb
	final int BOMB_HEIGHT = 50; //The height of the bomb
	final int SHIELD_X_OFFSET = 85; //x-distance between each of the shield parts.
	final int SHIELD_Y_OFFSET = 60; //y-distance between each of the shield parts.
	final int SHIELD_WIDTH = 170; //Total width of the shield.
	final int NEW_SHIELD = 0;  //Use when creating new shield so that shield class knows the object being created is the primary shield.
	final int BOMB_LIMIT = 5; //Max number of bombs on the screen at a time.
	final int BOMB_FREQUENCY = 1000; //Higher number => lower frequency.
	final int SHIELD_X = 180; //Starting x-position of the shields.
	final int SHIELD_Y = 700; //Starting y-position of the shields.
	final int SHIELD_MARGIN = 180; //Gap between each shield.
	final int SHIELD_COUNT = 5; //Number of shields.
	final int SHIP_EXPLOSION_SCALE = 110; //Relative scaling of the ship exploding in comparison to the alien explosion.
	final int SHIP_EXPLOSION_INC = 120; //Affects scaling of the explode animation, higher will result in a longer lasting and bigger explosion.
	
}