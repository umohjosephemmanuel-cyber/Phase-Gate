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

