package androidx.hilt.navigation;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavBackStackEntry;
import dagger.hilt.android.internal.lifecycle.d;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "HiltViewModelFactory")
/* loaded from: classes2.dex */
public final class HiltViewModelFactory {
    @j(name = "create")
    @k
    public static final ViewModelProvider.Factory create(@k Context context, @k NavBackStackEntry navBackStackEntry) {
        g0.p(context, "context");
        g0.p(navBackStackEntry, "navBackStackEntry");
        return create(context, navBackStackEntry.getDefaultViewModelProviderFactory());
    }

    @j(name = "create")
    @k
    public static final ViewModelProvider.Factory create(@k Context context, @k ViewModelProvider.Factory delegateFactory) {
        g0.p(context, "context");
        g0.p(delegateFactory, "delegateFactory");
        while (context instanceof ContextWrapper) {
            if (context instanceof ComponentActivity) {
                ViewModelProvider.Factory a11 = d.a((ComponentActivity) context, delegateFactory);
                g0.o(a11, "createInternal(\n        … */ delegateFactory\n    )");
                return a11;
            }
            context = ((ContextWrapper) context).getBaseContext();
            g0.o(context, "ctx.baseContext");
        }
        throw new IllegalStateException("Expected an activity context for creating a HiltViewModelFactory but instead found: " + context);
    }
}
