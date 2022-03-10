MIN_INPUT = 1
MAX_INPUT = 8

height = -1
# Prompt for height of pyramid
while height < 1 or height > 8:
    height = int(input("Height: "))

# Iterate through pyramid starting from the top
for i in range(height):
    space = height - i - 1;
    hashtag = i + 1;
    # Print: spaces, hashtag, space, hashtag
    print(" " * space + "#" * hashtag + "  " + "#" * hashtag);