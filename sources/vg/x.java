package vg;

import androidx.compose.runtime.internal.StabilityInferred;
import f50.a0;
import j50.h2;
import j50.l2;
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
public final class x {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f93926c = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final vg.a f93927a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final vg.a f93928b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements p0<x> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f93929a;

        /* renamed from: b, reason: collision with root package name */
        public static final int f93930b;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f93929a = aVar;
            f93930b = 8;
            l2 l2Var = new l2("com.baicizhan.main.home.player.data.animation2.TimingFunction", aVar, 2);
            l2Var.q("anchor1", false);
            l2Var.q("anchor2", false);
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
            return new f50.i[]{c1264a, c1264a};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final x e(@m80.k i50.f decoder) {
            vg.a aVar;
            int i11;
            vg.a aVar2;
            g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            x2 x2Var = null;
            if (beginStructure.decodeSequentially()) {
                a.C1264a c1264a = a.C1264a.f93863a;
                aVar2 = (vg.a) beginStructure.decodeSerializableElement(fVar, 0, c1264a, null);
                aVar = (vg.a) beginStructure.decodeSerializableElement(fVar, 1, c1264a, null);
                i11 = 3;
            } else {
                boolean z11 = true;
                int i12 = 0;
                aVar = null;
                vg.a aVar3 = null;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        aVar3 = (vg.a) beginStructure.decodeSerializableElement(fVar, 0, a.C1264a.f93863a, aVar3);
                        i12 |= 1;
                    } else {
                        if (decodeElementIndex != 1) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        aVar = (vg.a) beginStructure.decodeSerializableElement(fVar, 1, a.C1264a.f93863a, aVar);
                        i12 |= 2;
                    }
                }
                i11 = i12;
                aVar2 = aVar3;
            }
            beginStructure.endStructure(fVar);
            return new x(i11, aVar2, aVar, x2Var);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k x value) {
            g0.p(encoder, "encoder");
            g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            x.g(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<x> serializer() {
            return a.f93929a;
        }

        public b() {
        }
    }

    public /* synthetic */ x(int i11, vg.a aVar, vg.a aVar2, x2 x2Var) {
        if (3 != (i11 & 3)) {
            h2.b(i11, 3, a.f93929a.a());
        }
        this.f93927a = aVar;
        this.f93928b = aVar2;
    }

    public static /* synthetic */ x d(x xVar, vg.a aVar, vg.a aVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = xVar.f93927a;
        }
        if ((i11 & 2) != 0) {
            aVar2 = xVar.f93928b;
        }
        return xVar.c(aVar, aVar2);
    }

    @w00.o
    public static final /* synthetic */ void g(x xVar, i50.e eVar, h50.f fVar) {
        a.C1264a c1264a = a.C1264a.f93863a;
        eVar.encodeSerializableElement(fVar, 0, c1264a, xVar.f93927a);
        eVar.encodeSerializableElement(fVar, 1, c1264a, xVar.f93928b);
    }

    @m80.k
    public final vg.a a() {
        return this.f93927a;
    }

    @m80.k
    public final vg.a b() {
        return this.f93928b;
    }

    @m80.k
    public final x c(@m80.k vg.a anchor1, @m80.k vg.a anchor2) {
        g0.p(anchor1, "anchor1");
        g0.p(anchor2, "anchor2");
        return new x(anchor1, anchor2);
    }

    @m80.k
    public final vg.a e() {
        return this.f93927a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return g0.g(this.f93927a, xVar.f93927a) && g0.g(this.f93928b, xVar.f93928b);
    }

    @m80.k
    public final vg.a f() {
        return this.f93928b;
    }

    public int hashCode() {
        return (this.f93927a.hashCode() * 31) + this.f93928b.hashCode();
    }

    @m80.k
    public String toString() {
        return "TimingFunction(anchor1=" + this.f93927a + ", anchor2=" + this.f93928b + pn.j.f81007d;
    }

    public x(@m80.k vg.a anchor1, @m80.k vg.a anchor2) {
        g0.p(anchor1, "anchor1");
        g0.p(anchor2, "anchor2");
        this.f93927a = anchor1;
        this.f93928b = anchor2;
    }
}
