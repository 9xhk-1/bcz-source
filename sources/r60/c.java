package r60;

import java.io.InputStream;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;
import org.apache.commons.codec.language.bm.NameType;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public static final String f83281b = "any";

    /* renamed from: c, reason: collision with root package name */
    public static final Map<NameType, c> f83282c = new EnumMap(NameType.class);

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC1033c f83283d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC1033c f83284e;

    /* renamed from: a, reason: collision with root package name */
    public final Set<String> f83285a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: r60.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC1033c {
        public static AbstractC1033c b(Set<String> set) {
            return set.isEmpty() ? c.f83283d : new d(set, null);
        }

        public abstract boolean a(String str);

        public abstract String c();

        public abstract boolean d();

        public abstract boolean e();

        public abstract AbstractC1033c f(AbstractC1033c abstractC1033c);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends AbstractC1033c {

        /* renamed from: a, reason: collision with root package name */
        public final Set<String> f83286a;

        public /* synthetic */ d(Set set, a aVar) {
            this(set);
        }

        @Override // r60.c.AbstractC1033c
        public boolean a(String str) {
            return this.f83286a.contains(str);
        }

        @Override // r60.c.AbstractC1033c
        public String c() {
            return this.f83286a.iterator().next();
        }

        @Override // r60.c.AbstractC1033c
        public boolean d() {
            return this.f83286a.isEmpty();
        }

        @Override // r60.c.AbstractC1033c
        public boolean e() {
            return this.f83286a.size() == 1;
        }

        @Override // r60.c.AbstractC1033c
        public AbstractC1033c f(AbstractC1033c abstractC1033c) {
            if (abstractC1033c == c.f83283d) {
                return abstractC1033c;
            }
            if (abstractC1033c != c.f83284e) {
                d dVar = (d) abstractC1033c;
                if (!dVar.f83286a.containsAll(this.f83286a)) {
                    HashSet hashSet = new HashSet(this.f83286a);
                    hashSet.retainAll(dVar.f83286a);
                    return AbstractC1033c.b(hashSet);
                }
            }
            return this;
        }

        public Set<String> g() {
            return this.f83286a;
        }

        public String toString() {
            return "Languages(" + this.f83286a.toString() + j.f81007d;
        }

        public d(Set<String> set) {
            this.f83286a = Collections.unmodifiableSet(set);
        }
    }

    static {
        for (NameType nameType : NameType.values()) {
            f83282c.put(nameType, a(d(nameType)));
        }
        f83283d = new a();
        f83284e = new b();
    }

    public c(Set<String> set) {
        this.f83285a = set;
    }

    public static c a(String str) {
        HashSet hashSet = new HashSet();
        InputStream resourceAsStream = c.class.getClassLoader().getResourceAsStream(str);
        if (resourceAsStream == null) {
            throw new IllegalArgumentException("Unable to resolve required resource: " + str);
        }
        Scanner scanner = new Scanner(resourceAsStream, "UTF-8");
        while (true) {
            boolean z11 = false;
            while (scanner.hasNextLine()) {
                String trim = scanner.nextLine().trim();
                if (z11) {
                    if (trim.endsWith(e.f83303c)) {
                        break;
                    }
                } else if (trim.startsWith(e.f83304d)) {
                    z11 = true;
                } else if (trim.length() > 0) {
                    hashSet.add(trim);
                }
            }
            return new c(Collections.unmodifiableSet(hashSet));
        }
    }

    public static c b(NameType nameType) {
        return f83282c.get(nameType);
    }

    public static String d(NameType nameType) {
        return String.format("org/apache/commons/codec/language/bm/%s_languages.txt", nameType.getName());
    }

    public Set<String> c() {
        return this.f83285a;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends AbstractC1033c {
        @Override // r60.c.AbstractC1033c
        public boolean a(String str) {
            return false;
        }

        @Override // r60.c.AbstractC1033c
        public String c() {
            throw new NoSuchElementException("Can't fetch any language from the empty language set.");
        }

        @Override // r60.c.AbstractC1033c
        public boolean d() {
            return true;
        }

        @Override // r60.c.AbstractC1033c
        public boolean e() {
            return false;
        }

        public String toString() {
            return "NO_LANGUAGES";
        }

        @Override // r60.c.AbstractC1033c
        public AbstractC1033c f(AbstractC1033c abstractC1033c) {
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends AbstractC1033c {
        @Override // r60.c.AbstractC1033c
        public boolean a(String str) {
            return true;
        }

        @Override // r60.c.AbstractC1033c
        public String c() {
            throw new NoSuchElementException("Can't fetch any language from the any language set.");
        }

        @Override // r60.c.AbstractC1033c
        public boolean d() {
            return false;
        }

        @Override // r60.c.AbstractC1033c
        public boolean e() {
            return false;
        }

        public String toString() {
            return "ANY_LANGUAGE";
        }

        @Override // r60.c.AbstractC1033c
        public AbstractC1033c f(AbstractC1033c abstractC1033c) {
            return abstractC1033c;
        }
    }
}
