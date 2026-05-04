package r60;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meizu.cloud.pushsdk.notification.model.AppIconSetting;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.apache.commons.codec.language.bm.NameType;
import org.apache.commons.codec.language.bm.RuleType;
import pn.j;
import r60.c;
import r60.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: e, reason: collision with root package name */
    public static final Map<NameType, Set<String>> f83287e;

    /* renamed from: a, reason: collision with root package name */
    public final r60.b f83288a;

    /* renamed from: b, reason: collision with root package name */
    public final NameType f83289b;

    /* renamed from: c, reason: collision with root package name */
    public final RuleType f83290c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f83291d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements CharSequence {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CharSequence f83292a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CharSequence[][] f83293b;

        public a(CharSequence charSequence, CharSequence[][] charSequenceArr) {
            this.f83292a = charSequence;
            this.f83293b = charSequenceArr;
        }

        @Override // java.lang.CharSequence
        public char charAt(int i11) {
            return this.f83292a.charAt(i11);
        }

        @Override // java.lang.CharSequence
        public int length() {
            return this.f83292a.length();
        }

        @Override // java.lang.CharSequence
        public CharSequence subSequence(int i11, int i12) {
            if (i11 == i12) {
                return "";
            }
            int i13 = i12 - 1;
            CharSequence charSequence = this.f83293b[i11][i13];
            if (charSequence != null) {
                return charSequence;
            }
            CharSequence subSequence = this.f83292a.subSequence(i11, i12);
            this.f83293b[i11][i13] = subSequence;
            return subSequence;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f83294a;

        static {
            int[] iArr = new int[NameType.values().length];
            f83294a = iArr;
            try {
                iArr[NameType.SEPHARDIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83294a[NameType.ASHKENAZI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f83294a[NameType.GENERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Set<f.k> f83295a;

        public /* synthetic */ c(Set set, a aVar) {
            this(set);
        }

        public static c c(c.AbstractC1033c abstractC1033c) {
            return new c(Collections.singleton(new f.k("", abstractC1033c)));
        }

        public c a(CharSequence charSequence) {
            HashSet hashSet = new HashSet();
            Iterator<f.k> it = this.f83295a.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().c(charSequence));
            }
            return new c(hashSet);
        }

        public c b(f.l lVar) {
            HashSet hashSet = new HashSet();
            for (f.k kVar : this.f83295a) {
                Iterator<f.k> it = lVar.a().iterator();
                while (it.hasNext()) {
                    f.k f11 = kVar.f(it.next());
                    if (!f11.d().d()) {
                        hashSet.add(f11);
                    }
                }
            }
            return new c(hashSet);
        }

        public Set<f.k> d() {
            return this.f83295a;
        }

        public String e() {
            StringBuilder sb2 = new StringBuilder();
            for (f.k kVar : this.f83295a) {
                if (sb2.length() > 0) {
                    sb2.append(HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
                }
                sb2.append(kVar.e());
            }
            return sb2.toString();
        }

        public c(Set<f.k> set) {
            this.f83295a = set;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: r60.d$d, reason: collision with other inner class name */
    public static final class C1034d {

        /* renamed from: a, reason: collision with root package name */
        public final List<f> f83296a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f83297b;

        /* renamed from: c, reason: collision with root package name */
        public c f83298c;

        /* renamed from: d, reason: collision with root package name */
        public int f83299d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f83300e;

        public C1034d(List<f> list, CharSequence charSequence, c cVar, int i11) {
            if (list == null) {
                throw new NullPointerException("The finalRules argument must not be null");
            }
            this.f83296a = list;
            this.f83298c = cVar;
            this.f83297b = charSequence;
            this.f83299d = i11;
        }

        public int a() {
            return this.f83299d;
        }

        public c b() {
            return this.f83298c;
        }

        public C1034d c() {
            int i11 = 0;
            this.f83300e = false;
            Iterator<f> it = this.f83296a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                f next = it.next();
                int length = next.l().length();
                if (next.s(this.f83297b, this.f83299d)) {
                    this.f83298c = this.f83298c.b(next.m());
                    this.f83300e = true;
                    i11 = length;
                    break;
                }
                i11 = length;
            }
            this.f83299d += this.f83300e ? i11 : 1;
            return this;
        }

        public boolean d() {
            return this.f83300e;
        }
    }

    static {
        EnumMap enumMap = new EnumMap(NameType.class);
        f83287e = enumMap;
        enumMap.put((EnumMap) NameType.ASHKENAZI, (NameType) Collections.unmodifiableSet(new HashSet(Arrays.asList("bar", "ben", "da", "de", "van", "von"))));
        enumMap.put((EnumMap) NameType.SEPHARDIC, (NameType) Collections.unmodifiableSet(new HashSet(Arrays.asList("al", "el", "da", "dal", "de", "del", "dela", "de la", "della", "des", AppIconSetting.DEFAULT_LARGE_ICON, "do", "dos", "du", "van", "von"))));
        enumMap.put((EnumMap) NameType.GENERIC, (NameType) Collections.unmodifiableSet(new HashSet(Arrays.asList("da", "dal", "de", "del", "dela", "de la", "della", "des", AppIconSetting.DEFAULT_LARGE_ICON, "do", "dos", "du", "van", "von"))));
    }

    public d(NameType nameType, RuleType ruleType, boolean z11) {
        RuleType ruleType2 = RuleType.RULES;
        if (ruleType == ruleType2) {
            throw new IllegalArgumentException("ruleType must not be " + ruleType2);
        }
        this.f83289b = nameType;
        this.f83290c = ruleType;
        this.f83291d = z11;
        this.f83288a = r60.b.c(nameType);
    }

    public static CharSequence b(CharSequence charSequence) {
        return new a(charSequence, (CharSequence[][]) Array.newInstance((Class<?>) CharSequence.class, charSequence.length(), charSequence.length()));
    }

    public static String i(Iterable<String> iterable, String str) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = iterable.iterator();
        if (it.hasNext()) {
            sb2.append(it.next());
        }
        while (it.hasNext()) {
            sb2.append(str);
            sb2.append(it.next());
        }
        return sb2.toString();
    }

    public final c a(c cVar, List<f> list) {
        if (list == null) {
            throw new NullPointerException("finalRules can not be null");
        }
        if (list.isEmpty()) {
            return cVar;
        }
        TreeSet treeSet = new TreeSet(f.k.f83329c);
        for (f.k kVar : cVar.d()) {
            c c11 = c.c(kVar.d());
            CharSequence b11 = b(kVar.e());
            int i11 = 0;
            while (i11 < b11.length()) {
                C1034d c12 = new C1034d(list, b11, c11, i11).c();
                boolean d11 = c12.d();
                c b12 = c12.b();
                c a11 = !d11 ? b12.a(b11.subSequence(i11, i11 + 1)) : b12;
                i11 = c12.a();
                c11 = a11;
            }
            treeSet.addAll(c11.d());
        }
        return new c(treeSet, null);
    }

    public String c(String str) {
        return d(str, this.f83288a.b(str));
    }

    public String d(String str, c.AbstractC1033c abstractC1033c) {
        String str2;
        List<f> j11 = f.j(this.f83289b, RuleType.RULES, abstractC1033c);
        List<f> i11 = f.i(this.f83289b, this.f83290c, "common");
        List<f> j12 = f.j(this.f83289b, this.f83290c, abstractC1033c);
        String trim = str.toLowerCase(Locale.ENGLISH).replace('-', ' ').trim();
        int i12 = 0;
        if (this.f83289b == NameType.GENERIC) {
            if (trim.length() >= 2 && trim.substring(0, 2).equals("d'")) {
                String substring = trim.substring(2);
                return j.f81006c + c(substring) + ")-(" + c("d" + substring) + j.f81007d;
            }
            for (String str3 : f83287e.get(this.f83289b)) {
                if (trim.startsWith(str3 + " ")) {
                    String substring2 = trim.substring(str3.length() + 1);
                    return j.f81006c + c(substring2) + ")-(" + c(str3 + substring2) + j.f81007d;
                }
            }
        }
        List asList = Arrays.asList(trim.split("\\s+"));
        ArrayList<String> arrayList = new ArrayList();
        int i13 = b.f83294a[this.f83289b.ordinal()];
        if (i13 == 1) {
            Iterator it = asList.iterator();
            while (it.hasNext()) {
                String[] split = ((String) it.next()).split("'");
                arrayList.add(split[split.length - 1]);
            }
            arrayList.removeAll(f83287e.get(this.f83289b));
        } else if (i13 == 2) {
            arrayList.addAll(asList);
            arrayList.removeAll(f83287e.get(this.f83289b));
        } else {
            if (i13 != 3) {
                throw new IllegalStateException("Unreachable case: " + this.f83289b);
            }
            arrayList.addAll(asList);
        }
        if (this.f83291d) {
            str2 = i(arrayList, " ");
        } else {
            if (arrayList.size() != 1) {
                StringBuilder sb2 = new StringBuilder();
                for (String str4 : arrayList) {
                    sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                    sb2.append(c(str4));
                }
                return sb2.substring(1);
            }
            str2 = (String) asList.iterator().next();
        }
        c c11 = c.c(abstractC1033c);
        CharSequence b11 = b(str2);
        while (i12 < b11.length()) {
            C1034d c12 = new C1034d(j11, b11, c11, i12).c();
            i12 = c12.a();
            c11 = c12.b();
        }
        return a(a(c11, i11), j12).e();
    }

    public r60.b e() {
        return this.f83288a;
    }

    public NameType f() {
        return this.f83289b;
    }

    public RuleType g() {
        return this.f83290c;
    }

    public boolean h() {
        return this.f83291d;
    }
}
