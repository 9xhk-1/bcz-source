package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.core.content.res.ResourcesCompat;
import c40.n;
import c40.p;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAndroidFontLoader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontLoader.android.kt\nandroidx/compose/ui/text/font/AndroidFontLoader_androidKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,91:1\n314#2,11:92\n*S KotlinDebug\n*F\n+ 1 AndroidFontLoader.android.kt\nandroidx/compose/ui/text/font/AndroidFontLoader_androidKt\n*L\n70#1:92,11\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidFontLoader_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final android.graphics.Typeface load(ResourceFont resourceFont, Context context) {
        android.graphics.Typeface font = ResourcesCompat.getFont(context, resourceFont.getResId());
        g0.m(font);
        return font;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object loadAsync(final ResourceFont resourceFont, Context context, j00.c<? super android.graphics.Typeface> cVar) {
        final p pVar = new p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar.y();
        ResourcesCompat.getFont(context, resourceFont.getResId(), new ResourcesCompat.FontCallback() { // from class: androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2$1
            @Override // androidx.core.content.res.ResourcesCompat.FontCallback
            public void onFontRetrievalFailed(int i11) {
                pVar.a(new IllegalStateException("Unable to load font " + resourceFont + " (reason=" + i11 + ')'));
            }

            @Override // androidx.core.content.res.ResourcesCompat.FontCallback
            public void onFontRetrieved(android.graphics.Typeface typeface) {
                n<android.graphics.Typeface> nVar = pVar;
                Result.a aVar = Result.Companion;
                nVar.resumeWith(Result.m6308constructorimpl(typeface));
            }
        }, null);
        Object F = pVar.F();
        if (F == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return F;
    }
}
