package j2;

import com.badlogic.gdx.math.n;
import com.badlogic.gdx.utils.JsonValue;
import com.baicizhan.client.business.webview.JsonParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class j extends h {

    /* renamed from: f, reason: collision with root package name */
    public float f63150f;

    /* renamed from: g, reason: collision with root package name */
    public float f63151g;

    /* renamed from: d, reason: collision with root package name */
    public float[] f63148d = {1.0f};

    /* renamed from: e, reason: collision with root package name */
    public float[] f63149e = {0.0f};

    /* renamed from: h, reason: collision with root package name */
    public boolean f63152h = false;

    public void A(float f11) {
        this.f63150f = f11;
    }

    public void B(boolean z11) {
        this.f63152h = z11;
    }

    public void C(float[] fArr) {
        this.f63148d = fArr;
    }

    @Override // j2.h, j2.f, com.badlogic.gdx.utils.f.c
    public void D(com.badlogic.gdx.utils.f fVar, JsonValue jsonValue) {
        super.D(fVar, jsonValue);
        Class cls = Float.TYPE;
        this.f63150f = ((Float) fVar.M("highMin", cls, jsonValue)).floatValue();
        this.f63151g = ((Float) fVar.M("highMax", cls, jsonValue)).floatValue();
        this.f63152h = ((Boolean) fVar.M("relative", Boolean.TYPE, jsonValue)).booleanValue();
        this.f63148d = (float[]) fVar.M("scaling", float[].class, jsonValue);
        this.f63149e = (float[]) fVar.M(JsonParams.ShareResultO.CHANNEL_WEIXIN_CIRCLE, float[].class, jsonValue);
    }

    public void E(float[] fArr) {
        this.f63149e = fArr;
    }

    public float n() {
        return this.f63151g;
    }

    public float p() {
        return this.f63150f;
    }

    public float q(float f11) {
        int length = this.f63149e.length;
        int i11 = 1;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            if (this.f63149e[i11] > f11) {
                break;
            }
            i11++;
        }
        if (i11 == -1) {
            return this.f63148d[length - 1];
        }
        int i12 = i11 - 1;
        float[] fArr = this.f63148d;
        float f12 = fArr[i12];
        float[] fArr2 = this.f63149e;
        float f13 = fArr2[i12];
        return f12 + ((fArr[i11] - f12) * ((f11 - f13) / (fArr2[i11] - f13)));
    }

    public float[] r() {
        return this.f63148d;
    }

    public float[] s() {
        return this.f63149e;
    }

    public boolean t() {
        return this.f63152h;
    }

    public void u(j jVar) {
        super.h(jVar);
        this.f63151g = jVar.f63151g;
        this.f63150f = jVar.f63150f;
        float[] fArr = new float[jVar.f63148d.length];
        this.f63148d = fArr;
        System.arraycopy(jVar.f63148d, 0, fArr, 0, fArr.length);
        float[] fArr2 = new float[jVar.f63149e.length];
        this.f63149e = fArr2;
        System.arraycopy(jVar.f63149e, 0, fArr2, 0, fArr2.length);
        this.f63152h = jVar.f63152h;
    }

    public float v() {
        float f11 = this.f63150f;
        return f11 + ((this.f63151g - f11) * n.J());
    }

    public void w(float f11) {
        this.f63150f = f11;
        this.f63151g = f11;
    }

    public void x(float f11, float f12) {
        this.f63150f = f11;
        this.f63151g = f12;
    }

    public void y(float f11) {
        this.f63151g = f11;
    }

    @Override // j2.h, j2.f, com.badlogic.gdx.utils.f.c
    public void z(com.badlogic.gdx.utils.f fVar) {
        super.z(fVar);
        fVar.F0("highMin", Float.valueOf(this.f63150f));
        fVar.F0("highMax", Float.valueOf(this.f63151g));
        fVar.F0("relative", Boolean.valueOf(this.f63152h));
        fVar.F0("scaling", this.f63148d);
        fVar.F0(JsonParams.ShareResultO.CHANNEL_WEIXIN_CIRCLE, this.f63149e);
    }
}
