package androidx.compose.ui.autofill;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface ContentDataType {

    @m80.k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @m80.k
        private static final ContentDataType None = ContentDataType_androidKt.ContentDataType(0);

        @m80.k
        private static final ContentDataType Text = ContentDataType_androidKt.ContentDataType(1);

        @m80.k
        private static final ContentDataType List = ContentDataType_androidKt.ContentDataType(3);

        @m80.k
        private static final ContentDataType Date = ContentDataType_androidKt.ContentDataType(4);

        @m80.k
        private static final ContentDataType Toggle = ContentDataType_androidKt.ContentDataType(2);

        private Companion() {
        }

        @m80.k
        public final ContentDataType getDate() {
            return Date;
        }

        @m80.k
        public final ContentDataType getList() {
            return List;
        }

        @m80.k
        public final ContentDataType getNone() {
            return None;
        }

        @m80.k
        public final ContentDataType getText() {
            return Text;
        }

        @m80.k
        public final ContentDataType getToggle() {
            return Toggle;
        }
    }
}
