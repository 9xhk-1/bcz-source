package wb;

import android.annotation.TargetApi;
import android.os.Environment;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    public static final long f96118b = 5120;

    /* renamed from: a, reason: collision with root package name */
    public String f96119a = Environment.getExternalStorageDirectory() + "/Android/data/" + pb.a.a().getPackageName() + "/logs/crash.log";

    public static boolean c(Exception e11) {
        return d(e11);
    }

    @TargetApi(19)
    public static boolean d(Exception e11) {
        return (e11 instanceof RuntimeException) || (e11 instanceof ReflectiveOperationException);
    }

    public static void e() {
        Thread.setDefaultUncaughtExceptionHandler(new b(Thread.getDefaultUncaughtExceptionHandler()));
    }

    public static void g(Exception e11) {
        if (c(e11)) {
            StringBuilder sb2 = new StringBuilder("\n[BCZ-CRASH] Fatal Exception, caused by: ");
            sb2.append(e11);
            StringWriter stringWriter = new StringWriter();
            e11.printStackTrace(new PrintWriter(stringWriter));
            String obj = stringWriter.toString();
            sb2.append("\n");
            sb2.append(obj);
            c.d("", sb2.toString(), new Object[0]);
            c.m(e11);
        }
    }

    public void a() {
        if (Environment.getExternalStorageState().equals("mounted")) {
            File file = new File(this.f96119a);
            if (file.isFile() && file.exists() && f(file.length())) {
                h(file);
            }
        }
    }

    public long b() {
        return f96118b;
    }

    public boolean f(long size) {
        return size >= b();
    }

    public abstract void h(File crash);
}
