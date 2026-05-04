package u0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PostProcessor;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import coil.size.Scale;
import coil.transform.PixelOpacity;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u0;
import q0.c;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "-GifUtils")
@u0({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncoil/util/-GifUtils\n+ 2 Dimension.kt\ncoil/size/-Dimensions\n*L\n1#1,72:1\n57#2:73\n*S KotlinDebug\n*F\n+ 1 Utils.kt\ncoil/util/-GifUtils\n*L\n66#1:73\n*E\n"})
/* loaded from: classes3.dex */
public final class g {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f91430a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f91431b;

        static {
            int[] iArr = new int[PixelOpacity.values().length];
            try {
                iArr[PixelOpacity.UNCHANGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PixelOpacity.TRANSLUCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PixelOpacity.OPAQUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f91430a = iArr;
            int[] iArr2 = new int[Scale.values().length];
            try {
                iArr2[Scale.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Scale.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f91431b = iArr2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Animatable2.AnimationCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.a<g2> f91432a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.a<g2> f91433b;

        public b(x00.a<g2> aVar, x00.a<g2> aVar2) {
            this.f91432a = aVar;
            this.f91433b = aVar2;
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationEnd(@m80.l Drawable drawable) {
            x00.a<g2> aVar = this.f91433b;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationStart(@m80.l Drawable drawable) {
            x00.a<g2> aVar = this.f91432a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends Animatable2Compat.AnimationCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.a<g2> f91434a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.a<g2> f91435b;

        public c(x00.a<g2> aVar, x00.a<g2> aVar2) {
            this.f91434a = aVar;
            this.f91435b = aVar2;
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public void onAnimationEnd(@m80.l Drawable drawable) {
            x00.a<g2> aVar = this.f91435b;
            if (aVar != null) {
                aVar.invoke();
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public void onAnimationStart(@m80.l Drawable drawable) {
            x00.a<g2> aVar = this.f91434a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    @RequiresApi(23)
    @m80.k
    public static final Animatable2.AnimationCallback b(@m80.l x00.a<g2> aVar, @m80.l x00.a<g2> aVar2) {
        return new b(aVar, aVar2);
    }

    @m80.k
    public static final Animatable2Compat.AnimationCallback c(@m80.l x00.a<g2> aVar, @m80.l x00.a<g2> aVar2) {
        return new c(aVar, aVar2);
    }

    @RequiresApi(28)
    @m80.k
    public static final PostProcessor d(@m80.k final s0.a aVar) {
        return new PostProcessor() { // from class: u0.f
            @Override // android.graphics.PostProcessor
            public final int onPostProcess(Canvas canvas) {
                int e11;
                e11 = g.e(s0.a.this, canvas);
                return e11;
            }
        };
    }

    public static final int e(s0.a aVar, Canvas canvas) {
        return g(aVar.a(canvas));
    }

    public static final <T> void f(@m80.k List<? extends T> list, @m80.k x00.l<? super T, g2> lVar) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            lVar.invoke(list.get(i11));
        }
    }

    public static final int g(@m80.k PixelOpacity pixelOpacity) {
        int i11 = a.f91430a[pixelOpacity.ordinal()];
        if (i11 == 1) {
            return 0;
        }
        if (i11 == 2) {
            return -3;
        }
        if (i11 == 3) {
            return -1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int h(@m80.k q0.g gVar, @m80.k Scale scale, @m80.k x00.a<Integer> aVar) {
        return q0.b.f(gVar) ? aVar.invoke().intValue() : j(gVar.e(), scale);
    }

    public static final boolean i(@m80.k Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        config2 = Bitmap.Config.HARDWARE;
        return config == config2;
    }

    public static final int j(@m80.k q0.c cVar, @m80.k Scale scale) {
        if (cVar instanceof c.a) {
            return ((c.a) cVar).f81358a;
        }
        int i11 = a.f91431b[scale.ordinal()];
        if (i11 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i11 == 2) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int k(@m80.k q0.g gVar, @m80.k Scale scale, @m80.k x00.a<Integer> aVar) {
        return q0.b.f(gVar) ? aVar.invoke().intValue() : j(gVar.f(), scale);
    }
}
