package j50;

import j50.p2;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
@kotlin.jvm.internal.u0({"SMAP\nCollectionSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/PrimitiveArraySerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n*L\n1#1,283:1\n489#2,4:284\n*S KotlinDebug\n*F\n+ 1 CollectionSerializers.kt\nkotlinx/serialization/internal/PrimitiveArraySerializer\n*L\n174#1:284,4\n*E\n"})
/* loaded from: classes8.dex */
public abstract class r2<Element, Array, Builder extends p2<Array>> extends x<Element, Array, Builder> {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final h50.f f63458b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(@m80.k f50.i<Element> primitiveSerializer) {
        super(primitiveSerializer, null);
        kotlin.jvm.internal.g0.p(primitiveSerializer, "primitiveSerializer");
        this.f63458b = new q2(primitiveSerializer.a());
    }

    @Override // j50.a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final Array r(@m80.k Builder builder) {
        kotlin.jvm.internal.g0.p(builder, "<this>");
        return (Array) builder.a();
    }

    public abstract void B(@m80.k i50.e eVar, Array array, int i11);

    @Override // j50.x, f50.i, f50.b0, f50.e
    @m80.k
    public final h50.f a() {
        return this.f63458b;
    }

    @Override // j50.x, j50.a, f50.b0
    public final void b(@m80.k i50.h encoder, Array array) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        int k11 = k(array);
        h50.f fVar = this.f63458b;
        i50.e beginCollection = encoder.beginCollection(fVar, k11);
        B(beginCollection, array, k11);
        beginCollection.endStructure(fVar);
    }

    @Override // j50.a, f50.e
    public final Array e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        return l(decoder, null);
    }

    @Override // j50.a
    @m80.k
    public final Iterator<Element> j(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // j50.a
    @m80.k
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final Builder g() {
        return (Builder) q(x());
    }

    @Override // j50.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final int h(@m80.k Builder builder) {
        kotlin.jvm.internal.g0.p(builder, "<this>");
        return builder.d();
    }

    @Override // j50.a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final void i(@m80.k Builder builder, int i11) {
        kotlin.jvm.internal.g0.p(builder, "<this>");
        builder.b(i11);
    }

    public abstract Array x();

    @Override // j50.x
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final void t(@m80.k Builder builder, int i11, Element element) {
        kotlin.jvm.internal.g0.p(builder, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract void z(@m80.k i50.d dVar, int i11, @m80.k Builder builder, boolean z11);
}
