# Functions are used to write pieces of code
# that can be called and evaluated later.
# Functions can take inputs and return output.
# Functions can also access variables outside
# their local scope but such practice leads to
# code that is harder to manage.

# Function that takes a name as String input
# and prints it to the console
def greet(name: str):
    print(f"Hello {name}")


# greet can later be called with different
# inputs
greet("Abhinav")
greet("Drishti")


# Functions can return output with return
# keyword
def add(a: int, b: int):
    return a + b


# Here the returned value is stored in the
# result variable
result = add(3, 4)


# args and kwargs are used to take variable
# number of inputs. kwargs take input in key
# value pair.
def demo(*args: int, **kwargs: str | int):
    print(args)
    print(kwargs)


demo(1, 2, 3, name="Abhinav", age=21)
