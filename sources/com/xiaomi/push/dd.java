package com.xiaomi.push;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
class dd {

    /* renamed from: a, reason: collision with root package name */
    private static String f45375a = "/MiPushLog";

    /* renamed from: a, reason: collision with other field name */
    private int f234a;

    /* renamed from: a, reason: collision with other field name */
    private boolean f237a;

    /* renamed from: b, reason: collision with other field name */
    private String f238b;

    /* renamed from: c, reason: collision with root package name */
    private String f45377c;

    /* renamed from: a, reason: collision with other field name */
    @SuppressLint({"SimpleDateFormat"})
    private final SimpleDateFormat f235a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /* renamed from: b, reason: collision with root package name */
    private int f45376b = 2097152;

    /* renamed from: a, reason: collision with other field name */
    private ArrayList<File> f236a = new ArrayList<>();

    /* renamed from: a, reason: collision with other method in class */
    public dd m5816a(File file) {
        if (file.exists()) {
            this.f236a.add(file);
        }
        return this;
    }

    public dd a(Date date, Date date2) {
        String format;
        if (date.after(date2)) {
            this.f238b = this.f235a.format(date2);
            format = this.f235a.format(date);
        } else {
            this.f238b = this.f235a.format(date);
            format = this.f235a.format(date2);
        }
        this.f45377c = format;
        return this;
    }

    public File a(Context context, Date date, Date date2, File file) {
        File file2;
        File file3;
        if ("com.xiaomi.xmsf".equalsIgnoreCase(context.getPackageName())) {
            file2 = new File(context.getExternalFilesDir(null), com.xiaomi.push.service.bk.N);
            if (!file2.exists()) {
                file2 = new File(context.getFilesDir(), com.xiaomi.push.service.bk.N);
            }
            if (!file2.exists()) {
                file2 = context.getFilesDir();
            }
            m5816a(new File(file2, "xmsf.log.1"));
            file3 = new File(file2, "xmsf.log");
        } else {
            file2 = new File(context.getExternalFilesDir(null) + f45375a);
            m5816a(new File(file2, "log0.txt"));
            file3 = new File(file2, "log1.txt");
        }
        m5816a(file3);
        if (!file2.isDirectory()) {
            return null;
        }
        File file4 = new File(file, date.getTime() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + date2.getTime() + ".zip");
        if (file4.exists()) {
            return null;
        }
        a(date, date2);
        long currentTimeMillis = System.currentTimeMillis();
        File file5 = new File(file, "log.txt");
        a(file5);
        com.xiaomi.channel.commonutils.logger.b.c("LOG: filter cost = " + (System.currentTimeMillis() - currentTimeMillis));
        if (file5.exists()) {
            long currentTimeMillis2 = System.currentTimeMillis();
            y.a(file4, file5);
            com.xiaomi.channel.commonutils.logger.b.c("LOG: zip cost = " + (System.currentTimeMillis() - currentTimeMillis2));
            file5.delete();
            if (file4.exists()) {
                return file4;
            }
        }
        return null;
    }

    public void a(int i11) {
        if (i11 != 0) {
            this.f45376b = i11;
        }
    }

    private void a(BufferedReader bufferedReader, BufferedWriter bufferedWriter, Pattern pattern) {
        char[] cArr = new char[4096];
        int read = bufferedReader.read(cArr);
        boolean z11 = false;
        while (read != -1 && !z11) {
            String str = new String(cArr, 0, read);
            Matcher matcher = pattern.matcher(str);
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i11 >= read || !matcher.find(i11)) {
                    break;
                }
                int start = matcher.start();
                String substring = str.substring(start, this.f238b.length() + start);
                if (this.f237a) {
                    if (substring.compareTo(this.f45377c) > 0) {
                        z11 = true;
                        read = start;
                        break;
                    }
                } else if (substring.compareTo(this.f238b) >= 0) {
                    this.f237a = true;
                    i12 = start;
                }
                int indexOf = str.indexOf(10, start);
                if (indexOf == -1) {
                    indexOf = this.f238b.length();
                }
                i11 = start + indexOf;
            }
            if (this.f237a) {
                int i13 = read - i12;
                this.f234a += i13;
                bufferedWriter.write(cArr, i12, i13);
                if (z11 || this.f234a > this.f45376b) {
                    return;
                }
            }
            read = bufferedReader.read(cArr);
        }
    }

    private void a(File file) {
        BufferedReader bufferedReader;
        String str;
        Pattern compile = Pattern.compile("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}");
        BufferedReader bufferedReader2 = null;
        try {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
                try {
                    bufferedWriter.write("model :" + Build.MODEL + "; os :" + Build.VERSION.INCREMENTAL + "; uid :" + com.xiaomi.push.service.bv.m6265a() + "; lng :" + Locale.getDefault().toString() + "; sdk :48; andver :" + Build.VERSION.SDK_INT + "\n");
                    this.f234a = 0;
                    Iterator<File> it = this.f236a.iterator();
                    while (it.hasNext()) {
                        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(it.next())));
                        try {
                            a(bufferedReader, bufferedWriter, compile);
                            bufferedReader.close();
                            bufferedReader2 = bufferedReader;
                        } catch (FileNotFoundException e11) {
                            e = e11;
                            bufferedReader2 = bufferedWriter;
                            str = "LOG: filter error = " + e.getMessage();
                            com.xiaomi.channel.commonutils.logger.b.c(str);
                            y.a(bufferedReader2);
                            y.a(bufferedReader);
                            return;
                        } catch (IOException e12) {
                            e = e12;
                            bufferedReader2 = bufferedWriter;
                            str = "LOG: filter error = " + e.getMessage();
                            com.xiaomi.channel.commonutils.logger.b.c(str);
                            y.a(bufferedReader2);
                            y.a(bufferedReader);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedWriter;
                            y.a(bufferedReader2);
                            y.a(bufferedReader);
                            throw th;
                        }
                    }
                    bufferedWriter.write(cu.a().c());
                    y.a(bufferedWriter);
                    y.a(bufferedReader2);
                } catch (FileNotFoundException e13) {
                    e = e13;
                    bufferedReader = bufferedReader2;
                } catch (IOException e14) {
                    e = e14;
                    bufferedReader = bufferedReader2;
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = bufferedReader2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (FileNotFoundException e15) {
            e = e15;
            bufferedReader = null;
        } catch (IOException e16) {
            e = e16;
            bufferedReader = null;
        } catch (Throwable th5) {
            th = th5;
            bufferedReader = null;
        }
    }
}
