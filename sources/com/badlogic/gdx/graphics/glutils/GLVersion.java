package com.badlogic.gdx.graphics.glutils;

import com.badlogic.gdx.Application;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q1.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class GLVersion {

    /* renamed from: a, reason: collision with root package name */
    public int f12212a;

    /* renamed from: b, reason: collision with root package name */
    public int f12213b;

    /* renamed from: c, reason: collision with root package name */
    public int f12214c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12215d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12216e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12217f;

    /* renamed from: g, reason: collision with root package name */
    public final Type f12218g;

    /* renamed from: h, reason: collision with root package name */
    public final String f12219h = "GLVersion";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Type {
        OpenGL,
        GLES,
        WebGL,
        NONE
    }

    public GLVersion(Application.ApplicationType applicationType, String str, String str2, String str3) {
        if (applicationType == Application.ApplicationType.Android) {
            this.f12218g = Type.GLES;
        } else if (applicationType == Application.ApplicationType.iOS) {
            this.f12218g = Type.GLES;
        } else if (applicationType == Application.ApplicationType.Desktop) {
            this.f12218g = Type.OpenGL;
        } else if (applicationType == Application.ApplicationType.Applet) {
            this.f12218g = Type.OpenGL;
        } else if (applicationType == Application.ApplicationType.WebGL) {
            this.f12218g = Type.WebGL;
        } else {
            this.f12218g = Type.NONE;
        }
        Type type = this.f12218g;
        if (type == Type.GLES) {
            a("OpenGL ES (\\d(\\.\\d){0,2})", str);
        } else if (type == Type.WebGL) {
            a("WebGL (\\d(\\.\\d){0,2})", str);
        } else if (type == Type.OpenGL) {
            a("(\\d(\\.\\d){0,2})", str);
        } else {
            this.f12212a = -1;
            this.f12213b = -1;
            this.f12214c = -1;
            str2 = "";
            str3 = "";
        }
        this.f12215d = str;
        this.f12216e = str2;
        this.f12217f = str3;
    }

    public final void a(String str, String str2) {
        Matcher matcher = Pattern.compile(str).matcher(str2);
        if (matcher.find()) {
            String[] split = matcher.group(1).split("\\.");
            this.f12212a = k(split[0], 2);
            this.f12213b = split.length < 2 ? 0 : k(split[1], 0);
            this.f12214c = split.length >= 3 ? k(split[2], 0) : 0;
            return;
        }
        g.f81378a.f("GLVersion", "Invalid version string: " + str2);
        this.f12212a = 2;
        this.f12213b = 0;
        this.f12214c = 0;
    }

    public String b() {
        return "Type: " + this.f12218g + "\nVersion: " + this.f12212a + ":" + this.f12213b + ":" + this.f12214c + "\nVendor: " + this.f12216e + "\nRenderer: " + this.f12217f;
    }

    public int c() {
        return this.f12212a;
    }

    public int d() {
        return this.f12213b;
    }

    public int e() {
        return this.f12214c;
    }

    public String f() {
        return this.f12217f;
    }

    public Type g() {
        return this.f12218g;
    }

    public String h() {
        return this.f12216e;
    }

    public String i() {
        return this.f12215d;
    }

    public boolean j(int i11, int i12) {
        int i13 = this.f12212a;
        if (i13 <= i11) {
            return i13 == i11 && this.f12213b >= i12;
        }
        return true;
    }

    public final int k(String str, int i11) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            g.f81378a.h("libGDX GL", "Error parsing number: " + str + ", assuming: " + i11);
            return i11;
        }
    }
}
