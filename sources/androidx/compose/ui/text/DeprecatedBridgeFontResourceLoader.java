package androidx.compose.ui.text;

import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTextLayoutResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutResult.kt\nandroidx/compose/ui/text/DeprecatedBridgeFontResourceLoader\n+ 2 Synchronization.android.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,580:1\n28#2:581\n*S KotlinDebug\n*F\n+ 1 TextLayoutResult.kt\nandroidx/compose/ui/text/DeprecatedBridgeFontResourceLoader\n*L\n271#1:581\n*E\n"})
/* loaded from: classes2.dex */
final class DeprecatedBridgeFontResourceLoader implements Font.ResourceLoader {

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static Map<FontFamily.Resolver, Font.ResourceLoader> cache = new LinkedHashMap();

    @k
    private static final SynchronizedObject lock = new SynchronizedObject();

    @k
    private final FontFamily.Resolver fontFamilyResolver;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTextLayoutResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutResult.kt\nandroidx/compose/ui/text/DeprecatedBridgeFontResourceLoader$Companion\n+ 2 Synchronization.android.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,580:1\n34#2,2:581\n*S KotlinDebug\n*F\n+ 1 TextLayoutResult.kt\nandroidx/compose/ui/text/DeprecatedBridgeFontResourceLoader$Companion\n*L\n274#1:581,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final Font.ResourceLoader from(@k FontFamily.Resolver resolver) {
            synchronized (getLock()) {
                Companion companion = DeprecatedBridgeFontResourceLoader.Companion;
                Font.ResourceLoader resourceLoader = companion.getCache().get(resolver);
                if (resourceLoader != null) {
                    return resourceLoader;
                }
                DeprecatedBridgeFontResourceLoader deprecatedBridgeFontResourceLoader = new DeprecatedBridgeFontResourceLoader(resolver, null);
                companion.getCache().put(resolver, deprecatedBridgeFontResourceLoader);
                return deprecatedBridgeFontResourceLoader;
            }
        }

        @k
        public final Map<FontFamily.Resolver, Font.ResourceLoader> getCache() {
            return DeprecatedBridgeFontResourceLoader.cache;
        }

        @k
        public final SynchronizedObject getLock() {
            return DeprecatedBridgeFontResourceLoader.lock;
        }

        public final void setCache(@k Map<FontFamily.Resolver, Font.ResourceLoader> map) {
            DeprecatedBridgeFontResourceLoader.cache = map;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DeprecatedBridgeFontResourceLoader(FontFamily.Resolver resolver, v vVar) {
        this(resolver);
    }

    @Override // androidx.compose.ui.text.font.Font.ResourceLoader
    @n(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @w0(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
    @k
    public Object load(@k Font font) {
        return FontFamily.Resolver.m4642resolveDPcqOEQ$default(this.fontFamilyResolver, FontKt.toFontFamily(font), font.getWeight(), font.mo4623getStyle_LCdwA(), 0, 8, null).getValue();
    }

    private DeprecatedBridgeFontResourceLoader(FontFamily.Resolver resolver) {
        this.fontFamilyResolver = resolver;
    }
}
