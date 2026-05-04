package com.android.volley;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class NetworkError extends VolleyError {
    public NetworkError() {
    }

    public NetworkError(Throwable th2) {
        super(th2);
    }

    public NetworkError(NetworkResponse networkResponse) {
        super(networkResponse);
    }
}
