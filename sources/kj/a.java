package kj;

import a00.h0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@Entity(tableName = "word_books")
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final C0773a f66594g = new C0773a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f66595h = 8;

    /* renamed from: a, reason: collision with root package name */
    @PrimaryKey
    public final long f66596a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f66597b;

    /* renamed from: c, reason: collision with root package name */
    public final int f66598c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f66599d;

    /* renamed from: e, reason: collision with root package name */
    public final long f66600e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<Integer> f66601f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: kj.a$a, reason: collision with other inner class name */
    public static final class C0773a {
        public /* synthetic */ C0773a(v vVar) {
            this();
        }

        @k
        public final a a(int i11) {
            return new a(0L, ij.c.f60622a, i11, "", System.currentTimeMillis(), null, 32, null);
        }

        public C0773a() {
        }
    }

    public a(long j11, @k String name, int i11, @k String cover, long j12, @k List<Integer> tags) {
        g0.p(name, "name");
        g0.p(cover, "cover");
        g0.p(tags, "tags");
        this.f66596a = j11;
        this.f66597b = name;
        this.f66598c = i11;
        this.f66599d = cover;
        this.f66600e = j12;
        this.f66601f = tags;
    }

    public static /* synthetic */ a h(a aVar, long j11, String str, int i11, String str2, long j12, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = aVar.f66596a;
        }
        long j13 = j11;
        if ((i12 & 2) != 0) {
            str = aVar.f66597b;
        }
        String str3 = str;
        if ((i12 & 4) != 0) {
            i11 = aVar.f66598c;
        }
        int i13 = i11;
        if ((i12 & 8) != 0) {
            str2 = aVar.f66599d;
        }
        return aVar.g(j13, str3, i13, str2, (i12 & 16) != 0 ? aVar.f66600e : j12, (i12 & 32) != 0 ? aVar.f66601f : list);
    }

    public final long a() {
        return this.f66596a;
    }

    @k
    public final String b() {
        return this.f66597b;
    }

    public final int c() {
        return this.f66598c;
    }

    @k
    public final String d() {
        return this.f66599d;
    }

    public final long e() {
        return this.f66600e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f66596a == aVar.f66596a && g0.g(this.f66597b, aVar.f66597b) && this.f66598c == aVar.f66598c && g0.g(this.f66599d, aVar.f66599d) && this.f66600e == aVar.f66600e && g0.g(this.f66601f, aVar.f66601f);
    }

    @k
    public final List<Integer> f() {
        return this.f66601f;
    }

    @k
    public final a g(long j11, @k String name, int i11, @k String cover, long j12, @k List<Integer> tags) {
        g0.p(name, "name");
        g0.p(cover, "cover");
        g0.p(tags, "tags");
        return new a(j11, name, i11, cover, j12, tags);
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.f66596a) * 31) + this.f66597b.hashCode()) * 31) + Integer.hashCode(this.f66598c)) * 31) + this.f66599d.hashCode()) * 31) + Long.hashCode(this.f66600e)) * 31) + this.f66601f.hashCode();
    }

    @k
    public final String i() {
        return this.f66599d;
    }

    public final long j() {
        return this.f66596a;
    }

    @k
    public final String k() {
        return this.f66597b;
    }

    @k
    public final List<Integer> l() {
        return this.f66601f;
    }

    public final long m() {
        return this.f66600e;
    }

    public final int n() {
        return this.f66598c;
    }

    public final boolean o() {
        return this.f66596a == 0;
    }

    @k
    public String toString() {
        return "WordBookItem(id=" + this.f66596a + ", name=" + this.f66597b + ", wordCount=" + this.f66598c + ", cover=" + this.f66599d + ", updatedAt=" + this.f66600e + ", tags=" + this.f66601f + j.f81007d;
    }

    public /* synthetic */ a(long j11, String str, int i11, String str2, long j12, List list, int i12, v vVar) {
        this(j11, str, i11, str2, j12, (i12 & 32) != 0 ? h0.J() : list);
    }
}
