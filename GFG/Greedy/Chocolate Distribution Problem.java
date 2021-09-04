public long findMinDiff (ArrayList<Long> l, long n, long student)
    {
    long fmin= Integer.MAX_VALUE;

        Collections.sort(l);
        if(student>n)
        return -1;
        else
        {
        long j=0;
        long i;
        for(i=student-1;i<n;i++)
        {
            long min= l.get((int)i)-l.get((int)j);
            fmin= Math.min(min,fmin);
            j++;
        }
        }
        return fmin;
    }