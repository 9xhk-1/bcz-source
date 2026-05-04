package androidx.compose.foundation.lazy.grid;

import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface LazyGridItemInfo {

    @k
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int UnknownColumn = -1;
    public static final int UnknownRow = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int UnknownColumn = -1;
        public static final int UnknownRow = -1;

        private Companion() {
        }
    }

    int getColumn();

    @l
    Object getContentType();

    int getIndex();

    @k
    Object getKey();

    /* renamed from: getOffset-nOcc-ac, reason: not valid java name */
    long mo865getOffsetnOccac();

    int getRow();

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo866getSizeYbymL2g();

    int getSpan();
}
