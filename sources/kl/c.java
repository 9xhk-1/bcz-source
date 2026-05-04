package kl;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import com.badlogic.gdx.graphics.Texture;
import com.esotericsoftware.spine.BlendMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class c extends Texture {

    /* renamed from: l, reason: collision with root package name */
    public Bitmap f66852l;

    /* renamed from: m, reason: collision with root package name */
    public com.badlogic.gdx.utils.l<BlendMode, Paint> f66853m = new com.badlogic.gdx.utils.l<>();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66854a;

        static {
            int[] iArr = new int[BlendMode.values().length];
            f66854a = iArr;
            try {
                iArr[BlendMode.normal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66854a[BlendMode.multiply.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66854a[BlendMode.additive.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f66854a[BlendMode.screen.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public c(Bitmap bitmap) {
        this.f66852l = bitmap;
        for (BlendMode blendMode : BlendMode.values()) {
            Paint paint = new Paint();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            int i11 = a.f66854a[blendMode.ordinal()];
            if (i11 == 1) {
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            } else if (i11 == 2) {
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            } else if (i11 == 3) {
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.ADD));
            } else if (i11 == 4) {
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
            }
            this.f66853m.r(blendMode, paint);
        }
    }

    @Override // com.badlogic.gdx.graphics.Texture, com.badlogic.gdx.graphics.j
    public int C0() {
        return this.f66852l.getWidth();
    }

    @Override // com.badlogic.gdx.graphics.Texture, com.badlogic.gdx.graphics.j
    public int I() {
        return this.f66852l.getHeight();
    }

    @Override // com.badlogic.gdx.graphics.Texture, com.badlogic.gdx.graphics.j, a3.q
    public void dispose() {
        this.f66852l.recycle();
    }

    public Bitmap t1() {
        return this.f66852l;
    }

    public Paint u1(BlendMode blendMode) {
        return this.f66853m.k(blendMode);
    }
}
