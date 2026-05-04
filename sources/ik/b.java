package ik;

import androidx.annotation.NonNull;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public interface b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f60685a = "UTF-8";

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f60686b = Charset.forName("UTF-8");

    void a(@NonNull MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
