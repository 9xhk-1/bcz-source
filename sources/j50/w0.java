package j50;

import h50.e;
import kotlin.time.Instant;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w30.h
@yz.v0
/* loaded from: classes8.dex */
public final class w0 implements f50.i<Instant> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final w0 f63495a = new w0();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final h50.f f63496b = new t2("kotlin.time.Instant", e.i.f58519a);

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return f63496b;
    }

    @Override // f50.e
    @m80.k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Instant e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        return Instant.Companion.j(decoder.decodeString());
    }

    @Override // f50.b0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void b(@m80.k i50.h encoder, @m80.k Instant value) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(value, "value");
        encoder.encodeString(value.toString());
    }
}
