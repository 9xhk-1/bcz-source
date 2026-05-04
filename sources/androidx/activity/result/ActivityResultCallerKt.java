package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ActivityResultCallerKt {
    @k
    public static final <I, O> ActivityResultLauncher<g2> registerForActivityResult(@k ActivityResultCaller activityResultCaller, @k ActivityResultContract<I, O> contract, I i11, @k ActivityResultRegistry registry, @k final l<O, g2> callback) {
        g0.p(activityResultCaller, "<this>");
        g0.p(contract, "contract");
        g0.p(registry, "registry");
        g0.p(callback, "callback");
        return new ActivityResultCallerLauncher(activityResultCaller.registerForActivityResult(contract, registry, new ActivityResultCallback() { // from class: androidx.activity.result.a
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                l.this.invoke(obj);
            }
        }), contract, i11);
    }

    @k
    public static final <I, O> ActivityResultLauncher<g2> registerForActivityResult(@k ActivityResultCaller activityResultCaller, @k ActivityResultContract<I, O> contract, I i11, @k final l<O, g2> callback) {
        g0.p(activityResultCaller, "<this>");
        g0.p(contract, "contract");
        g0.p(callback, "callback");
        return new ActivityResultCallerLauncher(activityResultCaller.registerForActivityResult(contract, new ActivityResultCallback() { // from class: androidx.activity.result.b
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                l.this.invoke(obj);
            }
        }), contract, i11);
    }
}
