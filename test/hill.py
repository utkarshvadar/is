import numpy as np

key = "GYBNQKURP"
msg  = "ACT"


x =  [(ord(i)-ord('A'))%26 for i in key]
msgx = [(ord(i)-ord('A'))%26 for i in msg]

mtx = np.array(x)

mtxk = np.resize(x,(3,3))

mtxm = np.resize(np.array(msgx),(3,1))

enc = mtxk.dot(mtxm)%26

dec= np.linalg.inv(mtxk).dot(enc)