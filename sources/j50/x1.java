package j50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public final class x1<T> implements f50.i<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final f50.i<T> f63506a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final h50.f f63507b;

    public x1(@m80.k f50.i<T> serializer) {
        kotlin.jvm.internal.g0.p(serializer, "serializer");
        this.f63506a = serializer;
        this.f63507b = new w2(serializer.a());
    }

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return this.f63507b;
    }

    @Override // f50.b0
    public void b(@m80.k i50.h encoder, @m80.l T t11) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        if (t11 == null) {
            encoder.encodeNull();
        } else {
            encoder.encodeNotNullMark();
            encoder.encodeSerializableValue(this.f63506a, t11);
        }
    }

    @Override // f50.e
    @m80.l
    public T e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        return decoder.decodeNotNullMark() ? (T) decoder.decodeSerializableValue(this.f63506a) : (T) decoder.decodeNull();
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && x1.class == obj.getClass() && kotlin.jvm.internal.g0.g(this.f63506a, ((x1) obj).f63506a);
    }

    public int hashCode() {
        return this.f63506a.hashCode();
    }
}
