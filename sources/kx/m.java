package kx;

import a00.h0;
import a00.r0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kx.m;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final a f69023e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final m f69024f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final m f69025g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final m f69026h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final lx.c<Pair<String, m>> f69027i;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f69028a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f69029b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f69030c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final List<String> f69031d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public static final boolean g(char c11, int i11) {
            return false;
        }

        public static final boolean i(char c11, int i11) {
            return false;
        }

        @m80.k
        public final m c() {
            return m.f69024f;
        }

        @m80.k
        public final m d() {
            return m.f69025g;
        }

        @m80.k
        public final m e() {
            return m.f69026h;
        }

        @m80.l
        public final m f(@m80.l CharSequence charSequence) {
            if (charSequence == null) {
                return null;
            }
            List c11 = lx.c.c(m.f69027i, charSequence, 0, 0, true, new x00.p() { // from class: kx.l
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    boolean g11;
                    g11 = m.a.g(((Character) obj).charValue(), ((Integer) obj2).intValue());
                    return Boolean.valueOf(g11);
                }
            }, 6, null);
            return c11.size() == 1 ? (m) ((Pair) c11.get(0)).getSecond() : h(charSequence);
        }

        public final m h(CharSequence charSequence) {
            int i11;
            int length = charSequence.length();
            m mVar = null;
            ArrayList arrayList = null;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                while (true) {
                    char charAt = charSequence.charAt(i12);
                    if (charAt != ' ' && charAt != ',') {
                        i13 = i12;
                        i11 = i13;
                        break;
                    }
                    i12++;
                    if (i12 >= length) {
                        i11 = i12;
                        break;
                    }
                }
                while (i11 < length) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 == ' ' || charAt2 == ',') {
                        break;
                    }
                    i11++;
                }
                Pair pair = (Pair) r0.p5(m.f69027i.b(charSequence, i13, i11, true, new x00.p() { // from class: kx.k
                    @Override // x00.p
                    public final Object invoke(Object obj, Object obj2) {
                        boolean i14;
                        i14 = m.a.i(((Character) obj).charValue(), ((Integer) obj2).intValue());
                        return Boolean.valueOf(i14);
                    }
                }));
                if (pair == null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(charSequence.subSequence(i13, i11).toString());
                } else if (mVar == null) {
                    mVar = (m) pair.getSecond();
                } else {
                    boolean z11 = true;
                    boolean z12 = mVar.h() || ((m) pair.getSecond()).h();
                    boolean z13 = mVar.j() || ((m) pair.getSecond()).j();
                    if (!mVar.k() && !((m) pair.getSecond()).k()) {
                        z11 = false;
                    }
                    i12 = i11;
                    mVar = new m(z12, z13, z11, h0.J());
                }
                i12 = i11;
            }
            if (mVar == null) {
                mVar = d();
            }
            return arrayList == null ? mVar : new m(mVar.h(), mVar.j(), mVar.k(), arrayList);
        }

        public a() {
        }
    }

    static {
        boolean z11 = false;
        m mVar = new m(true, z11, false, null, 14, null);
        f69024f = mVar;
        boolean z12 = false;
        m mVar2 = new m(z11, true, z12, null, 13, null);
        f69025g = mVar2;
        m mVar3 = new m(false, z12, true, null, 11, null);
        f69026h = mVar3;
        f69027i = lx.c.f71645b.d(h0.Q(h1.a("close", mVar), h1.a(c60.c.f8165l, mVar2), h1.a(c60.c.f8170q, mVar3)), new x00.l() { // from class: kx.i
            @Override // x00.l
            public final Object invoke(Object obj) {
                int l11;
                l11 = m.l((Pair) obj);
                return Integer.valueOf(l11);
            }
        }, new x00.p() { // from class: kx.j
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                char m11;
                m11 = m.m((Pair) obj, ((Integer) obj2).intValue());
                return Character.valueOf(m11);
            }
        });
    }

    public m() {
        this(false, false, false, null, 15, null);
    }

    public static final int l(Pair it) {
        g0.p(it, "it");
        return ((String) it.getFirst()).length();
    }

    public static final char m(Pair t11, int i11) {
        g0.p(t11, "t");
        return ((String) t11.getFirst()).charAt(i11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f69028a == mVar.f69028a && this.f69029b == mVar.f69029b && this.f69030c == mVar.f69030c && g0.g(this.f69031d, mVar.f69031d);
    }

    public final String g() {
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList(this.f69031d.size() + 3);
        if (this.f69028a) {
            arrayList.add("close");
        }
        if (this.f69029b) {
            arrayList.add(c60.c.f8165l);
        }
        if (this.f69030c) {
            arrayList.add("Upgrade");
        }
        if (!this.f69031d.isEmpty()) {
            arrayList.addAll(this.f69031d);
        }
        r0.p3(arrayList, sb2, null, null, null, 0, null, null, 126, null);
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    public final boolean h() {
        return this.f69028a;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f69028a) * 31) + Boolean.hashCode(this.f69029b)) * 31) + Boolean.hashCode(this.f69030c)) * 31) + this.f69031d.hashCode();
    }

    @m80.k
    public final List<String> i() {
        return this.f69031d;
    }

    public final boolean j() {
        return this.f69029b;
    }

    public final boolean k() {
        return this.f69030c;
    }

    @m80.k
    public String toString() {
        if (!this.f69031d.isEmpty()) {
            return g();
        }
        boolean z11 = this.f69028a;
        return (!z11 || this.f69029b || this.f69030c) ? (z11 || !this.f69029b || this.f69030c) ? (!z11 && this.f69029b && this.f69030c) ? "keep-alive, Upgrade" : g() : c60.c.f8165l : "close";
    }

    public m(boolean z11, boolean z12, boolean z13, @m80.k List<String> extraOptions) {
        g0.p(extraOptions, "extraOptions");
        this.f69028a = z11;
        this.f69029b = z12;
        this.f69030c = z13;
        this.f69031d = extraOptions;
    }

    public /* synthetic */ m(boolean z11, boolean z12, boolean z13, List list, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? false : z13, (i11 & 8) != 0 ? h0.J() : list);
    }
}
