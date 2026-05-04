package h5;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f58455a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final List<String> f58456b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<String> f58457c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final List<Integer> f58458d;

    public u(@m80.k String resourceId, @m80.k List<String> autoSpeech, @m80.k List<String> triggerSpeech, @m80.k List<Integer> actionIds) {
        kotlin.jvm.internal.g0.p(resourceId, "resourceId");
        kotlin.jvm.internal.g0.p(autoSpeech, "autoSpeech");
        kotlin.jvm.internal.g0.p(triggerSpeech, "triggerSpeech");
        kotlin.jvm.internal.g0.p(actionIds, "actionIds");
        this.f58455a = resourceId;
        this.f58456b = autoSpeech;
        this.f58457c = triggerSpeech;
        this.f58458d = actionIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ u f(u uVar, String str, List list, List list2, List list3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = uVar.f58455a;
        }
        if ((i11 & 2) != 0) {
            list = uVar.f58456b;
        }
        if ((i11 & 4) != 0) {
            list2 = uVar.f58457c;
        }
        if ((i11 & 8) != 0) {
            list3 = uVar.f58458d;
        }
        return uVar.e(str, list, list2, list3);
    }

    @m80.k
    public final String a() {
        return this.f58455a;
    }

    @m80.k
    public final List<String> b() {
        return this.f58456b;
    }

    @m80.k
    public final List<String> c() {
        return this.f58457c;
    }

    @m80.k
    public final List<Integer> d() {
        return this.f58458d;
    }

    @m80.k
    public final u e(@m80.k String resourceId, @m80.k List<String> autoSpeech, @m80.k List<String> triggerSpeech, @m80.k List<Integer> actionIds) {
        kotlin.jvm.internal.g0.p(resourceId, "resourceId");
        kotlin.jvm.internal.g0.p(autoSpeech, "autoSpeech");
        kotlin.jvm.internal.g0.p(triggerSpeech, "triggerSpeech");
        kotlin.jvm.internal.g0.p(actionIds, "actionIds");
        return new u(resourceId, autoSpeech, triggerSpeech, actionIds);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.g0.g(this.f58455a, uVar.f58455a) && kotlin.jvm.internal.g0.g(this.f58456b, uVar.f58456b) && kotlin.jvm.internal.g0.g(this.f58457c, uVar.f58457c) && kotlin.jvm.internal.g0.g(this.f58458d, uVar.f58458d);
    }

    @m80.k
    public final List<Integer> g() {
        return this.f58458d;
    }

    @m80.k
    public final List<String> h() {
        return this.f58456b;
    }

    public int hashCode() {
        return (((((this.f58455a.hashCode() * 31) + this.f58456b.hashCode()) * 31) + this.f58457c.hashCode()) * 31) + this.f58458d.hashCode();
    }

    @m80.k
    public final String i() {
        return this.f58455a;
    }

    @m80.k
    public final List<String> j() {
        return this.f58457c;
    }

    @m80.k
    public String toString() {
        return "IpAvatarResource(resourceId=" + this.f58455a + ", autoSpeech=" + this.f58456b + ", triggerSpeech=" + this.f58457c + ", actionIds=" + this.f58458d + ')';
    }
}
