package ix;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r0 extends xy.y1 {
    public r0() {
        this(0, 1, null);
    }

    @Override // xy.y1
    public void r(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        super.r(name);
        y0.f63006a.a(name);
    }

    @Override // xy.y1
    public void s(@m80.k String value) {
        kotlin.jvm.internal.g0.p(value, "value");
        super.s(value);
        y0.f63006a.b(value);
    }

    @Override // xy.y1, xy.v1
    @m80.k
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public q0 build() {
        return new s0(q());
    }

    public r0(int i11) {
        super(true, i11);
    }

    public /* synthetic */ r0(int i11, int i12, kotlin.jvm.internal.v vVar) {
        this((i12 & 1) != 0 ? 8 : i11);
    }
}
