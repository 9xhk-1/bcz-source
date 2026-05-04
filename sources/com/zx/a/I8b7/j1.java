package com.zx.a.I8b7;

import com.zx.a.I8b7.n0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class j1 implements n0.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f46550a;

    /* renamed from: b, reason: collision with root package name */
    public final List<n0> f46551b;

    /* renamed from: c, reason: collision with root package name */
    public final q1 f46552c;

    /* renamed from: d, reason: collision with root package name */
    public final HttpURLConnection f46553d;

    public j1(List<n0> list, HttpURLConnection httpURLConnection, int i11, q1 q1Var) {
        this.f46551b = list;
        this.f46553d = httpURLConnection;
        this.f46550a = i11;
        this.f46552c = q1Var;
    }

    public t1 a(q1 q1Var, HttpURLConnection httpURLConnection) throws IOException {
        if (this.f46550a >= this.f46551b.size()) {
            throw new AssertionError();
        }
        List<n0> list = this.f46551b;
        int i11 = this.f46550a;
        j1 j1Var = new j1(list, httpURLConnection, i11 + 1, q1Var);
        n0 n0Var = list.get(i11);
        t1 a11 = n0Var.a(j1Var);
        if (a11 == null) {
            throw new NullPointerException("interceptor " + n0Var + " returned null");
        }
        if (a11.f46694e != null) {
            return a11;
        }
        throw new IllegalStateException("interceptor " + n0Var + " returned a response with no body");
    }
}
