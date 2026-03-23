

## Properties
- int waitTime
- double rating
- double avgPrice
- double dist
- string hoursOpen




### Joptionane
- In the additions we added to the project, we used the class JOptionPane and the method showInputDialog to get user input.

### Getters & Setters 
- This allows us to get and set the private information that we encapsulated in the restaurant file.

### toString 
- formats the object we made from the user input.

### ArrayList
- A place to store the different restaurant objects.





### Random
- I used the random class to generate a random number between 0 and 61, then used the number given to print the restaurant corresponding to that number in the array.

### Scanner 
- The scanner scans all the restaurant data in the .txt file, and I changed the delimiter from a space to a comma so that each piece of data goes in the right field. (waitime, rating, avgPrice, distance, hoursOpen)

### While loop
- I used a while loop to scan each restaurant and put it into the array, and used the hasNext() method to keep looping the code until there's nothing left to scan in the .txt file.
