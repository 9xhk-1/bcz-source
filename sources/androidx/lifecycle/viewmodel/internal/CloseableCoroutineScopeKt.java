package androidx.lifecycle.viewmodel.internal;

import c40.h1;
import c40.l3;
import c40.r0;
import kotlin.NotImplementedError;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class CloseableCoroutineScopeKt {

    @k
    public static final String VIEW_MODEL_SCOPE_KEY = "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY";

    @k
    public static final CloseableCoroutineScope asCloseable(@k r0 r0Var) {
        g0.p(r0Var, "<this>");
        return new CloseableCoroutineScope(r0Var);
    }

    @k
    public static final CloseableCoroutineScope createViewModelScope() {
        d dVar;
        try {
            dVar = h1.e().q();
        } catch (IllegalStateException unused) {
            dVar = EmptyCoroutineContext.INSTANCE;
        } catch (NotImplementedError unused2) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        return new CloseableCoroutineScope(dVar.plus(l3.c(null, 1, null)));
    }
}
