package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.PendingIntentCompat;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class PendingIntentCompat {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
        }

        @DoNotInline
        public static void send(@NonNull PendingIntent pendingIntent, @NonNull Context context, int i11, @NonNull Intent intent, @Nullable PendingIntent.OnFinished onFinished, @Nullable Handler handler, @Nullable String str, @Nullable Bundle bundle) throws PendingIntent.CanceledException {
            pendingIntent.send(context, i11, intent, onFinished, handler, str, bundle);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        public static PendingIntent getForegroundService(Context context, int i11, Intent intent, int i12) {
            return PendingIntent.getForegroundService(context, i11, intent, i12);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface Flags {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class GatedCallback implements Closeable {

        @Nullable
        private PendingIntent.OnFinished mCallback;
        private final CountDownLatch mComplete = new CountDownLatch(1);
        private boolean mSuccess = false;

        public GatedCallback(@Nullable PendingIntent.OnFinished onFinished) {
            this.mCallback = onFinished;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onSendFinished(PendingIntent pendingIntent, Intent intent, int i11, String str, Bundle bundle) {
            boolean z11 = false;
            while (true) {
                try {
                    this.mComplete.await();
                    break;
                } catch (InterruptedException unused) {
                    z11 = true;
                    pendingIntent = pendingIntent;
                    intent = intent;
                    i11 = i11;
                    str = str;
                    bundle = bundle;
                } catch (Throwable th2) {
                    if (!z11) {
                        throw th2;
                    }
                    Thread.currentThread().interrupt();
                    throw th2;
                }
            }
            if (z11) {
                Thread.currentThread().interrupt();
            }
            PendingIntent.OnFinished onFinished = this.mCallback;
            if (onFinished != null) {
                onFinished.onSendFinished(pendingIntent, intent, i11, str, bundle);
                this.mCallback = null;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.mSuccess) {
                this.mCallback = null;
            }
            this.mComplete.countDown();
        }

        public void complete() {
            this.mSuccess = true;
        }

        @Nullable
        public PendingIntent.OnFinished getCallback() {
            if (this.mCallback == null) {
                return null;
            }
            return new PendingIntent.OnFinished() { // from class: androidx.core.app.m
                @Override // android.app.PendingIntent.OnFinished
                public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i11, String str, Bundle bundle) {
                    PendingIntentCompat.GatedCallback.this.onSendFinished(pendingIntent, intent, i11, str, bundle);
                }
            };
        }
    }

    private PendingIntentCompat() {
    }

    private static int addMutabilityFlags(boolean z11, int i11) {
        int i12;
        if (!z11) {
            i12 = 67108864;
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                return i11;
            }
            i12 = 33554432;
        }
        return i12 | i11;
    }

    @NonNull
    public static PendingIntent getActivities(@NonNull Context context, int i11, @NonNull @SuppressLint({"ArrayReturn"}) Intent[] intentArr, int i12, @Nullable Bundle bundle, boolean z11) {
        return PendingIntent.getActivities(context, i11, intentArr, addMutabilityFlags(z11, i12), bundle);
    }

    @Nullable
    public static PendingIntent getActivity(@NonNull Context context, int i11, @NonNull Intent intent, int i12, boolean z11) {
        return PendingIntent.getActivity(context, i11, intent, addMutabilityFlags(z11, i12));
    }

    @Nullable
    public static PendingIntent getBroadcast(@NonNull Context context, int i11, @NonNull Intent intent, int i12, boolean z11) {
        return PendingIntent.getBroadcast(context, i11, intent, addMutabilityFlags(z11, i12));
    }

    @NonNull
    @RequiresApi(26)
    public static PendingIntent getForegroundService(@NonNull Context context, int i11, @NonNull Intent intent, int i12, boolean z11) {
        return Api26Impl.getForegroundService(context, i11, intent, addMutabilityFlags(z11, i12));
    }

    @Nullable
    public static PendingIntent getService(@NonNull Context context, int i11, @NonNull Intent intent, int i12, boolean z11) {
        return PendingIntent.getService(context, i11, intent, addMutabilityFlags(z11, i12));
    }

    @SuppressLint({"LambdaLast"})
    public static void send(@NonNull PendingIntent pendingIntent, int i11, @Nullable PendingIntent.OnFinished onFinished, @Nullable Handler handler) throws PendingIntent.CanceledException {
        GatedCallback gatedCallback = new GatedCallback(onFinished);
        try {
            pendingIntent.send(i11, gatedCallback.getCallback(), handler);
            gatedCallback.complete();
            gatedCallback.close();
        } catch (Throwable th2) {
            try {
                gatedCallback.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @NonNull
    public static PendingIntent getActivities(@NonNull Context context, int i11, @NonNull @SuppressLint({"ArrayReturn"}) Intent[] intentArr, int i12, boolean z11) {
        return PendingIntent.getActivities(context, i11, intentArr, addMutabilityFlags(z11, i12));
    }

    @Nullable
    public static PendingIntent getActivity(@NonNull Context context, int i11, @NonNull Intent intent, int i12, @Nullable Bundle bundle, boolean z11) {
        return PendingIntent.getActivity(context, i11, intent, addMutabilityFlags(z11, i12), bundle);
    }

    @SuppressLint({"LambdaLast"})
    public static void send(@NonNull PendingIntent pendingIntent, @NonNull @SuppressLint({"ContextFirst"}) Context context, int i11, @NonNull Intent intent, @Nullable PendingIntent.OnFinished onFinished, @Nullable Handler handler) throws PendingIntent.CanceledException {
        send(pendingIntent, context, i11, intent, onFinished, handler, null, null);
    }

    @SuppressLint({"LambdaLast"})
    public static void send(@NonNull PendingIntent pendingIntent, @NonNull @SuppressLint({"ContextFirst"}) Context context, int i11, @NonNull Intent intent, @Nullable PendingIntent.OnFinished onFinished, @Nullable Handler handler, @Nullable String str, @Nullable Bundle bundle) throws PendingIntent.CanceledException {
        GatedCallback gatedCallback = new GatedCallback(onFinished);
        try {
            Api23Impl.send(pendingIntent, context, i11, intent, onFinished, handler, str, bundle);
            gatedCallback.complete();
            gatedCallback.close();
        } finally {
        }
    }
}
