package m3;

import j50.p0;
import j50.x2;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.UnknownFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.a0
/* loaded from: classes3.dex */
public final class f1 {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final yz.c0<f50.i<Object>>[] f71905c = {null, yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new x00.a() { // from class: m3.e1
        @Override // x00.a
        public final Object invoke() {
            f50.i b11;
            b11 = f1.b();
            return b11;
        }
    })};

    /* renamed from: a, reason: collision with root package name */
    public final int f71906a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<Integer> f71907b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @yz.n(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
    public static final /* synthetic */ class a implements j50.p0<f1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f71908a;

        @m80.k
        private static final h50.f descriptor;

        static {
            a aVar = new a();
            f71908a = aVar;
            j50.l2 l2Var = new j50.l2("com.baicizhan.app.api.service.model.game.StudyBuddyInfoVo", aVar, 2);
            l2Var.q("studyBuddyType", false);
            l2Var.q("buddySkill", false);
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
            return new f50.i[]{j50.z0.f63517a, f1.f71905c[1].getValue()};
        }

        @Override // f50.e
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final f1 e(@m80.k i50.f decoder) {
            List list;
            int i11;
            int i12;
            kotlin.jvm.internal.g0.p(decoder, "decoder");
            h50.f fVar = descriptor;
            i50.d beginStructure = decoder.beginStructure(fVar);
            yz.c0[] c0VarArr = f1.f71905c;
            x2 x2Var = null;
            if (beginStructure.decodeSequentially()) {
                i11 = beginStructure.decodeIntElement(fVar, 0);
                list = (List) beginStructure.decodeSerializableElement(fVar, 1, (f50.e) c0VarArr[1].getValue(), null);
                i12 = 3;
            } else {
                boolean z11 = true;
                int i13 = 0;
                int i14 = 0;
                List list2 = null;
                while (z11) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(fVar);
                    if (decodeElementIndex == -1) {
                        z11 = false;
                    } else if (decodeElementIndex == 0) {
                        i13 = beginStructure.decodeIntElement(fVar, 0);
                        i14 |= 1;
                    } else {
                        if (decodeElementIndex != 1) {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                        list2 = (List) beginStructure.decodeSerializableElement(fVar, 1, (f50.e) c0VarArr[1].getValue(), list2);
                        i14 |= 2;
                    }
                }
                list = list2;
                i11 = i13;
                i12 = i14;
            }
            beginStructure.endStructure(fVar);
            return new f1(i12, i11, list, x2Var);
        }

        @Override // f50.b0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void b(@m80.k i50.h encoder, @m80.k f1 value) {
            kotlin.jvm.internal.g0.p(encoder, "encoder");
            kotlin.jvm.internal.g0.p(value, "value");
            h50.f fVar = descriptor;
            i50.e beginStructure = encoder.beginStructure(fVar);
            f1.l(value, beginStructure, fVar);
            beginStructure.endStructure(fVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<f1> serializer() {
            return a.f71908a;
        }

        public b() {
        }
    }

    public /* synthetic */ f1(int i11, int i12, List list, x2 x2Var) {
        if (3 != (i11 & 3)) {
            j50.h2.b(i11, 3, a.f71908a.a());
        }
        this.f71906a = i12;
        this.f71907b = list;
    }

    public static final /* synthetic */ f50.i b() {
        return new j50.f(j50.z0.f63517a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ f1 g(f1 f1Var, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = f1Var.f71906a;
        }
        if ((i12 & 2) != 0) {
            list = f1Var.f71907b;
        }
        return f1Var.f(i11, list);
    }

    @w00.o
    public static final /* synthetic */ void l(f1 f1Var, i50.e eVar, h50.f fVar) {
        yz.c0<f50.i<Object>>[] c0VarArr = f71905c;
        eVar.encodeIntElement(fVar, 0, f1Var.f71906a);
        eVar.encodeSerializableElement(fVar, 1, c0VarArr[1].getValue(), f1Var.f71907b);
    }

    public final int d() {
        return this.f71906a;
    }

    @m80.k
    public final List<Integer> e() {
        return this.f71907b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return this.f71906a == f1Var.f71906a && kotlin.jvm.internal.g0.g(this.f71907b, f1Var.f71907b);
    }

    @m80.k
    public final f1 f(int i11, @m80.k List<Integer> buddySkill) {
        kotlin.jvm.internal.g0.p(buddySkill, "buddySkill");
        return new f1(i11, buddySkill);
    }

    @m80.k
    public final List<Integer> h() {
        return this.f71907b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f71906a) * 31) + this.f71907b.hashCode();
    }

    public final int j() {
        return this.f71906a;
    }

    @m80.k
    public String toString() {
        return "StudyBuddyInfoVo(studyBuddyType=" + this.f71906a + ", buddySkill=" + this.f71907b + ')';
    }

    public f1(int i11, @m80.k List<Integer> buddySkill) {
        kotlin.jvm.internal.g0.p(buddySkill, "buddySkill");
        this.f71906a = i11;
        this.f71907b = buddySkill;
    }

    @f50.z("buddySkill")
    public static /* synthetic */ void i() {
    }

    @f50.z("studyBuddyType")
    public static /* synthetic */ void k() {
    }
}
