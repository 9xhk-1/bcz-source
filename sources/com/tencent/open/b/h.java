package com.tencent.open.b;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.hms.adapter.internal.CommonCode;
import com.tencent.connect.common.Constants;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.i;
import com.tencent.open.utils.l;
import com.tencent.open.utils.m;
import java.io.Serializable;
import java.net.SocketTimeoutException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    protected static h f44468a;

    /* renamed from: e, reason: collision with root package name */
    protected HandlerThread f44472e;

    /* renamed from: f, reason: collision with root package name */
    protected Handler f44473f;

    /* renamed from: b, reason: collision with root package name */
    protected Random f44469b = new SecureRandom();

    /* renamed from: d, reason: collision with root package name */
    protected List<Serializable> f44471d = Collections.synchronizedList(new ArrayList());

    /* renamed from: c, reason: collision with root package name */
    protected List<Serializable> f44470c = Collections.synchronizedList(new ArrayList());

    /* renamed from: g, reason: collision with root package name */
    protected Executor f44474g = l.b();

    /* renamed from: h, reason: collision with root package name */
    protected Executor f44475h = l.b();

    private h() {
        this.f44472e = null;
        if (this.f44472e == null) {
            HandlerThread handlerThread = new HandlerThread("opensdk.report.handlerthread", 10);
            this.f44472e = handlerThread;
            handlerThread.start();
        }
        if (!this.f44472e.isAlive() || this.f44472e.getLooper() == null) {
            return;
        }
        this.f44473f = new Handler(this.f44472e.getLooper()) { // from class: com.tencent.open.b.h.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i11 = message.what;
                if (i11 == 1000) {
                    h.this.b();
                } else if (i11 == 1001) {
                    h.this.d();
                }
                super.handleMessage(message);
            }
        };
    }

    public static synchronized h a() {
        h hVar;
        synchronized (h.class) {
            try {
                if (f44468a == null) {
                    f44468a = new h();
                }
                hVar = f44468a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }

    public Map<String, String> c() {
        List<Serializable> b11 = g.b("report_via");
        if (b11 != null) {
            this.f44471d.addAll(b11);
        }
        SLog.d("openSDK_LOG.ReportManager", "-->prepareViaData, mViaList size: " + this.f44471d.size());
        if (this.f44471d.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Serializable serializable : this.f44471d) {
            JSONObject jSONObject = new JSONObject();
            c cVar = (c) serializable;
            for (String str : cVar.f44464a.keySet()) {
                try {
                    String str2 = cVar.f44464a.get(str);
                    if (str2 == null) {
                        str2 = "";
                    }
                    jSONObject.put(str, str2);
                } catch (JSONException e11) {
                    SLog.e("openSDK_LOG.ReportManager", "-->prepareViaData, put bundle to json array exception", e11);
                }
            }
            jSONArray.put(jSONObject);
        }
        SLog.v("openSDK_LOG.ReportManager", "-->prepareViaData, JSONArray array: " + jSONArray.toString());
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("data", jSONArray);
            HashMap hashMap = new HashMap();
            hashMap.put("data", jSONObject2.toString());
            return hashMap;
        } catch (JSONException e12) {
            SLog.e("openSDK_LOG.ReportManager", "-->prepareViaData, put bundle to json array exception", e12);
            return null;
        }
    }

    public void d() {
        if (m.b(com.tencent.open.utils.g.a())) {
            this.f44474g.execute(new Runnable() { // from class: com.tencent.open.b.h.3
                /* JADX WARN: Code restructure failed: missing block: B:56:0x0099, code lost:
                
                    r21 = r5;
                    r27 = r8;
                    r25 = r9;
                    r23 = r14;
                    r7 = true;
                 */
                /* JADX WARN: Removed duplicated region for block: B:36:0x00d6 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:38:? A[LOOP:0: B:10:0x0030->B:38:?, LOOP_END, SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 295
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tencent.open.b.h.AnonymousClass3.run():void");
                }
            });
        }
    }

    public void a(final Bundle bundle, String str, final boolean z11) {
        if (bundle == null) {
            return;
        }
        SLog.v("openSDK_LOG.ReportManager", "-->reportVia, bundle: " + bundle.toString());
        if (a("report_via", str) || z11) {
            this.f44474g.execute(new Runnable() { // from class: com.tencent.open.b.h.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("uin", Constants.DEFAULT_UIN);
                        bundle2.putString(Constants.PARAM_PLATFORM, "1");
                        bundle2.putString("os_ver", Build.VERSION.RELEASE);
                        bundle2.putString("position", "");
                        bundle2.putString("network", a.a(com.tencent.open.utils.g.a()));
                        bundle2.putString(IjkMediaMeta.IJKM_KEY_LANGUAGE, d.a());
                        bundle2.putString(CommonCode.MapKey.HAS_RESOLUTION, d.a(com.tencent.open.utils.g.a()));
                        bundle2.putString("apn", a.b(com.tencent.open.utils.g.a()));
                        bundle2.putString(Constants.PARAM_MODEL_NAME, com.tencent.open.utils.f.a().c(com.tencent.open.utils.g.a()));
                        bundle2.putString("timezone", TimeZone.getDefault().getID());
                        bundle2.putString("sdk_ver", Constants.SDK_VERSION);
                        bundle2.putString("qz_ver", m.d(com.tencent.open.utils.g.a(), Constants.PACKAGE_QZONE));
                        bundle2.putString(Constants.PARAM_QQ_VER, m.c(com.tencent.open.utils.g.a(), "com.tencent.mobileqq"));
                        bundle2.putString("qua", m.e(com.tencent.open.utils.g.a(), com.tencent.open.utils.g.b()));
                        bundle2.putString("packagename", com.tencent.open.utils.g.b());
                        bundle2.putString(Constants.PARAM_APP_VER, m.d(com.tencent.open.utils.g.a(), com.tencent.open.utils.g.b()));
                        Bundle bundle3 = bundle;
                        if (bundle3 != null) {
                            bundle2.putAll(bundle3);
                        }
                        h.this.f44471d.add(new c(bundle2));
                        int size = h.this.f44471d.size();
                        int a11 = i.a(com.tencent.open.utils.g.a(), (String) null).a("Agent_ReportTimeInterval");
                        if (a11 == 0) {
                            a11 = 10000;
                        }
                        if (!h.this.a("report_via", size) && !z11) {
                            if (h.this.f44473f.hasMessages(1001)) {
                                return;
                            }
                            Message obtain = Message.obtain();
                            obtain.what = 1001;
                            h.this.f44473f.sendMessageDelayed(obtain, a11);
                            return;
                        }
                        h.this.d();
                        h.this.f44473f.removeMessages(1001);
                    } catch (Exception e11) {
                        SLog.e("openSDK_LOG.ReportManager", "--> reporVia, exception in sub thread.", e11);
                    }
                }
            });
        }
    }

    public void a(String str, long j11, long j12, long j13, int i11) {
        a(str, j11, j12, j13, i11, "", false);
    }

    public void a(String str, long j11, long j12, long j13, int i11, String str2, boolean z11) {
        SLog.v("openSDK_LOG.ReportManager", "-->reportCgi, command: " + str + " | startTime: " + j11 + " | reqSize:" + j12 + " | rspSize: " + j13 + " | responseCode: " + i11 + " | detail: " + str2);
    }

    public boolean a(String str, String str2) {
        int a11;
        SLog.d("openSDK_LOG.ReportManager", "-->availableFrequency, report: " + str + " | ext: " + str2);
        boolean z11 = false;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int i11 = 100;
        if (str.equals("report_cgi")) {
            try {
                a11 = a(Integer.parseInt(str2));
                if (this.f44469b.nextInt(100) < a11) {
                    z11 = true;
                }
            } catch (Exception unused) {
                return false;
            }
        } else {
            if (str.equals("report_via")) {
                a11 = f.a(str2);
                if (this.f44469b.nextInt(100) < a11) {
                    i11 = a11;
                    z11 = true;
                }
            }
            SLog.d("openSDK_LOG.ReportManager", "-->availableFrequency, result: " + z11 + " | frequency: " + i11);
            return z11;
        }
        i11 = a11;
        SLog.d("openSDK_LOG.ReportManager", "-->availableFrequency, result: " + z11 + " | frequency: " + i11);
        return z11;
    }

    public void b() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r0 == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r0 == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        r1 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.String r5, int r6) {
        /*
            r4 = this;
            java.lang.String r0 = "report_cgi"
            boolean r0 = r5.equals(r0)
            r1 = 5
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L1e
            android.content.Context r0 = com.tencent.open.utils.g.a()
            com.tencent.open.utils.i r0 = com.tencent.open.utils.i.a(r0, r2)
            java.lang.String r2 = "Common_CGIReportMaxcount"
            int r0 = r0.a(r2)
            if (r0 != 0) goto L1c
            goto L38
        L1c:
            r1 = r0
            goto L38
        L1e:
            java.lang.String r0 = "report_via"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L37
            android.content.Context r0 = com.tencent.open.utils.g.a()
            com.tencent.open.utils.i r0 = com.tencent.open.utils.i.a(r0, r2)
            java.lang.String r2 = "Agent_ReportBatchCount"
            int r0 = r0.a(r2)
            if (r0 != 0) goto L1c
            goto L38
        L37:
            r1 = r3
        L38:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "-->availableCount, report: "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = " | dataSize: "
            r0.append(r5)
            r0.append(r6)
            java.lang.String r5 = " | maxcount: "
            r0.append(r5)
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "openSDK_LOG.ReportManager"
            com.tencent.open.log.SLog.d(r0, r5)
            if (r6 < r1) goto L62
            r5 = 1
            return r5
        L62:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.open.b.h.a(java.lang.String, int):boolean");
    }

    public int a(int i11) {
        if (i11 == 0) {
            int a11 = i.a(com.tencent.open.utils.g.a(), (String) null).a("Common_CGIReportFrequencySuccess");
            if (a11 == 0) {
                return 10;
            }
            return a11;
        }
        int a12 = i.a(com.tencent.open.utils.g.a(), (String) null).a("Common_CGIReportFrequencyFailed");
        if (a12 == 0) {
            return 100;
        }
        return a12;
    }

    public void a(final String str, final Map<String, String> map) {
        if (m.b(com.tencent.open.utils.g.a())) {
            l.b(new Runnable() { // from class: com.tencent.open.b.h.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        int a11 = f.a();
                        if (a11 == 0) {
                            a11 = 3;
                        }
                        SLog.d("openSDK_LOG.ReportManager", "-->httpRequest, retryCount: " + a11);
                        int i11 = 0;
                        do {
                            i11++;
                            try {
                                try {
                                    SLog.i("openSDK_LOG.ReportManager", "-->httpRequest, statusCode: " + com.tencent.open.a.f.a().a(str, map).d());
                                } catch (SocketTimeoutException e11) {
                                    SLog.e("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest SocketTimeoutException:", e11);
                                }
                            } catch (Exception e12) {
                                SLog.e("openSDK_LOG.ReportManager", "-->ReportCenter httpRequest Exception:", e12);
                            }
                        } while (i11 < a11);
                    } catch (Exception e13) {
                        SLog.e("openSDK_LOG.ReportManager", "-->httpRequest, exception in serial executor:", e13);
                    }
                }
            });
        }
    }
}
