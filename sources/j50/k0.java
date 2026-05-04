package j50;

import java.lang.Enum;
import java.util.Arrays;
import kotlinx.serialization.SerializationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
@kotlin.jvm.internal.u0({"SMAP\nEnums.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumSerializer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,148:1\n13472#2,2:149\n*S KotlinDebug\n*F\n+ 1 Enums.kt\nkotlinx/serialization/internal/EnumSerializer\n*L\n120#1:149,2\n*E\n"})
/* loaded from: classes8.dex */
public final class k0<T extends Enum<T>> implements f50.i<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final T[] f63395a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public h50.f f63396b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final yz.c0 f63397c;

    public k0(@m80.k final String serialName, @m80.k T[] values) {
        kotlin.jvm.internal.g0.p(serialName, "serialName");
        kotlin.jvm.internal.g0.p(values, "values");
        this.f63395a = values;
        this.f63397c = yz.e0.c(new x00.a() { // from class: j50.j0
            @Override // x00.a
            public final Object invoke() {
                h50.f i11;
                i11 = k0.i(k0.this, serialName);
                return i11;
            }
        });
    }

    public static final h50.f i(k0 k0Var, String str) {
        h50.f fVar = k0Var.f63396b;
        return fVar == null ? k0Var.h(str) : fVar;
    }

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return (h50.f) this.f63397c.getValue();
    }

    public final h50.f h(String str) {
        i0 i0Var = new i0(str, this.f63395a.length);
        for (T t11 : this.f63395a) {
            l2.r(i0Var, t11.name(), false, 2, null);
        }
        return i0Var;
    }

    @Override // f50.e
    @m80.k
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public T e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        int decodeEnum = decoder.decodeEnum(a());
        if (decodeEnum >= 0) {
            T[] tArr = this.f63395a;
            if (decodeEnum < tArr.length) {
                return tArr[decodeEnum];
            }
        }
        throw new SerializationException(decodeEnum + " is not among valid " + a().k() + " enum values, values size is " + this.f63395a.length);
    }

    @Override // f50.b0
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void b(@m80.k i50.h encoder, @m80.k T value) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(value, "value");
        int bg2 = a00.a0.bg(this.f63395a, value);
        if (bg2 != -1) {
            encoder.encodeEnum(a(), bg2);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(value);
        sb2.append(" is not a valid enum ");
        sb2.append(a().k());
        sb2.append(", must be one of ");
        String arrays = Arrays.toString(this.f63395a);
        kotlin.jvm.internal.g0.o(arrays, "toString(...)");
        sb2.append(arrays);
        throw new SerializationException(sb2.toString());
    }

    @m80.k
    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + a().k() + u30.u0.f91710f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k0(@m80.k String serialName, @m80.k T[] values, @m80.k h50.f descriptor) {
        this(serialName, values);
        kotlin.jvm.internal.g0.p(serialName, "serialName");
        kotlin.jvm.internal.g0.p(values, "values");
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        this.f63396b = descriptor;
    }
}
