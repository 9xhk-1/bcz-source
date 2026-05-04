package l50;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final j50.g0 f69997a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f69998b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements x00.p<h50.f, Integer, Boolean> {
        public a(Object obj) {
            super(2, obj, h0.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        public final Boolean a(h50.f p02, int i11) {
            kotlin.jvm.internal.g0.p(p02, "p0");
            return Boolean.valueOf(((h0) this.receiver).e(p02, i11));
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Boolean invoke(h50.f fVar, Integer num) {
            return a(fVar, num.intValue());
        }
    }

    public h0(@m80.k h50.f descriptor) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        this.f69997a = new j50.g0(descriptor, new a(this));
    }

    public final boolean b() {
        return this.f69998b;
    }

    public final void c(int i11) {
        this.f69997a.a(i11);
    }

    public final int d() {
        return this.f69997a.d();
    }

    public final boolean e(h50.f fVar, int i11) {
        boolean z11 = !fVar.l(i11) && fVar.e(i11).b();
        this.f69998b = z11;
        return z11;
    }
}
