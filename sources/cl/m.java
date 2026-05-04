package cl;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class m<Z> extends e<Z> {

    /* renamed from: e, reason: collision with root package name */
    public static final int f8766e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final Handler f8767f = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: d, reason: collision with root package name */
    public final com.bumptech.glide.k f8768d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((m) message.obj).a();
            return true;
        }
    }

    public m(com.bumptech.glide.k kVar, int i11, int i12) {
        super(i11, i12);
        this.f8768d = kVar;
    }

    public static <Z> m<Z> b(com.bumptech.glide.k kVar, int i11, int i12) {
        return new m<>(kVar, i11, i12);
    }

    public void a() {
        this.f8768d.clear(this);
    }

    @Override // cl.p
    public void h(@NonNull Z z11, @Nullable dl.f<? super Z> fVar) {
        bl.d f11 = f();
        if (f11 == null || !f11.isComplete()) {
            return;
        }
        f8767f.obtainMessage(1, this).sendToTarget();
    }

    @Override // cl.p
    public void i(@Nullable Drawable drawable) {
    }
}
