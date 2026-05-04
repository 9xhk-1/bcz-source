package l50;

import androidx.collection.SieveCacheKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import h50.m;
import h50.n;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.SerializationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nTreeJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 4 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/TreeJsonEncoderKt\n+ 5 WriteMode.kt\nkotlinx/serialization/json/internal/WriteModeKt\n*L\n1#1,348:1\n73#1:373\n73#1:387\n73#1:398\n73#1:408\n74#1:433\n74#1:442\n84#1:451\n74#1:452\n87#1:461\n74#1:462\n88#1,5:471\n87#1:476\n74#1:477\n88#1,5:486\n87#1:491\n74#1:492\n88#1,5:501\n87#1:506\n74#1:507\n88#1,5:516\n87#1:521\n74#1:522\n88#1,5:531\n87#1:536\n74#1:537\n88#1,5:546\n87#1:551\n74#1:552\n88#1,5:561\n87#1:566\n74#1:567\n88#1,5:576\n74#1:581\n84#1:590\n74#1:591\n1#2:349\n78#3,6:350\n84#3,9:364\n270#4,8:356\n270#4,8:374\n270#4,8:388\n270#4,8:399\n270#4,8:409\n270#4,8:417\n270#4,8:425\n270#4,8:434\n270#4,8:443\n270#4,8:453\n270#4,8:463\n270#4,8:478\n270#4,8:493\n270#4,8:508\n270#4,8:523\n270#4,8:538\n270#4,8:553\n270#4,8:568\n270#4,8:582\n270#4,8:592\n36#5,5:382\n41#5,2:396\n44#5:407\n*S KotlinDebug\n*F\n+ 1 TreeJsonDecoder.kt\nkotlinx/serialization/json/internal/AbstractJsonTreeDecoder\n*L\n63#1:373\n66#1:387\n67#1:398\n69#1:408\n84#1:433\n87#1:442\n104#1:451\n104#1:452\n111#1:461\n111#1:462\n111#1:471,5\n113#1:476\n113#1:477\n113#1:486,5\n119#1:491\n119#1:492\n119#1:501,5\n125#1:506\n125#1:507\n125#1:516,5\n131#1:521\n131#1:522\n131#1:531,5\n134#1:536\n134#1:537\n134#1:546,5\n141#1:551\n141#1:552\n141#1:561,5\n147#1:566\n147#1:567\n147#1:576,5\n150#1:581\n163#1:590\n163#1:591\n55#1:350,6\n55#1:364,9\n55#1:356,8\n63#1:374,8\n66#1:388,8\n67#1:399,8\n69#1:409,8\n73#1:417,8\n74#1:425,8\n84#1:434,8\n87#1:443,8\n104#1:453,8\n111#1:463,8\n113#1:478,8\n119#1:493,8\n125#1:508,8\n131#1:523,8\n134#1:538,8\n141#1:553,8\n147#1:568,8\n150#1:582,8\n163#1:592,8\n64#1:382,5\n64#1:396,2\n64#1:407\n*E\n"})
/* loaded from: classes8.dex */
public abstract class c extends j50.s1 implements k50.i {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final k50.a f69949f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final k50.k f69950g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public final String f69951h;

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @m80.k
    public final k50.g f69952i;

    public /* synthetic */ c(k50.a aVar, k50.k kVar, String str, kotlin.jvm.internal.v vVar) {
        this(aVar, kVar, str);
    }

