package e6;

import com.baicizhan.app.biz.game.uc.ability.WordListQuestionType;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f49453a;

    /* renamed from: b, reason: collision with root package name */
    public final int f49454b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f49455c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f49456d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f49457e;

    /* renamed from: f, reason: collision with root package name */
    public final int f49458f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final WordListQuestionType f49459g;

    public l(int i11, int i12, boolean z11, boolean z12, boolean z13, int i13, @m80.k WordListQuestionType questionType) {
        g0.p(questionType, "questionType");
        this.f49453a = i11;
        this.f49454b = i12;
        this.f49455c = z11;
        this.f49456d = z12;
        this.f49457e = z13;
        this.f49458f = i13;
        this.f49459g = questionType;
    }

    public static /* synthetic */ l i(l lVar, int i11, int i12, boolean z11, boolean z12, boolean z13, int i13, WordListQuestionType wordListQuestionType, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = lVar.f49453a;
        }
        if ((i14 & 2) != 0) {
            i12 = lVar.f49454b;
        }
        if ((i14 & 4) != 0) {
            z11 = lVar.f49455c;
        }
        if ((i14 & 8) != 0) {
            z12 = lVar.f49456d;
        }
        if ((i14 & 16) != 0) {
            z13 = lVar.f49457e;
        }
        if ((i14 & 32) != 0) {
            i13 = lVar.f49458f;
        }
        if ((i14 & 64) != 0) {
            wordListQuestionType = lVar.f49459g;
        }
        int i15 = i13;
        WordListQuestionType wordListQuestionType2 = wordListQuestionType;
        boolean z14 = z13;
        boolean z15 = z11;
        return lVar.h(i11, i12, z15, z12, z14, i15, wordListQuestionType2);
    }

    public final int a() {
        return this.f49453a;
    }

    public final int b() {
        return this.f49454b;
    }

    public final boolean c() {
        return this.f49455c;
    }

    public final boolean d() {
        return this.f49456d;
    }

    public final boolean e() {
        return this.f49457e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f49453a == lVar.f49453a && this.f49454b == lVar.f49454b && this.f49455c == lVar.f49455c && this.f49456d == lVar.f49456d && this.f49457e == lVar.f49457e && this.f49458f == lVar.f49458f && this.f49459g == lVar.f49459g;
    }

    public final int f() {
        return this.f49458f;
    }

    @m80.k
    public final WordListQuestionType g() {
        return this.f49459g;
    }

    @m80.k
    public final l h(int i11, int i12, boolean z11, boolean z12, boolean z13, int i13, @m80.k WordListQuestionType questionType) {
        g0.p(questionType, "questionType");
        return new l(i11, i12, z11, z12, z13, i13, questionType);
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.f49453a) * 31) + Integer.hashCode(this.f49454b)) * 31) + Boolean.hashCode(this.f49455c)) * 31) + Boolean.hashCode(this.f49456d)) * 31) + Boolean.hashCode(this.f49457e)) * 31) + Integer.hashCode(this.f49458f)) * 31) + this.f49459g.hashCode();
    }

    public final int j() {
        return this.f49453a;
    }

    @m80.k
    public final WordListQuestionType k() {
        return this.f49459g;
    }

    public final boolean l() {
        return this.f49456d;
    }

    public final boolean m() {
        return this.f49457e;
    }

    public final int n() {
        return this.f49458f;
    }

    public final int o() {
        return this.f49454b;
    }

    public final boolean p() {
        return this.f49455c;
    }

    @m80.k
    public String toString() {
        return "WordlistStudyResult(bookId=" + this.f49453a + ", topicId=" + this.f49454b + ", isFirstMet=" + this.f49455c + ", right=" + this.f49456d + ", showHint=" + this.f49457e + ", timeUsed=" + this.f49458f + ", questionType=" + this.f49459g + ')';
    }

    public /* synthetic */ l(int i11, int i12, boolean z11, boolean z12, boolean z13, int i13, WordListQuestionType wordListQuestionType, int i14, v vVar) {
        this(i11, i12, z11, z12, z13, i13, (i14 & 64) != 0 ? WordListQuestionType.ENGLISH_TO_MEANING : wordListQuestionType);
    }
}
