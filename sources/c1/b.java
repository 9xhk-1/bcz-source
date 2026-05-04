package c1;

import android.graphics.Typeface;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f7451a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7452b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7453c;

    /* renamed from: d, reason: collision with root package name */
    public final float f7454d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public Typeface f7455e;

    public b(String str, String str2, String str3, float f11) {
        this.f7451a = str;
        this.f7452b = str2;
        this.f7453c = str3;
        this.f7454d = f11;
    }

    public float a() {
        return this.f7454d;
    }

    public String b() {
        return this.f7451a;
    }

    public String c() {
        return this.f7452b;
    }

    public String d() {
        return this.f7453c;
    }

    @Nullable
    public Typeface e() {
        return this.f7455e;
    }

    public void f(@Nullable Typeface typeface) {
        this.f7455e = typeface;
    }
}
