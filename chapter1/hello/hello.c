t// Author: Albert
// Says "hello"
#include <stdio.h>
#include <cs50.h>

int main(void)
{
    // Print hello and user inputted name in the terminal
    string name = get_string("What is your name?\n");
    printf("hello, %s\n", name);

}