package androidx.room;

import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class FtsOptions {

    @m80.k
    public static final FtsOptions INSTANCE = new FtsOptions();

    @m80.k
    public static final String TOKENIZER_ICU = "icu";

    @m80.k
    public static final String TOKENIZER_PORTER = "porter";

    @m80.k
    public static final String TOKENIZER_SIMPLE = "simple";

    @RequiresApi(21)
    @m80.k
    public static final String TOKENIZER_UNICODE61 = "unicode61";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class MatchInfo {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ MatchInfo[] $VALUES;
        public static final MatchInfo FTS3 = new MatchInfo("FTS3", 0);
        public static final MatchInfo FTS4 = new MatchInfo("FTS4", 1);

        private static final /* synthetic */ MatchInfo[] $values() {
            return new MatchInfo[]{FTS3, FTS4};
        }

        static {
            MatchInfo[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        private MatchInfo(String str, int i11) {
        }

        @m80.k
        public static m00.a<MatchInfo> getEntries() {
            return $ENTRIES;
        }

        public static MatchInfo valueOf(String str) {
            return (MatchInfo) Enum.valueOf(MatchInfo.class, str);
        }

        public static MatchInfo[] values() {
            return (MatchInfo[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Order {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ Order[] $VALUES;
        public static final Order ASC = new Order("ASC", 0);
        public static final Order DESC = new Order("DESC", 1);

        private static final /* synthetic */ Order[] $values() {
            return new Order[]{ASC, DESC};
        }

        static {
            Order[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        private Order(String str, int i11) {
        }

        @m80.k
        public static m00.a<Order> getEntries() {
            return $ENTRIES;
        }

        public static Order valueOf(String str) {
            return (Order) Enum.valueOf(Order.class, str);
        }

        public static Order[] values() {
            return (Order[]) $VALUES.clone();
        }
    }

    private FtsOptions() {
    }
}
