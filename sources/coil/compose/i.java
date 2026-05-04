package coil.compose;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import coil.compose.AsyncImagePainter;
import coil.request.ImageRequest;
import kotlin.DeprecationLevel;
import kotlin.Triple;
import kotlin.jvm.internal.u0;
import yz.g2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nImagePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImagePainter.kt\ncoil/compose/ImagePainterKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,126:1\n74#2:127\n74#2:128\n*S KotlinDebug\n*F\n+ 1 ImagePainter.kt\ncoil/compose/ImagePainterKt\n*L\n67#1:127\n91#1:128\n*E\n"})
/* loaded from: classes3.dex */
public final class i {
    @Composable
    @yz.n(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @w0(expression = "rememberAsyncImagePainter(request, imageLoader)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @m80.k
    public static final AsyncImagePainter b(@m80.k ImageRequest imageRequest, @m80.k b0.f fVar, @m80.l Composer composer, int i11) {
        composer.startReplaceableGroup(-2028135656);
        AsyncImagePainter c11 = a.c(imageRequest, fVar, null, null, null, 0, null, composer, 72, 124);
        composer.endReplaceableGroup();
        return c11;
    }

    @Composable
    @yz.n(level = DeprecationLevel.ERROR, message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @w0(expression = "rememberAsyncImagePainter(request, imageLoader)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @m80.k
    public static final AsyncImagePainter c(@m80.k ImageRequest imageRequest, @m80.k b0.f fVar, @m80.k x00.p<? super Triple<? extends AsyncImagePainter.c, ImageRequest, Size>, ? super Triple<? extends AsyncImagePainter.c, ImageRequest, Size>, Boolean> pVar, @m80.l Composer composer, int i11) {
        composer.startReplaceableGroup(-2123088410);
        AsyncImagePainter c11 = a.c(imageRequest, fVar, null, null, null, 0, null, composer, 72, 124);
        composer.endReplaceableGroup();
        return c11;
    }

    @Composable
    @yz.n(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @w0(expression = "rememberAsyncImagePainter(data, imageLoader)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @m80.k
    public static final AsyncImagePainter d(@m80.l Object obj, @m80.k b0.f fVar, @m80.l Composer composer, int i11) {
        composer.startReplaceableGroup(699722038);
        AsyncImagePainter c11 = a.c(obj, fVar, null, null, null, 0, null, composer, 72, 124);
        composer.endReplaceableGroup();
        return c11;
    }

    @Composable
    @yz.n(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @w0(expression = "rememberAsyncImagePainter(ImageRequest.Builder(LocalContext.current).data(data).apply(builder).build(), imageLoader)", imports = {"androidx.compose.ui.platform.LocalContext", "coil.compose.rememberAsyncImagePainter", "coil.request.ImageRequest"}))
    @m80.k
    public static final AsyncImagePainter e(@m80.l Object obj, @m80.k b0.f fVar, @m80.k x00.l<? super ImageRequest.Builder, g2> lVar, @m80.l Composer composer, int i11) {
        composer.startReplaceableGroup(1750824323);
        ImageRequest.Builder j11 = new ImageRequest.Builder((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).j(obj);
        lVar.invoke(j11);
        AsyncImagePainter c11 = a.c(j11.f(), fVar, null, null, null, 0, null, composer, 72, 124);
        composer.endReplaceableGroup();
        return c11;
    }

    @Composable
    @yz.n(level = DeprecationLevel.ERROR, message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @w0(expression = "rememberAsyncImagePainter(data, imageLoader)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @m80.k
    public static final AsyncImagePainter f(@m80.l Object obj, @m80.k b0.f fVar, @m80.k x00.p<? super Triple<? extends AsyncImagePainter.c, ImageRequest, Size>, ? super Triple<? extends AsyncImagePainter.c, ImageRequest, Size>, Boolean> pVar, @m80.l Composer composer, int i11) {
        composer.startReplaceableGroup(-1913684348);
        AsyncImagePainter c11 = a.c(obj, fVar, null, null, null, 0, null, composer, 72, 124);
        composer.endReplaceableGroup();
        return c11;
    }

    @Composable
    @yz.n(level = DeprecationLevel.ERROR, message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @w0(expression = "rememberAsyncImagePainter(ImageRequest.Builder(LocalContext.current).data(data).apply(builder).build(), imageLoader)", imports = {"androidx.compose.ui.platform.LocalContext", "coil.compose.rememberAsyncImagePainter", "coil.request.ImageRequest"}))
    @m80.k
    public static final AsyncImagePainter g(@m80.l Object obj, @m80.k b0.f fVar, @m80.k x00.p<? super Triple<? extends AsyncImagePainter.c, ImageRequest, Size>, ? super Triple<? extends AsyncImagePainter.c, ImageRequest, Size>, Boolean> pVar, @m80.k x00.l<? super ImageRequest.Builder, g2> lVar, @m80.l Composer composer, int i11) {
        composer.startReplaceableGroup(-976338607);
        ImageRequest.Builder j11 = new ImageRequest.Builder((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).j(obj);
        lVar.invoke(j11);
        AsyncImagePainter c11 = a.c(j11.f(), fVar, null, null, null, 0, null, composer, 72, 124);
        composer.endReplaceableGroup();
        return c11;
    }

    @yz.n(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @w0(expression = "AsyncImagePainter", imports = {"coil.compose.AsyncImagePainter"}))
    public static /* synthetic */ void a() {
    }
}
