package j50;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.h
@kotlin.jvm.internal.u0({"SMAP\nCollectionSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/MapLikeSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 4 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,283:1\n1#2:284\n489#3,2:285\n491#3,2:289\n32#4,2:287\n*S KotlinDebug\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/MapLikeSerializer\n*L\n118#1:285,2\n118#1:289,2\n121#1:287,2\n*E\n"})
/* loaded from: classes8.dex */
public abstract class p1<Key, Value, Collection, Builder extends Map<Key, Value>> extends a<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final f50.i<Key> f63447a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final f50.i<Value> f63448b;

    public /* synthetic */ p1(f50.i iVar, f50.i iVar2, kotlin.jvm.internal.v vVar) {
        this(iVar, iVar2);
    }

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public abstract h50.f a();

    @Override // j50.a, f50.b0
    public void b(@m80.k i50.h encoder, Collection collection) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        int k11 = k(collection);
        h50.f a11 = a();
        i50.e beginCollection = encoder.beginCollection(a11, k11);
        Iterator<Map.Entry<? extends Key, ? extends Value>> j11 = j(collection);
        int i11 = 0;
        while (j11.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = j11.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i12 = i11 + 1;
            beginCollection.encodeSerializableElement(a(), i11, s(), key);
            i11 += 2;
            beginCollection.encodeSerializableElement(a(), i12, t(), value);
        }
        beginCollection.endStructure(a11);
    }

    @m80.k
    public final f50.i<Key> s() {
        return this.f63447a;
    }

    @m80.k
    public final f50.i<Value> t() {
        return this.f63448b;
    }

    public abstract void u(@m80.k Builder builder, int i11, Key key, Value value);

    @Override // j50.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void m(@m80.k i50.d decoder, @m80.k Builder builder, int i11, int i12) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        kotlin.jvm.internal.g0.p(builder, "builder");
        if (i12 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        g10.j B1 = g10.u.B1(g10.u.W1(0, i12 * 2), 2);
        int d11 = B1.d();
        int f11 = B1.f();
        int g11 = B1.g();
        if ((g11 <= 0 || d11 > f11) && (g11 >= 0 || f11 > d11)) {
            return;
        }
        while (true) {
            n(decoder, i11 + d11, builder, false);
            if (d11 == f11) {
                return;
            } else {
                d11 += g11;
            }
        }
    }

    @Override // j50.a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final void n(@m80.k i50.d decoder, int i11, @m80.k Builder builder, boolean z11) {
        int i12;
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        kotlin.jvm.internal.g0.p(builder, "builder");
        Object g11 = i50.d.g(decoder, a(), i11, this.f63447a, null, 8, null);
        if (z11) {
            i12 = decoder.decodeElementIndex(a());
            if (i12 != i11 + 1) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + i11 + ", returned index for value: " + i12).toString());
            }
        } else {
            i12 = i11 + 1;
        }
        int i13 = i12;
        builder.put(g11, (!builder.containsKey(g11) || (this.f63448b.a().getKind() instanceof h50.e)) ? i50.d.g(decoder, a(), i13, this.f63448b, null, 8, null) : decoder.decodeSerializableElement(a(), i13, this.f63448b, a00.l1.K(builder, g11)));
    }

    public p1(f50.i<Key> iVar, f50.i<Value> iVar2) {
        super(null);
        this.f63447a = iVar;
        this.f63448b = iVar2;
    }
}
