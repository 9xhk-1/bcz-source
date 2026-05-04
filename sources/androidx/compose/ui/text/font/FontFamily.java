package androidx.compose.ui.text.font;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.State;
import androidx.media3.common.C;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes2.dex */
public abstract class FontFamily {
    public static final int $stable = 0;
    private final boolean canLoadSynchronously;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final SystemFontFamily Default = new DefaultFontFamily();

    @k
    private static final GenericFontFamily SansSerif = new GenericFontFamily(C.SANS_SERIF_NAME, "FontFamily.SansSerif");

    @k
    private static final GenericFontFamily Serif = new GenericFontFamily(C.SERIF_NAME, "FontFamily.Serif");

    @k
    private static final GenericFontFamily Monospace = new GenericFontFamily("monospace", "FontFamily.Monospace");

    @k
    private static final GenericFontFamily Cursive = new GenericFontFamily("cursive", "FontFamily.Cursive");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final GenericFontFamily getCursive() {
            return FontFamily.Cursive;
        }

        @k
        public final SystemFontFamily getDefault() {
            return FontFamily.Default;
        }

        @k
        public final GenericFontFamily getMonospace() {
            return FontFamily.Monospace;
        }

        @k
        public final GenericFontFamily getSansSerif() {
            return FontFamily.SansSerif;
        }

        @k
        public final GenericFontFamily getSerif() {
            return FontFamily.Serif;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Resolver {
        /* renamed from: resolve-DPcqOEQ$default, reason: not valid java name */
        static /* synthetic */ State m4642resolveDPcqOEQ$default(Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i11, int i12, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
            }
            if ((i13 & 1) != 0) {
                fontFamily = null;
            }
            if ((i13 & 2) != 0) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            if ((i13 & 4) != 0) {
                i11 = FontStyle.Companion.m4677getNormal_LCdwA();
            }
            if ((i13 & 8) != 0) {
                i12 = FontSynthesis.Companion.m4687getAllGVVA2EU();
            }
            return resolver.mo4643resolveDPcqOEQ(fontFamily, fontWeight, i11, i12);
        }

        @l
        Object preload(@k FontFamily fontFamily, @k j00.c<? super g2> cVar);

        @k
        /* renamed from: resolve-DPcqOEQ, reason: not valid java name */
        State<Object> mo4643resolveDPcqOEQ(@l FontFamily fontFamily, @k FontWeight fontWeight, int i11, int i12);
    }

    public /* synthetic */ FontFamily(boolean z11, v vVar) {
        this(z11);
    }

    @n(level = DeprecationLevel.ERROR, message = "Unused property that has no meaning. Do not use.")
    public final boolean getCanLoadSynchronously() {
        return this.canLoadSynchronously;
    }

    private FontFamily(boolean z11) {
        this.canLoadSynchronously = z11;
    }

    public static /* synthetic */ void getCanLoadSynchronously$annotations() {
    }
}
