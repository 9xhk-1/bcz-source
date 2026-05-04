package rf;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final int f84017d = 8;

    /* renamed from: a, reason: collision with root package name */
    @wo.c("code")
    private final int f84018a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    @wo.c("msg")
    private final String f84019b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    @wo.c("data")
    private final i f84020c;

    public j(int i11, @m80.k String msg, @m80.k i data) {
        g0.p(msg, "msg");
        g0.p(data, "data");
        this.f84018a = i11;
        this.f84019b = msg;
        this.f84020c = data;
    }

    public static /* synthetic */ j e(j jVar, int i11, String str, i iVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = jVar.f84018a;
        }
        if ((i12 & 2) != 0) {
            str = jVar.f84019b;
        }
        if ((i12 & 4) != 0) {
            iVar = jVar.f84020c;
        }
        return jVar.d(i11, str, iVar);
    }

    public final int a() {
        return this.f84018a;
    }

    @m80.k
    public final String b() {
        return this.f84019b;
    }

    @m80.k
    public final i c() {
        return this.f84020c;
    }

    @m80.k
    public final j d(int i11, @m80.k String msg, @m80.k i data) {
        g0.p(msg, "msg");
        g0.p(data, "data");
        return new j(i11, msg, data);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f84018a == jVar.f84018a && g0.g(this.f84019b, jVar.f84019b) && g0.g(this.f84020c, jVar.f84020c);
    }

    public final int f() {
        return this.f84018a;
    }

    @m80.k
    public final i g() {
        return this.f84020c;
    }

    @m80.k
    public final String h() {
        return this.f84019b;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f84018a) * 31) + this.f84019b.hashCode()) * 31) + this.f84020c.hashCode();
    }

    @m80.k
    public String toString() {
        return "RecordScoreInfo(code=" + this.f84018a + ", msg=" + this.f84019b + ", data=" + this.f84020c + pn.j.f81007d;
    }
}
