package k3;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f65728a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65729b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final e3[] f65730c;

    public z(@m80.k String name, @m80.k String tag, @m80.k e3[] subCategorys) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(tag, "tag");
        kotlin.jvm.internal.g0.p(subCategorys, "subCategorys");
        this.f65728a = name;
        this.f65729b = tag;
        this.f65730c = subCategorys;
    }

    public static /* synthetic */ z e(z zVar, String str, String str2, e3[] e3VarArr, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = zVar.f65728a;
        }
        if ((i11 & 2) != 0) {
            str2 = zVar.f65729b;
        }
        if ((i11 & 4) != 0) {
            e3VarArr = zVar.f65730c;
        }
        return zVar.d(str, str2, e3VarArr);
    }

    @m80.k
    public final String a() {
        return this.f65728a;
    }

    @m80.k
    public final String b() {
        return this.f65729b;
    }

    @m80.k
    public final e3[] c() {
        return this.f65730c;
    }

    @m80.k
    public final z d(@m80.k String name, @m80.k String tag, @m80.k e3[] subCategorys) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(tag, "tag");
        kotlin.jvm.internal.g0.p(subCategorys, "subCategorys");
        return new z(name, tag, subCategorys);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return kotlin.jvm.internal.g0.g(this.f65728a, zVar.f65728a) && kotlin.jvm.internal.g0.g(this.f65729b, zVar.f65729b) && Arrays.equals(this.f65730c, zVar.f65730c);
    }

    @m80.k
    public final String f() {
        return this.f65728a;
    }

    @m80.k
    public final e3[] g() {
        return this.f65730c;
    }

    @m80.k
    public final String h() {
        return this.f65729b;
    }

    public int hashCode() {
        return (((this.f65728a.hashCode() * 31) + this.f65729b.hashCode()) * 31) + Arrays.hashCode(this.f65730c);
    }

    @m80.k
    public String toString() {
        return "Category(name=" + this.f65728a + ", tag=" + this.f65729b + ", subCategorys=" + Arrays.toString(this.f65730c) + ')';
    }
}
