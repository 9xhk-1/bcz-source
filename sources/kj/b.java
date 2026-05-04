package kj;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@Entity(tableName = "word_favorites")
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: j, reason: collision with root package name */
    public static final int f66602j = 8;

    /* renamed from: a, reason: collision with root package name */
    @PrimaryKey
    public final long f66603a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Set<Long> f66604b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Map<Long, Long> f66605c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<Long, Integer> f66606d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f66607e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f66608f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f66609g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f66610h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f66611i;

    public b(long j11, @k Set<Long> bookIds, @k Map<Long, Long> createdAts, @k Map<Long, Integer> scores, @k String word, @k String meaning, @l String str, @l String str2, @l String str3) {
        g0.p(bookIds, "bookIds");
        g0.p(createdAts, "createdAts");
        g0.p(scores, "scores");
        g0.p(word, "word");
        g0.p(meaning, "meaning");
        this.f66603a = j11;
        this.f66604b = bookIds;
        this.f66605c = createdAts;
        this.f66606d = scores;
        this.f66607e = word;
        this.f66608f = meaning;
        this.f66609g = str;
        this.f66610h = str2;
        this.f66611i = str3;
    }

    public static /* synthetic */ b l(b bVar, long j11, Set set, Map map, Map map2, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = bVar.f66603a;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            set = bVar.f66604b;
        }
        Set set2 = set;
        if ((i11 & 4) != 0) {
            map = bVar.f66605c;
        }
        return bVar.j(j12, set2, map, (i11 & 8) != 0 ? bVar.f66606d : map2, (i11 & 16) != 0 ? bVar.f66607e : str, (i11 & 32) != 0 ? bVar.f66608f : str2, (i11 & 64) != 0 ? bVar.f66609g : str3, (i11 & 128) != 0 ? bVar.f66610h : str4, (i11 & 256) != 0 ? bVar.f66611i : str5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b m(b bVar, Set set, Map map, Map map2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            set = bVar.f66604b;
        }
        if ((i11 & 2) != 0) {
            map = bVar.f66605c;
        }
        if ((i11 & 4) != 0) {
            map2 = bVar.f66606d;
        }
        return bVar.k(set, map, map2);
    }

    public final long a() {
        return this.f66603a;
    }

    @k
    public final Set<Long> b() {
        return this.f66604b;
    }

    @k
    public final Map<Long, Long> c() {
        return this.f66605c;
    }

    @k
    public final Map<Long, Integer> d() {
        return this.f66606d;
    }

    @k
    public final String e() {
        return this.f66607e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f66603a == bVar.f66603a && g0.g(this.f66604b, bVar.f66604b) && g0.g(this.f66605c, bVar.f66605c) && g0.g(this.f66606d, bVar.f66606d) && g0.g(this.f66607e, bVar.f66607e) && g0.g(this.f66608f, bVar.f66608f) && g0.g(this.f66609g, bVar.f66609g) && g0.g(this.f66610h, bVar.f66610h) && g0.g(this.f66611i, bVar.f66611i);
    }

    @k
    public final String f() {
        return this.f66608f;
    }

    @l
    public final String g() {
        return this.f66609g;
    }

    @l
    public final String h() {
        return this.f66610h;
    }

    public int hashCode() {
        int hashCode = ((((((((((Long.hashCode(this.f66603a) * 31) + this.f66604b.hashCode()) * 31) + this.f66605c.hashCode()) * 31) + this.f66606d.hashCode()) * 31) + this.f66607e.hashCode()) * 31) + this.f66608f.hashCode()) * 31;
        String str = this.f66609g;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f66610h;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f66611i;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @l
    public final String i() {
        return this.f66611i;
    }

    @k
    public final b j(long j11, @k Set<Long> bookIds, @k Map<Long, Long> createdAts, @k Map<Long, Integer> scores, @k String word, @k String meaning, @l String str, @l String str2, @l String str3) {
        g0.p(bookIds, "bookIds");
        g0.p(createdAts, "createdAts");
        g0.p(scores, "scores");
        g0.p(word, "word");
        g0.p(meaning, "meaning");
        return new b(j11, bookIds, createdAts, scores, word, meaning, str, str2, str3);
    }

    @k
    public final b k(@k Set<Long> bookIds, @k Map<Long, Long> createdAts, @k Map<Long, Integer> scores) {
        g0.p(bookIds, "bookIds");
        g0.p(createdAts, "createdAts");
        g0.p(scores, "scores");
        return new b(this.f66603a, bookIds, createdAts, scores, this.f66607e, this.f66608f, this.f66609g, this.f66610h, this.f66611i);
    }

    @l
    public final String n() {
        return this.f66609g;
    }

    @l
    public final String o() {
        return this.f66611i;
    }

    @l
    public final String p() {
        return this.f66610h;
    }

    @k
    public final Set<Long> q() {
        return this.f66604b;
    }

    @k
    public final Map<Long, Long> r() {
        return this.f66605c;
    }

    @k
    public final String s() {
        return this.f66608f;
    }

    @k
    public final Map<Long, Integer> t() {
        return this.f66606d;
    }

    @k
    public String toString() {
        return "WordFavoriteItem(universeTopicId=" + this.f66603a + ", bookIds=" + this.f66604b + ", createdAts=" + this.f66605c + ", scores=" + this.f66606d + ", word=" + this.f66607e + ", meaning=" + this.f66608f + ", accent=" + this.f66609g + ", audioUS=" + this.f66610h + ", audioUK=" + this.f66611i + j.f81007d;
    }

    public final long u() {
        return this.f66603a;
    }

    @k
    public final String v() {
        return this.f66607e;
    }
}
