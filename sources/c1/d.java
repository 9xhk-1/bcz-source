package c1;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f7462c = new d("COMPOSITION");

    /* renamed from: a, reason: collision with root package name */
    public final List<String> f7463a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public e f7464b;

    public d(String... strArr) {
        this.f7463a = Arrays.asList(strArr);
    }

    @CheckResult
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public d a(String str) {
        d dVar = new d(this);
        dVar.f7463a.add(str);
        return dVar;
    }

    public final boolean b() {
        return this.f7463a.get(r0.size() - 1).equals("**");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean c(String str, int i11) {
        if (i11 >= this.f7463a.size()) {
            return false;
        }
        boolean z11 = i11 == this.f7463a.size() - 1;
        String str2 = this.f7463a.get(i11);
        if (!str2.equals("**")) {
            return (z11 || (i11 == this.f7463a.size() + (-2) && b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z11 && this.f7463a.get(i11 + 1).equals(str)) {
            return i11 == this.f7463a.size() + (-2) || (i11 == this.f7463a.size() + (-3) && b());
        }
        if (z11) {
            return true;
        }
        int i12 = i11 + 1;
        if (i12 < this.f7463a.size() - 1) {
            return false;
        }
        return this.f7463a.get(i12).equals(str);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public e d() {
        return this.f7464b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int e(String str, int i11) {
        if (f(str)) {
            return 0;
        }
        if (this.f7463a.get(i11).equals("**")) {
            return (i11 != this.f7463a.size() - 1 && this.f7463a.get(i11 + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d dVar = (d) obj;
            if (!this.f7463a.equals(dVar.f7463a)) {
                return false;
            }
            e eVar = this.f7464b;
            e eVar2 = dVar.f7464b;
            if (eVar != null) {
                return eVar.equals(eVar2);
            }
            if (eVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(String str) {
        return "__container".equals(str);
    }

    public String g() {
        return this.f7463a.toString();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean h(String str, int i11) {
        if (f(str)) {
            return true;
        }
        if (i11 >= this.f7463a.size()) {
            return false;
        }
        return this.f7463a.get(i11).equals(str) || this.f7463a.get(i11).equals("**") || this.f7463a.get(i11).equals("*");
    }

    public int hashCode() {
        int hashCode = this.f7463a.hashCode() * 31;
        e eVar = this.f7464b;
        return hashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean i(String str, int i11) {
        return "__container".equals(str) || i11 < this.f7463a.size() - 1 || this.f7463a.get(i11).equals("**");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public d j(e eVar) {
        d dVar = new d(this);
        dVar.f7464b = eVar;
        return dVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KeyPath{keys=");
        sb2.append(this.f7463a);
        sb2.append(",resolved=");
        sb2.append(this.f7464b != null);
        sb2.append(l50.b.f69928j);
        return sb2.toString();
    }

    public d(d dVar) {
        this.f7463a = new ArrayList(dVar.f7463a);
        this.f7464b = dVar.f7464b;
    }
}
