package kl;

import android.content.Context;
import com.esotericsoftware.spine.Skeleton;
import java.io.File;
import java.net.URL;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final i f66847a;

    /* renamed from: b, reason: collision with root package name */
    public final jl.i f66848b;

    /* renamed from: c, reason: collision with root package name */
    public final Skeleton f66849c;

    /* renamed from: d, reason: collision with root package name */
    public final jl.a f66850d;

    /* renamed from: e, reason: collision with root package name */
    public final com.esotericsoftware.spine.a f66851e;

    public b(i iVar, jl.i iVar2) {
        this.f66847a = iVar;
        this.f66848b = iVar2;
        Skeleton skeleton = new Skeleton(iVar2);
        this.f66849c = skeleton;
        jl.a aVar = new jl.a(iVar2);
        this.f66850d = aVar;
        this.f66851e = new com.esotericsoftware.spine.a(aVar);
        skeleton.d0(Skeleton.Physics.none);
    }

    public static b a(String str, String str2, Context context) {
        i e11 = i.e(str, context);
        return new b(e11, nl.c.a(e11, str2, context));
    }

    public static b b(File file, File file2) {
        i f11 = i.f(file);
        return new b(f11, nl.c.b(f11, file2));
    }

    public static b c(URL url, URL url2, File file) {
        i g11 = i.g(url, file);
        return new b(g11, nl.c.c(g11, url2, file));
    }

    public com.esotericsoftware.spine.a d() {
        return this.f66851e;
    }

    public jl.a e() {
        return this.f66850d;
    }

    public i f() {
        return this.f66847a;
    }

    public Skeleton g() {
        return this.f66849c;
    }

    public jl.i h() {
        return this.f66848b;
    }

    public void i(float f11) {
        this.f66851e.F(f11);
        this.f66851e.f(this.f66849c);
        this.f66849c.b0(f11);
        this.f66849c.d0(Skeleton.Physics.update);
    }
}
