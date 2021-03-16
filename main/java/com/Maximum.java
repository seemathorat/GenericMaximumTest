package com;
class Maximum{
        public int getIntegerMaximum(Integer x, Integer y, Integer z ) {
            if (x.compareTo(y) > 0 && x.compareTo(z) > 0)
                return x;
            else if (y.compareTo(z) > 0 && y.compareTo(x) > 0)
                return y;
            else
                return z;
        }
    }