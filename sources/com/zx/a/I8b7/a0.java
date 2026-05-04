package com.zx.a.I8b7;

import com.zx.a.I8b7.l2;
import org.json.JSONArray;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class a0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f46422a;

    public a0(y yVar) {
        this.f46422a = yVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            y yVar = this.f46422a;
            if (yVar.f46747a != null) {
                yVar.f46747a = new JSONArray();
                l2 l2Var = l2.a.f46573a;
                l2Var.f46572a.getClass();
                l2Var.f46572a.a(23, "", true);
            }
        } catch (Throwable unused) {
        }
    }
}
