package androidx.activity.result;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResultCallerLauncher$resultContract$2;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ActivityResultCallerLauncher<I, O> extends ActivityResultLauncher<g2> {

    @k
    private final ActivityResultContract<I, O> callerContract;
    private final I callerInput;

    @k
    private final ActivityResultContract<g2, O> contract;

    @k
    private final ActivityResultLauncher<I> launcher;

    @k
    private final c0 resultContract$delegate;

    public ActivityResultCallerLauncher(@k ActivityResultLauncher<I> launcher, @k ActivityResultContract<I, O> callerContract, I i11) {
        g0.p(launcher, "launcher");
        g0.p(callerContract, "callerContract");
        this.launcher = launcher;
        this.callerContract = callerContract;
        this.callerInput = i11;
        this.resultContract$delegate = e0.c(new x00.a<ActivityResultCallerLauncher$resultContract$2.AnonymousClass1>(this) { // from class: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2
            final /* synthetic */ ActivityResultCallerLauncher<I, O> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v0, types: [androidx.activity.result.ActivityResultCallerLauncher$resultContract$2$1] */
            @Override // x00.a
            public final AnonymousClass1 invoke() {
                final ActivityResultCallerLauncher<I, O> activityResultCallerLauncher = this.this$0;
                return new ActivityResultContract<g2, O>() { // from class: androidx.activity.result.ActivityResultCallerLauncher$resultContract$2.1
                    @Override // androidx.activity.result.contract.ActivityResultContract
                    public O parseResult(int i12, Intent intent) {
                        return (O) activityResultCallerLauncher.getCallerContract().parseResult(i12, intent);
                    }

                    @Override // androidx.activity.result.contract.ActivityResultContract
                    public Intent createIntent(Context context, g2 input) {
                        g0.p(context, "context");
                        g0.p(input, "input");
                        return activityResultCallerLauncher.getCallerContract().createIntent(context, activityResultCallerLauncher.getCallerInput());
                    }
                };
            }
        });
        this.contract = getResultContract();
    }

    private final ActivityResultContract<g2, O> getResultContract() {
        return (ActivityResultContract) this.resultContract$delegate.getValue();
    }

    @k
    public final ActivityResultContract<I, O> getCallerContract() {
        return this.callerContract;
    }

    public final I getCallerInput() {
        return this.callerInput;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    @k
    public ActivityResultContract<g2, ?> getContract() {
        return this.contract;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public void unregister() {
        this.launcher.unregister();
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public void launch(@k g2 input, @l ActivityOptionsCompat activityOptionsCompat) {
        g0.p(input, "input");
        this.launcher.launch(this.callerInput, activityOptionsCompat);
    }
}
