############################################################
# Challenge 163: Probability Distribution of a 6-sided Die #
# Date: May 28, 2014 #
############################################################

from random import randint

t = "Rolls      1s    2s       3s      4s       5s      6s   "
print t
print "="*len(t)

for rolls in [10**i for i in range(1,7)]:
    count = [0]*6
    for roll in range(rolls):
        count[randint(0,5)] += 1

    p = [] # p[i] is the % of (i+1)s.
    for num in count:
        pct = num/rolls
        p.append("{:>6.2%}".format(pct))

    row = "{:<11d}".format(rolls)
    row += " ".join(p)
    print row
