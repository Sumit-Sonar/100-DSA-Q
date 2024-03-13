def is_palindrome(num):
    num = str(num)
    if num == num[::-1]:
        print(num,"is palindrome")
    else:
        print(num,"is not palindrome")

num = 12345321
is_palindrome(num)