    @Override // j50.s1
    @m80.k
    public String N(@m80.k String parentName, @m80.k String childName) {
        kotlin.jvm.internal.g0.p(parentName, "parentName");
        kotlin.jvm.internal.g0.p(childName, "childName");
        return childName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <T extends k50.k> T U(k50.k value, h50.f descriptor) {
        kotlin.jvm.internal.g0.p(value, "value");
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        String k11 = descriptor.k();
        kotlin.jvm.internal.g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
        if (value != 0) {
            return value;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Expected ");
        kotlin.jvm.internal.g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        sb2.append(kotlin.jvm.internal.o0.d(k50.k.class).C());
        sb2.append(", but had ");
        sb2.append(kotlin.jvm.internal.o0.d(value.getClass()).C());
        sb2.append(" as the serialized body of ");
        sb2.append(k11);
        sb2.append(" at element: ");
        sb2.append(R());
        throw i0.f(-1, sb2.toString(), value.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <T extends k50.k> T V(k50.k value, String serialName, String tag) {
        kotlin.jvm.internal.g0.p(value, "value");
        kotlin.jvm.internal.g0.p(serialName, "serialName");
        kotlin.jvm.internal.g0.p(tag, "tag");
        kotlin.jvm.internal.g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
        if (value != 0) {
            return value;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Expected ");
        kotlin.jvm.internal.g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        sb2.append(kotlin.jvm.internal.o0.d(k50.k.class).C());
        sb2.append(", but had ");
        sb2.append(kotlin.jvm.internal.o0.d(value.getClass()).C());
        sb2.append(" as the serialized body of ");
        sb2.append(serialName);
        sb2.append(" at element: ");
        sb2.append(p0(tag));
        throw i0.f(-1, sb2.toString(), value.toString());
    }

    @m80.k
    public abstract k50.k W(@m80.k String str);

    @m80.k
    public final k50.k X() {
        k50.k W;
        String H = H();
        return (H == null || (W = W(H)) == null) ? o0() : W;
    }

    @Override // j50.h3
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public boolean s(@m80.k String tag) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        k50.k W = W(tag);
        if (W instanceof k50.l0) {
            k50.l0 l0Var = (k50.l0) W;
            try {
                Boolean n11 = k50.o.n(l0Var);
                if (n11 != null) {
                    return n11.booleanValue();
                }
                q0(l0Var, TypedValues.Custom.S_BOOLEAN, tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                q0(l0Var, TypedValues.Custom.S_BOOLEAN, tag);
                throw new KotlinNothingValueException();
            }
        }
        throw i0.f(-1, "Expected " + kotlin.jvm.internal.o0.d(k50.l0.class).C() + ", but had " + kotlin.jvm.internal.o0.d(W.getClass()).C() + " as the serialized body of " + TypedValues.Custom.S_BOOLEAN + " at element: " + p0(tag), W.toString());
    }

    @Override // j50.h3
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public byte t(@m80.k String tag) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        k50.k W = W(tag);
        if (W instanceof k50.l0) {
            k50.l0 l0Var = (k50.l0) W;
            try {
                long C = k50.o.C(l0Var);
                Byte valueOf = (-128 > C || C > 127) ? null : Byte.valueOf((byte) C);
                if (valueOf != null) {
                    return valueOf.byteValue();
                }
                q0(l0Var, "byte", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                q0(l0Var, "byte", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw i0.f(-1, "Expected " + kotlin.jvm.internal.o0.d(k50.l0.class).C() + ", but had " + kotlin.jvm.internal.o0.d(W.getClass()).C() + " as the serialized body of byte at element: " + p0(tag), W.toString());
    }

    @Override // k50.i
    @m80.k
    public k50.a a() {
        return this.f69949f;
    }

    @Override // j50.h3
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public char u(@m80.k String tag) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        k50.k W = W(tag);
        if (W instanceof k50.l0) {
            k50.l0 l0Var = (k50.l0) W;
            try {
                return u30.r0.k9(l0Var.b());
            } catch (IllegalArgumentException unused) {
                q0(l0Var, "char", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw i0.f(-1, "Expected " + kotlin.jvm.internal.o0.d(k50.l0.class).C() + ", but had " + kotlin.jvm.internal.o0.d(W.getClass()).C() + " as the serialized body of char at element: " + p0(tag), W.toString());
    }

    @Override // j50.h3
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public double v(@m80.k String tag) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        k50.k W = W(tag);
        if (W instanceof k50.l0) {
            k50.l0 l0Var = (k50.l0) W;
            try {
                double p11 = k50.o.p(l0Var);
                if (a().i().c()) {
                    return p11;
                }
                if (Math.abs(p11) <= Double.MAX_VALUE) {
                    return p11;
                }
                throw i0.a(Double.valueOf(p11), tag, X().toString());
            } catch (IllegalArgumentException unused) {
                q0(l0Var, "double", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw i0.f(-1, "Expected " + kotlin.jvm.internal.o0.d(k50.l0.class).C() + ", but had " + kotlin.jvm.internal.o0.d(W.getClass()).C() + " as the serialized body of double at element: " + p0(tag), W.toString());
    }

    @Override // j50.h3, i50.f
    @m80.k
    public i50.d beginStructure(@m80.k h50.f descriptor) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        k50.k X = X();
        h50.m kind = descriptor.getKind();
        if (kotlin.jvm.internal.g0.g(kind, n.b.f58542a) || (kind instanceof h50.d)) {
            k50.a a11 = a();
            String k11 = descriptor.k();
            if (X instanceof k50.b) {
                return new z0(a11, (k50.b) X);
            }
            throw i0.f(-1, "Expected " + kotlin.jvm.internal.o0.d(k50.b.class).C() + ", but had " + kotlin.jvm.internal.o0.d(X.getClass()).C() + " as the serialized body of " + k11 + " at element: " + R(), X.toString());
        }
        if (!kotlin.jvm.internal.g0.g(kind, n.c.f58543a)) {
            k50.a a12 = a();
            String k12 = descriptor.k();
            if (X instanceof k50.i0) {
                return new x0(a12, (k50.i0) X, this.f69951h, null, 8, null);
            }
            throw i0.f(-1, "Expected " + kotlin.jvm.internal.o0.d(k50.i0.class).C() + ", but had " + kotlin.jvm.internal.o0.d(X.getClass()).C() + " as the serialized body of " + k12 + " at element: " + R(), X.toString());
        }
        k50.a a13 = a();
        h50.f a14 = v1.a(descriptor.e(0), a13.getSerializersModule());
        h50.m kind2 = a14.getKind();
        if ((kind2 instanceof h50.e) || kotlin.jvm.internal.g0.g(kind2, m.b.f58540a)) {
            k50.a a15 = a();
            String k13 = descriptor.k();
            if (X instanceof k50.i0) {
                return new b1(a15, (k50.i0) X);
            }
            throw i0.f(-1, "Expected " + kotlin.jvm.internal.o0.d(k50.i0.class).C() + ", but had " + kotlin.jvm.internal.o0.d(X.getClass()).C() + " as the serialized body of " + k13 + " at element: " + R(), X.toString());
        }
        if (!a13.i().d()) {
            throw i0.d(a14);
        }
        k50.a a16 = a();
        String k14 = descriptor.k();
        if (X instanceof k50.b) {
            return new z0(a16, (k50.b) X);
        }
        throw i0.f(-1, "Expected " + kotlin.jvm.internal.o0.d(k50.b.class).C() + ", but had " + kotlin.jvm.internal.o0.d(X.getClass()).C() + " as the serialized body of " + k14 + " at element: " + R(), X.toString());
    }

    @Override // j50.h3
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public int w(@m80.k String tag, @m80.k h50.f enumDescriptor) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        kotlin.jvm.internal.g0.p(enumDescriptor, "enumDescriptor");
        k50.a a11 = a();
        k50.k W = W(tag);
        String k11 = enumDescriptor.k();
        if (W instanceof k50.l0) {
            return p0.l(enumDescriptor, a11, ((k50.l0) W).b(), null, 4, null);
        }
        throw i0.f(-1, "Expected " + kotlin.jvm.internal.o0.d(k50.l0.class).C() + ", but had " + kotlin.jvm.internal.o0.d(W.getClass()).C() + " as the serialized body of " + k11 + " at element: " + p0(tag), W.toString());
    }

    @Override // j50.h3
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public float x(@m80.k String tag) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        k50.k W = W(tag);
        if (W instanceof k50.l0) {
            k50.l0 l0Var = (k50.l0) W;
            try {
                float r11 = k50.o.r(l0Var);
                if (a().i().c()) {
                    return r11;
                }
                if (Math.abs(r11) <= Float.MAX_VALUE) {
                    return r11;
                }
                throw i0.a(Float.valueOf(r11), tag, X().toString());
            } catch (IllegalArgumentException unused) {
                q0(l0Var, TypedValues.Custom.S_FLOAT, tag);
                throw new KotlinNothingValueException();
            }
        }
        throw i0.f(-1, "Expected " + kotlin.jvm.internal.o0.d(k50.l0.class).C() + ", but had " + kotlin.jvm.internal.o0.d(W.getClass()).C() + " as the serialized body of " + TypedValues.Custom.S_FLOAT + " at element: " + p0(tag), W.toString());
    }

    @Override // j50.h3, i50.f
    @m80.k
    public i50.f decodeInline(@m80.k h50.f descriptor) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        return H() != null ? super.decodeInline(descriptor) : new r0(a(), o0(), this.f69951h).decodeInline(descriptor);
    }

    @Override // j50.h3, i50.f
    public boolean decodeNotNullMark() {
        return !(X() instanceof k50.f0);
    }

    @Override // j50.h3, i50.f
    public <T> T decodeSerializableValue(@m80.k f50.e<? extends T> deserializer) {
        k50.l0 y11;
        kotlin.jvm.internal.g0.p(deserializer, "deserializer");
        if (!(deserializer instanceof j50.b) || a().i().v()) {
            return deserializer.e(this);
        }
        j50.b bVar = (j50.b) deserializer;
        String c11 = e1.c(bVar.a(), a());
        k50.k i11 = i();
        String k11 = bVar.a().k();
        if (i11 instanceof k50.i0) {
            k50.i0 i0Var = (k50.i0) i11;
            k50.k kVar = (k50.k) i0Var.get(c11);
            try {
                f50.e a11 = f50.p.a((j50.b) deserializer, this, (kVar == null || (y11 = k50.o.y(kVar)) == null) ? null : k50.o.o(y11));
                kotlin.jvm.internal.g0.n(a11, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                return (T) s1.b(a(), c11, i0Var, a11);
            } catch (SerializationException e11) {
                String message = e11.getMessage();
                kotlin.jvm.internal.g0.m(message);
                throw i0.f(-1, message, i0Var.toString());
            }
        }
        throw i0.f(-1, "Expected " + kotlin.jvm.internal.o0.d(k50.i0.class).C() + ", but had " + kotlin.jvm.internal.o0.d(i11.getClass()).C() + " as the serialized body of " + k11 + " at element: " + R(), i11.toString());
    }

    @Override // j50.h3
    @m80.k
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public i50.f y(@m80.k String tag, @m80.k h50.f inlineDescriptor) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        kotlin.jvm.internal.g0.p(inlineDescriptor, "inlineDescriptor");
        if (!m1.b(inlineDescriptor)) {
            return super.y(tag, inlineDescriptor);
        }
        k50.a a11 = a();
        k50.k W = W(tag);
        String k11 = inlineDescriptor.k();
        if (W instanceof k50.l0) {
            return new g0(o1.a(a11, ((k50.l0) W).b()), a());
        }
        throw i0.f(-1, "Expected " + kotlin.jvm.internal.o0.d(k50.l0.class).C() + ", but had " + kotlin.jvm.internal.o0.d(W.getClass()).C() + " as the serialized body of " + k11 + " at element: " + p0(tag), W.toString());
    }

    @Override // j50.h3, i50.d
    public void endStructure(@m80.k h50.f descriptor) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
    }

    @Override // j50.h3
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public int z(@m80.k String tag) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        k50.k W = W(tag);
        if (W instanceof k50.l0) {
            k50.l0 l0Var = (k50.l0) W;
            try {
                long C = k50.o.C(l0Var);
                Integer valueOf = (SieveCacheKt.NodeMetaAndPreviousMask > C || C > SieveCacheKt.NodeLinkMask) ? null : Integer.valueOf((int) C);
                if (valueOf != null) {
                    return valueOf.intValue();
                }
                q0(l0Var, "int", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                q0(l0Var, "int", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw i0.f(-1, "Expected " + kotlin.jvm.internal.o0.d(k50.l0.class).C() + ", but had " + kotlin.jvm.internal.o0.d(W.getClass()).C() + " as the serialized body of int at element: " + p0(tag), W.toString());
    }

    @Override // j50.h3
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public long A(@m80.k String tag) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        k50.k W = W(tag);
        if (W instanceof k50.l0) {
            k50.l0 l0Var = (k50.l0) W;
            try {
                return k50.o.C(l0Var);
            } catch (IllegalArgumentException unused) {
                q0(l0Var, "long", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw i0.f(-1, "Expected " + kotlin.jvm.internal.o0.d(k50.l0.class).C() + ", but had " + kotlin.jvm.internal.o0.d(W.getClass()).C() + " as the serialized body of long at element: " + p0(tag), W.toString());
    }

    @Override // j50.h3, i50.f, i50.d
    @m80.k
    public o50.f getSerializersModule() {
        return a().getSerializersModule();
    }

    @Override // j50.h3
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public boolean B(@m80.k String tag) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        return W(tag) != k50.f0.INSTANCE;
    }

    @Override // k50.i
    @m80.k
    public k50.k i() {
        return X();
    }

    @Override // j50.h3
    @m80.l
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public Void C(@m80.k String tag) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        return null;
    }

    @Override // j50.h3
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public short D(@m80.k String tag) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        k50.k W = W(tag);
        if (W instanceof k50.l0) {
            k50.l0 l0Var = (k50.l0) W;
            try {
                long C = k50.o.C(l0Var);
                Short valueOf = (-32768 > C || C > 32767) ? null : Short.valueOf((short) C);
                if (valueOf != null) {
                    return valueOf.shortValue();
                }
                q0(l0Var, "short", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                q0(l0Var, "short", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw i0.f(-1, "Expected " + kotlin.jvm.internal.o0.d(k50.l0.class).C() + ", but had " + kotlin.jvm.internal.o0.d(W.getClass()).C() + " as the serialized body of short at element: " + p0(tag), W.toString());
    }

    @Override // j50.h3
    @m80.k
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public String E(@m80.k String tag) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        k50.k W = W(tag);
        if (!(W instanceof k50.l0)) {
            throw i0.f(-1, "Expected " + kotlin.jvm.internal.o0.d(k50.l0.class).C() + ", but had " + kotlin.jvm.internal.o0.d(W.getClass()).C() + " as the serialized body of " + TypedValues.Custom.S_STRING + " at element: " + p0(tag), W.toString());
        }
        k50.l0 l0Var = (k50.l0) W;
        if (!(l0Var instanceof k50.b0)) {
            throw i0.f(-1, "Expected string value for a non-null key '" + tag + "', got null literal instead at element: " + p0(tag), X().toString());
        }
        k50.b0 b0Var = (k50.b0) l0Var;
        if (b0Var.d() || a().i().w()) {
            return b0Var.b();
        }
        throw i0.f(-1, "String literal for key '" + tag + "' should be quoted at element: " + p0(tag) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", X().toString());
    }

    @m80.l
    public final String l0() {
        return this.f69951h;
    }

    public final <T> T m0(String str, String str2, x00.l<? super k50.l0, ? extends T> lVar) {
        k50.k W = W(str);
        if (W instanceof k50.l0) {
            k50.l0 l0Var = (k50.l0) W;
            try {
                T invoke = lVar.invoke(l0Var);
                if (invoke != null) {
                    return invoke;
                }
                q0(l0Var, str2, str);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                q0(l0Var, str2, str);
                throw new KotlinNothingValueException();
            }
        }
        throw i0.f(-1, "Expected " + kotlin.jvm.internal.o0.d(k50.l0.class).C() + ", but had " + kotlin.jvm.internal.o0.d(W.getClass()).C() + " as the serialized body of " + str2 + " at element: " + p0(str), W.toString());
    }

    @m80.k
    public final k50.l0 n0(@m80.k String tag, @m80.k h50.f descriptor) {
        kotlin.jvm.internal.g0.p(tag, "tag");
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        k50.k W = W(tag);
        String k11 = descriptor.k();
        if (W instanceof k50.l0) {
            return (k50.l0) W;
        }
        throw i0.f(-1, "Expected " + kotlin.jvm.internal.o0.d(k50.l0.class).C() + ", but had " + kotlin.jvm.internal.o0.d(W.getClass()).C() + " as the serialized body of " + k11 + " at element: " + p0(tag), W.toString());
    }

    @m80.k
    public k50.k o0() {
        return this.f69950g;
    }

    @m80.k
    public final String p0(@m80.k String currentTag) {
        kotlin.jvm.internal.g0.p(currentTag, "currentTag");
        return R() + '.' + currentTag;
    }

    public final Void q0(k50.l0 l0Var, String str, String str2) {
        StringBuilder sb2;
        String str3;
        if (u30.f0.J2(str, "i", false, 2, null)) {
            sb2 = new StringBuilder();
            str3 = "an ";
        } else {
            sb2 = new StringBuilder();
            str3 = "a ";
        }
        sb2.append(str3);
        sb2.append(str);
        throw i0.f(-1, "Failed to parse literal '" + l0Var + "' as " + sb2.toString() + " value at element: " + p0(str2), X().toString());
    }

    public /* synthetic */ c(k50.a aVar, k50.k kVar, String str, int i11, kotlin.jvm.internal.v vVar) {
        this(aVar, kVar, (i11 & 4) != 0 ? null : str, null);
    }

    public c(k50.a aVar, k50.k kVar, String str) {
        this.f69949f = aVar;
        this.f69950g = kVar;
        this.f69951h = str;
        this.f69952i = a().i();
    }
}
