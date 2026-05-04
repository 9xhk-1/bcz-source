package l3;

import com.baicizhan.app.api.service.model.SentenceLessonState;
import com.baicizhan.app.api.service.model.SentenceLessonType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f69719a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final SentenceLessonType f69720b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final SentenceLessonState f69721c;

    public x(int i11, @m80.k SentenceLessonType lessonType, @m80.k SentenceLessonState lessonState) {
        kotlin.jvm.internal.g0.p(lessonType, "lessonType");
        kotlin.jvm.internal.g0.p(lessonState, "lessonState");
        this.f69719a = i11;
        this.f69720b = lessonType;
        this.f69721c = lessonState;
    }

    public static /* synthetic */ x e(x xVar, int i11, SentenceLessonType sentenceLessonType, SentenceLessonState sentenceLessonState, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = xVar.f69719a;
        }
        if ((i12 & 2) != 0) {
            sentenceLessonType = xVar.f69720b;
        }
        if ((i12 & 4) != 0) {
            sentenceLessonState = xVar.f69721c;
        }
        return xVar.d(i11, sentenceLessonType, sentenceLessonState);
    }

    public final int a() {
        return this.f69719a;
    }

    @m80.k
    public final SentenceLessonType b() {
        return this.f69720b;
    }

    @m80.k
    public final SentenceLessonState c() {
        return this.f69721c;
    }

    @m80.k
    public final x d(int i11, @m80.k SentenceLessonType lessonType, @m80.k SentenceLessonState lessonState) {
        kotlin.jvm.internal.g0.p(lessonType, "lessonType");
        kotlin.jvm.internal.g0.p(lessonState, "lessonState");
        return new x(i11, lessonType, lessonState);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f69719a == xVar.f69719a && this.f69720b == xVar.f69720b && this.f69721c == xVar.f69721c;
    }

    public final int f() {
        return this.f69719a;
    }

    @m80.k
    public final SentenceLessonState g() {
        return this.f69721c;
    }

    @m80.k
    public final SentenceLessonType h() {
        return this.f69720b;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f69719a) * 31) + this.f69720b.hashCode()) * 31) + this.f69721c.hashCode();
    }

    @m80.k
    public String toString() {
        return "SentenceLesson(lessonId=" + this.f69719a + ", lessonType=" + this.f69720b + ", lessonState=" + this.f69721c + ')';
    }
}
