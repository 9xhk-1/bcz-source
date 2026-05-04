package ij;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.dataset.models.UniverseTopicId;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class z {

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public static final a f60671m = new a(null);

    /* renamed from: n, reason: collision with root package name */
    public static final int f60672n = 8;

    /* renamed from: a, reason: collision with root package name */
    public final int f60673a;

    /* renamed from: b, reason: collision with root package name */
    public final int f60674b;

    /* renamed from: c, reason: collision with root package name */
    public final long f60675c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f60676d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f60677e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final String f60678f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final String f60679g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public final String f60680h;

    /* renamed from: i, reason: collision with root package name */
    public final int f60681i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f60682j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f60683k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final yz.c0 f60684l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public final int a(long j11) {
            return UniverseTopicId.getBookId(j11);
        }

        public final int b(long j11) {
            return UniverseTopicId.getTopicId(j11);
        }

        public final long c(int i11, int i12) {
            return UniverseTopicId.make(i11, i12);
        }

        public a() {
        }
    }

    public z(int i11, int i12, long j11, @m80.k String word, @m80.k String meaning, @m80.k String audioUS, @m80.k String audioUK, @m80.l String str, int i13, boolean z11, boolean z12) {
        g0.p(word, "word");
        g0.p(meaning, "meaning");
        g0.p(audioUS, "audioUS");
        g0.p(audioUK, "audioUK");
        this.f60673a = i11;
        this.f60674b = i12;
        this.f60675c = j11;
        this.f60676d = word;
        this.f60677e = meaning;
        this.f60678f = audioUS;
        this.f60679g = audioUK;
        this.f60680h = str;
        this.f60681i = i13;
        this.f60682j = z11;
        this.f60683k = z12;
        this.f60684l = yz.e0.c(new x00.a() { // from class: ij.y
            @Override // x00.a
            public final Object invoke() {
                long C;
                C = z.C(z.this);
                return Long.valueOf(C);
            }
        });
    }

    public static final long C(z zVar) {
        return f60671m.c(zVar.f60674b, zVar.f60673a);
    }

    public static /* synthetic */ z n(z zVar, int i11, int i12, long j11, String str, String str2, String str3, String str4, String str5, int i13, boolean z11, boolean z12, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = zVar.f60673a;
        }
        if ((i14 & 2) != 0) {
            i12 = zVar.f60674b;
        }
        if ((i14 & 4) != 0) {
            j11 = zVar.f60675c;
        }
        if ((i14 & 8) != 0) {
            str = zVar.f60676d;
        }
        if ((i14 & 16) != 0) {
            str2 = zVar.f60677e;
        }
        if ((i14 & 32) != 0) {
            str3 = zVar.f60678f;
        }
        if ((i14 & 64) != 0) {
            str4 = zVar.f60679g;
        }
        if ((i14 & 128) != 0) {
            str5 = zVar.f60680h;
        }
        if ((i14 & 256) != 0) {
            i13 = zVar.f60681i;
        }
        if ((i14 & 512) != 0) {
            z11 = zVar.f60682j;
        }
        if ((i14 & 1024) != 0) {
            z12 = zVar.f60683k;
        }
        boolean z13 = z11;
        boolean z14 = z12;
        String str6 = str5;
        int i15 = i13;
        long j12 = j11;
        return zVar.m(i11, i12, j12, str, str2, str3, str4, str6, i15, z13, z14);
    }

    public final void A(boolean z11) {
        this.f60683k = z11;
    }

    public final void B(boolean z11) {
        this.f60682j = z11;
    }

    public final int b() {
        return this.f60673a;
    }

    public final boolean c() {
        return this.f60682j;
    }

    public final boolean d() {
        return this.f60683k;
    }

    public final int e() {
        return this.f60674b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f60673a == zVar.f60673a && this.f60674b == zVar.f60674b && this.f60675c == zVar.f60675c && g0.g(this.f60676d, zVar.f60676d) && g0.g(this.f60677e, zVar.f60677e) && g0.g(this.f60678f, zVar.f60678f) && g0.g(this.f60679g, zVar.f60679g) && g0.g(this.f60680h, zVar.f60680h) && this.f60681i == zVar.f60681i && this.f60682j == zVar.f60682j && this.f60683k == zVar.f60683k;
    }

    public final long f() {
        return this.f60675c;
    }

    @m80.k
    public final String g() {
        return this.f60676d;
    }

    @m80.k
    public final String h() {
        return this.f60677e;
    }

    public int hashCode() {
        int hashCode = ((((((((((((Integer.hashCode(this.f60673a) * 31) + Integer.hashCode(this.f60674b)) * 31) + Long.hashCode(this.f60675c)) * 31) + this.f60676d.hashCode()) * 31) + this.f60677e.hashCode()) * 31) + this.f60678f.hashCode()) * 31) + this.f60679g.hashCode()) * 31;
        String str = this.f60680h;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f60681i)) * 31) + Boolean.hashCode(this.f60682j)) * 31) + Boolean.hashCode(this.f60683k);
    }

    @m80.k
    public final String i() {
        return this.f60678f;
    }

    @m80.k
    public final String j() {
        return this.f60679g;
    }

    @m80.l
    public final String k() {
        return this.f60680h;
    }

    public final int l() {
        return this.f60681i;
    }

    @m80.k
    public final z m(int i11, int i12, long j11, @m80.k String word, @m80.k String meaning, @m80.k String audioUS, @m80.k String audioUK, @m80.l String str, int i13, boolean z11, boolean z12) {
        g0.p(word, "word");
        g0.p(meaning, "meaning");
        g0.p(audioUS, "audioUS");
        g0.p(audioUK, "audioUK");
        return new z(i11, i12, j11, word, meaning, audioUS, audioUK, str, i13, z11, z12);
    }

    @m80.l
    public final String o() {
        return this.f60680h;
    }

    @m80.k
    public final String p() {
        return this.f60679g;
    }

    @m80.k
    public final String q() {
        return this.f60678f;
    }

    public final int r() {
        return this.f60674b;
    }

    public final long s() {
        return this.f60675c;
    }

    @m80.k
    public final String t() {
        return this.f60677e;
    }

    @m80.k
    public String toString() {
        return "WordFavorite(topicId=" + this.f60673a + ", bookId=" + this.f60674b + ", createdAt=" + this.f60675c + ", word=" + this.f60676d + ", meaning=" + this.f60677e + ", audioUS=" + this.f60678f + ", audioUK=" + this.f60679g + ", accent=" + this.f60680h + ", score=" + this.f60681i + ", showEn=" + this.f60682j + ", showCh=" + this.f60683k + pn.j.f81007d;
    }

    public final int u() {
        return this.f60681i;
    }

    public final boolean v() {
        return this.f60683k;
    }

    public final boolean w() {
        return this.f60682j;
    }

    public final int x() {
        return this.f60673a;
    }

    public final long y() {
        return ((Number) this.f60684l.getValue()).longValue();
    }

    @m80.k
    public final String z() {
        return this.f60676d;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ z(int r16, int r17, long r18, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, int r25, boolean r26, boolean r27, int r28, kotlin.jvm.internal.v r29) {
        /*
            r15 = this;
            r0 = r28
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L9
            r1 = 0
            r11 = r1
            goto Lb
        L9:
            r11 = r24
        Lb:
            r1 = r0 & 256(0x100, float:3.59E-43)
            r2 = 0
            if (r1 == 0) goto L12
            r12 = r2
            goto L14
        L12:
            r12 = r25
        L14:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L1b
            r1 = 1
            r13 = r1
            goto L1d
        L1b:
            r13 = r26
        L1d:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L32
            r14 = r2
            r3 = r16
            r4 = r17
            r5 = r18
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r2 = r15
            goto L43
        L32:
            r14 = r27
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
        L43:
            r2.<init>(r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ij.z.<init>(int, int, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean, int, kotlin.jvm.internal.v):void");
    }
}
