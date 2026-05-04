package x40;

import kotlinx.datetime.DayOfWeek;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class q implements f50.i<DayOfWeek> {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final q f97454b = new q();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f50.i<DayOfWeek> f97455a = p0.a("kotlinx.datetime.DayOfWeek", DayOfWeek.values());

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return this.f97455a.a();
    }

    @Override // f50.e
    @m80.k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public DayOfWeek e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        return this.f97455a.e(decoder);
    }

    @Override // f50.b0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void b(@m80.k i50.h encoder, @m80.k DayOfWeek value) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(value, "value");
        this.f97455a.b(encoder, value);
    }
}
