package qk;

import androidx.annotation.NonNull;
import java.io.InputStream;
import java.net.URL;
import pk.o;
import pk.p;
import pk.s;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class i implements o<URL, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    public final o<pk.h, InputStream> f82368a;

    public i(o<pk.h, InputStream> oVar) {
        this.f82368a = oVar;
    }

    @Override // pk.o
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public o.a<InputStream> buildLoadData(@NonNull URL url, int i11, int i12, @NonNull ik.e eVar) {
        return this.f82368a.buildLoadData(new pk.h(url), i11, i12, eVar);
    }

    @Override // pk.o
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean handles(@NonNull URL url) {
        return true;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements p<URL, InputStream> {
        @Override // pk.p
        @NonNull
        public o<URL, InputStream> build(s sVar) {
            return new i(sVar.d(pk.h.class, InputStream.class));
        }

        @Override // pk.p
        public void teardown() {
        }
    }
}
