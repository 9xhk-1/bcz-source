package x40;

import kotlin.LazyThreadSafetyMode;
import kotlinx.datetime.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l extends j50.b<kotlinx.datetime.b> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final l f97446a = new l();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final yz.c0 f97447b = yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: x40.k
        @Override // x00.a
        public final Object invoke() {
            f50.u p11;
            p11 = l.p();
            return p11;
        }
    });

    private final f50.u<kotlinx.datetime.b> o() {
        return (f50.u) f97447b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f50.u p() {
        return new f50.u("kotlinx.datetime.DateTimeUnit", kotlin.jvm.internal.o0.d(kotlinx.datetime.b.class), new h10.d[]{kotlin.jvm.internal.o0.d(b.c.class), kotlin.jvm.internal.o0.d(b.d.class), kotlin.jvm.internal.o0.d(b.e.class)}, new f50.i[]{p.f97452a, n0.f97448a, s0.f97460a});
    }

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return o().a();
    }

    @Override // j50.b
    @f50.h
    @m80.l
    public f50.e<kotlinx.datetime.b> i(@m80.k i50.d decoder, @m80.l String str) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        return o().i(decoder, str);
    }

    @Override // j50.b
    @m80.k
    public h10.d<kotlinx.datetime.b> k() {
        return kotlin.jvm.internal.o0.d(kotlinx.datetime.b.class);
    }

    @Override // j50.b
    @f50.h
    @m80.l
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public f50.b0<kotlinx.datetime.b> j(@m80.k i50.h encoder, @m80.k kotlinx.datetime.b value) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(value, "value");
        return o().j(encoder, value);
    }

    public static /* synthetic */ void n() {
    }
}
