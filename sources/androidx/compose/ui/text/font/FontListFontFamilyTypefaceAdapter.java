package androidx.compose.ui.text.font;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.platform.DispatcherKt;
import c40.l2;
import c40.l3;
import c40.n0;
import c40.r0;
import c40.s0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.CoroutineStart;
import m80.k;
import m80.l;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,444:1\n247#2,6:445\n34#2,6:451\n253#2:457\n482#2,4:458\n34#2,4:462\n486#2,3:466\n39#2:469\n489#2:470\n34#2,6:471\n48#3,4:477\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter\n*L\n71#1:445,6\n71#1:451,6\n71#1:457\n74#1:458,4\n74#1:462,4\n74#1:466,3\n74#1:469\n74#1:470\n78#1:471,6\n165#1:477,4\n*E\n"})
/* loaded from: classes2.dex */
public final class FontListFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {

    @k
    private r0 asyncLoadScope;

    @k
    private final AsyncTypefaceCache asyncTypefaceCache;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @k
    private static final FontMatcher fontMatcher = new FontMatcher();

    @k
    private static final n0 DropExceptionHandler = new FontListFontFamilyTypefaceAdapter$special$$inlined$CoroutineExceptionHandler$1(n0.f7891d0);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final n0 getDropExceptionHandler() {
            return FontListFontFamilyTypefaceAdapter.DropExceptionHandler;
        }

        @k
        public final FontMatcher getFontMatcher() {
            return FontListFontFamilyTypefaceAdapter.fontMatcher;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FontListFontFamilyTypefaceAdapter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @l
    public final Object preload(@k FontFamily fontFamily, @k PlatformFontLoader platformFontLoader, @k j00.c<? super g2> cVar) {
        Pair firstImmediatelyAvailable;
        FontFamily fontFamily2 = fontFamily;
        if (!(fontFamily2 instanceof FontListFontFamily)) {
            return g2.f100423a;
        }
        FontListFontFamily fontListFontFamily = (FontListFontFamily) fontFamily2;
        List<Font> fonts = fontListFontFamily.getFonts();
        List<Font> fonts2 = fontListFontFamily.getFonts();
        ArrayList arrayList = new ArrayList(fonts2.size());
        int size = fonts2.size();
        for (int i11 = 0; i11 < size; i11++) {
            Font font = fonts2.get(i11);
            if (FontLoadingStrategy.m4657equalsimpl0(font.mo4615getLoadingStrategyPKNRLFQ(), FontLoadingStrategy.Companion.m4661getAsyncPKNRLFQ())) {
                arrayList.add(h1.a(font.getWeight(), FontStyle.m4667boximpl(font.mo4623getStyle_LCdwA())));
            }
        }
        MutableScatterSet mutableScatterSet = new MutableScatterSet(arrayList.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            Object obj = arrayList.get(i12);
            if (mutableScatterSet.add((Pair) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int size3 = arrayList2.size();
        int i13 = 0;
        while (i13 < size3) {
            Pair pair = (Pair) arrayList2.get(i13);
            FontWeight fontWeight = (FontWeight) pair.component1();
            int m4673unboximpl = ((FontStyle) pair.component2()).m4673unboximpl();
            firstImmediatelyAvailable = FontListFontFamilyTypefaceAdapterKt.firstImmediatelyAvailable(fontMatcher.m4666matchFontRetOiIg(fonts, fontWeight, m4673unboximpl), new TypefaceRequest(fontFamily2, fontWeight, m4673unboximpl, FontSynthesis.Companion.m4687getAllGVVA2EU(), platformFontLoader.getCacheKey(), null), this.asyncTypefaceCache, platformFontLoader, new x00.l<TypefaceRequest, g2>() { // from class: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$2$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(TypefaceRequest typefaceRequest) {
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(TypefaceRequest typefaceRequest) {
                    invoke2(typefaceRequest);
                    return g2.f100423a;
                }
            });
            List list = (List) firstImmediatelyAvailable.component1();
            if (list != null) {
                arrayList3.add(a00.r0.G2(list));
            }
            i13++;
            fontFamily2 = fontFamily;
        }
        Object g11 = s0.g(new FontListFontFamilyTypefaceAdapter$preload$3(arrayList3, this, platformFontLoader, null), cVar);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }

    @Override // androidx.compose.ui.text.font.FontFamilyTypefaceAdapter
    @l
    public TypefaceResult resolve(@k TypefaceRequest typefaceRequest, @k PlatformFontLoader platformFontLoader, @k x00.l<? super TypefaceResult.Immutable, g2> lVar, @k x00.l<? super TypefaceRequest, ? extends Object> lVar2) {
        Pair firstImmediatelyAvailable;
        if (!(typefaceRequest.getFontFamily() instanceof FontListFontFamily)) {
            return null;
        }
        firstImmediatelyAvailable = FontListFontFamilyTypefaceAdapterKt.firstImmediatelyAvailable(fontMatcher.m4666matchFontRetOiIg(((FontListFontFamily) typefaceRequest.getFontFamily()).getFonts(), typefaceRequest.getFontWeight(), typefaceRequest.m4715getFontStyle_LCdwA()), typefaceRequest, this.asyncTypefaceCache, platformFontLoader, lVar2);
        List list = (List) firstImmediatelyAvailable.component1();
        Object component2 = firstImmediatelyAvailable.component2();
        if (list == null) {
            return new TypefaceResult.Immutable(component2, false, 2, null);
        }
        AsyncFontListLoader asyncFontListLoader = new AsyncFontListLoader(list, component2, typefaceRequest, this.asyncTypefaceCache, lVar, platformFontLoader);
        c40.k.f(this.asyncLoadScope, null, CoroutineStart.UNDISPATCHED, new FontListFontFamilyTypefaceAdapter$resolve$1(asyncFontListLoader, null), 1, null);
        return new TypefaceResult.Async(asyncFontListLoader);
    }

    public FontListFontFamilyTypefaceAdapter(@k AsyncTypefaceCache asyncTypefaceCache, @k kotlin.coroutines.d dVar) {
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.asyncLoadScope = s0.a(DropExceptionHandler.plus(DispatcherKt.getFontCacheManagementDispatcher()).plus(dVar).plus(l3.a((l2) dVar.get(l2.f7886e0))));
    }

    public /* synthetic */ FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, kotlin.coroutines.d dVar, int i11, v vVar) {
        this((i11 & 1) != 0 ? new AsyncTypefaceCache() : asyncTypefaceCache, (i11 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : dVar);
    }
}
