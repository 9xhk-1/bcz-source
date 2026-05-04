package t90;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.helpers.MethodFilter;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.NormalizedString;
import org.junit.jupiter.params.shadow.com.univocity.parsers.fixed.FieldAlignment;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class b implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public List<Integer> f90357a;

    /* renamed from: b, reason: collision with root package name */
    public List<Boolean> f90358b;

    /* renamed from: c, reason: collision with root package name */
    public List<NormalizedString> f90359c;

    /* renamed from: d, reason: collision with root package name */
    public List<FieldAlignment> f90360d;

    /* renamed from: e, reason: collision with root package name */
    public List<Character> f90361e;

    /* renamed from: f, reason: collision with root package name */
    public List<Boolean> f90362f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f90363g;

    /* renamed from: h, reason: collision with root package name */
    public int f90364h;

    public b(LinkedHashMap<String, Integer> linkedHashMap) {
        this.f90357a = new ArrayList();
        this.f90358b = new ArrayList();
        this.f90359c = new ArrayList();
        this.f90360d = new ArrayList();
        this.f90361e = new ArrayList();
        this.f90362f = new ArrayList();
        this.f90363g = true;
        this.f90364h = 0;
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            throw new IllegalArgumentException("Map of fields and their lengths cannot be null/empty");
        }
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            i(entry.getKey(), entry.getValue().intValue());
        }
    }

    public static void X(b bVar, org.junit.jupiter.params.shadow.com.univocity.parsers.common.g gVar) {
        NormalizedString[] A;
        if (bVar == null || gVar.p() != null || (A = bVar.A()) == null || bVar.z().length != A.length) {
            return;
        }
        gVar.Q(NormalizedString.toArray(A));
    }

    public static b t(Class cls) {
        return new b(cls, MethodFilter.ONLY_SETTERS);
    }

    public static b u(Class cls) {
        return new b(cls, MethodFilter.ONLY_GETTERS);
    }

    public NormalizedString[] A() {
        if (this.f90363g) {
            return null;
        }
        return (NormalizedString[]) K(this.f90359c).toArray(org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.f78086b);
    }

    public char[] B() {
        return org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.E(this.f90361e);
    }

    public char[] E(c cVar) {
        char[] B = B();
        for (int i11 = 0; i11 < B.length; i11++) {
            if (B[i11] == 0) {
                B[i11] = cVar.s();
            }
        }
        return B;
    }

    public int F() {
        return this.f90357a.size();
    }

    public boolean[] G() {
        boolean[] zArr = new boolean[this.f90358b.size()];
        for (int i11 = 0; i11 < this.f90358b.size(); i11++) {
            zArr[i11] = this.f90358b.get(i11).booleanValue();
        }
        return zArr;
    }

    public Boolean[] J() {
        return (Boolean[]) this.f90362f.toArray(new Boolean[0]);
    }

    public final <T> List<T> K(List<T> list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (!this.f90358b.get(i11).booleanValue()) {
                arrayList.add(list.get(i11));
            }
        }
        return arrayList;
    }

    public int M(String str) {
        if (this.f90363g) {
            throw new IllegalArgumentException("No field names defined");
        }
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException("Field name cannot be null/empty");
        }
        NormalizedString valueOf = NormalizedString.valueOf(str);
        Iterator<NormalizedString> it = this.f90359c.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (it.next().equals(valueOf)) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public void N(int i11, int... iArr) {
        Y(true, i11, iArr);
    }

    public void O(String str, String... strArr) {
        Z(true, str, strArr);
    }

    public final void P(int i11, FieldAlignment fieldAlignment) {
        if (fieldAlignment == null) {
            throw new IllegalArgumentException("Alignment cannot be null");
        }
        h0(i11);
        this.f90360d.set(i11, fieldAlignment);
    }

    public void Q(FieldAlignment fieldAlignment, int... iArr) {
        for (int i11 : iArr) {
            P(i11, fieldAlignment);
        }
    }

    public void R(FieldAlignment fieldAlignment, String... strArr) {
        for (String str : strArr) {
            P(M(str), fieldAlignment);
        }
    }

    public void T(int i11, int i12) {
        h0(i11);
        j0("at index " + i11, i12);
        this.f90357a.set(i11, Integer.valueOf(i12));
    }

    public void W(String str, int i11) {
        if (str == null) {
            throw new IllegalArgumentException("Field name cannot be null");
        }
        int indexOf = this.f90359c.indexOf(str);
        if (indexOf != -1) {
            j0(str, i11);
            this.f90357a.set(indexOf, Integer.valueOf(i11));
        } else {
            throw new IllegalArgumentException("Cannot find field with name '" + str + '\'');
        }
    }

    public final void Y(boolean z11, int i11, int... iArr) {
        e0(i11, z11);
        for (int i12 : iArr) {
            e0(i12, z11);
        }
    }

    public final void Z(boolean z11, String str, String... strArr) {
        e0(M(str), z11);
        for (String str2 : strArr) {
            e0(M(str2), z11);
        }
    }

    public b a(int i11) {
        return q(null, i11, FieldAlignment.LEFT, (char) 0);
    }

    public void a0(char c11, int... iArr) {
        for (int i11 : iArr) {
            c0(i11, c11);
        }
    }

    public b b(int i11, char c11) {
        return q(null, i11, FieldAlignment.LEFT, c11);
    }

    public void b0(char c11, String... strArr) {
        for (String str : strArr) {
            c0(M(str), c11);
        }
    }

    public b c(int i11, int i12) {
        return o(null, i11, i12, FieldAlignment.LEFT, (char) 0);
    }

    public final void c0(int i11, char c11) {
        if (c11 == 0) {
            throw new IllegalArgumentException("Cannot use the null character as padding");
        }
        h0(i11);
        this.f90361e.set(i11, Character.valueOf(c11));
    }

    public b d(int i11, int i12, char c11) {
        return o(null, i11, i12, FieldAlignment.LEFT, c11);
    }

    public b e(int i11, int i12, FieldAlignment fieldAlignment) {
        return o(null, i11, i12, fieldAlignment, (char) 0);
    }

    public final void e0(int i11, boolean z11) {
        h0(i11);
        this.f90362f.set(i11, Boolean.valueOf(z11));
    }

    public b f(int i11, int i12, FieldAlignment fieldAlignment, char c11) {
        return o(null, i11, i12, fieldAlignment, c11);
    }

    public void f0(int i11, int... iArr) {
        Y(false, i11, iArr);
    }

    public b g(int i11, FieldAlignment fieldAlignment) {
        return q(null, i11, fieldAlignment, (char) 0);
    }

    public void g0(String str, String... strArr) {
        Z(false, str, strArr);
    }

    public b h(int i11, FieldAlignment fieldAlignment, char c11) {
        return q(null, i11, fieldAlignment, c11);
    }

    public final void h0(int i11) {
        if (i11 >= 0 || i11 < this.f90357a.size()) {
            return;
        }
        throw new IllegalArgumentException("No field defined at index " + i11);
    }

    public b i(String str, int i11) {
        return q(str, i11, FieldAlignment.LEFT, (char) 0);
    }

    public b j(String str, int i11, char c11) {
        return q(str, i11, FieldAlignment.LEFT, c11);
    }

    public final void j0(String str, int i11) {
        if (i11 < 1) {
            if (str == null) {
                throw new IllegalArgumentException("Invalid field length: " + i11 + " for field at index " + this.f90357a.size());
            }
            throw new IllegalArgumentException("Invalid field length: " + i11 + " for field " + str);
        }
    }

    public b l(String str, int i11, int i12) {
        return o(str, i11, i12, FieldAlignment.LEFT, (char) 0);
    }

    public b m(String str, int i11, int i12, char c11) {
        return o(str, i11, i12, FieldAlignment.LEFT, c11);
    }

    public b n(String str, int i11, int i12, FieldAlignment fieldAlignment) {
        return o(str, i11, i12, fieldAlignment, (char) 0);
    }

    public b o(String str, int i11, int i12, FieldAlignment fieldAlignment, char c11) {
        int i13 = i12 - i11;
        int i14 = this.f90364h;
        if (i11 >= i14) {
            if (i11 > i14) {
                q(null, i11 - i14, FieldAlignment.LEFT, (char) 0);
                this.f90358b.set(r5.size() - 1, Boolean.TRUE);
            }
            return q(str, i13, fieldAlignment, c11);
        }
        throw new IllegalArgumentException("Start position '" + i11 + "' overlaps with one or more fields");
    }

    public b p(String str, int i11, FieldAlignment fieldAlignment) {
        return q(str, i11, fieldAlignment, (char) 0);
    }

    public b q(String str, int i11, FieldAlignment fieldAlignment, char c11) {
        j0(str, i11);
        this.f90357a.add(Integer.valueOf(i11));
        this.f90358b.add(Boolean.FALSE);
        this.f90359c.add(NormalizedString.valueOf(str));
        this.f90361e.add(Character.valueOf(c11));
        this.f90362f.add(null);
        if (str != null) {
            this.f90363g = false;
        }
        this.f90360d.add(fieldAlignment);
        this.f90364h += i11;
        return this;
    }

    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public b clone() {
        try {
            b bVar = (b) super.clone();
            bVar.f90357a = new ArrayList(this.f90357a);
            bVar.f90359c = new ArrayList(this.f90359c);
            bVar.f90360d = new ArrayList(this.f90360d);
            bVar.f90361e = new ArrayList(this.f90361e);
            bVar.f90362f = new ArrayList(this.f90362f);
            return bVar;
        } catch (CloneNotSupportedException e11) {
            throw new IllegalStateException(e11);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        for (Integer num : this.f90357a) {
            sb2.append("\n\t\t");
            int i12 = i11 + 1;
            sb2.append(i12);
            sb2.append('\t');
            if (i11 < this.f90359c.size()) {
                sb2.append((CharSequence) this.f90359c.get(i11));
            }
            sb2.append(", length: ");
            sb2.append(num);
            sb2.append(", align: ");
            sb2.append(this.f90360d.get(i11));
            sb2.append(", padding: ");
            sb2.append(this.f90361e.get(i11));
            sb2.append(", keepPadding: ");
            sb2.append(this.f90362f.get(i11));
            i11 = i12;
        }
        return sb2.toString();
    }

    public FieldAlignment v(int i11) {
        h0(i11);
        return this.f90360d.get(i11);
    }

    public FieldAlignment w(String str) {
        int M = M(str);
        if (M != -1) {
            return v(M);
        }
        throw new IllegalArgumentException("Field '" + str + "' does not exist. Available field names are: " + this.f90359c);
    }

    public int[] x() {
        return org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.F(this.f90357a);
    }

    public FieldAlignment[] y() {
        List<FieldAlignment> list = this.f90360d;
        return (FieldAlignment[]) list.toArray(new FieldAlignment[list.size()]);
    }

    public int[] z() {
        return org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.F(K(this.f90357a));
    }

    public b(String[] strArr, int[] iArr) {
        this.f90357a = new ArrayList();
        this.f90358b = new ArrayList();
        this.f90359c = new ArrayList();
        this.f90360d = new ArrayList();
        this.f90361e = new ArrayList();
        this.f90362f = new ArrayList();
        this.f90363g = true;
        this.f90364h = 0;
        if (strArr != null && strArr.length != 0) {
            if (iArr != null && iArr.length != 0) {
                if (strArr.length == iArr.length) {
                    for (int i11 = 0; i11 < strArr.length; i11++) {
                        i(strArr[i11], iArr[i11]);
                    }
                    return;
                }
                throw new IllegalArgumentException("Sequence of headers and their respective lengths must match. Got " + strArr.length + " headers but " + iArr.length + " lengths");
            }
            throw new IllegalArgumentException("Field lengths cannot be null/empty");
        }
        throw new IllegalArgumentException("Headers cannot be null/empty");
    }

    public b(int... iArr) {
        this.f90357a = new ArrayList();
        this.f90358b = new ArrayList();
        this.f90359c = new ArrayList();
        this.f90360d = new ArrayList();
        this.f90361e = new ArrayList();
        this.f90362f = new ArrayList();
        this.f90363g = true;
        this.f90364h = 0;
        for (int i11 : iArr) {
            a(i11);
        }
    }

    @Deprecated
    public b(Class cls) {
        this(cls, MethodFilter.ONLY_SETTERS);
    }

    public b(Class cls, MethodFilter methodFilter) {
        this.f90357a = new ArrayList();
        this.f90358b = new ArrayList();
        this.f90359c = new ArrayList();
        this.f90360d = new ArrayList();
        this.f90361e = new ArrayList();
        this.f90362f = new ArrayList();
        boolean z11 = true;
        this.f90363g = true;
        this.f90364h = 0;
        if (cls != null) {
            List<h90.e> F = h90.a.F(cls, true, null, methodFilter);
            if (!F.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (h90.e eVar : F) {
                    if (eVar != null) {
                        String c11 = eVar.c();
                        g90.e eVar2 = (g90.e) h90.a.p(eVar.d(), g90.e.class);
                        if (eVar2 == null) {
                            linkedHashSet.add(eVar.e());
                        } else {
                            int intValue = ((Integer) h90.b.b(eVar.d(), eVar2, "value", Integer.valueOf(eVar2.value()))).intValue();
                            int intValue2 = ((Integer) h90.b.b(eVar.d(), eVar2, "from", Integer.valueOf(eVar2.from()))).intValue();
                            int intValue3 = ((Integer) h90.b.b(eVar.d(), eVar2, "to", Integer.valueOf(eVar2.to()))).intValue();
                            boolean z12 = z11;
                            FieldAlignment fieldAlignment = (FieldAlignment) h90.b.b(eVar.d(), eVar2, "alignment", eVar2.alignment());
                            char charValue = ((Character) h90.b.b(eVar.d(), eVar2, "padding", Character.valueOf(eVar2.padding()))).charValue();
                            if (intValue != -1) {
                                if (intValue2 != -1 || intValue3 != -1) {
                                    throw new IllegalArgumentException("Can't initialize fixed-width field from " + eVar.a() + ". Can't have field length (" + intValue + ") defined along with position from (" + intValue2 + ") and to (" + intValue3 + j.f81007d);
                                }
                                q(c11, intValue, fieldAlignment, charValue);
                            } else {
                                if (intValue2 == -1 || intValue3 == -1) {
                                    throw new IllegalArgumentException("Can't initialize fixed-width field from " + eVar.a() + "'. Field length/position undefined defined");
                                }
                                o(c11, intValue2, intValue3, fieldAlignment, charValue);
                            }
                            Y(((Boolean) h90.b.b(eVar.d(), eVar2, "keepPadding", Boolean.valueOf(eVar2.keepPadding()))).booleanValue(), this.f90357a.size() - 1, new int[0]);
                            z11 = z12;
                        }
                    }
                }
                if (linkedHashSet.size() <= 0) {
                    return;
                }
                throw new IllegalArgumentException("Can't derive fixed-width fields from class '" + cls.getName() + "'. The following fields don't have a @FixedWidth annotation: " + linkedHashSet);
            }
            throw new IllegalArgumentException("Can't derive fixed-width fields from class '" + cls.getName() + "'. No @Parsed annotations found.");
        }
        throw new IllegalArgumentException("Class must not be null.");
    }
}
