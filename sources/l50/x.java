package l50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nComposers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composers.kt\nkotlinx/serialization/json/internal/ComposerWithPrettyPrint\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1#2:105\n*E\n"})
/* loaded from: classes8.dex */
public final class x extends s {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final k50.a f70084c;

    /* renamed from: d, reason: collision with root package name */
    public int f70085d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(@m80.k e0 writer, @m80.k k50.a json) {
        super(writer);
        kotlin.jvm.internal.g0.p(writer, "writer");
        kotlin.jvm.internal.g0.p(json, "json");
        this.f70084c = json;
    }

    @Override // l50.s
    public void b() {
        o(true);
        this.f70085d++;
    }

    @Override // l50.s
    public void c() {
        o(false);
        k("\n");
        int i11 = this.f70085d;
        for (int i12 = 0; i12 < i11; i12++) {
            k(this.f70084c.i().s());
        }
    }

    @Override // l50.s
    public void d() {
        if (a()) {
            o(false);
        } else {
            c();
        }
    }

    @Override // l50.s
    public void p() {
        f(' ');
    }

    @Override // l50.s
    public void q() {
        this.f70085d--;
    }
}
