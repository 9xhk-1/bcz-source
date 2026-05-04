package vg;

import androidx.compose.runtime.internal.StabilityInferred;
import f50.a0;
import j50.h2;
import j50.l2;
import j50.o0;
import j50.p0;
import j50.x2;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlinx.serialization.UnknownFieldException;
import vg.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@a0
/* loaded from: classes4.dex */
public final class i {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f93881e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final float f93882a;

    /* renamed from: b, reason: collision with root package name */
    public final float f93883b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final vg.a f93884c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final vg.a f93885d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements p0<i> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f93886a;

        /* renamed from: b, reason: collision with root package name */
        public static final int f93887b;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f93886a = aVar;
            f93887b = 8;
            l2 l2Var = new l2("com.baicizhan.main.home.player.data.animation2.PathPoint", aVar, 4);
            l2Var.q("x", false);
            l2Var.q("y", false);
            l2Var.q("anchor1", true);
            l2Var.q("anchor2", true);
            descriptor = l2Var;
        }

        @Override // f50.i, f50.b0, f50.e
        @m80.k
        public final h50.f a() {
            return descriptor;
        }

        @Override // j50.p0
        @m80.k
        public /* bridge */ f50.i<?>[] c() {
            return super.c();
        }

        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            a.C1264a c1264a = a.C1264a.f93863a;
            f50.i<?> v11 = g50.a.v(c1264a);
            f50.i<?> v12 = g50.a.v(c1264a);
            o0 o0Var = o0.f63436a;
            return new f50.i[]{o0Var, o0Var, v11, v12};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final i e(@m80.k i50.f decoder) {
            float f11;
            float f12;
            int i11;
            vg.a aVar;
            vg.a aVar2;
            g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            if (beginStructure.decodeSequentially()) {
                f11 = beginStructure.decodeFloatElement(fVar, 0);
                float decodeFloatElement = beginStructure.decodeFloatElement(fVar, 1);
                a.C1264a c1264a = a.C1264a.f93863a;
                vg.a aVar3 = (vg.a) beginStructure.decodeNullableSerializableElement(fVar, 2, c1264a, null);
                aVar2 = (vg.a) beginStructure.decodeNullableSerializableElement(fVar, 3, c1264a, null);
                aVar = aVar3;
                f12 = decodeFloatElement;
                i11 = 15;
            } else {
                f11 = 0.0f;
                boolean z11 = true;
                int i12 = 0;
                vg.a aVar4 = null;
                vg.a aVar5 = null;
                float f13 = 0.0f;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        f11 = beginStructure.decodeFloatElement(fVar, 0);
                        i12 |= 1;
                    } else if (decodeElementIndex == 1) {
                        f13 = beginStructure.decodeFloatElement(fVar, 1);
                        i12 |= 2;
                    } else if (decodeElementIndex == 2) {
                        aVar4 = (vg.a) beginStructure.decodeNullableSerializableElement(fVar, 2, a.C1264a.f93863a, aVar4);
                        i12 |= 4;
                    } else {
                        if (decodeElementIndex != 3) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        aVar5 = (vg.a) beginStructure.decodeNullableSerializableElement(fVar, 3, a.C1264a.f93863a, aVar5);
                        i12 |= 8;
                    }
                }
                f12 = f13;
                i11 = i12;
                aVar = aVar4;
                aVar2 = aVar5;
            }
            float f14 = f11;
            beginStructure.endStructure(fVar);
            return new i(i11, f14, f12, aVar, aVar2, (x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k i value) {
            g0.p(encoder, "encoder");
            g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            i.k(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<i> serializer() {
            return a.f93886a;
        }

        public b() {
        }
    }

    public i(float f11, float f12, @m80.l vg.a aVar, @m80.l vg.a aVar2) {
        this.f93882a = f11;
        this.f93883b = f12;
        this.f93884c = aVar;
        this.f93885d = aVar2;
    }

    public static /* synthetic */ i f(i iVar, float f11, float f12, vg.a aVar, vg.a aVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = iVar.f93882a;
        }
        if ((i11 & 2) != 0) {
            f12 = iVar.f93883b;
        }
        if ((i11 & 4) != 0) {
            aVar = iVar.f93884c;
        }
        if ((i11 & 8) != 0) {
            aVar2 = iVar.f93885d;
        }
        return iVar.e(f11, f12, aVar, aVar2);
    }

    @w00.o
    public static final /* synthetic */ void k(i iVar, i50.e eVar, h50.f fVar) {
        eVar.encodeFloatElement(fVar, 0, iVar.f93882a);
        eVar.encodeFloatElement(fVar, 1, iVar.f93883b);
        if (eVar.shouldEncodeElementDefault(fVar, 2) || iVar.f93884c != null) {
            eVar.encodeNullableSerializableElement(fVar, 2, a.C1264a.f93863a, iVar.f93884c);
        }
        if (!eVar.shouldEncodeElementDefault(fVar, 3) && iVar.f93885d == null) {
            return;
        }
        eVar.encodeNullableSerializableElement(fVar, 3, a.C1264a.f93863a, iVar.f93885d);
    }

    public final float a() {
        return this.f93882a;
    }

    public final float b() {
        return this.f93883b;
    }

    @m80.l
    public final vg.a c() {
        return this.f93884c;
    }

    @m80.l
    public final vg.a d() {
        return this.f93885d;
    }

    @m80.k
    public final i e(float f11, float f12, @m80.l vg.a aVar, @m80.l vg.a aVar2) {
        return new i(f11, f12, aVar, aVar2);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Float.compare(this.f93882a, iVar.f93882a) == 0 && Float.compare(this.f93883b, iVar.f93883b) == 0 && g0.g(this.f93884c, iVar.f93884c) && g0.g(this.f93885d, iVar.f93885d);
    }

    @m80.l
    public final vg.a g() {
        return this.f93884c;
    }

    @m80.l
    public final vg.a h() {
        return this.f93885d;
    }

    public int hashCode() {
        int hashCode = ((Float.hashCode(this.f93882a) * 31) + Float.hashCode(this.f93883b)) * 31;
        vg.a aVar = this.f93884c;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        vg.a aVar2 = this.f93885d;
        return hashCode2 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    public final float i() {
        return this.f93882a;
    }

    public final float j() {
        return this.f93883b;
    }

    @m80.k
    public String toString() {
        return "PathPoint(x=" + this.f93882a + ", y=" + this.f93883b + ", anchor1=" + this.f93884c + ", anchor2=" + this.f93885d + pn.j.f81007d;
    }

    public /* synthetic */ i(int i11, float f11, float f12, vg.a aVar, vg.a aVar2, x2 x2Var) {
        if (3 != (i11 & 3)) {
            h2.b(i11, 3, a.f93886a.a());
        }
        this.f93882a = f11;
        this.f93883b = f12;
        if ((i11 & 4) == 0) {
            this.f93884c = null;
        } else {
            this.f93884c = aVar;
        }
        if ((i11 & 8) == 0) {
            this.f93885d = null;
        } else {
            this.f93885d = aVar2;
        }
    }

    public /* synthetic */ i(float f11, float f12, vg.a aVar, vg.a aVar2, int i11, kotlin.jvm.internal.v vVar) {
        this(f11, f12, (i11 & 4) != 0 ? null : aVar, (i11 & 8) != 0 ? null : aVar2);
    }
}
