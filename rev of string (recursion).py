def rev(s):
    if s == "":
        return s
    else:
        return rev(s[1:]) + s[0]
string=input("Enter ur string:")
print(rev(string))
