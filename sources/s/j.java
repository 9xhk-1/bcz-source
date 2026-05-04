package s;

import android.app.Activity;
import android.content.DialogInterface;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class j implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f87011a;

    public j(Activity activityToFinish) {
        this.f87011a = activityToFinish;
    }

    public final void a() {
        this.f87011a.finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        a();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i11) {
        a();
    }
}
