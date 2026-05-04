package k50;

import h50.d;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.SerializationException;
import u30.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class h<T> implements f50.i<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final h10.d<T> f65963a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final h50.f f65964b;

    public h(@m80.k h10.d<T> baseClass) {
        kotlin.jvm.internal.g0.p(baseClass, "baseClass");
        this.f65963a = baseClass;
        this.f65964b = h50.l.i("JsonContentPolymorphicSerializer<" + baseClass.C() + u0.f91710f, d.b.f58510a, new h50.f[0], null, 8, null);
    }

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return this.f65964b;
    }

    @Override // f50.b0
    public final void b(@m80.k i50.h encoder, @m80.k T value) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(value, "value");
        f50.i h11 = encoder.getSerializersModule().h(this.f65963a, value);
        if (h11 == null) {
            f50.i p11 = f50.k0.p(kotlin.jvm.internal.o0.d(value.getClass()));
            if (p11 == null) {
                h(kotlin.jvm.internal.o0.d(value.getClass()), this.f65963a);
                throw new KotlinNothingValueException();
            }
            h11 = p11;
        }
        ((f50.i) h11).b(encoder, value);
    }

    @Override // f50.e
    @m80.k
    public final T e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        i d11 = w.d(decoder);
        k i11 = d11.i();
        f50.e<T> g11 = g(i11);
        kotlin.jvm.internal.g0.n(g11, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>");
        return (T) d11.a().e((f50.i) g11, i11);
    }

    @m80.k
    public abstract f50.e<T> g(@m80.k k kVar);

    public final Void h(h10.d<?> dVar, h10.d<?> dVar2) {
        String C = dVar.C();
        if (C == null) {
            C = String.valueOf(dVar);
        }
        throw new SerializationException("Class '" + C + "' is not registered for polymorphic serialization " + ("in the scope of '" + dVar2.C() + '\'') + ".\nMark the base class as 'sealed' or register the serializer explicitly.");
    }
}
