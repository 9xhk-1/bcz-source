package a1;

import android.graphics.Matrix;
import androidx.annotation.FloatRange;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import com.airbnb.lottie.RenderMode;
import com.airbnb.lottie.o0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class f {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Lambda implements x00.p<Composer, Integer, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.airbnb.lottie.k f1232a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.a<Float> f1233b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Modifier f1234c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f1235d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f1236e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f1237f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ RenderMode f1238g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f1239h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ n f1240i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Alignment f1241j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ ContentScale f1242k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f1243l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f1244m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f1245n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f1246o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.airbnb.lottie.k kVar, x00.a<Float> aVar, Modifier modifier, boolean z11, boolean z12, boolean z13, RenderMode renderMode, boolean z14, n nVar, Alignment alignment, ContentScale contentScale, boolean z15, int i11, int i12, int i13) {
            super(2);
            this.f1232a = kVar;
            this.f1233b = aVar;
            this.f1234c = modifier;
            this.f1235d = z11;
            this.f1236e = z12;
            this.f1237f = z13;
            this.f1238g = renderMode;
            this.f1239h = z14;
            this.f1240i = nVar;
            this.f1241j = alignment;
            this.f1242k = contentScale;
            this.f1243l = z15;
            this.f1244m = i11;
            this.f1245n = i12;
            this.f1246o = i13;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return g2.f100423a;
        }

        public final void invoke(@m80.l Composer composer, int i11) {
            f.c(this.f1232a, this.f1233b, this.f1234c, this.f1235d, this.f1236e, this.f1237f, this.f1238g, this.f1239h, this.f1240i, this.f1241j, this.f1242k, this.f1243l, composer, this.f1244m | 1, this.f1245n, this.f1246o);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Lambda implements x00.l<DrawScope, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.airbnb.lottie.k f1247a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ContentScale f1248b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Alignment f1249c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Matrix f1250d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ o0 f1251e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f1252f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ RenderMode f1253g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ n f1254h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ boolean f1255i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ boolean f1256j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ boolean f1257k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f1258l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ x00.a<Float> f1259m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ MutableState<n> f1260n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.airbnb.lottie.k kVar, ContentScale contentScale, Alignment alignment, Matrix matrix, o0 o0Var, boolean z11, RenderMode renderMode, n nVar, boolean z12, boolean z13, boolean z14, boolean z15, x00.a<Float> aVar, MutableState<n> mutableState) {
            super(1);
            this.f1247a = kVar;
            this.f1248b = contentScale;
            this.f1249c = alignment;
            this.f1250d = matrix;
            this.f1251e = o0Var;
            this.f1252f = z11;
            this.f1253g = renderMode;
            this.f1254h = nVar;
            this.f1255i = z12;
            this.f1256j = z13;
            this.f1257k = z14;
            this.f1258l = z15;
            this.f1259m = aVar;
            this.f1260n = mutableState;
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(DrawScope drawScope) {
            invoke2(drawScope);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m80.k DrawScope Canvas) {
            g0.p(Canvas, "$this$Canvas");
            com.airbnb.lottie.k kVar = this.f1247a;
            ContentScale contentScale = this.f1248b;
            Alignment alignment = this.f1249c;
            Matrix matrix = this.f1250d;
            o0 o0Var = this.f1251e;
            boolean z11 = this.f1252f;
            RenderMode renderMode = this.f1253g;
            n nVar = this.f1254h;
            boolean z12 = this.f1255i;
            boolean z13 = this.f1256j;
            boolean z14 = this.f1257k;
            boolean z15 = this.f1258l;
            x00.a<Float> aVar = this.f1259m;
            MutableState<n> mutableState = this.f1260n;
            Canvas canvas = Canvas.getDrawContext().getCanvas();
            long Size = SizeKt.Size(kVar.b().width(), kVar.b().height());
            long IntSize = IntSizeKt.IntSize(c10.d.L0(Size.m2337getWidthimpl(Canvas.mo3060getSizeNHjbRc())), c10.d.L0(Size.m2334getHeightimpl(Canvas.mo3060getSizeNHjbRc())));
            long mo3850computeScaleFactorH7hwNQA = contentScale.mo3850computeScaleFactorH7hwNQA(Size, Canvas.mo3060getSizeNHjbRc());
            long mo2085alignKFBX0sM = alignment.mo2085alignKFBX0sM(f.k(Size, mo3850computeScaleFactorH7hwNQA), IntSize, Canvas.getLayoutDirection());
            matrix.reset();
            matrix.preTranslate(IntOffset.m5243getXimpl(mo2085alignKFBX0sM), IntOffset.m5244getYimpl(mo2085alignKFBX0sM));
            matrix.preScale(ScaleFactor.m3946getScaleXimpl(mo3850computeScaleFactorH7hwNQA), ScaleFactor.m3947getScaleYimpl(mo3850computeScaleFactorH7hwNQA));
            o0Var.G(z11);
            o0Var.X0(renderMode);
            o0Var.D0(kVar);
            if (nVar != f.d(mutableState)) {
                n d11 = f.d(mutableState);
                if (d11 != null) {
                    d11.b(o0Var);
                }
                if (nVar != null) {
                    nVar.a(o0Var);
                }
                f.e(mutableState, nVar);
            }
            o0Var.U0(z12);
            o0Var.B0(z13);
            o0Var.J0(z14);
            o0Var.C0(z15);
            o0Var.W0(aVar.invoke().floatValue());
            o0Var.setBounds(0, 0, kVar.b().width(), kVar.b().height());
            o0Var.E(AndroidCanvas_androidKt.getNativeCanvas(canvas), matrix);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends Lambda implements x00.p<Composer, Integer, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.airbnb.lottie.k f1261a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.a<Float> f1262b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Modifier f1263c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f1264d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f1265e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f1266f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ RenderMode f1267g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f1268h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ n f1269i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Alignment f1270j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ ContentScale f1271k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f1272l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f1273m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f1274n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f1275o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.airbnb.lottie.k kVar, x00.a<Float> aVar, Modifier modifier, boolean z11, boolean z12, boolean z13, RenderMode renderMode, boolean z14, n nVar, Alignment alignment, ContentScale contentScale, boolean z15, int i11, int i12, int i13) {
            super(2);
            this.f1261a = kVar;
            this.f1262b = aVar;
            this.f1263c = modifier;
            this.f1264d = z11;
            this.f1265e = z12;
            this.f1266f = z13;
            this.f1267g = renderMode;
            this.f1268h = z14;
            this.f1269i = nVar;
            this.f1270j = alignment;
            this.f1271k = contentScale;
            this.f1272l = z15;
            this.f1273m = i11;
            this.f1274n = i12;
            this.f1275o = i13;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return g2.f100423a;
        }

        public final void invoke(@m80.l Composer composer, int i11) {
            f.c(this.f1261a, this.f1262b, this.f1263c, this.f1264d, this.f1265e, this.f1266f, this.f1267g, this.f1268h, this.f1269i, this.f1270j, this.f1271k, this.f1272l, composer, this.f1273m | 1, this.f1274n, this.f1275o);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends Lambda implements x00.a<Float> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f1276a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f11) {
            super(0);
            this.f1276a = f11;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final Float invoke() {
            return Float.valueOf(this.f1276a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends Lambda implements x00.p<Composer, Integer, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.airbnb.lottie.k f1277a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f1278b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Modifier f1279c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f1280d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f1281e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f1282f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ RenderMode f1283g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f1284h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ n f1285i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Alignment f1286j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ ContentScale f1287k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f1288l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f1289m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f1290n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f1291o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.airbnb.lottie.k kVar, float f11, Modifier modifier, boolean z11, boolean z12, boolean z13, RenderMode renderMode, boolean z14, n nVar, Alignment alignment, ContentScale contentScale, boolean z15, int i11, int i12, int i13) {
            super(2);
            this.f1277a = kVar;
            this.f1278b = f11;
            this.f1279c = modifier;
            this.f1280d = z11;
            this.f1281e = z12;
            this.f1282f = z13;
            this.f1283g = renderMode;
            this.f1284h = z14;
            this.f1285i = nVar;
            this.f1286j = alignment;
            this.f1287k = contentScale;
            this.f1288l = z15;
            this.f1289m = i11;
            this.f1290n = i12;
            this.f1291o = i13;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return g2.f100423a;
        }

        public final void invoke(@m80.l Composer composer, int i11) {
            f.a(this.f1277a, this.f1278b, this.f1279c, this.f1280d, this.f1281e, this.f1282f, this.f1283g, this.f1284h, this.f1285i, this.f1286j, this.f1287k, this.f1288l, composer, this.f1289m | 1, this.f1290n, this.f1291o);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: a1.f$f, reason: collision with other inner class name */
    public static final class C0005f extends Lambda implements x00.a<Float> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a1.g f1292a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0005f(a1.g gVar) {
            super(0);
            this.f1292a = gVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final Float invoke() {
            return Float.valueOf(f.f(this.f1292a));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g extends Lambda implements x00.p<Composer, Integer, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.airbnb.lottie.k f1293a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Modifier f1294b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f1295c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f1296d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ h f1297e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f1298f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f1299g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f1300h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ boolean f1301i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ boolean f1302j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ RenderMode f1303k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f1304l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ n f1305m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Alignment f1306n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ ContentScale f1307o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f1308p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f1309q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f1310r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f1311s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.airbnb.lottie.k kVar, Modifier modifier, boolean z11, boolean z12, h hVar, float f11, int i11, boolean z13, boolean z14, boolean z15, RenderMode renderMode, boolean z16, n nVar, Alignment alignment, ContentScale contentScale, boolean z17, int i12, int i13, int i14) {
            super(2);
            this.f1293a = kVar;
            this.f1294b = modifier;
            this.f1295c = z11;
            this.f1296d = z12;
            this.f1297e = hVar;
            this.f1298f = f11;
            this.f1299g = i11;
            this.f1300h = z13;
            this.f1301i = z14;
            this.f1302j = z15;
            this.f1303k = renderMode;
            this.f1304l = z16;
            this.f1305m = nVar;
            this.f1306n = alignment;
            this.f1307o = contentScale;
            this.f1308p = z17;
            this.f1309q = i12;
            this.f1310r = i13;
            this.f1311s = i14;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return g2.f100423a;
        }

        public final void invoke(@m80.l Composer composer, int i11) {
            f.b(this.f1293a, this.f1294b, this.f1295c, this.f1296d, this.f1297e, this.f1298f, this.f1299g, this.f1300h, this.f1301i, this.f1302j, this.f1303k, this.f1304l, this.f1305m, this.f1306n, this.f1307o, this.f1308p, composer, this.f1309q | 1, this.f1310r, this.f1311s);
        }
    }

    @Composable
    @yz.n(message = "Pass progress as a lambda instead of a float. This overload will be removed in the next release.")
    public static final void a(@m80.l com.airbnb.lottie.k kVar, @FloatRange(from = 0.0d, to = 1.0d) float f11, @m80.l Modifier modifier, boolean z11, boolean z12, boolean z13, @m80.l RenderMode renderMode, boolean z14, @m80.l n nVar, @m80.l Alignment alignment, @m80.l ContentScale contentScale, boolean z15, @m80.l Composer composer, int i11, int i12, int i13) {
        float f12;
        Composer startRestartGroup = composer.startRestartGroup(185153286);
        Modifier modifier2 = (i13 & 4) != 0 ? Modifier.Companion : modifier;
        boolean z16 = (i13 & 8) != 0 ? false : z11;
        boolean z17 = (i13 & 16) != 0 ? false : z12;
        boolean z18 = (i13 & 32) != 0 ? false : z13;
        RenderMode renderMode2 = (i13 & 64) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z19 = (i13 & 128) != 0 ? false : z14;
        n nVar2 = (i13 & 256) != 0 ? null : nVar;
        Alignment center = (i13 & 512) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i13 & 1024) != 0 ? ContentScale.Companion.getFit() : contentScale;
        boolean z21 = (i13 & 2048) != 0 ? true : z15;
        Float valueOf = Float.valueOf(f11);
        startRestartGroup.startReplaceableGroup(-3686930);
        boolean changed = startRestartGroup.changed(valueOf);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            f12 = f11;
            rememberedValue = new d(f12);
            startRestartGroup.updateRememberedValue(rememberedValue);
        } else {
            f12 = f11;
        }
        startRestartGroup.endReplaceableGroup();
        c(kVar, (x00.a) rememberedValue, modifier2, z16, z17, z18, renderMode2, z19, nVar2, center, fit, z21, startRestartGroup, (i11 & 896) | 134217736 | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (29360128 & i11) | (1879048192 & i11), i12 & 126, 0);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new e(kVar, f12, modifier2, z16, z17, z18, renderMode2, z19, nVar2, center, fit, z21, i11, i12, i13));
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fa, code lost:
    
        if (r2 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L68;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@m80.l com.airbnb.lottie.k r22, @m80.l androidx.compose.ui.Modifier r23, boolean r24, boolean r25, @m80.l a1.h r26, float r27, int r28, boolean r29, boolean r30, boolean r31, @m80.l com.airbnb.lottie.RenderMode r32, boolean r33, @m80.l a1.n r34, @m80.l androidx.compose.ui.Alignment r35, @m80.l androidx.compose.ui.layout.ContentScale r36, boolean r37, @m80.l androidx.compose.runtime.Composer r38, int r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.f.b(com.airbnb.lottie.k, androidx.compose.ui.Modifier, boolean, boolean, a1.h, float, int, boolean, boolean, boolean, com.airbnb.lottie.RenderMode, boolean, a1.n, androidx.compose.ui.Alignment, androidx.compose.ui.layout.ContentScale, boolean, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    public static final void c(@m80.l com.airbnb.lottie.k kVar, @m80.k x00.a<Float> progress, @m80.l Modifier modifier, boolean z11, boolean z12, boolean z13, @m80.l RenderMode renderMode, boolean z14, @m80.l n nVar, @m80.l Alignment alignment, @m80.l ContentScale contentScale, boolean z15, @m80.l Composer composer, int i11, int i12, int i13) {
        Composer composer2;
        g0.p(progress, "progress");
        Composer startRestartGroup = composer.startRestartGroup(185150517);
        Modifier modifier2 = (i13 & 4) != 0 ? Modifier.Companion : modifier;
        boolean z16 = (i13 & 8) != 0 ? false : z11;
        boolean z17 = (i13 & 16) != 0 ? false : z12;
        boolean z18 = (i13 & 32) != 0 ? false : z13;
        RenderMode renderMode2 = (i13 & 64) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z19 = (i13 & 128) != 0 ? false : z14;
        n nVar2 = (i13 & 256) != 0 ? null : nVar;
        Alignment center = (i13 & 512) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i13 & 1024) != 0 ? ContentScale.Companion.getFit() : contentScale;
        boolean z21 = (i13 & 2048) != 0 ? true : z15;
        startRestartGroup.startReplaceableGroup(-3687241);
        Object rememberedValue = startRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new o0();
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        o0 o0Var = (o0) rememberedValue;
        startRestartGroup.startReplaceableGroup(-3687241);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new Matrix();
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        Matrix matrix = (Matrix) rememberedValue2;
        startRestartGroup.startReplaceableGroup(-3687241);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue3;
        startRestartGroup.startReplaceableGroup(185151250);
        if (kVar == null || kVar.d() == 0.0f) {
            n nVar3 = nVar2;
            boolean z22 = z16;
            startRestartGroup.endReplaceableGroup();
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                composer2 = startRestartGroup;
            } else {
                composer2 = startRestartGroup;
                endRestartGroup.updateScope(new a(kVar, progress, modifier2, z22, z17, z18, renderMode2, z19, nVar3, center, fit, z21, i11, i12, i13));
            }
            BoxKt.Box(modifier2, composer2, (i11 >> 6) & 14);
            return;
        }
        startRestartGroup.endReplaceableGroup();
        float e11 = j1.j.e();
        n nVar4 = nVar2;
        boolean z23 = z16;
        CanvasKt.Canvas(androidx.compose.foundation.layout.SizeKt.m775sizeVpY3zN4(modifier2, Dp.m5115constructorimpl(kVar.b().width() / e11), Dp.m5115constructorimpl(kVar.b().height() / e11)), new b(kVar, fit, center, matrix, o0Var, z18, renderMode2, nVar2, z16, z17, z19, z21, progress, mutableState), startRestartGroup, 0);
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 == null) {
            return;
        }
        endRestartGroup2.updateScope(new c(kVar, progress, modifier2, z23, z17, z18, renderMode2, z19, nVar4, center, fit, z21, i11, i12, i13));
    }

    public static final n d(MutableState<n> mutableState) {
        return mutableState.getValue();
    }

    public static final void e(MutableState<n> mutableState, n nVar) {
        mutableState.setValue(nVar);
    }

    public static final float f(a1.g gVar) {
        return gVar.getValue().floatValue();
    }

    public static final long k(long j11, long j12) {
        return IntSizeKt.IntSize((int) (Size.m2337getWidthimpl(j11) * ScaleFactor.m3946getScaleXimpl(j12)), (int) (Size.m2334getHeightimpl(j11) * ScaleFactor.m3947getScaleYimpl(j12)));
    }
}
