package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface TypefaceResult extends State<Object> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class Async implements TypefaceResult, State<Object> {
        public static final int $stable = 0;

        @k
        private final AsyncFontListLoader current;

        public Async(@k AsyncFontListLoader asyncFontListLoader) {
            this.current = asyncFontListLoader;
        }

        @Override // androidx.compose.ui.text.font.TypefaceResult
        public boolean getCacheable() {
            return this.current.getCacheable$ui_text_release();
        }

        @k
        public final AsyncFontListLoader getCurrent$ui_text_release() {
            return this.current;
        }

        @Override // androidx.compose.runtime.State
        @k
        public Object getValue() {
            return this.current.getValue();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class Immutable implements TypefaceResult {
        public static final int $stable = 0;
        private final boolean cacheable;

        @k
        private final Object value;

        public Immutable(@k Object obj, boolean z11) {
            this.value = obj;
            this.cacheable = z11;
        }

        @Override // androidx.compose.ui.text.font.TypefaceResult
        public boolean getCacheable() {
            return this.cacheable;
        }

        @Override // androidx.compose.runtime.State
        @k
        public Object getValue() {
            return this.value;
        }

        public /* synthetic */ Immutable(Object obj, boolean z11, int i11, v vVar) {
            this(obj, (i11 & 2) != 0 ? true : z11);
        }
    }

    boolean getCacheable();
}
