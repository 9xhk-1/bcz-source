package k3;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class o1 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends o1 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final j4[] f65479a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k j4[] antonyms) {
            super(null);
            kotlin.jvm.internal.g0.p(antonyms, "antonyms");
            this.f65479a = antonyms;
        }

        public static /* synthetic */ a c(a aVar, j4[] j4VarArr, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j4VarArr = aVar.f65479a;
            }
            return aVar.b(j4VarArr);
        }

        @m80.k
        public final j4[] a() {
            return this.f65479a;
        }

        @m80.k
        public final a b(@m80.k j4[] antonyms) {
            kotlin.jvm.internal.g0.p(antonyms, "antonyms");
            return new a(antonyms);
        }

        @m80.k
        public final j4[] d() {
            return this.f65479a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Arrays.equals(this.f65479a, ((a) obj).f65479a);
        }

        public int hashCode() {
            return Arrays.hashCode(this.f65479a);
        }

        @m80.k
        public String toString() {
            return "AntInfo(antonyms=" + Arrays.toString(this.f65479a) + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends o1 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f65490a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@m80.k String etymon) {
            super(null);
            kotlin.jvm.internal.g0.p(etymon, "etymon");
            this.f65490a = etymon;
        }

        @m80.k
        public final String a() {
            return this.f65490a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends o1 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final s2 f65491a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@m80.k s2 sentence) {
            super(null);
            kotlin.jvm.internal.g0.p(sentence, "sentence");
            this.f65491a = sentence;
        }

        public static /* synthetic */ d c(d dVar, s2 s2Var, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                s2Var = dVar.f65491a;
            }
            return dVar.b(s2Var);
        }

        @m80.k
        public final s2 a() {
            return this.f65491a;
        }

        @m80.k
        public final d b(@m80.k s2 sentence) {
            kotlin.jvm.internal.g0.p(sentence, "sentence");
            return new d(sentence);
        }

        @m80.k
        public final s2 d() {
            return this.f65491a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.g0.g(this.f65491a, ((d) obj).f65491a);
        }

        public int hashCode() {
            return this.f65491a.hashCode();
        }

        @m80.k
        public String toString() {
            return "IllustratedSentenceInfo(sentence=" + this.f65491a + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends o1 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final b2[] f65492a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@m80.k b2[] items) {
            super(null);
            kotlin.jvm.internal.g0.p(items, "items");
            this.f65492a = items;
        }

        public static /* synthetic */ e c(e eVar, b2[] b2VarArr, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                b2VarArr = eVar.f65492a;
            }
            return eVar.b(b2VarArr);
        }

        @m80.k
        public final b2[] a() {
            return this.f65492a;
        }

        @m80.k
        public final e b(@m80.k b2[] items) {
            kotlin.jvm.internal.g0.p(items, "items");
            return new e(items);
        }

        @m80.k
        public final b2[] d() {
            return this.f65492a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Arrays.equals(this.f65492a, ((e) obj).f65492a);
        }

        public int hashCode() {
            return Arrays.hashCode(this.f65492a);
        }

        @m80.k
        public String toString() {
            return "ParaphrasesCN(items=" + Arrays.toString(this.f65492a) + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f extends o1 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final b2[] f65493a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@m80.k b2[] items) {
            super(null);
            kotlin.jvm.internal.g0.p(items, "items");
            this.f65493a = items;
        }

        public static /* synthetic */ f c(f fVar, b2[] b2VarArr, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                b2VarArr = fVar.f65493a;
            }
            return fVar.b(b2VarArr);
        }

        @m80.k
        public final b2[] a() {
            return this.f65493a;
        }

        @m80.k
        public final f b(@m80.k b2[] items) {
            kotlin.jvm.internal.g0.p(items, "items");
            return new f(items);
        }

        @m80.k
        public final b2[] d() {
            return this.f65493a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Arrays.equals(this.f65493a, ((f) obj).f65493a);
        }

        public int hashCode() {
            return Arrays.hashCode(this.f65493a);
        }

        @m80.k
        public String toString() {
            return "ParaphrasesEN(items=" + Arrays.toString(this.f65493a) + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g extends o1 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final c2[] f65494a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(@m80.k c2[] phrases) {
            super(null);
            kotlin.jvm.internal.g0.p(phrases, "phrases");
            this.f65494a = phrases;
        }

        public static /* synthetic */ g c(g gVar, c2[] c2VarArr, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                c2VarArr = gVar.f65494a;
            }
            return gVar.b(c2VarArr);
        }

        @m80.k
        public final c2[] a() {
            return this.f65494a;
        }

        @m80.k
        public final g b(@m80.k c2[] phrases) {
            kotlin.jvm.internal.g0.p(phrases, "phrases");
            return new g(phrases);
        }

        @m80.k
        public final c2[] d() {
            return this.f65494a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Arrays.equals(this.f65494a, ((g) obj).f65494a);
        }

        public int hashCode() {
            return Arrays.hashCode(this.f65494a);
        }

        @m80.k
        public String toString() {
            return "PhrasesInfo(phrases=" + Arrays.toString(this.f65494a) + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h extends o1 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final j4[] f65495a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(@m80.k j4[] similars) {
            super(null);
            kotlin.jvm.internal.g0.p(similars, "similars");
            this.f65495a = similars;
        }

        public static /* synthetic */ h c(h hVar, j4[] j4VarArr, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j4VarArr = hVar.f65495a;
            }
            return hVar.b(j4VarArr);
        }

        @m80.k
        public final j4[] a() {
            return this.f65495a;
        }

        @m80.k
        public final h b(@m80.k j4[] similars) {
            kotlin.jvm.internal.g0.p(similars, "similars");
            return new h(similars);
        }

        @m80.k
        public final j4[] d() {
            return this.f65495a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && Arrays.equals(this.f65495a, ((h) obj).f65495a);
        }

        public int hashCode() {
            return Arrays.hashCode(this.f65495a);
        }

        @m80.k
        public String toString() {
            return "SimilarInfo(similars=" + Arrays.toString(this.f65495a) + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i extends o1 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final j4[] f65496a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(@m80.k j4[] synonyms) {
            super(null);
            kotlin.jvm.internal.g0.p(synonyms, "synonyms");
            this.f65496a = synonyms;
        }

        public static /* synthetic */ i c(i iVar, j4[] j4VarArr, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j4VarArr = iVar.f65496a;
            }
            return iVar.b(j4VarArr);
        }

        @m80.k
        public final j4[] a() {
            return this.f65496a;
        }

        @m80.k
        public final i b(@m80.k j4[] synonyms) {
            kotlin.jvm.internal.g0.p(synonyms, "synonyms");
            return new i(synonyms);
        }

        @m80.k
        public final j4[] d() {
            return this.f65496a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && Arrays.equals(this.f65496a, ((i) obj).f65496a);
        }

        public int hashCode() {
            return Arrays.hashCode(this.f65496a);
        }

        @m80.k
        public String toString() {
            return "SynInfo(synonyms=" + Arrays.toString(this.f65496a) + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j extends o1 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f65497a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(@m80.k String url) {
            super(null);
            kotlin.jvm.internal.g0.p(url, "url");
            this.f65497a = url;
        }

        @m80.k
        public final String a() {
            return this.f65497a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k extends o1 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f65498a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final i4[] f65499b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(@m80.k String word, @m80.k i4[] wordDeforms) {
            super(null);
            kotlin.jvm.internal.g0.p(word, "word");
            kotlin.jvm.internal.g0.p(wordDeforms, "wordDeforms");
            this.f65498a = word;
            this.f65499b = wordDeforms;
        }

        public static /* synthetic */ k d(k kVar, String str, i4[] i4VarArr, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = kVar.f65498a;
            }
            if ((i11 & 2) != 0) {
                i4VarArr = kVar.f65499b;
            }
            return kVar.c(str, i4VarArr);
        }

        @m80.k
        public final String a() {
            return this.f65498a;
        }

        @m80.k
        public final i4[] b() {
            return this.f65499b;
        }

        @m80.k
        public final k c(@m80.k String word, @m80.k i4[] wordDeforms) {
            kotlin.jvm.internal.g0.p(word, "word");
            kotlin.jvm.internal.g0.p(wordDeforms, "wordDeforms");
            return new k(word, wordDeforms);
        }

        @m80.k
        public final String e() {
            return this.f65498a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return kotlin.jvm.internal.g0.g(this.f65498a, kVar.f65498a) && Arrays.equals(this.f65499b, kVar.f65499b);
        }

        @m80.k
        public final i4[] f() {
            return this.f65499b;
        }

        public int hashCode() {
            return (this.f65498a.hashCode() * 31) + Arrays.hashCode(this.f65499b);
        }

        @m80.k
        public String toString() {
            return "WordVariations(word=" + this.f65498a + ", wordDeforms=" + Arrays.toString(this.f65499b) + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class l extends o1 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f65500a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f65501b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(@m80.k String snapshot, @m80.k String videoUrl) {
            super(null);
            kotlin.jvm.internal.g0.p(snapshot, "snapshot");
            kotlin.jvm.internal.g0.p(videoUrl, "videoUrl");
            this.f65500a = snapshot;
            this.f65501b = videoUrl;
        }

        public static /* synthetic */ l d(l lVar, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = lVar.f65500a;
            }
            if ((i11 & 2) != 0) {
                str2 = lVar.f65501b;
            }
            return lVar.c(str, str2);
        }

        @m80.k
        public final String a() {
            return this.f65500a;
        }

        @m80.k
        public final String b() {
            return this.f65501b;
        }

        @m80.k
        public final l c(@m80.k String snapshot, @m80.k String videoUrl) {
            kotlin.jvm.internal.g0.p(snapshot, "snapshot");
            kotlin.jvm.internal.g0.p(videoUrl, "videoUrl");
            return new l(snapshot, videoUrl);
        }

        @m80.k
        public final String e() {
            return this.f65500a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return kotlin.jvm.internal.g0.g(this.f65500a, lVar.f65500a) && kotlin.jvm.internal.g0.g(this.f65501b, lVar.f65501b);
        }

        @m80.k
        public final String f() {
            return this.f65501b;
        }

        public int hashCode() {
            return (this.f65500a.hashCode() * 31) + this.f65501b.hashCode();
        }

        @m80.k
        public String toString() {
            return "WordVideoInfo(snapshot=" + this.f65500a + ", videoUrl=" + this.f65501b + ')';
        }
    }

    public /* synthetic */ o1(kotlin.jvm.internal.v vVar) {
        this();
    }

    public o1() {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends o1 {

        /* renamed from: a, reason: collision with root package name */
        public final int f65480a;

        /* renamed from: b, reason: collision with root package name */
        public final int f65481b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f65482c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public final String f65483d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public final String f65484e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public final u1 f65485f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public final String f65486g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public final String f65487h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public final String f65488i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f65489j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i11, int i12, @m80.k String word, @m80.l String str, @m80.l String str2, @m80.l u1 u1Var, @m80.l String str3, @m80.l String str4, @m80.l String str5, boolean z11) {
            super(null);
            kotlin.jvm.internal.g0.p(word, "word");
            this.f65480a = i11;
            this.f65481b = i12;
            this.f65482c = word;
            this.f65483d = str;
            this.f65484e = str2;
            this.f65485f = u1Var;
            this.f65486g = str3;
            this.f65487h = str4;
            this.f65488i = str5;
            this.f65489j = z11;
        }

        public static /* synthetic */ b l(b bVar, int i11, int i12, String str, String str2, String str3, u1 u1Var, String str4, String str5, String str6, boolean z11, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = bVar.f65480a;
            }
            if ((i13 & 2) != 0) {
                i12 = bVar.f65481b;
            }
            if ((i13 & 4) != 0) {
                str = bVar.f65482c;
            }
            if ((i13 & 8) != 0) {
                str2 = bVar.f65483d;
            }
            if ((i13 & 16) != 0) {
                str3 = bVar.f65484e;
            }
            if ((i13 & 32) != 0) {
                u1Var = bVar.f65485f;
            }
            if ((i13 & 64) != 0) {
                str4 = bVar.f65486g;
            }
            if ((i13 & 128) != 0) {
                str5 = bVar.f65487h;
            }
            if ((i13 & 256) != 0) {
                str6 = bVar.f65488i;
            }
            if ((i13 & 512) != 0) {
                z11 = bVar.f65489j;
            }
            String str7 = str6;
            boolean z12 = z11;
            String str8 = str4;
            String str9 = str5;
            String str10 = str3;
            u1 u1Var2 = u1Var;
            return bVar.k(i11, i12, str, str2, str10, u1Var2, str8, str9, str7, z12);
        }

        public final int a() {
            return this.f65480a;
        }

        public final boolean b() {
            return this.f65489j;
        }

        public final int c() {
            return this.f65481b;
        }

        @m80.k
        public final String d() {
            return this.f65482c;
        }

        @m80.l
        public final String e() {
            return this.f65483d;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f65480a == bVar.f65480a && this.f65481b == bVar.f65481b && kotlin.jvm.internal.g0.g(this.f65482c, bVar.f65482c) && kotlin.jvm.internal.g0.g(this.f65483d, bVar.f65483d) && kotlin.jvm.internal.g0.g(this.f65484e, bVar.f65484e) && kotlin.jvm.internal.g0.g(this.f65485f, bVar.f65485f) && kotlin.jvm.internal.g0.g(this.f65486g, bVar.f65486g) && kotlin.jvm.internal.g0.g(this.f65487h, bVar.f65487h) && kotlin.jvm.internal.g0.g(this.f65488i, bVar.f65488i) && this.f65489j == bVar.f65489j;
        }

        @m80.l
        public final String f() {
            return this.f65484e;
        }

        @m80.l
        public final u1 g() {
            return this.f65485f;
        }

        @m80.l
        public final String h() {
            return this.f65486g;
        }

        public int hashCode() {
            int hashCode = ((((Integer.hashCode(this.f65480a) * 31) + Integer.hashCode(this.f65481b)) * 31) + this.f65482c.hashCode()) * 31;
            String str = this.f65483d;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f65484e;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            u1 u1Var = this.f65485f;
            int hashCode4 = (hashCode3 + (u1Var == null ? 0 : u1Var.hashCode())) * 31;
            String str3 = this.f65486g;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f65487h;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f65488i;
            return ((hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31) + Boolean.hashCode(this.f65489j);
        }

        @m80.l
        public final String i() {
            return this.f65487h;
        }

        @m80.l
        public final String j() {
            return this.f65488i;
        }

        @m80.k
        public final b k(int i11, int i12, @m80.k String word, @m80.l String str, @m80.l String str2, @m80.l u1 u1Var, @m80.l String str3, @m80.l String str4, @m80.l String str5, boolean z11) {
            kotlin.jvm.internal.g0.p(word, "word");
            return new b(i11, i12, word, str, str2, u1Var, str3, str4, str5, z11);
        }

        public final int m() {
            return this.f65481b;
        }

        @m80.l
        public final String n() {
            return this.f65486g;
        }

        @m80.l
        public final u1 o() {
            return this.f65485f;
        }

        @m80.l
        public final String p() {
            return this.f65487h;
        }

        @m80.l
        public final String q() {
            return this.f65488i;
        }

        public final int r() {
            return this.f65480a;
        }

        @m80.l
        public final String s() {
            return this.f65483d;
        }

        @m80.l
        public final String t() {
            return this.f65484e;
        }

        @m80.k
        public String toString() {
            return "BasicWordInfo(topicId=" + this.f65480a + ", bookId=" + this.f65481b + ", word=" + this.f65482c + ", usaAccent=" + this.f65483d + ", usaVoice=" + this.f65484e + ", chMeaningInfo=" + this.f65485f + ", chMeaning=" + this.f65486g + ", comparative=" + this.f65487h + ", exams=" + this.f65488i + ", isCollected=" + this.f65489j + ')';
        }

        @m80.k
        public final String u() {
            return this.f65482c;
        }

        public final boolean v() {
            return this.f65489j;
        }

        public final void w(boolean z11) {
            this.f65489j = z11;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ b(int r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, k3.u1 r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11, int r12, kotlin.jvm.internal.v r13) {
            /*
                r1 = this;
                r13 = r12 & 8
                r0 = 0
                if (r13 == 0) goto L6
                r5 = r0
            L6:
                r13 = r12 & 16
                if (r13 == 0) goto Lb
                r6 = r0
            Lb:
                r13 = r12 & 32
                if (r13 == 0) goto L10
                r7 = r0
            L10:
                r13 = r12 & 64
                if (r13 == 0) goto L15
                r8 = r0
            L15:
                r13 = r12 & 128(0x80, float:1.794E-43)
                if (r13 == 0) goto L1a
                r9 = r0
            L1a:
                r12 = r12 & 256(0x100, float:3.59E-43)
                if (r12 == 0) goto L2a
                r12 = r11
                r11 = r0
            L20:
                r10 = r9
                r9 = r8
                r8 = r7
                r7 = r6
                r6 = r5
                r5 = r4
                r4 = r3
                r3 = r2
                r2 = r1
                goto L2d
            L2a:
                r12 = r11
                r11 = r10
                goto L20
            L2d:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k3.o1.b.<init>(int, int, java.lang.String, java.lang.String, java.lang.String, k3.u1, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.v):void");
        }
    }
}
