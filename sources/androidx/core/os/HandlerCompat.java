package androidx.core.os;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class HandlerCompat {
    private static final String TAG = "HandlerCompat";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
        }

        public static Handler createAsync(Looper looper) {
            return Handler.createAsync(looper);
        }

        public static boolean postDelayed(Handler handler, Runnable runnable, Object obj, long j11) {
            return handler.postDelayed(runnable, obj, j11);
        }

        public static Handler createAsync(Looper looper, Handler.Callback callback) {
            return Handler.createAsync(looper, callback);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
        }

        public static boolean hasCallbacks(Handler handler, Runnable runnable) {
            return handler.hasCallbacks(runnable);
        }
    }

    private HandlerCompat() {
    }

    @NonNull
    public static Handler createAsync(@NonNull Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e11) {
            e = e11;
            Log.w(TAG, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e12) {
            e = e12;
            Log.w(TAG, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e13) {
            e = e13;
            Log.w(TAG, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e14) {
            Throwable cause = e14.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean hasCallbacks(@NonNull Handler handler, @NonNull Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.hasCallbacks(handler, runnable);
        }
        try {
            return ((Boolean) Handler.class.getMethod("hasCallbacks", Runnable.class).invoke(handler, runnable)).booleanValue();
        } catch (IllegalAccessException e11) {
            e = e11;
            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e);
        } catch (NoSuchMethodException e12) {
            e = e12;
            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e);
        } catch (NullPointerException e13) {
            e = e13;
            throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", e);
        } catch (InvocationTargetException e14) {
            Throwable cause = e14.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean postDelayed(@NonNull Handler handler, @NonNull Runnable runnable, @Nullable Object obj, long j11) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.postDelayed(handler, runnable, obj, j11);
        }
        Message obtain = Message.obtain(handler, runnable);
        obtain.obj = obj;
        return handler.sendMessageDelayed(obtain, j11);
    }

    @NonNull
    public static Handler createAsync(@NonNull Looper looper, @NonNull Handler.Callback callback) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.createAsync(looper, callback);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, callback, Boolean.TRUE);
        } catch (IllegalAccessException e11) {
            e = e11;
            Log.w(TAG, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper, callback);
        } catch (InstantiationException e12) {
            e = e12;
            Log.w(TAG, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper, callback);
        } catch (NoSuchMethodException e13) {
            e = e13;
            Log.w(TAG, "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper, callback);
        } catch (InvocationTargetException e14) {
            Throwable cause = e14.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }
}
