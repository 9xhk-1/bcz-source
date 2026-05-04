package a1;

import a1.l;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c40.h1;
import c40.r0;
import com.airbnb.lottie.p0;
import com.airbnb.lottie.q0;
import com.airbnb.lottie.w0;
import com.airbnb.lottie.x;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import u30.f0;
import u30.k0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f1372a = "__LottieInternalDefaultCacheKey__";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> implements q0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c40.n<T> f1373a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(c40.n<? super T> nVar) {
            this.f1373a = nVar;
        }

        @Override // com.airbnb.lottie.q0
        public final void onResult(T t11) {
            if (this.f1373a.e()) {
                return;
            }
            c40.n<T> nVar = this.f1373a;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m6308constructorimpl(t11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> implements q0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c40.n<T> f1374a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(c40.n<? super T> nVar) {
            this.f1374a = nVar;
        }

        @Override // com.airbnb.lottie.q0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onResult(Throwable e11) {
            if (this.f1374a.e()) {
                return;
            }
            c40.n<T> nVar = this.f1374a;
            Result.a aVar = Result.Companion;
            g0.o(e11, "e");
            nVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(e11)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadFontsFromAssets$2", f = "rememberLottieComposition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f1375a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.airbnb.lottie.k f1376b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f1377c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f1378d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f1379e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.airbnb.lottie.k kVar, Context context, String str, String str2, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f1376b = kVar;
            this.f1377c = context;
            this.f1378d = str;
            this.f1379e = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.k
        public final j00.c<g2> create(@m80.l Object obj, @m80.k j00.c<?> cVar) {
            return new c(this.f1376b, this.f1377c, this.f1378d, this.f1379e, cVar);
        }

        @Override // x00.p
        @m80.l
        public final Object invoke(@m80.k r0 r0Var, @m80.l j00.c<? super g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f1375a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            for (c1.b font : this.f1376b.g().values()) {
                Context context = this.f1377c;
                g0.o(font, "font");
                s.t(context, font, this.f1378d, this.f1379e);
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadImagesFromAssets$2", f = "rememberLottieComposition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f1380a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.airbnb.lottie.k f1381b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f1382c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f1383d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.airbnb.lottie.k kVar, Context context, String str, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f1381b = kVar;
            this.f1382c = context;
            this.f1383d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.k
        public final j00.c<g2> create(@m80.l Object obj, @m80.k j00.c<?> cVar) {
            return new d(this.f1381b, this.f1382c, this.f1383d, cVar);
        }

        @Override // x00.p
        @m80.l
        public final Object invoke(@m80.k r0 r0Var, @m80.l j00.c<? super g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f1380a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            for (p0 asset : this.f1381b.j().values()) {
                g0.o(asset, "asset");
                s.r(asset);
                s.s(this.f1382c, asset, this.f1383d);
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt", f = "rememberLottieComposition.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2}, l = {125, 126, 127}, m = "lottieComposition", n = {c90.k.f8409a, "imageAssetsFolder", "fontAssetsFolder", "fontFileExtension", c90.k.f8409a, "fontAssetsFolder", "fontFileExtension", "composition", "composition"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0"})
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f1384a;

        /* renamed from: b, reason: collision with root package name */
        public Object f1385b;

        /* renamed from: c, reason: collision with root package name */
        public Object f1386c;

        /* renamed from: d, reason: collision with root package name */
        public Object f1387d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f1388e;

        /* renamed from: f, reason: collision with root package name */
        public int f1389f;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f1388e = obj;
            this.f1389f |= Integer.MIN_VALUE;
            return s.p(null, null, null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$1", f = "rememberLottieComposition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements x00.q<Integer, Throwable, j00.c<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f1390a;

        public f(j00.c<? super f> cVar) {
            super(3, cVar);
        }

        @m80.l
        public final Object i(int i11, @m80.k Throwable th2, @m80.l j00.c<? super Boolean> cVar) {
            return new f(cVar).invokeSuspend(g2.f100423a);
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Throwable th2, j00.c<? super Boolean> cVar) {
            return i(num.intValue(), th2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f1390a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return l00.a.a(false);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3", f = "rememberLottieComposition.kt", i = {0, 0, 1, 1}, l = {90, 92}, m = "invokeSuspend", n = {"exception", "failedCount", "exception", "failedCount"}, s = {"L$0", "I$0", "L$0", "I$0"})
    public static final class g extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f1391a;

        /* renamed from: b, reason: collision with root package name */
        public int f1392b;

        /* renamed from: c, reason: collision with root package name */
        public int f1393c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x00.q<Integer, Throwable, j00.c<? super Boolean>, Object> f1394d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Context f1395e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ l f1396f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f1397g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f1398h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f1399i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f1400j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ MutableState<j> f1401k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(x00.q<? super Integer, ? super Throwable, ? super j00.c<? super Boolean>, ? extends Object> qVar, Context context, l lVar, String str, String str2, String str3, String str4, MutableState<j> mutableState, j00.c<? super g> cVar) {
            super(2, cVar);
            this.f1394d = qVar;
            this.f1395e = context;
            this.f1396f = lVar;
            this.f1397g = str;
            this.f1398h = str2;
            this.f1399i = str3;
            this.f1400j = str4;
            this.f1401k = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.k
        public final j00.c<g2> create(@m80.l Object obj, @m80.k j00.c<?> cVar) {
            return new g(this.f1394d, this.f1395e, this.f1396f, this.f1397g, this.f1398h, this.f1399i, this.f1400j, this.f1401k, cVar);
        }

        @Override // x00.p
        @m80.l
        public final Object invoke(@m80.k r0 r0Var, @m80.l j00.c<? super g2> cVar) {
            return ((g) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(6:(3:15|(2:17|18)|20)|22|23|24|25|26) */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
        
            if (((java.lang.Boolean) r14).booleanValue() == false) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
        
            if (r14 == r1) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00ba A[ADDED_TO_REGION] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0090 -> B:9:0x0093). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@m80.k java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 200
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: a1.s.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <T> Object k(w0<T> w0Var, j00.c<? super T> cVar) {
        c40.p pVar = new c40.p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar.y();
        w0Var.d(new a(pVar)).c(new b(pVar));
        Object F = pVar.F();
        if (F == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return F;
    }

    public static final String l(String str) {
        return (k0.O3(str) || f0.J2(str, ".", false, 2, null)) ? str : g0.C(".", str);
    }

    public static final String m(String str) {
        if (str == null || k0.O3(str)) {
            return null;
        }
        return k0.s3(str, '/', false, 2, null) ? str : g0.C(str, "/");
    }

    public static final Object n(Context context, com.airbnb.lottie.k kVar, String str, String str2, j00.c<? super g2> cVar) {
        if (kVar.g().isEmpty()) {
            return g2.f100423a;
        }
        Object h11 = c40.i.h(h1.c(), new c(kVar, context, str, str2, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    public static final Object o(Context context, com.airbnb.lottie.k kVar, String str, j00.c<? super g2> cVar) {
        if (!kVar.u()) {
            return g2.f100423a;
        }
        Object h11 = c40.i.h(h1.c(), new d(kVar, context, str, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        if (r12 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p(android.content.Context r6, a1.l r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, j00.c<? super com.airbnb.lottie.k> r12) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.s.p(android.content.Context, a1.l, java.lang.String, java.lang.String, java.lang.String, java.lang.String, j00.c):java.lang.Object");
    }

    public static final w0<com.airbnb.lottie.k> q(Context context, l lVar, String str, boolean z11) {
        if (lVar instanceof l.e) {
            return g0.g(str, f1372a) ? x.C(context, ((l.e) lVar).h()) : x.D(context, ((l.e) lVar).h(), str);
        }
        if (lVar instanceof l.f) {
            return g0.g(str, f1372a) ? x.G(context, ((l.f) lVar).h()) : x.H(context, ((l.f) lVar).h(), str);
        }
        if (lVar instanceof l.c) {
            if (z11) {
                return null;
            }
            l.c cVar = (l.c) lVar;
            FileInputStream fileInputStream = new FileInputStream(cVar.h());
            if (!f0.b2(cVar.h(), "zip", false, 2, null)) {
                if (g0.g(str, f1372a)) {
                    str = cVar.h();
                }
                return x.t(fileInputStream, str);
            }
            ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
            if (g0.g(str, f1372a)) {
                str = cVar.h();
            }
            return x.K(zipInputStream, str);
        }
        if (lVar instanceof l.a) {
            return g0.g(str, f1372a) ? x.o(context, ((l.a) lVar).h()) : x.p(context, ((l.a) lVar).h(), str);
        }
        if (lVar instanceof l.d) {
            if (g0.g(str, f1372a)) {
                str = String.valueOf(((l.d) lVar).h().hashCode());
            }
            return x.z(((l.d) lVar).h(), str);
        }
        if (!(lVar instanceof l.b)) {
            throw new NoWhenBranchMatchedException();
        }
        l.b bVar = (l.b) lVar;
        InputStream openInputStream = context.getContentResolver().openInputStream(bVar.h());
        if (g0.g(str, f1372a)) {
            str = bVar.h().toString();
        }
        return x.t(openInputStream, str);
    }

    public static final void r(p0 p0Var) {
        if (p0Var.a() != null) {
            return;
        }
        String filename = p0Var.c();
        g0.o(filename, "filename");
        if (!f0.J2(filename, "data:", false, 2, null) || k0.J3(filename, "base64,", 0, false, 6, null) <= 0) {
            return;
        }
        try {
            String substring = filename.substring(k0.I3(filename, ',', 0, false, 6, null) + 1);
            g0.o(substring, "this as java.lang.String).substring(startIndex)");
            byte[] decode = Base64.decode(substring, 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = true;
            options.inDensity = 160;
            p0Var.h(BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
        } catch (IllegalArgumentException e11) {
            j1.f.f("data URL did not have correct base64 format.", e11);
        }
    }

    public static final void s(Context context, p0 p0Var, String str) {
        if (p0Var.a() != null || str == null) {
            return;
        }
        try {
            InputStream open = context.getAssets().open(g0.C(str, p0Var.c()));
            g0.o(open, "try {\n        context.as…, e)\n        return\n    }");
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                p0Var.h(j1.j.m(BitmapFactory.decodeStream(open, null, options), p0Var.f(), p0Var.d()));
            } catch (IllegalArgumentException e11) {
                j1.f.f("Unable to decode image.", e11);
            }
        } catch (IOException e12) {
            j1.f.f("Unable to open asset.", e12);
        }
    }

    public static final void t(Context context, c1.b bVar, String str, String str2) {
        String str3 = ((Object) str) + ((Object) bVar.b()) + str2;
        try {
            Typeface typefaceWithDefaultStyle = Typeface.createFromAsset(context.getAssets(), str3);
            try {
                g0.o(typefaceWithDefaultStyle, "typefaceWithDefaultStyle");
                String d11 = bVar.d();
                g0.o(d11, "font.style");
                bVar.f(w(typefaceWithDefaultStyle, d11));
            } catch (Exception e11) {
                j1.f.c("Failed to create " + ((Object) bVar.b()) + " typeface with style=" + ((Object) bVar.d()) + PublicSuffixDatabase.f77441i, e11);
            }
        } catch (Exception e12) {
            j1.f.c("Failed to find typeface in assets with path " + str3 + '.', e12);
        }
    }

    @Composable
    @m80.k
    public static final i u(@m80.k l spec, @m80.l String str, @m80.l String str2, @m80.l String str3, @m80.l String str4, @m80.l x00.q<? super Integer, ? super Throwable, ? super j00.c<? super Boolean>, ? extends Object> qVar, @m80.l Composer composer, int i11, int i12) {
        g0.p(spec, "spec");
        composer.startReplaceableGroup(1388713460);
        String str5 = (i12 & 2) != 0 ? null : str;
        if ((i12 & 4) != 0) {
            str2 = "fonts/";
        }
        String str6 = str2;
        String str7 = (i12 & 8) != 0 ? ".ttf" : str3;
        String str8 = (i12 & 16) != 0 ? f1372a : str4;
        x00.q<? super Integer, ? super Throwable, ? super j00.c<? super Boolean>, ? extends Object> fVar = (i12 & 32) != 0 ? new f(null) : qVar;
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        int i13 = i11 & 14;
        composer.startReplaceableGroup(-3686930);
        boolean changed = composer.changed(spec);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new j(), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        int i14 = i13 | ((i11 >> 9) & 112);
        composer.startReplaceableGroup(-3686552);
        boolean changed2 = composer.changed(spec) | composer.changed(str8);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(q(context, spec, str8, true));
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(spec, str8, new g(fVar, context, spec, str5, str6, str7, str8, mutableState, null), composer, i14);
        j v11 = v(mutableState);
        composer.endReplaceableGroup();
        return v11;
    }

    public static final j v(MutableState<j> mutableState) {
        return mutableState.getValue();
    }

    public static final Typeface w(Typeface typeface, String str) {
        int i11 = 0;
        boolean n32 = k0.n3(str, "Italic", false, 2, null);
        boolean n33 = k0.n3(str, "Bold", false, 2, null);
        if (n32 && n33) {
            i11 = 3;
        } else if (n32) {
            i11 = 2;
        } else if (n33) {
            i11 = 1;
        }
        return typeface.getStyle() == i11 ? typeface : Typeface.create(typeface, i11);
    }
}
