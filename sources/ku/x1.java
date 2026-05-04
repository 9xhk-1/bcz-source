package ku;

import com.typesafe.config.ConfigException;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ku.c1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class x1 implements ju.m {

    /* renamed from: h, reason: collision with root package name */
    public static final String f68871h = "merge of ";

    /* renamed from: a, reason: collision with root package name */
    public final String f68872a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68873b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68874c;

    /* renamed from: d, reason: collision with root package name */
    public final q0 f68875d;

    /* renamed from: e, reason: collision with root package name */
    public final String f68876e;

    /* renamed from: f, reason: collision with root package name */
    public final String f68877f;

    /* renamed from: g, reason: collision with root package name */
    public final List<String> f68878g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f68879a;

        static {
            int[] iArr = new int[c1.c.values().length];
            f68879a = iArr;
            try {
                iArr[c1.c.ORIGIN_DESCRIPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68879a[c1.c.ORIGIN_LINE_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68879a[c1.c.ORIGIN_END_LINE_NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f68879a[c1.c.ORIGIN_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f68879a[c1.c.ORIGIN_URL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f68879a[c1.c.ORIGIN_RESOURCE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f68879a[c1.c.ORIGIN_COMMENTS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f68879a[c1.c.ORIGIN_NULL_URL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f68879a[c1.c.ORIGIN_NULL_RESOURCE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f68879a[c1.c.ORIGIN_NULL_COMMENTS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f68879a[c1.c.END_MARKER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f68879a[c1.c.ROOT_VALUE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f68879a[c1.c.ROOT_WAS_CONFIG.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f68879a[c1.c.UNKNOWN.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f68879a[c1.c.VALUE_DATA.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f68879a[c1.c.VALUE_ORIGIN.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public x1(String str, int i11, int i12, q0 q0Var, String str2, String str3, List<String> list) {
        if (str == null) {
            throw new ConfigException.BugOrBroken("description may not be null");
        }
        this.f68872a = str;
        this.f68873b = i11;
        this.f68874c = i12;
        this.f68875d = q0Var;
        this.f68876e = str2;
        this.f68877f = str3;
        this.f68878g = list;
    }

    public static int A(x1 x1Var, x1 x1Var2) {
        int i11 = x1Var.f68875d == x1Var2.f68875d ? 1 : 0;
        if (!x1Var.f68872a.equals(x1Var2.f68872a)) {
            return i11;
        }
        int i12 = i11 + 1;
        if (x1Var.f68873b == x1Var2.f68873b) {
            i12 = i11 + 2;
        }
        if (x1Var.f68874c == x1Var2.f68874c) {
            i12++;
        }
        if (q.b(x1Var.f68876e, x1Var2.f68876e)) {
            i12++;
        }
        return q.b(x1Var.f68877f, x1Var2.f68877f) ? i12 + 1 : i12;
    }

    public static Map<c1.c, Object> j(Map<c1.c, Object> map, Map<c1.c, Object> map2) throws IOException {
        EnumMap enumMap = new EnumMap(map2);
        Iterator<Map.Entry<c1.c, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            c1.c key = it.next().getKey();
            if (!map2.containsKey(key)) {
                switch (a.f68879a[key.ordinal()]) {
                    case 1:
                        enumMap.put((EnumMap) key, (c1.c) map.get(key));
                        break;
                    case 2:
                    case 3:
                    case 4:
                        enumMap.put((EnumMap) key, (c1.c) map.get(key));
                        break;
                    case 5:
                        c1.c cVar = c1.c.ORIGIN_NULL_URL;
                        if (!map2.containsKey(cVar)) {
                            enumMap.put((EnumMap) key, (c1.c) map.get(key));
                            break;
                        } else {
                            enumMap.remove(cVar);
                            break;
                        }
                    case 6:
                        c1.c cVar2 = c1.c.ORIGIN_NULL_RESOURCE;
                        if (!map2.containsKey(cVar2)) {
                            enumMap.put((EnumMap) key, (c1.c) map.get(key));
                            break;
                        } else {
                            enumMap.remove(cVar2);
                            break;
                        }
                    case 7:
                        c1.c cVar3 = c1.c.ORIGIN_NULL_COMMENTS;
                        if (!map2.containsKey(cVar3)) {
                            enumMap.put((EnumMap) key, (c1.c) map.get(key));
                            break;
                        } else {
                            enumMap.remove(cVar3);
                            break;
                        }
                    case 8:
                    case 9:
                    case 10:
                        throw new ConfigException.BugOrBroken("applying fields, base object should not contain " + key + " " + map);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                        throw new ConfigException.BugOrBroken("should not appear here: " + key);
                }
            }
        }
        return enumMap;
    }

    public static Map<c1.c, Object> k(Map<c1.c, Object> map, Map<c1.c, Object> map2) {
        EnumMap enumMap = new EnumMap(map2);
        for (Map.Entry<c1.c, Object> entry : map.entrySet()) {
            c1.c key = entry.getKey();
            if (enumMap.containsKey(key) && q.b(entry.getValue(), enumMap.get(key))) {
                enumMap.remove(key);
            } else if (enumMap.containsKey(key)) {
                continue;
            } else {
                switch (a.f68879a[key.ordinal()]) {
                    case 1:
                        throw new ConfigException.BugOrBroken("origin missing description field? " + map2);
                    case 2:
                        enumMap.put((EnumMap) c1.c.ORIGIN_LINE_NUMBER, (c1.c) (-1));
                        break;
                    case 3:
                        enumMap.put((EnumMap) c1.c.ORIGIN_END_LINE_NUMBER, (c1.c) (-1));
                        break;
                    case 4:
                        throw new ConfigException.BugOrBroken("should always be an ORIGIN_TYPE field");
                    case 5:
                        enumMap.put((EnumMap) c1.c.ORIGIN_NULL_URL, (c1.c) "");
                        break;
                    case 6:
                        enumMap.put((EnumMap) c1.c.ORIGIN_NULL_RESOURCE, (c1.c) "");
                        break;
                    case 7:
                        enumMap.put((EnumMap) c1.c.ORIGIN_NULL_COMMENTS, (c1.c) "");
                        break;
                    case 8:
                    case 9:
                    case 10:
                        throw new ConfigException.BugOrBroken("computing delta, base object should not contain " + key + " " + map);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                        throw new ConfigException.BugOrBroken("should not appear here: " + key);
                }
            }
        }
        return enumMap;
    }

    public static x1 l(x1 x1Var, Map<c1.c, Object> map) throws IOException {
        return m(j(x1Var != null ? x1Var.B() : Collections.EMPTY_MAP, map));
    }

    public static x1 m(Map<c1.c, Object> map) throws IOException {
        if (map.isEmpty()) {
            return null;
        }
        String str = (String) map.get(c1.c.ORIGIN_DESCRIPTION);
        Integer num = (Integer) map.get(c1.c.ORIGIN_LINE_NUMBER);
        Integer num2 = (Integer) map.get(c1.c.ORIGIN_END_LINE_NUMBER);
        Number number = (Number) map.get(c1.c.ORIGIN_TYPE);
        if (number == null) {
            throw new IOException("Missing ORIGIN_TYPE field");
        }
        q0 q0Var = number.byteValue() < q0.values().length ? q0.values()[number.byteValue()] : q0.GENERIC;
        String str2 = (String) map.get(c1.c.ORIGIN_URL);
        String str3 = (String) map.get(c1.c.ORIGIN_RESOURCE);
        List list = (List) map.get(c1.c.ORIGIN_COMMENTS);
        return new x1(str, num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1, q0Var, str2, (q0Var == q0.RESOURCE && str3 == null) ? str : str3, list);
    }

    public static ju.m n(Collection<? extends ju.m> collection) {
        if (collection.isEmpty()) {
            throw new ConfigException.BugOrBroken("can't merge empty list of origins");
        }
        if (collection.size() == 1) {
            return collection.iterator().next();
        }
        if (collection.size() == 2) {
            Iterator<? extends ju.m> it = collection.iterator();
            return r((x1) it.next(), (x1) it.next());
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<? extends ju.m> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add((x1) it2.next());
        }
        while (arrayList.size() > 2) {
            x1 x1Var = (x1) arrayList.get(arrayList.size() - 1);
            arrayList.remove(arrayList.size() - 1);
            x1 x1Var2 = (x1) arrayList.get(arrayList.size() - 1);
            arrayList.remove(arrayList.size() - 1);
            x1 x1Var3 = (x1) arrayList.get(arrayList.size() - 1);
            arrayList.remove(arrayList.size() - 1);
            arrayList.add(q(x1Var3, x1Var2, x1Var));
        }
        return n(arrayList);
    }

    public static ju.m o(List<? extends d> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<? extends d> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        return n(arrayList);
    }

    public static ju.m p(ju.m mVar, ju.m mVar2) {
        return r((x1) mVar, (x1) mVar2);
    }

    public static x1 q(x1 x1Var, x1 x1Var2, x1 x1Var3) {
        return A(x1Var, x1Var2) >= A(x1Var2, x1Var3) ? r(r(x1Var, x1Var2), x1Var3) : r(x1Var, r(x1Var2, x1Var3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static x1 r(x1 x1Var, x1 x1Var2) {
        int i11;
        int i12;
        List list;
        q0 q0Var = x1Var.f68875d;
        if (q0Var != x1Var2.f68875d) {
            q0Var = q0.GENERIC;
        }
        q0 q0Var2 = q0Var;
        String str = x1Var.f68872a;
        String str2 = x1Var2.f68872a;
        if (str.startsWith(f68871h)) {
            str = str.substring(9);
        }
        if (str2.startsWith(f68871h)) {
            str2 = str2.substring(9);
        }
        if (str.equals(str2)) {
            int i13 = x1Var.f68873b;
            if (i13 < 0) {
                i13 = x1Var2.f68873b;
            } else {
                int i14 = x1Var2.f68873b;
                if (i14 >= 0) {
                    i13 = Math.min(i13, i14);
                }
            }
            i11 = i13;
            i12 = Math.max(x1Var.f68874c, x1Var2.f68874c);
        } else {
            String description = x1Var.description();
            String description2 = x1Var2.description();
            if (description.startsWith(f68871h)) {
                description = description.substring(9);
            }
            if (description2.startsWith(f68871h)) {
                description2 = description2.substring(9);
            }
            str = f68871h + description + "," + description2;
            i11 = -1;
            i12 = -1;
        }
        String str3 = str;
        String str4 = q.b(x1Var.f68876e, x1Var2.f68876e) ? x1Var.f68876e : null;
        String str5 = q.b(x1Var.f68877f, x1Var2.f68877f) ? x1Var.f68877f : null;
        if (q.b(x1Var.f68878g, x1Var2.f68878g)) {
            list = x1Var.f68878g;
        } else {
            List arrayList = new ArrayList();
            List<String> list2 = x1Var.f68878g;
            if (list2 != null) {
                arrayList.addAll(list2);
            }
            List<String> list3 = x1Var2.f68878g;
            if (list3 != null) {
                arrayList.addAll(list3);
            }
            list = arrayList;
        }
        return new x1(str3, i11, i12, q0Var2, str4, str5, list);
    }

    public static x1 s(String str) {
        return new x1(str, -1, -1, q0.ENV_VARIABLE, null, null, null);
    }

    public static x1 t(String str) {
        String str2;
        try {
            str2 = new File(str).toURI().toURL().toExternalForm();
        } catch (MalformedURLException unused) {
            str2 = null;
        }
        return new x1(str, -1, -1, q0.FILE, str2, null, null);
    }

    public static x1 u(String str) {
        return v(str, null);
    }

    public static x1 v(String str, URL url) {
        String str2;
        if (url != null) {
            str2 = str + " @ " + url.toExternalForm();
        } else {
            str2 = str;
        }
        return new x1(str2, -1, -1, q0.RESOURCE, url != null ? url.toExternalForm() : null, str, null);
    }

    public static x1 w(String str) {
        return new x1(str, -1, -1, q0.GENERIC, null, null, null);
    }

    public static x1 x(URL url) {
        String externalForm = url.toExternalForm();
        return new x1(externalForm, -1, -1, q0.URL, externalForm, null, null);
    }

    public Map<c1.c, Object> B() {
        EnumMap enumMap = new EnumMap(c1.c.class);
        enumMap.put((EnumMap) c1.c.ORIGIN_DESCRIPTION, (c1.c) this.f68872a);
        int i11 = this.f68873b;
        if (i11 >= 0) {
            enumMap.put((EnumMap) c1.c.ORIGIN_LINE_NUMBER, (c1.c) Integer.valueOf(i11));
        }
        int i12 = this.f68874c;
        if (i12 >= 0) {
            enumMap.put((EnumMap) c1.c.ORIGIN_END_LINE_NUMBER, (c1.c) Integer.valueOf(i12));
        }
        enumMap.put((EnumMap) c1.c.ORIGIN_TYPE, (c1.c) Integer.valueOf(this.f68875d.ordinal()));
        String str = this.f68876e;
        if (str != null) {
            enumMap.put((EnumMap) c1.c.ORIGIN_URL, (c1.c) str);
        }
        String str2 = this.f68877f;
        if (str2 != null) {
            enumMap.put((EnumMap) c1.c.ORIGIN_RESOURCE, (c1.c) str2);
        }
        List<String> list = this.f68878g;
        if (list != null) {
            enumMap.put((EnumMap) c1.c.ORIGIN_COMMENTS, (c1.c) list);
        }
        return enumMap;
    }

    public Map<c1.c, Object> C(x1 x1Var) {
        return k(x1Var != null ? x1Var.B() : Collections.EMPTY_MAP, B());
    }

    @Override // ju.m
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public x1 e(List<String> list) {
        return q.b(list, this.f68878g) ? this : new x1(this.f68872a, this.f68873b, this.f68874c, this.f68875d, this.f68876e, this.f68877f, list);
    }

    @Override // ju.m
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public x1 f(int i11) {
        return (i11 == this.f68873b && i11 == this.f68874c) ? this : new x1(this.f68872a, i11, i11, this.f68875d, this.f68876e, this.f68877f, this.f68878g);
    }

    public x1 a(URL url) {
        return new x1(this.f68872a, this.f68873b, this.f68874c, this.f68875d, url != null ? url.toExternalForm() : null, this.f68877f, this.f68878g);
    }

    @Override // ju.m
    public List<String> b() {
        List<String> list = this.f68878g;
        return list != null ? Collections.unmodifiableList(list) : Collections.EMPTY_LIST;
    }

    @Override // ju.m
    public URL c() {
        if (this.f68876e == null) {
            return null;
        }
        try {
            return new URL(this.f68876e);
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    @Override // ju.m
    public String d() {
        if (this.f68875d == q0.FILE) {
            return this.f68872a;
        }
        if (this.f68876e != null) {
            try {
                URL url = new URL(this.f68876e);
                if (url.getProtocol().equals("file")) {
                    return url.getFile();
                }
            } catch (MalformedURLException unused) {
            }
        }
        return null;
    }

    @Override // ju.m
    public String description() {
        int i11 = this.f68873b;
        if (i11 < 0) {
            return this.f68872a;
        }
        if (this.f68874c == i11) {
            return this.f68872a + ": " + this.f68873b;
        }
        return this.f68872a + ": " + this.f68873b + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.f68874c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof x1) {
            x1 x1Var = (x1) obj;
            if (this.f68872a.equals(x1Var.f68872a) && this.f68873b == x1Var.f68873b && this.f68874c == x1Var.f68874c && this.f68875d == x1Var.f68875d && q.b(this.f68876e, x1Var.f68876e) && q.b(this.f68877f, x1Var.f68877f)) {
                return true;
            }
        }
        return false;
    }

    @Override // ju.m
    public int g() {
        return this.f68873b;
    }

    @Override // ju.m
    public String h() {
        return this.f68877f;
    }

    public int hashCode() {
        int hashCode = (((((((this.f68872a.hashCode() + 41) * 41) + this.f68873b) * 41) + this.f68874c) * 41) + this.f68875d.hashCode()) * 41;
        String str = this.f68876e;
        if (str != null) {
            hashCode = (hashCode + str.hashCode()) * 41;
        }
        String str2 = this.f68877f;
        return str2 != null ? (hashCode + str2.hashCode()) * 41 : hashCode;
    }

    public x1 i(List<String> list) {
        if (q.b(list, this.f68878g) || list == null) {
            return this;
        }
        if (this.f68878g == null) {
            return e(list);
        }
        ArrayList arrayList = new ArrayList(list.size() + this.f68878g.size());
        arrayList.addAll(this.f68878g);
        arrayList.addAll(list);
        return e(arrayList);
    }

    public String toString() {
        return "ConfigOrigin(" + this.f68872a + pn.j.f81007d;
    }

    public q0 y() {
        return this.f68875d;
    }

    public x1 z(List<String> list) {
        if (q.b(list, this.f68878g) || list == null) {
            return this;
        }
        if (this.f68878g == null) {
            return e(list);
        }
        ArrayList arrayList = new ArrayList(list.size() + this.f68878g.size());
        arrayList.addAll(list);
        arrayList.addAll(this.f68878g);
        return e(arrayList);
    }
}
