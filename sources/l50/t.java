package l50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r1
/* loaded from: classes8.dex */
public final class t extends s {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f70067c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(@m80.k e0 writer, boolean z11) {
        super(writer);
        kotlin.jvm.internal.g0.p(writer, "writer");
        this.f70067c = z11;
    }

    @Override // l50.s
    public void n(@m80.k String value) {
        kotlin.jvm.internal.g0.p(value, "value");
        if (this.f70067c) {
            super.n(value);
        } else {
            super.k(value);
        }
    }
}
