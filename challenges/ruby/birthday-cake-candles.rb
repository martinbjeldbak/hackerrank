#!/bin/ruby

require 'json'
require 'stringio'

#
# Complete the 'birthdayCakeCandles' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER_ARRAY candles as parameter.
#

def birthdayCakeCandles(candles)
    candle_count = {}

    candles.each do |candle|
        candle_count[candle] = 0 unless candle_count.key?(candle)
        candle_count[candle] += 1
    end

    max_size = 0
    candle_count.each_value do |count|
        max_size = count if count > max_size
    end

    max_size
end

fptr = File.open(ENV['OUTPUT_PATH'], 'w')

candles_count = gets.strip.to_i

candles = gets.rstrip.split.map(&:to_i)

result = birthdayCakeCandles candles

fptr.write result
fptr.write "\n"

fptr.close()
