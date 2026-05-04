package m3;

import j50.p0;
import j50.x2;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.UnknownFieldException;
import m3.m0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class s0 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final yz.c0<f50.i<Object>>[] f72067d = {null, null, yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: m3.r0
        @Override // x00.a
        public final Object invoke() {
            f50.i b11;
            b11 = s0.b();
            return b11;
        }
    })};

    /* renamed from: a, reason: collision with root package name */
    public final int f72068a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final m0 f72069b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<m0> f72070c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<s0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f72071a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f72071a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.ResetComboInfoModel", aVar, 3);
            l2Var.q("currentCombo", false);
            l2Var.q("useProps", true);
            l2Var.q("propsRemain", false);
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
            return new f50.i[]{j50.z0.f63517a, g50.a.v(m0.a.f71998a), s0.f72067d[2].getValue()};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final s0 e(@m80.k i50.f decoder) {
            int i11;
            int i12;
            m0 m0Var;
            List list;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            yz.c0[] c0VarArr = s0.f72067d;
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                m0 m0Var2 = (m0) beginStructure.decodeNullableSerializableElement(fVar, 1, m0.a.f71998a, null);
                list = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), null);
                i12 = 7;
                m0Var = m0Var2;
            } else {
                boolean z11 = true;
                i11 = 0;
                m0 m0Var3 = null;
                List list2 = null;
                int i13 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        i11 = beginStructure.decodeIntElement(fVar, 0);
                        i13 |= 1;
                    } else if (decodeElementIndex == 1) {
                        m0Var3 = (m0) beginStructure.decodeNullableSerializableElement(fVar, 1, m0.a.f71998a, m0Var3);
                        i13 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        list2 = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), list2);
                        i13 |= 4;
                    }
                }
                i12 = i13;
                m0Var = m0Var3;
                list = list2;
            }
            int i14 = i11;
            beginStructure.endStructure(fVar);
            return new s0(i12, i14, m0Var, list, (x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k s0 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            s0.o(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<s0> serializer() {
            return a.f72071a;
        }

        public b() {
        }
    }

    public /* synthetic */ s0(int i11, int i12, m0 m0Var, List list, x2 x2Var) {
        if (5 != (i11 & 5)) {
            j50.h2.b(i11, 5, a.f72071a.a());
        }
        this.f72068a = i12;
        if ((i11 & 2) == 0) {
            this.f72069b = null;
        } else {
            this.f72069b = m0Var;
        }
        this.f72070c = list;
    }

    public static final /* synthetic */ f50.i b() {
        return new j50.f(m0.a.f71998a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ s0 h(s0 s0Var, int i11, m0 m0Var, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = s0Var.f72068a;
        }
        if ((i12 & 2) != 0) {
            m0Var = s0Var.f72069b;
        }
        if ((i12 & 4) != 0) {
            list = s0Var.f72070c;
        }
        return s0Var.g(i11, m0Var, list);
    }

    @w00.o
    public static final /* synthetic */ void o(s0 s0Var, i50.e eVar, h50.f fVar) {
        yz.c0<f50.i<Object>>[] c0VarArr = f72067d;
        eVar.encodeIntElement(fVar, 0, s0Var.f72068a);
        if (eVar.shouldEncodeElementDefault(fVar, 1) || s0Var.f72069b != null) {
            eVar.encodeNullableSerializableElement(fVar, 1, m0.a.f71998a, s0Var.f72069b);
        }
        eVar.encodeSerializableElement(fVar, 2, c0VarArr[2].getValue(), s0Var.f72070c);
    }

    public final int d() {
        return this.f72068a;
    }

    @m80.l
    public final m0 e() {
        return this.f72069b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f72068a == s0Var.f72068a && kotlin.jvm.internal.g0.g(this.f72069b, s0Var.f72069b) && kotlin.jvm.internal.g0.g(this.f72070c, s0Var.f72070c);
    }

    @m80.k
    public final List<m0> f() {
        return this.f72070c;
    }

    @m80.k
    public final s0 g(int i11, @m80.l m0 m0Var, @m80.k List<m0> propsRemain) {
        kotlin.jvm.internal.g0.p(propsRemain, "propsRemain");
        return new s0(i11, m0Var, propsRemain);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f72068a) * 31;
        m0 m0Var = this.f72069b;
        return ((hashCode + (m0Var == null ? 0 : m0Var.hashCode())) * 31) + this.f72070c.hashCode();
    }

    public final int i() {
        return this.f72068a;
    }

    @m80.k
    public final List<m0> k() {
        return this.f72070c;
    }

    @m80.l
    public final m0 m() {
        return this.f72069b;
    }

    @m80.k
    public String toString() {
        return "ResetComboInfoModel(currentCombo=" + this.f72068a + ", usePropsItem=" + this.f72069b + ", propsRemain=" + this.f72070c + ')';
    }

    public s0(int i11, @m80.l m0 m0Var, @m80.k List<m0> propsRemain) {
        kotlin.jvm.internal.g0.p(propsRemain, "propsRemain");
        this.f72068a = i11;
        this.f72069b = m0Var;
        this.f72070c = propsRemain;
    }

    public /* synthetic */ s0(int i11, m0 m0Var, List list, int i12, kotlin.jvm.internal.v vVar) {
        this(i11, (i12 & 2) != 0 ? null : m0Var, list);
    }

    @f50.z("currentCombo")
    public static /* synthetic */ void j() {
    }

    @f50.z("propsRemain")
    public static /* synthetic */ void l() {
    }

    @f50.z("useProps")
    public static /* synthetic */ void n() {
    }
}
