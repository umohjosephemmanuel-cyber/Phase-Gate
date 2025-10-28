# QUESTION:2


# EXAMPLE 1:

# Input: nums = [1,2,3,2]
# output: 4
# unique element = [1,3]
# The sum = 4


def get_unique_element(nums):
	unique_element = []
	for count in nums:
		nums.append(count++2)

	return unique_element
nums =  [1,2,3,2]
print(get_unique_element(nums))


		
	
	






#def get_sum_square_of_the(list):
    # sum_square = 0
    # for count in list:
       # sum_square = sum_square + (count ** 2)

    # return sum_square
#list = [2, 3, 4, 5, 7]
#print(get_sum_square_of_the(list))









# EXAMPLE 2:

# Input nums = [1,1,1,1,1].
# Output: 0.
# There are no unique elements.
# The sum is 0.















# QUESTION:3

# Example 1:
# Input: Enter 10 integers: [1,2,2,3,4,4,5,6,6,7]
# Output: The unique integers are: [1,2,3,4,5,6,7]















# Example 2:
# Input: Enter 10 integers: [9,8,7,7,6,5,5,4,3]
# Output: The unique integers are: [9,8,7,6,5,4,3]