package a60;

import kotlin.jvm.internal.g0;
import l60.m;
import m80.l;
import okhttp3.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h extends o {

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f2017c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2018d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final m f2019e;

    public h(@l String str, long j11, @m80.k m source) {
        g0.p(source, "source");
        this.f2017c = str;
        this.f2018d = j11;
        this.f2019e = source;
    }

    @Override // okhttp3.o
    @m80.k
    public m V() {
        return this.f2019e;
    }

    @Override // okhttp3.o
    public long q() {
        return this.f2018d;
    }

    @Override // okhttp3.o
    @l
    public okhttp3.j r() {
        String str = this.f2017c;
        if (str != null) {
            return okhttp3.j.f77447e.d(str);
        }
        return null;
    }
}
