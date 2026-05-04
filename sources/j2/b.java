package j2;

import com.badlogic.gdx.utils.JsonValue;
import com.baicizhan.client.business.webview.JsonParams;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b extends f {

    /* renamed from: d, reason: collision with root package name */
    public static float[] f63130d = new float[3];

    /* renamed from: b, reason: collision with root package name */
    public float[] f63131b = {1.0f, 1.0f, 1.0f};

    /* renamed from: c, reason: collision with root package name */
    public float[] f63132c = {0.0f};

    @Override // j2.f, com.badlogic.gdx.utils.f.c
    public void D(com.badlogic.gdx.utils.f fVar, JsonValue jsonValue) {
        super.D(fVar, jsonValue);
        this.f63131b = (float[]) fVar.M("colors", float[].class, jsonValue);
        this.f63132c = (float[]) fVar.M(JsonParams.ShareResultO.CHANNEL_WEIXIN_CIRCLE, float[].class, jsonValue);
    }

    public void f(float f11, float[] fArr, int i11) {
        int i12;
        float[] fArr2 = this.f63132c;
        int length = fArr2.length;
        int i13 = 0;
        int i14 = 1;
        while (true) {
            int i15 = i14;
            i12 = i13;
            i13 = i15;
            if (i13 >= length) {
                i13 = -1;
                break;
            } else if (fArr2[i13] > f11) {
                break;
            } else {
                i14 = i13 + 1;
            }
        }
        float f12 = fArr2[i12];
        int i16 = i12 * 3;
        float[] fArr3 = this.f63131b;
        float f13 = fArr3[i16];
        float f14 = fArr3[i16 + 1];
        float f15 = fArr3[i16 + 2];
        if (i13 == -1) {
            fArr[i11] = f13;
            fArr[i11 + 1] = f14;
            fArr[i11 + 2] = f15;
        } else {
            float f16 = (f11 - f12) / (fArr2[i13] - f12);
            int i17 = i13 * 3;
            fArr[i11] = f13 + ((fArr3[i17] - f13) * f16);
            fArr[i11 + 1] = f14 + ((fArr3[i17 + 1] - f14) * f16);
            fArr[i11 + 2] = f15 + ((fArr3[i17 + 2] - f15) * f16);
        }
    }

    public float[] g(float f11) {
        f(f11, f63130d, 0);
        return f63130d;
    }

    public float[] h() {
        return this.f63131b;
    }

    public float[] i() {
        return this.f63132c;
    }

    public void j(b bVar) {
        super.d(bVar);
        float[] fArr = new float[bVar.f63131b.length];
        this.f63131b = fArr;
        System.arraycopy(bVar.f63131b, 0, fArr, 0, fArr.length);
        float[] fArr2 = new float[bVar.f63132c.length];
        this.f63132c = fArr2;
        System.arraycopy(bVar.f63132c, 0, fArr2, 0, fArr2.length);
    }

    public void k(float[] fArr) {
        this.f63131b = fArr;
    }

    public void l(float[] fArr) {
        this.f63132c = fArr;
    }

    @Override // j2.f, com.badlogic.gdx.utils.f.c
    public void z(com.badlogic.gdx.utils.f fVar) {
        super.z(fVar);
        fVar.F0("colors", this.f63131b);
        fVar.F0(JsonParams.ShareResultO.CHANNEL_WEIXIN_CIRCLE, this.f63132c);
    }
}
