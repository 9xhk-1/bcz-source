package h5;

import com.baicizhan.app.biz.game.model.LavaQuestState;
import com.baicizhan.online.playground_api.LavaquestGameInfo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final LavaquestGameInfo f58465a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final LavaQuestState f58466b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f58467c;

    public w(@m80.k LavaquestGameInfo lavaQuestInfo, @m80.k LavaQuestState state, boolean z11) {
        kotlin.jvm.internal.g0.p(lavaQuestInfo, "lavaQuestInfo");
        kotlin.jvm.internal.g0.p(state, "state");
        this.f58465a = lavaQuestInfo;
        this.f58466b = state;
        this.f58467c = z11;
    }

    public static /* synthetic */ w e(w wVar, LavaquestGameInfo lavaquestGameInfo, LavaQuestState lavaQuestState, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lavaquestGameInfo = wVar.f58465a;
        }
        if ((i11 & 2) != 0) {
            lavaQuestState = wVar.f58466b;
        }
        if ((i11 & 4) != 0) {
            z11 = wVar.f58467c;
        }
        return wVar.d(lavaquestGameInfo, lavaQuestState, z11);
    }

    @m80.k
    public final LavaquestGameInfo a() {
        return this.f58465a;
    }

    @m80.k
    public final LavaQuestState b() {
        return this.f58466b;
    }

    public final boolean c() {
        return this.f58467c;
    }

    @m80.k
    public final w d(@m80.k LavaquestGameInfo lavaQuestInfo, @m80.k LavaQuestState state, boolean z11) {
        kotlin.jvm.internal.g0.p(lavaQuestInfo, "lavaQuestInfo");
        kotlin.jvm.internal.g0.p(state, "state");
        return new w(lavaQuestInfo, state, z11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return kotlin.jvm.internal.g0.g(this.f58465a, wVar.f58465a) && this.f58466b == wVar.f58466b && this.f58467c == wVar.f58467c;
    }

    public final boolean f() {
        return this.f58467c;
    }

    @m80.k
    public final LavaquestGameInfo g() {
        return this.f58465a;
    }

    @m80.k
    public final LavaQuestState h() {
        return this.f58466b;
    }

    public int hashCode() {
        return (((this.f58465a.hashCode() * 31) + this.f58466b.hashCode()) * 31) + Boolean.hashCode(this.f58467c);
    }

    @m80.k
    public String toString() {
        return "LavaQuestModel(lavaQuestInfo=" + this.f58465a + ", state=" + this.f58466b + ", ban=" + this.f58467c + ')';
    }
}
