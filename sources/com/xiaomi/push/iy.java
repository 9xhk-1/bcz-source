package com.xiaomi.push;

import com.xiaomi.push.iz;
import java.io.ByteArrayOutputStream;

/* loaded from: classes8.dex */
public class iy {

    /* renamed from: a, reason: collision with root package name */
    private jd f46149a;

    /* renamed from: a, reason: collision with other field name */
    private final jk f833a;

    /* renamed from: a, reason: collision with other field name */
    private final ByteArrayOutputStream f834a;

    public iy() {
        this(new iz.a());
    }

    public byte[] a(is isVar) {
        this.f834a.reset();
        isVar.b(this.f46149a);
        return this.f834a.toByteArray();
    }

    public iy(jf jfVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f834a = byteArrayOutputStream;
        jk jkVar = new jk(byteArrayOutputStream);
        this.f833a = jkVar;
        this.f46149a = jfVar.a(jkVar);
    }
}
