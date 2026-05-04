package com.huawei.updatesdk.a.b.c;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.huawei.updatesdk.a.a.d.h;
import com.huawei.updatesdk.a.b.c.c.c;
import com.huawei.updatesdk.a.b.c.c.d;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b extends AsyncTask<c, Void, d> {

    /* renamed from: a, reason: collision with root package name */
    protected c f36845a;

    /* renamed from: c, reason: collision with root package name */
    private final com.huawei.updatesdk.a.b.c.c.a f36847c;

    /* renamed from: b, reason: collision with root package name */
    private d f36846b = null;

    /* renamed from: d, reason: collision with root package name */
    private com.huawei.updatesdk.a.a.b.b f36848d = null;

    /* renamed from: e, reason: collision with root package name */
    private int f36849e = 0;

    public b(c cVar, com.huawei.updatesdk.a.b.c.c.a aVar) {
        this.f36845a = cVar;
        this.f36847c = aVar;
    }

    private String d() {
        String a11 = com.huawei.updatesdk.b.g.a.a();
        com.huawei.updatesdk.a.a.c.a.a.a.c("StoreTask", "UserAgent is: " + a11);
        return TextUtils.isEmpty(a11) ? "Android/1.0" : a11;
    }

    private void e() {
        b(this.f36846b);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.huawei.updatesdk.a.b.c.c.d a() {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.a.b.c.b.a():com.huawei.updatesdk.a.b.c.c.d");
    }

    public void b() {
        com.huawei.updatesdk.a.a.b.b bVar = this.f36848d;
        if (bVar != null) {
            bVar.a();
            this.f36848d = null;
        }
    }

    public final d c() {
        d dVar = null;
        do {
            if (this.f36849e > 0 && dVar != null) {
                com.huawei.updatesdk.a.a.c.a.a.a.a("StoreTask", "call store error! responseCode:" + dVar.d() + ", retryTimes:" + this.f36849e);
            }
            dVar = a();
        } while (c(dVar));
        this.f36846b = dVar;
        return dVar;
    }

    private d a(String str, d dVar) {
        try {
            dVar.fromJson(new JSONObject(str));
            dVar.b(0);
            return dVar;
        } catch (Exception e11) {
            com.huawei.updatesdk.a.a.c.a.a.a.a("StoreTask", "parse json error", e11);
            return dVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(com.huawei.updatesdk.a.b.c.c.d r5) {
        /*
            r4 = this;
            java.lang.String r0 = "notifyResult, create response error, method:"
            boolean r1 = r4.isCancelled()
            if (r1 != 0) goto L5e
            com.huawei.updatesdk.a.b.c.c.a r1 = r4.f36847c
            if (r1 == 0) goto L5e
            if (r5 != 0) goto L57
            java.lang.String r1 = "notifyResult, response is null"
            java.lang.String r2 = "StoreTask"
            com.huawei.updatesdk.a.a.c.a.a.a.b(r2, r1)
            com.huawei.updatesdk.a.b.c.c.c r1 = r4.f36845a     // Catch: java.lang.IllegalAccessException -> L20 java.lang.InstantiationException -> L22
            java.lang.String r1 = r1.b()     // Catch: java.lang.IllegalAccessException -> L20 java.lang.InstantiationException -> L22
            com.huawei.updatesdk.a.b.c.c.d r5 = com.huawei.updatesdk.a.b.c.a.a(r1)     // Catch: java.lang.IllegalAccessException -> L20 java.lang.InstantiationException -> L22
            goto L43
        L20:
            r1 = move-exception
            goto L24
        L22:
            r1 = move-exception
            goto L3d
        L24:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L29:
            r3.append(r0)
            com.huawei.updatesdk.a.b.c.c.c r0 = r4.f36845a
            java.lang.String r0 = r0.b()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.huawei.updatesdk.a.a.c.a.a.a.a(r2, r0, r1)
            goto L43
        L3d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            goto L29
        L43:
            if (r5 != 0) goto L50
            com.huawei.updatesdk.a.b.c.c.d r5 = new com.huawei.updatesdk.a.b.c.c.d
            r5.<init>()
            com.huawei.updatesdk.a.b.c.c.d$a r0 = com.huawei.updatesdk.a.b.c.c.d.a.PARAM_ERROR
        L4c:
            r5.a(r0)
            goto L53
        L50:
            com.huawei.updatesdk.a.b.c.c.d$a r0 = com.huawei.updatesdk.a.b.c.c.d.a.UNKNOWN_EXCEPTION
            goto L4c
        L53:
            r0 = 1
            r5.b(r0)
        L57:
            com.huawei.updatesdk.a.b.c.c.a r0 = r4.f36847c
            com.huawei.updatesdk.a.b.c.c.c r1 = r4.f36845a
            r0.b(r1, r5)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.a.b.c.b.b(com.huawei.updatesdk.a.b.c.c.d):void");
    }

    private boolean c(d dVar) {
        if (isCancelled()) {
            return false;
        }
        if (dVar.d() != 1 && dVar.d() != 2) {
            return false;
        }
        int i11 = this.f36849e;
        this.f36849e = i11 + 1;
        if (i11 >= 3) {
            com.huawei.updatesdk.a.a.c.a.a.a.a("StoreTask", "retry completed total times = " + this.f36849e + ",response.responseCode = " + dVar.d());
            return false;
        }
        com.huawei.updatesdk.a.a.c.a.a.a.a("StoreTask", "retry times = " + this.f36849e + ",response.responseCode = " + dVar.d());
        return true;
    }

    private void d(String str) {
        com.huawei.updatesdk.a.a.a.a("StoreTask", TextUtils.isEmpty(str) ? "UpdateSDK response error, resData == null" : "UpdateSDK response error, resData is not json string");
    }

    private boolean b(String str) {
        return TextUtils.isEmpty(str) || !h.d(str);
    }

    private boolean c(String str) {
        return (str == null || str.contains("emuiApiLevel") || str.contains("ts") || str.contains("harmonyApiLevel")) ? false : true;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public d doInBackground(c... cVarArr) {
        com.huawei.updatesdk.a.a.c.a.a.a.a("StoreTask", "doInBackground, method:" + this.f36845a.b());
        com.huawei.updatesdk.b.g.b.a((AsyncTask) this);
        d c11 = c();
        com.huawei.updatesdk.a.b.c.c.a aVar = this.f36847c;
        if (aVar != null) {
            aVar.a(this.f36845a, c11);
        }
        return c11;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(d dVar) {
        com.huawei.updatesdk.a.a.c.a.a.a.a("StoreTask", "onPostExecute, method:" + this.f36845a.b());
        com.huawei.updatesdk.b.g.b.a().remove(this);
        e();
    }

    private void a(d dVar, int i11, d.a aVar, Throwable th2) {
        if (dVar != null) {
            dVar.b(i11);
            dVar.a(aVar);
            String th3 = th2.toString();
            if (a(th2.toString())) {
                th3 = th2.getClass().getName();
            }
            dVar.a(th3);
        }
    }

    private void a(d dVar, Throwable th2, String str) {
        d.a aVar;
        int i11 = 1;
        if (th2 instanceof ConnectException) {
            aVar = d.a.CONNECT_EXCEPTION;
        } else if ((th2 instanceof SocketTimeoutException) || (th2.getMessage() != null && th2.getMessage().contains("ConnectTimeoutException"))) {
            aVar = d.a.CONNECT_EXCEPTION;
            i11 = 2;
        } else if (th2 instanceof IllegalArgumentException) {
            aVar = d.a.PARAM_ERROR;
            i11 = 5;
        } else if (th2 instanceof IllegalAccessException) {
            aVar = d.a.UNKNOWN_EXCEPTION;
        } else {
            if (!(th2 instanceof ArrayIndexOutOfBoundsException)) {
                if ((th2 instanceof InterruptedException) || (th2 instanceof InterruptedIOException)) {
                    a(dVar, 0, d.a.NORMAL, th2);
                    com.huawei.updatesdk.a.a.a.a("StoreTask", "UpdateSDK task is canceled");
                } else if (th2 instanceof IOException) {
                    aVar = d.a.IO_EXCEPTION;
                } else if (dVar != null) {
                    dVar.a(th2.toString());
                }
                a(str, th2);
            }
            aVar = d.a.NO_PROGUARD;
            i11 = 6;
        }
        a(dVar, i11, aVar, th2);
        a(str, th2);
    }

    private void a(String str, Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        String th3 = th2.toString();
        if (a(th2.toString())) {
            th3 = th2.getClass().getName();
        }
        sb2.append("invoke store error");
        sb2.append(", exceptionType:");
        sb2.append(th3);
        sb2.append(", url:");
        sb2.append(str);
        sb2.append(", method:");
        sb2.append(this.f36845a.b());
        sb2.append(", retryTimes:");
        sb2.append(this.f36849e);
        String sb3 = sb2.toString();
        com.huawei.updatesdk.a.a.c.a.a.a.a("StoreTask", sb3, th2);
        com.huawei.updatesdk.a.a.a.a("StoreTask", "UpdateSDK call store error: " + sb3);
    }

    public final void a(Executor executor) {
        executeOnExecutor(executor, this.f36845a);
    }

    private boolean a(String str) {
        try {
            return Pattern.compile("((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)").matcher(str).find();
        } catch (Exception e11) {
            com.huawei.updatesdk.a.a.a.b("StoreTask", "is contain ip error: " + e11.getMessage());
            return true;
        }
    }
}
