package qg;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.activity.schedule_v2.mutimode.data.e;
import javax.inject.Inject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class y0 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f82178b = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m0 f82179a;

    @Inject
    public y0(@m80.k m0 repo) {
        kotlin.jvm.internal.g0.p(repo, "repo");
        this.f82179a = repo;
    }

    public final void a(@m80.l String str) {
        if (ch.m.f8648a.a() instanceof e.g) {
            this.f82179a.b(str);
        }
    }
}
