package androidx.camera.video.internal.encoder;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface EncoderFactory {
    @NonNull
    Encoder createEncoder(@NonNull Executor executor, @NonNull EncoderConfig encoderConfig) throws InvalidConfigException;
}
