package m3;

import j50.p0;
import j50.x2;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.UnknownFieldException;
import m3.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class z0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final yz.c0<f50.i<Object>>[] f72133d = {null, null, yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: m3.y0
        @Override // x00.a
        public final Object invoke() {
            f50.i b11;
            b11 = z0.b();
            return b11;
        }
    })};

    /* renamed from: a, reason: collision with root package name */
    public final int f72134a;

    /* renamed from: b, reason: collision with root package name */
    public final int f72135b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<k> f72136c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<z0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f72137a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f72137a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.RoundComboAward", aVar, 3);
            l2Var.q("currentCombo", false);
            l2Var.q("maxCombo", false);
            l2Var.q("awardCombo", false);
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
            return p0.a.a(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // j50.p0
        @m80.k
        public final f50.i<?>[] f() {
            yz.c0[] c0VarArr = z0.f72133d;
            j50.z0 z0Var = j50.z0.f63517a;
            return new f50.i[]{z0Var, z0Var, c0VarArr[2].getValue()};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final z0 e(@m80.k i50.f decoder) {
            int i11;
            int i12;
            int i13;
            List list;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            yz.c0[] c0VarArr = z0.f72133d;
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                int decodeIntElement = beginStructure.decodeIntElement(fVar, 1);
                list = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), null);
                i12 = 7;
                i13 = decodeIntElement;
            } else {
                boolean z11 = true;
                i11 = 0;
                int i14 = 0;
                List list2 = null;
                int i15 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        i11 = beginStructure.decodeIntElement(fVar, 0);
                        i15 |= 1;
                    } else if (decodeElementIndex == 1) {
                        i14 = beginStructure.decodeIntElement(fVar, 1);
                        i15 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        list2 = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), list2);
                        i15 |= 4;
                    }
                }
                i12 = i15;
                i13 = i14;
                list = list2;
            }
            int i16 = i11;
            beginStructure.endStructure(fVar);
            return new z0(i12, i16, i13, list, null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k z0 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            z0.o(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<z0> serializer() {
            return a.f72137a;
        }

        public b() {
        }
    }

    public /* synthetic */ z0(int i11, int i12, int i13, List list, x2 x2Var) {
        if (7 != (i11 & 7)) {
            j50.h2.b(i11, 7, a.f72137a.a());
        }
        this.f72134a = i12;
        this.f72135b = i13;
        this.f72136c = list;
    }

    public static final /* synthetic */ f50.i b() {
        return new j50.f(k.a.f71968a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ z0 h(z0 z0Var, int i11, int i12, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = z0Var.f72134a;
        }
        if ((i13 & 2) != 0) {
            i12 = z0Var.f72135b;
        }
        if ((i13 & 4) != 0) {
            list = z0Var.f72136c;
        }
        return z0Var.g(i11, i12, list);
    }

    @w00.o
    public static final /* synthetic */ void o(z0 z0Var, i50.e eVar, h50.f fVar) {
        yz.c0<f50.i<Object>>[] c0VarArr = f72133d;
        eVar.encodeIntElement(fVar, 0, z0Var.f72134a);
        eVar.encodeIntElement(fVar, 1, z0Var.f72135b);
        eVar.encodeSerializableElement(fVar, 2, c0VarArr[2].getValue(), z0Var.f72136c);
    }

    public final int d() {
        return this.f72134a;
    }

    public final int e() {
        return this.f72135b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return this.f72134a == z0Var.f72134a && this.f72135b == z0Var.f72135b && kotlin.jvm.internal.g0.g(this.f72136c, z0Var.f72136c);
    }

    @m80.k
    public final List<k> f() {
        return this.f72136c;
    }

    @m80.k
    public final z0 g(int i11, int i12, @m80.k List<k> comboAwards) {
        kotlin.jvm.internal.g0.p(comboAwards, "comboAwards");
        return new z0(i11, i12, comboAwards);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f72134a) * 31) + Integer.hashCode(this.f72135b)) * 31) + this.f72136c.hashCode();
    }

    @m80.k
    public final List<k> i() {
        return this.f72136c;
    }

    public final int k() {
        return this.f72134a;
    }

    public final int m() {
        return this.f72135b;
    }

    @m80.k
    public String toString() {
        return "RoundComboAward(currentCombo=" + this.f72134a + ", maxCombo=" + this.f72135b + ", comboAwards=" + this.f72136c + ')';
    }

    public z0(int i11, int i12, @m80.k List<k> comboAwards) {
        kotlin.jvm.internal.g0.p(comboAwards, "comboAwards");
        this.f72134a = i11;
        this.f72135b = i12;
        this.f72136c = comboAwards;
    }

    @f50.z("awardCombo")
    public static /* synthetic */ void j() {
    }

    @f50.z("currentCombo")
    public static /* synthetic */ void l() {
    }

    @f50.z("maxCombo")
    public static /* synthetic */ void n() {
    }
}
