package com.igexin.push.c;

import androidx.collection.SieveCacheKt;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    private static final String f37459f = "DT_DetectResult";

    /* renamed from: a, reason: collision with root package name */
    String f37460a;

    /* renamed from: b, reason: collision with root package name */
    int f37461b;

    /* renamed from: g, reason: collision with root package name */
    private String f37465g;

    /* renamed from: h, reason: collision with root package name */
    private int f37466h;

    /* renamed from: i, reason: collision with root package name */
    private int f37467i;

    /* renamed from: c, reason: collision with root package name */
    long f37462c = SieveCacheKt.NodeLinkMask;

    /* renamed from: d, reason: collision with root package name */
    long f37463d = -1;

    /* renamed from: e, reason: collision with root package name */
    boolean f37464e = true;

    /* renamed from: j, reason: collision with root package name */
    private final int f37468j = 1;

    public d() {
    }

    private String g() {
        return this.f37460a;
    }

    private int h() {
        return this.f37461b;
    }

    private void i() {
        this.f37460a = null;
        this.f37466h = 0;
        this.f37464e = true;
    }

    private boolean j() {
        return this.f37460a != null && System.currentTimeMillis() - this.f37463d <= b.f37447d && this.f37466h <= 0;
    }

    public final synchronized String a() {
        return this.f37465g;
    }

    public final synchronized void b() {
        this.f37460a = null;
        this.f37462c = SieveCacheKt.NodeLinkMask;
        this.f37463d = -1L;
        this.f37464e = true;
        this.f37466h = 0;
    }

    public final synchronized long c() {
        return this.f37462c;
    }

    public final synchronized boolean d() {
        if (j()) {
            return true;
        }
        if (this.f37467i <= 0) {
            return true;
        }
        this.f37467i = 0;
        return false;
    }

    public final synchronized void e() {
        this.f37466h = 0;
        this.f37467i = 0;
    }

    public final JSONObject f() {
        if (this.f37465g != null && this.f37460a != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("domain", this.f37465g);
                jSONObject.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, this.f37460a);
                long j11 = this.f37462c;
                if (j11 != SieveCacheKt.NodeLinkMask) {
                    jSONObject.put("consumeTime", j11);
                }
                jSONObject.put(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT, this.f37461b);
                long j12 = this.f37463d;
                if (j12 != -1) {
                    jSONObject.put("detectSuccessTime", j12);
                }
                jSONObject.put("isDomain", this.f37464e);
                jSONObject.put("connectTryCnt", 1);
                return jSONObject;
            } catch (JSONException e11) {
                com.igexin.c.a.c.a.a(f37459f, e11.toString());
            }
        }
        return null;
    }

    public d(String str, int i11) {
        this.f37465g = str;
        this.f37461b = i11;
    }

    private void b(long j11) {
        this.f37463d = j11;
    }

    public final synchronized String a(boolean z11) {
        try {
            if (j()) {
                if (z11) {
                    this.f37466h++;
                }
                this.f37464e = false;
                return this.f37460a;
            }
            this.f37460a = null;
            this.f37466h = 0;
            this.f37464e = true;
            com.igexin.c.a.c.a.a("DT_DetectResult|disc, ip is invalid, use domain = " + this.f37465g, new Object[0]);
            if (z11) {
                this.f37467i++;
            }
            return this.f37465g;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void a(int i11) {
        this.f37461b = i11;
    }

    private void b(String str) {
        this.f37460a = str;
    }

    private void a(long j11) {
        this.f37462c = j11;
    }

    private void b(boolean z11) {
        this.f37464e = z11;
    }

    public final synchronized void a(String str) {
        this.f37465g = str;
    }

    public final synchronized void a(String str, long j11, long j12) {
        this.f37460a = str;
        this.f37462c = j11;
        this.f37463d = j12;
        this.f37466h = 0;
        this.f37467i = 0;
        this.f37464e = false;
    }
}
