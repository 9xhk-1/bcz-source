package dp;

import fx.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import n6.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f48055a = "(function(";

    /* renamed from: b, reason: collision with root package name */
    public static final String f48056b = "){return";

    /* renamed from: c, reason: collision with root package name */
    public static final String f48057c = "}(";

    /* renamed from: d, reason: collision with root package name */
    public static final String f48058d = "))";

    /* renamed from: e, reason: collision with root package name */
    public static final int f48059e = 22;

    /* renamed from: f, reason: collision with root package name */
    public static final int f48060f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f48061g = 32;

    /* renamed from: h, reason: collision with root package name */
    public static final String[][] f48062h = {new String[0], new String[0], new String[]{"do", "if", "in"}, new String[]{"for", "let", "new", "try", "var"}, new String[]{"case", "else", "enum", "eval", "null", "this", m.f74525c, "void", "with"}, new String[]{"catch", "class", "const", "false", "super", "throw", "while", "yield"}, new String[]{"delete", "export", "import", "return", "switch", "static", "typeof"}, new String[]{"default", "extends", d.f52403j, "private"}, new String[]{"continue", "function"}, new String[]{"arguments"}, new String[]{"implements", "instanceof"}};

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ boolean f48063i = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: dp.a$a, reason: collision with other inner class name */
    public static final class C0572a {

        /* renamed from: a, reason: collision with root package name */
        public final StringBuilder f48064a = new StringBuilder("a");

        public String a() {
            String sb2;
            int length;
            do {
                sb2 = this.f48064a.toString();
                int length2 = this.f48064a.length();
                while (true) {
                    length2--;
                    if (length2 < 0) {
                        break;
                    }
                    int f11 = a.f(this.f48064a.charAt(length2), length2 != 0);
                    if (f11 >= 0) {
                        this.f48064a.setCharAt(length2, (char) f11);
                        break;
                    }
                    this.f48064a.setCharAt(length2, 'a');
                    if (length2 == 0) {
                        this.f48064a.append('a');
                    }
                }
                length = sb2.length();
                if (length >= a.f48062h.length) {
                    break;
                }
            } while (Arrays.binarySearch(a.f48062h[length], sb2) >= 0);
            return sb2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        public final int f48065a;

        /* renamed from: b, reason: collision with root package name */
        public final int f48066b;

        /* renamed from: c, reason: collision with root package name */
        public final int f48067c;

        /* renamed from: d, reason: collision with root package name */
        @Nonnull
        public final CharSequence f48068d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        public b f48069e;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        public String f48070f;

        public b(int i11, int i12, CharSequence charSequence) {
            this.f48065a = i11;
            this.f48066b = i12;
            this.f48068d = charSequence;
            int i13 = 0;
            while (i11 < i12) {
                i13 = (i13 * 31) + charSequence.charAt(i11);
                i11++;
            }
            this.f48067c = i13;
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return this.f48065a - bVar.f48065a;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f48067c != bVar.f48067c) {
                return false;
            }
            return a.g(this.f48068d, this.f48065a, this.f48066b, bVar.f48068d, bVar.f48065a, bVar.f48066b);
        }

        public int hashCode() {
            return this.f48067c;
        }
    }

    public static boolean b(char c11) {
        if ('0' <= c11 && c11 <= '9') {
            return true;
        }
        char c12 = (char) (c11 | ' ');
        return ('a' <= c12 && c12 <= 'z') || c11 == '_' || c11 == '$' || c11 == '-' || c11 == '.';
    }

    public static CharSequence c(CharSequence charSequence) {
        char c11;
        boolean z11;
        int i11;
        b bVar;
        int i12;
        HashMap hashMap = new HashMap();
        int length = charSequence.length();
        int i13 = 0;
        while (true) {
            c11 = '\n';
            z11 = true;
            if (i13 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i13);
            if (charAt == '\"') {
                i12 = i13 + 1;
                while (true) {
                    if (i12 >= length) {
                        break;
                    }
                    char charAt2 = charSequence.charAt(i12);
                    if (charAt2 != '\\') {
                        if (charAt2 == '\"') {
                            i12++;
                            break;
                        }
                    } else {
                        i12++;
                    }
                    i12++;
                }
            } else if (b(charAt)) {
                i12 = i13 + 1;
                while (i12 < length && b(charSequence.charAt(i12))) {
                    i12++;
                }
            } else {
                i13++;
            }
            int i14 = i12;
            while (i14 < length) {
                char charAt3 = charSequence.charAt(i14);
                if (charAt3 != '\t' && charAt3 != '\n' && charAt3 != '\r' && charAt3 != ' ') {
                    break;
                }
                i14++;
            }
            if (i14 == length || (':' != charSequence.charAt(i14) && i12 - i13 >= 4)) {
                b bVar2 = new b(i13, i12, charSequence);
                b bVar3 = (b) hashMap.put(bVar2, bVar2);
                if (bVar3 != null) {
                    bVar2.f48069e = bVar3;
                }
            }
            i13 = i14 - 1;
            i13++;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = hashMap.values().iterator();
        int i15 = 0;
        while (it.hasNext()) {
            b bVar4 = (b) it.next();
            if (bVar4.f48069e == null) {
                it.remove();
            } else {
                int i16 = 0;
                for (b bVar5 = bVar4; bVar5 != null; bVar5 = bVar5.f48069e) {
                    i16++;
                }
                int i17 = ((i16 - 1) * (bVar4.f48066b - bVar4.f48065a)) - f48060f;
                if (i17 > 0) {
                    i15 += i17;
                    while (bVar4 != null) {
                        arrayList.add(bVar4);
                        bVar4 = bVar4.f48069e;
                    }
                }
            }
        }
        if (i15 <= f48059e + 32) {
            return charSequence;
        }
        Collections.sort(arrayList);
        int size = arrayList.size();
        StringBuilder sb2 = new StringBuilder(length);
        sb2.append(f48055a);
        C0572a c0572a = new C0572a();
        boolean z12 = true;
        for (b bVar6 : hashMap.values()) {
            boolean z13 = z11;
            String a11 = c0572a.a();
            for (b bVar7 = bVar6; bVar7 != null; bVar7 = bVar7.f48069e) {
                bVar7.f48070f = a11;
            }
            if (z12) {
                z12 = false;
            } else {
                sb2.append(',');
            }
            sb2.append(a11);
            z11 = z13;
        }
        boolean z14 = z11;
        sb2.append(f48056b);
        int length2 = sb2.length();
        int i18 = 0;
        int i19 = 0;
        while (true) {
            if (i18 < size) {
                i11 = i18 + 1;
                bVar = (b) arrayList.get(i18);
            } else {
                i11 = i18;
                bVar = null;
            }
            int i21 = bVar != null ? bVar.f48065a : length;
            int i22 = i19;
            boolean z15 = false;
            while (i19 < i21) {
                char charAt4 = charSequence.charAt(i19);
                if (z15) {
                    if (charAt4 == '\"') {
                        z15 = false;
                    } else if (charAt4 == '\\') {
                        i19++;
                    }
                } else if (charAt4 == '\t' || charAt4 == c11 || charAt4 == '\r' || charAt4 == ' ') {
                    int i23 = i22;
                    if (i23 != i19) {
                        sb2.append(charSequence, i23, i19);
                    }
                    i22 = i19 + 1;
                } else if (charAt4 == '\"') {
                    z15 = z14;
                }
                i19++;
                c11 = '\n';
            }
            int i24 = i22;
            if (i24 != i21) {
                sb2.append(charSequence, i24, i21);
            }
            if (bVar == null) {
                break;
            }
            sb2.append(bVar.f48070f);
            i19 = bVar.f48066b;
            i18 = i11;
            c11 = '\n';
        }
        char charAt5 = sb2.charAt(length2);
        if (charAt5 != '{' && charAt5 != '[' && charAt5 != '\"') {
            sb2.insert(length2, ' ');
        }
        sb2.append(f48057c);
        boolean z16 = z14;
        for (b bVar8 : hashMap.values()) {
            if (z16) {
                z16 = false;
            } else {
                sb2.append(',');
            }
            sb2.append(bVar8.f48068d, bVar8.f48065a, bVar8.f48066b);
        }
        sb2.append(f48058d);
        return sb2;
    }

    public static String d(String str) {
        dp.b bVar = new dp.b(str);
        bVar.x();
        return c(bVar.z()).toString();
    }

    public static String e(String str, int i11) {
        dp.b bVar = new dp.b(str, i11);
        bVar.x();
        return c(bVar.z()).toString();
    }

    public static int f(char c11, boolean z11) {
        if (c11 == 'z') {
            return 65;
        }
        if (c11 == 'Z') {
            return 95;
        }
        if (c11 == '_') {
            return 36;
        }
        if (c11 == '$') {
            return z11 ? 48 : -1;
        }
        if (c11 == '9') {
            return -1;
        }
        return (char) (c11 + 1);
    }

    public static boolean g(CharSequence charSequence, int i11, int i12, CharSequence charSequence2, int i13, int i14) {
        if (i14 - i13 != i12 - i11) {
            return false;
        }
        while (i11 < i12) {
            if (charSequence.charAt(i11) != charSequence2.charAt(i13)) {
                return false;
            }
            i11++;
            i13++;
        }
        return true;
    }
}
