# There are various keywords in python
# to control the flow of program

# If-else is used for conditional flow
age = 18
if age >= 18:
    print("Adult")
else:
    print("Minor")

# We can also add Elif block for more conditions
age = 18
if age >= 18:
    print("Adult")
elif age >= 13:
    print("Teenager")
else:
    print("Child")

# For block is used for looping or iterating
for i in range(3):
    print(i)

# While block is used for conditional looping
count = 0
while count < 3:
    print(count)
    count += 1

# Break and continue keybwork are used in for/while
# blocks to break out of loop or to skip to the next
# iteration respectively
for i in range(5):
    if i == 3:
        break
    if i == 1:
        continue
    print(i)

# In python we can add an optional else block at the
# end of a loop it will be executed in case the
# loop is never ended prematurly by a break statement
for i in range(3):
    print(i)
else:
    print("Loop finished normally")
