# https://www.hackerrank.com/challenges/extra-long-factorials/problem?isFullScreen=true
#!/bin/ruby

require 'json'
require 'stringio'

#
# Complete the 'extraLongFactorials' function below.
#
# The function accepts INTEGER n as parameter.
#

def extraLongFactorials(n)
    puts(1.upto(n).reduce { |sum, i| sum * i })
end

n = gets.strip.to_i

extraLongFactorials n
