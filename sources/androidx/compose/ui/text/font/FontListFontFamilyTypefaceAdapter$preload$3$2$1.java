package androidx.compose.ui.text.font;

import c40.r0;
import c40.v3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {109}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class FontListFontFamilyTypefaceAdapter$preload$3$2$1 extends SuspendLambda implements p<r0, j00.c<? super Object>, Object> {
    final /* synthetic */ Font $font;
    final /* synthetic */ PlatformFontLoader $resourceLoader;
    int label;
    final /* synthetic */ FontListFontFamilyTypefaceAdapter this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements l<j00.c<? super Object>, Object> {
        final /* synthetic */ Font $font;
        final /* synthetic */ PlatformFontLoader $resourceLoader;
        int label;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00831 extends SuspendLambda implements p<r0, j00.c<? super Object>, Object> {
            final /* synthetic */ Font $font;
            final /* synthetic */ PlatformFontLoader $resourceLoader;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00831(PlatformFontLoader platformFontLoader, Font font, j00.c<? super C00831> cVar) {
                super(2, cVar);
                this.$resourceLoader = platformFontLoader;
                this.$font = font;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new C00831(this.$resourceLoader, this.$font, cVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(r0 r0Var, j00.c<Object> cVar) {
                return ((C00831) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.label;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                    return obj;
                }
                kotlin.e.n(obj);
                PlatformFontLoader platformFontLoader = this.$resourceLoader;
                Font font = this.$font;
                this.label = 1;
                Object awaitLoad = platformFontLoader.awaitLoad(font, this);
                return awaitLoad == l11 ? l11 : awaitLoad;
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super Object> cVar) {
                return invoke2(r0Var, (j00.c<Object>) cVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Font font, PlatformFontLoader platformFontLoader, j00.c<? super AnonymousClass1> cVar) {
            super(1, cVar);
            this.$font = font;
            this.$resourceLoader = platformFontLoader;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return new AnonymousClass1(this.$font, this.$resourceLoader, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(j00.c<Object> cVar) {
            return ((AnonymousClass1) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.label;
            try {
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    C00831 c00831 = new C00831(this.$resourceLoader, this.$font, null);
                    this.label = 1;
                    obj = v3.c(15000L, c00831, this);
                    if (obj == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                if (obj != null) {
                    return obj;
                }
                throw new IllegalStateException("Unable to load font " + this.$font);
            } catch (Exception e11) {
                throw new IllegalStateException("Unable to load font " + this.$font, e11);
            }
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Object invoke(j00.c<? super Object> cVar) {
            return invoke2((j00.c<Object>) cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontListFontFamilyTypefaceAdapter$preload$3$2$1(FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, Font font, PlatformFontLoader platformFontLoader, j00.c<? super FontListFontFamilyTypefaceAdapter$preload$3$2$1> cVar) {
        super(2, cVar);
        this.this$0 = fontListFontFamilyTypefaceAdapter;
        this.$font = font;
        this.$resourceLoader = platformFontLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new FontListFontFamilyTypefaceAdapter$preload$3$2$1(this.this$0, this.$font, this.$resourceLoader, cVar);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(r0 r0Var, j00.c<Object> cVar) {
        return ((FontListFontFamilyTypefaceAdapter$preload$3$2$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AsyncTypefaceCache asyncTypefaceCache;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return obj;
        }
        kotlin.e.n(obj);
        asyncTypefaceCache = this.this$0.asyncTypefaceCache;
        Font font = this.$font;
        PlatformFontLoader platformFontLoader = this.$resourceLoader;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(font, platformFontLoader, null);
        this.label = 1;
        Object runCached = asyncTypefaceCache.runCached(font, platformFontLoader, true, anonymousClass1, this);
        return runCached == l11 ? l11 : runCached;
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super Object> cVar) {
        return invoke2(r0Var, (j00.c<Object>) cVar);
    }
}
