package pk;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class k implements i {

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, List<j>> f80707c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Map<String, String> f80708d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        public static final String f80709d = "User-Agent";

        /* renamed from: e, reason: collision with root package name */
        public static final String f80710e;

        /* renamed from: f, reason: collision with root package name */
        public static final Map<String, List<j>> f80711f;

        /* renamed from: a, reason: collision with root package name */
        public boolean f80712a = true;

        /* renamed from: b, reason: collision with root package name */
        public Map<String, List<j>> f80713b = f80711f;

        /* renamed from: c, reason: collision with root package name */
        public boolean f80714c = true;

        static {
            String g11 = g();
            f80710e = g11;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(g11)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(g11)));
            }
            f80711f = Collections.unmodifiableMap(hashMap);
        }

        @VisibleForTesting
        public static String g() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb2 = new StringBuilder(property.length());
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = property.charAt(i11);
                if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                    sb2.append(charAt);
                } else {
                    sb2.append(s60.d.f88057a);
                }
            }
            return sb2.toString();
        }

        public a a(@NonNull String str, @NonNull String str2) {
            return b(str, new b(str2));
        }

        public a b(@NonNull String str, @NonNull j jVar) {
            if (this.f80714c && "User-Agent".equalsIgnoreCase(str)) {
                return i(str, jVar);
            }
            e();
            f(str).add(jVar);
            return this;
        }

        public k c() {
            this.f80712a = true;
            return new k(this.f80713b);
        }

        public final Map<String, List<j>> d() {
            HashMap hashMap = new HashMap(this.f80713b.size());
            for (Map.Entry<String, List<j>> entry : this.f80713b.entrySet()) {
                hashMap.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
            return hashMap;
        }

        public final void e() {
            if (this.f80712a) {
                this.f80712a = false;
                this.f80713b = d();
            }
        }

        public final List<j> f(String str) {
            List<j> list = this.f80713b.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.f80713b.put(str, arrayList);
            return arrayList;
        }

        public a h(@NonNull String str, @Nullable String str2) {
            return i(str, str2 == null ? null : new b(str2));
        }

        public a i(@NonNull String str, @Nullable j jVar) {
            e();
            if (jVar == null) {
                this.f80713b.remove(str);
            } else {
                List<j> f11 = f(str);
                f11.clear();
                f11.add(jVar);
            }
            if (this.f80714c && "User-Agent".equalsIgnoreCase(str)) {
                this.f80714c = false;
            }
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements j {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public final String f80715a;

        public b(@NonNull String str) {
            this.f80715a = str;
        }

        @Override // pk.j
        public String a() {
            return this.f80715a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f80715a.equals(((b) obj).f80715a);
            }
            return false;
        }

        public int hashCode() {
            return this.f80715a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f80715a + '\'' + l50.b.f69928j;
        }
    }

    public k(Map<String, List<j>> map) {
        this.f80707c = Collections.unmodifiableMap(map);
    }

    @Override // pk.i
    public Map<String, String> a() {
        if (this.f80708d == null) {
            synchronized (this) {
                try {
                    if (this.f80708d == null) {
                        this.f80708d = Collections.unmodifiableMap(c());
                    }
                } finally {
                }
            }
        }
        return this.f80708d;
    }

    @NonNull
    public final String b(@NonNull List<j> list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            String a11 = list.get(i11).a();
            if (!TextUtils.isEmpty(a11)) {
                sb2.append(a11);
                if (i11 != list.size() - 1) {
                    sb2.append(',');
                }
            }
        }
        return sb2.toString();
    }

    public final Map<String, String> c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<j>> entry : this.f80707c.entrySet()) {
            String b11 = b(entry.getValue());
            if (!TextUtils.isEmpty(b11)) {
                hashMap.put(entry.getKey(), b11);
            }
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f80707c.equals(((k) obj).f80707c);
        }
        return false;
    }

    public int hashCode() {
        return this.f80707c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f80707c + l50.b.f69928j;
    }
}
