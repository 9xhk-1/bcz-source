package com.alipay.sdk.m.c0;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static String f10510a = "";

    /* renamed from: b, reason: collision with root package name */
    public static String f10511b = "";

    /* renamed from: c, reason: collision with root package name */
    public static String f10512c = "";

    public static synchronized void a(String str) {
        synchronized (d.class) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            a(arrayList);
        }
    }

    public static synchronized void a(String str, String str2, String str3) {
        synchronized (d.class) {
            f10510a = str;
            f10511b = str2;
            f10512c = str3;
        }
    }

    public static synchronized void a(Throwable th2) {
        String str;
        synchronized (d.class) {
            try {
                ArrayList arrayList = new ArrayList();
                if (th2 != null) {
                    StringWriter stringWriter = new StringWriter();
                    th2.printStackTrace(new PrintWriter(stringWriter));
                    str = stringWriter.toString();
                } else {
                    str = "";
                }
                arrayList.add(str);
                a(arrayList);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static synchronized void a(List<String> list) {
        synchronized (d.class) {
            try {
                if (!com.alipay.sdk.m.z.a.a(f10511b) && !com.alipay.sdk.m.z.a.a(f10512c)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(f10512c);
                    Iterator<String> it = list.iterator();
                    while (it.hasNext()) {
                        stringBuffer.append(j2.O + it.next());
                    }
                    stringBuffer.append("\n");
                    try {
                        File file = new File(f10510a);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        File file2 = new File(f10510a, f10511b);
                        if (!file2.exists()) {
                            file2.createNewFile();
                        }
                        FileWriter fileWriter = ((long) stringBuffer.length()) + file2.length() <= 51200 ? new FileWriter(file2, true) : new FileWriter(file2);
                        fileWriter.write(stringBuffer.toString());
                        fileWriter.flush();
                        fileWriter.close();
                    } catch (Exception unused) {
                    }
                }
            } finally {
            }
        }
    }
}
