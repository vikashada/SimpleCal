package com.example.hp.simplecal;

/**
 * Created by hp on 15-08-2015.
 */
public class CoreCalc {
    public static float calc(float []num, char []op, int numindx, int opindx)
    {
        while(opindx != -1)
        {
            //Exponent
            for(int i=0;i<=opindx;i++)
            {
                if(op[i]=='^')
                {
                    num[i]=(float)Math.pow(num[i],num[i+1]);
                    for(int k=i+1;k<numindx;k++)
                    {
                        num[k]=num[k+1];
                    }
                    numindx--;
                    for(int j=i;j<opindx;j++)
                    {
                        op[j]=op[j+1];
                    }
                    i=0;
                    opindx--;
                }
            }

            //Division
            for(int i=0;i<=opindx;i++)
            {
                if(op[i]=='/')
                {
                    num[i]=num[i]/num[i+1];
                    for(int k=i+1;k<numindx;k++)
                    {
                        num[k]=num[k+1];
                    }
                    numindx--;
                    for(int j=i;j<opindx;j++)
                    {
                        op[j]=op[j+1];
                    }
                    i=0;
                    opindx--;
                }
            }

            //Multiplication
            for(int i=0;i<=opindx;i++)
            {
                if(op[i]=='x')
                {
                    num[i]=num[i]*num[i+1];
                    for(int k=i+1;k<numindx;k++)
                    {
                        num[k]=num[k+1];
                    }
                    numindx--;
                    for(int j=i;j<opindx;j++)
                    {
                        op[j]=op[j+1];
                    }
                    i=0;
                    opindx--;
                }
            }

            //Addition
            for(int i=0;i<=opindx;i++)
            {
                if(op[i]=='+')
                {
                    num[i]=num[i]+num[i+1];
                    for(int k=i+1;k<numindx;k++)
                    {
                        num[k]=num[k+1];
                    }
                    numindx--;
                    for(int j=i;j<opindx;j++)
                    {
                        op[j]=op[j+1];
                    }
                    i=0;
                    opindx--;
                }
            }

            //Subtraction
            for(int i=0;i<=opindx;i++)
            {
                if(op[i]=='-')
                {
                    num[i]=num[i]-num[i+1];
                    for(int k=i+1;k<numindx;k++)
                    {
                        num[k]=num[k+1];
                    }
                    numindx--;
                    for(int j=i;j<opindx;j++)
                    {
                        op[j]=op[j+1];
                    }
                    i=0;
                    opindx--;
                }
            }
        }
        return num[0];
}
}
