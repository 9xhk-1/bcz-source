package l3;

import com.baicizhan.app.api.service.model.LanguageTypeVo;
import com.baicizhan.app.api.service.model.SentenceLessonType;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f69710a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final LanguageTypeVo f69711b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<x> f69712c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final y f69713d;

    /* renamed from: e, reason: collision with root package name */
    public final int f69714e;

    /* renamed from: f, reason: collision with root package name */
    public final int f69715f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final SentenceLessonType f69716g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f69717h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f69718i;

    public w(int i11, @m80.k LanguageTypeVo languageType, @m80.k List<x> lessons, @m80.k y unit, int i12, int i13, @m80.k SentenceLessonType curLessonType, boolean z11, boolean z12) {
        kotlin.jvm.internal.g0.p(languageType, "languageType");
        kotlin.jvm.internal.g0.p(lessons, "lessons");
        kotlin.jvm.internal.g0.p(unit, "unit");
        kotlin.jvm.internal.g0.p(curLessonType, "curLessonType");
        this.f69710a = i11;
        this.f69711b = languageType;
        this.f69712c = lessons;
        this.f69713d = unit;
        this.f69714e = i12;
        this.f69715f = i13;
        this.f69716g = curLessonType;
        this.f69717h = z11;
        this.f69718i = z12;
    }

    public static /* synthetic */ w k(w wVar, int i11, LanguageTypeVo languageTypeVo, List list, y yVar, int i12, int i13, SentenceLessonType sentenceLessonType, boolean z11, boolean z12, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = wVar.f69710a;
        }
        if ((i14 & 2) != 0) {
            languageTypeVo = wVar.f69711b;
        }
        if ((i14 & 4) != 0) {
            list = wVar.f69712c;
        }
        if ((i14 & 8) != 0) {
            yVar = wVar.f69713d;
        }
        if ((i14 & 16) != 0) {
            i12 = wVar.f69714e;
        }
        if ((i14 & 32) != 0) {
            i13 = wVar.f69715f;
        }
        if ((i14 & 64) != 0) {
            sentenceLessonType = wVar.f69716g;
        }
        if ((i14 & 128) != 0) {
            z11 = wVar.f69717h;
        }
        if ((i14 & 256) != 0) {
            z12 = wVar.f69718i;
        }
        boolean z13 = z11;
        boolean z14 = z12;
        int i15 = i13;
        SentenceLessonType sentenceLessonType2 = sentenceLessonType;
        int i16 = i12;
        List list2 = list;
        return wVar.j(i11, languageTypeVo, list2, yVar, i16, i15, sentenceLessonType2, z13, z14);
    }

    public final int a() {
        return this.f69710a;
    }

    @m80.k
    public final LanguageTypeVo b() {
        return this.f69711b;
    }

    @m80.k
    public final List<x> c() {
        return this.f69712c;
    }

    @m80.k
    public final y d() {
        return this.f69713d;
    }

    public final int e() {
        return this.f69714e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f69710a == wVar.f69710a && this.f69711b == wVar.f69711b && kotlin.jvm.internal.g0.g(this.f69712c, wVar.f69712c) && kotlin.jvm.internal.g0.g(this.f69713d, wVar.f69713d) && this.f69714e == wVar.f69714e && this.f69715f == wVar.f69715f && this.f69716g == wVar.f69716g && this.f69717h == wVar.f69717h && this.f69718i == wVar.f69718i;
    }

    public final int f() {
        return this.f69715f;
    }

    @m80.k
    public final SentenceLessonType g() {
        return this.f69716g;
    }

    public final boolean h() {
        return this.f69717h;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.f69710a) * 31) + this.f69711b.hashCode()) * 31) + this.f69712c.hashCode()) * 31) + this.f69713d.hashCode()) * 31) + Integer.hashCode(this.f69714e)) * 31) + Integer.hashCode(this.f69715f)) * 31) + this.f69716g.hashCode()) * 31) + Boolean.hashCode(this.f69717h)) * 31) + Boolean.hashCode(this.f69718i);
    }

    public final boolean i() {
        return this.f69718i;
    }

    @m80.k
    public final w j(int i11, @m80.k LanguageTypeVo languageType, @m80.k List<x> lessons, @m80.k y unit, int i12, int i13, @m80.k SentenceLessonType curLessonType, boolean z11, boolean z12) {
        kotlin.jvm.internal.g0.p(languageType, "languageType");
        kotlin.jvm.internal.g0.p(lessons, "lessons");
        kotlin.jvm.internal.g0.p(unit, "unit");
        kotlin.jvm.internal.g0.p(curLessonType, "curLessonType");
        return new w(i11, languageType, lessons, unit, i12, i13, curLessonType, z11, z12);
    }

    public final boolean l() {
        return this.f69717h;
    }

    public final int m() {
        return this.f69715f;
    }

    @m80.k
    public final SentenceLessonType n() {
        return this.f69716g;
    }

    public final int o() {
        return this.f69714e;
    }

    @m80.k
    public final LanguageTypeVo p() {
        return this.f69711b;
    }

    @m80.k
    public final List<x> q() {
        return this.f69712c;
    }

    public final int r() {
        return this.f69710a;
    }

    @m80.k
    public final y s() {
        return this.f69713d;
    }

    public final boolean t() {
        return this.f69718i;
    }

    @m80.k
    public String toString() {
        return "SentenceLearnState(skuId=" + this.f69710a + ", languageType=" + this.f69711b + ", lessons=" + this.f69712c + ", unit=" + this.f69713d + ", curUnitId=" + this.f69714e + ", curLessonId=" + this.f69715f + ", curLessonType=" + this.f69716g + ", comingSoon=" + this.f69717h + ", isHistorical=" + this.f69718i + ')';
    }
}
