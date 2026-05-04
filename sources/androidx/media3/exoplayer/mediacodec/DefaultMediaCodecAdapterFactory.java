package androidx.media3.exoplayer.mediacodec;

import android.content.Context;
import android.os.HandlerThread;
import androidx.annotation.Nullable;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter;
import ho.p0;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class DefaultMediaCodecAdapterFactory implements MediaCodecAdapter.Factory {
    private static final int MODE_DEFAULT = 0;
    private static final int MODE_DISABLED = 2;
    private static final int MODE_ENABLED = 1;
    private static final String TAG = "DMCodecAdapterFactory";
    private boolean asyncCryptoFlagEnabled;
    private int asynchronousMode;

    @Nullable
    private final p0<HandlerThread> callbackThreadSupplier;

    @Nullable
    private final Context context;

    @Nullable
    private final p0<HandlerThread> queueingThreadSupplier;

    @Deprecated
    public DefaultMediaCodecAdapterFactory() {
        this.asynchronousMode = 0;
        this.asyncCryptoFlagEnabled = false;
        this.context = null;
        this.callbackThreadSupplier = null;
        this.queueingThreadSupplier = null;
    }

    private boolean shouldUseAsynchronousAdapterInDefaultMode() {
        int i11 = Util.SDK_INT;
        if (i11 >= 31) {
            return true;
        }
        Context context = this.context;
        return context != null && i11 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
    public MediaCodecAdapter createAdapter(MediaCodecAdapter.Configuration configuration) throws IOException {
        int i11;
        p0<HandlerThread> p0Var;
        if (Util.SDK_INT < 23 || !((i11 = this.asynchronousMode) == 1 || (i11 == 0 && shouldUseAsynchronousAdapterInDefaultMode()))) {
            return new SynchronousMediaCodecAdapter.Factory().createAdapter(configuration);
        }
        int trackType = MimeTypes.getTrackType(configuration.format.sampleMimeType);
        Log.i(TAG, "Creating an asynchronous MediaCodec adapter for track type " + Util.getTrackTypeString(trackType));
        p0<HandlerThread> p0Var2 = this.callbackThreadSupplier;
        AsynchronousMediaCodecAdapter.Factory factory = (p0Var2 == null || (p0Var = this.queueingThreadSupplier) == null) ? new AsynchronousMediaCodecAdapter.Factory(trackType) : new AsynchronousMediaCodecAdapter.Factory(p0Var2, p0Var);
        factory.experimentalSetAsyncCryptoFlagEnabled(this.asyncCryptoFlagEnabled);
        return factory.createAdapter(configuration);
    }

    @uo.a
    public DefaultMediaCodecAdapterFactory experimentalSetAsyncCryptoFlagEnabled(boolean z11) {
        this.asyncCryptoFlagEnabled = z11;
        return this;
    }

    @uo.a
    public DefaultMediaCodecAdapterFactory forceDisableAsynchronous() {
        this.asynchronousMode = 2;
        return this;
    }

    @uo.a
    public DefaultMediaCodecAdapterFactory forceEnableAsynchronous() {
        this.asynchronousMode = 1;
        return this;
    }

    public DefaultMediaCodecAdapterFactory(Context context) {
        this(context, null, null);
    }

    public DefaultMediaCodecAdapterFactory(Context context, @Nullable p0<HandlerThread> p0Var, @Nullable p0<HandlerThread> p0Var2) {
        this.context = context;
        this.asynchronousMode = 0;
        this.asyncCryptoFlagEnabled = false;
        this.callbackThreadSupplier = p0Var;
        this.queueingThreadSupplier = p0Var2;
    }
}
