int main(int argc, char const *argv[])
{
    int i, sum = 0;
    for (i = 1 ; i <= 10 ; i += 2)
    {
        if (i % 2 && i % 3)
            continue;
            sum+=i;
    }
    printf("%d", sum);
}
