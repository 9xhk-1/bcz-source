package qg;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.home.plan.module.exam.JsModel;
import javax.inject.Inject;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class s0 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f82154b = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m0 f82155a;

    @Inject
    public s0(@m80.k m0 repo) {
        kotlin.jvm.internal.g0.p(repo, "repo");
        this.f82155a = repo;
    }

    @m80.k
    public final kotlinx.coroutines.flow.i<Pair<JsModel, String>> a() {
        return kotlinx.coroutines.flow.k.v0(this.f82155a.getState());
    }
}
