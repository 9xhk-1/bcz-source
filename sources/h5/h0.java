package h5;

import com.baicizhan.app.biz.game.model.SentenceLanguageType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f58349a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final SentenceLanguageType f58350b;

    public h0(int i11, @m80.k SentenceLanguageType sentenceLanguageType) {
        kotlin.jvm.internal.g0.p(sentenceLanguageType, "sentenceLanguageType");
        this.f58349a = i11;
        this.f58350b = sentenceLanguageType;
    }

    public static /* synthetic */ h0 d(h0 h0Var, int i11, SentenceLanguageType sentenceLanguageType, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = h0Var.f58349a;
        }
        if ((i12 & 2) != 0) {
            sentenceLanguageType = h0Var.f58350b;
        }
        return h0Var.c(i11, sentenceLanguageType);
    }

    public final int a() {
        return this.f58349a;
    }

    @m80.k
    public final SentenceLanguageType b() {
        return this.f58350b;
    }

    @m80.k
    public final h0 c(int i11, @m80.k SentenceLanguageType sentenceLanguageType) {
        kotlin.jvm.internal.g0.p(sentenceLanguageType, "sentenceLanguageType");
        return new h0(i11, sentenceLanguageType);
    }

    @m80.k
    public final SentenceLanguageType e() {
        return this.f58350b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f58349a == h0Var.f58349a && this.f58350b == h0Var.f58350b;
    }

    public final int f() {
        return this.f58349a;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f58349a) * 31) + this.f58350b.hashCode();
    }

    @m80.k
    public String toString() {
        return "SentenceEntranceModel(skuId=" + this.f58349a + ", sentenceLanguageType=" + this.f58350b + ')';
    }
}
