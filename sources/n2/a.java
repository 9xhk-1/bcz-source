package n2;

import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a implements com.badlogic.gdx.graphics.o {

    /* renamed from: a, reason: collision with root package name */
    public int f74089a;

    /* renamed from: b, reason: collision with root package name */
    public int f74090b;

    /* renamed from: c, reason: collision with root package name */
    public int f74091c;

    /* renamed from: d, reason: collision with root package name */
    public int f74092d;

    /* renamed from: e, reason: collision with root package name */
    public int f74093e;

    /* renamed from: f, reason: collision with root package name */
    public int f74094f;

    /* renamed from: g, reason: collision with root package name */
    public int f74095g;

    /* renamed from: h, reason: collision with root package name */
    public ByteBuffer f74096h;

    public a(int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f74089a = i11;
        this.f74090b = i12;
        this.f74091c = i13;
        this.f74093e = i15;
        this.f74094f = i16;
        this.f74095g = i17;
        this.f74092d = i14;
    }

    @Override // com.badlogic.gdx.graphics.o
    public boolean a() {
        return this.f74096h != null;
    }

    @Override // com.badlogic.gdx.graphics.o
    public boolean b() {
        return true;
    }

    @Override // com.badlogic.gdx.graphics.o
    public int c() {
        return this.f74094f;
    }

    @Override // com.badlogic.gdx.graphics.o
    public int d() {
        return this.f74095g;
    }

    @Override // com.badlogic.gdx.graphics.o
    public boolean e() {
        return false;
    }

    @Override // com.badlogic.gdx.graphics.o
    public void f() {
        q1.g.f81386i.N4(com.badlogic.gdx.graphics.g.f11791o5, this.f74092d, this.f74094f, this.f74089a, this.f74090b, this.f74091c, 0, this.f74093e, this.f74095g, this.f74096h);
    }

    public int g() {
        return this.f74093e;
    }

    @Override // com.badlogic.gdx.graphics.o
    public int getDepth() {
        return this.f74091c;
    }

    @Override // com.badlogic.gdx.graphics.o
    public int getHeight() {
        return this.f74090b;
    }

    @Override // com.badlogic.gdx.graphics.o
    public int getWidth() {
        return this.f74089a;
    }

    public int h() {
        return this.f74092d;
    }

    public ByteBuffer i() {
        int i11;
        if (this.f74096h == null) {
            int i12 = this.f74093e;
            int i13 = 1;
            if (i12 == 6403 || i12 == 36244 || i12 == 6409 || i12 == 6406) {
                i11 = 1;
            } else if (i12 == 33319 || i12 == 33320 || i12 == 6410) {
                i11 = 2;
            } else if (i12 == 6407 || i12 == 36248) {
                i11 = 3;
            } else {
                if (i12 != 6408 && i12 != 36249) {
                    throw new GdxRuntimeException("unsupported glFormat: " + this.f74093e);
                }
                i11 = 4;
            }
            int i14 = this.f74095g;
            if (i14 != 5121 && i14 != 5120) {
                if (i14 == 5123 || i14 == 5122 || i14 == 5131) {
                    i13 = 2;
                } else {
                    if (i14 != 5125 && i14 != 5124 && i14 != 5126) {
                        throw new GdxRuntimeException("unsupported glType: " + this.f74095g);
                    }
                    i13 = 4;
                }
            }
            this.f74096h = BufferUtils.C(this.f74089a * this.f74090b * this.f74091c * i11 * i13);
        }
        return this.f74096h;
    }

    @Override // com.badlogic.gdx.graphics.o
    public void prepare() {
    }
}
