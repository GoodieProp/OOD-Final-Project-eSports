# OOD-Final-Project-eSports

Hello there!

This project is about simulating an eSports Tournament. Even though the gaming functionality is not the best, you do have a fully functionality cafe.

To give a brief summary of this project, it consists of utilizing four design patterns. The design patterns I used was the observer, command, factory, and decorator. The observer pattern is used with a randomizer to simulate a count of people within the convention. The command, factory, and decorator work together to place orders such as what kind of games the user might want to play, or if the user wants to order a drink or a snack. The factory and decorator also work together to create admission bundles when first entering the 'tournament'.

## **Getting Started**

Once if you have cloned the repository and ran the program, you will be greeted with a welcome banner and options to choose from.

````
1. Input Barcode (xxx-xxx-xx)
2. Buy an Admission Ticket
3. Leave the Venue
````

From these options, you can either input a barcode, if you are a 'returning participant' or buy an admission ticket if you are a new participant. If you do decide to go with buying an admission ticket, you will be given options if you want to just buy a single ticket or upgrade to a bundle. Once you bought a ticket or entered your barcode, you will be in the front desk.

## **Venue Menu**

Here is where most of the magic happens. Once you have reached the Venue Menu, you will be presented with a list of options.

````
1. Buy a Game Slot
2. Play Selected Game
3. Go to Cafe
4. View Current Personal Data
5. View Current Members in Venue
6. Leave the Venue
````

Within the tournament, players have to buy a game slot from the Game bar, in which it will be placed in an ArrayList. When the user decides to play, it will be in the order of when it was purchased.

As for the Cafe, the user is presented with two options. The user can either selected a drink or snack, in which there will be more options for these as well.

You can also check out your personal data, which shows your barcode, game slots, the amount of vouchers you have. Below this, is the orders list you have done throughout your stay.

Lastly, you can view the amount of 'participants' in the venue. (It's randomized)
