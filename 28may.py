w=["car","demonstrate"]
for i in w[:]:
      if(len(i)>3):
            w.insert(0,i)
print(w)

word="shripad"
print(word[:1])
for i in range(10):
      for q in range(2,i):
       if i%q==0:
             print(i,i,"*",q)
       else:
             print("is prime number",i)
