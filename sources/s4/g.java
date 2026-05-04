package s4;

import f50.a0;
import f50.i;
import j50.h2;
import j50.l2;
import j50.p0;
import j50.x2;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import kotlinx.serialization.UnknownFieldException;
import m3.v0;
import m3.z;
import m3.z0;
import m80.k;
import m80.l;
import s4.d;
import w00.o;
import yz.c0;
import yz.e0;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a0
/* loaded from: classes3.dex */
public final class g {

    @k
    public static final b Companion = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @k
    public static final c0<i<Object>>[] f87560f;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<v0> f87561a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f87562b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final z f87563c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final z0 f87564d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final List<v0> f87565e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements p0<g> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f87566a;

        @k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f87566a = aVar;
            l2 l2Var = new l2("com.baicizhan.app.biz.game.impl.h5enhance.vo.SubmitGameRspH5Vo", aVar, 5);
            l2Var.q("singleWordsGameAward", false);
            l2Var.q("studyProgress", false);
            l2Var.q("lavaQuest", true);
            l2Var.q("roundComboAward", true);
            l2Var.q("starAward", true);
            descriptor = l2Var;
        }

        @Override // f50.i, f50.b0, f50.e
        @k
        public final h50.f a() {
            return descriptor;
        }

        @Override // j50.p0
        @k
        public /* bridge */ i<?>[] c() {
            return p0.a.a(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // j50.p0
        @k
        public final i<?>[] f() {
            c0[] c0VarArr = g.f87560f;
            return new i[]{c0VarArr[0].getValue(), d.a.f87559a, g50.a.v(z.a.f72132a), g50.a.v(z0.a.f72137a), g50.a.v((i) c0VarArr[4].getValue())};
        }

        @Override // f50.e
        @k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final g e(@k i50.f decoder) {
            int i11;
            List list;
            d dVar;
            z zVar;
            z0 z0Var;
            List list2;
            g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            c0[] c0VarArr = g.f87560f;
            int i12 = 0;
            List list3 = null;
            if (beginStructure.decodeSequentially()) {
                List list4 = (List) beginStructure.decodeSerializableElement(fVar, 0, (f50.e) c0VarArr[0].getValue(), null);
                d dVar2 = (d) beginStructure.decodeSerializableElement(fVar, 1, d.a.f87559a, null);
                z zVar2 = (z) beginStructure.decodeNullableSerializableElement(fVar, 2, z.a.f72132a, null);
                z0 z0Var2 = (z0) beginStructure.decodeNullableSerializableElement(fVar, 3, z0.a.f72137a, null);
                list2 = (List) beginStructure.decodeNullableSerializableElement(fVar, 4, (f50.e) c0VarArr[4].getValue(), null);
                list = list4;
                z0Var = z0Var2;
                zVar = zVar2;
                i11 = 31;
                dVar = dVar2;
            } else {
                int i13 = 1;
                int i14 = 0;
                d dVar3 = null;
                z zVar3 = null;
                z0 z0Var3 = null;
                List list5 = null;
                while (i13 != 0) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    int i15 = i12;
                    if (decodeElementIndex == -1) {
                        i12 = i15;
                        i13 = i12;
                    } else if (decodeElementIndex != 0) {
                        if (decodeElementIndex == 1) {
                            dVar3 = (d) beginStructure.decodeSerializableElement(fVar, 1, d.a.f87559a, dVar3);
                            i14 |= 2;
                        } else if (decodeElementIndex == 2) {
                            zVar3 = (z) beginStructure.decodeNullableSerializableElement(fVar, 2, z.a.f72132a, zVar3);
                            i14 |= 4;
                        } else if (decodeElementIndex == 3) {
                            z0Var3 = (z0) beginStructure.decodeNullableSerializableElement(fVar, 3, z0.a.f72137a, z0Var3);
                            i14 |= 8;
                        } else {
                            if (decodeElementIndex != 4) {
                                throw new UnknownFieldException(decodeElementIndex);
                            }
                            list5 = (List) beginStructure.decodeNullableSerializableElement(fVar, 4, (f50.e) c0VarArr[4].getValue(), list5);
                            i14 |= 16;
                        }
                        i12 = i15;
                    } else {
                        list3 = (List) beginStructure.decodeSerializableElement(fVar, i15, (f50.e) c0VarArr[i15].getValue(), list3);
                        i14 |= 1;
                        i12 = i15;
                    }
                }
                i11 = i14;
                list = list3;
                dVar = dVar3;
                zVar = zVar3;
                z0Var = z0Var3;
                list2 = list5;
            }
            beginStructure.endStructure(fVar);
            return new g(i11, list, dVar, zVar, z0Var, list2, (x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@k i50.h encoder, @k g value) {
            g0.p(encoder, "encoder");
            g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            g.w(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        @k
        public final i<g> serializer() {
            return a.f87566a;
        }

        public b() {
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f87560f = new c0[]{e0.b(lazyThreadSafetyMode, new x00.a() { // from class: s4.e
            @Override // x00.a
            public final Object invoke() {
                i c11;
                c11 = g.c();
                return c11;
            }
        }), null, null, null, e0.b(lazyThreadSafetyMode, new x00.a() { // from class: s4.f
            @Override // x00.a
            public final Object invoke() {
                i d11;
                d11 = g.d();
                return d11;
            }
        })};
    }

    public /* synthetic */ g(int i11, List list, d dVar, z zVar, z0 z0Var, List list2, x2 x2Var) {
        if (3 != (i11 & 3)) {
            h2.b(i11, 3, a.f87566a.a());
        }
        this.f87561a = list;
        this.f87562b = dVar;
        if ((i11 & 4) == 0) {
            this.f87563c = null;
        } else {
            this.f87563c = zVar;
        }
        if ((i11 & 8) == 0) {
            this.f87564d = null;
        } else {
            this.f87564d = z0Var;
        }
        if ((i11 & 16) == 0) {
            this.f87565e = null;
        } else {
            this.f87565e = list2;
        }
    }

    public static final /* synthetic */ i c() {
        return new j50.f(v0.a.f72095a);
    }

    public static final /* synthetic */ i d() {
        return new j50.f(v0.a.f72095a);
    }

    public static /* synthetic */ g l(g gVar, List list, d dVar, z zVar, z0 z0Var, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = gVar.f87561a;
        }
        if ((i11 & 2) != 0) {
            dVar = gVar.f87562b;
        }
        if ((i11 & 4) != 0) {
            zVar = gVar.f87563c;
        }
        if ((i11 & 8) != 0) {
            z0Var = gVar.f87564d;
        }
        if ((i11 & 16) != 0) {
            list2 = gVar.f87565e;
        }
        List list3 = list2;
        z zVar2 = zVar;
        return gVar.k(list, dVar, zVar2, z0Var, list3);
    }

    @o
    public static final /* synthetic */ void w(g gVar, i50.e eVar, h50.f fVar) {
        c0<i<Object>>[] c0VarArr = f87560f;
        eVar.encodeSerializableElement(fVar, 0, c0VarArr[0].getValue(), gVar.f87561a);
        eVar.encodeSerializableElement(fVar, 1, d.a.f87559a, gVar.f87562b);
        if (eVar.shouldEncodeElementDefault(fVar, 2) || gVar.f87563c != null) {
            eVar.encodeNullableSerializableElement(fVar, 2, z.a.f72132a, gVar.f87563c);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 3) || gVar.f87564d != null) {
            eVar.encodeNullableSerializableElement(fVar, 3, z0.a.f72137a, gVar.f87564d);
        }
        if (!eVar.shouldEncodeElementDefault(fVar, 4) && gVar.f87565e == null) {
            return;
        }
        eVar.encodeNullableSerializableElement(fVar, 4, c0VarArr[4].getValue(), gVar.f87565e);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return g0.g(this.f87561a, gVar.f87561a) && g0.g(this.f87562b, gVar.f87562b) && g0.g(this.f87563c, gVar.f87563c) && g0.g(this.f87564d, gVar.f87564d) && g0.g(this.f87565e, gVar.f87565e);
    }

    @k
    public final List<v0> f() {
        return this.f87561a;
    }

    @k
    public final d g() {
        return this.f87562b;
    }

    @l
    public final z h() {
        return this.f87563c;
    }

    public int hashCode() {
        int hashCode = ((this.f87561a.hashCode() * 31) + this.f87562b.hashCode()) * 31;
        z zVar = this.f87563c;
        int hashCode2 = (hashCode + (zVar == null ? 0 : zVar.hashCode())) * 31;
        z0 z0Var = this.f87564d;
        int hashCode3 = (hashCode2 + (z0Var == null ? 0 : z0Var.hashCode())) * 31;
        List<v0> list = this.f87565e;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    @l
    public final z0 i() {
        return this.f87564d;
    }

    @l
    public final List<v0> j() {
        return this.f87565e;
    }

    @k
    public final g k(@k List<v0> singleWordsGameAward, @k d studyProgress, @l z zVar, @l z0 z0Var, @l List<v0> list) {
        g0.p(singleWordsGameAward, "singleWordsGameAward");
        g0.p(studyProgress, "studyProgress");
        return new g(singleWordsGameAward, studyProgress, zVar, z0Var, list);
    }

    @l
    public final z m() {
        return this.f87563c;
    }

    @l
    public final z0 o() {
        return this.f87564d;
    }

    @k
    public final List<v0> q() {
        return this.f87561a;
    }

    @l
    public final List<v0> s() {
        return this.f87565e;
    }

    @k
    public String toString() {
        return "SubmitGameRspH5Vo(singleWordsGameAward=" + this.f87561a + ", studyProgress=" + this.f87562b + ", lavaQuest=" + this.f87563c + ", roundComboAward=" + this.f87564d + ", starAward=" + this.f87565e + ')';
    }

    @k
    public final d u() {
        return this.f87562b;
    }

    public g(@k List<v0> singleWordsGameAward, @k d studyProgress, @l z zVar, @l z0 z0Var, @l List<v0> list) {
        g0.p(singleWordsGameAward, "singleWordsGameAward");
        g0.p(studyProgress, "studyProgress");
        this.f87561a = singleWordsGameAward;
        this.f87562b = studyProgress;
        this.f87563c = zVar;
        this.f87564d = z0Var;
        this.f87565e = list;
    }

    public /* synthetic */ g(List list, d dVar, z zVar, z0 z0Var, List list2, int i11, v vVar) {
        this(list, dVar, (i11 & 4) != 0 ? null : zVar, (i11 & 8) != 0 ? null : z0Var, (i11 & 16) != 0 ? null : list2);
    }

    @f50.z("lavaQuest")
    public static /* synthetic */ void n() {
    }

    @f50.z("roundComboAward")
    public static /* synthetic */ void p() {
    }

    @f50.z("singleWordsGameAward")
    public static /* synthetic */ void r() {
    }

    @f50.z("starAward")
    public static /* synthetic */ void t() {
    }

    @f50.z("studyProgress")
    public static /* synthetic */ void v() {
    }
}
