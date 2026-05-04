package com.baicizhan.main.home.player;

import androidx.compose.animation.core.Easing;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.annotation.Annotation;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@f50.a0
/* loaded from: classes4.dex */
public final class b6<T> {

    /* renamed from: f, reason: collision with root package name */
    public static final int f23463f = 0;

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final h50.f f23465h;

    /* renamed from: a, reason: collision with root package name */
    public final int f23466a;

    /* renamed from: b, reason: collision with root package name */
    public final T f23467b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final Easing f23468c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final T f23469d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final T f23470e;

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final yz.c0<f50.i<Object>>[] f23464g = {null, null, yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: com.baicizhan.main.home.player.a6
        @Override // x00.a
        public final Object invoke() {
            f50.i b11;
            b11 = b6.b();
            return b11;
        }
    }), null, null};

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a<T> implements j50.p0<b6<T>> {

        /* renamed from: b, reason: collision with root package name */
        public static final int f23471b = 8;

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f50.i<?> f23472a;

        @m80.k
        private final h50.f descriptor;

        public a() {
            j50.l2 l2Var = new j50.l2("com.baicizhan.main.home.player.Keyframe", this, 5);
            l2Var.q("timeMs", false);
            l2Var.q("value", false);
            l2Var.q("easing", true);
            l2Var.q("outControlPoint", true);
            l2Var.q("inControlPoint", true);
            this.descriptor = l2Var;
        }

        private final /* synthetic */ f50.i h() {
            return this.f23472a;
        }

        @Override // f50.i, f50.b0, f50.e
        @m80.k
        public final h50.f a() {
            return this.descriptor;
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] c() {
            return new f50.i[]{this.f23472a};
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            return new f50.i[]{j50.z0.f63517a, this.f23472a, g50.a.v((f50.i) b6.f23464g[2].getValue()), g50.a.v(this.f23472a), g50.a.v(this.f23472a)};
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final b6<T> e(@m80.k i50.f decoder) {
            int i11;
            int i12;
            Object obj;
            Easing easing;
            Object obj2;
            Object obj3;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = this.descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            yz.c0[] c0VarArr = b6.f23464g;
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                Object decodeSerializableElement = beginStructure.decodeSerializableElement(fVar, 1, this.f23472a, null);
                easing = (Easing) beginStructure.decodeNullableSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), null);
                obj2 = beginStructure.decodeNullableSerializableElement(fVar, 3, this.f23472a, null);
                obj3 = beginStructure.decodeNullableSerializableElement(fVar, 4, this.f23472a, null);
                i12 = 31;
                obj = decodeSerializableElement;
            } else {
                boolean z11 = true;
                i11 = 0;
                Object obj4 = null;
                Easing easing2 = null;
                Object obj5 = null;
                Object obj6 = null;
                int i13 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        i11 = beginStructure.decodeIntElement(fVar, 0);
                        i13 |= 1;
                    } else if (decodeElementIndex == 1) {
                        obj4 = beginStructure.decodeSerializableElement(fVar, 1, this.f23472a, obj4);
                        i13 |= 2;
                    } else if (decodeElementIndex == 2) {
                        easing2 = (Easing) beginStructure.decodeNullableSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), easing2);
                        i13 |= 4;
                    } else if (decodeElementIndex == 3) {
                        obj5 = beginStructure.decodeNullableSerializableElement(fVar, 3, this.f23472a, obj5);
                        i13 |= 8;
                    } else {
                        if (decodeElementIndex != 4) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        obj6 = beginStructure.decodeNullableSerializableElement(fVar, 4, this.f23472a, obj6);
                        i13 |= 16;
                    }
                }
                i12 = i13;
                obj = obj4;
                easing = easing2;
                obj2 = obj5;
                obj3 = obj6;
            }
            int i14 = i11;
            beginStructure.endStructure(fVar);
            return new b6<>(i12, i14, obj, easing, obj2, obj3, (j50.x2) null);
        }

        @Override // f50.b0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k b6<T> value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = this.descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            b6.p(value, beginStructure, fVar, this.f23472a);
            beginStructure.endStructure(fVar);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(@m80.k f50.i<T> typeSerial0) {
            this();
            kotlin.jvm.internal.g0.p(typeSerial0, "typeSerial0");
            this.f23472a = typeSerial0;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final <T> f50.i<b6<T>> serializer(@m80.k f50.i<T> typeSerial0) {
            kotlin.jvm.internal.g0.p(typeSerial0, "typeSerial0");
            return new a(typeSerial0);
        }

        public b() {
        }
    }

    static {
        j50.l2 l2Var = new j50.l2("com.baicizhan.main.home.player.Keyframe", null, 5);
        l2Var.q("timeMs", false);
        l2Var.q("value", false);
        l2Var.q("easing", true);
        l2Var.q("outControlPoint", true);
        l2Var.q("inControlPoint", true);
        f23465h = l2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b6(int i11, int i12, Object obj, Easing easing, Object obj2, Object obj3, j50.x2 x2Var) {
        if (3 != (i11 & 3)) {
            j50.h2.b(i11, 3, f23465h);
        }
        this.f23466a = i12;
        this.f23467b = obj;
        if ((i11 & 4) == 0) {
            this.f23468c = null;
        } else {
            this.f23468c = easing;
        }
        if ((i11 & 8) == 0) {
            this.f23469d = null;
        } else {
            this.f23469d = obj2;
        }
        if ((i11 & 16) == 0) {
            this.f23470e = null;
        } else {
            this.f23470e = obj3;
        }
    }

    public static final /* synthetic */ f50.i b() {
        return new f50.o(kotlin.jvm.internal.o0.d(Easing.class), new Annotation[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b6 j(b6 b6Var, int i11, Object obj, Easing easing, Object obj2, Object obj3, int i12, Object obj4) {
        if ((i12 & 1) != 0) {
            i11 = b6Var.f23466a;
        }
        T t11 = obj;
        if ((i12 & 2) != 0) {
            t11 = b6Var.f23467b;
        }
        if ((i12 & 4) != 0) {
            easing = b6Var.f23468c;
        }
        T t12 = obj2;
        if ((i12 & 8) != 0) {
            t12 = b6Var.f23469d;
        }
        T t13 = obj3;
        if ((i12 & 16) != 0) {
            t13 = b6Var.f23470e;
        }
        T t14 = t13;
        Easing easing2 = easing;
        return b6Var.i(i11, t11, easing2, t12, t14);
    }

    @w00.o
    public static final /* synthetic */ void p(b6 b6Var, i50.e eVar, h50.f fVar, f50.i iVar) {
        yz.c0<f50.i<Object>>[] c0VarArr = f23464g;
        eVar.encodeIntElement(fVar, 0, b6Var.f23466a);
        f50.i iVar2 = iVar;
        eVar.encodeSerializableElement(fVar, 1, iVar2, b6Var.f23467b);
        if (eVar.shouldEncodeElementDefault(fVar, 2) || b6Var.f23468c != null) {
            eVar.encodeNullableSerializableElement(fVar, 2, c0VarArr[2].getValue(), b6Var.f23468c);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 3) || b6Var.f23469d != null) {
            eVar.encodeNullableSerializableElement(fVar, 3, iVar2, b6Var.f23469d);
        }
        if (!eVar.shouldEncodeElementDefault(fVar, 4) && b6Var.f23470e == null) {
            return;
        }
        eVar.encodeNullableSerializableElement(fVar, 4, iVar2, b6Var.f23470e);
    }

    public final int d() {
        return this.f23466a;
    }

    public final T e() {
        return this.f23467b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6)) {
            return false;
        }
        b6 b6Var = (b6) obj;
        return this.f23466a == b6Var.f23466a && kotlin.jvm.internal.g0.g(this.f23467b, b6Var.f23467b) && kotlin.jvm.internal.g0.g(this.f23468c, b6Var.f23468c) && kotlin.jvm.internal.g0.g(this.f23469d, b6Var.f23469d) && kotlin.jvm.internal.g0.g(this.f23470e, b6Var.f23470e);
    }

    @m80.l
    public final Easing f() {
        return this.f23468c;
    }

    @m80.l
    public final T g() {
        return this.f23469d;
    }

    @m80.l
    public final T h() {
        return this.f23470e;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f23466a) * 31;
        T t11 = this.f23467b;
        int hashCode2 = (hashCode + (t11 == null ? 0 : t11.hashCode())) * 31;
        Easing easing = this.f23468c;
        int hashCode3 = (hashCode2 + (easing == null ? 0 : easing.hashCode())) * 31;
        T t12 = this.f23469d;
        int hashCode4 = (hashCode3 + (t12 == null ? 0 : t12.hashCode())) * 31;
        T t13 = this.f23470e;
        return hashCode4 + (t13 != null ? t13.hashCode() : 0);
    }

    @m80.k
    public final b6<T> i(int i11, T t11, @m80.l Easing easing, @m80.l T t12, @m80.l T t13) {
        return new b6<>(i11, t11, easing, t12, t13);
    }

    @m80.l
    public final Easing k() {
        return this.f23468c;
    }

    @m80.l
    public final T l() {
        return this.f23470e;
    }

    @m80.l
    public final T m() {
        return this.f23469d;
    }

    public final int n() {
        return this.f23466a;
    }

    public final T o() {
        return this.f23467b;
    }

    @m80.k
    public String toString() {
        return "Keyframe(timeMs=" + this.f23466a + ", value=" + this.f23467b + ", easing=" + this.f23468c + ", outControlPoint=" + this.f23469d + ", inControlPoint=" + this.f23470e + pn.j.f81007d;
    }

    public b6(int i11, T t11, @m80.l Easing easing, @m80.l T t12, @m80.l T t13) {
        this.f23466a = i11;
        this.f23467b = t11;
        this.f23468c = easing;
        this.f23469d = t12;
        this.f23470e = t13;
    }

    public /* synthetic */ b6(int i11, Object obj, Easing easing, Object obj2, Object obj3, int i12, kotlin.jvm.internal.v vVar) {
        this(i11, obj, (i12 & 4) != 0 ? null : easing, (i12 & 8) != 0 ? null : obj2, (i12 & 16) != 0 ? null : obj3);
    }
}
