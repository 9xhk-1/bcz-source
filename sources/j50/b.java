package j50;

import kotlin.jvm.internal.Ref;
import kotlinx.serialization.SerializationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.h
@kotlin.jvm.internal.u0({"SMAP\nAbstractPolymorphicSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractPolymorphicSerializer.kt\nkotlinx/serialization/internal/AbstractPolymorphicSerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 4 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,115:1\n476#2,2:116\n478#2,2:119\n82#3:118\n571#4,2:121\n573#4,2:124\n1#5:123\n*S KotlinDebug\n*F\n+ 1 AbstractPolymorphicSerializer.kt\nkotlinx/serialization/internal/AbstractPolymorphicSerializer\n*L\n33#1:116,2\n33#1:119,2\n35#1:118\n39#1:121,2\n39#1:124,2\n*E\n"})
/* loaded from: classes8.dex */
public abstract class b<T> implements f50.i<T> {
    @Override // f50.b0
    public final void b(@m80.k i50.h encoder, @m80.k T value) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(value, "value");
        f50.b0<? super T> b11 = f50.p.b(this, encoder, value);
        h50.f a11 = a();
        i50.e beginStructure = encoder.beginStructure(a11);
        beginStructure.encodeStringElement(a(), 0, b11.a().k());
        h50.f a12 = a();
        kotlin.jvm.internal.g0.n(b11, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        beginStructure.encodeSerializableElement(a12, 1, b11, value);
        beginStructure.endStructure(a11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f50.e
    @m80.k
    public final T e(@m80.k i50.f decoder) {
        T t11;
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        h50.f a11 = a();
        i50.d beginStructure = decoder.beginStructure(a11);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (beginStructure.decodeSequentially()) {
            t11 = (T) h(beginStructure);
        } else {
            Object obj = null;
            while (true) {
                int decodeElementIndex = beginStructure.decodeElementIndex(a());
                if (decodeElementIndex != -1) {
                    if (decodeElementIndex == 0) {
                        objectRef.element = (T) beginStructure.decodeStringElement(a(), decodeElementIndex);
                    } else {
                        if (decodeElementIndex != 1) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Invalid index in polymorphic deserialization of ");
                            String str = (String) objectRef.element;
                            if (str == null) {
                                str = "unknown class";
                            }
                            sb2.append(str);
                            sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                            sb2.append(decodeElementIndex);
                            throw new SerializationException(sb2.toString());
                        }
                        T t12 = objectRef.element;
                        if (t12 == 0) {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                        }
                        objectRef.element = t12;
                        obj = i50.d.g(beginStructure, a(), decodeElementIndex, f50.p.a(this, beginStructure, (String) t12), null, 8, null);
                    }
                } else {
                    if (obj == null) {
                        throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) objectRef.element)).toString());
                    }
                    kotlin.jvm.internal.g0.n(obj, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer");
                    t11 = (T) obj;
                }
            }
        }
        beginStructure.endStructure(a11);
        return t11;
    }

    public final T h(i50.d dVar) {
        return (T) i50.d.g(dVar, a(), 1, f50.p.a(this, dVar, dVar.decodeStringElement(a(), 0)), null, 8, null);
    }

    @f50.h
    @m80.l
    public f50.e<T> i(@m80.k i50.d decoder, @m80.l String str) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        return decoder.getSerializersModule().g(k(), str);
    }

    @f50.h
    @m80.l
    public f50.b0<T> j(@m80.k i50.h encoder, @m80.k T value) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(value, "value");
        return encoder.getSerializersModule().h(k(), value);
    }

    @m80.k
    public abstract h10.d<T> k();
}
