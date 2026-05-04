package k3;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f65651a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f65652b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<String> f65653c;

    public v(@m80.k String resourceId, @m80.k String autoSpeechText, @m80.k List<String> triggerSpeech) {
        kotlin.jvm.internal.g0.p(resourceId, "resourceId");
        kotlin.jvm.internal.g0.p(autoSpeechText, "autoSpeechText");
        kotlin.jvm.internal.g0.p(triggerSpeech, "triggerSpeech");
        this.f65651a = resourceId;
        this.f65652b = autoSpeechText;
        this.f65653c = triggerSpeech;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ v e(v vVar, String str, String str2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = vVar.f65651a;
        }
        if ((i11 & 2) != 0) {
            str2 = vVar.f65652b;
        }
        if ((i11 & 4) != 0) {
            list = vVar.f65653c;
        }
        return vVar.d(str, str2, list);
    }

    @m80.k
    public final String a() {
        return this.f65651a;
    }

    @m80.k
    public final String b() {
        return this.f65652b;
    }

    @m80.k
    public final List<String> c() {
        return this.f65653c;
    }

    @m80.k
    public final v d(@m80.k String resourceId, @m80.k String autoSpeechText, @m80.k List<String> triggerSpeech) {
        kotlin.jvm.internal.g0.p(resourceId, "resourceId");
        kotlin.jvm.internal.g0.p(autoSpeechText, "autoSpeechText");
        kotlin.jvm.internal.g0.p(triggerSpeech, "triggerSpeech");
        return new v(resourceId, autoSpeechText, triggerSpeech);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.g0.g(this.f65651a, vVar.f65651a) && kotlin.jvm.internal.g0.g(this.f65652b, vVar.f65652b) && kotlin.jvm.internal.g0.g(this.f65653c, vVar.f65653c);
    }

    @m80.k
    public final String f() {
        return this.f65652b;
    }

    @m80.k
    public final String g() {
        return this.f65651a;
    }

    @m80.k
    public final List<String> h() {
        return this.f65653c;
    }

    public int hashCode() {
        return (((this.f65651a.hashCode() * 31) + this.f65652b.hashCode()) * 31) + this.f65653c.hashCode();
    }

    @m80.k
    public String toString() {
        return "BuddyInfo(resourceId=" + this.f65651a + ", autoSpeechText=" + this.f65652b + ", triggerSpeech=" + this.f65653c + ')';
    }
}
