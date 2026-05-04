package x40;

import h50.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class t0 implements f50.i<kotlinx.datetime.q> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final t0 f97463a = new t0();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final h50.f f97464b = h50.l.c("kotlinx.datetime.TimeZone", e.i.f58519a);

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return f97464b;
    }

    @Override // f50.e
    @m80.k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public kotlinx.datetime.q e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        return kotlinx.datetime.q.Companion.d(decoder.decodeString());
    }

    @Override // f50.b0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void b(@m80.k i50.h encoder, @m80.k kotlinx.datetime.q value) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(value, "value");
        encoder.encodeString(value.b());
    }
}
