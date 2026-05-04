package m3;

import j50.d3;
import j50.p0;
import j50.x2;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.UnknownFieldException;
import m3.g1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class n1 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final yz.c0<f50.i<Object>>[] f72008f = {null, null, yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: m3.m1
        @Override // x00.a
        public final Object invoke() {
            f50.i b11;
            b11 = n1.b();
            return b11;
        }
    }), null, null};

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f72009a;

    /* renamed from: b, reason: collision with root package name */
    public final int f72010b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<g1> f72011c;

    /* renamed from: d, reason: collision with root package name */
    public final int f72012d;

    /* renamed from: e, reason: collision with root package name */
    public final int f72013e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<n1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f72014a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f72014a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.SubmitGameVo", aVar, 5);
            l2Var.q("gameId", false);
            l2Var.q("submitGameState", false);
            l2Var.q("learnedWords", false);
            l2Var.q("enterDay", false);
            l2Var.q("starCount", true);
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
            yz.c0[] c0VarArr = n1.f72008f;
            j50.z0 z0Var = j50.z0.f63517a;
            return new f50.i[]{d3.f63348a, z0Var, c0VarArr[2].getValue(), z0Var, z0Var};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final n1 e(@m80.k i50.f decoder) {
            int i11;
            int i12;
            int i13;
            int i14;
            String str;
            List list;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            yz.c0[] c0VarArr = n1.f72008f;
            if (beginStructure.decodeSequentially()) {
                String decodeStringElement = beginStructure.decodeStringElement(fVar, 0);
                int decodeIntElement = beginStructure.decodeIntElement(fVar, 1);
                list = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), null);
                str = decodeStringElement;
                i11 = beginStructure.decodeIntElement(fVar, 3);
                i12 = beginStructure.decodeIntElement(fVar, 4);
                i13 = 31;
                i14 = decodeIntElement;
            } else {
                boolean z11 = true;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                String str2 = null;
                List list2 = null;
                int i18 = 0;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        str2 = beginStructure.decodeStringElement(fVar, 0);
                        i16 |= 1;
                    } else if (decodeElementIndex == 1) {
                        i17 = beginStructure.decodeIntElement(fVar, 1);
                        i16 |= 2;
                    } else if (decodeElementIndex == 2) {
                        list2 = (List) beginStructure.decodeSerializableElement(fVar, 2, (f50.e) c0VarArr[2].getValue(), list2);
                        i16 |= 4;
                    } else if (decodeElementIndex == 3) {
                        i15 = beginStructure.decodeIntElement(fVar, 3);
                        i16 |= 8;
                    } else {
                        if (decodeElementIndex != 4) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        i18 = beginStructure.decodeIntElement(fVar, 4);
                        i16 |= 16;
                    }
                }
                i11 = i15;
                i12 = i18;
                i13 = i16;
                i14 = i17;
                str = str2;
                list = list2;
            }
            beginStructure.endStructure(fVar);
            return new n1(i13, str, i14, list, i11, i12, (x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k n1 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            n1.u(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<n1> serializer() {
            return a.f72014a;
        }

        public b() {
        }
    }

    public /* synthetic */ n1(int i11, String str, int i12, List list, int i13, int i14, x2 x2Var) {
        if (15 != (i11 & 15)) {
            j50.h2.b(i11, 15, a.f72014a.a());
        }
        this.f72009a = str;
        this.f72010b = i12;
        this.f72011c = list;
        this.f72012d = i13;
        if ((i11 & 16) == 0) {
            this.f72013e = 0;
        } else {
            this.f72013e = i14;
        }
    }

    public static final /* synthetic */ f50.i b() {
        return new j50.f(g1.a.f71927a);
    }

    public static /* synthetic */ n1 j(n1 n1Var, String str, int i11, List list, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = n1Var.f72009a;
        }
        if ((i14 & 2) != 0) {
            i11 = n1Var.f72010b;
        }
        if ((i14 & 4) != 0) {
            list = n1Var.f72011c;
        }
        if ((i14 & 8) != 0) {
            i12 = n1Var.f72012d;
        }
        if ((i14 & 16) != 0) {
            i13 = n1Var.f72013e;
        }
        int i15 = i13;
        List list2 = list;
        return n1Var.i(str, i11, list2, i12, i15);
    }

    @w00.o
    public static final /* synthetic */ void u(n1 n1Var, i50.e eVar, h50.f fVar) {
        yz.c0<f50.i<Object>>[] c0VarArr = f72008f;
        eVar.encodeStringElement(fVar, 0, n1Var.f72009a);
        eVar.encodeIntElement(fVar, 1, n1Var.f72010b);
        eVar.encodeSerializableElement(fVar, 2, c0VarArr[2].getValue(), n1Var.f72011c);
        eVar.encodeIntElement(fVar, 3, n1Var.f72012d);
        if (!eVar.shouldEncodeElementDefault(fVar, 4) && n1Var.f72013e == 0) {
            return;
        }
        eVar.encodeIntElement(fVar, 4, n1Var.f72013e);
    }

    @m80.k
    public final String d() {
        return this.f72009a;
    }

    public final int e() {
        return this.f72010b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return kotlin.jvm.internal.g0.g(this.f72009a, n1Var.f72009a) && this.f72010b == n1Var.f72010b && kotlin.jvm.internal.g0.g(this.f72011c, n1Var.f72011c) && this.f72012d == n1Var.f72012d && this.f72013e == n1Var.f72013e;
    }

    @m80.k
    public final List<g1> f() {
        return this.f72011c;
    }

    public final int g() {
        return this.f72012d;
    }

    public final int h() {
        return this.f72013e;
    }

    public int hashCode() {
        return (((((((this.f72009a.hashCode() * 31) + Integer.hashCode(this.f72010b)) * 31) + this.f72011c.hashCode()) * 31) + Integer.hashCode(this.f72012d)) * 31) + Integer.hashCode(this.f72013e);
    }

    @m80.k
    public final n1 i(@m80.k String gameId, int i11, @m80.k List<g1> learnedWords, int i12, int i13) {
        kotlin.jvm.internal.g0.p(gameId, "gameId");
        kotlin.jvm.internal.g0.p(learnedWords, "learnedWords");
        return new n1(gameId, i11, learnedWords, i12, i13);
    }

    public final int k() {
        return this.f72012d;
    }

    @m80.k
    public final String m() {
        return this.f72009a;
    }

    @m80.k
    public final List<g1> o() {
        return this.f72011c;
    }

    public final int q() {
        return this.f72013e;
    }

    public final int s() {
        return this.f72010b;
    }

    @m80.k
    public String toString() {
        return "SubmitGameVo(gameId=" + this.f72009a + ", submitGameState=" + this.f72010b + ", learnedWords=" + this.f72011c + ", enterDay=" + this.f72012d + ", starCount=" + this.f72013e + ')';
    }

    public n1(@m80.k String gameId, int i11, @m80.k List<g1> learnedWords, int i12, int i13) {
        kotlin.jvm.internal.g0.p(gameId, "gameId");
        kotlin.jvm.internal.g0.p(learnedWords, "learnedWords");
        this.f72009a = gameId;
        this.f72010b = i11;
        this.f72011c = learnedWords;
        this.f72012d = i12;
        this.f72013e = i13;
    }

    public /* synthetic */ n1(String str, int i11, List list, int i12, int i13, int i14, kotlin.jvm.internal.v vVar) {
        this(str, i11, list, i12, (i14 & 16) != 0 ? 0 : i13);
    }

    @f50.z("enterDay")
    public static /* synthetic */ void l() {
    }

    @f50.z("gameId")
    public static /* synthetic */ void n() {
    }

    @f50.z("learnedWords")
    public static /* synthetic */ void p() {
    }

    @f50.z("starCount")
    public static /* synthetic */ void r() {
    }

    @f50.z("submitGameState")
    public static /* synthetic */ void t() {
    }
}
