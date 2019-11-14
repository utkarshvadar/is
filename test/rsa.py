import random
p = int(input())
q = int(input())
m = int(input())

def gcd(a,b):
	if b==0:
		return a
	else:
		return gcd(b,a%b)
def extended_Euclidean(a,b):
	n =a
	t1 = 0
	t2 =1
	while(b>0):
		q = a//b
		a,b = b,a%b
		t1, t2 =  t2, t1-q*t2
		
	if(t1<0):
		return t1+n
	else :
		return t1
	
n = p*q

phi = (p-1)*(q-1)
e= random.randrange(1, phi)

while(gcd(phi,e)!=1):
	e= random.randrange(1, phi)


d = extended_Euclidean(phi,e)
		

c = pow(m,e,n)
decm =pow(c,d,n)

print(c,decm)
		
#9864979441
#66587887

		
	

	