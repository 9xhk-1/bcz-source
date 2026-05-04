package androidx.compose.ui.layout;

import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface BeyondBoundsLayout {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface BeyondBoundsScope {
        boolean getHasMoreContent();
    }

    @l
    /* renamed from: layout-o7g1Pn8 */
    <T> T mo882layouto7g1Pn8(int i11, @k x00.l<? super BeyondBoundsScope, ? extends T> lVar);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @h
    public static final class LayoutDirection {
        private final int value;

        @k
        public static final Companion Companion = new Companion(null);
        private static final int Before = m3837constructorimpl(1);
        private static final int After = m3837constructorimpl(2);
        private static final int Left = m3837constructorimpl(3);
        private static final int Right = m3837constructorimpl(4);
        private static final int Above = m3837constructorimpl(5);
        private static final int Below = m3837constructorimpl(6);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(v vVar) {
                this();
            }

            /* renamed from: getAbove-hoxUOeE, reason: not valid java name */
            public final int m3843getAbovehoxUOeE() {
                return LayoutDirection.Above;
            }

            /* renamed from: getAfter-hoxUOeE, reason: not valid java name */
            public final int m3844getAfterhoxUOeE() {
                return LayoutDirection.After;
            }

            /* renamed from: getBefore-hoxUOeE, reason: not valid java name */
            public final int m3845getBeforehoxUOeE() {
                return LayoutDirection.Before;
            }

            /* renamed from: getBelow-hoxUOeE, reason: not valid java name */
            public final int m3846getBelowhoxUOeE() {
                return LayoutDirection.Below;
            }

            /* renamed from: getLeft-hoxUOeE, reason: not valid java name */
            public final int m3847getLefthoxUOeE() {
                return LayoutDirection.Left;
            }

            /* renamed from: getRight-hoxUOeE, reason: not valid java name */
            public final int m3848getRighthoxUOeE() {
                return LayoutDirection.Right;
            }

            private Companion() {
            }
        }

        private /* synthetic */ LayoutDirection(int i11) {
            this.value = i11;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ LayoutDirection m3836boximpl(int i11) {
            return new LayoutDirection(i11);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m3838equalsimpl(int i11, Object obj) {
            return (obj instanceof LayoutDirection) && i11 == ((LayoutDirection) obj).m3842unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m3839equalsimpl0(int i11, int i12) {
            return i11 == i12;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m3840hashCodeimpl(int i11) {
            return Integer.hashCode(i11);
        }

        @k
        /* renamed from: toString-impl, reason: not valid java name */
        public static String m3841toStringimpl(int i11) {
            return m3839equalsimpl0(i11, Before) ? "Before" : m3839equalsimpl0(i11, After) ? "After" : m3839equalsimpl0(i11, Left) ? "Left" : m3839equalsimpl0(i11, Right) ? "Right" : m3839equalsimpl0(i11, Above) ? "Above" : m3839equalsimpl0(i11, Below) ? "Below" : "invalid LayoutDirection";
        }

        public boolean equals(Object obj) {
            return m3838equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m3840hashCodeimpl(this.value);
        }

        @k
        public String toString() {
            return m3841toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m3842unboximpl() {
            return this.value;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m3837constructorimpl(int i11) {
            return i11;
        }
    }
}
