int main()
{
    int x, y;
    int cnt = 0;
    for (int i = 6; i <= 30; i++)
    {
        x = 0;
        y = i / 2;
        for (int j = 1; j <= y; j++)
        {
            if (i % j == 0)
                x = x + j;
        }
        if (x == i)
        {
            cnt++;
        }
    }
    printf("%d", cnt);
}