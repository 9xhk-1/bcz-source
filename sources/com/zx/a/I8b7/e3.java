package com.zx.a.I8b7;

import android.text.TextUtils;
import com.zx.sdk.api.ZXIDChangedListener;
import java.util.LinkedList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class e3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f46500a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ZXIDChangedListener f46501b;

    public e3(x2 x2Var, String str, ZXIDChangedListener zXIDChangedListener) {
        this.f46500a = str;
        this.f46501b = zXIDChangedListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            h3 a11 = x2.a();
            String str = this.f46500a;
            ZXIDChangedListener zXIDChangedListener = this.f46501b;
            q2 q2Var = a11.f46536c;
            q2Var.getClass();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            LinkedList<ZXIDChangedListener> linkedList = q2Var.f46669a.get(str);
            if (linkedList == null) {
                linkedList = new LinkedList<>();
            }
            linkedList.add(zXIDChangedListener);
            q2Var.f46669a.put(str, linkedList);
        } catch (Throwable th2) {
            g3.a(th2, f3.a("ZXManager.allowPermissionDialog failed: "));
        }
    }
}
