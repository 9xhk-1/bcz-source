package x40;

import h50.e;
import kotlinx.serialization.SerializationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r implements f50.i<kotlinx.datetime.c> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final r f97456a = new r();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final h50.f f97457b = h50.l.c("kotlinx.datetime.FixedOffsetTimeZone", e.i.f58519a);

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return f97457b;
    }

    @Override // f50.e
    @m80.k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public kotlinx.datetime.c e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        kotlinx.datetime.q d11 = kotlinx.datetime.q.Companion.d(decoder.decodeString());
        if (d11 instanceof kotlinx.datetime.c) {
            return (kotlinx.datetime.c) d11;
        }
        throw new SerializationException("Timezone identifier '" + d11 + "' does not correspond to a fixed-offset timezone");
    }

    @Override // f50.b0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void b(@m80.k i50.h encoder, @m80.k kotlinx.datetime.c value) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(value, "value");
        encoder.encodeString(value.b());
    }
}
