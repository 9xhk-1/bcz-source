package j50;

import kotlinx.serialization.SerializationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
@kotlin.jvm.internal.u0({"SMAP\nTuples.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tuples.kt\nkotlinx/serialization/internal/KeyValueSerializer\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,168:1\n571#2,4:169\n*S KotlinDebug\n*F\n+ 1 Tuples.kt\nkotlinx/serialization/internal/KeyValueSerializer\n*L\n35#1:169,4\n*E\n"})
/* loaded from: classes8.dex */
public abstract class d1<K, V, R> implements f50.i<R> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final f50.i<K> f63345a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final f50.i<V> f63346b;

    public /* synthetic */ d1(f50.i iVar, f50.i iVar2, kotlin.jvm.internal.v vVar) {
        this(iVar, iVar2);
    }

    @Override // f50.b0
    public void b(@m80.k i50.h encoder, R r11) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        i50.e beginStructure = encoder.beginStructure(a());
        beginStructure.encodeSerializableElement(a(), 0, this.f63345a, g(r11));
        beginStructure.encodeSerializableElement(a(), 1, this.f63346b, i(r11));
        beginStructure.endStructure(a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f50.e
    public R e(@m80.k i50.f decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        R r11;
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        h50.f a11 = a();
        i50.d beginStructure = decoder.beginStructure(a11);
        if (beginStructure.decodeSequentially()) {
            r11 = (R) k(i50.d.g(beginStructure, a(), 0, h(), null, 8, null), i50.d.g(beginStructure, a(), 1, j(), null, 8, null));
        } else {
            obj = l3.f63420a;
            obj2 = l3.f63420a;
            Object obj5 = obj2;
            while (true) {
                int decodeElementIndex = beginStructure.decodeElementIndex(a());
                if (decodeElementIndex == -1) {
                    obj3 = l3.f63420a;
                    if (obj == obj3) {
                        throw new SerializationException("Element 'key' is missing");
                    }
                    obj4 = l3.f63420a;
                    if (obj5 == obj4) {
                        throw new SerializationException("Element 'value' is missing");
                    }
                    r11 = (R) k(obj, obj5);
                } else if (decodeElementIndex == 0) {
                    obj = i50.d.g(beginStructure, a(), 0, h(), null, 8, null);
                } else {
                    if (decodeElementIndex != 1) {
                        throw new SerializationException("Invalid index: " + decodeElementIndex);
                    }
                    obj5 = i50.d.g(beginStructure, a(), 1, j(), null, 8, null);
                }
            }
        }
        beginStructure.endStructure(a11);
        return r11;
    }

    public abstract K g(R r11);

    @m80.k
    public final f50.i<K> h() {
        return this.f63345a;
    }

    public abstract V i(R r11);

    @m80.k
    public final f50.i<V> j() {
        return this.f63346b;
    }

    public abstract R k(K k11, V v11);

    public d1(f50.i<K> iVar, f50.i<V> iVar2) {
        this.f63345a = iVar;
        this.f63346b = iVar2;
    }
}
