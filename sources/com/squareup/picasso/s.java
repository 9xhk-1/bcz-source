package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.a0;
import java.io.IOException;
import okhttp3.c;
import okhttp3.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class s extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public static final String f41944c = "http";

    /* renamed from: d, reason: collision with root package name */
    public static final String f41945d = "https";

    /* renamed from: a, reason: collision with root package name */
    public final k f41946a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f41947b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends IOException {
        public a(String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final int f41948a;

        /* renamed from: b, reason: collision with root package name */
        public final int f41949b;

        public b(int i11, int i12) {
            super("HTTP " + i11);
            this.f41948a = i11;
            this.f41949b = i12;
        }
    }

    public s(k kVar, c0 c0Var) {
        this.f41946a = kVar;
        this.f41947b = c0Var;
    }

    public static okhttp3.l a(y yVar, int i11) {
        okhttp3.c cVar;
        if (i11 == 0) {
            cVar = null;
        } else if (NetworkPolicy.isOfflineOnly(i11)) {
            cVar = okhttp3.c.f77158p;
        } else {
            c.a aVar = new c.a();
            if (!NetworkPolicy.shouldReadFromDiskCache(i11)) {
                aVar.g();
            }
            if (!NetworkPolicy.shouldWriteToDiskCache(i11)) {
                aVar.h();
            }
            cVar = aVar.a();
        }
        l.a B = new l.a().B(yVar.f41978d.toString());
        if (cVar != null) {
            B.c(cVar);
        }
        return B.b();
    }

    @Override // com.squareup.picasso.a0
    public boolean canHandleRequest(y yVar) {
        String scheme = yVar.f41978d.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    @Override // com.squareup.picasso.a0
    public int getRetryCount() {
        return 2;
    }

    @Override // com.squareup.picasso.a0
    public a0.a load(y yVar, int i11) throws IOException {
        okhttp3.n a11 = this.f41946a.a(a(yVar, i11));
        okhttp3.o L = a11.L();
        if (!a11.S5()) {
            L.close();
            throw new b(a11.Z(), yVar.f41977c);
        }
        Picasso.LoadedFrom loadedFrom = a11.U() == null ? Picasso.LoadedFrom.NETWORK : Picasso.LoadedFrom.DISK;
        if (loadedFrom == Picasso.LoadedFrom.DISK && L.q() == 0) {
            L.close();
            throw new a("Received response with 0 content-length header.");
        }
        if (loadedFrom == Picasso.LoadedFrom.NETWORK && L.q() > 0) {
            this.f41947b.f(L.q());
        }
        return new a0.a(L.V(), loadedFrom);
    }

    @Override // com.squareup.picasso.a0
    public boolean shouldRetry(boolean z11, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    @Override // com.squareup.picasso.a0
    public boolean supportsReplay() {
        return true;
    }
}
