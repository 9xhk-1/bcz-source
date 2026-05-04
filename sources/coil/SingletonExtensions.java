package coil;

import android.content.Context;
import android.widget.ImageView;
import b0.a;
import b0.f;
import coil.request.ImageRequest;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import o0.d;
import o0.g;
import u0.m;
import w00.j;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "-SingletonExtensions")
@u0({"SMAP\nExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,114:1\n24#1:115\n59#1,6:116\n24#1:122\n59#1,6:123\n71#1,2:129\n*S KotlinDebug\n*F\n+ 1 Extensions.kt\ncoil/-SingletonExtensions\n*L\n56#1:115\n92#1:116,6\n90#1:122\n92#1:123,6\n102#1:129,2\n*E\n"})
/* renamed from: coil.-SingletonExtensions, reason: invalid class name */
/* loaded from: classes3.dex */
public final class SingletonExtensions {
    @n(level = DeprecationLevel.ERROR, message = "Migrate to 'dispose'.", replaceWith = @w0(expression = "dispose()", imports = {"coil.dispose"}))
    public static final void a(@k ImageView imageView) {
        m.b(imageView);
    }

    public static final void b(@k ImageView imageView) {
        m.b(imageView);
    }

    @k
    public static final f c(@k Context context) {
        return a.c(context);
    }

    @l
    public static final g d(@k ImageView imageView) {
        return m.c(imageView);
    }

    @l
    public static final g f(@k ImageView imageView) {
        return m.c(imageView);
    }

    @k
    public static final d g(@k ImageView imageView, @l Object obj, @k f fVar, @k x00.l<? super ImageRequest.Builder, g2> lVar) {
        ImageRequest.Builder l02 = new ImageRequest.Builder(imageView.getContext()).j(obj).l0(imageView);
        lVar.invoke(l02);
        return fVar.d(l02.f());
    }

    public static /* synthetic */ d h(ImageView imageView, Object obj, f fVar, x00.l lVar, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            fVar = a.c(imageView.getContext());
        }
        if ((i11 & 4) != 0) {
            lVar = new x00.l<ImageRequest.Builder, g2>() { // from class: coil.-SingletonExtensions$load$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@k ImageRequest.Builder builder) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(ImageRequest.Builder builder) {
                    invoke2(builder);
                    return g2.f100423a;
                }
            };
        }
        ImageRequest.Builder l02 = new ImageRequest.Builder(imageView.getContext()).j(obj).l0(imageView);
        lVar.invoke(l02);
        return fVar.d(l02.f());
    }

    @n(level = DeprecationLevel.ERROR, message = "Migrate to 'load'.", replaceWith = @w0(expression = "load(data, imageLoader, builder)", imports = {"coil.imageLoader", "coil.load"}))
    @k
    public static final d i(@k ImageView imageView, @l Object obj, @k f fVar, @k x00.l<? super ImageRequest.Builder, g2> lVar) {
        ImageRequest.Builder l02 = new ImageRequest.Builder(imageView.getContext()).j(obj).l0(imageView);
        lVar.invoke(l02);
        return fVar.d(l02.f());
    }

    public static /* synthetic */ d j(ImageView imageView, Object obj, f fVar, x00.l lVar, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            fVar = a.c(imageView.getContext());
        }
        if ((i11 & 4) != 0) {
            lVar = new x00.l<ImageRequest.Builder, g2>() { // from class: coil.-SingletonExtensions$loadAny$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@k ImageRequest.Builder builder) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(ImageRequest.Builder builder) {
                    invoke2(builder);
                    return g2.f100423a;
                }
            };
        }
        ImageRequest.Builder l02 = new ImageRequest.Builder(imageView.getContext()).j(obj).l0(imageView);
        lVar.invoke(l02);
        return fVar.d(l02.f());
    }

    @n(level = DeprecationLevel.ERROR, message = "Migrate to 'result'.", replaceWith = @w0(expression = "result", imports = {"coil.result"}))
    public static /* synthetic */ void e(ImageView imageView) {
    }
}
