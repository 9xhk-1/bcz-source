package f50;

import h50.m;
import j50.o2;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.KotlinNothingValueException;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f
/* loaded from: classes8.dex */
public final class d<T> implements i<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final h10.d<T> f51035a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final i<T> f51036b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<i<?>> f51037c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final h50.f f51038d;

    public d(@m80.k h10.d<T> serializableClass, @m80.l i<T> iVar, @m80.k i<?>[] typeArgumentsSerializers) {
        kotlin.jvm.internal.g0.p(serializableClass, "serializableClass");
        kotlin.jvm.internal.g0.p(typeArgumentsSerializers, "typeArgumentsSerializers");
        this.f51035a = serializableClass;
        this.f51036b = iVar;
        this.f51037c = a00.q.t(typeArgumentsSerializers);
        this.f51038d = h50.b.e(h50.l.h("kotlinx.serialization.ContextualSerializer", m.a.f58539a, new h50.f[0], new x00.l() { // from class: f50.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 h11;
                h11 = d.h(d.this, (h50.a) obj);
                return h11;
            }
        }), serializableClass);
    }

    public static final g2 h(d dVar, h50.a buildSerialDescriptor) {
        h50.f a11;
        kotlin.jvm.internal.g0.p(buildSerialDescriptor, "$this$buildSerialDescriptor");
        i<T> iVar = dVar.f51036b;
        List<Annotation> annotations = (iVar == null || (a11 = iVar.a()) == null) ? null : a11.getAnnotations();
        if (annotations == null) {
            annotations = a00.h0.J();
        }
        buildSerialDescriptor.l(annotations);
        return g2.f100423a;
    }

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return this.f51038d;
    }

    @Override // f50.b0
    public void b(@m80.k i50.h encoder, @m80.k T value) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(value, "value");
        encoder.encodeSerializableValue(i(encoder.getSerializersModule()), value);
    }

    @Override // f50.e
    @m80.k
    public T e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        return (T) decoder.decodeSerializableValue(i(decoder.getSerializersModule()));
    }

    public final i<T> i(o50.f fVar) {
        i<T> c11 = fVar.c(this.f51035a, this.f51037c);
        if (c11 != null) {
            return c11;
        }
        i<T> iVar = this.f51036b;
        if (iVar != null) {
            return iVar;
        }
        j50.g2.j(this.f51035a);
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(@m80.k h10.d<T> serializableClass) {
        this(serializableClass, null, o2.f63442a);
        kotlin.jvm.internal.g0.p(serializableClass, "serializableClass");
    }
}
