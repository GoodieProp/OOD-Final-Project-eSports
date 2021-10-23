# OOD-Final-Project-eSports

To run, import to eclipse and import JUnit. Unless you want to remove the @Test throughout the code.

You must run the MainDrive.java to run the program. After this you will be greeting with the Front Desk asking you if you want to input a barcode or buy an admission ticket, or an admission bundle. If you choose the barcode, it just has to be anything other than 0. If you choose to buy an admission you will be greeted with a normal ticket or with bundles. The bundles use a decorator design pattern as well to add extra vouchers. If you decide to choose a bundle you will have vouchers which you will be able to use for drinks, games, or snacks.

After passing through the front desk, you will be greeted by the eSportsMenu which will ask you

    Buy a Game Slot
    Play Game
    Go to the Cafe
    View Current Personal Data
    View Current People in Venue
    Leave the venue

If you choose to buy a game slot, you will be given the options to play a game of FPS or Battle Royale. For simplicity it only tells you if you won or not. This uses command and factory pattern. If you choose view current personal data, you will be given a display of your barcode, your current games in slot, and the amount of vouchers you have. If you choose the view current people in venue, it will display a number of "people". Everytime you click choose this option, it will randomly add or subtract "people". This uses the observer design pattern

If you choose "Go to the Cafe", you will be given options to either choose drinks or snacks. If you have a voucher, it will use that instead of money". This Cafe utiilizes command, factory, and decorator pattern.
