package j40;

import c40.m0;
import h40.y;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b extends e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final b f63185g = new b();

    public b() {
        super(i.f63197c, i.f63198d, i.f63199e, i.f63195a);
    }

    public final void U() {
        super.close();
    }

    @Override // j40.e, c40.v1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // c40.m0
    @m80.k
    public m0 limitedParallelism(int i11, @m80.l String str) {
        y.a(i11);
        return i11 >= i.f63197c ? y.b(this, str) : super.limitedParallelism(i11, str);
    }

    @Override // c40.m0
    @m80.k
    public String toString() {
        return "Dispatchers.Default";
    }
}
