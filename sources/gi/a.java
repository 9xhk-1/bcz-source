package gi;

import androidx.appcompat.app.AppCompatActivity;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a {
    public static final void a(@m80.k AppCompatActivity appCompatActivity, int i11, int i12) {
        kotlin.jvm.internal.g0.p(appCompatActivity, "<this>");
        va.g.h(appCompatActivity, appCompatActivity.getString(i11), i12);
    }

    public static final void b(@m80.k AppCompatActivity appCompatActivity, @m80.k String message, int i11) {
        kotlin.jvm.internal.g0.p(appCompatActivity, "<this>");
        kotlin.jvm.internal.g0.p(message, "message");
        va.g.h(appCompatActivity, message, i11);
    }

    public static final void c(@m80.k AppCompatActivity appCompatActivity, @m80.k Throwable e11, int i11) {
        kotlin.jvm.internal.g0.p(appCompatActivity, "<this>");
        kotlin.jvm.internal.g0.p(e11, "e");
        va.g.h(appCompatActivity, va.g.d(e11), i11);
    }

    public static /* synthetic */ void d(AppCompatActivity appCompatActivity, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 0;
        }
        a(appCompatActivity, i11, i12);
    }

    public static /* synthetic */ void e(AppCompatActivity appCompatActivity, String str, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        b(appCompatActivity, str, i11);
    }

    public static /* synthetic */ void f(AppCompatActivity appCompatActivity, Throwable th2, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        c(appCompatActivity, th2, i11);
    }
}
