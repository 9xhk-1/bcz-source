package com.android.volley;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class VolleyError extends Exception {
    public final NetworkResponse networkResponse;
    private long networkTimeMs;

    public VolleyError() {
        this.networkResponse = null;
    }

    public long getNetworkTimeMs() {
        return this.networkTimeMs;
    }

    public void setNetworkTimeMs(long j11) {
        this.networkTimeMs = j11;
    }

    public VolleyError(NetworkResponse networkResponse) {
        this.networkResponse = networkResponse;
    }

    public VolleyError(String str) {
        super(str);
        this.networkResponse = null;
    }

    public VolleyError(String str, Throwable th2) {
        super(str, th2);
        this.networkResponse = null;
    }

    public VolleyError(Throwable th2) {
        super(th2);
        this.networkResponse = null;
    }
}
