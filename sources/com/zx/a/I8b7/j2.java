package com.zx.a.I8b7;

import android.content.Context;
import com.zx.a.I8b7.v3;
import com.zx.module.base.Callback;
import com.zx.module.base.Listener;
import com.zx.module.base.ZXModule;
import com.zx.module.context.ContextHolder;
import com.zx.module.exception.ZXModuleInvokeException;
import com.zx.module.exception.ZXModuleOnCreateException;
import com.zx.module.exception.ZXModuleOnDestroyException;
import com.zx.module.exception.ZXModuleStartException;
import com.zx.sdk.common.utils.ZXTask;
import java.lang.reflect.Method;
import java.util.HashSet;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class j2 implements ZXModule {

    /* renamed from: a, reason: collision with root package name */
    public o3 f46554a;

    /* renamed from: b, reason: collision with root package name */
    public final h2 f46555b = new h2();

    @Override // com.zx.module.base.ZXModule
    public String getModuleIdentifier() {
        return "core-n";
    }

    @Override // com.zx.module.base.ZXModule
    public String getModuleVersion() {
        return "3.3.4.43514";
    }

    @Override // com.zx.module.base.ZXModule
    public String invoke(String str, String str2) throws ZXModuleInvokeException {
        h2 h2Var = this.f46555b;
        h2Var.getClass();
        try {
            String substring = p.a(str, "SHA256").substring(0, 16);
            if (!((HashSet) h2.f46531b).contains(substring)) {
                return h2Var.a(str + " not in invokableMethods", 3);
            }
            Method declaredMethod = h2.class.getDeclaredMethod("f" + substring, String.class);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(h2Var, str2);
        } catch (Exception e11) {
            r2.a(e11);
            throw new ZXModuleInvokeException("Cannot invoke " + str + ", nested exception is " + e11.getMessage(), e11);
        }
    }

    @Override // com.zx.module.base.ZXModule
    public String invokeAsync(String str, String str2, Callback callback) throws ZXModuleInvokeException {
        h2 h2Var = this.f46555b;
        h2Var.getClass();
        try {
            String substring = p.a(str, "SHA256").substring(0, 16);
            if (!((HashSet) h2.f46531b).contains(substring)) {
                String a11 = h2Var.a(str + " not in invokableMethods", 3);
                callback.callback(a11);
                return a11;
            }
            r2.a("开始执行invokeAsync: method:" + str + "; " + str2 + ":cb");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("f");
            sb2.append(substring);
            Method declaredMethod = h2.class.getDeclaredMethod(sb2.toString(), String.class, Callback.class);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(h2Var, str2, callback);
        } catch (Exception e11) {
            StringBuilder a12 = f3.a("开始执行invokeAsync:");
            a12.append(e11.getMessage());
            r2.b(a12.toString());
            throw new ZXModuleInvokeException("Cannot invokeAsync " + str + ", nested exception is " + e11.getMessage(), e11);
        }
    }

    @Override // com.zx.module.base.ZXModule
    public void onCreate(ContextHolder contextHolder) throws ZXModuleOnCreateException {
        t3 t3Var = new t3();
        this.f46554a = t3Var;
        Context context = (Context) contextHolder.getContext();
        try {
            if (!t3Var.f46703b.getAndSet(true)) {
                v3.f.f46726a.f46721a.execute(new s3(t3Var, context));
            }
        } catch (Throwable th2) {
            g3.a(th2, f3.a("ZXCore init failed: "));
            t3Var.f46703b.set(false);
        }
        this.f46555b.f46532a = this.f46554a;
    }

    @Override // com.zx.module.base.ZXModule
    public void setMessageListener(Listener listener) {
        t3 t3Var = (t3) this.f46554a;
        t3Var.getClass();
        t3Var.f46704c = new p3(t3Var, listener);
    }

    @Override // com.zx.module.base.ZXModule
    public void start() throws ZXModuleStartException {
        t3 t3Var = (t3) this.f46554a;
        if (t3Var.f46702a.compareAndSet(false, true)) {
            try {
                v3.f.f46726a.f46721a.execute(new ZXTask(new q3(t3Var), new r3(t3Var)));
            } catch (Throwable th2) {
                t3Var.f46704c.onMessage("MESSAGE_ON_ZXID_RECEIVED", e2.a(10007, th2.getMessage()));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ZXCore start failed: ");
                g3.a(th2, sb2);
            }
        }
    }

    @Override // com.zx.module.base.ZXModule
    public void onDestroy() throws ZXModuleOnDestroyException {
    }
}
