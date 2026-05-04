package androidx.compose.ui.text.font;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.TypefaceResult;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncFontListLoader\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,444:1\n85#2:445\n113#2,2:446\n34#3,6:448\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncFontListLoader\n*L\n264#1:445\n264#1:446,2\n271#1:448,6\n*E\n"})
/* loaded from: classes2.dex */
public final class AsyncFontListLoader implements State<Object> {
    public static final int $stable = 0;

    @k
    private final AsyncTypefaceCache asyncTypefaceCache;
    private boolean cacheable = true;

    @k
    private final List<Font> fontList;

    @k
    private final l<TypefaceResult.Immutable, g2> onCompletion;

    @k
    private final PlatformFontLoader platformFontLoader;

    @k
    private final TypefaceRequest typefaceRequest;

    @k
    private final MutableState value$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncFontListLoader(@k List<? extends Font> list, @k Object obj, @k TypefaceRequest typefaceRequest, @k AsyncTypefaceCache asyncTypefaceCache, @k l<? super TypefaceResult.Immutable, g2> lVar, @k PlatformFontLoader platformFontLoader) {
        this.fontList = list;
        this.typefaceRequest = typefaceRequest;
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.onCompletion = lVar;
        this.platformFontLoader = platformFontLoader;
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, null, 2, null);
    }

    private void setValue(Object obj) {
        this.value$delegate.setValue(obj);
    }

    public final boolean getCacheable$ui_text_release() {
        return this.cacheable;
    }

    @Override // androidx.compose.runtime.State
    @k
    public Object getValue() {
        return this.value$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4 A[Catch: all -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0063, blocks: (B:26:0x00b4, B:34:0x00e8, B:47:0x005a), top: B:46:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e8 A[Catch: all -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0063, blocks: (B:26:0x00b4, B:34:0x00e8, B:47:0x005a), top: B:46:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x008d -> B:14:0x0105). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00fb -> B:13:0x00fc). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object load(@m80.k j00.c<? super yz.g2> r18) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.load(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadWithTimeoutOrNull$ui_text_release(@m80.k androidx.compose.ui.text.font.Font r7, @m80.k j00.c<java.lang.Object> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = (androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.text.font.Font r7 = (androidx.compose.ui.text.font.Font) r7
            kotlin.e.n(r8)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            return r8
        L2e:
            r8 = move-exception
            goto L50
        L30:
            r7 = move-exception
            goto L7c
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            kotlin.e.n(r8)
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2 r8 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r8.<init>(r6, r7, r4)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r0.L$0 = r7     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r0.label = r3     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r7 = c40.v3.e(r2, r8, r0)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            if (r7 != r1) goto L4f
            return r1
        L4f:
            return r7
        L50:
            kotlin.coroutines.d r1 = r0.getContext()
            c40.n0$b r2 = c40.n0.f7891d0
            kotlin.coroutines.d$b r1 = r1.get(r2)
            c40.n0 r1 = (c40.n0) r1
            if (r1 == 0) goto L86
            kotlin.coroutines.d r0 = r0.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Unable to load font "
            r3.append(r5)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.<init>(r7, r8)
            r1.handleException(r0, r2)
            goto L86
        L7c:
            kotlin.coroutines.d r8 = r0.getContext()
            boolean r8 = c40.n2.D(r8)
            if (r8 == 0) goto L87
        L86:
            return r4
        L87:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.loadWithTimeoutOrNull$ui_text_release(androidx.compose.ui.text.font.Font, j00.c):java.lang.Object");
    }

    public final void setCacheable$ui_text_release(boolean z11) {
        this.cacheable = z11;
    }
}
