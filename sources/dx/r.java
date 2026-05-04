package dx;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import y40.c0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final Long f48223a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.a<c0> f48224b;

    /* JADX WARN: Multi-variable type inference failed */
    public r(@m80.l Long l11, @m80.k x00.a<? extends c0> block) {
        g0.p(block, "block");
        this.f48223a = l11;
        this.f48224b = block;
    }

    @m80.k
    public final x00.a<c0> a() {
        return this.f48224b;
    }

    @m80.l
    public final Long b() {
        return this.f48223a;
    }

    public /* synthetic */ r(Long l11, x00.a aVar, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : l11, aVar);
    }
}
