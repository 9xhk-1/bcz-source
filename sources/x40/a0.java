package x40;

import kotlinx.datetime.LocalDate;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a0 implements f50.i<LocalDate> {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a0 f97411b = new a0();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f50.i<LocalDate> f97412a = c0.a(LocalDate.b.f68483a.a(), "kotlinx.datetime.LocalDate/ISO");

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return this.f97412a.a();
    }

    @Override // f50.e
    @m80.k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public LocalDate e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        return this.f97412a.e(decoder);
    }

    @Override // f50.b0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void b(@m80.k i50.h encoder, @m80.k LocalDate value) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(value, "value");
        this.f97412a.b(encoder, value);
    }
}
