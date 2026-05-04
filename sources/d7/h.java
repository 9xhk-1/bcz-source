package d7;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f47296a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f47297b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final String f47298c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final String f47299d;

    public h(@m80.k String title, @m80.k String artist, @m80.l String str, @m80.l String str2) {
        g0.p(title, "title");
        g0.p(artist, "artist");
        this.f47296a = title;
        this.f47297b = artist;
        this.f47298c = str;
        this.f47299d = str2;
    }

    public static /* synthetic */ h f(h hVar, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = hVar.f47296a;
        }
        if ((i11 & 2) != 0) {
            str2 = hVar.f47297b;
        }
        if ((i11 & 4) != 0) {
            str3 = hVar.f47298c;
        }
        if ((i11 & 8) != 0) {
            str4 = hVar.f47299d;
        }
        return hVar.e(str, str2, str3, str4);
    }

    @m80.k
    public final String a() {
        return this.f47296a;
    }

    @m80.k
    public final String b() {
        return this.f47297b;
    }

    @m80.l
    public final String c() {
        return this.f47298c;
    }

    @m80.l
    public final String d() {
        return this.f47299d;
    }

    @m80.k
    public final h e(@m80.k String title, @m80.k String artist, @m80.l String str, @m80.l String str2) {
        g0.p(title, "title");
        g0.p(artist, "artist");
        return new h(title, artist, str, str2);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return g0.g(this.f47296a, hVar.f47296a) && g0.g(this.f47297b, hVar.f47297b) && g0.g(this.f47298c, hVar.f47298c) && g0.g(this.f47299d, hVar.f47299d);
    }

    @m80.l
    public final String g() {
        return this.f47298c;
    }

    @m80.k
    public final String h() {
        return this.f47297b;
    }

    public int hashCode() {
        int hashCode = ((this.f47296a.hashCode() * 31) + this.f47297b.hashCode()) * 31;
        String str = this.f47298c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f47299d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @m80.l
    public final String i() {
        return this.f47299d;
    }

    @m80.k
    public final String j() {
        return this.f47296a;
    }

    @m80.k
    public String toString() {
        return "AudioMetadata(title=" + this.f47296a + ", artist=" + this.f47297b + ", albumTitle=" + this.f47298c + ", artworkUrl=" + this.f47299d + ')';
    }

    public /* synthetic */ h(String str, String str2, String str3, String str4, int i11, v vVar) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4);
    }
}
