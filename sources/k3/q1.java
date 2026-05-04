package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f65548a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65549b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f65550c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final String f65551d;

    public q1(int i11, @m80.k String word, @m80.k String mean, @m80.k String phonetic) {
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(mean, "mean");
        kotlin.jvm.internal.g0.p(phonetic, "phonetic");
        this.f65548a = i11;
        this.f65549b = word;
        this.f65550c = mean;
        this.f65551d = phonetic;
    }

    public static /* synthetic */ q1 f(q1 q1Var, int i11, String str, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = q1Var.f65548a;
        }
        if ((i12 & 2) != 0) {
            str = q1Var.f65549b;
        }
        if ((i12 & 4) != 0) {
            str2 = q1Var.f65550c;
        }
        if ((i12 & 8) != 0) {
            str3 = q1Var.f65551d;
        }
        return q1Var.e(i11, str, str2, str3);
    }

    public final int a() {
        return this.f65548a;
    }

    @m80.k
    public final String b() {
        return this.f65549b;
    }

    @m80.k
    public final String c() {
        return this.f65550c;
    }

    @m80.k
    public final String d() {
        return this.f65551d;
    }

    @m80.k
    public final q1 e(int i11, @m80.k String word, @m80.k String mean, @m80.k String phonetic) {
        kotlin.jvm.internal.g0.p(word, "word");
        kotlin.jvm.internal.g0.p(mean, "mean");
        kotlin.jvm.internal.g0.p(phonetic, "phonetic");
        return new q1(i11, word, mean, phonetic);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return this.f65548a == q1Var.f65548a && kotlin.jvm.internal.g0.g(this.f65549b, q1Var.f65549b) && kotlin.jvm.internal.g0.g(this.f65550c, q1Var.f65550c) && kotlin.jvm.internal.g0.g(this.f65551d, q1Var.f65551d);
    }

    @m80.k
    public final String g() {
        return this.f65550c;
    }

    @m80.k
    public final String h() {
        return this.f65551d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f65548a) * 31) + this.f65549b.hashCode()) * 31) + this.f65550c.hashCode()) * 31) + this.f65551d.hashCode();
    }

    public final int i() {
        return this.f65548a;
    }

    @m80.k
    public final String j() {
        return this.f65549b;
    }

    @m80.k
    public String toString() {
        return "LookUpWord(topicId=" + this.f65548a + ", word=" + this.f65549b + ", mean=" + this.f65550c + ", phonetic=" + this.f65551d + ')';
    }
}
