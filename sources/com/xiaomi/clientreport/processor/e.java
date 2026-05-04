package com.xiaomi.clientreport.processor;

import android.text.TextUtils;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.push.y;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class e {
    private static PerfClientReport a(PerfClientReport perfClientReport, String str) {
        long[] m5650a;
        if (perfClientReport == null || (m5650a = m5650a(str)) == null) {
            return null;
        }
        perfClientReport.perfCounts = m5650a[0];
        perfClientReport.perfLatencies = m5650a[1];
        return perfClientReport;
    }

    private static PerfClientReport a(String str) {
        PerfClientReport perfClientReport = null;
        try {
            String[] m5651a = m5651a(str);
            if (m5651a == null || m5651a.length < 4 || TextUtils.isEmpty(m5651a[0]) || TextUtils.isEmpty(m5651a[1]) || TextUtils.isEmpty(m5651a[2]) || TextUtils.isEmpty(m5651a[3])) {
                return null;
            }
            perfClientReport = PerfClientReport.getBlankInstance();
            perfClientReport.production = Integer.parseInt(m5651a[0]);
            perfClientReport.clientInterfaceId = m5651a[1];
            perfClientReport.reportType = Integer.parseInt(m5651a[2]);
            perfClientReport.code = Integer.parseInt(m5651a[3]);
            return perfClientReport;
        } catch (Exception unused) {
            com.xiaomi.channel.commonutils.logger.b.c("parse per key error");
            return perfClientReport;
        }
    }

    public static String a(PerfClientReport perfClientReport) {
        return perfClientReport.production + "#" + perfClientReport.clientInterfaceId + "#" + perfClientReport.reportType + "#" + perfClientReport.code;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static HashMap<String, String> m5649a(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            return hashMap;
        }
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(str));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            y.a(bufferedReader2);
                            return hashMap;
                        }
                        String[] split = readLine.split("%%%");
                        if (split.length >= 2 && !TextUtils.isEmpty(split[0]) && !TextUtils.isEmpty(split[1])) {
                            hashMap.put(split[0], split[1]);
                        }
                    } catch (Exception e11) {
                        e = e11;
                        bufferedReader = bufferedReader2;
                        com.xiaomi.channel.commonutils.logger.b.a(e);
                        y.a(bufferedReader);
                        return hashMap;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        y.a(bufferedReader);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00db, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.io.BufferedReader, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<java.lang.String> a(android.content.Context r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.clientreport.processor.e.a(android.content.Context, java.lang.String):java.util.List");
    }

    private static void a(String str, HashMap<String, String> hashMap) {
        BufferedWriter bufferedWriter;
        Throwable th2;
        Exception e11;
        if (TextUtils.isEmpty(str) || hashMap == null || hashMap.size() == 0) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            try {
                try {
                    for (String str2 : hashMap.keySet()) {
                        bufferedWriter.write(str2 + "%%%" + hashMap.get(str2));
                        bufferedWriter.newLine();
                    }
                    y.a(bufferedWriter);
                } catch (Exception e12) {
                    e11 = e12;
                    com.xiaomi.channel.commonutils.logger.b.a(e11);
                    y.a(bufferedWriter);
                }
            } catch (Throwable th3) {
                th2 = th3;
                y.a(bufferedWriter);
                throw th2;
            }
        } catch (Exception e13) {
            bufferedWriter = null;
            e11 = e13;
        } catch (Throwable th4) {
            bufferedWriter = null;
            th2 = th4;
            y.a(bufferedWriter);
            throw th2;
        }
    }

    public static void a(String str, com.xiaomi.clientreport.data.a[] aVarArr) {
        RandomAccessFile randomAccessFile;
        FileLock fileLock;
        if (aVarArr == null || aVarArr.length <= 0 || TextUtils.isEmpty(str)) {
            return;
        }
        FileLock fileLock2 = null;
        try {
            try {
                File file = new File(str + ".lock");
                y.m6304a(file);
                randomAccessFile = new RandomAccessFile(file, "rw");
            } catch (Throwable unused) {
                fileLock = null;
                randomAccessFile = null;
            }
        } catch (IOException e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
        }
        try {
            fileLock2 = randomAccessFile.getChannel().lock();
            HashMap<String, String> m5649a = m5649a(str);
            for (com.xiaomi.clientreport.data.a aVar : aVarArr) {
                if (aVar != null) {
                    String a11 = a((PerfClientReport) aVar);
                    long j11 = ((PerfClientReport) aVar).perfCounts;
                    long j12 = ((PerfClientReport) aVar).perfLatencies;
                    if (!TextUtils.isEmpty(a11) && j11 > 0 && j12 >= 0) {
                        a(m5649a, a11, j11, j12);
                    }
                }
            }
            a(str, m5649a);
        } catch (Throwable unused2) {
            fileLock = fileLock2;
            try {
                com.xiaomi.channel.commonutils.logger.b.c("failed to write perf to file ");
                if (fileLock != null && fileLock.isValid()) {
                    fileLock.release();
                }
                y.a(randomAccessFile);
            } catch (Throwable th2) {
                if (fileLock != null && fileLock.isValid()) {
                    try {
                        fileLock.release();
                    } catch (IOException e12) {
                        com.xiaomi.channel.commonutils.logger.b.a(e12);
                    }
                }
                y.a(randomAccessFile);
                throw th2;
            }
        }
        if (fileLock2 != null && fileLock2.isValid()) {
            fileLock2.release();
        }
        y.a(randomAccessFile);
    }

    private static void a(HashMap<String, String> hashMap, String str, long j11, long j12) {
        StringBuilder sb2;
        String str2 = hashMap.get(str);
        if (TextUtils.isEmpty(str2)) {
            hashMap.put(str, j11 + "#" + j12);
            return;
        }
        long[] m5650a = m5650a(str2);
        if (m5650a != null) {
            long j13 = m5650a[0];
            if (j13 > 0) {
                long j14 = m5650a[1];
                if (j14 >= 0) {
                    j11 += j13;
                    j12 += j14;
                    sb2 = new StringBuilder();
                    sb2.append(j11);
                    sb2.append("#");
                    sb2.append(j12);
                    hashMap.put(str, sb2.toString());
                }
            }
        }
        sb2 = new StringBuilder();
        sb2.append(j11);
        sb2.append("#");
        sb2.append(j12);
        hashMap.put(str, sb2.toString());
    }

    /* renamed from: a, reason: collision with other method in class */
    public static long[] m5650a(String str) {
        long[] jArr = new long[2];
        try {
            String[] split = str.split("#");
            if (split.length >= 2) {
                jArr[0] = Long.parseLong(split[0].trim());
                jArr[1] = Long.parseLong(split[1].trim());
            }
            return jArr;
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.a(e11);
            return null;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static String[] m5651a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split("#");
    }
}
