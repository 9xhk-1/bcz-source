package com.badlogic.gdx.graphics;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.q;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class p extends j {

    /* renamed from: j, reason: collision with root package name */
    public static final Map<Application, com.badlogic.gdx.utils.a<p>> f12486j = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public q f12487i;

    public p(String... strArr) {
        this(m1(strArr));
    }

    public static void k1(Application application, p pVar) {
        Map<Application, com.badlogic.gdx.utils.a<p>> map = f12486j;
        com.badlogic.gdx.utils.a<p> aVar = map.get(application);
        if (aVar == null) {
            aVar = new com.badlogic.gdx.utils.a<>();
        }
        aVar.a(pVar);
        map.put(application, aVar);
    }

    public static void l1(Application application) {
        f12486j.remove(application);
    }

    public static v1.a[] m1(String... strArr) {
        v1.a[] aVarArr = new v1.a[strArr.length];
        for (int i11 = 0; i11 < strArr.length; i11++) {
            aVarArr[i11] = q1.g.f81382e.a(strArr[i11]);
        }
        return aVarArr;
    }

    public static String n1() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Managed TextureArrays/app: { ");
        Iterator<Application> it = f12486j.keySet().iterator();
        while (it.hasNext()) {
            sb2.append(f12486j.get(it.next()).f13179b);
            sb2.append(" ");
        }
        sb2.append(com.alipay.sdk.m.u.i.f11099d);
        return sb2.toString();
    }

    public static int o1() {
        return f12486j.get(q1.g.f81378a).f13179b;
    }

    public static void p1(Application application) {
        com.badlogic.gdx.utils.a<p> aVar = f12486j.get(application);
        if (aVar == null) {
            return;
        }
        for (int i11 = 0; i11 < aVar.f13179b; i11++) {
            aVar.get(i11).Q0();
        }
    }

    @Override // com.badlogic.gdx.graphics.j
    public int C0() {
        return this.f12487i.getWidth();
    }

    @Override // com.badlogic.gdx.graphics.j
    public int D() {
        return this.f12487i.getDepth();
    }

    @Override // com.badlogic.gdx.graphics.j
    public int I() {
        return this.f12487i.getHeight();
    }

    @Override // com.badlogic.gdx.graphics.j
    public boolean J0() {
        return this.f12487i.a();
    }

    @Override // com.badlogic.gdx.graphics.j
    public void Q0() {
        if (!J0()) {
            throw new GdxRuntimeException("Tried to reload an unmanaged TextureArray");
        }
        this.f12452b = q1.g.f81384g.p();
        q1(this.f12487i);
    }

    public final void q1(q qVar) {
        if (this.f12487i != null && qVar.a() != this.f12487i.a()) {
            throw new GdxRuntimeException("New data must have the same managed status as the old data");
        }
        this.f12487i = qVar;
        S();
        q1.g.f81386i.N4(g.L6, 0, qVar.c(), qVar.getWidth(), qVar.getHeight(), qVar.getDepth(), 0, qVar.c(), qVar.d(), null);
        if (!qVar.b()) {
            qVar.prepare();
        }
        qVar.e();
        a1(this.f12453c, this.f12454d);
        b1(this.f12455e, this.f12456f);
        q1.g.f81384g.glBindTexture(this.f12451a, 0);
    }

    public p(v1.a... aVarArr) {
        this(false, aVarArr);
    }

    public p(boolean z11, v1.a... aVarArr) {
        this(z11, Pixmap.Format.RGBA8888, aVarArr);
    }

    public p(boolean z11, Pixmap.Format format, v1.a... aVarArr) {
        this(q.a.a(format, z11, aVarArr));
    }

    public p(q qVar) {
        super(g.L6, q1.g.f81384g.p());
        if (q1.g.f81386i != null) {
            q1(qVar);
            if (qVar.a()) {
                k1(q1.g.f81378a, this);
                return;
            }
            return;
        }
        throw new GdxRuntimeException("TextureArray requires a device running with GLES 3.0 compatibilty");
    }
}
