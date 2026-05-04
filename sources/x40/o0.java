package x40;

import kotlinx.datetime.Month;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class o0 implements f50.i<Month> {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final o0 f97450b = new o0();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f50.i<Month> f97451a = p0.a("kotlinx.datetime.Month", Month.values());

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return this.f97451a.a();
    }

    @Override // f50.e
    @m80.k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Month e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        return this.f97451a.e(decoder);
    }

    @Override // f50.b0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void b(@m80.k i50.h encoder, @m80.k Month value) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(value, "value");
        this.f97451a.b(encoder, value);
    }
}
