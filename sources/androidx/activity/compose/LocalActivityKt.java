package androidx.activity.compose;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LocalActivityKt {

    @k
    private static final ProvidableCompositionLocal<Activity> LocalActivity = CompositionLocalKt.compositionLocalWithComputedDefaultOf(new l<CompositionLocalAccessorScope, Activity>() { // from class: androidx.activity.compose.LocalActivityKt$LocalActivity$1
        @Override // x00.l
        public final Activity invoke(CompositionLocalAccessorScope compositionLocalAccessorScope) {
            Context context = (Context) compositionLocalAccessorScope.getCurrentValue(AndroidCompositionLocals_androidKt.getLocalContext());
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    context = null;
                    break;
                }
                if (context instanceof Activity) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            return (Activity) context;
        }
    });

    @k
    public static final ProvidableCompositionLocal<Activity> getLocalActivity() {
        return LocalActivity;
    }
}
