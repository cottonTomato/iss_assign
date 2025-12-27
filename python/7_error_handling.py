# Error handling is used to mitigate runtime
# errors that might happen due to externeous
# conditions. This includes filesystem errors,
# network errors, os errors, etc. In python
# these errors are called Exceptions or Errors

# Python interpreter will "catch" any exception
# thrown in the try block. Except block is run
# in case the indicated Exception is caught.
try:
    x = int("abc")
except ValueError:
    print("Conversion failed")

# Else block in Try-except is run if try block
# does not throw any exceptions. Finally block
# is always run after the try block. It is to
# clean up after the Try block.
try:
    x = int("10")
except ValueError:
    print("Error")
else:
    print("Conversion successful")
finally:
    print("Done")


# Raise keyword is used to throw an Error
def withdraw(amount: int):
    if amount <= 0:
        raise ValueError("Amount must be positive")
    print("Withdrawal successful")


withdraw(-100)
