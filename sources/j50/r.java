package j50;

import h50.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public final class r implements f50.i<Character> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final r f63455a = new r();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final h50.f f63456b = new t2("kotlin.Char", e.c.f58513a);

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return f63456b;
    }

    @Override // f50.b0
    public /* bridge */ /* synthetic */ void b(i50.h hVar, Object obj) {
        h(hVar, ((Character) obj).charValue());
    }

    @Override // f50.e
    @m80.k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Character e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        return Character.valueOf(decoder.decodeChar());
    }

    public void h(@m80.k i50.h encoder, char c11) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        encoder.encodeChar(c11);
    }
}
