package si;

import a00.h0;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: j, reason: collision with root package name */
    public static final int f88706j = 8;

    /* renamed from: a, reason: collision with root package name */
    public final int f88707a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f88708b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f88709c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f88710d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f88711e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f88712f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<b> f88713g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final List<String> f88714h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final a f88715i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        public static final int f88716d = 0;

        /* renamed from: a, reason: collision with root package name */
        public final int f88717a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f88718b;

        /* renamed from: c, reason: collision with root package name */
        public final int f88719c;

        public a(int i11, @k String examName, int i12) {
            g0.p(examName, "examName");
            this.f88717a = i11;
            this.f88718b = examName;
            this.f88719c = i12;
        }

        public static /* synthetic */ a e(a aVar, int i11, String str, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = aVar.f88717a;
            }
            if ((i13 & 2) != 0) {
                str = aVar.f88718b;
            }
            if ((i13 & 4) != 0) {
                i12 = aVar.f88719c;
            }
            return aVar.d(i11, str, i12);
        }

        public final int a() {
            return this.f88717a;
        }

        @k
        public final String b() {
            return this.f88718b;
        }

        public final int c() {
            return this.f88719c;
        }

        @k
        public final a d(int i11, @k String examName, int i12) {
            g0.p(examName, "examName");
            return new a(i11, examName, i12);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f88717a == aVar.f88717a && g0.g(this.f88718b, aVar.f88718b) && this.f88719c == aVar.f88719c;
        }

        @k
        public final String f() {
            return this.f88718b;
        }

        public final int g() {
            return this.f88719c;
        }

        public final int h() {
            return this.f88717a;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f88717a) * 31) + this.f88718b.hashCode()) * 31) + Integer.hashCode(this.f88719c);
        }

        @k
        public String toString() {
            return "ExamInfo(recent=" + this.f88717a + ", examName=" + this.f88718b + ", nums=" + this.f88719c + j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final int f88720c = 0;

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f88721a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f88722b;

        public b(@k String meanType, @k String mean) {
            g0.p(meanType, "meanType");
            g0.p(mean, "mean");
            this.f88721a = meanType;
            this.f88722b = mean;
        }

        public static /* synthetic */ b d(b bVar, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bVar.f88721a;
            }
            if ((i11 & 2) != 0) {
                str2 = bVar.f88722b;
            }
            return bVar.c(str, str2);
        }

        @k
        public final String a() {
            return this.f88721a;
        }

        @k
        public final String b() {
            return this.f88722b;
        }

        @k
        public final b c(@k String meanType, @k String mean) {
            g0.p(meanType, "meanType");
            g0.p(mean, "mean");
            return new b(meanType, mean);
        }

        @k
        public final String e() {
            return this.f88722b;
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return g0.g(this.f88721a, bVar.f88721a) && g0.g(this.f88722b, bVar.f88722b);
        }

        @k
        public final String f() {
            return this.f88721a;
        }

        public int hashCode() {
            return (this.f88721a.hashCode() * 31) + this.f88722b.hashCode();
        }

        @k
        public String toString() {
            return "WordMeaning(meanType=" + this.f88721a + ", mean=" + this.f88722b + j.f81007d;
        }
    }

    public c(int i11, @k String word, @l String str, @l String str2, @l String str3, @l String str4, @k List<b> meanings, @k List<String> applicableScopes, @l a aVar) {
        g0.p(word, "word");
        g0.p(meanings, "meanings");
        g0.p(applicableScopes, "applicableScopes");
        this.f88707a = i11;
        this.f88708b = word;
        this.f88709c = str;
        this.f88710d = str2;
        this.f88711e = str3;
        this.f88712f = str4;
        this.f88713g = meanings;
        this.f88714h = applicableScopes;
        this.f88715i = aVar;
    }

    public static /* synthetic */ c k(c cVar, int i11, String str, String str2, String str3, String str4, String str5, List list, List list2, a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = cVar.f88707a;
        }
        if ((i12 & 2) != 0) {
            str = cVar.f88708b;
        }
        if ((i12 & 4) != 0) {
            str2 = cVar.f88709c;
        }
        if ((i12 & 8) != 0) {
            str3 = cVar.f88710d;
        }
        if ((i12 & 16) != 0) {
            str4 = cVar.f88711e;
        }
        if ((i12 & 32) != 0) {
            str5 = cVar.f88712f;
        }
        if ((i12 & 64) != 0) {
            list = cVar.f88713g;
        }
        if ((i12 & 128) != 0) {
            list2 = cVar.f88714h;
        }
        if ((i12 & 256) != 0) {
            aVar = cVar.f88715i;
        }
        List list3 = list2;
        a aVar2 = aVar;
        String str6 = str5;
        List list4 = list;
        String str7 = str4;
        String str8 = str2;
        return cVar.j(i11, str, str8, str3, str7, str6, list4, list3, aVar2);
    }

    public final int a() {
        return this.f88707a;
    }

    @k
    public final String b() {
        return this.f88708b;
    }

    @l
    public final String c() {
        return this.f88709c;
    }

    @l
    public final String d() {
        return this.f88710d;
    }

    @l
    public final String e() {
        return this.f88711e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f88707a == cVar.f88707a && g0.g(this.f88708b, cVar.f88708b) && g0.g(this.f88709c, cVar.f88709c) && g0.g(this.f88710d, cVar.f88710d) && g0.g(this.f88711e, cVar.f88711e) && g0.g(this.f88712f, cVar.f88712f) && g0.g(this.f88713g, cVar.f88713g) && g0.g(this.f88714h, cVar.f88714h) && g0.g(this.f88715i, cVar.f88715i);
    }

    @l
    public final String f() {
        return this.f88712f;
    }

    @k
    public final List<b> g() {
        return this.f88713g;
    }

    @k
    public final List<String> h() {
        return this.f88714h;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f88707a) * 31) + this.f88708b.hashCode()) * 31;
        String str = this.f88709c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f88710d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f88711e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f88712f;
        int hashCode5 = (((((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f88713g.hashCode()) * 31) + this.f88714h.hashCode()) * 31;
        a aVar = this.f88715i;
        return hashCode5 + (aVar != null ? aVar.hashCode() : 0);
    }

    @l
    public final a i() {
        return this.f88715i;
    }

    @k
    public final c j(int i11, @k String word, @l String str, @l String str2, @l String str3, @l String str4, @k List<b> meanings, @k List<String> applicableScopes, @l a aVar) {
        g0.p(word, "word");
        g0.p(meanings, "meanings");
        g0.p(applicableScopes, "applicableScopes");
        return new c(i11, word, str, str2, str3, str4, meanings, applicableScopes, aVar);
    }

    @k
    public final List<String> l() {
        return this.f88714h;
    }

    @l
    public final String m() {
        return this.f88712f;
    }

    @l
    public final String n() {
        return this.f88711e;
    }

    @l
    public final a o() {
        return this.f88715i;
    }

    @k
    public final List<b> p() {
        return this.f88713g;
    }

    @l
    public final String q() {
        return this.f88710d;
    }

    @l
    public final String r() {
        return this.f88709c;
    }

    public final int s() {
        return this.f88707a;
    }

    @k
    public final String t() {
        return this.f88708b;
    }

    @k
    public String toString() {
        return "WikiSceneWordInfo(topicId=" + this.f88707a + ", word=" + this.f88708b + ", phoneticUs=" + this.f88709c + ", phoneticUk=" + this.f88710d + ", audioUs=" + this.f88711e + ", audioUk=" + this.f88712f + ", meanings=" + this.f88713g + ", applicableScopes=" + this.f88714h + ", examInfo=" + this.f88715i + j.f81007d;
    }

    public /* synthetic */ c(int i11, String str, String str2, String str3, String str4, String str5, List list, List list2, a aVar, int i12, v vVar) {
        this(i11, str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : str5, (i12 & 64) != 0 ? h0.J() : list, (i12 & 128) != 0 ? h0.J() : list2, (i12 & 256) != 0 ? null : aVar);
    }
}
