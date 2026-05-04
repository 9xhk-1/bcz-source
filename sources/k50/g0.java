package k50;

import h50.m;
import kotlinx.serialization.json.internal.JsonDecodingException;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@v0
/* loaded from: classes8.dex */
public final class g0 implements f50.i<f0> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final g0 f65961a = new g0();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final h50.f f65962b = h50.l.i("kotlinx.serialization.json.JsonNull", m.b.f58540a, new h50.f[0], null, 8, null);

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return f65962b;
    }

    @Override // f50.e
    @m80.k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public f0 e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        w.g(decoder);
        if (decoder.decodeNotNullMark()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        decoder.decodeNull();
        return f0.INSTANCE;
    }

    @Override // f50.b0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void b(@m80.k i50.h encoder, @m80.k f0 value) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(value, "value");
        w.h(encoder);
        encoder.encodeNull();
    }
}
