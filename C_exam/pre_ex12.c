int main(int argc, char const *argv[])
{
    int i, j, sum = 0;
    for (i = 1; i < 10; i++)
    {
        for (j = 1; j < 10; j++)
        {
            if (j % 3 == 0)
                continue;
            if (i % 4 == 0)
                break;
            sum++;
        }
    }
    printf("%d", sum);
}
