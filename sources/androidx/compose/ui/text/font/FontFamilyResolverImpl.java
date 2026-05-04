package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontFamily;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nFontFamilyResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/FontFamilyResolverImpl\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,259:1\n150#2,3:260\n34#2,6:263\n153#2:269\n*S KotlinDebug\n*F\n+ 1 FontFamilyResolver.kt\nandroidx/compose/ui/text/font/FontFamilyResolverImpl\n*L\n46#1:260,3\n46#1:263,6\n46#1:269\n*E\n"})
/* loaded from: classes2.dex */
public final class FontFamilyResolverImpl implements FontFamily.Resolver {
    public static final int $stable = 8;

    @k
    private final l<TypefaceRequest, Object> createDefaultTypeface;

    @k
    private final FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;

    @k
    private final PlatformFontFamilyTypefaceAdapter platformFamilyTypefaceAdapter;

    @k
    private final PlatformFontLoader platformFontLoader;

    @k
    private final PlatformResolveInterceptor platformResolveInterceptor;

    @k
    private final TypefaceRequestCache typefaceRequestCache;

    public FontFamilyResolverImpl(@k PlatformFontLoader platformFontLoader, @k PlatformResolveInterceptor platformResolveInterceptor, @k TypefaceRequestCache typefaceRequestCache, @k FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, @k PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter) {
        this.platformFontLoader = platformFontLoader;
        this.platformResolveInterceptor = platformResolveInterceptor;
        this.typefaceRequestCache = typefaceRequestCache;
        this.fontListFontFamilyTypefaceAdapter = fontListFontFamilyTypefaceAdapter;
        this.platformFamilyTypefaceAdapter = platformFontFamilyTypefaceAdapter;
        this.createDefaultTypeface = new l<TypefaceRequest, Object>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$createDefaultTypeface$1
            {
                super(1);
            }

            @Override // x00.l
            public final Object invoke(TypefaceRequest typefaceRequest) {
                State resolve;
                resolve = FontFamilyResolverImpl.this.resolve(TypefaceRequest.m4711copye1PVR60$default(typefaceRequest, null, null, 0, 0, null, 30, null));
                return resolve.getValue();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final State<Object> resolve(final TypefaceRequest typefaceRequest) {
        return this.typefaceRequestCache.runCached(typefaceRequest, new l<l<? super TypefaceResult, ? extends g2>, TypefaceResult>() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$resolve$result$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ TypefaceResult invoke(l<? super TypefaceResult, ? extends g2> lVar) {
                return invoke2((l<? super TypefaceResult, g2>) lVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final TypefaceResult invoke2(l<? super TypefaceResult, g2> lVar) {
                FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;
                l<? super TypefaceRequest, ? extends Object> lVar2;
                PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter;
                l<? super TypefaceRequest, ? extends Object> lVar3;
                fontListFontFamilyTypefaceAdapter = FontFamilyResolverImpl.this.fontListFontFamilyTypefaceAdapter;
                TypefaceRequest typefaceRequest2 = typefaceRequest;
                PlatformFontLoader platformFontLoader$ui_text_release = FontFamilyResolverImpl.this.getPlatformFontLoader$ui_text_release();
                lVar2 = FontFamilyResolverImpl.this.createDefaultTypeface;
                TypefaceResult resolve = fontListFontFamilyTypefaceAdapter.resolve(typefaceRequest2, platformFontLoader$ui_text_release, lVar, lVar2);
                if (resolve != null) {
                    return resolve;
                }
                platformFontFamilyTypefaceAdapter = FontFamilyResolverImpl.this.platformFamilyTypefaceAdapter;
                TypefaceRequest typefaceRequest3 = typefaceRequest;
                PlatformFontLoader platformFontLoader$ui_text_release2 = FontFamilyResolverImpl.this.getPlatformFontLoader$ui_text_release();
                lVar3 = FontFamilyResolverImpl.this.createDefaultTypeface;
                TypefaceResult resolve2 = platformFontFamilyTypefaceAdapter.resolve(typefaceRequest3, platformFontLoader$ui_text_release2, lVar, lVar3);
                if (resolve2 != null) {
                    return resolve2;
                }
                throw new IllegalStateException("Could not load font");
            }
        });
    }

    @k
    public final PlatformFontLoader getPlatformFontLoader$ui_text_release() {
        return this.platformFontLoader;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f A[LOOP:0: B:11:0x006d->B:12:0x006f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.ui.text.font.FontFamily.Resolver
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object preload(@m80.k androidx.compose.ui.text.font.FontFamily r13, @m80.k j00.c<? super yz.g2> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1 r0 = (androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1 r0 = new androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$1
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r13 = r0.L$1
            androidx.compose.ui.text.font.FontFamily r13 = (androidx.compose.ui.text.font.FontFamily) r13
            java.lang.Object r0 = r0.L$0
            androidx.compose.ui.text.font.FontFamilyResolverImpl r0 = (androidx.compose.ui.text.font.FontFamilyResolverImpl) r0
            kotlin.e.n(r14)
            goto L55
        L31:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L39:
            kotlin.e.n(r14)
            boolean r14 = r13 instanceof androidx.compose.ui.text.font.FontListFontFamily
            if (r14 != 0) goto L43
            yz.g2 r13 = yz.g2.f100423a
            return r13
        L43:
            androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter r14 = r12.fontListFontFamilyTypefaceAdapter
            androidx.compose.ui.text.font.PlatformFontLoader r2 = r12.platformFontLoader
            r0.L$0 = r12
            r0.L$1 = r13
            r0.label = r3
            java.lang.Object r14 = r14.preload(r13, r2, r0)
            if (r14 != r1) goto L54
            return r1
        L54:
            r0 = r12
        L55:
            r14 = r13
            androidx.compose.ui.text.font.FontListFontFamily r14 = (androidx.compose.ui.text.font.FontListFontFamily) r14
            java.util.List r14 = r14.getFonts()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r14.size()
            r1.<init>(r2)
            r2 = r14
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r3 = 0
        L6d:
            if (r3 >= r2) goto La7
            java.lang.Object r4 = r14.get(r3)
            androidx.compose.ui.text.font.Font r4 = (androidx.compose.ui.text.font.Font) r4
            androidx.compose.ui.text.font.TypefaceRequest r5 = new androidx.compose.ui.text.font.TypefaceRequest
            androidx.compose.ui.text.font.PlatformResolveInterceptor r6 = r0.platformResolveInterceptor
            androidx.compose.ui.text.font.FontFamily r6 = r6.interceptFontFamily(r13)
            androidx.compose.ui.text.font.PlatformResolveInterceptor r7 = r0.platformResolveInterceptor
            androidx.compose.ui.text.font.FontWeight r8 = r4.getWeight()
            androidx.compose.ui.text.font.FontWeight r7 = r7.interceptFontWeight(r8)
            androidx.compose.ui.text.font.PlatformResolveInterceptor r8 = r0.platformResolveInterceptor
            int r4 = r4.mo4623getStyle_LCdwA()
            int r8 = r8.m4695interceptFontStyleT2F_aPo(r4)
            androidx.compose.ui.text.font.FontSynthesis$Companion r4 = androidx.compose.ui.text.font.FontSynthesis.Companion
            int r9 = r4.m4687getAllGVVA2EU()
            androidx.compose.ui.text.font.PlatformFontLoader r4 = r0.platformFontLoader
            java.lang.Object r10 = r4.getCacheKey()
            r11 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r1.add(r5)
            int r3 = r3 + 1
            goto L6d
        La7:
            androidx.compose.ui.text.font.TypefaceRequestCache r13 = r0.typefaceRequestCache
            androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2 r14 = new androidx.compose.ui.text.font.FontFamilyResolverImpl$preload$2
            r14.<init>()
            r13.preWarmCache(r1, r14)
            yz.g2 r13 = yz.g2.f100423a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.FontFamilyResolverImpl.preload(androidx.compose.ui.text.font.FontFamily, j00.c):java.lang.Object");
    }

    @Override // androidx.compose.ui.text.font.FontFamily.Resolver
    @k
    /* renamed from: resolve-DPcqOEQ */
    public State<Object> mo4643resolveDPcqOEQ(@m80.l FontFamily fontFamily, @k FontWeight fontWeight, int i11, int i12) {
        return resolve(new TypefaceRequest(this.platformResolveInterceptor.interceptFontFamily(fontFamily), this.platformResolveInterceptor.interceptFontWeight(fontWeight), this.platformResolveInterceptor.m4695interceptFontStyleT2F_aPo(i11), this.platformResolveInterceptor.m4696interceptFontSynthesisMscr08Y(i12), this.platformFontLoader.getCacheKey(), null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ FontFamilyResolverImpl(PlatformFontLoader platformFontLoader, PlatformResolveInterceptor platformResolveInterceptor, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter, int i11, v vVar) {
        this(platformFontLoader, (i11 & 2) != 0 ? PlatformResolveInterceptor.Companion.getDefault$ui_text_release() : platformResolveInterceptor, (i11 & 4) != 0 ? FontFamilyResolverKt.getGlobalTypefaceRequestCache() : typefaceRequestCache, (i11 & 8) != 0 ? new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.getGlobalAsyncTypefaceCache(), null, 2, 0 == true ? 1 : 0) : fontListFontFamilyTypefaceAdapter, (i11 & 16) != 0 ? new PlatformFontFamilyTypefaceAdapter() : platformFontFamilyTypefaceAdapter);
    }
}
