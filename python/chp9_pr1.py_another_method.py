f=open('poems.txt')
t=f.read()   
if 'twinkle' in t :
        print("twinkle is prsent")
else:
        print("twinkle is not present")
f.close()