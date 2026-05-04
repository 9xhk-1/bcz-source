package com.baicizhan.main.home.player;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.h
/* loaded from: classes4.dex */
public final class x1 implements d9 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f24317a;

    public /* synthetic */ x1(String str) {
        this.f24317a = str;
    }

    public static final /* synthetic */ x1 a(String str) {
        return new x1(str);
    }

    @m80.k
    public static String b(@m80.k String intent) {
        kotlin.jvm.internal.g0.p(intent, "intent");
        return intent;
    }

    public static boolean c(String str, Object obj) {
        return (obj instanceof x1) && kotlin.jvm.internal.g0.g(str, ((x1) obj).h());
    }

    public static final boolean d(String str, String str2) {
        return kotlin.jvm.internal.g0.g(str, str2);
    }

    public static int f(String str) {
        return str.hashCode();
    }

    public static String g(String str) {
        return "GameIntent(intent=" + str + pn.j.f81007d;
    }

    @m80.k
    public final String e() {
        return this.f24317a;
    }

    public boolean equals(Object obj) {
        return c(this.f24317a, obj);
    }

    public final /* synthetic */ String h() {
        return this.f24317a;
    }

    public int hashCode() {
        return f(this.f24317a);
    }

    public String toString() {
        return g(this.f24317a);
    }
}
