package oc;

import android.app.Activity;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public List<d> f76754a;

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f76754a = arrayList;
        arrayList.add(new pc.b());
    }

    @Override // oc.d
    public void a(Activity activity, a appParam) {
        Iterator<d> it = this.f76754a.iterator();
        while (it.hasNext()) {
            it.next().a(activity, appParam);
        }
    }

    @Override // oc.d
    public void b(Context context) {
        Iterator<d> it = this.f76754a.iterator();
        while (it.hasNext()) {
            it.next().b(context);
        }
    }

    @Override // oc.d
    public boolean c(Context context) {
        return true;
    }

    public void d(d iPush) {
        if (iPush != null) {
            this.f76754a.add(iPush);
        }
    }
}
