package j50;

import h50.n;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.SerializationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
@kotlin.jvm.internal.u0({"SMAP\nObjectSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectSerializer.kt\nkotlinx/serialization/internal/ObjectSerializer\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,57:1\n571#2,4:58\n*S KotlinDebug\n*F\n+ 1 ObjectSerializer.kt\nkotlinx/serialization/internal/ObjectSerializer\n*L\n43#1:58,4\n*E\n"})
/* loaded from: classes8.dex */
public final class a2<T> implements f50.i<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final T f63330a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public List<? extends Annotation> f63331b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final yz.c0 f63332c;

    public a2(@m80.k final String serialName, @m80.k T objectInstance) {
        kotlin.jvm.internal.g0.p(serialName, "serialName");
        kotlin.jvm.internal.g0.p(objectInstance, "objectInstance");
        this.f63330a = objectInstance;
        this.f63331b = a00.h0.J();
        this.f63332c = yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: j50.y1
            @Override // x00.a
            public final Object invoke() {
                h50.f i11;
                i11 = a2.i(serialName, this);
                return i11;
            }
        });
    }

    public static final h50.f i(String str, final a2 a2Var) {
        return h50.l.h(str, n.d.f58544a, new h50.f[0], new x00.l() { // from class: j50.z1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 j11;
                j11 = a2.j(a2.this, (h50.a) obj);
                return j11;
            }
        });
    }

    public static final yz.g2 j(a2 a2Var, h50.a buildSerialDescriptor) {
        kotlin.jvm.internal.g0.p(buildSerialDescriptor, "$this$buildSerialDescriptor");
        buildSerialDescriptor.l(a2Var.f63331b);
        return yz.g2.f100423a;
    }

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return (h50.f) this.f63332c.getValue();
    }

    @Override // f50.b0
    public void b(@m80.k i50.h encoder, @m80.k T value) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(value, "value");
        encoder.beginStructure(a()).endStructure(a());
    }

    @Override // f50.e
    @m80.k
    public T e(@m80.k i50.f decoder) {
        int decodeElementIndex;
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        h50.f a11 = a();
        i50.d beginStructure = decoder.beginStructure(a11);
        if (beginStructure.decodeSequentially() || (decodeElementIndex = beginStructure.decodeElementIndex(a())) == -1) {
            yz.g2 g2Var = yz.g2.f100423a;
            beginStructure.endStructure(a11);
            return this.f63330a;
        }
        throw new SerializationException("Unexpected index " + decodeElementIndex);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yz.v0
    public a2(@m80.k String serialName, @m80.k T objectInstance, @m80.k Annotation[] classAnnotations) {
        this(serialName, objectInstance);
        kotlin.jvm.internal.g0.p(serialName, "serialName");
        kotlin.jvm.internal.g0.p(objectInstance, "objectInstance");
        kotlin.jvm.internal.g0.p(classAnnotations, "classAnnotations");
        this.f63331b = a00.q.t(classAnnotations);
    }
}
