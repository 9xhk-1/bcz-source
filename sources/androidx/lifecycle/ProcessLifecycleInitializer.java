package androidx.lifecycle;

import a00.h0;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.startup.AppInitializer;
import androidx.startup.Initializer;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ProcessLifecycleInitializer implements Initializer<LifecycleOwner> {
    @Override // androidx.startup.Initializer
    @k
    public List<Class<? extends Initializer<?>>> dependencies() {
        return h0.J();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    @k
    public LifecycleOwner create(@k Context context) {
        g0.p(context, "context");
        AppInitializer appInitializer = AppInitializer.getInstance(context);
        g0.o(appInitializer, "getInstance(context)");
        if (!appInitializer.isEagerlyInitialized(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        LifecycleDispatcher.init(context);
        ProcessLifecycleOwner.Companion companion = ProcessLifecycleOwner.Companion;
        companion.init$lifecycle_process_release(context);
        return companion.get();
    }
}
