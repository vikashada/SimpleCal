package com.example.hp.simplecal;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements android.view.View.OnClickListener {

    TextView rdisp;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,div,mul,ad,sb,eq,dt,pie,sn,cs,tn,rt,ex,fact,ln;
    float []num = new float[20];
    char []op = new char[20];
    int numindx = -1;
    int opindx = -1;
    String displ="";
    final static float PI=(float) Math.PI;
    float plac=(float) 0.1;
    int datcheck = 0;
    int rc = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String fontpath="fonts/dispfont.ttf";
        rdisp = (TextView)findViewById(R.id.textView1);
        Typeface tf = Typeface.createFromAsset(getAssets(), fontpath);
        rdisp.setTypeface(tf);

        b0=(Button)findViewById(R.id.button0);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        div=(Button)findViewById(R.id.button11);
        mul=(Button)findViewById(R.id.button12);
        ad=(Button)findViewById(R.id.button13);
        sb=(Button)findViewById(R.id.button14);
        eq=(Button)findViewById(R.id.button15);
        dt=(Button)findViewById(R.id.button16);
        pie=(Button)findViewById(R.id.button17);
        sn=(Button)findViewById(R.id.button18);
        cs=(Button)findViewById(R.id.button19);
        tn=(Button)findViewById(R.id.button20);
        rt=(Button)findViewById(R.id.button23);
        ln=(Button)findViewById(R.id.button24);
        fact=(Button)findViewById(R.id.button25);
        ex=(Button)findViewById(R.id.button26);
        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        div.setOnClickListener(this);
        mul.setOnClickListener(this);
        ad.setOnClickListener(this);
        sb.setOnClickListener(this);
        eq.setOnClickListener(this);
        dt.setOnClickListener(this);
        pie.setOnClickListener(this);
        sn.setOnClickListener(this);
        cs.setOnClickListener(this);
        tn.setOnClickListener(this);
        rt.setOnClickListener(this);
        ln.setOnClickListener(this);
        fact.setOnClickListener(this);
        ex.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==b0)
        {
            if(rc == 1)
            {
                displ = "";
                rdisp.setText(displ);
                numindx--;
                rc = 0;
            }
            if(datcheck==1)
            {
                num[numindx]=num[numindx]*10+0;
            }
            else if(datcheck == 2)
            {
                num[numindx] = num[numindx] + plac*0;
                plac = (float) (plac * 0.1);
            }
            else
            {
                numindx++;
                num[numindx]=0;
                datcheck = 1;
            }
            displ=displ+'0';
            rdisp.setText(displ);
        }
        else if(v==b1)
        {
            if(rc == 1)
            {
                displ = "";
                rdisp.setText(displ);
                numindx--;
                rc = 0;
            }
            if(datcheck==1)
            {
                num[numindx]=num[numindx]*10+1;
            }
            else if(datcheck == 2)
            {
                num[numindx] = num[numindx] + plac*1;
                plac = (float) (plac * 0.1);
            }
            else
            {
                numindx++;
                num[numindx]=1;
                datcheck = 1;
            }
            displ=displ+'1';
            rdisp.setText(displ);
            System.out.println(num[numindx]);
        }
        else if(v==b2)
        {
            if(rc == 1)
            {
                displ = "";
                rdisp.setText(displ);
                numindx--;
                rc = 0;
            }
            if(datcheck==1)
            {
                num[numindx]=num[numindx]*10+2;
            }
            else if(datcheck == 2)
            {
                num[numindx] = num[numindx] + plac*2;
                plac = (float) (plac * 0.1);
            }
            else
            {
                numindx++;
                num[numindx]=2;
                datcheck = 1;
            }
            displ=displ+'2';
            rdisp.setText(displ);
        }
        else if(v==b3)
        {
            if(rc == 1)
            {
                displ = "";
                rdisp.setText(displ);
                numindx--;
                rc = 0;
            }
            if(datcheck==1)
            {
                num[numindx]=num[numindx]*10+3;
            }
            else if(datcheck == 2)
            {
                num[numindx] = num[numindx] + plac*3;
                plac = (float) (plac * 0.1);
            }
            else
            {
                numindx++;
                num[numindx]=3;
                datcheck = 1;
            }
            displ=displ+'3';
            rdisp.setText(displ);
        }
        else if(v==b4)
        {
            if(rc == 1)
            {
                displ = "";
                rdisp.setText(displ);
                numindx--;
                rc = 0;
            }
            if(datcheck==1)
            {
                num[numindx]=num[numindx]*10+4;
            }
            else if(datcheck == 2)
            {
                num[numindx] = num[numindx] + plac*4;
                plac = (float) (plac * 0.1);
            }
            else
            {
                numindx++;
                num[numindx]=4;
                datcheck = 1;
            }
            displ=displ+'4';
            rdisp.setText(displ);
        }
        else if(v==b5)
        {
            if(rc == 1)
            {
                displ = "";
                rdisp.setText(displ);
                numindx--;
                rc = 0;
            }
            if(datcheck==1)
            {
                num[numindx]=num[numindx]*10+5;
            }
            else if(datcheck == 2)
            {
                num[numindx] = num[numindx] + plac*5;
                plac = (float) (plac * 0.1);
            }
            else
            {
                numindx++;
                num[numindx]=5;
                datcheck = 1;
            }
            displ=displ+'5';
            rdisp.setText(displ);
        }
        else if(v==b6)
        {
            if(rc == 1)
            {
                displ = "";
                rdisp.setText(displ);
                numindx--;
                rc = 0;
            }
            if(datcheck==1)
            {
                num[numindx]=num[numindx]*10+6;
            }
            else if(datcheck == 2)
            {
                num[numindx] = num[numindx] + plac*6;
                plac = (float) (plac * 0.1);
            }
            else
            {
                numindx++;
                num[numindx]=6;
                datcheck = 1;
            }
            displ=displ+'6';
            rdisp.setText(displ);
        }
        else if(v==b7)
        {
            if(rc == 1)
            {
                displ = "";
                rdisp.setText(displ);
                numindx--;
                rc = 0;
            }
            if(datcheck==1)
            {
                num[numindx]=num[numindx]*10+7;
            }
            else if(datcheck == 2)
            {
                num[numindx] = num[numindx] + plac*7;
                plac = (float) (plac * 0.1);
            }
            else
            {
                numindx++;
                num[numindx]=7;
                datcheck = 1;
            }
            displ=displ+'7';
            rdisp.setText(displ);
        }
        else if(v==b8)
        {
            if(rc == 1)
            {
                displ = "";
                rdisp.setText(displ);
                numindx--;
                rc = 0;
            }
            if(datcheck==1)
            {
                num[numindx]=num[numindx]*10+8;
            }
            else if(datcheck == 2)
            {
                num[numindx] = num[numindx] + plac*8;
                plac = (float) (plac * 0.1);
            }
            else
            {
                numindx++;
                num[numindx]=8;
                datcheck = 1;
            }
            displ=displ+'8';
            rdisp.setText(displ);
        }
        else if(v==b9)
        {
            if(rc == 1)
            {
                displ = "";
                rdisp.setText(displ);
                numindx--;
                rc = 0;
            }
            if(datcheck==1)
            {
                num[numindx]=num[numindx]*10+9;
            }
            else if(datcheck == 2)
            {
                num[numindx] = num[numindx] + plac*9;
                plac = (float) (plac * 0.1);
            }
            else
            {
                numindx++;
                num[numindx]=9;
                datcheck = 1;
            }
            displ=displ+'9';
            rdisp.setText(displ);
        }
        else if(v==div)
        {
            datcheck = 0;
            opindx++;
            op[opindx]='/';
            displ=displ+'\u00F7';
            rdisp.setText(displ);
            plac = (float) 0.1;
            rc = 0;
        }
        else if(v==mul)
        {
            datcheck = 0;
            opindx++;
            op[opindx]='x';
            displ=displ+'X';
            rdisp.setText(displ);
            plac = (float) 0.1;
            rc = 0;
        }
        else if(v==ad)
        {
            datcheck = 0;
            opindx++;
            op[opindx]='+';
            displ=displ+'+';
            rdisp.setText(displ);
            plac = (float) 0.1;
            rc = 0;
        }
        else if(v==sb)
        {
            datcheck = 0;
            opindx++;
            op[opindx]='-';
            displ=displ+'-';
            rdisp.setText(displ);
            plac = (float) 0.1;
            rc = 0;
        }
        else if(v==dt)
        {
            if(datcheck != 2 && datcheck != 0)
            {
                datcheck = 2;
                displ = displ+'.';
                rdisp.setText(displ);
            }
        }
        else if(v==pie)
        {
            if(rc == 1)
            {
                displ = "";
                rdisp.setText(displ);
                numindx--;
                rc = 0;
            }
            numindx++;
            num[numindx]=PI;
            displ=displ+'\u03C0';
            rdisp.setText(displ);
        }
        else if(v==sn)
        {
            if(numindx == 0)
            {
                datcheck = 0;
                double val = num[0];
                val = Math.toRadians(val);
                val = Math.sin(val);
                if(val<0.000001)
                    val=0;
                else if(val>999999999)
                    val=(float)1/(float)0;
                displ=""+val;
                rdisp.setText(displ);
                numindx = 0;
                num[numindx] = (float) val;
                rc = 1;
                opindx = -1;
                plac = (float) 0.1;
            }
            else
            {
                datcheck = 0;
                rdisp.setText("Syntax Error");
                displ="";
                numindx = -1;
                opindx = -1;
                plac = (float) 0.1;
            }
        }
        else if(v==cs)
        {
            if(numindx == 0)
            {
                datcheck = 0;
                double val = num[0];
                val = Math.toRadians(val);
                val = (float) Math.cos(val);
                if(val<0.000001)
                    val=0;
                else if(val>999999999)
                    val=(float)1/(float)0;
                displ=""+val;
                rdisp.setText(displ);
                numindx = 0;
                num[numindx] =(float) val;
                rc = 1;
                opindx = -1;
                plac = (float) 0.1;
            }
            else
            {
                datcheck = 0;
                rdisp.setText("Syntax Error");
                displ="";
                numindx = -1;
                opindx = -1;
                plac = (float) 0.1;
            }
        }
        else if(v==tn)
        {
            if(numindx == 0)
            {
                datcheck = 0;
                double val = num[0];
                val = Math.toRadians(val);
                val = Math.tan(val);
                if(val<0.000001)
                    val=0;
                else if(val>999999999)
                    val=(float)1/(float)0;
                System.out.println(val);
                displ=""+val;
                rdisp.setText(displ);
                numindx = 0;
                num[numindx] = (float) val;
                rc = 1;
                opindx = -1;
                plac = (float) 0.1;
            }
            else
            {
                datcheck = 0;
                rdisp.setText("Syntax Error");
                displ="";
                numindx = -1;
                opindx = -1;
                plac = (float) 0.1;
            }
        }
        else if(v==rt)
        {
            if(numindx == 0)
            {
                datcheck = 0;
                double val = num[0];
                val = Math.sqrt(val);
                displ=""+val;
                rdisp.setText(displ);
                numindx = 0;
                num[numindx] = (float) val;
                rc = 1;
                opindx = -1;
                plac = (float) 0.1;
            }
            else
            {
                datcheck = 0;
                rdisp.setText("Syntax Error");
                displ="";
                numindx = -1;
                opindx = -1;
                plac = (float) 0.1;
            }
        }
        else if(v==ln)
        {
            if(numindx == 0)
            {
                datcheck = 0;
                double val = num[0];
                val = Math.log(val);
                displ=""+val;
                rdisp.setText(displ);
                numindx = 0;
                num[numindx] = (float) val;
                rc = 1;
                opindx = -1;
                plac = (float) 0.1;
            }
            else
            {
                datcheck = 0;
                rdisp.setText("Syntax Error");
                displ="";
                numindx = -1;
                opindx = -1;
                plac = (float) 0.1;
            }
        }
        else if(v==fact)
        {
            int fac = 1;
            for (int i = 1; i <= num[numindx]; i++) {
                fac *= i;
            }
            num[numindx] = fac;
            displ = displ + '!';
            rdisp.setText(displ);
        }
        else if(v==ex)
        {
            datcheck = 0;
            opindx++;
            op[opindx]='^';
            displ=displ+'^';
            rdisp.setText(displ);
            plac = (float) 0.1;
            rc = 0;
        }
        else if(v==eq)
        {
            if(opindx<numindx)
            {
                datcheck = 0;
                float answer = CoreCalc.calc(num, op, numindx, opindx);
                displ=""+answer;
                rdisp.setText(displ);
                numindx = 0;
                num[numindx] = answer;
                rc = 1;
                opindx = -1;
                plac = (float) 0.1;
            }
            else
            {
                datcheck = 0;
                rdisp.setText("Syntax Error");
                displ="";
                numindx = -1;
                opindx = -1;
                plac = (float) 0.1;
            }
        }
    }
}
