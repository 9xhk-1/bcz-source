package l2;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import java.util.Comparator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e implements n, Comparator<x1.i> {

    /* renamed from: a, reason: collision with root package name */
    public com.badlogic.gdx.graphics.a f69168a;

    /* renamed from: b, reason: collision with root package name */
    public final Vector3 f69169b = new Vector3();

    /* renamed from: c, reason: collision with root package name */
    public final Vector3 f69170c = new Vector3();

    @Override // l2.n
    public void a(com.badlogic.gdx.graphics.a aVar, com.badlogic.gdx.utils.a<x1.i> aVar2) {
        this.f69168a = aVar;
        aVar2.sort(this);
    }

    @Override // java.util.Comparator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compare(x1.i iVar, x1.i iVar2) {
        x1.d dVar = iVar.f97049c;
        long j11 = y1.a.f98941j;
        int i11 = 0;
        boolean z11 = dVar.p(j11) && ((y1.a) iVar.f97049c.l(j11)).f98942e;
        if (z11 != (iVar2.f97049c.p(j11) && ((y1.a) iVar2.f97049c.l(j11)).f98942e)) {
            return z11 ? 1 : -1;
        }
        c(iVar.f97047a, iVar.f97048b.f7491f, this.f69169b);
        c(iVar2.f97047a, iVar2.f97048b.f7491f, this.f69170c);
        float dst2 = ((int) (this.f69168a.f11508a.dst2(this.f69169b) * 1000.0f)) - ((int) (this.f69168a.f11508a.dst2(this.f69170c) * 1000.0f));
        if (dst2 < 0.0f) {
            i11 = -1;
        } else if (dst2 > 0.0f) {
            i11 = 1;
        }
        return z11 ? -i11 : i11;
    }

    public final Vector3 c(Matrix4 matrix4, Vector3 vector3, Vector3 vector32) {
        if (vector3.isZero()) {
            matrix4.getTranslation(vector32);
            return vector32;
        }
        if (matrix4.hasRotationOrScaling()) {
            vector32.set(vector3).mul(matrix4);
            return vector32;
        }
        matrix4.getTranslation(vector32).add(vector3);
        return vector32;
    }
}
