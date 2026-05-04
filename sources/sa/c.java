package sa;

import android.view.View;
import androidx.annotation.CallSuper;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c implements View.OnClickListener {
    public static final int PROTECTED_DELAY = 1000;

    @Override // android.view.View.OnClickListener
    @CallSuper
    public void onClick(final View v11) {
        v11.setEnabled(false);
        v11.postDelayed(new Runnable() { // from class: sa.b
            @Override // java.lang.Runnable
            public final void run() {
                v11.setEnabled(true);
            }
        }, 1000L);
    }
}
