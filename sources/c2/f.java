package c2;

import com.badlogic.gdx.math.Matrix4;
import x1.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public b f7511a;

    /* renamed from: b, reason: collision with root package name */
    public x1.d f7512b;

    /* renamed from: c, reason: collision with root package name */
    public com.badlogic.gdx.utils.b<c, Matrix4> f7513c;

    /* renamed from: d, reason: collision with root package name */
    public Matrix4[] f7514d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7515e = true;

    public f() {
    }

    public f a() {
        return new f().b(this);
    }

    public f b(f fVar) {
        this.f7511a = new b(fVar.f7511a);
        this.f7512b = fVar.f7512b;
        this.f7515e = fVar.f7515e;
        com.badlogic.gdx.utils.b<c, Matrix4> bVar = fVar.f7513c;
        if (bVar == null) {
            this.f7513c = null;
            this.f7514d = null;
            return this;
        }
        com.badlogic.gdx.utils.b<c, Matrix4> bVar2 = this.f7513c;
        if (bVar2 == null) {
            this.f7513c = new com.badlogic.gdx.utils.b<>(true, bVar.f13193c, c.class, Matrix4.class);
        } else {
            bVar2.clear();
        }
        this.f7513c.z(fVar.f7513c);
        Matrix4[] matrix4Arr = this.f7514d;
        if (matrix4Arr == null || matrix4Arr.length != this.f7513c.f13193c) {
            this.f7514d = new Matrix4[this.f7513c.f13193c];
        }
        int i11 = 0;
        while (true) {
            Matrix4[] matrix4Arr2 = this.f7514d;
            if (i11 >= matrix4Arr2.length) {
                return this;
            }
            if (matrix4Arr2[i11] == null) {
                matrix4Arr2[i11] = new Matrix4();
            }
            i11++;
        }
    }

    public i c(i iVar) {
        iVar.f97049c = this.f7512b;
        iVar.f97048b.d(this.f7511a);
        iVar.f97051e = this.f7514d;
        return iVar;
    }

    public f(b bVar, x1.d dVar) {
        this.f7511a = bVar;
        this.f7512b = dVar;
    }
}
