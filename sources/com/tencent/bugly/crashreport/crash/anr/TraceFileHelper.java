package com.tencent.bugly.crashreport.crash.anr;

import com.tencent.bugly.proguard.al;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class TraceFileHelper {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f42134a;

        /* renamed from: b, reason: collision with root package name */
        public String f42135b;

        /* renamed from: c, reason: collision with root package name */
        public long f42136c;

        /* renamed from: d, reason: collision with root package name */
        public Map<String, String[]> f42137d;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        boolean a(long j11);

        boolean a(long j11, long j12, String str);

        boolean a(String str, int i11, String str2, String str3);
    }

    private static Object[] a(BufferedReader bufferedReader, Pattern... patternArr) throws IOException {
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return null;
            }
            for (Pattern pattern : patternArr) {
                if (pattern.matcher(readLine).matches()) {
                    return new Object[]{pattern, readLine};
                }
            }
        }
    }

    private static String b(BufferedReader bufferedReader) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null || readLine.trim().length() <= 0) {
                break;
            }
            stringBuffer.append(readLine + "\n");
        }
        return stringBuffer.toString();
    }

    public static a readFirstDumpInfo(String str, final boolean z11) {
        if (str == null) {
            al.e("path:%s", str);
            return null;
        }
        final a aVar = new a();
        readTraceFile(str, new b() { // from class: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.2
            @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
            public final boolean a(String str2, int i11, String str3, String str4) {
                al.c("new thread %s", str2);
                a aVar2 = a.this;
                if (aVar2.f42137d == null) {
                    aVar2.f42137d = new HashMap();
                }
                a.this.f42137d.put(str2, new String[]{str3, str4, String.valueOf(i11)});
                return true;
            }

            @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
            public final boolean a(long j11, long j12, String str2) {
                al.c("new process %s", str2);
                a aVar2 = a.this;
                aVar2.f42134a = j11;
                aVar2.f42135b = str2;
                aVar2.f42136c = j12;
                return z11;
            }

            @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
            public final boolean a(long j11) {
                al.c("process end %d", Long.valueOf(j11));
                return false;
            }
        });
        if (aVar.f42134a > 0 && aVar.f42136c > 0 && aVar.f42135b != null) {
            return aVar;
        }
        al.e("first dump error %s", aVar.f42134a + " " + aVar.f42136c + " " + aVar.f42135b);
        return null;
    }

    public static a readTargetDumpInfo(final String str, String str2, final boolean z11) {
        if (str != null && str2 != null) {
            final a aVar = new a();
            readTraceFile(str2, new b() { // from class: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.1
                @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
                public final boolean a(String str3, int i11, String str4, String str5) {
                    al.c("new thread %s", str3);
                    a aVar2 = a.this;
                    if (aVar2.f42134a > 0 && aVar2.f42136c > 0 && aVar2.f42135b != null) {
                        if (aVar2.f42137d == null) {
                            aVar2.f42137d = new HashMap();
                        }
                        a.this.f42137d.put(str3, new String[]{str4, str5, String.valueOf(i11)});
                    }
                    return true;
                }

                @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
                public final boolean a(long j11, long j12, String str3) {
                    al.c("new process %s", str3);
                    if (!str3.equals(str)) {
                        return true;
                    }
                    a aVar2 = a.this;
                    aVar2.f42134a = j11;
                    aVar2.f42135b = str3;
                    aVar2.f42136c = j12;
                    return z11;
                }

                @Override // com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b
                public final boolean a(long j11) {
                    al.c("process end %d", Long.valueOf(j11));
                    a aVar2 = a.this;
                    return aVar2.f42134a <= 0 || aVar2.f42136c <= 0 || aVar2.f42135b == null;
                }
            });
            if (aVar.f42134a > 0 && aVar.f42136c > 0 && aVar.f42135b != null) {
                return aVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0150, code lost:
    
        if (r17.a(java.lang.Long.parseLong(r1[1].toString().split("\\s")[2])) != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0152, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0155, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0156, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x015b, code lost:
    
        if (com.tencent.bugly.proguard.al.a(r0) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void readTraceFile(java.lang.String r16, com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b r17) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.readTraceFile(java.lang.String, com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$b):void");
    }

    private static String a(BufferedReader bufferedReader) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < 3; i11++) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return null;
            }
            stringBuffer.append(readLine + "\n");
        }
        return stringBuffer.toString();
    }
}
