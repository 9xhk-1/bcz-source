package gi;

import android.app.Dialog;
import android.util.SparseArray;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray<Dialog> f53735a = new SparseArray<>();

    public void a() {
        for (int i11 = 0; i11 < this.f53735a.size(); i11++) {
            Dialog valueAt = this.f53735a.valueAt(i11);
            if (valueAt != null) {
                valueAt.dismiss();
            }
        }
    }

    public Dialog b(int id2) {
        return this.f53735a.get(id2);
    }

    public void c(int id2, Dialog dialog) {
        Dialog dialog2 = this.f53735a.get(id2);
        if (dialog2 != null) {
            dialog2.dismiss();
        }
        this.f53735a.put(id2, dialog);
    }
}
