package j50;

import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
@kotlin.jvm.internal.u0({"SMAP\nCollectionSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/CollectionLikeSerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,283:1\n489#2,4:284\n1#3:288\n*S KotlinDebug\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/CollectionLikeSerializer\n*L\n66#1:284,4\n*E\n"})
/* loaded from: classes8.dex */
public abstract class x<Element, Collection, Builder> extends a<Element, Collection, Builder> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final f50.i<Element> f63503a;

    public /* synthetic */ x(f50.i iVar, kotlin.jvm.internal.v vVar) {
        this(iVar);
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
        Iterator<Element> j11 = j(collection);
        for (int i11 = 0; i11 < k11; i11++) {
            beginCollection.encodeSerializableElement(a(), i11, this.f63503a, j11.next());
        }
        beginCollection.endStructure(a11);
    }

    @Override // j50.a
    public final void m(@m80.k i50.d decoder, Builder builder, int i11, int i12) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        if (i12 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i13 = 0; i13 < i12; i13++) {
            n(decoder, i11 + i13, builder, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j50.a
    public void n(@m80.k i50.d decoder, int i11, Builder builder, boolean z11) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        t(builder, i11, i50.d.g(decoder, a(), i11, this.f63503a, null, 8, null));
    }

    public abstract void t(Builder builder, int i11, Element element);

    public x(f50.i<Element> iVar) {
        super(null);
        this.f63503a = iVar;
    }
}
