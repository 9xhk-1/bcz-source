package m60;

import a00.i0;
import a00.m0;
import a00.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import okio.ByteString;
import okio.f;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "-Path")
@u0({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nokio/internal/-Path\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,405:1\n53#1,22:406\n203#1:432\n203#1:433\n1563#2:428\n1634#2,3:429\n*S KotlinDebug\n*F\n+ 1 Path.kt\nokio/internal/-Path\n*L\n47#1:406,22\n193#1:432\n198#1:433\n47#1:428\n47#1:429,3\n*E\n"})
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final ByteString f72434a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final ByteString f72435b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final ByteString f72436c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final ByteString f72437d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final ByteString f72438e;

    static {
        ByteString.a aVar = ByteString.Companion;
        f72434a = aVar.l("/");
        f72435b = aVar.l("\\");
        f72436c = aVar.l("/\\");
        f72437d = aVar.l(".");
        f72438e = aVar.l(zr.m.f102856e);
    }

    @m80.k
    public static final List<ByteString> A(@m80.k okio.f fVar) {
        g0.p(fVar, "<this>");
        ArrayList arrayList = new ArrayList();
        int H = H(fVar);
        if (H == -1) {
            H = 0;
        } else if (H < fVar.i().size() && fVar.i().getByte(H) == 92) {
            H++;
        }
        int size = fVar.i().size();
        int i11 = H;
        while (H < size) {
            if (fVar.i().getByte(H) == 47 || fVar.i().getByte(H) == 92) {
                arrayList.add(fVar.i().substring(i11, H));
                i11 = H + 1;
            }
            H++;
        }
        if (i11 < fVar.i().size()) {
            arrayList.add(fVar.i().substring(i11, fVar.i().size()));
        }
        return arrayList;
    }

    @m80.k
    public static final okio.f B(@m80.k String str, boolean z11) {
        g0.p(str, "<this>");
        return J(new l60.k().n5(str), z11);
    }

    @m80.k
    public static final String C(@m80.k okio.f fVar) {
        g0.p(fVar, "<this>");
        return fVar.i().utf8();
    }

    @m80.l
    public static final Character D(@m80.k okio.f fVar) {
        g0.p(fVar, "<this>");
        if (ByteString.indexOf$default(fVar.i(), f72434a, 0, 2, (Object) null) != -1 || fVar.i().size() < 2 || fVar.i().getByte(1) != 58) {
            return null;
        }
        char c11 = (char) fVar.i().getByte(0);
        if (('a' > c11 || c11 >= '{') && ('A' > c11 || c11 >= '[')) {
            return null;
        }
        return Character.valueOf(c11);
    }

    public static final int E(okio.f fVar) {
        int lastIndexOf$default = ByteString.lastIndexOf$default(fVar.i(), f72434a, 0, 2, (Object) null);
        return lastIndexOf$default != -1 ? lastIndexOf$default : ByteString.lastIndexOf$default(fVar.i(), f72435b, 0, 2, (Object) null);
    }

    public static final ByteString F(okio.f fVar) {
        ByteString i11 = fVar.i();
        ByteString byteString = f72434a;
        if (ByteString.indexOf$default(i11, byteString, 0, 2, (Object) null) != -1) {
            return byteString;
        }
        ByteString i12 = fVar.i();
        ByteString byteString2 = f72435b;
        if (ByteString.indexOf$default(i12, byteString2, 0, 2, (Object) null) != -1) {
            return byteString2;
        }
        return null;
    }

    public static final boolean G(okio.f fVar) {
        return fVar.i().endsWith(f72438e) && (fVar.i().size() == 2 || fVar.i().rangeEquals(fVar.i().size() + (-3), f72434a, 0, 1) || fVar.i().rangeEquals(fVar.i().size() + (-3), f72435b, 0, 1));
    }

    public static final int H(okio.f fVar) {
        if (fVar.i().size() == 0) {
            return -1;
        }
        if (fVar.i().getByte(0) == 47) {
            return 1;
        }
        if (fVar.i().getByte(0) == 92) {
            if (fVar.i().size() <= 2 || fVar.i().getByte(1) != 92) {
                return 1;
            }
            int indexOf = fVar.i().indexOf(f72435b, 2);
            return indexOf == -1 ? fVar.i().size() : indexOf;
        }
        if (fVar.i().size() > 2 && fVar.i().getByte(1) == 58 && fVar.i().getByte(2) == 92) {
            char c11 = (char) fVar.i().getByte(0);
            if ('a' <= c11 && c11 < '{') {
                return 3;
            }
            if ('A' <= c11 && c11 < '[') {
                return 3;
            }
        }
        return -1;
    }

    public static final boolean I(l60.k kVar, ByteString byteString) {
        if (!g0.g(byteString, f72435b) || kVar.size() < 2 || kVar.x0(1L) != 58) {
            return false;
        }
        char x02 = (char) kVar.x0(0L);
        if ('a' > x02 || x02 >= '{') {
            return 'A' <= x02 && x02 < '[';
        }
        return true;
    }

    @m80.k
    public static final okio.f J(@m80.k l60.k kVar, boolean z11) {
        ByteString byteString;
        ByteString h22;
        g0.p(kVar, "<this>");
        l60.k kVar2 = new l60.k();
        ByteString byteString2 = null;
        int i11 = 0;
        while (true) {
            if (!kVar.J0(0L, f72434a)) {
                byteString = f72435b;
                if (!kVar.J0(0L, byteString)) {
                    break;
                }
            }
            byte readByte = kVar.readByte();
            if (byteString2 == null) {
                byteString2 = K(readByte);
            }
            i11++;
        }
        boolean z12 = i11 >= 2 && g0.g(byteString2, byteString);
        if (z12) {
            g0.m(byteString2);
            kVar2.X3(byteString2);
            kVar2.X3(byteString2);
        } else if (i11 > 0) {
            g0.m(byteString2);
            kVar2.X3(byteString2);
        } else {
            long p02 = kVar.p0(f72436c);
            if (byteString2 == null) {
                byteString2 = p02 == -1 ? L(okio.f.f77540c) : K(kVar.x0(p02));
            }
            if (I(kVar, byteString2)) {
                if (p02 == 2) {
                    kVar2.y8(kVar, 3L);
                } else {
                    kVar2.y8(kVar, 2L);
                }
            }
            g2 g2Var = g2.f100423a;
        }
        boolean z13 = kVar2.size() > 0;
        ArrayList arrayList = new ArrayList();
        while (!kVar.J()) {
            long p03 = kVar.p0(f72436c);
            if (p03 == -1) {
                h22 = kVar.q3();
            } else {
                h22 = kVar.h2(p03);
                kVar.readByte();
            }
            ByteString byteString3 = f72438e;
            if (g0.g(h22, byteString3)) {
                if (!z13 || !arrayList.isEmpty()) {
                    if (!z11 || (!z13 && (arrayList.isEmpty() || g0.g(r0.u3(arrayList), byteString3)))) {
                        arrayList.add(h22);
                    } else if (!z12 || arrayList.size() != 1) {
                        m0.R0(arrayList);
                    }
                }
            } else if (!g0.g(h22, f72437d) && !g0.g(h22, ByteString.EMPTY)) {
                arrayList.add(h22);
            }
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (i12 > 0) {
                kVar2.X3(byteString2);
            }
            kVar2.X3((ByteString) arrayList.get(i12));
        }
        if (kVar2.size() == 0) {
            kVar2.X3(f72437d);
        }
        return new okio.f(kVar2.q3());
    }

    public static final ByteString K(byte b11) {
        if (b11 == 47) {
            return f72434a;
        }
        if (b11 == 92) {
            return f72435b;
        }
        throw new IllegalArgumentException("not a directory separator: " + ((int) b11));
    }

    public static final ByteString L(String str) {
        if (g0.g(str, "/")) {
            return f72434a;
        }
        if (g0.g(str, "\\")) {
            return f72435b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }

    public static final int j(@m80.k okio.f fVar, @m80.k okio.f other) {
        g0.p(fVar, "<this>");
        g0.p(other, "other");
        return fVar.i().compareTo(other.i());
    }

    public static final boolean k(@m80.k okio.f fVar, @m80.l Object obj) {
        g0.p(fVar, "<this>");
        return (obj instanceof okio.f) && g0.g(((okio.f) obj).i(), fVar.i());
    }

    public static final int l(@m80.k okio.f fVar) {
        g0.p(fVar, "<this>");
        return fVar.i().hashCode();
    }

    public static final boolean m(@m80.k okio.f fVar) {
        g0.p(fVar, "<this>");
        return H(fVar) != -1;
    }

    public static final boolean n(@m80.k okio.f fVar) {
        g0.p(fVar, "<this>");
        return H(fVar) == -1;
    }

    public static final boolean o(@m80.k okio.f fVar) {
        g0.p(fVar, "<this>");
        return H(fVar) == fVar.i().size();
    }

    @m80.k
    public static final String p(@m80.k okio.f fVar) {
        g0.p(fVar, "<this>");
        return fVar.r().utf8();
    }

    @m80.k
    public static final ByteString q(@m80.k okio.f fVar) {
        g0.p(fVar, "<this>");
        int E = E(fVar);
        return E != -1 ? ByteString.substring$default(fVar.i(), E + 1, 0, 2, null) : (fVar.F() == null || fVar.i().size() != 2) ? fVar.i() : ByteString.EMPTY;
    }

    @m80.k
    public static final okio.f r(@m80.k okio.f fVar) {
        g0.p(fVar, "<this>");
        return okio.f.f77539b.d(fVar.toString(), true);
    }

    @m80.l
    public static final okio.f s(@m80.k okio.f fVar) {
        g0.p(fVar, "<this>");
        if (g0.g(fVar.i(), f72437d) || g0.g(fVar.i(), f72434a) || g0.g(fVar.i(), f72435b) || G(fVar)) {
            return null;
        }
        int E = E(fVar);
        if (E == 2 && fVar.F() != null) {
            if (fVar.i().size() == 3) {
                return null;
            }
            return new okio.f(ByteString.substring$default(fVar.i(), 0, 3, 1, null));
        }
        if (E == 1 && fVar.i().startsWith(f72435b)) {
            return null;
        }
        if (E != -1 || fVar.F() == null) {
            return E == -1 ? new okio.f(f72437d) : E == 0 ? new okio.f(ByteString.substring$default(fVar.i(), 0, 1, 1, null)) : new okio.f(ByteString.substring$default(fVar.i(), 0, E, 1, null));
        }
        if (fVar.i().size() == 2) {
            return null;
        }
        return new okio.f(ByteString.substring$default(fVar.i(), 0, 2, 1, null));
    }

    @m80.k
    public static final okio.f t(@m80.k okio.f fVar, @m80.k okio.f other) {
        g0.p(fVar, "<this>");
        g0.p(other, "other");
        if (!g0.g(fVar.k(), other.k())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + fVar + " and " + other).toString());
        }
        List<ByteString> m11 = fVar.m();
        List<ByteString> m12 = other.m();
        int min = Math.min(m11.size(), m12.size());
        int i11 = 0;
        while (i11 < min && g0.g(m11.get(i11), m12.get(i11))) {
            i11++;
        }
        if (i11 == min && fVar.i().size() == other.i().size()) {
            return f.a.h(okio.f.f77539b, ".", false, 1, null);
        }
        if (m12.subList(i11, m12.size()).indexOf(f72438e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + fVar + " and " + other).toString());
        }
        if (g0.g(other.i(), f72437d)) {
            return fVar;
        }
        l60.k kVar = new l60.k();
        ByteString F = F(other);
        if (F == null && (F = F(fVar)) == null) {
            F = L(okio.f.f77540c);
        }
        int size = m12.size();
        for (int i12 = i11; i12 < size; i12++) {
            kVar.X3(f72438e);
            kVar.X3(F);
        }
        int size2 = m11.size();
        while (i11 < size2) {
            kVar.X3(m11.get(i11));
            kVar.X3(F);
            i11++;
        }
        return J(kVar, false);
    }

    @m80.k
    public static final okio.f u(@m80.k okio.f fVar, @m80.k String child, boolean z11) {
        g0.p(fVar, "<this>");
        g0.p(child, "child");
        return x(fVar, J(new l60.k().n5(child), false), z11);
    }

    @m80.k
    public static final okio.f v(@m80.k okio.f fVar, @m80.k l60.k child, boolean z11) {
        g0.p(fVar, "<this>");
        g0.p(child, "child");
        return x(fVar, J(child, false), z11);
    }

    @m80.k
    public static final okio.f w(@m80.k okio.f fVar, @m80.k ByteString child, boolean z11) {
        g0.p(fVar, "<this>");
        g0.p(child, "child");
        return x(fVar, J(new l60.k().X3(child), false), z11);
    }

    @m80.k
    public static final okio.f x(@m80.k okio.f fVar, @m80.k okio.f child, boolean z11) {
        g0.p(fVar, "<this>");
        g0.p(child, "child");
        if (child.isAbsolute() || child.F() != null) {
            return child;
        }
        ByteString F = F(fVar);
        if (F == null && (F = F(child)) == null) {
            F = L(okio.f.f77540c);
        }
        l60.k kVar = new l60.k();
        kVar.X3(fVar.i());
        if (kVar.size() > 0) {
            kVar.X3(F);
        }
        kVar.X3(child.i());
        return J(kVar, z11);
    }

    @m80.l
    public static final okio.f y(@m80.k okio.f fVar) {
        g0.p(fVar, "<this>");
        int H = H(fVar);
        if (H == -1) {
            return null;
        }
        return new okio.f(fVar.i().substring(0, H));
    }

    @m80.k
    public static final List<String> z(@m80.k okio.f fVar) {
        g0.p(fVar, "<this>");
        ArrayList arrayList = new ArrayList();
        int H = H(fVar);
        if (H == -1) {
            H = 0;
        } else if (H < fVar.i().size() && fVar.i().getByte(H) == 92) {
            H++;
        }
        int size = fVar.i().size();
        int i11 = H;
        while (H < size) {
            if (fVar.i().getByte(H) == 47 || fVar.i().getByte(H) == 92) {
                arrayList.add(fVar.i().substring(i11, H));
                i11 = H + 1;
            }
            H++;
        }
        if (i11 < fVar.i().size()) {
            arrayList.add(fVar.i().substring(i11, fVar.i().size()));
        }
        ArrayList arrayList2 = new ArrayList(i0.d0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ByteString) it.next()).utf8());
        }
        return arrayList2;
    }
}
