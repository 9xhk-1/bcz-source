package g50;

import f50.i;
import h50.e;
import h50.f;
import h50.l;
import i50.h;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d implements i<Long> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final d f52940a = new d();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final f f52941b = l.c("kotlinx.serialization.LongAsStringSerializer", e.i.f58519a);

    @Override // f50.i, f50.b0, f50.e
    @k
    public f a() {
        return f52941b;
    }

    @Override // f50.b0
    public /* bridge */ /* synthetic */ void b(h hVar, Object obj) {
        h(hVar, ((Number) obj).longValue());
    }

    @Override // f50.e
    @k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Long e(@k i50.f decoder) {
        g0.p(decoder, "decoder");
        return Long.valueOf(Long.parseLong(decoder.decodeString()));
    }

    public void h(@k h encoder, long j11) {
        g0.p(encoder, "encoder");
        encoder.encodeString(String.valueOf(j11));
    }
}
