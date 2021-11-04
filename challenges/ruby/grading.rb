# Source: https://www.hackerrank.com/challenges/grading/problem
#

#!/bin/ruby

require 'json'
require 'stringio'

#
# Complete the 'gradingStudents' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts INTEGER_ARRAY grades as parameter.
#

def gradingStudents(grades)
    grades.map do |grade|
        if grade < 38
            grade
        else
            new_grade = grade
            1.upto(2) do |i|
                new_grade = grade + i if ((grade + i) % 5) == 0
            end
            new_grade
        end
    end
end

fptr = File.open(ENV['OUTPUT_PATH'], 'w')

grades_count = gets.strip.to_i

grades = Array.new(grades_count)

grades_count.times do |i|
    grades_item = gets.strip.to_i
    grades[i] = grades_item
end

result = gradingStudents grades

fptr.write result.join "\n"
fptr.write "\n"

fptr.close()
