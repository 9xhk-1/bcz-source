package kotlin.reflect.jvm.internal;

import c30.n0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import k10.n2;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.reflect.jvm.internal.c;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import m20.d;
import p10.q0;
import y10.d0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class d {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final Field f67134a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k Field field) {
            super(null);
            g0.p(field, "field");
            this.f67134a = field;
        }

        @Override // kotlin.reflect.jvm.internal.d
        @m80.k
        public String a() {
            StringBuilder sb2 = new StringBuilder();
            String name = this.f67134a.getName();
            g0.o(name, "getName(...)");
            sb2.append(d0.b(name));
            sb2.append("()");
            Class<?> type = this.f67134a.getType();
            g0.o(type, "getType(...)");
            sb2.append(v10.f.f(type));
            return sb2.toString();
        }

        @m80.k
        public final Field b() {
            return this.f67134a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends d {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final Method f67135a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public final Method f67136b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k Method getterMethod, @m80.l Method method) {
            super(null);
            g0.p(getterMethod, "getterMethod");
            this.f67135a = getterMethod;
            this.f67136b = method;
        }

        @Override // kotlin.reflect.jvm.internal.d
        @m80.k
        public String a() {
            String d11;
            d11 = n2.d(this.f67135a);
            return d11;
        }

        @m80.k
        public final Method b() {
            return this.f67135a;
        }

        @m80.l
        public final Method c() {
            return this.f67136b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nRuntimeTypeMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RuntimeTypeMapper.kt\nkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n1#2:303\n*E\n"})
    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final q0 f67137a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final ProtoBuf.Property f67138b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final JvmProtoBuf.JvmPropertySignature f67139c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final k20.c f67140d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final k20.g f67141e;

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public final String f67142f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@m80.k q0 descriptor, @m80.k ProtoBuf.Property proto, @m80.k JvmProtoBuf.JvmPropertySignature signature, @m80.k k20.c nameResolver, @m80.k k20.g typeTable) {
            super(null);
            String str;
            g0.p(descriptor, "descriptor");
            g0.p(proto, "proto");
            g0.p(signature, "signature");
            g0.p(nameResolver, "nameResolver");
            g0.p(typeTable, "typeTable");
            this.f67137a = descriptor;
            this.f67138b = proto;
            this.f67139c = signature;
            this.f67140d = nameResolver;
            this.f67141e = typeTable;
            if (signature.hasGetter()) {
                str = nameResolver.getString(signature.getGetter().getName()) + nameResolver.getString(signature.getGetter().getDesc());
            } else {
                d.a d11 = m20.i.d(m20.i.f71820a, proto, nameResolver, typeTable, false, 8, null);
                if (d11 == null) {
                    throw new KotlinReflectionInternalError("No field signature for property: " + descriptor);
                }
                String b11 = d11.b();
                str = d0.b(b11) + c() + "()" + d11.c();
            }
            this.f67142f = str;
        }

        @Override // kotlin.reflect.jvm.internal.d
        @m80.k
        public String a() {
            return this.f67142f;
        }

        @m80.k
        public final q0 b() {
            return this.f67137a;
        }

        public final String c() {
            String str;
            p10.h b11 = this.f67137a.b();
            g0.o(b11, "getContainingDeclaration(...)");
            if (g0.g(this.f67137a.getVisibility(), p10.o.f78589d) && (b11 instanceof c30.n)) {
                ProtoBuf.Class Z0 = ((c30.n) b11).Z0();
                GeneratedMessageLite.f<ProtoBuf.Class, Integer> classModuleName = JvmProtoBuf.f67479i;
                g0.o(classModuleName, "classModuleName");
                Integer num = (Integer) k20.e.a(Z0, classModuleName);
                if (num == null || (str = this.f67140d.getString(num.intValue())) == null) {
                    str = "main";
                }
                return '$' + n20.g.b(str);
            }
            if (!g0.g(this.f67137a.getVisibility(), p10.o.f78586a) || !(b11 instanceof p10.g0)) {
                return "";
            }
            q0 q0Var = this.f67137a;
            g0.n(q0Var, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
            c30.s c02 = ((n0) q0Var).c0();
            if (!(c02 instanceof h20.r)) {
                return "";
            }
            h20.r rVar = (h20.r) c02;
            if (rVar.f() == null) {
                return "";
            }
            return '$' + rVar.h().b();
        }

        @m80.k
        public final k20.c d() {
            return this.f67140d;
        }

        @m80.k
        public final ProtoBuf.Property e() {
            return this.f67138b;
        }

        @m80.k
        public final JvmProtoBuf.JvmPropertySignature f() {
            return this.f67139c;
        }

        @m80.k
        public final k20.g g() {
            return this.f67141e;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: kotlin.reflect.jvm.internal.d$d, reason: collision with other inner class name */
    public static final class C0788d extends d {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final c.e f67143a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public final c.e f67144b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0788d(@m80.k c.e getterSignature, @m80.l c.e eVar) {
            super(null);
            g0.p(getterSignature, "getterSignature");
            this.f67143a = getterSignature;
            this.f67144b = eVar;
        }

        @Override // kotlin.reflect.jvm.internal.d
        @m80.k
        public String a() {
            return this.f67143a.a();
        }

        @m80.k
        public final c.e b() {
            return this.f67143a;
        }

        @m80.l
        public final c.e c() {
            return this.f67144b;
        }
    }

    public /* synthetic */ d(v vVar) {
        this();
    }

    @m80.k
    public abstract String a();

    public d() {
    }
}
