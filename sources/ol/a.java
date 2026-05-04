package ol;

import a3.d0;
import com.badlogic.gdx.graphics.g2d.e;
import com.esotericsoftware.spine.attachments.Sequence;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public com.badlogic.gdx.graphics.g2d.e f77548a;

    public a(com.badlogic.gdx.graphics.g2d.e eVar) {
        if (eVar == null) {
            throw new IllegalArgumentException("atlas cannot be null.");
        }
        this.f77548a = eVar;
    }

    private void g(String str, String str2, Sequence sequence) {
        o[] e11 = sequence.e();
        int length = e11.length;
        for (int i11 = 0; i11 < length; i11++) {
            String d11 = sequence.d(str2, i11);
            e.a Z = this.f77548a.Z(d11);
            e11[i11] = Z;
            if (Z == null) {
                throw new RuntimeException("Region not found in atlas: " + d11 + " (sequence: " + str + pn.j.f81007d);
            }
        }
    }

    @Override // ol.c
    public j a(com.esotericsoftware.spine.h hVar, String str, String str2, @d0 Sequence sequence) {
        j jVar = new j(str);
        if (sequence != null) {
            g(str, str2, sequence);
            return jVar;
        }
        e.a Z = this.f77548a.Z(str2);
        if (Z != null) {
            jVar.a(Z);
            return jVar;
        }
        throw new RuntimeException("Region not found in atlas: " + str2 + " (region attachment: " + str + pn.j.f81007d);
    }

    @Override // ol.c
    public d b(com.esotericsoftware.spine.h hVar, String str) {
        return new d(str);
    }

    @Override // ol.c
    public i c(com.esotericsoftware.spine.h hVar, String str) {
        return new i(str);
    }

    @Override // ol.c
    public g d(com.esotericsoftware.spine.h hVar, String str, String str2, @d0 Sequence sequence) {
        g gVar = new g(str);
        if (sequence != null) {
            g(str, str2, sequence);
            return gVar;
        }
        e.a Z = this.f77548a.Z(str2);
        if (Z != null) {
            gVar.a(Z);
            return gVar;
        }
        throw new RuntimeException("Region not found in atlas: " + str2 + " (mesh attachment: " + str + pn.j.f81007d);
    }

    @Override // ol.c
    public h e(com.esotericsoftware.spine.h hVar, String str) {
        return new h(str);
    }

    @Override // ol.c
    public e f(com.esotericsoftware.spine.h hVar, String str) {
        return new e(str);
    }
}
