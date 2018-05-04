# Fill in the trick1 method here
def trick1(num):
    
    # Double num
    num2 = num*2
    # Add 6 to the answer
    num2 = num2+6
    # Divide the answer by 2
    num2 = num2/2
    # Subtract num from the answer
    num2 = num2-num
    # Return the final answer
    return num2


# Write your trick2 method here
def trick2(number):

    # 1. Multiply the number by 3
    number2 = number*3
    # 2. Add 45 to the answer
    number2 = number2+45

    # 3. Multiple the answer by 2
    number2 = number2*2

    # 4. Divide the answer by 6
    number2 = number2/6

    # 5. Subtract your original number from the answer
    number2 = number2-number

    return number2


inst1 = "Math Trick 1\n\
        1. Pick a number less than 10\n\
        2. Double the number\n\
        3. Add 6 to the answer\n\
        4. Divide the answer by 2\n\
        5. Subtract your original number from the answer\n"

print(inst1)


# Get input for the first math trick
num3 = input("Math Trick 1 Number")




# Call the trick1 method and print the result
print trick1(num3)



inst2 = "Math Trick 2\n\
        1. Pick any number\n\
        2. Multiply the number by 3\n\
        3. Add 45 to the answer\n\
        4. Multiple the answer by 2\n\
        5. Divide the answer by 6\n\
        6. Subtract your original number from the answer\n"

print(inst2)


# Get input for the second math trick
number3 = input("Math Tric 2 Number")

print trick2(number3)

# Call the trick2 method and print the result
