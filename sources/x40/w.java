package x40;

import kotlinx.datetime.UtcOffset;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class w implements f50.i<UtcOffset> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f50.i<UtcOffset> f97471a;

    public w(@m80.k String name, @m80.k s40.e0<UtcOffset> format) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(format, "format");
        this.f97471a = c0.a(format, "kotlinx.datetime.UtcOffset/serializer/" + name);
    }

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return this.f97471a.a();
    }

    @Override // f50.e
    @m80.k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public UtcOffset e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        return this.f97471a.e(decoder);
    }

    @Override // f50.b0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void b(@m80.k i50.h encoder, @m80.k UtcOffset value) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(value, "value");
        this.f97471a.b(encoder, value);
    }
}
