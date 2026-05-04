package r60;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
import org.apache.commons.codec.language.bm.NameType;
import org.apache.commons.codec.language.bm.RuleType;
import r60.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: f, reason: collision with root package name */
    public static final String f83306f = "ALL";

    /* renamed from: g, reason: collision with root package name */
    public static final String f83307g = "\"";

    /* renamed from: h, reason: collision with root package name */
    public static final String f83308h = "#include";

    /* renamed from: a, reason: collision with root package name */
    public final n f83310a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83311b;

    /* renamed from: c, reason: collision with root package name */
    public final l f83312c;

    /* renamed from: d, reason: collision with root package name */
    public final n f83313d;

    /* renamed from: e, reason: collision with root package name */
    public static final n f83305e = new b();

    /* renamed from: i, reason: collision with root package name */
    public static final Map<NameType, Map<RuleType, Map<String, List<f>>>> f83309i = new EnumMap(NameType.class);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements n {

        /* renamed from: a, reason: collision with root package name */
        public Pattern f83314a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f83315b;

        public a(String str) {
            this.f83315b = str;
            this.f83314a = Pattern.compile(str);
        }

        @Override // r60.f.n
        public boolean a(CharSequence charSequence) {
            return this.f83314a.matcher(charSequence).find();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements n {
        @Override // r60.f.n
        public boolean a(CharSequence charSequence) {
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c extends f {

        /* renamed from: j, reason: collision with root package name */
        public final int f83316j;

        /* renamed from: k, reason: collision with root package name */
        public final String f83317k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f83318l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f83319m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3, l lVar, int i11, String str4) {
            super(str, str2, str3, lVar);
            this.f83318l = i11;
            this.f83319m = str4;
            this.f83316j = i11;
            this.f83317k = str4;
        }

        public String toString() {
            return "Rule{line=" + this.f83316j + ", loc='" + this.f83317k + '\'' + l50.b.f69928j;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements n {
        @Override // r60.f.n
        public boolean a(CharSequence charSequence) {
            return charSequence.length() == 0;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e implements n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f83320a;

        public e(String str) {
            this.f83320a = str;
        }

        @Override // r60.f.n
        public boolean a(CharSequence charSequence) {
            return charSequence.equals(this.f83320a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: r60.f$f, reason: collision with other inner class name */
    public static class C1035f implements n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f83321a;

        public C1035f(String str) {
            this.f83321a = str;
        }

        @Override // r60.f.n
        public boolean a(CharSequence charSequence) {
            return f.t(charSequence, this.f83321a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g implements n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f83322a;

        public g(String str) {
            this.f83322a = str;
        }

        @Override // r60.f.n
        public boolean a(CharSequence charSequence) {
            return f.h(charSequence, this.f83322a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class h implements n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f83323a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f83324b;

        public h(String str, boolean z11) {
            this.f83323a = str;
            this.f83324b = z11;
        }

        @Override // r60.f.n
        public boolean a(CharSequence charSequence) {
            return charSequence.length() == 1 && f.d(this.f83323a, charSequence.charAt(0)) == this.f83324b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i implements n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f83325a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f83326b;

        public i(String str, boolean z11) {
            this.f83325a = str;
            this.f83326b = z11;
        }

        @Override // r60.f.n
        public boolean a(CharSequence charSequence) {
            return charSequence.length() > 0 && f.d(this.f83325a, charSequence.charAt(0)) == this.f83326b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class j implements n {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f83327a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f83328b;

        public j(String str, boolean z11) {
            this.f83327a = str;
            this.f83328b = z11;
        }

        @Override // r60.f.n
        public boolean a(CharSequence charSequence) {
            return charSequence.length() > 0 && f.d(this.f83327a, charSequence.charAt(charSequence.length() - 1)) == this.f83328b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k implements l {

        /* renamed from: c, reason: collision with root package name */
        public static final Comparator<k> f83329c = new a();

        /* renamed from: a, reason: collision with root package name */
        public final CharSequence f83330a;

        /* renamed from: b, reason: collision with root package name */
        public final c.AbstractC1033c f83331b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a implements Comparator<k> {
            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(k kVar, k kVar2) {
                for (int i11 = 0; i11 < kVar.f83330a.length(); i11++) {
                    if (i11 >= kVar2.f83330a.length()) {
                        return 1;
                    }
                    int charAt = kVar.f83330a.charAt(i11) - kVar2.f83330a.charAt(i11);
                    if (charAt != 0) {
                        return charAt;
                    }
                }
                return kVar.f83330a.length() < kVar2.f83330a.length() ? -1 : 0;
            }
        }

        public k(CharSequence charSequence, c.AbstractC1033c abstractC1033c) {
            this.f83330a = charSequence;
            this.f83331b = abstractC1033c;
        }

        @Override // r60.f.l
        public Iterable<k> a() {
            return Collections.singleton(this);
        }

        public k c(CharSequence charSequence) {
            return new k(this.f83330a.toString() + charSequence.toString(), this.f83331b);
        }

        public c.AbstractC1033c d() {
            return this.f83331b;
        }

        public CharSequence e() {
            return this.f83330a;
        }

        public k f(k kVar) {
            return new k(this.f83330a.toString() + kVar.f83330a.toString(), this.f83331b.f(kVar.f83331b));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface l {
        Iterable<k> a();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class m implements l {

        /* renamed from: a, reason: collision with root package name */
        public final List<k> f83332a;

        public m(List<k> list) {
            this.f83332a = list;
        }

        @Override // r60.f.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<k> a() {
            return this.f83332a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface n {
        boolean a(CharSequence charSequence);
    }

    static {
        for (NameType nameType : NameType.values()) {
            EnumMap enumMap = new EnumMap(RuleType.class);
            for (RuleType ruleType : RuleType.values()) {
                HashMap hashMap = new HashMap();
                for (String str : r60.c.b(nameType).c()) {
                    try {
                        hashMap.put(str, q(g(nameType, ruleType, str), e(nameType, ruleType, str)));
                    } catch (IllegalStateException e11) {
                        throw new IllegalStateException("Problem processing " + e(nameType, ruleType, str), e11);
                    }
                }
                if (!ruleType.equals(RuleType.RULES)) {
                    hashMap.put("common", q(g(nameType, ruleType, "common"), e(nameType, ruleType, "common")));
                }
                enumMap.put((EnumMap) ruleType, (RuleType) Collections.unmodifiableMap(hashMap));
            }
            f83309i.put(nameType, Collections.unmodifiableMap(enumMap));
        }
    }

    public f(String str, String str2, String str3, l lVar) {
        this.f83311b = str;
        this.f83310a = r(str2 + "$");
        this.f83313d = r("^" + str3);
        this.f83312c = lVar;
    }

    public static boolean d(CharSequence charSequence, char c11) {
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (charSequence.charAt(i11) == c11) {
                return true;
            }
        }
        return false;
    }

    public static String e(NameType nameType, RuleType ruleType, String str) {
        return String.format("org/apache/commons/codec/language/bm/%s_%s_%s.txt", nameType.getName(), ruleType.getName(), str);
    }

    public static Scanner f(String str) {
        String format = String.format("org/apache/commons/codec/language/bm/%s.txt", str);
        InputStream resourceAsStream = r60.c.class.getClassLoader().getResourceAsStream(format);
        if (resourceAsStream != null) {
            return new Scanner(resourceAsStream, "UTF-8");
        }
        throw new IllegalArgumentException("Unable to load resource: " + format);
    }

    public static Scanner g(NameType nameType, RuleType ruleType, String str) {
        String e11 = e(nameType, ruleType, str);
        InputStream resourceAsStream = r60.c.class.getClassLoader().getResourceAsStream(e11);
        if (resourceAsStream != null) {
            return new Scanner(resourceAsStream, "UTF-8");
        }
        throw new IllegalArgumentException("Unable to load resource: " + e11);
    }

    public static boolean h(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        int length = charSequence.length() - 1;
        for (int length2 = charSequence2.length() - 1; length2 >= 0; length2--) {
            if (charSequence.charAt(length) != charSequence2.charAt(length2)) {
                return false;
            }
            length--;
        }
        return true;
    }

    public static List<f> i(NameType nameType, RuleType ruleType, String str) {
        List<f> list = f83309i.get(nameType).get(ruleType).get(str);
        if (list != null) {
            return list;
        }
        throw new IllegalArgumentException(String.format("No rules found for %s, %s, %s.", nameType.getName(), ruleType.getName(), str));
    }

    public static List<f> j(NameType nameType, RuleType ruleType, c.AbstractC1033c abstractC1033c) {
        return i(nameType, ruleType, abstractC1033c.e() ? abstractC1033c.c() : r60.c.f83281b);
    }

    public static k o(String str) {
        int indexOf = str.indexOf("[");
        if (indexOf < 0) {
            return new k(str, r60.c.f83284e);
        }
        if (str.endsWith("]")) {
            return new k(str.substring(0, indexOf), c.AbstractC1033c.b(new HashSet(Arrays.asList(str.substring(indexOf + 1, str.length() - 1).split("[+]")))));
        }
        throw new IllegalArgumentException("Phoneme expression contains a '[' but does not end in ']'");
    }

    public static l p(String str) {
        if (!str.startsWith(pn.j.f81006c)) {
            return o(str);
        }
        if (!str.endsWith(pn.j.f81007d)) {
            throw new IllegalArgumentException("Phoneme starts with '(' so must end with ')'");
        }
        ArrayList arrayList = new ArrayList();
        String substring = str.substring(1, str.length() - 1);
        for (String str2 : substring.split("[|]")) {
            arrayList.add(o(str2));
        }
        if (substring.startsWith(HiAnalyticsConstant.REPORT_VAL_SEPARATOR) || substring.endsWith(HiAnalyticsConstant.REPORT_VAL_SEPARATOR)) {
            arrayList.add(new k("", r60.c.f83284e));
        }
        return new m(arrayList);
    }

    public static List<f> q(Scanner scanner, String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        boolean z11 = false;
        while (scanner.hasNextLine()) {
            int i12 = i11 + 1;
            String nextLine = scanner.nextLine();
            if (z11) {
                if (nextLine.endsWith(r60.e.f83303c)) {
                    str2 = str;
                    z11 = false;
                    i11 = i12;
                    str = str2;
                }
                str2 = str;
                i11 = i12;
                str = str2;
            } else {
                if (nextLine.startsWith(r60.e.f83304d)) {
                    str2 = str;
                    z11 = true;
                } else {
                    int indexOf = nextLine.indexOf(r60.e.f83301a);
                    String trim = (indexOf >= 0 ? nextLine.substring(0, indexOf) : nextLine).trim();
                    if (trim.length() == 0) {
                        i11 = i12;
                    } else {
                        if (trim.startsWith(f83308h)) {
                            String trim2 = trim.substring(8).trim();
                            if (trim2.contains(" ")) {
                                System.err.println("Warining: malformed import statement: " + nextLine);
                            } else {
                                arrayList.addAll(q(f(trim2), str + "->" + trim2));
                            }
                        } else {
                            String[] split = trim.split("\\s+");
                            if (split.length != 4) {
                                System.err.println("Warning: malformed rule statement split into " + split.length + " parts: " + nextLine);
                            } else {
                                try {
                                    str2 = str;
                                    arrayList.add(new c(u(split[0]), u(split[1]), u(split[2]), p(u(split[3])), i12, str2));
                                } catch (IllegalArgumentException e11) {
                                    throw new IllegalStateException("Problem parsing line " + i12, e11);
                                }
                            }
                        }
                        str2 = str;
                    }
                }
                i11 = i12;
                str = str2;
            }
        }
        return arrayList;
    }

    public static n r(String str) {
        boolean startsWith = str.startsWith("^");
        boolean endsWith = str.endsWith("$");
        int length = str.length();
        if (endsWith) {
            length--;
        }
        String substring = str.substring(startsWith ? 1 : 0, length);
        if (substring.contains("[")) {
            boolean startsWith2 = substring.startsWith("[");
            boolean endsWith2 = substring.endsWith("]");
            if (startsWith2 && endsWith2) {
                String substring2 = substring.substring(1, substring.length() - 1);
                if (!substring2.contains("[")) {
                    boolean startsWith3 = substring2.startsWith("^");
                    if (startsWith3) {
                        substring2 = substring2.substring(1);
                    }
                    boolean z11 = !startsWith3;
                    if (startsWith && endsWith) {
                        return new h(substring2, z11);
                    }
                    if (startsWith) {
                        return new i(substring2, z11);
                    }
                    if (endsWith) {
                        return new j(substring2, z11);
                    }
                }
            }
        } else {
            if (startsWith && endsWith) {
                return substring.length() == 0 ? new d() : new e(substring);
            }
            if ((startsWith || endsWith) && substring.length() == 0) {
                return f83305e;
            }
            if (startsWith) {
                return new C1035f(substring);
            }
            if (endsWith) {
                return new g(substring);
            }
        }
        return new a(str);
    }

    public static boolean t(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        for (int i11 = 0; i11 < charSequence2.length(); i11++) {
            if (charSequence.charAt(i11) != charSequence2.charAt(i11)) {
                return false;
            }
        }
        return true;
    }

    public static String u(String str) {
        if (str.startsWith("\"")) {
            str = str.substring(1);
        }
        return str.endsWith("\"") ? str.substring(0, str.length() - 1) : str;
    }

    public n k() {
        return this.f83310a;
    }

    public String l() {
        return this.f83311b;
    }

    public l m() {
        return this.f83312c;
    }

    public n n() {
        return this.f83313d;
    }

    public boolean s(CharSequence charSequence, int i11) {
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("Can not match pattern at negative indexes");
        }
        int length = this.f83311b.length() + i11;
        if (length > charSequence.length()) {
            return false;
        }
        return charSequence.subSequence(i11, length).equals(this.f83311b) && this.f83313d.a(charSequence.subSequence(length, charSequence.length())) && this.f83310a.a(charSequence.subSequence(0, i11));
    }
}
