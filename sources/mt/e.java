package mt;

import android.app.Dialog;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e extends Fragment {

    /* renamed from: c, reason: collision with root package name */
    public static final int f73681c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f73682d = 2;

    /* renamed from: e, reason: collision with root package name */
    public static final int f73683e = 2;

    /* renamed from: a, reason: collision with root package name */
    public f f73684a;

    /* renamed from: b, reason: collision with root package name */
    public b f73685b;

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i11, int i12, @Nullable Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 2 && t()) {
            this.f73685b.c(new ArrayList(this.f73684a.f73701o));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        Dialog dialog;
        super.onDestroy();
        if (t() && (dialog = this.f73684a.f73689c) != null && dialog.isShowing()) {
            this.f73684a.f73689c.dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i11, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (i11 == 1) {
            w(strArr, iArr);
        } else if (i11 == 2) {
            v();
        }
    }

    public final boolean t() {
        if (this.f73684a != null && this.f73685b != null) {
            return true;
        }
        Log.w("PermissionX", "PermissionBuilder and ChainTask should not be null at this time, so we can do nothing in this case.");
        return false;
    }

    public final void v() {
        if (t()) {
            if (jt.c.c(getContext(), g.f73723e)) {
                this.f73684a.f73697k.add(g.f73723e);
                this.f73684a.f73698l.remove(g.f73723e);
                this.f73684a.f73699m.remove(g.f73723e);
                this.f73685b.a();
                return;
            }
            boolean shouldShowRequestPermissionRationale = shouldShowRequestPermissionRationale(g.f73723e);
            f fVar = this.f73684a;
            if ((fVar.f73703q == null && fVar.f73704r == null) || !shouldShowRequestPermissionRationale) {
                if (fVar.f73705s != null && !shouldShowRequestPermissionRationale) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(g.f73723e);
                    this.f73684a.f73705s.a(this.f73685b.b(), arrayList);
                }
                this.f73685b.a();
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(g.f73723e);
            f fVar2 = this.f73684a;
            kt.b bVar = fVar2.f73704r;
            if (bVar != null) {
                bVar.a(this.f73685b.d(), arrayList2, false);
            } else {
                fVar2.f73703q.a(this.f73685b.d(), arrayList2);
            }
            if (this.f73684a.f73694h) {
                return;
            }
            this.f73685b.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0131, code lost:
    
        if (r6.f73684a.f73694h == false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(@androidx.annotation.NonNull java.lang.String[] r7, @androidx.annotation.NonNull int[] r8) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mt.e.w(java.lang.String[], int[]):void");
    }

    public void x(f fVar, b bVar) {
        this.f73684a = fVar;
        this.f73685b = bVar;
        requestPermissions(new String[]{g.f73723e}, 2);
    }

    public void y(f fVar, Set<String> set, b bVar) {
        this.f73684a = fVar;
        this.f73685b = bVar;
        requestPermissions((String[]) set.toArray(new String[0]), 1);
    }
}
