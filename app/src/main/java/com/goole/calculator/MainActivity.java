package com.goole.calculator;


import android.app.LauncherActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import org.apache.commons.collections.CollectionUtils;

import java.math.BigDecimal;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView resultView;

    private List<String> str1 = new ArrayList<String>();
    private List<String> str2 = new ArrayList<String>();
    private List<String> str3 = new ArrayList<String>();
    private List<String> shortResult=new ArrayList<String>();
    StringBuffer stringBuffer1 = new StringBuffer();
    StringBuffer stringBuffer2 = new StringBuffer();
    StringBuffer stringBuffer3 = new StringBuffer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultView = (TextView) findViewById(R.id.resultView);
        findViewById(R.id.btn0).setOnClickListener(this);
        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);
        findViewById(R.id.btn4).setOnClickListener(this);
        findViewById(R.id.btn5).setOnClickListener(this);
        findViewById(R.id.btn6).setOnClickListener(this);
        findViewById(R.id.btn7).setOnClickListener(this);
        findViewById(R.id.btn8).setOnClickListener(this);
        findViewById(R.id.btn9).setOnClickListener(this);
        findViewById(R.id.btnAdd).setOnClickListener(this);
        findViewById(R.id.btnClear).setOnClickListener(this);
        findViewById(R.id.btnDiv).setOnClickListener(this);
        findViewById(R.id.btnSub).setOnClickListener(this);
        findViewById(R.id.btnX).setOnClickListener(this);
        findViewById(R.id.btnResult).setOnClickListener(this);
        findViewById(R.id.point).setOnClickListener(this);
        findViewById(R.id.mod).setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn0:

                if(CollectionUtils.isEmpty(str1)&&CollectionUtils.isEmpty(str2)&& CollectionUtils.isEmpty(str3)){
                   resultView.setText("");
                }
                resultView.append("0");
                if (CollectionUtils.isNotEmpty(str1) && CollectionUtils.isNotEmpty(str3)) {
                    str2.add("0");
                } else {
                    str1.add("0");
                }

                break;
            case R.id.btn1:
                if(CollectionUtils.isEmpty(str1)&&CollectionUtils.isEmpty(str2)&&CollectionUtils.isEmpty(str3)){
                    resultView.setText("");
                }
                resultView.append("1");
                // itemList1.add(new Item("1",Types.NUM));
                if (CollectionUtils.isNotEmpty(str1) && CollectionUtils.isNotEmpty(str3)) {
                    str2.add("1");
                } else {
                    str1.add("1");
                }

                break;
            case R.id.btn2:
                if(CollectionUtils.isEmpty(str1)&&CollectionUtils.isEmpty(str2)&&CollectionUtils.isEmpty(str3)){
                    resultView.setText("");
                }
                resultView.append("2");

                if (CollectionUtils.isNotEmpty(str1) && CollectionUtils.isNotEmpty(str3)) {
                    str2.add("2");
                } else {
                    str1.add("2");
                }

                break;
            case R.id.btn3:
                if(CollectionUtils.isEmpty(str1)&&CollectionUtils.isEmpty(str2)&&CollectionUtils.isEmpty(str3)){
                    resultView.setText("");
                }
                resultView.append("3");

                if (CollectionUtils.isNotEmpty(str1) && CollectionUtils.isNotEmpty(str3)) {
                    str2.add("3");
                } else {
                    str1.add("3");
                }

                break;
            case R.id.btn4:
                if(CollectionUtils.isEmpty(str1)&&CollectionUtils.isEmpty(str2)&&CollectionUtils.isEmpty(str3)){
                    resultView.setText("");
                }
                resultView.append("4");
                //itemList1.add(new Item("4",Types.NUM));
                if (CollectionUtils.isNotEmpty(str1) && CollectionUtils.isNotEmpty(str3)) {
                    str2.add("4");
                } else {
                    str1.add("4");
                }

                break;
            case R.id.btn5:
                if(CollectionUtils.isEmpty(str1)&&CollectionUtils.isEmpty(str2)&&CollectionUtils.isEmpty(str3)){
                    resultView.setText("");
                }
                resultView.append("5");
                //itemList1.add(new Item("5",Types.NUM));
                if (CollectionUtils.isNotEmpty(str1) && CollectionUtils.isNotEmpty(str3)) {
                    str2.add("5");
                } else {
                    str1.add("5");
                }

                break;
            case R.id.btn6:
                if(CollectionUtils.isEmpty(str1)&&CollectionUtils.isEmpty(str2)&&CollectionUtils.isEmpty(str3)){
                    resultView.setText("");
                }
                resultView.append("6");
                // itemList1.add(new Item("6",Types.NUM));
                if (CollectionUtils.isNotEmpty(str1) && CollectionUtils.isNotEmpty(str3)) {
                    str2.add("6");
                } else {
                    str1.add("6");
                }

                break;
            case R.id.btn7:
                if(CollectionUtils.isEmpty(str1)&&CollectionUtils.isEmpty(str2)&&CollectionUtils.isEmpty(str3)){
                    resultView.setText("");
                }
                resultView.append("7");
                // itemList1.add(new Item("7",Types.NUM));
                if (CollectionUtils.isNotEmpty(str1) && CollectionUtils.isNotEmpty(str3)) {
                    str2.add("7");
                } else {
                    str1.add("7");
                }

                break;
            case R.id.btn8:
                if(CollectionUtils.isEmpty(str1)&&CollectionUtils.isEmpty(str2)&&CollectionUtils.isEmpty(str3)){
                    resultView.setText("");
                }
                resultView.append("8");
                if (CollectionUtils.isNotEmpty(str1) && CollectionUtils.isNotEmpty(str3)) {
                    str2.add("8");
                } else {
                    str1.add("8");
                }

                break;
            case R.id.btn9:
                if(CollectionUtils.isEmpty(str1)&&CollectionUtils.isEmpty(str2)&&CollectionUtils.isEmpty(str3)){
                    resultView.setText("");
                }
                resultView.append("9");

                if (CollectionUtils.isNotEmpty(str1) && CollectionUtils.isNotEmpty(str3)) {
                    str2.add("9");
                } else {
                    str1.add("9");
                }
                break;
            case R.id.point:
                if(CollectionUtils.isEmpty(str1)&&CollectionUtils.isEmpty(str2)&&CollectionUtils.isEmpty(str3)){
                    resultView.setText("");
                }
                resultView.append(".");

                if (CollectionUtils.isNotEmpty(str1) && CollectionUtils.isNotEmpty(str3)) {
                    str2.add(".");
                } else {
                    str1.add(".");
                }
                break;
            case R.id.btnAdd:
                //itemList2.add(new Item("+",Types.ADD));
                resultView.setText("");
                str3.add("+");
                compute(Types.ADD);
                break;
            case R.id.btnSub:
                resultView.setText("");
                str3.add("-");
                compute(Types.SUB);
                break;
            case R.id.mod:
                resultView.setText("");
                str3.add("%");
                compute(Types.MODD);
                break;
            case R.id.btnX:
                resultView.setText("");
                str3.add("X");
                compute(Types.X);
                break;
            case R.id.btnDiv:
                resultView.setText("");
                str3.add("/");
                compute(Types.DIV);
                break;
            case R.id.btnClear:
                resultView.setText("");
                str1.clear();
                str2.clear();
                str3.clear();
                shortResult.clear();
                break;
            case R.id.btnResult:
                compute(Types.RESULT);
                break;
        }
    }

    public void compute(int type) {

        switch (type) {
            case Types.ADD:
                if (CollectionUtils.isNotEmpty(str1) && CollectionUtils.isNotEmpty(str2)) {
                    StringBuffer a = new StringBuffer();
                    StringBuffer b=new StringBuffer();
                    for (String demo : str1) {
                        a.append(demo);
                    }
                    for (String demo : str2) {
                        b.append(demo);
                    }
                    Double a1 = Double.valueOf(a.toString());
                    Double a2 = Double.valueOf(b.toString());
                    resultView.setText(String.valueOf(a1+a2));
                    if(CollectionUtils.isEmpty(shortResult)){
                        shortResult.add(String.valueOf(a1+a2));
                    }else{
                        shortResult.clear();
                        shortResult.add(String.valueOf(a1+a2));
                    }
                    str1.clear();
                    str2.clear();
                    str3.clear();
                }else if(CollectionUtils.isNotEmpty(shortResult)&&CollectionUtils.isNotEmpty(str3)&&CollectionUtils.isNotEmpty(str1)){
                    Double shortrs=Double.valueOf(shortResult.get(0));
                    StringBuffer a = new StringBuffer();
                    for (String demo : str1) {
                        a.append(demo);
                    }
                    Double a1 = Double.valueOf(a.toString());
                    Double resultof=a1+shortrs;
                    resultView.setText(String.valueOf(resultof));
                    shortResult.clear();
                    shortResult.add(String.valueOf(resultof));

                }else{
                  resultView.setText("");
                }
                    break;
                    case Types.SUB:
                        if (CollectionUtils.isNotEmpty(str1) && CollectionUtils.isNotEmpty(str2)) {
                            StringBuffer a = new StringBuffer();
                            StringBuffer b=new StringBuffer();
                            for (String demo : str1) {
                                a.append(demo);
                            }
                            for (String demo : str2) {
                                b.append(demo);
                            }
                            Double a1 = Double.valueOf(a.toString());
                            Double a2 = Double.valueOf(b.toString());
                            resultView.setText(String.valueOf(a1-a2));
                            str1.clear();
                            str2.clear();
                            str3.clear();
                        }else{
                            resultView.setText("");
                        }
                        break;
                    case Types.X:
                        if (CollectionUtils.isNotEmpty(str1) && CollectionUtils.isNotEmpty(str2)) {
                            StringBuffer a = new StringBuffer();
                            StringBuffer b=new StringBuffer();
                            for (String demo : str1) {
                                a.append(demo);
                            }
                            for (String demo : str2) {
                                b.append(demo);
                            }
                            Double a1 = Double.valueOf(a.toString());
                            Double a2 = Double.valueOf(b.toString());
                            resultView.setText(String.valueOf(a1*a2));
                            str1.clear();
                            str2.clear();
                            str3.clear();
                        }else{
                            resultView.setText("");
                        }
                        break;
                    case Types.DIV:
                        if (CollectionUtils.isNotEmpty(str1) && CollectionUtils.isNotEmpty(str2)) {
                            StringBuffer a = new StringBuffer();
                            StringBuffer b=new StringBuffer();
                            for (String demo : str1) {
                                a.append(demo);
                            }
                            for (String demo : str2) {
                                b.append(demo);
                            }
                            Double a1 = Double.valueOf(a.toString());
                            Double a2 = Double.valueOf(b.toString());
                            resultView.setText(String.valueOf(a1/a2));
                            str1.clear();
                            str2.clear();
                            str3.clear();
                        }else{
                            resultView.setText("");
                        }
                        break;
                    case Types.MODD:
                        if (CollectionUtils.isNotEmpty(str1) && CollectionUtils.isNotEmpty(str2)) {
                            StringBuffer a = new StringBuffer();
                            StringBuffer b=new StringBuffer();
                            for (String demo : str1) {
                                a.append(demo);
                            }
                            for (String demo : str2) {
                                b.append(demo);
                            }
                            Double a1 = Double.valueOf(a.toString());
                            Double a2 = Double.valueOf(b.toString());
                            resultView.setText(String.valueOf(a1%a2));
                            str1.clear();
                            str2.clear();
                            str3.clear();
                        }else{
                            resultView.setText("");
                        }
                        break;
                   case Types.RESULT:
                       if (CollectionUtils.isNotEmpty(str1) && CollectionUtils.isNotEmpty(str2)&&CollectionUtils.isNotEmpty(str3)) {
                           StringBuffer a = new StringBuffer();
                           StringBuffer b=new StringBuffer();
                           String operate=str3.get(0);
                           for (String demo : str1) {
                               a.append(demo);
                           }
                           for (String demo : str2) {
                               b.append(demo);
                           }
                           Double a1 = Double.valueOf(a.toString());
                           Double a2 = Double.valueOf(b.toString());
                           if(operate.equals("+")){
                           resultView.setText(String.valueOf(a1+a2));}
                           else if(operate.equals("-")){
                               resultView.setText(String.valueOf(a1-a2));
                           }
                           else if(operate.equals("X")){
                               resultView.setText(String.valueOf(a1*a2));
                           }
                           else if(operate.equals("/")){
                               resultView.setText(String.valueOf(a1/a2));
                           }
                           else if(operate.equals("%")){
                               resultView.setText(String.valueOf((int)(5%2)));
                           }
                           str1.clear();
                           str2.clear();
                           str3.clear();
                       }else{
                           resultView.setText("");
                       }
                    break;
                }
        }
    }


