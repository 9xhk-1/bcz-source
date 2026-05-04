package com.badlogic.gdx;

import a3.j;
import q1.c;
import q1.d;
import q1.e;
import q1.l;
import q1.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface Application {

    /* renamed from: a, reason: collision with root package name */
    public static final int f11334a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f11335b = 3;

    /* renamed from: c, reason: collision with root package name */
    public static final int f11336c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f11337d = 1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum ApplicationType {
        Android,
        Desktop,
        HeadlessDesktop,
        Applet,
        WebGL,
        iOS
    }

    void a(String str, String str2, Throwable th2);

    void b(int i11);

    void c(String str, String str2, Throwable th2);

    void d(String str, String str2, Throwable th2);

    void e(String str, String str2);

    void exit();

    void f(String str, String str2);

    e g();

    j getClipboard();

    Input getInput();

    ApplicationType getType();

    int getVersion();

    void h(String str, String str2);

    int i();

    c j();

    long k();

    void l(l lVar);

    void m(l lVar);

    d n();

    long o();

    m p(String str);

    void q(Runnable runnable);

    Net r();

    void s(d dVar);

    Graphics t();

    Files u();
}
