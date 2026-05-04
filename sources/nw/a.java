package nw;

import g10.o;
import io.ktor.utils.io.g;
import ix.h0;
import java.io.File;
import kotlin.jvm.internal.g0;
import m80.k;
import mx.v;
import yy.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a extends v.e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final File f75381b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ix.k f75382c;

    public /* synthetic */ a(File file, ix.k kVar, int i11, kotlin.jvm.internal.v vVar) {
        this(file, (i11 & 2) != 0 ? h0.a(ix.k.f62843f, file) : kVar);
    }

    @Override // mx.v
    @k
    public Long a() {
        return Long.valueOf(this.f75381b.length());
    }

    @Override // mx.v
    @k
    public ix.k b() {
        return this.f75382c;
    }

    @Override // mx.v.e
    @k
    public g m() {
        return f.e(this.f75381b, 0L, 0L, null, 7, null);
    }

    @Override // mx.v.e
    @k
    public g n(@k o range) {
        g0.p(range, "range");
        return f.e(this.f75381b, range.d(), range.f(), null, 4, null);
    }

    @k
    public final File o() {
        return this.f75381b;
    }

    public a(@k File file, @k ix.k contentType) {
        g0.p(file, "file");
        g0.p(contentType, "contentType");
        this.f75381b = file;
        this.f75382c = contentType;
    }
}
