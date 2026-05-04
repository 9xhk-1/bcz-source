package qg;

import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Singleton;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ScriptableObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@pu.e({fv.a.class})
@nu.h
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final d f82112a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final int f82113b = 0;

    @Singleton
    @nu.i
    @m80.k
    public final com.baicizhan.main.home.plan.module.exam.a a() {
        Context enter = Context.enter();
        enter.setOptimizationLevel(-1);
        ScriptableObject initStandardObjects = enter.initStandardObjects();
        kotlin.jvm.internal.g0.m(initStandardObjects);
        return new com.baicizhan.main.home.plan.module.exam.a(initStandardObjects);
    }

    @Singleton
    @nu.i
    @m80.k
    public final l0 b(@m80.k com.baicizhan.main.home.plan.module.exam.a jsBridge) {
        kotlin.jvm.internal.g0.p(jsBridge, "jsBridge");
        return new l0(jsBridge);
    }
}
