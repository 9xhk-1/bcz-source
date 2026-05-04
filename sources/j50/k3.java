package j50;

import kotlin.Triple;
import kotlinx.serialization.SerializationException;
import xo.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public final class k3<A, B, C> implements f50.i<Triple<? extends A, ? extends B, ? extends C>> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final f50.i<A> f63400a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final f50.i<B> f63401b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final f50.i<C> f63402c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final h50.f f63403d;

    public k3(@m80.k f50.i<A> aSerializer, @m80.k f50.i<B> bSerializer, @m80.k f50.i<C> cSerializer) {
        kotlin.jvm.internal.g0.p(aSerializer, "aSerializer");
        kotlin.jvm.internal.g0.p(bSerializer, "bSerializer");
        kotlin.jvm.internal.g0.p(cSerializer, "cSerializer");
        this.f63400a = aSerializer;
        this.f63401b = bSerializer;
        this.f63402c = cSerializer;
        this.f63403d = h50.l.e("kotlin.Triple", new h50.f[0], new x00.l() { // from class: j50.j3
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 j11;
                j11 = k3.j(k3.this, (h50.a) obj);
                return j11;
            }
        });
    }

    public static final yz.g2 j(k3 k3Var, h50.a buildClassSerialDescriptor) {
        kotlin.jvm.internal.g0.p(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        h50.a.b(buildClassSerialDescriptor, "first", k3Var.f63400a.a(), null, false, 12, null);
        h50.a.b(buildClassSerialDescriptor, n.r.f98264f, k3Var.f63401b.a(), null, false, 12, null);
        h50.a.b(buildClassSerialDescriptor, com.alipay.sdk.m.k.b.f10659o, k3Var.f63402c.a(), null, false, 12, null);
        return yz.g2.f100423a;
    }

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return this.f63403d;
    }

    public final Triple<A, B, C> h(i50.d dVar) {
        Object g11 = i50.d.g(dVar, a(), 0, this.f63400a, null, 8, null);
        Object g12 = i50.d.g(dVar, a(), 1, this.f63401b, null, 8, null);
        Object g13 = i50.d.g(dVar, a(), 2, this.f63402c, null, 8, null);
        dVar.endStructure(a());
        return new Triple<>(g11, g12, g13);
    }

    public final Triple<A, B, C> i(i50.d dVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        i50.d dVar2;
        obj = l3.f63420a;
        obj2 = l3.f63420a;
        obj3 = l3.f63420a;
        while (true) {
            int decodeElementIndex = dVar.decodeElementIndex(a());
            if (decodeElementIndex == -1) {
                dVar.endStructure(a());
                obj4 = l3.f63420a;
                if (obj == obj4) {
                    throw new SerializationException("Element 'first' is missing");
                }
                obj5 = l3.f63420a;
                if (obj2 == obj5) {
                    throw new SerializationException("Element 'second' is missing");
                }
                obj6 = l3.f63420a;
                if (obj3 != obj6) {
                    return new Triple<>(obj, obj2, obj3);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (decodeElementIndex == 0) {
                dVar2 = dVar;
                obj = i50.d.g(dVar2, a(), 0, this.f63400a, null, 8, null);
            } else if (decodeElementIndex == 1) {
                dVar2 = dVar;
                obj2 = i50.d.g(dVar2, a(), 1, this.f63401b, null, 8, null);
            } else {
                if (decodeElementIndex != 2) {
                    throw new SerializationException("Unexpected index " + decodeElementIndex);
                }
                obj3 = i50.d.g(dVar, a(), 2, this.f63402c, null, 8, null);
            }
            dVar = dVar2;
        }
    }

    @Override // f50.e
    @m80.k
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Triple<A, B, C> e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        i50.d beginStructure = decoder.beginStructure(a());
        return beginStructure.decodeSequentially() ? h(beginStructure) : i(beginStructure);
    }

    @Override // f50.b0
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void b(@m80.k i50.h encoder, @m80.k Triple<? extends A, ? extends B, ? extends C> value) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(value, "value");
        i50.e beginStructure = encoder.beginStructure(a());
        beginStructure.encodeSerializableElement(a(), 0, this.f63400a, value.getFirst());
        beginStructure.encodeSerializableElement(a(), 1, this.f63401b, value.getSecond());
        beginStructure.encodeSerializableElement(a(), 2, this.f63402c, value.getThird());
        beginStructure.endStructure(a());
    }
}
