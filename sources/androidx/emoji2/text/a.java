package androidx.emoji2.text;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f4367a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f4367a.post(runnable);
    }
}
