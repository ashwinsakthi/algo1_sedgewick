/**
 * Created by sky on 10/2/13.
 *
 * TODO: Check for balls colliding
 * Physics: What when where?
 * CS: Which object does the check?  too many checks?
 */

public class BouncingBalls
{
    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);
        Ball[] balls = new Ball[N];

        for (int i = 0; i < N; i++)
            balls[i] = new Ball();

        while (true)
        {
            StdDraw.clear();
            for (int i = 0; i < N; i++)
            {
                balls[i].move(0.5);
                balls[i].draw();
            }
            StdDraw.show();
        }
    }
}
