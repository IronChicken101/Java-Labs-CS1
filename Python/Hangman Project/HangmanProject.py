import random

gallows = ["Rope"]
guesses = []
win = False
wrongGuess = 0

wordList = ["Apple","Peach","Pear","Mango","Tomato","Strawberry","Raspberry","Orange","Banana"]
randomWords = wordList[random.randint(0,len(wordList)-1)]

answer = []
for i in range(len(randomWords)):
    answer.append("_")

print "Letters Guessed:",guesses
print "Gallows has:",
for i in range(wrongGuess+1):
    print gallows[i]

for i in range(len(answer)):
    print answer[i],
print



def check(let):
    if len(guesses) < 1:
        return False
    for i in range (len(guesses)):
        if let == guesses[i]:
            return True
    return False

def checkWinner(win):
    finishCount = 0
    for i in range(len(answer)):
        if "_" == answer[i]:
            finishCount += 1
    if finishCount == 0:
        print "\nCongratulations you won, the word is", randomWords
        print "\nGame Over"
        return True
    return False

def printRes(let):
    if check(let) == True:
        print "\nSorry, you have already guessed this letter, please try again."
    if check(let) == False:
        guesses.append(let)
        if guess(let) == 0:
            print "Bad Guess!"
            if len(gallows) == 7:
                gallows.append(" ")
                return False
            if len(gallows) == 6:
                gallows.append("Right-Leg")
            if len(gallows) == 5:
                gallows.append("Left-Leg")
            if len(gallows) == 4:
                gallows.append("Right-Arm")
            if len(gallows) == 3:
                gallows.append("Left-Arm")
            if len(gallows) == 2:
                gallows.append("Body")
            if len(gallows) == 1:
                gallows.append("Head")        
        else:
            print "\nGood Guess!" 
    print "Letters Guessed: ",guesses
    print "Gallows: ",
    for i in range(len(gallows)):
        print gallows[i],
    print
    for i in range(len(answer)):
        print answer[i],
    print
    return True
    

def guess(let):
    correctGuess = 0  
    for i in range(len(answer)):
        if let == randomWords[i]:           
            answer[i] = let
            correctGuess += 1
    return correctGuess
           

let = raw_input("\nGuess a letter: ")
guess(let)
printRes(let)

while checkWinner(win) == False:
    let = raw_input("\nGuess a letter: ")
    guess(let)
    if len(gallows) < 7:
        printRes(let)
    if len(gallows) > 6:
        print "You Lose, the word was", randomWords
        print "\nGame Over"
        break
