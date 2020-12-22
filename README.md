This project is a little mini game I created.

When you start you are given three options, easy, medium or hard difficulty. If you pick easy you get 10 buttons ,
medium 15  and hard 20. (this will make sense much more later).

You will then be taken to the game screen. There you will notice a group of labels on the left side and a similiar group of labels on the right side.

Your goal is to get both group of labels looking the same (by changing the color of the  labels on the right side).

The way you can change the labels is with the buttons on the bottom. You will see if you click a button, it will change
the labels on the right side corressponding to what it says. So if the buttons says "numbers where the ten's digit is 6" 
then we will change all numbers that start with a 6. The label alternate colors between black and red. So if you click on a button
that changes a label it will turn to red. If you change it again it will become black.

Once you got the solution you can check your answer and see if you got it right and in how much time.

The way this program works is that the simulation class is responsible for generating all the statements that make the labels on the left
and is resposible for generating all the statements that do not contribute anything to the left label (in other words they are the 
wrong answer). We use multiplpe mathematical equation to come up with these statements. We then pass it to newJFrame where it displays it to us in visual form.


