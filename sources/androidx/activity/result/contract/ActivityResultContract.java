package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public abstract class ActivityResultContract<I, O> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SynchronousResult<T> {
        private final T value;

        public SynchronousResult(T t11) {
            this.value = t11;
        }

        public final T getValue() {
            return this.value;
        }
    }

    @k
    public abstract Intent createIntent(@k Context context, I i11);

    @l
    public SynchronousResult<O> getSynchronousResult(@k Context context, I i11) {
        g0.p(context, "context");
        return null;
    }

    public abstract O parseResult(int i11, @l Intent intent);
}
