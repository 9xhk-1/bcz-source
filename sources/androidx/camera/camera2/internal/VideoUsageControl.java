package androidx.camera.camera2.internal;

import androidx.camera.core.Logger;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class VideoUsageControl {

    @m80.k
    private final Executor executor;

    @m80.k
    private final AtomicInteger mVideoUsage;

    public VideoUsageControl(@m80.k Executor executor) {
        kotlin.jvm.internal.g0.p(executor, "executor");
        this.executor = executor;
        this.mVideoUsage = new AtomicInteger(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void decrementUsage$lambda$1(VideoUsageControl this$0) {
        kotlin.jvm.internal.g0.p(this$0, "this$0");
        int decrementAndGet = this$0.mVideoUsage.decrementAndGet();
        if (decrementAndGet >= 0) {
            Logger.d("VideoUsageControl", "decrementUsage: mVideoUsage = " + decrementAndGet);
            return;
        }
        Logger.w("VideoUsageControl", "decrementUsage: mVideoUsage = " + decrementAndGet + ", which is less than 0!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void incrementUsage$lambda$0(VideoUsageControl this$0) {
        kotlin.jvm.internal.g0.p(this$0, "this$0");
        Logger.d("VideoUsageControl", "incrementUsage: mVideoUsage = " + this$0.mVideoUsage.incrementAndGet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reset$lambda$2(VideoUsageControl this$0) {
        kotlin.jvm.internal.g0.p(this$0, "this$0");
        this$0.resetDirectly();
    }

    public final void decrementUsage() {
        this.executor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.u3
            @Override // java.lang.Runnable
            public final void run() {
                VideoUsageControl.decrementUsage$lambda$1(VideoUsageControl.this);
            }
        });
    }

    public final int getUsage() {
        return this.mVideoUsage.get();
    }

    public final void incrementUsage() {
        this.executor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.w3
            @Override // java.lang.Runnable
            public final void run() {
                VideoUsageControl.incrementUsage$lambda$0(VideoUsageControl.this);
            }
        });
    }

    public final void reset() {
        this.executor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.v3
            @Override // java.lang.Runnable
            public final void run() {
                VideoUsageControl.reset$lambda$2(VideoUsageControl.this);
            }
        });
    }

    public final void resetDirectly() {
        this.mVideoUsage.set(0);
        Logger.d("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }
}
