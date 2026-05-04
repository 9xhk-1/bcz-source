package j50;

import kotlinx.serialization.SerializationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public final class w1 implements f50.i {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final w1 f63497a = new w1();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final h50.f f63498b = v1.f63482a;

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return f63498b;
    }

    @Override // f50.e
    @m80.k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Void e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }

    @Override // f50.b0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void b(@m80.k i50.h encoder, @m80.k Void value) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(value, "value");
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }
}
