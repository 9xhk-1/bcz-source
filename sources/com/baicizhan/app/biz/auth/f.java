package com.baicizhan.app.biz.auth;

import java.util.Locale;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f13699a = 12;

    /* renamed from: b, reason: collision with root package name */
    public static final int f13700b = 9;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final String f13701c = "AuthService";

    public static final String b(String str) {
        String substring = str.substring(12, 21);
        g0.o(substring, "substring(...)");
        String upperCase = substring.toUpperCase(Locale.ROOT);
        g0.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
