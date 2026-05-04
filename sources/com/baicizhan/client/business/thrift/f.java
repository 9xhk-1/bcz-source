package com.baicizhan.client.business.thrift;

import java.io.IOException;
import l60.r0;
import l60.y;
import t50.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class f implements t50.n {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends okhttp3.m {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ okhttp3.m f16597b;

        public a(final okhttp3.m val$body) {
            this.f16597b = val$body;
        }

        @Override // okhttp3.m
        public long a() {
            return -1L;
        }

        @Override // okhttp3.m
        public okhttp3.j b() {
            return this.f16597b.b();
        }

        @Override // okhttp3.m
        public void r(l60.l sink) throws IOException {
            l60.l d11 = r0.d(new y(sink));
            this.f16597b.r(d11);
            d11.close();
        }
    }

    public final okhttp3.m a(final okhttp3.m body) {
        return new a(body);
    }

    @Override // t50.n
    public okhttp3.n intercept(n.a chain) throws IOException {
        okhttp3.l request = chain.request();
        return (request.f() == null || request.i("Content-Encoding") != null) ? chain.c(request) : chain.c(request.n().n("Compress-Type", "gzip").n("content-encoding", "gzip").p(request.m(), a(request.f())).b());
    }
}
