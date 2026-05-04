package l2;

import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.GdxRuntimeException;
import java.nio.IntBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class g implements q {

    /* renamed from: k, reason: collision with root package name */
    public static final int f69172k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final int f69173l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static final int f69174m = 32;

    /* renamed from: a, reason: collision with root package name */
    public final int f69175a;

    /* renamed from: b, reason: collision with root package name */
    public final int f69176b;

    /* renamed from: c, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.j[] f69177c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f69178d;

    /* renamed from: e, reason: collision with root package name */
    public final int f69179e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f69180f;

    /* renamed from: g, reason: collision with root package name */
    public int f69181g;

    /* renamed from: h, reason: collision with root package name */
    public int f69182h;

    /* renamed from: i, reason: collision with root package name */
    public final r f69183i;

    /* renamed from: j, reason: collision with root package name */
    public int f69184j;

    public g(int i11) {
        this(i11, 0);
    }

    public static int j() {
        IntBuffer G = BufferUtils.G(16);
        q1.g.f81384g.glGetIntegerv(com.badlogic.gdx.graphics.f.R1, G);
        return G.get(0);
    }

    @Override // l2.q
    public final int a(com.badlogic.gdx.graphics.j jVar) {
        this.f69183i.b(jVar, null, null, null, null);
        return g(this.f69183i, false);
    }

    @Override // l2.q
    public final int b() {
        return this.f69181g;
    }

    @Override // l2.q
    public void c() {
        for (int i11 = 0; i11 < this.f69176b; i11++) {
            this.f69177c[i11] = null;
            int[] iArr = this.f69178d;
            if (iArr != null) {
                iArr[i11] = i11;
            }
        }
    }

    @Override // l2.q
    public final void d() {
        this.f69181g = 0;
        this.f69182h = 0;
    }

    @Override // l2.q
    public final int e(r rVar) {
        return g(rVar, false);
    }

    @Override // l2.q
    public void end() {
        q1.g.f81384g.glActiveTexture(com.badlogic.gdx.graphics.f.R2);
    }

    @Override // l2.q
    public final int f() {
        return this.f69182h;
    }

    public final int g(r rVar, boolean z11) {
        int i11;
        int i12;
        com.badlogic.gdx.graphics.j jVar = rVar.f69250a;
        this.f69180f = false;
        int i13 = this.f69179e;
        if (i13 == 0) {
            i11 = this.f69175a;
            i12 = i(jVar);
        } else {
            if (i13 != 1) {
                return -1;
            }
            i11 = this.f69175a;
            i12 = h(jVar);
        }
        int i14 = i11 + i12;
        if (this.f69180f) {
            this.f69181g++;
            if (z11) {
                jVar.b(i14);
            } else {
                q1.g.f81384g.glActiveTexture(com.badlogic.gdx.graphics.f.R2 + i14);
            }
        } else {
            this.f69182h++;
        }
        jVar.g1(rVar.f69253d, rVar.f69254e);
        jVar.e1(rVar.f69251b, rVar.f69252c);
        return i14;
    }

    public final int h(com.badlogic.gdx.graphics.j jVar) {
        int i11;
        int i12 = 0;
        while (true) {
            i11 = this.f69176b;
            if (i12 >= i11) {
                break;
            }
            com.badlogic.gdx.graphics.j jVar2 = this.f69177c[this.f69178d[i12]];
            if (jVar2 == jVar) {
                this.f69180f = true;
                break;
            }
            if (jVar2 == null) {
                break;
            }
            i12++;
        }
        if (i12 >= i11) {
            i12 = i11 - 1;
        }
        int i13 = this.f69178d[i12];
        while (i12 > 0) {
            int[] iArr = this.f69178d;
            iArr[i12] = iArr[i12 - 1];
            i12--;
        }
        this.f69178d[0] = i13;
        if (!this.f69180f) {
            this.f69177c[i13] = jVar;
            jVar.b(this.f69175a + i13);
        }
        return i13;
    }

    public final int i(com.badlogic.gdx.graphics.j jVar) {
        int i11 = 0;
        while (true) {
            int i12 = this.f69176b;
            if (i11 >= i12) {
                int i13 = (this.f69184j + 1) % i12;
                this.f69184j = i13;
                this.f69177c[i13] = jVar;
                jVar.b(this.f69175a + i13);
                return this.f69184j;
            }
            int i14 = (this.f69184j + i11) % i12;
            if (this.f69177c[i14] == jVar) {
                this.f69180f = true;
                return i14;
            }
            i11++;
        }
    }

    public g(int i11, int i12) {
        this(i11, i12, -1);
    }

    public g(int i11, int i12, int i13) {
        this.f69181g = 0;
        this.f69182h = 0;
        this.f69183i = new r();
        this.f69184j = 0;
        int min = Math.min(j(), 32);
        i13 = i13 < 0 ? min - i12 : i13;
        if (i12 >= 0 && i13 >= 0 && i12 + i13 <= min) {
            this.f69179e = i11;
            this.f69175a = i12;
            this.f69176b = i13;
            this.f69177c = new com.badlogic.gdx.graphics.j[i13];
            this.f69178d = i11 == 1 ? new int[i13] : null;
            return;
        }
        throw new GdxRuntimeException("Illegal arguments");
    }
}
