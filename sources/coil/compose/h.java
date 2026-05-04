package coil.compose;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.h
@yz.n(message = j.f9683a)
@u0({"SMAP\nLocalImageLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalImageLoader.kt\ncoil/compose/ImageLoaderProvidableCompositionLocal\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,55:1\n74#2:56\n24#3:57\n*S KotlinDebug\n*F\n+ 1 LocalImageLoader.kt\ncoil/compose/ImageLoaderProvidableCompositionLocal\n*L\n50#1:56\n50#1:57\n*E\n"})
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ProvidableCompositionLocal<b0.f> f9681a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Lambda implements x00.a<b0.f> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9682a = new a();

        public a() {
            super(0);
        }

        @Override // x00.a
        @m80.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b0.f invoke() {
            return null;
        }
    }

    public /* synthetic */ h(ProvidableCompositionLocal providableCompositionLocal) {
        this.f9681a = providableCompositionLocal;
    }

    public static final /* synthetic */ h a(ProvidableCompositionLocal providableCompositionLocal) {
        return new h(providableCompositionLocal);
    }

    public static /* synthetic */ ProvidableCompositionLocal c(ProvidableCompositionLocal providableCompositionLocal, int i11, v vVar) {
        if ((i11 & 1) != 0) {
            providableCompositionLocal = CompositionLocalKt.staticCompositionLocalOf(a.f9682a);
        }
        return b(providableCompositionLocal);
    }

    public static boolean d(ProvidableCompositionLocal<b0.f> providableCompositionLocal, Object obj) {
        return (obj instanceof h) && g0.g(providableCompositionLocal, ((h) obj).k());
    }

    public static final boolean e(ProvidableCompositionLocal<b0.f> providableCompositionLocal, ProvidableCompositionLocal<b0.f> providableCompositionLocal2) {
        return g0.g(providableCompositionLocal, providableCompositionLocal2);
    }

    @w00.j(name = "getCurrent")
    @m80.k
    @Composable
    @ReadOnlyComposable
    public static final b0.f f(ProvidableCompositionLocal<b0.f> providableCompositionLocal, @m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-617597678, i11, -1, "coil.compose.ImageLoaderProvidableCompositionLocal.<get-current> (LocalImageLoader.kt:49)");
        }
        b0.f fVar = (b0.f) composer.consume(providableCompositionLocal);
        if (fVar == null) {
            fVar = b0.a.c((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fVar;
    }

    public static int h(ProvidableCompositionLocal<b0.f> providableCompositionLocal) {
        return providableCompositionLocal.hashCode();
    }

    @yz.n(message = "Implement `ImageLoaderFactory` in your `android.app.Application` class.")
    @m80.k
    public static final ProvidedValue<b0.f> i(ProvidableCompositionLocal<b0.f> providableCompositionLocal, @m80.k b0.f fVar) {
        return providableCompositionLocal.provides(fVar);
    }

    public static String j(ProvidableCompositionLocal<b0.f> providableCompositionLocal) {
        return "ImageLoaderProvidableCompositionLocal(delegate=" + providableCompositionLocal + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f9681a, obj);
    }

    public int hashCode() {
        return h(this.f9681a);
    }

    public final /* synthetic */ ProvidableCompositionLocal k() {
        return this.f9681a;
    }

    public String toString() {
        return j(this.f9681a);
    }

    @yz.n(message = j.f9683a, replaceWith = @w0(expression = "LocalContext.current.imageLoader", imports = {"androidx.compose.ui.platform.LocalContext", "coil.imageLoader"}))
    public static /* synthetic */ void g() {
    }

    @m80.k
    public static ProvidableCompositionLocal<b0.f> b(@m80.k ProvidableCompositionLocal<b0.f> providableCompositionLocal) {
        return providableCompositionLocal;
    }
}
