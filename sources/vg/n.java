package vg;

import androidx.compose.runtime.internal.StabilityInferred;
import f50.a0;
import j50.l2;
import j50.p0;
import j50.x2;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlinx.serialization.UnknownFieldException;
import vg.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@a0
/* loaded from: classes4.dex */
public final class n {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f93897d = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final r f93898a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final r f93899b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final r f93900c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements p0<n> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f93901a;

        /* renamed from: b, reason: collision with root package name */
        public static final int f93902b;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f93901a = aVar;
            f93902b = 8;
            l2 l2Var = new l2("com.baicizhan.main.home.player.data.animation2.Rotation", aVar, 3);
            l2Var.q("rx", true);
            l2Var.q("ry", true);
            l2Var.q("rz", true);
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
            r.a aVar = r.a.f93910a;
            return new f50.i[]{aVar, aVar, aVar};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final n e(@m80.k i50.f decoder) {
            int i11;
            r rVar;
            r rVar2;
            r rVar3;
            g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            r rVar4 = null;
            if (beginStructure.decodeSequentially()) {
                r.a aVar = r.a.f93910a;
                r rVar5 = (r) beginStructure.decodeSerializableElement(fVar, 0, aVar, null);
                r rVar6 = (r) beginStructure.decodeSerializableElement(fVar, 1, aVar, null);
                rVar3 = (r) beginStructure.decodeSerializableElement(fVar, 2, aVar, null);
                i11 = 7;
                rVar2 = rVar6;
                rVar = rVar5;
            } else {
                boolean z11 = true;
                int i12 = 0;
                r rVar7 = null;
                r rVar8 = null;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        rVar4 = (r) beginStructure.decodeSerializableElement(fVar, 0, r.a.f93910a, rVar4);
                        i12 |= 1;
                    } else if (decodeElementIndex == 1) {
                        rVar7 = (r) beginStructure.decodeSerializableElement(fVar, 1, r.a.f93910a, rVar7);
                        i12 |= 2;
                    } else {
                        if (decodeElementIndex != 2) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        rVar8 = (r) beginStructure.decodeSerializableElement(fVar, 2, r.a.f93910a, rVar8);
                        i12 |= 4;
                    }
                }
                i11 = i12;
                rVar = rVar4;
                rVar2 = rVar7;
                rVar3 = rVar8;
            }
            beginStructure.endStructure(fVar);
            return new n(i11, rVar, rVar2, rVar3, (x2) null);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k n value) {
            g0.p(encoder, "encoder");
            g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            n.i(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<n> serializer() {
            return a.f93901a;
        }

        public b() {
        }
    }

    public n() {
        this((r) null, (r) null, (r) null, 7, (kotlin.jvm.internal.v) null);
    }

    public static /* synthetic */ n e(n nVar, r rVar, r rVar2, r rVar3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            rVar = nVar.f93898a;
        }
        if ((i11 & 2) != 0) {
            rVar2 = nVar.f93899b;
        }
        if ((i11 & 4) != 0) {
            rVar3 = nVar.f93900c;
        }
        return nVar.d(rVar, rVar2, rVar3);
    }

    @w00.o
    public static final /* synthetic */ void i(n nVar, i50.e eVar, h50.f fVar) {
        if (eVar.shouldEncodeElementDefault(fVar, 0) || !g0.g(nVar.f93898a, new r(0.0f, (List) null, (List) null, (List) null, 0.0f, 31, (kotlin.jvm.internal.v) null))) {
            eVar.encodeSerializableElement(fVar, 0, r.a.f93910a, nVar.f93898a);
        }
        if (eVar.shouldEncodeElementDefault(fVar, 1) || !g0.g(nVar.f93899b, new r(0.0f, (List) null, (List) null, (List) null, 0.0f, 31, (kotlin.jvm.internal.v) null))) {
            eVar.encodeSerializableElement(fVar, 1, r.a.f93910a, nVar.f93899b);
        }
        if (!eVar.shouldEncodeElementDefault(fVar, 2) && g0.g(nVar.f93900c, new r(0.0f, (List) null, (List) null, (List) null, 0.0f, 31, (kotlin.jvm.internal.v) null))) {
            return;
        }
        eVar.encodeSerializableElement(fVar, 2, r.a.f93910a, nVar.f93900c);
    }

    @m80.k
    public final r a() {
        return this.f93898a;
    }

    @m80.k
    public final r b() {
        return this.f93899b;
    }

    @m80.k
    public final r c() {
        return this.f93900c;
    }

    @m80.k
    public final n d(@m80.k r rx2, @m80.k r ry2, @m80.k r rz2) {
        g0.p(rx2, "rx");
        g0.p(ry2, "ry");
        g0.p(rz2, "rz");
        return new n(rx2, ry2, rz2);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return g0.g(this.f93898a, nVar.f93898a) && g0.g(this.f93899b, nVar.f93899b) && g0.g(this.f93900c, nVar.f93900c);
    }

    @m80.k
    public final r f() {
        return this.f93898a;
    }

    @m80.k
    public final r g() {
        return this.f93899b;
    }

    @m80.k
    public final r h() {
        return this.f93900c;
    }

    public int hashCode() {
        return (((this.f93898a.hashCode() * 31) + this.f93899b.hashCode()) * 31) + this.f93900c.hashCode();
    }

    @m80.k
    public String toString() {
        return "Rotation(rx=" + this.f93898a + ", ry=" + this.f93899b + ", rz=" + this.f93900c + pn.j.f81007d;
    }

    public /* synthetic */ n(int i11, r rVar, r rVar2, r rVar3, x2 x2Var) {
        if ((i11 & 1) == 0) {
            this.f93898a = new r(0.0f, (List) null, (List) null, (List) null, 0.0f, 31, (kotlin.jvm.internal.v) null);
        } else {
            this.f93898a = rVar;
        }
        if ((i11 & 2) == 0) {
            this.f93899b = new r(0.0f, (List) null, (List) null, (List) null, 0.0f, 31, (kotlin.jvm.internal.v) null);
        } else {
            this.f93899b = rVar2;
        }
        if ((i11 & 4) == 0) {
            this.f93900c = new r(0.0f, (List) null, (List) null, (List) null, 0.0f, 31, (kotlin.jvm.internal.v) null);
        } else {
            this.f93900c = rVar3;
        }
    }

    public n(@m80.k r rx2, @m80.k r ry2, @m80.k r rz2) {
        g0.p(rx2, "rx");
        g0.p(ry2, "ry");
        g0.p(rz2, "rz");
        this.f93898a = rx2;
        this.f93899b = ry2;
        this.f93900c = rz2;
    }

    public /* synthetic */ n(r rVar, r rVar2, r rVar3, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? new r(0.0f, (List) null, (List) null, (List) null, 0.0f, 31, (kotlin.jvm.internal.v) null) : rVar, (i11 & 2) != 0 ? new r(0.0f, (List) null, (List) null, (List) null, 0.0f, 31, (kotlin.jvm.internal.v) null) : rVar2, (i11 & 4) != 0 ? new r(0.0f, (List) null, (List) null, (List) null, 0.0f, 31, (kotlin.jvm.internal.v) null) : rVar3);
    }
}
