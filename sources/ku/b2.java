package ku;

import com.typesafe.config.ConfigException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class b2 {

    /* renamed from: a, reason: collision with root package name */
    public final c2 f68616a;

    /* renamed from: b, reason: collision with root package name */
    public final String f68617b;

    /* renamed from: c, reason: collision with root package name */
    public final ju.m f68618c;

    /* renamed from: d, reason: collision with root package name */
    public final String f68619d;

    public b2(c2 c2Var, ju.m mVar) {
        this(c2Var, mVar, null);
    }

    public static b2 c(c2 c2Var, String str, String str2) {
        return new b2(c2Var, null, str2, str);
    }

    public boolean a(Object obj) {
        return obj instanceof b2;
    }

    public final int b() {
        ju.m mVar = this.f68618c;
        if (mVar != null) {
            return mVar.g();
        }
        return -1;
    }

    public final ju.m d() {
        ju.m mVar = this.f68618c;
        if (mVar != null) {
            return mVar;
        }
        throw new ConfigException.BugOrBroken("tried to get origin from token that doesn't have one: " + this);
    }

    public String e() {
        return this.f68619d;
    }

    public boolean equals(Object obj) {
        return (obj instanceof b2) && a(obj) && this.f68616a == ((b2) obj).f68616a;
    }

    public final c2 f() {
        return this.f68616a;
    }

    public int hashCode() {
        return this.f68616a.hashCode();
    }

    public String toString() {
        String str = this.f68617b;
        return str != null ? str : this.f68616a.name();
    }

    public b2(c2 c2Var, ju.m mVar, String str) {
        this(c2Var, mVar, str, null);
    }

    public b2(c2 c2Var, ju.m mVar, String str, String str2) {
        this.f68616a = c2Var;
        this.f68618c = mVar;
        this.f68617b = str2;
        this.f68619d = str;
    }
}
