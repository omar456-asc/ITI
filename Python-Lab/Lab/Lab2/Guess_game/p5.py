import random


def play_game():
    # generate a random number between 1 and 100
    secret_number = random.randint(1, 100)

    # initialize variables
    tries = 10
    guessed_numbers = set()

    while tries > 0:
        # get user input
        user_input = input("Guess the secret number (1-100): ")

        # check if input is within range
        if not user_input.isdigit() or int(user_input) < 1 or int(user_input) > 100:
            print("Invalid input! Please enter a number between 1 and 100.")
            continue

        # check if number has been guessed before
        if int(user_input) in guessed_numbers:
            print("You have already guessed this number! Try a different one.")
            continue

        # add guessed number to set
        guessed_numbers.add(int(user_input))

        # compare user input with secret number
        if int(user_input) == secret_number:
            print("Congratulations! You guessed the secret number.")
            break
        elif int(user_input) < secret_number:
            print("Your guess is too low.")
        else:
            print("Your guess is too high.")

        tries -= 1
        print("Tries left:", tries)

    # ask user if they want to play again
    play_again = input("Do you want to play again? (y/n): ")
    if play_again.lower() == "y":
        play_game()
    else:
        print("Thanks for playing!")


play_game()

# ## output
# # Guess the secret number (1-100): 50
# # Your guess is too low.
# # Tries left: 9
# # Guess the secret number (1-100): 75
# # Your guess is too low.
# # Tries left: 8
# # Guess the secret number (1-100): 87
# # Your guess is too low.
# # Tries left: 7
# # Guess the secret number (1-100): 93
# # Your guess is too high.
# # Tries left: 6
# # Guess the secret number (1-100): 90
# # Your guess is too high.
# # Tries left: 5
# # Guess the secret number (1-100): 89
# # Your guess is too high.
# # Tries left: 4
# # Guess the secret number (1-100): 88
# # Congratulations! You guessed the secret number.
# # Do you want to play again? (y/n): n
# # Thanks for playing!
