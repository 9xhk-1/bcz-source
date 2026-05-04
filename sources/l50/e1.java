package l50;

import h50.m;
import java.lang.annotation.Annotation;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nPolymorphic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/TreeJsonEncoderKt\n*L\n1#1,109:1\n1#2:110\n270#3,8:111\n*S KotlinDebug\n*F\n+ 1 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n*L\n83#1:111,8\n*E\n"})
/* loaded from: classes8.dex */
public final class e1 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f69987a;

        static {
            int[] iArr = new int[ClassDiscriminatorMode.values().length];
            try {
                iArr[ClassDiscriminatorMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClassDiscriminatorMode.POLYMORPHIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClassDiscriminatorMode.ALL_JSON_OBJECTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f69987a = iArr;
        }
    }

    public static final void b(@m80.k h50.m kind) {
        kotlin.jvm.internal.g0.p(kind, "kind");
        if (kind instanceof m.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof h50.e) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof h50.d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    @m80.k
    public static final String c(@m80.k h50.f fVar, @m80.k k50.a json) {
        kotlin.jvm.internal.g0.p(fVar, "<this>");
        kotlin.jvm.internal.g0.p(json, "json");
        for (Annotation annotation : fVar.getAnnotations()) {
            if (annotation instanceof k50.f) {
                return ((k50.f) annotation).discriminator();
            }
        }
        return json.i().g();
    }

    public static final <T> T d(@m80.k k50.i iVar, @m80.k f50.e<? extends T> deserializer, @m80.k x00.a<String> path) {
        k50.l0 y11;
        kotlin.jvm.internal.g0.p(iVar, "<this>");
        kotlin.jvm.internal.g0.p(deserializer, "deserializer");
        kotlin.jvm.internal.g0.p(path, "path");
        if (!(deserializer instanceof j50.b) || iVar.a().i().v()) {
            return deserializer.e(iVar);
        }
        j50.b bVar = (j50.b) deserializer;
        String c11 = c(bVar.a(), iVar.a());
        k50.k i11 = iVar.i();
        String k11 = bVar.a().k();
        if (i11 instanceof k50.i0) {
            k50.i0 i0Var = (k50.i0) i11;
            k50.k kVar = (k50.k) i0Var.get(c11);
            try {
                f50.e a11 = f50.p.a((j50.b) deserializer, iVar, (kVar == null || (y11 = k50.o.y(kVar)) == null) ? null : k50.o.o(y11));
                kotlin.jvm.internal.g0.n(a11, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                return (T) s1.b(iVar.a(), c11, i0Var, a11);
            } catch (SerializationException e11) {
                String message = e11.getMessage();
                kotlin.jvm.internal.g0.m(message);
                throw i0.f(-1, message, i0Var.toString());
            }
        }
        throw i0.f(-1, "Expected " + kotlin.jvm.internal.o0.d(k50.i0.class).C() + ", but had " + kotlin.jvm.internal.o0.d(i11.getClass()).C() + " as the serialized body of " + k11 + " at element: " + path.invoke(), i11.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        if (kotlin.jvm.internal.g0.g(r1, h50.n.d.f58544a) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if (r3.a().i().h() != kotlinx.serialization.json.ClassDiscriminatorMode.NONE) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void e(@m80.k k50.x r3, @m80.k f50.b0<? super T> r4, T r5, @m80.k x00.p<? super java.lang.String, ? super java.lang.String, yz.g2> r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "serializer"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "ifPolymorphic"
            kotlin.jvm.internal.g0.p(r6, r0)
            k50.a r0 = r3.a()
            k50.g r0 = r0.i()
            boolean r0 = r0.v()
            if (r0 == 0) goto L21
            r4.b(r3, r5)
            return
        L21:
            boolean r0 = r4 instanceof j50.b
            if (r0 == 0) goto L36
            k50.a r1 = r3.a()
            k50.g r1 = r1.i()
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.h()
            kotlinx.serialization.json.ClassDiscriminatorMode r2 = kotlinx.serialization.json.ClassDiscriminatorMode.NONE
            if (r1 == r2) goto L7e
            goto L6b
        L36:
            k50.a r1 = r3.a()
            k50.g r1 = r1.i()
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.h()
            int[] r2 = l50.e1.a.f69987a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L7e
            r2 = 2
            if (r1 == r2) goto L7e
            r2 = 3
            if (r1 != r2) goto L78
            h50.f r1 = r4.a()
            h50.m r1 = r1.getKind()
            h50.n$a r2 = h50.n.a.f58541a
            boolean r2 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r2 != 0) goto L6b
            h50.n$d r2 = h50.n.d.f58544a
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r1 == 0) goto L7e
        L6b:
            h50.f r1 = r4.a()
            k50.a r2 = r3.a()
            java.lang.String r1 = c(r1, r2)
            goto L7f
        L78:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L7e:
            r1 = 0
        L7f:
            if (r0 == 0) goto Lc5
            r0 = r4
            j50.b r0 = (j50.b) r0
            if (r5 == 0) goto La1
            f50.b0 r0 = f50.p.b(r0, r3, r5)
            if (r1 == 0) goto L9a
            a(r4, r0, r1)
            h50.f r4 = r0.a()
            h50.m r4 = r4.getKind()
            b(r4)
        L9a:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>"
            kotlin.jvm.internal.g0.n(r0, r4)
            r4 = r0
            goto Lc5
        La1:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Value for serializer "
            r3.append(r4)
            h50.f r4 = r0.a()
            r3.append(r4)
            java.lang.String r4 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        Lc5:
            if (r1 == 0) goto Ld2
            h50.f r0 = r4.a()
            java.lang.String r0 = r0.k()
            r6.invoke(r1, r0)
        Ld2:
            r4.b(r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l50.e1.e(k50.x, f50.b0, java.lang.Object, x00.p):void");
    }

    @m80.k
    public static final Void f(@m80.l String str, @m80.k k50.k element) {
        kotlin.jvm.internal.g0.p(element, "element");
        throw new JsonEncodingException("Class with serial name " + str + " cannot be serialized polymorphically because it is represented as " + kotlin.jvm.internal.o0.d(element.getClass()).C() + ". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
    }

    public static final void g(f50.b0<?> b0Var, f50.b0<?> b0Var2, String str) {
        if ((b0Var instanceof f50.u) && j50.b1.a(b0Var2.a()).contains(str)) {
            String k11 = ((f50.u) b0Var).a().k();
            throw new IllegalStateException(("Sealed class '" + b0Var2.a().k() + "' cannot be serialized as base class '" + k11 + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }
}
