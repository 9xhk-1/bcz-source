package tj;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final int f90650e = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f90651a;

    /* renamed from: b, reason: collision with root package name */
    public final int f90652b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final String f90653c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final String f90654d;

    public a(@m80.k String name, int i11, @m80.l String str, @m80.l String str2) {
        g0.p(name, "name");
        this.f90651a = name;
        this.f90652b = i11;
        this.f90653c = str;
        this.f90654d = str2;
    }

    public static /* synthetic */ a f(a aVar, String str, int i11, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = aVar.f90651a;
        }
        if ((i12 & 2) != 0) {
            i11 = aVar.f90652b;
        }
        if ((i12 & 4) != 0) {
            str2 = aVar.f90653c;
        }
        if ((i12 & 8) != 0) {
            str3 = aVar.f90654d;
        }
        return aVar.e(str, i11, str2, str3);
    }

    @m80.k
    public final String a() {
        return this.f90651a;
    }

    public final int b() {
        return this.f90652b;
    }

    @m80.l
    public final String c() {
        return this.f90653c;
    }

    @m80.l
    public final String d() {
        return this.f90654d;
    }

    @m80.k
    public final a e(@m80.k String name, int i11, @m80.l String str, @m80.l String str2) {
        g0.p(name, "name");
        return new a(name, i11, str, str2);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g0.g(this.f90651a, aVar.f90651a) && this.f90652b == aVar.f90652b && g0.g(this.f90653c, aVar.f90653c) && g0.g(this.f90654d, aVar.f90654d);
    }

    @m80.l
    public final String g() {
        return this.f90654d;
    }

    @m80.l
    public final String h() {
        return this.f90653c;
    }

    public int hashCode() {
        int hashCode = ((this.f90651a.hashCode() * 31) + Integer.hashCode(this.f90652b)) * 31;
        String str = this.f90653c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f90654d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @m80.k
    public final String i() {
        return this.f90651a;
    }

    public final int j() {
        return this.f90652b;
    }

    @m80.k
    public String toString() {
        return "BookDetailInfo(name=" + this.f90651a + ", wordsCount=" + this.f90652b + ", description=" + this.f90653c + ", coverUrl=" + this.f90654d + pn.j.f81007d;
    }

    public /* synthetic */ a(String str, int i11, String str2, String str3, int i12, kotlin.jvm.internal.v vVar) {
        this(str, i11, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3);
    }
}
