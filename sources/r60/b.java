package r60;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;
import n6.m;
import org.apache.commons.codec.language.bm.NameType;
import r60.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public static final Map<NameType, b> f83274c = new EnumMap(NameType.class);

    /* renamed from: d, reason: collision with root package name */
    public static final String f83275d = "org/apache/commons/codec/language/bm/lang.txt";

    /* renamed from: a, reason: collision with root package name */
    public final c f83276a;

    /* renamed from: b, reason: collision with root package name */
    public final List<C1032b> f83277b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: r60.b$b, reason: collision with other inner class name */
    public static final class C1032b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f83278a;

        /* renamed from: b, reason: collision with root package name */
        public final Set<String> f83279b;

        /* renamed from: c, reason: collision with root package name */
        public final Pattern f83280c;

        public boolean c(String str) {
            return this.f83280c.matcher(str).find();
        }

        public C1032b(Pattern pattern, Set<String> set, boolean z11) {
            this.f83280c = pattern;
            this.f83279b = set;
            this.f83278a = z11;
        }
    }

    static {
        for (NameType nameType : NameType.values()) {
            f83274c.put(nameType, d(f83275d, c.b(nameType)));
        }
    }

    public b(List<C1032b> list, c cVar) {
        this.f83277b = Collections.unmodifiableList(list);
        this.f83276a = cVar;
    }

    public static b c(NameType nameType) {
        return f83274c.get(nameType);
    }

    public static b d(String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        InputStream resourceAsStream = b.class.getClassLoader().getResourceAsStream(str);
        if (resourceAsStream == null) {
            throw new IllegalStateException("Unable to resolve required resource:org/apache/commons/codec/language/bm/lang.txt");
        }
        Scanner scanner = new Scanner(resourceAsStream, "UTF-8");
        while (true) {
            boolean z11 = false;
            while (scanner.hasNextLine()) {
                String nextLine = scanner.nextLine();
                if (z11) {
                    if (nextLine.endsWith(e.f83303c)) {
                        break;
                    }
                } else if (nextLine.startsWith(e.f83304d)) {
                    z11 = true;
                } else {
                    int indexOf = nextLine.indexOf(e.f83301a);
                    String trim = (indexOf >= 0 ? nextLine.substring(0, indexOf) : nextLine).trim();
                    if (trim.length() != 0) {
                        String[] split = trim.split("\\s+");
                        if (split.length != 3) {
                            System.err.println("Warning: malformed line '" + nextLine + "'");
                        } else {
                            arrayList.add(new C1032b(Pattern.compile(split[0]), new HashSet(Arrays.asList(split[1].split("\\+"))), split[2].equals(m.f74525c)));
                        }
                    }
                }
            }
            return new b(arrayList, cVar);
        }
    }

    public String a(String str) {
        c.AbstractC1033c b11 = b(str);
        return b11.e() ? b11.c() : c.f83281b;
    }

    public c.AbstractC1033c b(String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        HashSet hashSet = new HashSet(this.f83276a.c());
        for (C1032b c1032b : this.f83277b) {
            if (c1032b.c(lowerCase)) {
                if (c1032b.f83278a) {
                    hashSet.retainAll(c1032b.f83279b);
                } else {
                    hashSet.removeAll(c1032b.f83279b);
                }
            }
        }
        c.AbstractC1033c b11 = c.AbstractC1033c.b(hashSet);
        return b11.equals(c.f83283d) ? c.f83284e : b11;
    }
}
