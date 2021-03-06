class AlienStream {
  ArrayList<Alien> alienStream;
  Alien currentAlien;
  AlienStream() {
    alienStream = new ArrayList<Alien>();
  }

  //Generates aliens in a snake pattern so they appear to have been generated in a single stream.
  void initStream(int numOfAliens) {
    int alienVel = ALIEN_START_VEL;
    int yStart = STARTING_Y;
    for (int index = 0, xMul = 0; index <= numOfAliens; index++, xMul++) {
      if (xMul * (IMG_WIDTH + MARGIN) >= SCREEN_X) {
        xMul = 0;
        yStart -= (IMG_HEIGHT + Y_MARGIN);
        alienVel = -alienVel;
      }
      alienStream.add(new Alien((xMul * (IMG_WIDTH + MARGIN)), yStart, (int)random(0, 2), alienVel));
    }
  }

  //Draws the array of aliens.
  void drawAliens() {
    for (int index = 0; index < alienStream.size(); index++)
      alienStream.get(index).draw();
  }

  //Moves the array of aliens and deletes ones that have been hit.
  //Checks for hits too.
  void moveAliens(BulletStream bulletStream) {
    for (int index = 0; index < alienStream.size(); index++) {
      currentAlien = alienStream.get(index);
      if (!currentAlien.exploding || !currentAlien.exploded) {
        if (bulletStream.hitAlien(currentAlien)){
          currentAlien.explode();
          bulletStream.powerUp();
        }
        alienStream.get(index).move();
      } else if (currentAlien.exploded) {
        alienStream.remove(index--);
      }
    }
  }
}