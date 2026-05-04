package com.badlogic.gdx.graphics;

import a3.b1;
import androidx.media3.common.C;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public long f11549a;

    /* renamed from: b, reason: collision with root package name */
    public int f11550b;

    public e() {
        this(Integer.MAX_VALUE);
    }

    public void a() {
        int O;
        long c11 = b1.c();
        if (c11 - this.f11549a <= C.NANOS_PER_SECOND || (O = q1.g.f81379b.O()) >= this.f11550b) {
            return;
        }
        q1.g.f81378a.f("FPSLogger", "fps: " + O);
        this.f11549a = c11;
    }

    public void b(int i11) {
        this.f11550b = i11;
        this.f11549a = b1.c();
    }

    public e(int i11) {
        this.f11550b = i11;
        this.f11549a = b1.c();
    }
}
