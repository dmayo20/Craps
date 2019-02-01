INSTRUCTOR COMMENTS
===================

This is a great little Craps game, Derek, especially with
the graphical representation of those die--that's such a
nice touch! 

Some other comments:

1. You included a "play again" option as required by the 
   assignment but don't have any instructions available
   to the user. Why not?

2. The assignment also specified that a "default Y/N" option
   be used to make the game play flow a little more smoothly.
   As it is, I have to hit "y[Enter]" every time I want to
   roll the dice, which is more trouble than it should be.
   Take a look at how to implement a default Y/N--it's in 
   the handout--and use that in future assignments where it's
   appropriate.

3. You used Thread.sleep to provide a little suspense in the
   process of rolling. That was a nice touch!

4. In reading through your code you've got some rather 
   cryptic "flags" or status variables that might have made
   sense to you when you were writing this program. They 
   didn't make immediate sense to me (without some 
   investigation), and that'll probably be the case for you
   if you come back later on to look at this program.
    a. `roll` and `point` -- obvious. No issue there.
    b. `phase` ? What does `phase` refer to?
    c. `game = -1`? What is `game` code for?
   You should come up with better names for those variables,
   or consider restructuring your program so that you don't
   need them.

5. `while (true)`... is not a good loop. Obviously you're
   going to do things in the loop that will allow you to 
   break out later on, but it's far better to have those
   conditions expressed in the loop header so the reader 
   (me, you, other students) knows immediately what this 
   loop is about. Even a boolean variable called 
   `playAgain` used with with a `while (playAgain)` loop
   is better than just `while (true)`...

The program implements the rules of the game perfectly, of
course. There is just some detail work still that you can
do to make it even better!
   
SCORE: 50/50
