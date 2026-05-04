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
@u0({"SMAP\nSingletonImagePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingletonImagePainter.kt\ncoil/compose/SingletonImagePainterKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,108:1\n74#2:109\n74#2:110\n*S KotlinDebug\n*F\n+ 1 SingletonImagePainter.kt\ncoil/compose/SingletonImagePainterKt\n*L\n54#1:109\n76#1:110\n*E\n"})
/* loaded from: classes3.dex */
public final class n {
    @Composable
    @yz.n(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @w0(expression = "rememberAsyncImagePainter(request)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @m80.k
    public static final AsyncImagePainter a(@m80.k ImageRequest imageRequest, @m80.l Composer composer, int i11) {
        composer.startReplaceableGroup(2091320589);
        AsyncImagePainter b11 = m.b(imageRequest, null, null, null, 0, null, composer, 8, 62);
        composer.endReplaceableGroup();
        return b11;
    }

    @Composable
    @yz.n(level = DeprecationLevel.ERROR, message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @w0(expression = "rememberAsyncImagePainter(request)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @m80.k
    public static final AsyncImagePainter b(@m80.k ImageRequest imageRequest, @m80.k x00.p<? super Triple<? extends AsyncImagePainter.c, ImageRequest, Size>, ? super Triple<? extends AsyncImagePainter.c, ImageRequest, Size>, Boolean> pVar, @m80.l Composer composer, int i11) {
        composer.startReplaceableGroup(-2003443841);
        AsyncImagePainter b11 = m.b(imageRequest, null, null, null, 0, null, composer, 8, 62);
        composer.endReplaceableGroup();
        return b11;
    }

    @Composable
    @yz.n(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @w0(expression = "rememberAsyncImagePainter(data)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @m80.k
    public static final AsyncImagePainter c(@m80.l Object obj, @m80.l Composer composer, int i11) {
        composer.startReplaceableGroup(1998134191);
        AsyncImagePainter b11 = m.b(obj, null, null, null, 0, null, composer, 8, 62);
        composer.endReplaceableGroup();
        return b11;
    }

    @Composable
    @yz.n(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @w0(expression = "rememberAsyncImagePainter(ImageRequest.Builder(LocalContext.current).data(data).apply(builder).build())", imports = {"androidx.compose.ui.platform.LocalContext", "coil.compose.rememberAsyncImagePainter", "coil.request.ImageRequest"}))
    @m80.k
    public static final AsyncImagePainter d(@m80.l Object obj, @m80.k x00.l<? super ImageRequest.Builder, g2> lVar, @m80.l Composer composer, int i11) {
        composer.startReplaceableGroup(309201794);
        ImageRequest.Builder j11 = new ImageRequest.Builder((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).j(obj);
        lVar.invoke(j11);
        AsyncImagePainter b11 = m.b(j11.f(), null, null, null, 0, null, composer, 8, 62);
        composer.endReplaceableGroup();
        return b11;
    }

    @Composable
    @yz.n(level = DeprecationLevel.ERROR, message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @w0(expression = "rememberAsyncImagePainter(data)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @m80.k
    public static final AsyncImagePainter e(@m80.l Object obj, @m80.k x00.p<? super Triple<? extends AsyncImagePainter.c, ImageRequest, Size>, ? super Triple<? extends AsyncImagePainter.c, ImageRequest, Size>, Boolean> pVar, @m80.l Composer composer, int i11) {
        composer.startReplaceableGroup(2090701729);
        AsyncImagePainter b11 = m.b(obj, null, null, null, 0, null, composer, 8, 62);
        composer.endReplaceableGroup();
        return b11;
    }

    @Composable
    @yz.n(level = DeprecationLevel.ERROR, message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @w0(expression = "rememberAsyncImagePainter(ImageRequest.Builder(LocalContext.current).data(data).apply(builder).build())", imports = {"androidx.compose.ui.platform.LocalContext", "coil.compose.rememberAsyncImagePainter", "coil.request.ImageRequest"}))
    @m80.k
    public static final AsyncImagePainter f(@m80.l Object obj, @m80.k x00.p<? super Triple<? extends AsyncImagePainter.c, ImageRequest, Size>, ? super Triple<? extends AsyncImagePainter.c, ImageRequest, Size>, Boolean> pVar, @m80.k x00.l<? super ImageRequest.Builder, g2> lVar, @m80.l Composer composer, int i11) {
        composer.startReplaceableGroup(305839348);
        ImageRequest.Builder j11 = new ImageRequest.Builder((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).j(obj);
        lVar.invoke(j11);
        AsyncImagePainter b11 = m.b(j11.f(), null, null, null, 0, null, composer, 8, 62);
        composer.endReplaceableGroup();
        return b11;
    }
}
