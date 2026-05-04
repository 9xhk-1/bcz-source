package ea;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final int f49617b = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f49618a;

    public b(@k String feedback) {
        g0.p(feedback, "feedback");
        this.f49618a = feedback;
    }

    public static /* synthetic */ b c(b bVar, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bVar.f49618a;
        }
        return bVar.b(str);
    }

    @k
    public final String a() {
        return this.f49618a;
    }

    @k
    public final b b(@k String feedback) {
        g0.p(feedback, "feedback");
        return new b(feedback);
    }

    @k
    public final String d() {
        return this.f49618a;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && g0.g(this.f49618a, ((b) obj).f49618a);
    }

    public int hashCode() {
        return this.f49618a.hashCode();
    }

    @k
    public String toString() {
        return "Feedback(feedback=" + this.f49618a + j.f81007d;
    }
}
