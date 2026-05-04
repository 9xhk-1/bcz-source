package vn;

import android.view.View;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class v extends u {
    @Override // vn.u
    public void b(@NonNull View view) {
        if (this.f94243c == null || this.f94244d.isEmpty() || !j()) {
            return;
        }
        view.invalidate();
    }

    @Override // vn.u
    public boolean j() {
        return true;
    }
}
