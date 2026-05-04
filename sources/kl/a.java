package kl;

import a3.d0;
import com.badlogic.gdx.graphics.g2d.e;
import com.esotericsoftware.spine.attachments.Sequence;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a implements ol.c {

    /* renamed from: a, reason: collision with root package name */
    public i f66846a;

    public a(i iVar) {
        if (iVar == null) {
            throw new IllegalArgumentException("atlas cannot be null.");
        }
        this.f66846a = iVar;
    }

    @Override // ol.c
    public ol.j a(com.esotericsoftware.spine.h hVar, String str, String str2, @d0 Sequence sequence) {
        ol.j jVar = new ol.j(str);
        if (sequence != null) {
            g(str, str2, sequence);
            return jVar;
        }
        e.a d11 = this.f66846a.d(str2);
        if (d11 != null) {
            jVar.a(d11);
            return jVar;
        }
        throw new RuntimeException("Region not found in atlas: " + str2 + " (region attachment: " + str + pn.j.f81007d);
    }

    @Override // ol.c
    public ol.d b(com.esotericsoftware.spine.h hVar, String str) {
        return new ol.d(str);
    }

    @Override // ol.c
    public ol.i c(com.esotericsoftware.spine.h hVar, String str) {
        return new ol.i(str);
    }

    @Override // ol.c
    public ol.g d(com.esotericsoftware.spine.h hVar, String str, String str2, @d0 Sequence sequence) {
        ol.g gVar = new ol.g(str);
        if (sequence != null) {
            g(str, str2, sequence);
            return gVar;
        }
        e.a d11 = this.f66846a.d(str2);
        if (d11 != null) {
            gVar.a(d11);
            return gVar;
        }
        throw new RuntimeException("Region not found in atlas: " + str2 + " (mesh attachment: " + str + pn.j.f81007d);
    }

    @Override // ol.c
    public ol.h e(com.esotericsoftware.spine.h hVar, String str) {
        return new ol.h(str);
    }

    @Override // ol.c
    public ol.e f(com.esotericsoftware.spine.h hVar, String str) {
        return new ol.e(str);
    }

    public final void g(String str, String str2, Sequence sequence) {
        w1.o[] e11 = sequence.e();
        int length = e11.length;
        for (int i11 = 0; i11 < length; i11++) {
            String d11 = sequence.d(str2, i11);
            e.a d12 = this.f66846a.d(d11);
            e11[i11] = d12;
            if (d12 == null) {
                throw new RuntimeException("Region not found in atlas: " + d11 + " (sequence: " + str + pn.j.f81007d);
            }
        }
    }
}
