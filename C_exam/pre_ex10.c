int main(int argc, char const *argv[])
{
    int a = 120, b = 45;
    while (a != b)
    {
        if (a > b)
            a = a - b;
        else
            b = b - a;
    }
    printf("%d", a);
}
