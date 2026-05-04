package com.xiaomi.push;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* loaded from: classes8.dex */
public abstract class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private Context f46417a;

    /* renamed from: a, reason: collision with other field name */
    private File f1048a;

    /* renamed from: a, reason: collision with other field name */
    private Runnable f1049a;

    private v(Context context, File file) {
        this.f46417a = context;
        this.f1048a = file;
    }

    public static void a(Context context, File file, Runnable runnable) {
        new w(context, file, runnable).run();
    }

    public abstract void a(Context context);

    @Override // java.lang.Runnable
    public final void run() {
        u uVar = null;
        try {
            try {
                if (this.f1048a == null) {
                    this.f1048a = new File(this.f46417a.getFilesDir(), "default_locker");
                }
                uVar = u.a(this.f46417a, this.f1048a);
                Runnable runnable = this.f1049a;
                if (runnable != null) {
                    runnable.run();
                }
                a(this.f46417a);
                if (uVar != null) {
                    uVar.a();
                }
            } catch (IOException e11) {
                e11.printStackTrace();
                if (uVar != null) {
                    uVar.a();
                }
            }
        } catch (Throwable th2) {
            if (uVar != null) {
                uVar.a();
            }
            throw th2;
        }
    }

    public /* synthetic */ v(Context context, File file, w wVar) {
        this(context, file);
    }
}
