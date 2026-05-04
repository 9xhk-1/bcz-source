package h5;

import com.baicizhan.app.biz.game.model.SentenceLanguageType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f58359a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final SentenceLanguageType f58360b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final k0 f58361c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final l0 f58362d;

    public j0(int i11, @m80.k SentenceLanguageType sentenceLanguageType, @m80.k k0 curLesson, @m80.k l0 curUnit) {
        kotlin.jvm.internal.g0.p(sentenceLanguageType, "sentenceLanguageType");
        kotlin.jvm.internal.g0.p(curLesson, "curLesson");
        kotlin.jvm.internal.g0.p(curUnit, "curUnit");
        this.f58359a = i11;
        this.f58360b = sentenceLanguageType;
        this.f58361c = curLesson;
        this.f58362d = curUnit;
    }

    public static /* synthetic */ j0 f(j0 j0Var, int i11, SentenceLanguageType sentenceLanguageType, k0 k0Var, l0 l0Var, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = j0Var.f58359a;
        }
        if ((i12 & 2) != 0) {
            sentenceLanguageType = j0Var.f58360b;
        }
        if ((i12 & 4) != 0) {
            k0Var = j0Var.f58361c;
        }
        if ((i12 & 8) != 0) {
            l0Var = j0Var.f58362d;
        }
        return j0Var.e(i11, sentenceLanguageType, k0Var, l0Var);
    }

    public final int a() {
        return this.f58359a;
    }

    @m80.k
    public final SentenceLanguageType b() {
        return this.f58360b;
    }

    @m80.k
    public final k0 c() {
        return this.f58361c;
    }

    @m80.k
    public final l0 d() {
        return this.f58362d;
    }

    @m80.k
    public final j0 e(int i11, @m80.k SentenceLanguageType sentenceLanguageType, @m80.k k0 curLesson, @m80.k l0 curUnit) {
        kotlin.jvm.internal.g0.p(sentenceLanguageType, "sentenceLanguageType");
        kotlin.jvm.internal.g0.p(curLesson, "curLesson");
        kotlin.jvm.internal.g0.p(curUnit, "curUnit");
        return new j0(i11, sentenceLanguageType, curLesson, curUnit);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f58359a == j0Var.f58359a && this.f58360b == j0Var.f58360b && kotlin.jvm.internal.g0.g(this.f58361c, j0Var.f58361c) && kotlin.jvm.internal.g0.g(this.f58362d, j0Var.f58362d);
    }

    @m80.k
    public final k0 g() {
        return this.f58361c;
    }

    @m80.k
    public final l0 h() {
        return this.f58362d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f58359a) * 31) + this.f58360b.hashCode()) * 31) + this.f58361c.hashCode()) * 31) + this.f58362d.hashCode();
    }

    @m80.k
    public final SentenceLanguageType i() {
        return this.f58360b;
    }

    public final int j() {
        return this.f58359a;
    }

    @m80.k
    public String toString() {
        return "SentenceLearningJourney(skuId=" + this.f58359a + ", sentenceLanguageType=" + this.f58360b + ", curLesson=" + this.f58361c + ", curUnit=" + this.f58362d + ')';
    }
}
