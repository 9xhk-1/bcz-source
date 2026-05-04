package c4;

import c40.h1;
import c40.m0;
import java.io.File;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class o {
    @m80.k
    public static final String a() {
        String absolutePath;
        File externalFilesDir = n3.h.f().getExternalFilesDir("");
        return (externalFilesDir == null || (absolutePath = externalFilesDir.getAbsolutePath()) == null) ? "error" : absolutePath;
    }

    @m80.k
    public static final m0 b() {
        return h1.c();
    }

    @m80.k
    public static final m0 c() {
        return h1.e();
    }
}
