package gn;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.Shapes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Lambda;
import m80.k;
import m80.l;
import w00.j;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "MdcTheme")
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final Shapes f53956a = new Shapes(null, null, null, 7, null);

    /* renamed from: b, reason: collision with root package name */
    public static boolean f53957b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public static Method f53958c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: gn.a$a, reason: collision with other inner class name */
    public static final class C0641a extends Lambda implements p<Composer, Integer, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p<Composer, Integer, g2> f53959a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f53960b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0641a(p<? super Composer, ? super Integer, g2> pVar, int i11) {
            super(2);
            this.f53959a = pVar;
            this.f53960b = i11;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return g2.f100423a;
        }

        @Composable
        public final void invoke(@l Composer composer, int i11) {
            if ((i11 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(901606457, i11, -1, "com.google.android.material.composethemeadapter.MdcTheme.<anonymous> (MdcTheme.kt:119)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2499boximpl(MaterialTheme.INSTANCE.getColors(composer, 8).m1595getOnBackground0d7_KjU()))}, this.f53959a, composer, 8 | ((this.f53960b >> 15) & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Lambda implements p<Composer, Integer, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f53961a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f53962b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f53963c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f53964d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f53965e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f53966f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ p<Composer, Integer, g2> f53967g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f53968h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f53969i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Context context, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, p<? super Composer, ? super Integer, g2> pVar, int i11, int i12) {
            super(2);
            this.f53961a = context;
            this.f53962b = z11;
            this.f53963c = z12;
            this.f53964d = z13;
            this.f53965e = z14;
            this.f53966f = z15;
            this.f53967g = pVar;
            this.f53968h = i11;
            this.f53969i = i12;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return g2.f100423a;
        }

        public final void invoke(@l Composer composer, int i11) {
            a.a(this.f53961a, this.f53962b, this.f53963c, this.f53964d, this.f53965e, this.f53966f, this.f53967g, composer, this.f53968h | 1, this.f53969i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0169 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0153 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0120  */
    @androidx.compose.runtime.Composable
    @yz.n(message = "\n     compose-theme-adapter is deprecated.\n     The API has moved to accompanist/themeadapter/material.\n     For more information, please visit https://google.github.io/accompanist/themeadapter-material\n    ")
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@m80.l android.content.Context r27, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32, @m80.k x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r33, @m80.l androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gn.a.a(android.content.Context, boolean, boolean, boolean, boolean, boolean, x00.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b1  */
    @yz.n(message = "\n     compose-theme-adapter is deprecated.\n     The API has moved to accompanist/themeadapter/material.\n     For more information, please visit https://google.github.io/accompanist/themeadapter-material\n    ")
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final gn.b b(@m80.k android.content.Context r35, @m80.k androidx.compose.ui.unit.LayoutDirection r36, @m80.k androidx.compose.ui.unit.Density r37, boolean r38, boolean r39, boolean r40, boolean r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gn.a.b(android.content.Context, androidx.compose.ui.unit.LayoutDirection, androidx.compose.ui.unit.Density, boolean, boolean, boolean, boolean, boolean):gn.b");
    }

    public static /* synthetic */ gn.b c(Context context, LayoutDirection layoutDirection, Density density, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i11, Object obj) {
        return b(context, layoutDirection, (i11 & 4) != 0 ? AndroidDensity_androidKt.Density(context) : density, (i11 & 8) != 0 ? true : z11, (i11 & 16) != 0 ? true : z12, (i11 & 32) == 0 ? z13 : true, (i11 & 64) != 0 ? false : z14, (i11 & 128) != 0 ? false : z15);
    }

    public static final Object d(Resources.Theme theme) {
        Object obj = null;
        if (!f53957b) {
            try {
                Method declaredMethod = Resources.Theme.class.getDeclaredMethod("getKey", null);
                declaredMethod.setAccessible(true);
                f53958c = declaredMethod;
            } catch (ReflectiveOperationException unused) {
            }
            f53957b = true;
        }
        Method method = f53958c;
        if (method == null) {
            return null;
        }
        if (method != null) {
            try {
                obj = method.invoke(theme, null);
            } catch (ReflectiveOperationException unused2) {
                return g2.f100423a;
            }
        }
        return obj;
    }
}
