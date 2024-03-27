def iswordpresent(sentence,word):
    s = sentence.split(" ")
    for i in s:
        if i == word:
            print("yes")
            return
    print("NO")

sentence = "hello, sumit sonar here"
word = "sunit"
iswordpresent(sentence,word)