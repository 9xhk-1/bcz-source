package rw;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@io.ktor.utils.io.c0
/* loaded from: classes8.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public String f84738a;

    /* JADX WARN: Multi-variable type inference failed */
    public o1() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @m80.k
    public final String a() {
        return this.f84738a;
    }

    public final void b(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<set-?>");
        this.f84738a = str;
    }

    public o1(@m80.k String agent) {
        kotlin.jvm.internal.g0.p(agent, "agent");
        this.f84738a = agent;
    }

    public /* synthetic */ o1(String str, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? "Ktor http-client" : str);
    }
}
