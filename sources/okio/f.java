package okio;

import a00.i0;
import com.badlogic.gdx.scenes.scene2d.ui.q;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.j;
import w00.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nokio/Path\n+ 2 Path.kt\nokio/internal/-Path\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,132:1\n39#2,3:133\n47#2,28:136\n53#2,22:168\n106#2:190\n111#2:191\n116#2,6:192\n133#2,5:198\n143#2:203\n148#2,25:204\n188#2:229\n193#2,11:230\n198#2,6:241\n193#2,11:247\n198#2,6:258\n222#2,41:264\n267#2:305\n281#2:306\n286#2:307\n291#2:308\n296#2:309\n1563#3:164\n1634#3,3:165\n*S KotlinDebug\n*F\n+ 1 Path.kt\nokio/Path\n*L\n44#1:133,3\n47#1:136,28\n50#1:168,22\n53#1:190\n56#1:191\n60#1:192,6\n64#1:198,5\n68#1:203\n72#1:204,25\n75#1:229\n78#1:230,11\n81#1:241,6\n87#1:247,11\n90#1:258,6\n95#1:264,41\n97#1:305\n104#1:306\n106#1:307\n108#1:308\n110#1:309\n47#1:164\n47#1:165,3\n*E\n"})
/* loaded from: classes8.dex */
public final class f implements Comparable<f> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f77539b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @k
    public static final String f77540c;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ByteString f77541a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public static /* synthetic */ f g(a aVar, File file, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            return aVar.b(file, z11);
        }

        public static /* synthetic */ f h(a aVar, String str, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            return aVar.d(str, z11);
        }

        public static /* synthetic */ f i(a aVar, Path path, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = false;
            }
            return aVar.f(path, z11);
        }

        @j(name = ct.d.f46852f)
        @w00.k
        @k
        @o
        public final f a(@k File file) {
            g0.p(file, "<this>");
            return g(this, file, false, 1, null);
        }

        @j(name = ct.d.f46852f)
        @w00.k
        @k
        @o
        public final f b(@k File file, boolean z11) {
            g0.p(file, "<this>");
            String file2 = file.toString();
            g0.o(file2, "toString(...)");
            return d(file2, z11);
        }

        @j(name = ct.d.f46852f)
        @w00.k
        @k
        @o
        public final f c(@k String str) {
            g0.p(str, "<this>");
            return h(this, str, false, 1, null);
        }

        @j(name = ct.d.f46852f)
        @w00.k
        @k
        @o
        public final f d(@k String str, boolean z11) {
            g0.p(str, "<this>");
            return m60.f.B(str, z11);
        }

        @j(name = ct.d.f46852f)
        @w00.k
        @k
        @o
        public final f e(@k Path path) {
            g0.p(path, "<this>");
            return i(this, path, false, 1, null);
        }

        @j(name = ct.d.f46852f)
        @w00.k
        @k
        @o
        public final f f(@k Path path, boolean z11) {
            g0.p(path, "<this>");
            return d(path.toString(), z11);
        }

        public a() {
        }
    }

    static {
        String separator = File.separator;
        g0.o(separator, "separator");
        f77540c = separator;
    }

    public f(@k ByteString bytes) {
        g0.p(bytes, "bytes");
        this.f77541a = bytes;
    }

    public static /* synthetic */ f B(f fVar, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return fVar.w(str, z11);
    }

    public static /* synthetic */ f C(f fVar, ByteString byteString, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return fVar.y(byteString, z11);
    }

    public static /* synthetic */ f D(f fVar, f fVar2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return fVar.A(fVar2, z11);
    }

    @j(name = ct.d.f46852f)
    @w00.k
    @k
    @o
    public static final f b(@k File file) {
        return f77539b.a(file);
    }

    @j(name = ct.d.f46852f)
    @w00.k
    @k
    @o
    public static final f c(@k File file, boolean z11) {
        return f77539b.b(file, z11);
    }

    @j(name = ct.d.f46852f)
    @w00.k
    @k
    @o
    public static final f d(@k String str) {
        return f77539b.c(str);
    }

    @j(name = ct.d.f46852f)
    @w00.k
    @k
    @o
    public static final f e(@k String str, boolean z11) {
        return f77539b.d(str, z11);
    }

    @j(name = ct.d.f46852f)
    @w00.k
    @k
    @o
    public static final f f(@k Path path) {
        return f77539b.e(path);
    }

    @j(name = ct.d.f46852f)
    @w00.k
    @k
    @o
    public static final f g(@k Path path, boolean z11) {
        return f77539b.f(path, z11);
    }

    @k
    public final f A(@k f child, boolean z11) {
        g0.p(child, "child");
        return m60.f.x(this, child, z11);
    }

    @k
    public final Path E() {
        Path path;
        path = Paths.get(toString(), new String[0]);
        g0.o(path, "get(...)");
        return path;
    }

    @l
    @j(name = "volumeLetter")
    public final Character F() {
        if (ByteString.indexOf$default(i(), m60.f.f72434a, 0, 2, (Object) null) != -1 || i().size() < 2 || i().getByte(1) != 58) {
            return null;
        }
        char c11 = (char) i().getByte(0);
        if (('a' > c11 || c11 >= '{') && ('A' > c11 || c11 >= '[')) {
            return null;
        }
        return Character.valueOf(c11);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@k f other) {
        g0.p(other, "other");
        return i().compareTo(other.i());
    }

    public boolean equals(@l Object obj) {
        return (obj instanceof f) && g0.g(((f) obj).i(), i());
    }

    public int hashCode() {
        return i().hashCode();
    }

    @k
    public final ByteString i() {
        return this.f77541a;
    }

    public final boolean isAbsolute() {
        return m60.f.H(this) != -1;
    }

    @l
    public final f k() {
        int H = m60.f.H(this);
        if (H == -1) {
            return null;
        }
        return new f(i().substring(0, H));
    }

    @k
    public final List<String> l() {
        ArrayList arrayList = new ArrayList();
        int H = m60.f.H(this);
        if (H == -1) {
            H = 0;
        } else if (H < i().size() && i().getByte(H) == 92) {
            H++;
        }
        int size = i().size();
        int i11 = H;
        while (H < size) {
            if (i().getByte(H) == 47 || i().getByte(H) == 92) {
                arrayList.add(i().substring(i11, H));
                i11 = H + 1;
            }
            H++;
        }
        if (i11 < i().size()) {
            arrayList.add(i().substring(i11, i().size()));
        }
        ArrayList arrayList2 = new ArrayList(i0.d0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ByteString) it.next()).utf8());
        }
        return arrayList2;
    }

    @k
    public final List<ByteString> m() {
        ArrayList arrayList = new ArrayList();
        int H = m60.f.H(this);
        if (H == -1) {
            H = 0;
        } else if (H < i().size() && i().getByte(H) == 92) {
            H++;
        }
        int size = i().size();
        int i11 = H;
        while (H < size) {
            if (i().getByte(H) == 47 || i().getByte(H) == 92) {
                arrayList.add(i().substring(i11, H));
                i11 = H + 1;
            }
            H++;
        }
        if (i11 < i().size()) {
            arrayList.add(i().substring(i11, i().size()));
        }
        return arrayList;
    }

    public final boolean o() {
        return m60.f.H(this) == -1;
    }

    public final boolean p() {
        return m60.f.H(this) == i().size();
    }

    @j(name = "name")
    @k
    public final String q() {
        return r().utf8();
    }

    @j(name = "nameBytes")
    @k
    public final ByteString r() {
        int E = m60.f.E(this);
        return E != -1 ? ByteString.substring$default(i(), E + 1, 0, 2, null) : (F() == null || i().size() != 2) ? i() : ByteString.EMPTY;
    }

    @k
    public final f s() {
        return f77539b.d(toString(), true);
    }

    @l
    @j(name = q.a.f13044u)
    public final f t() {
        if (g0.g(i(), m60.f.f72437d) || g0.g(i(), m60.f.f72434a) || g0.g(i(), m60.f.f72435b) || m60.f.G(this)) {
            return null;
        }
        int E = m60.f.E(this);
        if (E == 2 && F() != null) {
            if (i().size() == 3) {
                return null;
            }
            return new f(ByteString.substring$default(i(), 0, 3, 1, null));
        }
        if (E == 1 && i().startsWith(m60.f.f72435b)) {
            return null;
        }
        if (E != -1 || F() == null) {
            return E == -1 ? new f(m60.f.f72437d) : E == 0 ? new f(ByteString.substring$default(i(), 0, 1, 1, null)) : new f(ByteString.substring$default(i(), 0, E, 1, null));
        }
        if (i().size() == 2) {
            return null;
        }
        return new f(ByteString.substring$default(i(), 0, 2, 1, null));
    }

    @k
    public final File toFile() {
        return new File(toString());
    }

    @k
    public String toString() {
        return i().utf8();
    }

    @k
    public final f u(@k f other) {
        g0.p(other, "other");
        if (!g0.g(k(), other.k())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        List<ByteString> m11 = m();
        List<ByteString> m12 = other.m();
        int min = Math.min(m11.size(), m12.size());
        int i11 = 0;
        while (i11 < min && g0.g(m11.get(i11), m12.get(i11))) {
            i11++;
        }
        if (i11 == min && i().size() == other.i().size()) {
            return a.h(f77539b, ".", false, 1, null);
        }
        if (m12.subList(i11, m12.size()).indexOf(m60.f.f72438e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        if (g0.g(other.i(), m60.f.f72437d)) {
            return this;
        }
        l60.k kVar = new l60.k();
        ByteString F = m60.f.F(other);
        if (F == null && (F = m60.f.F(this)) == null) {
            F = m60.f.L(f77540c);
        }
        int size = m12.size();
        for (int i12 = i11; i12 < size; i12++) {
            kVar.X3(m60.f.f72438e);
            kVar.X3(F);
        }
        int size2 = m11.size();
        while (i11 < size2) {
            kVar.X3(m11.get(i11));
            kVar.X3(F);
            i11++;
        }
        return m60.f.J(kVar, false);
    }

    @j(name = "resolve")
    @k
    public final f v(@k String child) {
        g0.p(child, "child");
        return m60.f.x(this, m60.f.J(new l60.k().n5(child), false), false);
    }

    @k
    public final f w(@k String child, boolean z11) {
        g0.p(child, "child");
        return m60.f.x(this, m60.f.J(new l60.k().n5(child), false), z11);
    }

    @j(name = "resolve")
    @k
    public final f x(@k ByteString child) {
        g0.p(child, "child");
        return m60.f.x(this, m60.f.J(new l60.k().X3(child), false), false);
    }

    @k
    public final f y(@k ByteString child, boolean z11) {
        g0.p(child, "child");
        return m60.f.x(this, m60.f.J(new l60.k().X3(child), false), z11);
    }

    @j(name = "resolve")
    @k
    public final f z(@k f child) {
        g0.p(child, "child");
        return m60.f.x(this, child, false);
    }
}
