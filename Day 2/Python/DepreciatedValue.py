def get_years_of_depreciated_value(depreciated_value): 
	depreciated_value = [8]
	for count in depreciated_value:
		if count < years_of_depreciated_value:
			years_of_depreciated_value = count

	return years_of_depreciated_value
fixed_price = [50,000]
print(get_years_of_depreciated_value(depreciated_value))
