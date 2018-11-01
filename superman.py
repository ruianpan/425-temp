import random
import string
import sys

fname = sys.argv[1]
nums = sys.argv[2]
num = int(nums)
n = 1024 ** 2  # 1 Mb of text
n = n*num

chars = ''.join([random.choice(string.letters) for i in range(n)])

with open(fname, 'w+') as f:
    f.write(chars)
