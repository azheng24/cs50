# Implement a program that computes the approximate grade level needed to comprehend some text
import cs50

def main():
    # Read user input
    text = cs50.get_string("Text: ")
    # Calcualte and print index
    calc(text)
    letters = calc(text)[0]
    words = calc(text)[1]
    sentences = calc(text)[2]

    index = round(0.0588 * (letters / words * 100) - 0.296 * (sentences / words * 100) - 15.8);
    if index <= 0:
        print("Before Grade 1")
    elif index >= 16:
        print("Grade 16+")
    else:
        print("Grade " + str(index))

def calc(text):
    # LIST: letters, words, sentences
    arr = [0, 1, 0]
    for i in range(len(text)):
        if text[i].isalpha():
            arr[0] += 1
        elif text[i] == '.' or text[i] == '!' or text[i] == '?':
            arr[2] += 1
        elif text[i] == ' ':
            arr[1] += 1
    return arr

main()