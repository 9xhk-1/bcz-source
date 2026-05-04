package vn;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(33)
/* loaded from: classes7.dex */
public class x extends u {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (x.this.f94245e.isEmpty()) {
                return;
            }
            outline.setPath(x.this.f94245e);
        }
    }

    public x(@NonNull View view) {
        l(view);
    }

    @DoNotInline
    private void l(View view) {
        view.setOutlineProvider(new a());
    }

    @Override // vn.u
    public void b(@NonNull View view) {
        view.setClipToOutline(!j());
        if (j()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // vn.u
    public boolean j() {
        return this.f94241a;
    }
}
