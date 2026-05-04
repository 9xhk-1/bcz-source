package coil.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.jvm.internal.Lambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final c f9658a = new c();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.q<p, Composer, Integer, g2> f9659b = ComposableLambdaKt.composableLambdaInstance(-1692951203, false, a.f9660a);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Lambda implements x00.q<p, Composer, Integer, g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9660a = new a();

        public a() {
            super(3);
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void a(@m80.k p pVar, @m80.l Composer composer, int i11) {
            int i12;
            if ((i11 & 14) == 0) {
                i12 = i11 | (composer.changed(pVar) ? 4 : 2);
            } else {
                i12 = i11;
            }
            if ((i12 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1692951203, i12, -1, "coil.compose.ComposableSingletons$SubcomposeAsyncImageKt.lambda-1.<anonymous> (SubcomposeAsyncImage.kt:391)");
            }
            SubcomposeAsyncImageKt.g(pVar, null, null, null, null, null, 0.0f, null, false, composer, i12 & 14, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ g2 invoke(p pVar, Composer composer, Integer num) {
            a(pVar, composer, num.intValue());
            return g2.f100423a;
        }
    }

    @m80.k
    public final x00.q<p, Composer, Integer, g2> a() {
        return f9659b;
    }
}
