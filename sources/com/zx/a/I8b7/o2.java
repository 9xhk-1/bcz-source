package com.zx.a.I8b7;

import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class o2 {

    /* renamed from: a, reason: collision with root package name */
    public final x f46632a;

    /* renamed from: b, reason: collision with root package name */
    public final List<n0> f46633b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f46634c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f46635d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f46636e;

    /* renamed from: f, reason: collision with root package name */
    public final int f46637f;

    /* renamed from: g, reason: collision with root package name */
    public final int f46638g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public SSLSocketFactory f46641c;

        /* renamed from: b, reason: collision with root package name */
        public final List<n0> f46640b = new ArrayList();

        /* renamed from: a, reason: collision with root package name */
        public x f46639a = new x();

        /* renamed from: e, reason: collision with root package name */
        public boolean f46643e = true;

        /* renamed from: f, reason: collision with root package name */
        public int f46644f = 7000;

        /* renamed from: g, reason: collision with root package name */
        public int f46645g = 7000;

        /* renamed from: d, reason: collision with root package name */
        public HostnameVerifier f46642d = n2.f46614a;
    }

    public o2(a aVar) {
        this.f46632a = aVar.f46639a;
        List<n0> a11 = c2.a(aVar.f46640b);
        this.f46633b = a11;
        this.f46634c = aVar.f46641c;
        this.f46635d = aVar.f46642d;
        this.f46636e = aVar.f46643e;
        this.f46637f = aVar.f46644f;
        this.f46638g = aVar.f46645g;
        if (a11.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + a11);
        }
    }
}
