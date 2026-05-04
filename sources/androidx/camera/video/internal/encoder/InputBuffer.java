package androidx.camera.video.internal.encoder;

import androidx.annotation.NonNull;
import com.google.common.util.concurrent.p1;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface InputBuffer {
    boolean cancel();

    @NonNull
    ByteBuffer getByteBuffer();

    @NonNull
    p1<Void> getTerminationFuture();

    void setEndOfStream(boolean z11);

    void setPresentationTimeUs(long j11);

    boolean submit();
}
