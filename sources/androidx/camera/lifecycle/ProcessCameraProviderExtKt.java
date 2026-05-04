package androidx.camera.lifecycle;

import android.content.Context;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.concurrent.futures.ListenableFutureKt;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ProcessCameraProviderExtKt {
    @l
    public static final Object awaitInstance(@k ProcessCameraProvider.Companion companion, @k Context context, @k j00.c<? super ProcessCameraProvider> cVar) {
        return ListenableFutureKt.await(companion.getInstance(context), cVar);
    }
}
