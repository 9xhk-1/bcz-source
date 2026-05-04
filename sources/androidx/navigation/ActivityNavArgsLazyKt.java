package androidx.navigation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.MainThread;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class ActivityNavArgsLazyKt {
    @MainThread
    public static final /* synthetic */ <Args extends NavArgs> NavArgsLazy<Args> navArgs(final Activity activity) {
        g0.p(activity, "<this>");
        g0.y(4, "Args");
        return new NavArgsLazy<>(o0.d(NavArgs.class), new x00.a<Bundle>() { // from class: androidx.navigation.ActivityNavArgsLazyKt$navArgs$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Bundle invoke() {
                Bundle bundle;
                Intent intent = activity.getIntent();
                if (intent != null) {
                    Activity activity2 = activity;
                    bundle = intent.getExtras();
                    if (bundle == null) {
                        throw new IllegalStateException("Activity " + activity2 + " has null extras in " + intent);
                    }
                } else {
                    bundle = null;
                }
                if (bundle != null) {
                    return bundle;
                }
                throw new IllegalStateException("Activity " + activity + " has a null Intent");
            }
        });
    }
}
