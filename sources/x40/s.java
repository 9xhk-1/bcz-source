package x40;

import h50.e;
import kotlin.time.Instant;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class s implements f50.i<Instant> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final s40.e0<s40.l> f97458a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final h50.f f97459b;

    public s(@m80.k String name, @m80.k s40.e0<s40.l> format) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(format, "format");
        this.f97458a = format;
        this.f97459b = h50.l.c("kotlin.time.Instant/serializer/" + name, e.i.f58519a);
    }

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return this.f97459b;
    }

    @Override // f50.e
    @m80.k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Instant e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        return kotlinx.datetime.f.n(Instant.Companion, decoder.decodeString(), this.f97458a);
    }

    @Override // f50.b0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void b(@m80.k i50.h encoder, @m80.k Instant value) {
        String d11;
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(value, "value");
        d11 = kotlinx.datetime.g.d(value, this.f97458a, null, 2, null);
        encoder.encodeString(d11);
    }

    @m80.k
    public String toString() {
        return a().k();
    }
}
