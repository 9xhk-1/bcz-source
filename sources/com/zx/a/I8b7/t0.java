package com.zx.a.I8b7;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final List<j0> f46689a = new ArrayList();

    public void a(int i11, String str, String str2, Throwable th2) {
        for (j0 j0Var : this.f46689a) {
            try {
                if (j0Var.a(i11, null)) {
                    j0Var.a(i11, null, str2, th2);
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
        }
    }

    public void a(j0 j0Var) {
        this.f46689a.add(j0Var);
    }
}
