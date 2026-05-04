package zs;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l60.k f102865a;

    /* JADX WARN: Multi-variable type inference failed */
    @w00.k
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f102865a.close();
    }

    @Override // zs.e
    @l
    public Object g(@k j00.c<? super g2> cVar) {
        this.f102865a.flush();
        return g2.f100423a;
    }

    @Override // zs.e
    public int read(@k byte[] buffer, int i11, int i12) {
        g0.p(buffer, "buffer");
        return this.f102865a.read(buffer, i11, i12);
    }

    @Override // zs.e
    public void write(@k byte[] buffer, int i11, int i12) {
        g0.p(buffer, "buffer");
        this.f102865a.write(buffer, i11, i12);
    }

    @w00.k
    public a(@k l60.k b11) {
        g0.p(b11, "b");
        this.f102865a = b11;
    }

    public /* synthetic */ a(l60.k kVar, int i11, v vVar) {
        this((i11 & 1) != 0 ? new l60.k() : kVar);
    }
}
