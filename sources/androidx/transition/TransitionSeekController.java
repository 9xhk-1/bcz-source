package androidx.transition;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.core.util.Consumer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface TransitionSeekController {
    void addOnProgressChangedListener(@NonNull Consumer<TransitionSeekController> consumer);

    void addOnReadyListener(@NonNull Consumer<TransitionSeekController> consumer);

    void animateToEnd();

    void animateToStart(@NonNull Runnable runnable);

    @FloatRange(from = 0.0d, to = 1.0d)
    float getCurrentFraction();

    @IntRange(from = 0)
    long getCurrentPlayTimeMillis();

    @IntRange(from = 0)
    long getDurationMillis();

    boolean isReady();

    void removeOnProgressChangedListener(@NonNull Consumer<TransitionSeekController> consumer);

    void removeOnReadyListener(@NonNull Consumer<TransitionSeekController> consumer);

    void setCurrentFraction(@FloatRange(from = 0.0d, to = 1.0d) float f11);

    void setCurrentPlayTimeMillis(@IntRange(from = 0) long j11);
}
