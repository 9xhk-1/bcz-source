package okhttp3;

import a00.h0;
import a00.m0;
import ix.g;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.DeprecationLevel;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import u30.f0;
import u30.k0;
import yz.h1;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h implements Iterable<Pair<? extends String, ? extends String>>, y00.a {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final b f77281b = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String[] f77282a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,458:1\n1#2:459\n37#3,2:460\n*S KotlinDebug\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Builder\n*L\n359#1:460,2\n*E\n"})
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final List<String> f77283a = new ArrayList(20);

        @m80.k
        public final a a(@m80.k String line) {
            g0.p(line, "line");
            int I3 = k0.I3(line, ':', 0, false, 6, null);
            if (I3 == -1) {
                throw new IllegalArgumentException(("Unexpected header: " + line).toString());
            }
            String substring = line.substring(0, I3);
            g0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String obj = k0.b6(substring).toString();
            String substring2 = line.substring(I3 + 1);
            g0.o(substring2, "this as java.lang.String).substring(startIndex)");
            b(obj, substring2);
            return this;
        }

        @m80.k
        public final a b(@m80.k String name, @m80.k String value) {
            g0.p(name, "name");
            g0.p(value, "value");
            b bVar = h.f77281b;
            bVar.f(name);
            bVar.g(value, name);
            g(name, value);
            return this;
        }

        @m80.k
        @IgnoreJRERequirement
        public final a c(@m80.k String name, @m80.k Instant value) {
            long epochMilli;
            g0.p(name, "name");
            g0.p(value, "value");
            epochMilli = value.toEpochMilli();
            d(name, new Date(epochMilli));
            return this;
        }

        @m80.k
        public final a d(@m80.k String name, @m80.k Date value) {
            g0.p(name, "name");
            g0.p(value, "value");
            b(name, a60.c.b(value));
            return this;
        }

        @m80.k
        public final a e(@m80.k h headers) {
            g0.p(headers, "headers");
            int size = headers.size();
            for (int i11 = 0; i11 < size; i11++) {
                g(headers.h(i11), headers.o(i11));
            }
            return this;
        }

        @m80.k
        public final a f(@m80.k String line) {
            g0.p(line, "line");
            int I3 = k0.I3(line, ':', 1, false, 4, null);
            if (I3 != -1) {
                String substring = line.substring(0, I3);
                g0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = line.substring(I3 + 1);
                g0.o(substring2, "this as java.lang.String).substring(startIndex)");
                g(substring, substring2);
                return this;
            }
            if (line.charAt(0) != ':') {
                g("", line);
                return this;
            }
            String substring3 = line.substring(1);
            g0.o(substring3, "this as java.lang.String).substring(startIndex)");
            g("", substring3);
            return this;
        }

        @m80.k
        public final a g(@m80.k String name, @m80.k String value) {
            g0.p(name, "name");
            g0.p(value, "value");
            this.f77283a.add(name);
            this.f77283a.add(k0.b6(value).toString());
            return this;
        }

        @m80.k
        public final a h(@m80.k String name, @m80.k String value) {
            g0.p(name, "name");
            g0.p(value, "value");
            h.f77281b.f(name);
            g(name, value);
            return this;
        }

        @m80.k
        public final h i() {
            return new h((String[]) this.f77283a.toArray(new String[0]), null);
        }

        @m80.l
        public final String j(@m80.k String name) {
            g0.p(name, "name");
            int size = this.f77283a.size() - 2;
            int c11 = o00.o.c(size, 0, -2);
            if (c11 > size) {
                return null;
            }
            while (!f0.c2(name, this.f77283a.get(size), true)) {
                if (size == c11) {
                    return null;
                }
                size -= 2;
            }
            return this.f77283a.get(size + 1);
        }

        @m80.k
        public final List<String> k() {
            return this.f77283a;
        }

        @m80.k
        public final a l(@m80.k String name) {
            g0.p(name, "name");
            int i11 = 0;
            while (i11 < this.f77283a.size()) {
                if (f0.c2(name, this.f77283a.get(i11), true)) {
                    this.f77283a.remove(i11);
                    this.f77283a.remove(i11);
                    i11 -= 2;
                }
                i11 += 2;
            }
            return this;
        }

        @m80.k
        public final a m(@m80.k String name, @m80.k String value) {
            g0.p(name, "name");
            g0.p(value, "value");
            b bVar = h.f77281b;
            bVar.f(name);
            bVar.g(value, name);
            l(name);
            g(name, value);
            return this;
        }

        @m80.k
        @IgnoreJRERequirement
        public final a n(@m80.k String name, @m80.k Instant value) {
            long epochMilli;
            g0.p(name, "name");
            g0.p(value, "value");
            epochMilli = value.toEpochMilli();
            return o(name, new Date(epochMilli));
        }

        @m80.k
        public final a o(@m80.k String name, @m80.k Date value) {
            g0.p(name, "name");
            g0.p(value, "value");
            m(name, a60.c.b(value));
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Headers.kt\nokhttp3/Headers$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,458:1\n1#2:459\n*E\n"})
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        @w00.j(name = "-deprecated_of")
        @yz.n(level = DeprecationLevel.ERROR, message = "function moved to extension", replaceWith = @w0(expression = "headers.toHeaders()", imports = {}))
        @m80.k
        public final h a(@m80.k Map<String, String> headers) {
            g0.p(headers, "headers");
            return i(headers);
        }

        @w00.j(name = "-deprecated_of")
        @yz.n(level = DeprecationLevel.ERROR, message = "function name changed", replaceWith = @w0(expression = "headersOf(*namesAndValues)", imports = {}))
        @m80.k
        public final h b(@m80.k String... namesAndValues) {
            g0.p(namesAndValues, "namesAndValues");
            return j((String[]) Arrays.copyOf(namesAndValues, namesAndValues.length));
        }

        public final void f(String str) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = str.charAt(i11);
                if ('!' > charAt || charAt >= 127) {
                    throw new IllegalArgumentException(u50.f.y("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i11), str).toString());
                }
            }
        }

        public final void g(String str, String str2) {
            int length = str.length();
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = str.charAt(i11);
                if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(u50.f.y("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i11), str2));
                    sb2.append(u50.f.O(str2) ? "" : ": " + str);
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        public final String h(String[] strArr, String str) {
            int length = strArr.length - 2;
            int c11 = o00.o.c(length, 0, -2);
            if (c11 > length) {
                return null;
            }
            while (!f0.c2(str, strArr[length], true)) {
                if (length == c11) {
                    return null;
                }
                length -= 2;
            }
            return strArr[length + 1];
        }

        @w00.j(name = "of")
        @w00.o
        @m80.k
        public final h i(@m80.k Map<String, String> map) {
            g0.p(map, "<this>");
            String[] strArr = new String[map.size() * 2];
            int i11 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String obj = k0.b6(key).toString();
                String obj2 = k0.b6(value).toString();
                f(obj);
                g(obj2, obj);
                strArr[i11] = obj;
                strArr[i11 + 1] = obj2;
                i11 += 2;
            }
            return new h(strArr, null);
        }

        @w00.j(name = "of")
        @w00.o
        @m80.k
        public final h j(@m80.k String... namesAndValues) {
            g0.p(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr = (String[]) namesAndValues.clone();
            int length = strArr.length;
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                String str = strArr[i12];
                if (str == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr[i12] = k0.b6(str).toString();
            }
            int c11 = o00.o.c(0, strArr.length - 1, 2);
            if (c11 >= 0) {
                while (true) {
                    String str2 = strArr[i11];
                    String str3 = strArr[i11 + 1];
                    f(str2);
                    g(str3, str2);
                    if (i11 == c11) {
                        break;
                    }
                    i11 += 2;
                }
            }
            return new h(strArr, null);
        }

        public b() {
        }
    }

    public /* synthetic */ h(String[] strArr, v vVar) {
        this(strArr);
    }

    @w00.j(name = "of")
    @w00.o
    @m80.k
    public static final h l(@m80.k Map<String, String> map) {
        return f77281b.i(map);
    }

    @w00.j(name = "of")
    @w00.o
    @m80.k
    public static final h m(@m80.k String... strArr) {
        return f77281b.j(strArr);
    }

    @w00.j(name = "-deprecated_size")
    @yz.n(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @w0(expression = g.b.f62794h, imports = {}))
    public final int a() {
        return size();
    }

    public final long b() {
        String[] strArr = this.f77282a;
        long length = strArr.length * 2;
        for (int i11 = 0; i11 < strArr.length; i11++) {
            length += this.f77282a[i11].length();
        }
        return length;
    }

    @m80.l
    public final String d(@m80.k String name) {
        g0.p(name, "name");
        return f77281b.h(this.f77282a, name);
    }

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof h) && Arrays.equals(this.f77282a, ((h) obj).f77282a);
    }

    @m80.l
    public final Date f(@m80.k String name) {
        g0.p(name, "name");
        String d11 = d(name);
        if (d11 != null) {
            return a60.c.a(d11);
        }
        return null;
    }

    @m80.l
    @IgnoreJRERequirement
    public final Instant g(@m80.k String name) {
        Instant instant;
        g0.p(name, "name");
        Date f11 = f(name);
        if (f11 == null) {
            return null;
        }
        instant = f11.toInstant();
        return instant;
    }

    @m80.k
    public final String h(int i11) {
        return this.f77282a[i11 * 2];
    }

    public int hashCode() {
        return Arrays.hashCode(this.f77282a);
    }

    @Override // java.lang.Iterable
    @m80.k
    public Iterator<Pair<? extends String, ? extends String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i11 = 0; i11 < size; i11++) {
            pairArr[i11] = h1.a(h(i11), o(i11));
        }
        return kotlin.jvm.internal.h.a(pairArr);
    }

    @m80.k
    public final Set<String> j() {
        TreeSet treeSet = new TreeSet(f0.i2(kotlin.jvm.internal.w0.f67050a));
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            treeSet.add(h(i11));
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        g0.o(unmodifiableSet, "unmodifiableSet(result)");
        return unmodifiableSet;
    }

    @m80.k
    public final a k() {
        a aVar = new a();
        m0.u0(aVar.k(), this.f77282a);
        return aVar;
    }

    @m80.k
    public final Map<String, List<String>> n() {
        TreeMap treeMap = new TreeMap(f0.i2(kotlin.jvm.internal.w0.f67050a));
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            String h11 = h(i11);
            Locale US = Locale.US;
            g0.o(US, "US");
            String lowerCase = h11.toLowerCase(US);
            g0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(o(i11));
        }
        return treeMap;
    }

    @m80.k
    public final String o(int i11) {
        return this.f77282a[(i11 * 2) + 1];
    }

    @m80.k
    public final List<String> p(@m80.k String name) {
        g0.p(name, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < size; i11++) {
            if (f0.c2(name, h(i11), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(o(i11));
            }
        }
        if (arrayList == null) {
            return h0.J();
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        g0.o(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
        return unmodifiableList;
    }

    @w00.j(name = g.b.f62794h)
    public final int size() {
        return this.f77282a.length / 2;
    }

    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            String h11 = h(i11);
            String o11 = o(i11);
            sb2.append(h11);
            sb2.append(": ");
            if (u50.f.O(h11)) {
                o11 = "██";
            }
            sb2.append(o11);
            sb2.append("\n");
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public h(String[] strArr) {
        this.f77282a = strArr;
    }
}
